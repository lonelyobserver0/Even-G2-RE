package org.bouncycastle.pqc.crypto.ntruprime;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SNTRUPrimeParameters implements CipherParameters {
    private final String name;

    /* renamed from: p, reason: collision with root package name */
    private final int f19456p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;

    /* renamed from: q, reason: collision with root package name */
    private final int f19457q;
    private final int roundedPolynomialBytes;
    private final int rqPolynomialBytes;
    private final int sharedKeyBytes;

    /* renamed from: w, reason: collision with root package name */
    private final int f19458w;
    public static final SNTRUPrimeParameters sntrup653 = new SNTRUPrimeParameters(StubApp.getString2(34060), 653, 4621, 288, 994, 865, 994, 1518, 16);
    public static final SNTRUPrimeParameters sntrup761 = new SNTRUPrimeParameters(StubApp.getString2(34061), 761, 4591, 286, 1158, 1007, 1158, 1763, 16);
    public static final SNTRUPrimeParameters sntrup857 = new SNTRUPrimeParameters(StubApp.getString2(34062), 857, 5167, 322, 1322, 1152, 1322, 1999, 16);
    public static final SNTRUPrimeParameters sntrup953 = new SNTRUPrimeParameters(StubApp.getString2(34063), 953, 6343, 396, 1505, 1317, 1505, 2254, 24);
    public static final SNTRUPrimeParameters sntrup1013 = new SNTRUPrimeParameters(StubApp.getString2(34064), 1013, 7177, 448, 1623, 1423, 1623, 2417, 24);
    public static final SNTRUPrimeParameters sntrup1277 = new SNTRUPrimeParameters(StubApp.getString2(34065), 1277, 7879, 492, 2067, 1815, 2067, 3059, 32);

    private SNTRUPrimeParameters(String str, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.name = str;
        this.f19456p = i3;
        this.f19457q = i10;
        this.f19458w = i11;
        this.rqPolynomialBytes = i12;
        this.roundedPolynomialBytes = i13;
        this.publicKeyBytes = i14;
        this.privateKeyBytes = i15;
        this.sharedKeyBytes = i16;
    }

    public String getName() {
        return this.name;
    }

    public int getP() {
        return this.f19456p;
    }

    public int getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getQ() {
        return this.f19457q;
    }

    public int getRoundedPolynomialBytes() {
        return this.roundedPolynomialBytes;
    }

    public int getRqPolynomialBytes() {
        return this.rqPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getW() {
        return this.f19458w;
    }
}
