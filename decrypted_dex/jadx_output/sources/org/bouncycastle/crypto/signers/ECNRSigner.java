package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECNRSigner implements DSAExt {
    private boolean forSigning;
    private ECKeyParameters key;
    private SecureRandom random;

    private BigInteger extractT(ECPublicKeyParameters eCPublicKeyParameters, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger n10 = eCPublicKeyParameters.getParameters().getN();
        if (bigInteger.compareTo(ECConstants.ONE) < 0 || bigInteger.compareTo(n10) >= 0 || bigInteger2.compareTo(ECConstants.ZERO) < 0 || bigInteger2.compareTo(n10) >= 0) {
            return null;
        }
        ECPoint normalize = ECAlgorithms.sumOfTwoMultiplies(eCPublicKeyParameters.getParameters().getG(), bigInteger2, eCPublicKeyParameters.getQ(), bigInteger).normalize();
        if (normalize.isInfinity()) {
            return null;
        }
        return bigInteger.subtract(normalize.getAffineXCoord().toBigInteger()).mod(n10);
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        AsymmetricCipherKeyPair generateKeyPair;
        BigInteger mod;
        if (!this.forSigning) {
            throw new IllegalStateException(StubApp.getString2(29295));
        }
        BigInteger order = getOrder();
        BigInteger bigInteger = new BigInteger(1, bArr);
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) this.key;
        if (bigInteger.compareTo(order) >= 0) {
            throw new DataLengthException(StubApp.getString2(29294));
        }
        do {
            ECKeyPairGenerator eCKeyPairGenerator = new ECKeyPairGenerator();
            eCKeyPairGenerator.init(new ECKeyGenerationParameters(eCPrivateKeyParameters.getParameters(), this.random));
            generateKeyPair = eCKeyPairGenerator.generateKeyPair();
            mod = ((ECPublicKeyParameters) generateKeyPair.getPublic()).getQ().getAffineXCoord().toBigInteger().add(bigInteger).mod(order);
        } while (mod.equals(ECConstants.ZERO));
        return new BigInteger[]{mod, ((ECPrivateKeyParameters) generateKeyPair.getPrivate()).getD().subtract(mod.multiply(eCPrivateKeyParameters.getD())).mod(order)};
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getN();
    }

    public byte[] getRecoveredMessage(BigInteger bigInteger, BigInteger bigInteger2) {
        if (this.forSigning) {
            throw new IllegalStateException(StubApp.getString2(29296));
        }
        BigInteger extractT = extractT((ECPublicKeyParameters) this.key, bigInteger, bigInteger2);
        if (extractT != null) {
            return BigIntegers.asUnsignedByteArray(extractT);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z2, CipherParameters cipherParameters) {
        ECKeyParameters eCKeyParameters;
        this.forSigning = z2;
        if (z2) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                cipherParameters = parametersWithRandom.getParameters();
            } else {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            eCKeyParameters = (ECPrivateKeyParameters) cipherParameters;
        } else {
            eCKeyParameters = (ECPublicKeyParameters) cipherParameters;
        }
        this.key = eCKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(29297), this.key, z2));
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (this.forSigning) {
            throw new IllegalStateException(StubApp.getString2(29299));
        }
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) this.key;
        BigInteger n10 = eCPublicKeyParameters.getParameters().getN();
        int bitLength = n10.bitLength();
        BigInteger bigInteger3 = new BigInteger(1, bArr);
        if (bigInteger3.bitLength() > bitLength) {
            throw new DataLengthException(StubApp.getString2(29298));
        }
        BigInteger extractT = extractT(eCPublicKeyParameters, bigInteger, bigInteger2);
        return extractT != null && extractT.equals(bigInteger3.mod(n10));
    }
}
