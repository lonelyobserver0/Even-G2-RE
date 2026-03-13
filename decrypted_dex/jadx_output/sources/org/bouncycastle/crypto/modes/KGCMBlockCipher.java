package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier;
import org.bouncycastle.crypto.modes.kgcm.Tables16kKGCMMultiplier_512;
import org.bouncycastle.crypto.modes.kgcm.Tables4kKGCMMultiplier_128;
import org.bouncycastle.crypto.modes.kgcm.Tables8kKGCMMultiplier_256;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KGCMBlockCipher implements AEADBlockCipher {
    private static final int MIN_MAC_BITS = 64;

    /* renamed from: b, reason: collision with root package name */
    private long[] f19039b;
    private final int blockSize;
    private BufferedBlockCipher ctrEngine;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] iv;
    private byte[] macBlock;
    private KGCMMultiplier multiplier;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();
    private int macSize = -1;

    public static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KGCMBlockCipher(BlockCipher blockCipher) {
        this.engine = blockCipher;
        this.ctrEngine = new BufferedBlockCipher(new KCTRBlockCipher(blockCipher));
        int blockSize = this.engine.getBlockSize();
        this.blockSize = blockSize;
        this.initialAssociatedText = new byte[blockSize];
        this.iv = new byte[blockSize];
        this.multiplier = createDefaultMultiplier(blockSize);
        this.f19039b = new long[blockSize >>> 3];
        this.macBlock = null;
    }

    private void calculateMac(byte[] bArr, int i3, int i10, int i11) {
        int i12 = i3 + i10;
        while (i3 < i12) {
            xorWithInput(this.f19039b, bArr, i3);
            this.multiplier.multiplyH(this.f19039b);
            i3 += this.blockSize;
        }
        long j = (i11 & BodyPartID.bodyIdMax) << 3;
        long j3 = (BodyPartID.bodyIdMax & i10) << 3;
        long[] jArr = this.f19039b;
        jArr[0] = j ^ jArr[0];
        int i13 = this.blockSize >>> 4;
        jArr[i13] = jArr[i13] ^ j3;
        byte[] longToLittleEndian = Pack.longToLittleEndian(jArr);
        this.macBlock = longToLittleEndian;
        this.engine.processBlock(longToLittleEndian, 0, longToLittleEndian, 0);
    }

    private static KGCMMultiplier createDefaultMultiplier(int i3) {
        if (i3 == 16) {
            return new Tables4kKGCMMultiplier_128();
        }
        if (i3 == 32) {
            return new Tables8kKGCMMultiplier_256();
        }
        if (i3 == 64) {
            return new Tables16kKGCMMultiplier_512();
        }
        throw new IllegalArgumentException(StubApp.getString2(29142));
    }

    private void processAAD(byte[] bArr, int i3, int i10) {
        int i11 = i10 + i3;
        while (i3 < i11) {
            xorWithInput(this.f19039b, bArr, i3);
            this.multiplier.multiplyH(this.f19039b);
            i3 += this.blockSize;
        }
    }

    private static void xorWithInput(long[] jArr, byte[] bArr, int i3) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            jArr[i10] = jArr[i10] ^ Pack.littleEndianToLong(bArr, i3);
            i3 += 8;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i3) throws IllegalStateException, InvalidCipherTextException {
        int i10;
        int doFinal;
        int size = this.data.size();
        if (!this.forEncryption && size < this.macSize) {
            throw new InvalidCipherTextException(StubApp.getString2(29074));
        }
        byte[] bArr2 = new byte[this.blockSize];
        this.engine.processBlock(bArr2, 0, bArr2, 0);
        long[] jArr = new long[this.blockSize >>> 3];
        Pack.littleEndianToLong(bArr2, 0, jArr);
        this.multiplier.init(jArr);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(jArr, 0L);
        int size2 = this.associatedText.size();
        if (size2 > 0) {
            processAAD(this.associatedText.getBuffer(), 0, size2);
        }
        boolean z2 = this.forEncryption;
        String string2 = StubApp.getString2(28608);
        if (!z2) {
            i10 = size;
            int i11 = i10 - this.macSize;
            if (bArr.length - i3 < i11) {
                throw new OutputLengthException(string2);
            }
            calculateMac(this.data.getBuffer(), 0, i11, size2);
            int processBytes = this.ctrEngine.processBytes(this.data.getBuffer(), 0, i11, bArr, i3);
            doFinal = this.ctrEngine.doFinal(bArr, i3 + processBytes) + processBytes;
        } else {
            if ((bArr.length - i3) - this.macSize < size) {
                throw new OutputLengthException(string2);
            }
            int processBytes2 = this.ctrEngine.processBytes(this.data.getBuffer(), 0, size, bArr, i3);
            i10 = size;
            doFinal = this.ctrEngine.doFinal(bArr, i3 + processBytes2) + processBytes2;
            calculateMac(bArr, i3, i10, size2);
        }
        byte[] bArr3 = this.macBlock;
        if (bArr3 == null) {
            throw new IllegalStateException(StubApp.getString2(29144));
        }
        if (this.forEncryption) {
            System.arraycopy(bArr3, 0, bArr, i3 + doFinal, this.macSize);
            reset();
            return doFinal + this.macSize;
        }
        byte[] bArr4 = new byte[this.macSize];
        byte[] buffer = this.data.getBuffer();
        int i12 = this.macSize;
        System.arraycopy(buffer, i10 - i12, bArr4, 0, i12);
        int i13 = this.macSize;
        byte[] bArr5 = new byte[i13];
        System.arraycopy(this.macBlock, 0, bArr5, 0, i13);
        if (!Arrays.constantTimeAreEqual(bArr4, bArr5)) {
            throw new InvalidCipherTextException(StubApp.getString2(29143));
        }
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + StubApp.getString2(29145);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i3 = this.macSize;
        byte[] bArr = new byte[i3];
        System.arraycopy(this.macBlock, 0, bArr, 0, i3);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i3) {
        int size = this.data.size() + i3;
        if (this.forEncryption) {
            return size + this.macSize;
        }
        int i10 = this.macSize;
        if (size < i10) {
            return 0;
        }
        return size - i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i3) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        KeyParameter keyParameter;
        this.forEncryption = z2;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            byte[] nonce = aEADParameters.getNonce();
            byte[] bArr = this.iv;
            int length = bArr.length - nonce.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(nonce, 0, this.iv, length, nonce.length);
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > (this.blockSize << 3) || (macSize & 7) != 0) {
                throw new IllegalArgumentException(u.p(macSize, StubApp.getString2(29088)));
            }
            this.macSize = macSize >>> 3;
            keyParameter = aEADParameters.getKey();
            byte[] bArr2 = this.initialAssociatedText;
            if (bArr2 != null) {
                processAADBytes(bArr2, 0, bArr2.length);
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(StubApp.getString2(29146));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            byte[] bArr3 = this.iv;
            int length2 = bArr3.length - iv.length;
            Arrays.fill(bArr3, (byte) 0);
            System.arraycopy(iv, 0, this.iv, length2, iv.length);
            this.initialAssociatedText = null;
            this.macSize = this.blockSize;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
        }
        this.macBlock = new byte[this.blockSize];
        this.ctrEngine.init(true, new ParametersWithIV(keyParameter, this.iv));
        this.engine.init(true, keyParameter);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b2) {
        this.associatedText.write(b2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i3, int i10) {
        this.associatedText.write(bArr, i3, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        this.data.write(b2);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException, IllegalStateException {
        if (bArr.length < i3 + i10) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        this.data.write(bArr, i3, i10);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        Arrays.fill(this.f19039b, 0L);
        this.engine.reset();
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
