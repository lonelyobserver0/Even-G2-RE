package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSASigner implements DSAExt {
    private final DSAKCalculator kCalculator;
    private DSAKeyParameters key;
    private SecureRandom random;

    public DSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    private BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int bitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(bArr, 0, bArr2, 0, bitLength);
        return new BigInteger(1, bArr2);
    }

    private BigInteger getRandomizer(BigInteger bigInteger, SecureRandom secureRandom) {
        return BigIntegers.createRandomBigInteger(7, CryptoServicesRegistrar.getSecureRandom(secureRandom)).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q10 = parameters.getQ();
        BigInteger calculateE = calculateE(q10, bArr);
        BigInteger x7 = ((DSAPrivateKeyParameters) this.key).getX();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(q10, x7, bArr);
        } else {
            this.kCalculator.init(q10, this.random);
        }
        BigInteger nextK = this.kCalculator.nextK();
        BigInteger mod = parameters.getG().modPow(nextK.add(getRandomizer(q10, this.random)), parameters.getP()).mod(q10);
        return new BigInteger[]{mod, BigIntegers.modOddInverse(q10, nextK).multiply(calculateE.add(x7.multiply(mod))).mod(q10)};
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getQ();
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z2, CipherParameters cipherParameters) {
        DSAKeyParameters dSAKeyParameters;
        SecureRandom secureRandom;
        if (!z2) {
            dSAKeyParameters = (DSAPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (DSAPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
                CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28060), this.key, z2));
                this.random = initSecureRandom((z2 || this.kCalculator.isDeterministic()) ? false : true, secureRandom);
            }
            dSAKeyParameters = (DSAPrivateKeyParameters) cipherParameters;
        }
        this.key = dSAKeyParameters;
        secureRandom = null;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28060), this.key, z2));
        this.random = initSecureRandom((z2 || this.kCalculator.isDeterministic()) ? false : true, secureRandom);
    }

    public SecureRandom initSecureRandom(boolean z2, SecureRandom secureRandom) {
        if (z2) {
            return CryptoServicesRegistrar.getSecureRandom(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q10 = parameters.getQ();
        BigInteger calculateE = calculateE(q10, bArr);
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || q10.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || q10.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modOddInverseVar = BigIntegers.modOddInverseVar(q10, bigInteger2);
        BigInteger mod = calculateE.multiply(modOddInverseVar).mod(q10);
        BigInteger mod2 = bigInteger.multiply(modOddInverseVar).mod(q10);
        BigInteger p8 = parameters.getP();
        return parameters.getG().modPow(mod, p8).multiply(((DSAPublicKeyParameters) this.key).getY().modPow(mod2, p8)).mod(p8).mod(q10).equals(bigInteger);
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
