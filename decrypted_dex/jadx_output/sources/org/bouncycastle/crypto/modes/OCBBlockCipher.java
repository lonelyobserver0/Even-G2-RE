package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import i2.u;
import java.util.Vector;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OCBBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] Checksum;

    /* renamed from: L, reason: collision with root package name */
    private Vector f19040L;
    private byte[] L_Asterisk;
    private byte[] L_Dollar;
    private byte[] OffsetHASH;
    private byte[] Sum;
    private boolean forEncryption;
    private byte[] hashBlock;
    private long hashBlockCount;
    private int hashBlockPos;
    private BlockCipher hashCipher;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private byte[] mainBlock;
    private long mainBlockCount;
    private int mainBlockPos;
    private BlockCipher mainCipher;
    private byte[] KtopInput = null;
    private byte[] Stretch = new byte[24];
    private byte[] OffsetMAIN_0 = new byte[16];
    private byte[] OffsetMAIN = new byte[16];

    public OCBBlockCipher(BlockCipher blockCipher, BlockCipher blockCipher2) {
        if (blockCipher == null) {
            throw new IllegalArgumentException(StubApp.getString2(29156));
        }
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException(StubApp.getString2(29155));
        }
        if (blockCipher2 == null) {
            throw new IllegalArgumentException(StubApp.getString2(29154));
        }
        if (blockCipher2.getBlockSize() != 16) {
            throw new IllegalArgumentException(StubApp.getString2(29153));
        }
        if (!blockCipher.getAlgorithmName().equals(blockCipher2.getAlgorithmName())) {
            throw new IllegalArgumentException(StubApp.getString2(29152));
        }
        this.hashCipher = blockCipher;
        this.mainCipher = blockCipher2;
    }

    public static byte[] OCB_double(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - shiftLeft(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    public static void OCB_extend(byte[] bArr, int i3) {
        bArr[i3] = ByteCompanionObject.MIN_VALUE;
        while (true) {
            i3++;
            if (i3 >= 16) {
                return;
            } else {
                bArr[i3] = 0;
            }
        }
    }

    public static int OCB_ntz(long j) {
        if (j == 0) {
            return 64;
        }
        int i3 = 0;
        while ((1 & j) == 0) {
            i3++;
            j >>>= 1;
        }
        return i3;
    }

    public static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int i3 = 16;
        int i10 = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                return i10;
            }
            int i11 = bArr[i3] & UByte.MAX_VALUE;
            bArr2[i3] = (byte) (i10 | (i11 << 1));
            i10 = (i11 >>> 7) & 1;
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        for (int i3 = 15; i3 >= 0; i3--) {
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
        }
    }

    public void clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i3) throws IllegalStateException, InvalidCipherTextException {
        byte[] bArr2;
        if (this.forEncryption) {
            bArr2 = null;
        } else {
            int i10 = this.mainBlockPos;
            int i11 = this.macSize;
            if (i10 < i11) {
                throw new InvalidCipherTextException(StubApp.getString2(29074));
            }
            int i12 = i10 - i11;
            this.mainBlockPos = i12;
            bArr2 = new byte[i11];
            System.arraycopy(this.mainBlock, i12, bArr2, 0, i11);
        }
        int i13 = this.hashBlockPos;
        if (i13 > 0) {
            OCB_extend(this.hashBlock, i13);
            updateHASH(this.L_Asterisk);
        }
        int i14 = this.mainBlockPos;
        String string2 = StubApp.getString2(28608);
        if (i14 > 0) {
            if (this.forEncryption) {
                OCB_extend(this.mainBlock, i14);
                xor(this.Checksum, this.mainBlock);
            }
            xor(this.OffsetMAIN, this.L_Asterisk);
            byte[] bArr3 = new byte[16];
            this.hashCipher.processBlock(this.OffsetMAIN, 0, bArr3, 0);
            xor(this.mainBlock, bArr3);
            int length = bArr.length;
            int i15 = this.mainBlockPos;
            if (length < i3 + i15) {
                throw new OutputLengthException(string2);
            }
            System.arraycopy(this.mainBlock, 0, bArr, i3, i15);
            if (!this.forEncryption) {
                OCB_extend(this.mainBlock, this.mainBlockPos);
                xor(this.Checksum, this.mainBlock);
            }
        }
        xor(this.Checksum, this.OffsetMAIN);
        xor(this.Checksum, this.L_Dollar);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr4 = this.Checksum;
        blockCipher.processBlock(bArr4, 0, bArr4, 0);
        xor(this.Checksum, this.Sum);
        int i16 = this.macSize;
        byte[] bArr5 = new byte[i16];
        this.macBlock = bArr5;
        System.arraycopy(this.Checksum, 0, bArr5, 0, i16);
        int i17 = this.mainBlockPos;
        if (this.forEncryption) {
            int length2 = bArr.length;
            int i18 = i3 + i17;
            int i19 = this.macSize;
            if (length2 < i18 + i19) {
                throw new OutputLengthException(string2);
            }
            System.arraycopy(this.macBlock, 0, bArr, i18, i19);
            i17 += this.macSize;
        } else if (!Arrays.constantTimeAreEqual(this.macBlock, bArr2)) {
            throw new InvalidCipherTextException(StubApp.getString2(29157));
        }
        reset(false);
        return i17;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.mainCipher.getAlgorithmName() + StubApp.getString2(29158);
    }

    public byte[] getLSub(int i3) {
        while (i3 >= this.f19040L.size()) {
            Vector vector = this.f19040L;
            vector.addElement(OCB_double((byte[]) vector.lastElement()));
        }
        return (byte[]) this.f19040L.elementAt(i3);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.macSize] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i3) {
        int i10 = i3 + this.mainBlockPos;
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
        return this.mainCipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i3) {
        int i10 = i3 + this.mainBlockPos;
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
        boolean z10 = this.forEncryption;
        this.forEncryption = z2;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException(u.p(macSize, StubApp.getString2(29088)));
            }
            this.macSize = macSize / 8;
            keyParameter = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(StubApp.getString2(29160));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
        }
        this.hashBlock = new byte[16];
        this.mainBlock = new byte[z2 ? 16 : this.macSize + 16];
        if (iv == null) {
            iv = new byte[0];
        }
        if (iv.length > 15) {
            throw new IllegalArgumentException(StubApp.getString2(29159));
        }
        if (keyParameter != null) {
            this.hashCipher.init(true, keyParameter);
            this.mainCipher.init(z2, keyParameter);
            this.KtopInput = null;
        } else if (z10 != z2) {
            throw new IllegalArgumentException(StubApp.getString2(29065));
        }
        byte[] bArr = new byte[16];
        this.L_Asterisk = bArr;
        this.hashCipher.processBlock(bArr, 0, bArr, 0);
        this.L_Dollar = OCB_double(this.L_Asterisk);
        Vector vector = new Vector();
        this.f19040L = vector;
        vector.addElement(OCB_double(this.L_Dollar));
        int processNonce = processNonce(iv);
        int i3 = processNonce % 8;
        int i10 = processNonce / 8;
        if (i3 == 0) {
            System.arraycopy(this.Stretch, i10, this.OffsetMAIN_0, 0, 16);
        } else {
            for (int i11 = 0; i11 < 16; i11++) {
                byte[] bArr2 = this.Stretch;
                int i12 = bArr2[i10] & UByte.MAX_VALUE;
                i10++;
                this.OffsetMAIN_0[i11] = (byte) (((bArr2[i10] & UByte.MAX_VALUE) >>> (8 - i3)) | (i12 << i3));
            }
        }
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        this.OffsetHASH = new byte[16];
        this.Sum = new byte[16];
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        this.Checksum = new byte[16];
        byte[] bArr3 = this.initialAssociatedText;
        if (bArr3 != null) {
            processAADBytes(bArr3, 0, bArr3.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b2) {
        byte[] bArr = this.hashBlock;
        int i3 = this.hashBlockPos;
        bArr[i3] = b2;
        int i10 = i3 + 1;
        this.hashBlockPos = i10;
        if (i10 == bArr.length) {
            processHashBlock();
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i3, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.hashBlock;
            int i12 = this.hashBlockPos;
            bArr2[i12] = bArr[i3 + i11];
            int i13 = i12 + 1;
            this.hashBlockPos = i13;
            if (i13 == bArr2.length) {
                processHashBlock();
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException {
        byte[] bArr2 = this.mainBlock;
        int i10 = this.mainBlockPos;
        bArr2[i10] = b2;
        int i11 = i10 + 1;
        this.mainBlockPos = i11;
        if (i11 != bArr2.length) {
            return 0;
        }
        processMainBlock(bArr, i3);
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
        if (bArr.length < i3 + i10) {
            throw new DataLengthException(StubApp.getString2(28609));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            byte[] bArr3 = this.mainBlock;
            int i14 = this.mainBlockPos;
            bArr3[i14] = bArr[i3 + i13];
            int i15 = i14 + 1;
            this.mainBlockPos = i15;
            if (i15 == bArr3.length) {
                processMainBlock(bArr2, i11 + i12);
                i12 += 16;
            }
        }
        return i12;
    }

    public void processHashBlock() {
        long j = this.hashBlockCount + 1;
        this.hashBlockCount = j;
        updateHASH(getLSub(OCB_ntz(j)));
        this.hashBlockPos = 0;
    }

    public void processMainBlock(byte[] bArr, int i3) {
        if (bArr.length < i3 + 16) {
            throw new OutputLengthException(StubApp.getString2(28608));
        }
        if (this.forEncryption) {
            xor(this.Checksum, this.mainBlock);
            this.mainBlockPos = 0;
        }
        byte[] bArr2 = this.OffsetMAIN;
        long j = this.mainBlockCount + 1;
        this.mainBlockCount = j;
        xor(bArr2, getLSub(OCB_ntz(j)));
        xor(this.mainBlock, this.OffsetMAIN);
        BlockCipher blockCipher = this.mainCipher;
        byte[] bArr3 = this.mainBlock;
        blockCipher.processBlock(bArr3, 0, bArr3, 0);
        xor(this.mainBlock, this.OffsetMAIN);
        System.arraycopy(this.mainBlock, 0, bArr, i3, 16);
        if (this.forEncryption) {
            return;
        }
        xor(this.Checksum, this.mainBlock);
        byte[] bArr4 = this.mainBlock;
        System.arraycopy(bArr4, 16, bArr4, 0, this.macSize);
        this.mainBlockPos = this.macSize;
    }

    public int processNonce(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i3 = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.macSize << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b2 = bArr2[15];
        int i10 = b2 & 63;
        bArr2[15] = (byte) (b2 & 192);
        byte[] bArr3 = this.KtopInput;
        if (bArr3 == null || !Arrays.areEqual(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.KtopInput = bArr2;
            this.hashCipher.processBlock(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.Stretch, 0, 16);
            while (i3 < 8) {
                byte[] bArr5 = this.Stretch;
                int i11 = i3 + 16;
                byte b10 = bArr4[i3];
                i3++;
                bArr5[i11] = (byte) (b10 ^ bArr4[i3]);
            }
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    public void updateHASH(byte[] bArr) {
        xor(this.OffsetHASH, bArr);
        xor(this.hashBlock, this.OffsetHASH);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr2 = this.hashBlock;
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        xor(this.Sum, this.hashBlock);
    }

    public void reset(boolean z2) {
        this.hashCipher.reset();
        this.mainCipher.reset();
        clear(this.hashBlock);
        clear(this.mainBlock);
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        clear(this.OffsetHASH);
        clear(this.Sum);
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        clear(this.Checksum);
        if (z2) {
            this.macBlock = null;
        }
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
