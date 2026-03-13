package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import i2.u;
import kotlin.UByte;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.gcm.BasicGCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.GCMUtil;
import org.bouncycastle.crypto.modes.gcm.Tables4kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GCMBlockCipher implements GCMModeCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: H, reason: collision with root package name */
    private byte[] f19031H;

    /* renamed from: J0, reason: collision with root package name */
    private byte[] f19032J0;

    /* renamed from: S, reason: collision with root package name */
    private byte[] f19033S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private int blocksRemaining;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private boolean initialised;
    private byte[] lastKey;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    public GCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, null);
    }

    private void checkStatus() {
        if (this.initialised) {
            return;
        }
        if (!this.forEncryption) {
            throw new IllegalStateException(StubApp.getString2(29109));
        }
        throw new IllegalStateException(StubApp.getString2(29108));
    }

    private void decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        if (bArr2.length - i10 < 16) {
            throw new OutputLengthException(StubApp.getString2(28608));
        }
        if (this.totalLength == 0) {
            initCipher();
        }
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        gHASHBlock(this.f19033S, bArr, i3);
        GCMUtil.xor(bArr3, 0, bArr, i3, bArr2, i10);
        this.totalLength += 16;
    }

    private void encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        if (bArr2.length - i10 < 16) {
            throw new OutputLengthException(StubApp.getString2(28608));
        }
        if (this.totalLength == 0) {
            initCipher();
        }
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        GCMUtil.xor(bArr3, bArr, i3);
        gHASHBlock(this.f19033S, bArr3);
        System.arraycopy(bArr3, 0, bArr2, i10, 16);
        this.totalLength += 16;
    }

    private void gHASH(byte[] bArr, byte[] bArr2, int i3) {
        for (int i10 = 0; i10 < i3; i10 += 16) {
            gHASHPartial(bArr, bArr2, i10, Math.min(i3 - i10, 16));
        }
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2) {
        GCMUtil.xor(bArr, bArr2);
        this.multiplier.multiplyH(bArr);
    }

    private void gHASHPartial(byte[] bArr, byte[] bArr2, int i3, int i10) {
        GCMUtil.xor(bArr, bArr2, i3, i10);
        this.multiplier.multiplyH(bArr);
    }

    private void getNextCTRBlock(byte[] bArr) {
        int i3 = this.blocksRemaining;
        if (i3 == 0) {
            throw new IllegalStateException(StubApp.getString2(29110));
        }
        this.blocksRemaining = i3 - 1;
        byte[] bArr2 = this.counter;
        int i10 = (bArr2[15] & UByte.MAX_VALUE) + 1;
        bArr2[15] = (byte) i10;
        int i11 = (i10 >>> 8) + (bArr2[14] & UByte.MAX_VALUE);
        bArr2[14] = (byte) i11;
        int i12 = (i11 >>> 8) + (bArr2[13] & UByte.MAX_VALUE);
        bArr2[13] = (byte) i12;
        bArr2[12] = (byte) ((i12 >>> 8) + (bArr2[12] & UByte.MAX_VALUE));
        this.cipher.processBlock(bArr2, 0, bArr, 0);
    }

    private void initCipher() {
        if (this.atLength > 0) {
            System.arraycopy(this.S_at, 0, this.S_atPre, 0, 16);
            this.atLengthPre = this.atLength;
        }
        int i3 = this.atBlockPos;
        if (i3 > 0) {
            gHASHPartial(this.S_atPre, this.atBlock, 0, i3);
            this.atLengthPre += this.atBlockPos;
        }
        if (this.atLengthPre > 0) {
            System.arraycopy(this.S_atPre, 0, this.f19033S, 0, 16);
        }
    }

    public static GCMModeCipher newInstance(BlockCipher blockCipher) {
        return new GCMBlockCipher(blockCipher);
    }

    private void processPartial(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        if (this.forEncryption) {
            GCMUtil.xor(bArr, i3, bArr3, 0, i10);
            gHASHPartial(this.f19033S, bArr, i3, i10);
        } else {
            gHASHPartial(this.f19033S, bArr, i3, i10);
            GCMUtil.xor(bArr, i3, bArr3, 0, i10);
        }
        System.arraycopy(bArr, i3, bArr2, i11, i10);
        this.totalLength += i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i3) throws IllegalStateException, InvalidCipherTextException {
        GCMBlockCipher gCMBlockCipher;
        byte[] bArr2;
        int i10;
        checkStatus();
        if (this.totalLength == 0) {
            initCipher();
        }
        int i11 = this.bufOff;
        boolean z2 = this.forEncryption;
        String string2 = StubApp.getString2(28608);
        if (!z2) {
            int i12 = this.macSize;
            if (i11 < i12) {
                throw new InvalidCipherTextException(StubApp.getString2(29074));
            }
            i11 -= i12;
            if (bArr.length - i3 < i11) {
                throw new OutputLengthException(string2);
            }
        } else if (bArr.length - i3 < this.macSize + i11) {
            throw new OutputLengthException(string2);
        }
        int i13 = i11;
        if (i13 > 0) {
            gCMBlockCipher = this;
            bArr2 = bArr;
            i10 = i3;
            gCMBlockCipher.processPartial(this.bufBlock, 0, i13, bArr2, i10);
        } else {
            gCMBlockCipher = this;
            bArr2 = bArr;
            i10 = i3;
        }
        long j = gCMBlockCipher.atLength;
        int i14 = gCMBlockCipher.atBlockPos;
        long j3 = j + i14;
        gCMBlockCipher.atLength = j3;
        if (j3 > gCMBlockCipher.atLengthPre) {
            if (i14 > 0) {
                gHASHPartial(gCMBlockCipher.S_at, gCMBlockCipher.atBlock, 0, i14);
            }
            if (gCMBlockCipher.atLengthPre > 0) {
                GCMUtil.xor(gCMBlockCipher.S_at, gCMBlockCipher.S_atPre);
            }
            long j10 = ((gCMBlockCipher.totalLength * 8) + 127) >>> 7;
            byte[] bArr3 = new byte[16];
            if (gCMBlockCipher.exp == null) {
                BasicGCMExponentiator basicGCMExponentiator = new BasicGCMExponentiator();
                gCMBlockCipher.exp = basicGCMExponentiator;
                basicGCMExponentiator.init(gCMBlockCipher.f19031H);
            }
            gCMBlockCipher.exp.exponentiateX(j10, bArr3);
            GCMUtil.multiply(gCMBlockCipher.S_at, bArr3);
            GCMUtil.xor(gCMBlockCipher.f19033S, gCMBlockCipher.S_at);
        }
        byte[] bArr4 = new byte[16];
        Pack.longToBigEndian(gCMBlockCipher.atLength * 8, bArr4, 0);
        Pack.longToBigEndian(gCMBlockCipher.totalLength * 8, bArr4, 8);
        gHASHBlock(gCMBlockCipher.f19033S, bArr4);
        byte[] bArr5 = new byte[16];
        gCMBlockCipher.cipher.processBlock(gCMBlockCipher.f19032J0, 0, bArr5, 0);
        GCMUtil.xor(bArr5, gCMBlockCipher.f19033S);
        int i15 = gCMBlockCipher.macSize;
        byte[] bArr6 = new byte[i15];
        gCMBlockCipher.macBlock = bArr6;
        System.arraycopy(bArr5, 0, bArr6, 0, i15);
        if (gCMBlockCipher.forEncryption) {
            System.arraycopy(gCMBlockCipher.macBlock, 0, bArr2, gCMBlockCipher.bufOff + i10, gCMBlockCipher.macSize);
            i13 += gCMBlockCipher.macSize;
        } else {
            int i16 = gCMBlockCipher.macSize;
            byte[] bArr7 = new byte[i16];
            System.arraycopy(gCMBlockCipher.bufBlock, i13, bArr7, 0, i16);
            if (!Arrays.constantTimeAreEqual(gCMBlockCipher.macBlock, bArr7)) {
                throw new InvalidCipherTextException(StubApp.getString2(29111));
            }
        }
        reset(false);
        return i13;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29112);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.macSize] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i3) {
        int i10 = i3 + this.bufOff;
        if (this.forEncryption) {
            return i10 + this.macSize;
        }
        int i11 = this.macSize;
        if (i10 < i11) {
            return 0;
        }
        return i10 - i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i3) {
        int i10 = i3 + this.bufOff;
        if (!this.forEncryption) {
            int i11 = this.macSize;
            if (i10 < i11) {
                return 0;
            }
            i10 -= i11;
        }
        return i10 - (i10 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        KeyParameter keyParameter;
        byte[] bArr;
        this.forEncryption = z2;
        this.macBlock = null;
        this.initialised = true;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 32 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException(u.p(macSize, StubApp.getString2(29088)));
            }
            this.macSize = macSize / 8;
            keyParameter = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(StubApp.getString2(29115));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
        }
        this.bufBlock = new byte[z2 ? 16 : this.macSize + 16];
        if (iv == null || iv.length < 1) {
            throw new IllegalArgumentException(StubApp.getString2(29114));
        }
        if (z2 && (bArr = this.nonce) != null && Arrays.areEqual(bArr, iv)) {
            String string2 = StubApp.getString2(29113);
            if (keyParameter == null) {
                throw new IllegalArgumentException(string2);
            }
            byte[] bArr2 = this.lastKey;
            if (bArr2 != null && Arrays.areEqual(bArr2, keyParameter.getKey())) {
                throw new IllegalArgumentException(string2);
            }
        }
        this.nonce = iv;
        if (keyParameter != null) {
            this.lastKey = keyParameter.getKey();
        }
        if (keyParameter != null) {
            this.cipher.init(true, keyParameter);
            byte[] bArr3 = new byte[16];
            this.f19031H = bArr3;
            this.cipher.processBlock(bArr3, 0, bArr3, 0);
            this.multiplier.init(this.f19031H);
            this.exp = null;
        } else if (this.f19031H == null) {
            throw new IllegalArgumentException(StubApp.getString2(29089));
        }
        byte[] bArr4 = new byte[16];
        this.f19032J0 = bArr4;
        byte[] bArr5 = this.nonce;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.f19032J0[15] = 1;
        } else {
            gHASH(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            Pack.longToBigEndian(this.nonce.length * 8, bArr6, 8);
            gHASHBlock(this.f19032J0, bArr6);
        }
        this.f19033S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.f19032J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr7 = this.initialAssociatedText;
        if (bArr7 != null) {
            processAADBytes(bArr7, 0, bArr7.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b2) {
        checkStatus();
        byte[] bArr = this.atBlock;
        int i3 = this.atBlockPos;
        bArr[i3] = b2;
        int i10 = i3 + 1;
        this.atBlockPos = i10;
        if (i10 == 16) {
            gHASHBlock(this.S_at, bArr);
            this.atBlockPos = 0;
            this.atLength += 16;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i3, int i10) {
        checkStatus();
        int i11 = this.atBlockPos;
        if (i11 > 0) {
            int i12 = 16 - i11;
            if (i10 < i12) {
                System.arraycopy(bArr, i3, this.atBlock, i11, i10);
                this.atBlockPos += i10;
                return;
            } else {
                System.arraycopy(bArr, i3, this.atBlock, i11, i12);
                gHASHBlock(this.S_at, this.atBlock);
                this.atLength += 16;
                i3 += i12;
                i10 -= i12;
            }
        }
        int i13 = i10 + i3;
        int i14 = i13 - 16;
        while (i3 <= i14) {
            gHASHBlock(this.S_at, bArr, i3);
            this.atLength += 16;
            i3 += 16;
        }
        int i15 = i13 - i3;
        this.atBlockPos = i15;
        System.arraycopy(bArr, i3, this.atBlock, 0, i15);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException {
        checkStatus();
        byte[] bArr2 = this.bufBlock;
        int i10 = this.bufOff;
        bArr2[i10] = b2;
        int i11 = i10 + 1;
        this.bufOff = i11;
        if (i11 != bArr2.length) {
            return 0;
        }
        if (this.forEncryption) {
            encryptBlock(bArr2, 0, bArr, i3);
            this.bufOff = 0;
        } else {
            decryptBlock(bArr2, 0, bArr, i3);
            byte[] bArr3 = this.bufBlock;
            System.arraycopy(bArr3, 16, bArr3, 0, this.macSize);
            this.bufOff = this.macSize;
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
        int i12;
        checkStatus();
        if (bArr.length - i3 < i10) {
            throw new DataLengthException(StubApp.getString2(28609));
        }
        int i13 = 16;
        if (this.forEncryption) {
            int i14 = this.bufOff;
            if (i14 > 0) {
                int i15 = 16 - i14;
                if (i10 < i15) {
                    System.arraycopy(bArr, i3, this.bufBlock, i14, i10);
                } else {
                    System.arraycopy(bArr, i3, this.bufBlock, i14, i15);
                    encryptBlock(this.bufBlock, 0, bArr2, i11);
                    i3 += i15;
                    i10 -= i15;
                }
            } else {
                i13 = 0;
            }
            int i16 = i10 + i3;
            int i17 = i16 - 16;
            while (i3 <= i17) {
                encryptBlock(bArr, i3, bArr2, i11 + i13);
                i3 += 16;
                i13 += 16;
            }
            int i18 = i16 - i3;
            this.bufOff = i18;
            System.arraycopy(bArr, i3, this.bufBlock, 0, i18);
            return i13;
        }
        byte[] bArr3 = this.bufBlock;
        int length = bArr3.length;
        int i19 = this.bufOff;
        int i20 = length - i19;
        if (i10 >= i20) {
            if (i19 >= 16) {
                decryptBlock(bArr3, 0, bArr2, i11);
                byte[] bArr4 = this.bufBlock;
                int i21 = this.bufOff - 16;
                this.bufOff = i21;
                System.arraycopy(bArr4, 16, bArr4, 0, i21);
                if (i10 < i20 + 16) {
                    System.arraycopy(bArr, i3, this.bufBlock, this.bufOff, i10);
                    this.bufOff += i10;
                    return 16;
                }
                i12 = 16;
            } else {
                i12 = 0;
            }
            byte[] bArr5 = this.bufBlock;
            int length2 = (i10 + i3) - bArr5.length;
            int i22 = this.bufOff;
            int i23 = 16 - i22;
            System.arraycopy(bArr, i3, bArr5, i22, i23);
            decryptBlock(this.bufBlock, 0, bArr2, i11 + i12);
            int i24 = i3 + i23;
            int i25 = i12 + 16;
            while (i24 <= length2) {
                decryptBlock(bArr, i24, bArr2, i11 + i25);
                i24 += 16;
                i25 += 16;
            }
            byte[] bArr6 = this.bufBlock;
            int length3 = (bArr6.length + length2) - i24;
            this.bufOff = length3;
            System.arraycopy(bArr, i24, bArr6, 0, length3);
            return i25;
        }
        System.arraycopy(bArr, i3, bArr3, i19, i10);
        this.bufOff += i10;
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException(StubApp.getString2(29067));
        }
        gCMMultiplier = gCMMultiplier == null ? new Tables4kGCMMultiplier() : gCMMultiplier;
        this.cipher = blockCipher;
        this.multiplier = gCMMultiplier;
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2, int i3) {
        GCMUtil.xor(bArr, bArr2, i3);
        this.multiplier.multiplyH(bArr);
    }

    public static GCMModeCipher newInstance(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        return new GCMBlockCipher(blockCipher, gCMMultiplier);
    }

    private void reset(boolean z2) {
        this.cipher.reset();
        this.f19033S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.f19032J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr = this.bufBlock;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z2) {
            this.macBlock = null;
        }
        if (this.forEncryption) {
            this.initialised = false;
            return;
        }
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }
}
