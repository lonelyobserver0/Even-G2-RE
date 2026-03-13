package oa;

import com.stub.StubApp;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i extends l {

    /* renamed from: c, reason: collision with root package name */
    public static final i[] f18411c = new i[357];

    /* renamed from: d, reason: collision with root package name */
    public static final i f18412d = H(0);

    /* renamed from: e, reason: collision with root package name */
    public static final i f18413e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f18414f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f18415g;

    /* renamed from: a, reason: collision with root package name */
    public final long f18416a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18417b;

    static {
        H(1L);
        H(2L);
        f18413e = H(3L);
        f18414f = new i(LongCompanionObject.MAX_VALUE, false);
        f18415g = new i(Long.MIN_VALUE, false);
    }

    public i(long j, boolean z2) {
        this.f18416a = j;
        this.f18417b = z2;
    }

    public static i H(long j) {
        if (-100 > j || j > 256) {
            return new i(j, true);
        }
        int i3 = ((int) j) + 100;
        i[] iVarArr = f18411c;
        if (iVarArr[i3] == null) {
            iVarArr[i3] = new i(j, true);
        }
        return iVarArr[i3];
    }

    @Override // oa.l
    public final int F() {
        return (int) this.f18416a;
    }

    @Override // oa.l
    public final long G() {
        return this.f18416a;
    }

    @Override // oa.l
    public final float a() {
        return this.f18416a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && ((int) ((i) obj).f18416a) == ((int) this.f18416a);
    }

    public final int hashCode() {
        long j = this.f18416a;
        return (int) (j ^ (j >> 32));
    }

    public final String toString() {
        return Xa.h.q(new StringBuilder(StubApp.getString2(21631)), this.f18416a, StubApp.getString2(265));
    }
}
