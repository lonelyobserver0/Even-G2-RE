package j7;

import X6.t;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.ScreenCoordinate;
import com.stub.StubApp;
import j1.C1081j;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: j7.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1094b implements Parcelable {
    public static final Parcelable.Creator<C1094b> CREATOR = new C1081j(1);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15358a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15359b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15360c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15361d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15362e;

    /* renamed from: f, reason: collision with root package name */
    public final t f15363f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15364g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15365h;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final ScreenCoordinate f15366k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f15367l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f15368m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f15369n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f15370p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15371q;

    /* renamed from: r, reason: collision with root package name */
    public final float f15372r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f15373s;

    public C1094b(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, t tVar, boolean z14, boolean z15, boolean z16, ScreenCoordinate screenCoordinate, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, float f10, boolean z22) {
        this.f15358a = z2;
        this.f15359b = z10;
        this.f15360c = z11;
        this.f15361d = z12;
        this.f15362e = z13;
        this.f15363f = tVar;
        this.f15364g = z14;
        this.f15365h = z15;
        this.j = z16;
        this.f15366k = screenCoordinate;
        this.f15367l = z17;
        this.f15368m = z18;
        this.f15369n = z19;
        this.f15370p = z20;
        this.f15371q = z21;
        this.f15372r = f10;
        this.f15373s = z22;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1094b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.gestures.generated.GesturesSettings");
        C1094b c1094b = (C1094b) obj;
        return this.f15358a == c1094b.f15358a && this.f15359b == c1094b.f15359b && this.f15360c == c1094b.f15360c && this.f15361d == c1094b.f15361d && this.f15362e == c1094b.f15362e && this.f15363f == c1094b.f15363f && this.f15364g == c1094b.f15364g && this.f15365h == c1094b.f15365h && this.j == c1094b.j && Intrinsics.areEqual(this.f15366k, c1094b.f15366k) && this.f15367l == c1094b.f15367l && this.f15368m == c1094b.f15368m && this.f15369n == c1094b.f15369n && this.f15370p == c1094b.f15370p && this.f15371q == c1094b.f15371q && Float.compare(this.f15372r, c1094b.f15372r) == 0 && this.f15373s == c1094b.f15373s;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f15358a), Boolean.valueOf(this.f15359b), Boolean.valueOf(this.f15360c), Boolean.valueOf(this.f15361d), Boolean.valueOf(this.f15362e), this.f15363f, Boolean.valueOf(this.f15364g), Boolean.valueOf(this.f15365h), Boolean.valueOf(this.j), this.f15366k, Boolean.valueOf(this.f15367l), Boolean.valueOf(this.f15368m), Boolean.valueOf(this.f15369n), Boolean.valueOf(this.f15370p), Boolean.valueOf(this.f15371q), Float.valueOf(this.f15372r), Boolean.valueOf(this.f15373s));
    }

    public final String toString() {
        return StringsKt.trimIndent(StubApp.getString2(19041) + this.f15358a + StubApp.getString2(19042) + this.f15359b + StubApp.getString2(19043) + this.f15360c + StubApp.getString2(19044) + this.f15361d + StubApp.getString2(19045) + this.f15362e + StubApp.getString2(19046) + this.f15363f + StubApp.getString2(19047) + this.f15364g + StubApp.getString2(19048) + this.f15365h + StubApp.getString2(19049) + this.j + StubApp.getString2(19050) + this.f15366k + StubApp.getString2(19051) + this.f15367l + StubApp.getString2(19052) + this.f15368m + StubApp.getString2(19053) + this.f15369n + StubApp.getString2(19054) + this.f15370p + StubApp.getString2(19055) + this.f15371q + StubApp.getString2(19056) + this.f15372r + StubApp.getString2(19057) + this.f15373s + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i3) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f15358a ? 1 : 0);
        out.writeInt(this.f15359b ? 1 : 0);
        out.writeInt(this.f15360c ? 1 : 0);
        out.writeInt(this.f15361d ? 1 : 0);
        out.writeInt(this.f15362e ? 1 : 0);
        out.writeString(this.f15363f.name());
        out.writeInt(this.f15364g ? 1 : 0);
        out.writeInt(this.f15365h ? 1 : 0);
        out.writeInt(this.j ? 1 : 0);
        out.writeSerializable(this.f15366k);
        out.writeInt(this.f15367l ? 1 : 0);
        out.writeInt(this.f15368m ? 1 : 0);
        out.writeInt(this.f15369n ? 1 : 0);
        out.writeInt(this.f15370p ? 1 : 0);
        out.writeInt(this.f15371q ? 1 : 0);
        out.writeFloat(this.f15372r);
        out.writeInt(this.f15373s ? 1 : 0);
    }
}
