package org.bouncycastle.pqc.crypto.ntruprime;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SNTRUPrimeKEMGenerator implements EncapsulatedSecretGenerator {
    private final SecureRandom random;

    public SNTRUPrimeKEMGenerator(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        SNTRUPrimePublicKeyParameters sNTRUPrimePublicKeyParameters = (SNTRUPrimePublicKeyParameters) asymmetricKeyParameter;
        SNTRUPrimeParameters parameters = sNTRUPrimePublicKeyParameters.getParameters();
        int p8 = parameters.getP();
        int q10 = parameters.getQ();
        int w10 = parameters.getW();
        int roundedPolynomialBytes = parameters.getRoundedPolynomialBytes();
        byte[] hashWithPrefix = Utils.getHashWithPrefix(new byte[]{4}, sNTRUPrimePublicKeyParameters.getEncoded());
        byte[] bArr = new byte[p8];
        Utils.getRandomShortPolynomial(this.random, bArr, p8, w10);
        byte[] bArr2 = new byte[(p8 + 3) / 4];
        Utils.getEncodedSmallPolynomial(bArr2, bArr, p8);
        short[] sArr = new short[p8];
        Utils.getDecodedPolynomial(sArr, sNTRUPrimePublicKeyParameters.getEncH(), p8, q10);
        short[] sArr2 = new short[p8];
        Utils.multiplicationInRQ(sArr2, sArr, bArr, p8, q10);
        short[] sArr3 = new short[p8];
        Utils.roundPolynomial(sArr3, sArr2);
        byte[] bArr3 = new byte[roundedPolynomialBytes];
        Utils.getRoundedEncodedPolynomial(bArr3, sArr3, p8, q10);
        byte[] hashWithPrefix2 = Utils.getHashWithPrefix(new byte[]{3}, bArr2);
        byte[] bArr4 = new byte[(hashWithPrefix.length / 2) + (hashWithPrefix2.length / 2)];
        System.arraycopy(hashWithPrefix2, 0, bArr4, 0, hashWithPrefix2.length / 2);
        System.arraycopy(hashWithPrefix, 0, bArr4, hashWithPrefix2.length / 2, hashWithPrefix.length / 2);
        byte[] hashWithPrefix3 = Utils.getHashWithPrefix(new byte[]{2}, bArr4);
        int length = (hashWithPrefix3.length / 2) + roundedPolynomialBytes;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr3, 0, bArr5, 0, roundedPolynomialBytes);
        System.arraycopy(hashWithPrefix3, 0, bArr5, roundedPolynomialBytes, hashWithPrefix3.length / 2);
        byte[] hashWithPrefix4 = Utils.getHashWithPrefix(new byte[]{3}, bArr2);
        byte[] bArr6 = new byte[(hashWithPrefix4.length / 2) + length];
        System.arraycopy(hashWithPrefix4, 0, bArr6, 0, hashWithPrefix4.length / 2);
        System.arraycopy(bArr5, 0, bArr6, hashWithPrefix4.length / 2, length);
        return new SecretWithEncapsulationImpl(Arrays.copyOfRange(Utils.getHashWithPrefix(new byte[]{1}, bArr6), 0, parameters.getSessionKeySize() / 8), bArr5);
    }
}
