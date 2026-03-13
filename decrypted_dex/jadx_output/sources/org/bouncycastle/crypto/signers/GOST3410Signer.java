package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.GOST3410KeyParameters;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410Signer implements DSAExt {
    GOST3410KeyParameters key;
    SecureRandom random;

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        BigInteger createRandomBigInteger;
        BigInteger bigInteger = new BigInteger(1, Arrays.reverse(bArr));
        GOST3410Parameters parameters = this.key.getParameters();
        do {
            createRandomBigInteger = BigIntegers.createRandomBigInteger(parameters.getQ().bitLength(), this.random);
        } while (createRandomBigInteger.compareTo(parameters.getQ()) >= 0);
        BigInteger mod = parameters.getA().modPow(createRandomBigInteger, parameters.getP()).mod(parameters.getQ());
        return new BigInteger[]{mod, createRandomBigInteger.multiply(bigInteger).add(((GOST3410PrivateKeyParameters) this.key).getX().multiply(mod)).mod(parameters.getQ())};
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getQ();
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z2, CipherParameters cipherParameters) {
        GOST3410KeyParameters gOST3410KeyParameters;
        if (z2) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                cipherParameters = parametersWithRandom.getParameters();
            } else {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            gOST3410KeyParameters = (GOST3410PrivateKeyParameters) cipherParameters;
        } else {
            gOST3410KeyParameters = (GOST3410PublicKeyParameters) cipherParameters;
        }
        this.key = gOST3410KeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(28165), this.key, z2));
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = new BigInteger(1, Arrays.reverse(bArr));
        GOST3410Parameters parameters = this.key.getParameters();
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || parameters.getQ().compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || parameters.getQ().compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modPow = bigInteger3.modPow(parameters.getQ().subtract(new BigInteger(StubApp.getString2(4967))), parameters.getQ());
        return parameters.getA().modPow(bigInteger2.multiply(modPow).mod(parameters.getQ()), parameters.getP()).multiply(((GOST3410PublicKeyParameters) this.key).getY().modPow(parameters.getQ().subtract(bigInteger).multiply(modPow).mod(parameters.getQ()), parameters.getP())).mod(parameters.getP()).mod(parameters.getQ()).equals(bigInteger);
    }
}
