package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EAXBlockCipher implements AEADBlockCipher {
    private static final byte cTAG = 2;
    private static final byte hTAG = 1;
    private static final byte nTAG = 0;
    private byte[] associatedTextMac;
    private int blockSize;
    private byte[] bufBlock;
    private int bufOff;
    private SICBlockCipher cipher;
    private boolean cipherInitialized;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private Mac mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonceMac;

    public EAXBlockCipher(BlockCipher blockCipher) {
        this.blockSize = blockCipher.getBlockSize();
        CMac cMac = new CMac(blockCipher);
        this.mac = cMac;
        this.macBlock = new byte[this.blockSize];
        this.associatedTextMac = new byte[cMac.getMacSize()];
        this.nonceMac = new byte[this.mac.getMacSize()];
        this.cipher = new SICBlockCipher(blockCipher);
    }

    private void calculateMac() {
        byte[] bArr = new byte[this.blockSize];
        int i3 = 0;
        this.mac.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.macBlock;
            if (i3 >= bArr2.length) {
                return;
            }
            bArr2[i3] = (byte) ((this.nonceMac[i3] ^ this.associatedTextMac[i3]) ^ bArr[i3]);
            i3++;
        }
    }

    private void initCipher() {
        if (this.cipherInitialized) {
            return;
        }
        this.cipherInitialized = true;
        this.mac.doFinal(this.associatedTextMac, 0);
        int i3 = this.blockSize;
        byte[] bArr = new byte[i3];
        bArr[i3 - 1] = cTAG;
        this.mac.update(bArr, 0, i3);
    }

    private int process(byte b2, byte[] bArr, int i3) {
        int processBlock;
        byte[] bArr2 = this.bufBlock;
        int i10 = this.bufOff;
        int i11 = i10 + 1;
        this.bufOff = i11;
        bArr2[i10] = b2;
        if (i11 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i12 = this.blockSize;
        if (length < i3 + i12) {
            throw new OutputLengthException(StubApp.getString2(29097));
        }
        if (this.forEncryption) {
            processBlock = this.cipher.processBlock(bArr2, 0, bArr, i3);
            this.mac.update(bArr, i3, this.blockSize);
        } else {
            this.mac.update(bArr2, 0, i12);
            processBlock = this.cipher.processBlock(this.bufBlock, 0, bArr, i3);
        }
        this.bufOff = 0;
        if (!this.forEncryption) {
            byte[] bArr3 = this.bufBlock;
            System.arraycopy(bArr3, this.blockSize, bArr3, 0, this.macSize);
            this.bufOff = this.macSize;
        }
        return processBlock;
    }

    private boolean verifyMac(byte[] bArr, int i3) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.macSize; i11++) {
            i10 |= this.macBlock[i11] ^ bArr[i3 + i11];
        }
        return i10 == 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i3) throws IllegalStateException, InvalidCipherTextException {
        initCipher();
        int i10 = this.bufOff;
        byte[] bArr2 = this.bufBlock;
        byte[] bArr3 = new byte[bArr2.length];
        this.bufOff = 0;
        boolean z2 = this.forEncryption;
        String string2 = StubApp.getString2(28608);
        if (z2) {
            int i11 = i3 + i10;
            if (bArr.length < this.macSize + i11) {
                throw new OutputLengthException(string2);
            }
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i3, i10);
            this.mac.update(bArr3, 0, i10);
            calculateMac();
            System.arraycopy(this.macBlock, 0, bArr, i11, this.macSize);
            reset(false);
            return i10 + this.macSize;
        }
        int i12 = this.macSize;
        if (i10 < i12) {
            throw new InvalidCipherTextException(StubApp.getString2(29074));
        }
        if (bArr.length < (i3 + i10) - i12) {
            throw new OutputLengthException(string2);
        }
        if (i10 > i12) {
            this.mac.update(bArr2, 0, i10 - i12);
            this.cipher.processBlock(this.bufBlock, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i3, i10 - this.macSize);
        }
        calculateMac();
        if (!verifyMac(this.bufBlock, i10 - this.macSize)) {
            throw new InvalidCipherTextException(StubApp.getString2(29098));
        }
        reset(false);
        return i10 - this.macSize;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + StubApp.getString2(29099);
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
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
        return this.cipher.getUnderlyingCipher();
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
        return i10 - (i10 % this.blockSize);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        CipherParameters parameters;
        this.forEncryption = z2;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(StubApp.getString2(29100));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.mac.getMacSize() / 2;
            parameters = parametersWithIV.getParameters();
        }
        this.bufBlock = new byte[z2 ? this.blockSize : this.blockSize + this.macSize];
        byte[] bArr = new byte[this.blockSize];
        this.mac.init(parameters);
        int i3 = this.blockSize;
        bArr[i3 - 1] = 0;
        this.mac.update(bArr, 0, i3);
        this.mac.update(iv, 0, iv.length);
        this.mac.doFinal(this.nonceMac, 0);
        this.cipher.init(true, new ParametersWithIV(parameters, this.nonceMac));
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b2) {
        if (this.cipherInitialized) {
            throw new IllegalStateException(StubApp.getString2(29101));
        }
        this.mac.update(b2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i3, int i10) {
        if (this.cipherInitialized) {
            throw new IllegalStateException(StubApp.getString2(29101));
        }
        this.mac.update(bArr, i3, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException {
        initCipher();
        return process(b2, bArr, i3);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
        initCipher();
        if (bArr.length < i3 + i10) {
            throw new DataLengthException(StubApp.getString2(28609));
        }
        int i12 = 0;
        for (int i13 = 0; i13 != i10; i13++) {
            i12 += process(bArr[i3 + i13], bArr2, i11 + i12);
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z2) {
        this.cipher.reset();
        this.mac.reset();
        this.bufOff = 0;
        Arrays.fill(this.bufBlock, (byte) 0);
        if (z2) {
            Arrays.fill(this.macBlock, (byte) 0);
        }
        int i3 = this.blockSize;
        byte[] bArr = new byte[i3];
        bArr[i3 - 1] = hTAG;
        this.mac.update(bArr, 0, i3);
        this.cipherInitialized = false;
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }
}
