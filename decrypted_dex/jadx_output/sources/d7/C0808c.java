package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.l;
import com.stub.StubApp;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: d7.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0808c implements Parcelable {
    public static final Parcelable.Creator<C0808c> CREATOR = new l(7);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13450a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13451b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13452c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13453d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13454e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13455f;

    /* renamed from: g, reason: collision with root package name */
    public final float f13456g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13457h;

    public C0808c(boolean z2, int i3, int i10, float f10, float f11, float f12, float f13, boolean z10) {
        this.f13450a = z2;
        this.f13451b = i3;
        this.f13452c = i10;
        this.f13453d = f10;
        this.f13454e = f11;
        this.f13455f = f12;
        this.f13456g = f13;
        this.f13457h = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0808c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.attribution.generated.AttributionSettings");
        C0808c c0808c = (C0808c) obj;
        return this.f13450a == c0808c.f13450a && this.f13451b == c0808c.f13451b && this.f13452c == c0808c.f13452c && Float.compare(this.f13453d, c0808c.f13453d) == 0 && Float.compare(this.f13454e, c0808c.f13454e) == 0 && Float.compare(this.f13455f, c0808c.f13455f) == 0 && Float.compare(this.f13456g, c0808c.f13456g) == 0 && this.f13457h == c0808c.f13457h;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f13450a), Integer.valueOf(this.f13451b), Integer.valueOf(this.f13452c), Float.valueOf(this.f13453d), Float.valueOf(this.f13454e), Float.valueOf(this.f13455f), Float.valueOf(this.f13456g), Boolean.valueOf(this.f13457h));
    }

    public final String toString() {
        return StringsKt.trimIndent(StubApp.getString2(16828) + this.f13450a + StubApp.getString2(16829) + this.f13451b + StubApp.getString2(16830) + this.f13452c + StubApp.getString2(16831) + this.f13453d + StubApp.getString2(16832) + this.f13454e + StubApp.getString2(16833) + this.f13455f + StubApp.getString2(16834) + this.f13456g + StubApp.getString2(16835) + this.f13457h + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i3) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f13450a ? 1 : 0);
        out.writeInt(this.f13451b);
        out.writeInt(this.f13452c);
        out.writeFloat(this.f13453d);
        out.writeFloat(this.f13454e);
        out.writeFloat(this.f13455f);
        out.writeFloat(this.f13456g);
        out.writeInt(this.f13457h ? 1 : 0);
    }
}
