package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: G, reason: collision with root package name */
    private ECPoint f19159G;
    private ECCurve curve;

    /* renamed from: h, reason: collision with root package name */
    private BigInteger f19160h;

    /* renamed from: n, reason: collision with root package name */
    private BigInteger f19161n;
    private byte[] seed;

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this.curve = eCCurve;
        this.f19159G = eCPoint.normalize();
        this.f19161n = bigInteger;
        this.f19160h = BigInteger.valueOf(1L);
        this.seed = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ECParameterSpec)) {
            return false;
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
        return getCurve().equals(eCParameterSpec.getCurve()) && getG().equals(eCParameterSpec.getG());
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f19159G;
    }

    public BigInteger getH() {
        return this.f19160h;
    }

    public BigInteger getN() {
        return this.f19161n;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this.curve = eCCurve;
        this.f19159G = eCPoint.normalize();
        this.f19161n = bigInteger;
        this.f19160h = bigInteger2;
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f19159G = eCPoint.normalize();
        this.f19161n = bigInteger;
        this.f19160h = bigInteger2;
        this.seed = bArr;
    }
}
