package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSTU4145Signer implements DSAExt {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private ECKeyParameters key;
    private SecureRandom random;

    private static BigInteger fieldElement2Integer(BigInteger bigInteger, ECFieldElement eCFieldElement) {
        return truncate(eCFieldElement.toBigInteger(), bigInteger.bitLength() - 1);
    }

    private static BigInteger generateRandomInteger(BigInteger bigInteger, SecureRandom secureRandom) {
        return BigIntegers.createRandomBigInteger(bigInteger.bitLength() - 1, secureRandom);
    }

    private static ECFieldElement hash2FieldElement(ECCurve eCCurve, byte[] bArr) {
        return eCCurve.fromBigInteger(truncate(new BigInteger(1, Arrays.reverse(bArr)), eCCurve.getFieldSize()));
    }

    private static BigInteger truncate(BigInteger bigInteger, int i3) {
        return bigInteger.bitLength() > i3 ? bigInteger.mod(ONE.shiftLeft(i3)) : bigInteger;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.key.getParameters();
        ECCurve curve = parameters.getCurve();
        ECFieldElement hash2FieldElement = hash2FieldElement(curve, bArr);
        if (hash2FieldElement.isZero()) {
            hash2FieldElement = curve.fromBigInteger(ONE);
        }
        BigInteger n10 = parameters.getN();
        BigInteger d8 = ((ECPrivateKeyParameters) this.key).getD();
        ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger generateRandomInteger = generateRandomInteger(n10, this.random);
            ECFieldElement affineXCoord = createBasePointMultiplier.multiply(parameters.getG(), generateRandomInteger).normalize().getAffineXCoord();
            if (!affineXCoord.isZero()) {
                BigInteger fieldElement2Integer = fieldElement2Integer(n10, hash2FieldElement.multiply(affineXCoord));
                if (fieldElement2Integer.signum() != 0) {
                    BigInteger mod = fieldElement2Integer.multiply(d8).add(generateRandomInteger).mod(n10);
                    if (mod.signum() != 0) {
                        return new BigInteger[]{fieldElement2Integer, mod};
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getN();
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z2, CipherParameters cipherParameters) {
        ECKeyParameters eCKeyParameters;
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
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(29292), this.key, z2));
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() > 0 && bigInteger2.signum() > 0) {
            ECDomainParameters parameters = this.key.getParameters();
            BigInteger n10 = parameters.getN();
            if (bigInteger.compareTo(n10) < 0 && bigInteger2.compareTo(n10) < 0) {
                ECCurve curve = parameters.getCurve();
                ECFieldElement hash2FieldElement = hash2FieldElement(curve, bArr);
                if (hash2FieldElement.isZero()) {
                    hash2FieldElement = curve.fromBigInteger(ONE);
                }
                ECPoint normalize = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), bigInteger2, ((ECPublicKeyParameters) this.key).getQ(), bigInteger).normalize();
                if (!normalize.isInfinity() && fieldElement2Integer(n10, hash2FieldElement.multiply(normalize.getAffineXCoord())).compareTo(bigInteger) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
