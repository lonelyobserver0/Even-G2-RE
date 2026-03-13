package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CCMBlockCipher implements CCMModeCipher {
    private int blockSize;
    private BlockCipher cipher;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private CipherParameters keyParam;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();

    public static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public CCMBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.macBlock = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException(StubApp.getString2(29067));
        }
    }

    private int calculateMac(byte[] bArr, int i3, int i10, byte[] bArr2) {
        CBCBlockCipherMac cBCBlockCipherMac = new CBCBlockCipherMac(this.cipher, this.macSize * 8);
        cBCBlockCipherMac.init(this.keyParam);
        byte[] bArr3 = new byte[16];
        if (hasAssociatedText()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i11 = 2;
        byte macSize = (byte) (bArr3[0] | ((((cBCBlockCipherMac.getMacSize() - 2) / 2) & 7) << 3));
        bArr3[0] = macSize;
        byte[] bArr4 = this.nonce;
        bArr3[0] = (byte) (macSize | ((14 - bArr4.length) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i12 = i10;
        int i13 = 1;
        while (i12 > 0) {
            bArr3[16 - i13] = (byte) (i12 & 255);
            i12 >>>= 8;
            i13++;
        }
        cBCBlockCipherMac.update(bArr3, 0, 16);
        if (hasAssociatedText()) {
            int associatedTextLength = getAssociatedTextLength();
            if (associatedTextLength < 65280) {
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
            } else {
                cBCBlockCipherMac.update((byte) -1);
                cBCBlockCipherMac.update((byte) -2);
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 24));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 16));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
                i11 = 6;
            }
            byte[] bArr5 = this.initialAssociatedText;
            if (bArr5 != null) {
                cBCBlockCipherMac.update(bArr5, 0, bArr5.length);
            }
            if (this.associatedText.size() > 0) {
                cBCBlockCipherMac.update(this.associatedText.getBuffer(), 0, this.associatedText.size());
            }
            int i14 = (i11 + associatedTextLength) % 16;
            if (i14 != 0) {
                while (i14 != 16) {
                    cBCBlockCipherMac.update((byte) 0);
                    i14++;
                }
            }
        }
        cBCBlockCipherMac.update(bArr, i3, i10);
        return cBCBlockCipherMac.doFinal(bArr2, 0);
    }

    private int getAssociatedTextLength() {
        int size = this.associatedText.size();
        byte[] bArr = this.initialAssociatedText;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private int getMacSize(boolean z2, int i3) {
        if (!z2 || (i3 >= 32 && i3 <= 128 && (i3 & 15) == 0)) {
            return i3 >>> 3;
        }
        throw new IllegalArgumentException(StubApp.getString2(29068));
    }

    private boolean hasAssociatedText() {
        return getAssociatedTextLength() > 0;
    }

    public static CCMModeCipher newInstance(BlockCipher blockCipher) {
        return new CCMBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i3) throws IllegalStateException, InvalidCipherTextException {
        int processPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i3);
        reset();
        return processPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29069);
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
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i3) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        this.forEncryption = z2;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            this.nonce = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = getMacSize(z2, aEADParameters.getMacSize());
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(a.g(StubApp.getString2(29071), cipherParameters));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = getMacSize(z2, 64);
            parameters = parametersWithIV.getParameters();
        }
        if (parameters != null) {
            this.keyParam = parameters;
        }
        byte[] bArr = this.nonce;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException(StubApp.getString2(29070));
        }
        reset();
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
            throw new DataLengthException(StubApp.getString2(28609));
        }
        this.data.write(bArr, i3, i10);
        return 0;
    }

    public int processPacket(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        int i12;
        if (this.keyParam == null) {
            throw new IllegalStateException(StubApp.getString2(29075));
        }
        byte[] bArr3 = this.nonce;
        int length = bArr3.length;
        int i13 = 15 - length;
        if (i13 < 4 && i10 >= (1 << (i13 * 8))) {
            throw new IllegalStateException(StubApp.getString2(29072));
        }
        byte[] bArr4 = new byte[this.blockSize];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        SICBlockCipher sICBlockCipher = new SICBlockCipher(this.cipher);
        sICBlockCipher.init(this.forEncryption, new ParametersWithIV(this.keyParam, bArr4));
        boolean z2 = this.forEncryption;
        String string2 = StubApp.getString2(28673);
        if (!z2) {
            int i14 = this.macSize;
            if (i10 < i14) {
                throw new InvalidCipherTextException(StubApp.getString2(29074));
            }
            int i15 = i10 - i14;
            if (bArr2.length < i15 + i11) {
                throw new OutputLengthException(string2);
            }
            int i16 = i3 + i15;
            System.arraycopy(bArr, i16, this.macBlock, 0, i14);
            byte[] bArr5 = this.macBlock;
            sICBlockCipher.processBlock(bArr5, 0, bArr5, 0);
            int i17 = this.macSize;
            while (true) {
                byte[] bArr6 = this.macBlock;
                if (i17 == bArr6.length) {
                    break;
                }
                bArr6[i17] = 0;
                i17++;
            }
            int i18 = i3;
            int i19 = i11;
            while (true) {
                i12 = this.blockSize;
                if (i18 >= i16 - i12) {
                    break;
                }
                sICBlockCipher.processBlock(bArr, i18, bArr2, i19);
                int i20 = this.blockSize;
                i19 += i20;
                i18 += i20;
            }
            byte[] bArr7 = new byte[i12];
            int i21 = i15 - (i18 - i3);
            System.arraycopy(bArr, i18, bArr7, 0, i21);
            sICBlockCipher.processBlock(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i19, i21);
            byte[] bArr8 = new byte[this.blockSize];
            calculateMac(bArr2, i11, i15, bArr8);
            if (Arrays.constantTimeAreEqual(this.macBlock, bArr8)) {
                return i15;
            }
            throw new InvalidCipherTextException(StubApp.getString2(29073));
        }
        int i22 = this.macSize + i10;
        if (bArr2.length < i22 + i11) {
            throw new OutputLengthException(string2);
        }
        calculateMac(bArr, i3, i10, this.macBlock);
        byte[] bArr9 = new byte[this.blockSize];
        sICBlockCipher.processBlock(this.macBlock, 0, bArr9, 0);
        int i23 = i3;
        int i24 = i11;
        while (true) {
            int i25 = i3 + i10;
            int i26 = this.blockSize;
            if (i23 >= i25 - i26) {
                byte[] bArr10 = new byte[i26];
                int i27 = i25 - i23;
                System.arraycopy(bArr, i23, bArr10, 0, i27);
                sICBlockCipher.processBlock(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i24, i27);
                System.arraycopy(bArr9, 0, bArr2, i11 + i10, this.macSize);
                return i22;
            }
            sICBlockCipher.processBlock(bArr, i23, bArr2, i24);
            int i28 = this.blockSize;
            i24 += i28;
            i23 += i28;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        this.cipher.reset();
        this.associatedText.reset();
        this.data.reset();
    }

    public byte[] processPacket(byte[] bArr, int i3, int i10) throws IllegalStateException, InvalidCipherTextException {
        int i11;
        if (this.forEncryption) {
            i11 = this.macSize + i10;
        } else {
            int i12 = this.macSize;
            if (i10 < i12) {
                throw new InvalidCipherTextException(StubApp.getString2(29074));
            }
            i11 = i10 - i12;
        }
        byte[] bArr2 = new byte[i11];
        processPacket(bArr, i3, i10, bArr2, 0);
        return bArr2;
    }
}
