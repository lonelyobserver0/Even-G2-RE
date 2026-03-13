package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import j1.C1081j;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: p7.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1496b implements Parcelable {
    public static final Parcelable.Creator<C1496b> CREATOR = new C1081j(24);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19712a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19713b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19714c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19715d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19716e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19717f;

    public C1496b(boolean z2, int i3, float f10, float f11, float f12, float f13) {
        this.f19712a = z2;
        this.f19713b = i3;
        this.f19714c = f10;
        this.f19715d = f11;
        this.f19716e = f12;
        this.f19717f = f13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1496b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.logo.generated.LogoSettings");
        C1496b c1496b = (C1496b) obj;
        return this.f19712a == c1496b.f19712a && this.f19713b == c1496b.f19713b && Float.compare(this.f19714c, c1496b.f19714c) == 0 && Float.compare(this.f19715d, c1496b.f19715d) == 0 && Float.compare(this.f19716e, c1496b.f19716e) == 0 && Float.compare(this.f19717f, c1496b.f19717f) == 0;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f19712a), Integer.valueOf(this.f19713b), Float.valueOf(this.f19714c), Float.valueOf(this.f19715d), Float.valueOf(this.f19716e), Float.valueOf(this.f19717f));
    }

    public final String toString() {
        return StringsKt.trimIndent(StubApp.getString2(22127) + this.f19712a + StubApp.getString2(6092) + this.f19713b + StubApp.getString2(17731) + this.f19714c + StubApp.getString2(16832) + this.f19715d + StubApp.getString2(16833) + this.f19716e + StubApp.getString2(16834) + this.f19717f + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i3) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f19712a ? 1 : 0);
        out.writeInt(this.f19713b);
        out.writeFloat(this.f19714c);
        out.writeFloat(this.f19715d);
        out.writeFloat(this.f19716e);
        out.writeFloat(this.f19717f);
    }
}
