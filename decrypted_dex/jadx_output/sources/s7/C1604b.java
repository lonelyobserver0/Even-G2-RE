package s7;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import j1.C1081j;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: s7.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1604b implements Parcelable {
    public static final Parcelable.Creator<C1604b> CREATOR = new C1081j(28);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20795a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20796b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20797c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20798d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20799e;

    /* renamed from: f, reason: collision with root package name */
    public final float f20800f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20801g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20802h;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final float f20803k;

    /* renamed from: l, reason: collision with root package name */
    public final float f20804l;

    /* renamed from: m, reason: collision with root package name */
    public final float f20805m;

    /* renamed from: n, reason: collision with root package name */
    public final float f20806n;

    /* renamed from: p, reason: collision with root package name */
    public final float f20807p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f20808q;

    /* renamed from: r, reason: collision with root package name */
    public final long f20809r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f20810s;

    /* renamed from: t, reason: collision with root package name */
    public final float f20811t;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f20812v;

    public C1604b(boolean z2, int i3, float f10, float f11, float f12, float f13, int i10, int i11, int i12, float f14, float f15, float f16, float f17, float f18, boolean z10, long j, boolean z11, float f19, boolean z12) {
        this.f20795a = z2;
        this.f20796b = i3;
        this.f20797c = f10;
        this.f20798d = f11;
        this.f20799e = f12;
        this.f20800f = f13;
        this.f20801g = i10;
        this.f20802h = i11;
        this.j = i12;
        this.f20803k = f14;
        this.f20804l = f15;
        this.f20805m = f16;
        this.f20806n = f17;
        this.f20807p = f18;
        this.f20808q = z10;
        this.f20809r = j;
        this.f20810s = z11;
        this.f20811t = f19;
        this.f20812v = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1604b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings");
        C1604b c1604b = (C1604b) obj;
        return this.f20795a == c1604b.f20795a && this.f20796b == c1604b.f20796b && Float.compare(this.f20797c, c1604b.f20797c) == 0 && Float.compare(this.f20798d, c1604b.f20798d) == 0 && Float.compare(this.f20799e, c1604b.f20799e) == 0 && Float.compare(this.f20800f, c1604b.f20800f) == 0 && this.f20801g == c1604b.f20801g && this.f20802h == c1604b.f20802h && this.j == c1604b.j && Float.compare(this.f20803k, c1604b.f20803k) == 0 && Float.compare(this.f20804l, c1604b.f20804l) == 0 && Float.compare(this.f20805m, c1604b.f20805m) == 0 && Float.compare(this.f20806n, c1604b.f20806n) == 0 && Float.compare(this.f20807p, c1604b.f20807p) == 0 && this.f20808q == c1604b.f20808q && this.f20809r == c1604b.f20809r && this.f20810s == c1604b.f20810s && Float.compare(this.f20811t, c1604b.f20811t) == 0 && this.f20812v == c1604b.f20812v;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f20795a), Integer.valueOf(this.f20796b), Float.valueOf(this.f20797c), Float.valueOf(this.f20798d), Float.valueOf(this.f20799e), Float.valueOf(this.f20800f), Integer.valueOf(this.f20801g), Integer.valueOf(this.f20802h), Integer.valueOf(this.j), Float.valueOf(this.f20803k), Float.valueOf(this.f20804l), Float.valueOf(this.f20805m), Float.valueOf(this.f20806n), Float.valueOf(this.f20807p), Boolean.valueOf(this.f20808q), Long.valueOf(this.f20809r), Boolean.valueOf(this.f20810s), Float.valueOf(this.f20811t), Boolean.valueOf(this.f20812v));
    }

    public final String toString() {
        return StringsKt.trimIndent(StubApp.getString2(23135) + this.f20795a + StubApp.getString2(6092) + this.f20796b + StubApp.getString2(17731) + this.f20797c + StubApp.getString2(16832) + this.f20798d + StubApp.getString2(16833) + this.f20799e + StubApp.getString2(16834) + this.f20800f + StubApp.getString2(12795) + this.f20801g + StubApp.getString2(23136) + this.f20802h + StubApp.getString2(23137) + this.j + StubApp.getString2(23138) + this.f20803k + StubApp.getString2(12893) + this.f20804l + StubApp.getString2(23139) + this.f20805m + StubApp.getString2(23140) + this.f20806n + StubApp.getString2(23141) + this.f20807p + StubApp.getString2(23142) + this.f20808q + StubApp.getString2(23143) + this.f20809r + StubApp.getString2(23144) + this.f20810s + StubApp.getString2(23145) + this.f20811t + StubApp.getString2(23146) + this.f20812v + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i3) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f20795a ? 1 : 0);
        out.writeInt(this.f20796b);
        out.writeFloat(this.f20797c);
        out.writeFloat(this.f20798d);
        out.writeFloat(this.f20799e);
        out.writeFloat(this.f20800f);
        out.writeInt(this.f20801g);
        out.writeInt(this.f20802h);
        out.writeInt(this.j);
        out.writeFloat(this.f20803k);
        out.writeFloat(this.f20804l);
        out.writeFloat(this.f20805m);
        out.writeFloat(this.f20806n);
        out.writeFloat(this.f20807p);
        out.writeInt(this.f20808q ? 1 : 0);
        out.writeLong(this.f20809r);
        out.writeInt(this.f20810s ? 1 : 0);
        out.writeFloat(this.f20811t);
        out.writeInt(this.f20812v ? 1 : 0);
    }
}
