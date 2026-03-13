package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SNTRUPrimeKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private SNTRUPrimeKeyGenerationParameters params;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int p8 = this.params.getSntrupParams().getP();
        int q10 = this.params.getSntrupParams().getQ();
        int w10 = this.params.getSntrupParams().getW();
        byte[] bArr = new byte[p8];
        byte[] bArr2 = new byte[p8];
        do {
            Utils.getRandomSmallPolynomial(this.params.getRandom(), bArr);
        } while (!Utils.isInvertiblePolynomialInR3(bArr, bArr2, p8));
        byte[] bArr3 = new byte[p8];
        Utils.getRandomShortPolynomial(this.params.getRandom(), bArr3, p8, w10);
        short[] sArr = new short[p8];
        Utils.getOneThirdInverseInRQ(sArr, bArr3, p8, q10);
        short[] sArr2 = new short[p8];
        Utils.multiplicationInRQ(sArr2, sArr, bArr, p8, q10);
        byte[] bArr4 = new byte[this.params.getSntrupParams().getPublicKeyBytes()];
        Utils.getEncodedPolynomial(bArr4, sArr2, p8, q10);
        SNTRUPrimePublicKeyParameters sNTRUPrimePublicKeyParameters = new SNTRUPrimePublicKeyParameters(this.params.getSntrupParams(), bArr4);
        int i3 = (p8 + 3) / 4;
        byte[] bArr5 = new byte[i3];
        Utils.getEncodedSmallPolynomial(bArr5, bArr3, p8);
        byte[] bArr6 = new byte[i3];
        Utils.getEncodedSmallPolynomial(bArr6, bArr2, p8);
        byte[] bArr7 = new byte[i3];
        this.params.getRandom().nextBytes(bArr7);
        byte[] hashWithPrefix = Utils.getHashWithPrefix(new byte[]{4}, bArr4);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) sNTRUPrimePublicKeyParameters, (AsymmetricKeyParameter) new SNTRUPrimePrivateKeyParameters(this.params.getSntrupParams(), bArr5, bArr6, bArr4, bArr7, Arrays.copyOfRange(hashWithPrefix, 0, hashWithPrefix.length / 2)));
    }

    public SNTRUPrimeKeyGenerationParameters getParams() {
        return this.params;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (SNTRUPrimeKeyGenerationParameters) keyGenerationParameters;
    }
}
