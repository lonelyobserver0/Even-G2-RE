package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SNTRUPrimeKEMExtractor implements EncapsulatedSecretExtractor {
    private final SNTRUPrimePrivateKeyParameters privateKey;

    public SNTRUPrimeKEMExtractor(SNTRUPrimePrivateKeyParameters sNTRUPrimePrivateKeyParameters) {
        this.privateKey = sNTRUPrimePrivateKeyParameters;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        SNTRUPrimeParameters parameters = this.privateKey.getParameters();
        int p8 = parameters.getP();
        int q10 = parameters.getQ();
        int w10 = parameters.getW();
        int roundedPolynomialBytes = parameters.getRoundedPolynomialBytes();
        byte[] bArr2 = new byte[p8];
        Utils.getDecodedSmallPolynomial(bArr2, this.privateKey.getF(), p8);
        byte[] bArr3 = new byte[p8];
        Utils.getDecodedSmallPolynomial(bArr3, this.privateKey.getGinv(), p8);
        short[] sArr = new short[p8];
        Utils.getRoundedDecodedPolynomial(sArr, bArr, p8, q10);
        short[] sArr2 = new short[p8];
        Utils.multiplicationInRQ(sArr2, sArr, bArr2, p8, q10);
        short[] sArr3 = new short[p8];
        Utils.scalarMultiplicationInRQ(sArr3, sArr2, 3, q10);
        byte[] bArr4 = new byte[p8];
        Utils.transformRQToR3(bArr4, sArr3);
        byte[] bArr5 = new byte[p8];
        Utils.multiplicationInR3(bArr5, bArr4, bArr3, p8);
        byte[] bArr6 = new byte[p8];
        Utils.checkForSmallPolynomial(bArr6, bArr5, p8, w10);
        byte[] bArr7 = new byte[(p8 + 3) / 4];
        Utils.getEncodedSmallPolynomial(bArr7, bArr6, p8);
        short[] sArr4 = new short[p8];
        Utils.getDecodedPolynomial(sArr4, this.privateKey.getPk(), p8, q10);
        short[] sArr5 = new short[p8];
        Utils.multiplicationInRQ(sArr5, sArr4, bArr6, p8, q10);
        short[] sArr6 = new short[p8];
        Utils.roundPolynomial(sArr6, sArr5);
        byte[] bArr8 = new byte[roundedPolynomialBytes];
        Utils.getRoundedEncodedPolynomial(bArr8, sArr6, p8, q10);
        byte[] hashWithPrefix = Utils.getHashWithPrefix(new byte[]{3}, bArr7);
        byte[] bArr9 = new byte[(hashWithPrefix.length / 2) + this.privateKey.getHash().length];
        System.arraycopy(hashWithPrefix, 0, bArr9, 0, hashWithPrefix.length / 2);
        System.arraycopy(this.privateKey.getHash(), 0, bArr9, hashWithPrefix.length / 2, this.privateKey.getHash().length);
        byte[] hashWithPrefix2 = Utils.getHashWithPrefix(new byte[]{2}, bArr9);
        int length = (hashWithPrefix2.length / 2) + roundedPolynomialBytes;
        byte[] bArr10 = new byte[length];
        System.arraycopy(bArr8, 0, bArr10, 0, roundedPolynomialBytes);
        System.arraycopy(hashWithPrefix2, 0, bArr10, roundedPolynomialBytes, hashWithPrefix2.length / 2);
        int i3 = Arrays.areEqual(bArr, bArr10) ? 0 : -1;
        Utils.updateDiffMask(bArr7, this.privateKey.getRho(), i3);
        byte[] hashWithPrefix3 = Utils.getHashWithPrefix(new byte[]{3}, bArr7);
        byte[] bArr11 = new byte[(hashWithPrefix3.length / 2) + length];
        System.arraycopy(hashWithPrefix3, 0, bArr11, 0, hashWithPrefix3.length / 2);
        System.arraycopy(bArr10, 0, bArr11, hashWithPrefix3.length / 2, length);
        return Arrays.copyOfRange(Utils.getHashWithPrefix(new byte[]{(byte) (i3 + 1)}, bArr11), 0, parameters.getSessionKeySize() / 8);
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.privateKey.getParameters().getRoundedPolynomialBytes() + 32;
    }
}
