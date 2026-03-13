package org.bouncycastle.math.ec.endo;

import E1.a;
import com.stub.StubApp;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ScalarSplitParameters {
    protected final int bits;

    /* renamed from: g1, reason: collision with root package name */
    protected final BigInteger f19275g1;

    /* renamed from: g2, reason: collision with root package name */
    protected final BigInteger f19276g2;
    protected final BigInteger v1A;
    protected final BigInteger v1B;
    protected final BigInteger v2A;
    protected final BigInteger v2B;

    public ScalarSplitParameters(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i3) {
        checkVector(bigIntegerArr, StubApp.getString2(32991));
        checkVector(bigIntegerArr2, StubApp.getString2(820));
        this.v1A = bigIntegerArr[0];
        this.v1B = bigIntegerArr[1];
        this.v2A = bigIntegerArr2[0];
        this.v2B = bigIntegerArr2[1];
        this.f19275g1 = bigInteger;
        this.f19276g2 = bigInteger2;
        this.bits = i3;
    }

    private static void checkVector(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(a.k(StubApp.getString2(620), str, StubApp.getString2(32992)));
        }
    }

    public int getBits() {
        return this.bits;
    }

    public BigInteger getG1() {
        return this.f19275g1;
    }

    public BigInteger getG2() {
        return this.f19276g2;
    }

    public BigInteger getV1A() {
        return this.v1A;
    }

    public BigInteger getV1B() {
        return this.v1B;
    }

    public BigInteger getV2A() {
        return this.v2A;
    }

    public BigInteger getV2B() {
        return this.v2B;
    }
}
