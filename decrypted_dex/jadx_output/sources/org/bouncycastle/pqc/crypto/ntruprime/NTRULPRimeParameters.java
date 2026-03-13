package org.bouncycastle.pqc.crypto.ntruprime;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NTRULPRimeParameters implements CipherParameters {
    private final int delta;
    private final String name;

    /* renamed from: p, reason: collision with root package name */
    private final int f19453p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;

    /* renamed from: q, reason: collision with root package name */
    private final int f19454q;
    private final int roundedPolynomialBytes;
    private final int sharedKeyBytes;
    private final int tau0;
    private final int tau1;
    private final int tau2;
    private final int tau3;

    /* renamed from: w, reason: collision with root package name */
    private final int f19455w;
    public static final NTRULPRimeParameters ntrulpr653 = new NTRULPRimeParameters(StubApp.getString2(34054), 653, 4621, 252, 289, 2175, 113, 2031, 290, 865, 897, 1125, 16);
    public static final NTRULPRimeParameters ntrulpr761 = new NTRULPRimeParameters(StubApp.getString2(34055), 761, 4591, 250, 292, 2156, 114, 2007, 287, 1007, 1039, 1294, 16);
    public static final NTRULPRimeParameters ntrulpr857 = new NTRULPRimeParameters(StubApp.getString2(34056), 857, 5167, 281, 329, 2433, 101, 2265, 324, 1152, 1184, 1463, 16);
    public static final NTRULPRimeParameters ntrulpr953 = new NTRULPRimeParameters(StubApp.getString2(34057), 953, 6343, 345, 404, 2997, 82, 2798, 400, 1317, 1349, 1652, 24);
    public static final NTRULPRimeParameters ntrulpr1013 = new NTRULPRimeParameters(StubApp.getString2(34058), 1013, 7177, 392, 450, 3367, 73, 3143, 449, 1423, 1455, 1773, 24);
    public static final NTRULPRimeParameters ntrulpr1277 = new NTRULPRimeParameters(StubApp.getString2(34059), 1277, 7879, 429, 502, 3724, 66, 3469, 496, 1815, 1847, 2231, 32);

    private NTRULPRimeParameters(String str, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.name = str;
        this.f19453p = i3;
        this.f19454q = i10;
        this.f19455w = i11;
        this.delta = i12;
        this.tau0 = i13;
        this.tau1 = i14;
        this.tau2 = i15;
        this.tau3 = i16;
        this.roundedPolynomialBytes = i17;
        this.publicKeyBytes = i18;
        this.privateKeyBytes = i19;
        this.sharedKeyBytes = i20;
    }

    public int getDelta() {
        return this.delta;
    }

    public String getName() {
        return this.name;
    }

    public int getP() {
        return this.f19453p;
    }

    public int getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getQ() {
        return this.f19454q;
    }

    public int getRoundedPolynomialBytes() {
        return this.roundedPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getTau0() {
        return this.tau0;
    }

    public int getTau1() {
        return this.tau1;
    }

    public int getTau2() {
        return this.tau2;
    }

    public int getTau3() {
        return this.tau3;
    }

    public int getW() {
        return this.f19455w;
    }
}
