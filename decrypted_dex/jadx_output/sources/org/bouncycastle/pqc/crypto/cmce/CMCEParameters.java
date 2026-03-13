package org.bouncycastle.pqc.crypto.cmce;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMCEParameters implements CipherParameters {
    public static final CMCEParameters mceliece348864fr3;
    public static final CMCEParameters mceliece348864r3;
    private static int[] poly3488;
    private final int defaultKeySize;
    private final CMCEEngine engine;

    /* renamed from: m, reason: collision with root package name */
    private final int f19369m;

    /* renamed from: n, reason: collision with root package name */
    private final int f19370n;
    private final String name;

    /* renamed from: t, reason: collision with root package name */
    private final int f19371t;
    private final boolean usePivots;
    private static int[] poly4608 = {10, 9, 6, 0};
    private static int[] poly6688 = {7, 2, 1, 0};
    private static int[] poly6960 = {8, 0};
    private static int[] poly8192 = {7, 2, 1, 0};
    public static final CMCEParameters mceliece460896r3 = new CMCEParameters(StubApp.getString2(33961), 13, 4608, 96, poly4608, false, 192);
    public static final CMCEParameters mceliece460896fr3 = new CMCEParameters(StubApp.getString2(33962), 13, 4608, 96, poly4608, true, 192);
    public static final CMCEParameters mceliece6688128r3 = new CMCEParameters(StubApp.getString2(33963), 13, 6688, 128, poly6688, false, 256);
    public static final CMCEParameters mceliece6688128fr3 = new CMCEParameters(StubApp.getString2(33964), 13, 6688, 128, poly6688, true, 256);
    public static final CMCEParameters mceliece6960119r3 = new CMCEParameters(StubApp.getString2(33965), 13, 6960, 119, poly6960, false, 256);
    public static final CMCEParameters mceliece6960119fr3 = new CMCEParameters(StubApp.getString2(33966), 13, 6960, 119, poly6960, true, 256);
    public static final CMCEParameters mceliece8192128r3 = new CMCEParameters(StubApp.getString2(33967), 13, 8192, 128, poly8192, false, 256);
    public static final CMCEParameters mceliece8192128fr3 = new CMCEParameters(StubApp.getString2(33968), 13, 8192, 128, poly8192, true, 256);

    static {
        int[] iArr = {3, 1, 0};
        poly3488 = iArr;
        mceliece348864r3 = new CMCEParameters(StubApp.getString2(33959), 12, 3488, 64, iArr, false, 128);
        mceliece348864fr3 = new CMCEParameters(StubApp.getString2(33960), 12, 3488, 64, poly3488, true, 128);
    }

    private CMCEParameters(String str, int i3, int i10, int i11, int[] iArr, boolean z2, int i12) {
        this.name = str;
        this.f19369m = i3;
        this.f19370n = i10;
        this.f19371t = i11;
        this.usePivots = z2;
        this.defaultKeySize = i12;
        this.engine = new CMCEEngine(i3, i10, i11, iArr, z2, i12);
    }

    public CMCEEngine getEngine() {
        return this.engine;
    }

    public int getM() {
        return this.f19369m;
    }

    public int getMu() {
        return this.usePivots ? 32 : 0;
    }

    public int getN() {
        return this.f19370n;
    }

    public String getName() {
        return this.name;
    }

    public int getNu() {
        return this.usePivots ? 64 : 0;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.f19371t;
    }
}
