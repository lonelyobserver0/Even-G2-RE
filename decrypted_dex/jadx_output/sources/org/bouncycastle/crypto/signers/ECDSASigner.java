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
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECDSASigner implements ECConstants, DSAExt {
    private final DSAKCalculator kCalculator;
    private ECKeyParameters key;
    private SecureRandom random;

    public ECDSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    public BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return bitLength < length ? bigInteger2.shiftRight(length - bitLength) : bigInteger2;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n10 = parameters.getN();
        BigInteger calculateE = calculateE(n10, bArr);
        BigInteger d8 = ((ECPrivateKeyParameters) this.key).getD();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(n10, d8, bArr);
        } else {
            this.kCalculator.init(n10, this.random);
        }
        ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger nextK = this.kCalculator.nextK();
            BigInteger mod = createBasePointMultiplier.multiply(parameters.getG(), nextK).normalize().getAffineXCoord().toBigInteger().mod(n10);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!mod.equals(bigInteger)) {
                BigInteger mod2 = BigIntegers.modOddInverse(n10, nextK).multiply(calculateE.add(d8.multiply(mod))).mod(n10);
                if (!mod2.equals(bigInteger)) {
                    return new BigInteger[]{mod, mod2};
                }
            }
        }
    }

    public ECFieldElement getDenominator(int i3, ECPoint eCPoint) {
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3 || i3 == 4) {
                return eCPoint.getZCoord(0).square();
            }
            if (i3 != 6 && i3 != 7) {
                return null;
            }
        }
        return eCPoint.getZCoord(0);
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getN();
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z2, CipherParameters cipherParameters) {
        ECKeyParameters eCKeyParameters;
        SecureRandom secureRandom;
        if (!z2) {
            eCKeyParameters = (ECPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (ECPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
                CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(29292), this.key, z2));
                this.random = initSecureRandom((z2 || this.kCalculator.isDeterministic()) ? false : true, secureRandom);
            }
            eCKeyParameters = (ECPrivateKeyParameters) cipherParameters;
        }
        this.key = eCKeyParameters;
        secureRandom = null;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(StubApp.getString2(29292), this.key, z2));
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
        BigInteger cofactor;
        ECFieldElement denominator;
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n10 = parameters.getN();
        BigInteger calculateE = calculateE(n10, bArr);
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n10) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n10) >= 0) {
            return false;
        }
        BigInteger modOddInverseVar = BigIntegers.modOddInverseVar(n10, bigInteger2);
        ECPoint sumOfTwoMultiplies = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), calculateE.multiply(modOddInverseVar).mod(n10), ((ECPublicKeyParameters) this.key).getQ(), bigInteger.multiply(modOddInverseVar).mod(n10));
        if (sumOfTwoMultiplies.isInfinity()) {
            return false;
        }
        ECCurve curve = sumOfTwoMultiplies.getCurve();
        if (curve == null || (cofactor = curve.getCofactor()) == null || cofactor.compareTo(ECConstants.EIGHT) > 0 || (denominator = getDenominator(curve.getCoordinateSystem(), sumOfTwoMultiplies)) == null || denominator.isZero()) {
            return sumOfTwoMultiplies.normalize().getAffineXCoord().toBigInteger().mod(n10).equals(bigInteger);
        }
        ECFieldElement xCoord = sumOfTwoMultiplies.getXCoord();
        while (curve.isValidFieldElement(bigInteger)) {
            if (curve.fromBigInteger(bigInteger).multiply(denominator).equals(xCoord)) {
                return true;
            }
            bigInteger = bigInteger.add(n10);
        }
        return false;
    }

    public ECDSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
