package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {
    private BigInteger dP;
    private BigInteger dQ;

    /* renamed from: e, reason: collision with root package name */
    private BigInteger f19104e;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f19105p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f19106q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8, false);
    }

    public BigInteger getDP() {
        return this.dP;
    }

    public BigInteger getDQ() {
        return this.dQ;
    }

    public BigInteger getP() {
        return this.f19105p;
    }

    public BigInteger getPublicExponent() {
        return this.f19104e;
    }

    public BigInteger getQ() {
        return this.f19106q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8, boolean z2) {
        super(true, bigInteger, bigInteger3, z2);
        this.f19104e = bigInteger2;
        this.f19105p = bigInteger4;
        this.f19106q = bigInteger5;
        this.dP = bigInteger6;
        this.dQ = bigInteger7;
        this.qInv = bigInteger8;
    }
}
