package org.bouncycastle.crypto.agreement.jpake;

import com.stub.StubApp;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JPAKEPrimeOrderGroup {

    /* renamed from: g, reason: collision with root package name */
    private final BigInteger f18743g;

    /* renamed from: p, reason: collision with root package name */
    private final BigInteger f18744p;

    /* renamed from: q, reason: collision with root package name */
    private final BigInteger f18745q;

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }

    public BigInteger getG() {
        return this.f18743g;
    }

    public BigInteger getP() {
        return this.f18744p;
    }

    public BigInteger getQ() {
        return this.f18745q;
    }

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z2) {
        JPAKEUtil.validateNotNull(bigInteger, StubApp.getString2(2372));
        JPAKEUtil.validateNotNull(bigInteger2, StubApp.getString2(1573));
        JPAKEUtil.validateNotNull(bigInteger3, StubApp.getString2(4932));
        if (!z2) {
            BigInteger bigInteger4 = JPAKEUtil.ONE;
            if (!bigInteger.subtract(bigInteger4).mod(bigInteger2).equals(JPAKEUtil.ZERO)) {
                throw new IllegalArgumentException(StubApp.getString2(28410));
            }
            if (bigInteger3.compareTo(BigInteger.valueOf(2L)) == -1 || bigInteger3.compareTo(bigInteger.subtract(bigInteger4)) == 1) {
                throw new IllegalArgumentException(StubApp.getString2(28409));
            }
            if (!bigInteger3.modPow(bigInteger2, bigInteger).equals(bigInteger4)) {
                throw new IllegalArgumentException(StubApp.getString2(28408));
            }
            if (!bigInteger.isProbablePrime(20)) {
                throw new IllegalArgumentException(StubApp.getString2(28407));
            }
            if (!bigInteger2.isProbablePrime(20)) {
                throw new IllegalArgumentException(StubApp.getString2(28406));
            }
        }
        this.f18744p = bigInteger;
        this.f18745q = bigInteger2;
        this.f18743g = bigInteger3;
    }
}
