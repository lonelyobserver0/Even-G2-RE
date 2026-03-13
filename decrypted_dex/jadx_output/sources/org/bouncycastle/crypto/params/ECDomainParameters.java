package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECDomainParameters implements ECConstants {

    /* renamed from: G, reason: collision with root package name */
    private final ECPoint f19082G;
    private final ECCurve curve;

    /* renamed from: h, reason: collision with root package name */
    private final BigInteger f19083h;
    private BigInteger hInv;

    /* renamed from: n, reason: collision with root package name */
    private final BigInteger f19084n;
    private final byte[] seed;

    public ECDomainParameters(X9ECParameters x9ECParameters) {
        this(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }

    public static ECPoint validatePublicPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCPoint == null) {
            throw new NullPointerException(StubApp.getString2(29204));
        }
        ECPoint normalize = ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
        if (normalize.isInfinity()) {
            throw new IllegalArgumentException(StubApp.getString2(29203));
        }
        if (normalize.isValid()) {
            return normalize;
        }
        throw new IllegalArgumentException(StubApp.getString2(29202));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.curve.equals(eCDomainParameters.curve) && this.f19082G.equals(eCDomainParameters.f19082G) && this.f19084n.equals(eCDomainParameters.f19084n);
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f19082G;
    }

    public BigInteger getH() {
        return this.f19083h;
    }

    public synchronized BigInteger getHInv() {
        try {
            if (this.hInv == null) {
                this.hInv = BigIntegers.modOddInverseVar(this.f19084n, this.f19083h);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hInv;
    }

    public BigInteger getN() {
        return this.f19084n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return ((((this.curve.hashCode() ^ 1028) * 257) ^ this.f19082G.hashCode()) * 257) ^ this.f19084n.hashCode();
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException(StubApp.getString2(29206));
        }
        if (bigInteger.compareTo(ECConstants.ONE) < 0 || bigInteger.compareTo(getN()) >= 0) {
            throw new IllegalArgumentException(StubApp.getString2(29205));
        }
        return bigInteger;
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public ECPoint validatePublicPoint(ECPoint eCPoint) {
        return validatePublicPoint(getCurve(), eCPoint);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.hInv = null;
        if (eCCurve == null) {
            throw new NullPointerException(StubApp.getString2(29201));
        }
        if (bigInteger == null) {
            throw new NullPointerException(StubApp.getString2(1309));
        }
        this.curve = eCCurve;
        this.f19082G = validatePublicPoint(eCCurve, eCPoint);
        this.f19084n = bigInteger;
        this.f19083h = bigInteger2;
        this.seed = Arrays.clone(bArr);
    }
}
