package n7;

import X6.f;
import X6.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import j1.C1081j;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: n7.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1393c implements Parcelable {
    public static final Parcelable.Creator<C1393c> CREATOR = new C1081j(15);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17866a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17868c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17869d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17870e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17871f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17872g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17873h;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f17874k;

    /* renamed from: l, reason: collision with root package name */
    public final s f17875l;

    /* renamed from: m, reason: collision with root package name */
    public final String f17876m;

    /* renamed from: n, reason: collision with root package name */
    public final f f17877n;

    public C1393c(boolean z2, boolean z10, int i3, float f10, boolean z11, int i10, int i11, String str, String str2, boolean z12, s sVar, String str3, f fVar) {
        this.f17866a = z2;
        this.f17867b = z10;
        this.f17868c = i3;
        this.f17869d = f10;
        this.f17870e = z11;
        this.f17871f = i10;
        this.f17872g = i11;
        this.f17873h = str;
        this.j = str2;
        this.f17874k = z12;
        this.f17875l = sVar;
        this.f17876m = str3;
        this.f17877n = fVar;
    }

    public final C1392b d() {
        f locationPuck = this.f17877n;
        C1392b c1392b = new C1392b(locationPuck);
        c1392b.f17855b = this.f17866a;
        c1392b.f17856c = this.f17867b;
        c1392b.f17857d = this.f17868c;
        c1392b.f17858e = this.f17869d;
        c1392b.f17859f = this.f17870e;
        c1392b.f17860g = this.f17871f;
        c1392b.f17861h = this.f17872g;
        c1392b.f17862i = this.f17873h;
        c1392b.j = this.j;
        c1392b.f17863k = this.f17874k;
        String string2 = StubApp.getString2(21446);
        s sVar = this.f17875l;
        Intrinsics.checkNotNullParameter(sVar, string2);
        c1392b.f17864l = sVar;
        c1392b.f17865m = this.f17876m;
        Intrinsics.checkNotNullParameter(locationPuck, "locationPuck");
        c1392b.f17854a = locationPuck;
        return c1392b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1393c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings");
        C1393c c1393c = (C1393c) obj;
        return this.f17866a == c1393c.f17866a && this.f17867b == c1393c.f17867b && this.f17868c == c1393c.f17868c && Float.compare(this.f17869d, c1393c.f17869d) == 0 && this.f17870e == c1393c.f17870e && this.f17871f == c1393c.f17871f && this.f17872g == c1393c.f17872g && Intrinsics.areEqual(this.f17873h, c1393c.f17873h) && Intrinsics.areEqual(this.j, c1393c.j) && this.f17874k == c1393c.f17874k && this.f17875l == c1393c.f17875l && Intrinsics.areEqual(this.f17876m, c1393c.f17876m) && Intrinsics.areEqual(this.f17877n, c1393c.f17877n);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f17866a), Boolean.valueOf(this.f17867b), Integer.valueOf(this.f17868c), Float.valueOf(this.f17869d), Boolean.valueOf(this.f17870e), Integer.valueOf(this.f17871f), Integer.valueOf(this.f17872g), this.f17873h, this.j, Boolean.valueOf(this.f17874k), this.f17875l, this.f17876m, this.f17877n);
    }

    public final String toString() {
        return StringsKt.trimIndent(StubApp.getString2(21447) + this.f17866a + StubApp.getString2(21448) + this.f17867b + StubApp.getString2(21449) + this.f17868c + StubApp.getString2(21450) + this.f17869d + StubApp.getString2(21451) + this.f17870e + StubApp.getString2(21452) + this.f17871f + StubApp.getString2(21453) + this.f17872g + StubApp.getString2(21454) + this.f17873h + StubApp.getString2(21455) + this.j + StubApp.getString2(21456) + this.f17874k + StubApp.getString2(21457) + this.f17875l + StubApp.getString2(21458) + this.f17876m + StubApp.getString2(21459) + this.f17877n + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i3) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f17866a ? 1 : 0);
        out.writeInt(this.f17867b ? 1 : 0);
        out.writeInt(this.f17868c);
        out.writeFloat(this.f17869d);
        out.writeInt(this.f17870e ? 1 : 0);
        out.writeInt(this.f17871f);
        out.writeInt(this.f17872g);
        out.writeString(this.f17873h);
        out.writeString(this.j);
        out.writeInt(this.f17874k ? 1 : 0);
        out.writeString(this.f17875l.name());
        out.writeString(this.f17876m);
        out.writeParcelable(this.f17877n, i3);
    }
}
