package org.bouncycastle.crypto.kems;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECIESKEMGenerator implements EncapsulatedSecretGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private boolean CofactorMode;
    private boolean OldCofactorMode;
    private boolean SingleHashMode;
    private DerivationFunction kdf;
    private final int keySize;
    private SecureRandom rnd;

    public ECIESKEMGenerator(int i3, DerivationFunction derivationFunction, SecureRandom secureRandom) {
        this.keySize = i3;
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
        this.CofactorMode = false;
        this.OldCofactorMode = false;
        this.SingleHashMode = false;
    }

    private ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    public static byte[] deriveKey(boolean z2, DerivationFunction derivationFunction, int i3, byte[] bArr, byte[] bArr2) {
        if (!z2) {
            byte[] concatenate = Arrays.concatenate(bArr, bArr2);
            Arrays.fill(bArr2, (byte) 0);
            bArr2 = concatenate;
        }
        try {
            derivationFunction.init(new KDFParameters(bArr2, null));
            byte[] bArr3 = new byte[i3];
            derivationFunction.generateBytes(bArr3, 0, i3);
            return bArr3;
        } finally {
            Arrays.fill(bArr2, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        if (!(asymmetricKeyParameter instanceof ECKeyParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(29007));
        }
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricKeyParameter;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(StubApp.getString2(29006), ConstraintUtils.bitsOfSecurityFor(eCPublicKeyParameters.getParameters().getCurve()), asymmetricKeyParameter, CryptoServicePurpose.ENCRYPTION));
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        ECCurve curve = parameters.getCurve();
        BigInteger n10 = parameters.getN();
        BigInteger h2 = parameters.getH();
        BigInteger createRandomInRange = BigIntegers.createRandomInRange(ONE, n10, this.rnd);
        ECPoint[] eCPointArr = {createBasePointMultiplier().multiply(parameters.getG(), createRandomInRange), eCPublicKeyParameters.getQ().multiply(this.OldCofactorMode ? createRandomInRange.multiply(h2).mod(n10) : createRandomInRange)};
        curve.normalizeAll(eCPointArr);
        ECPoint eCPoint = eCPointArr[0];
        ECPoint eCPoint2 = eCPointArr[1];
        byte[] encoded = eCPoint.getEncoded(false);
        byte[] bArr = new byte[encoded.length];
        System.arraycopy(encoded, 0, bArr, 0, encoded.length);
        return new SecretWithEncapsulationImpl(deriveKey(this.SingleHashMode, this.kdf, this.keySize, encoded, eCPoint2.getAffineXCoord().getEncoded()), bArr);
    }

    public ECIESKEMGenerator(int i3, DerivationFunction derivationFunction, SecureRandom secureRandom, boolean z2, boolean z10, boolean z11) {
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
        this.keySize = i3;
        this.CofactorMode = z2;
        if (z2) {
            this.OldCofactorMode = false;
        } else {
            this.OldCofactorMode = z10;
        }
        this.SingleHashMode = z11;
    }
}
