package f7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.l;
import com.mapbox.maps.ImageHolder;
import com.stub.StubApp;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: f7.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0931b implements Parcelable {
    public static final Parcelable.Creator<C0931b> CREATOR = new l(18);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14170b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14171c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14172d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14173e;

    /* renamed from: f, reason: collision with root package name */
    public final float f14174f;

    /* renamed from: g, reason: collision with root package name */
    public final float f14175g;

    /* renamed from: h, reason: collision with root package name */
    public final float f14176h;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14177k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14178l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageHolder f14179m;

    public C0931b(boolean z2, int i3, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11, boolean z12, ImageHolder imageHolder) {
        this.f14169a = z2;
        this.f14170b = i3;
        this.f14171c = f10;
        this.f14172d = f11;
        this.f14173e = f12;
        this.f14174f = f13;
        this.f14175g = f14;
        this.f14176h = f15;
        this.j = z10;
        this.f14177k = z11;
        this.f14178l = z12;
        this.f14179m = imageHolder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0931b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.compass.generated.CompassSettings");
        C0931b c0931b = (C0931b) obj;
        return this.f14169a == c0931b.f14169a && this.f14170b == c0931b.f14170b && Float.compare(this.f14171c, c0931b.f14171c) == 0 && Float.compare(this.f14172d, c0931b.f14172d) == 0 && Float.compare(this.f14173e, c0931b.f14173e) == 0 && Float.compare(this.f14174f, c0931b.f14174f) == 0 && Float.compare(this.f14175g, c0931b.f14175g) == 0 && Float.compare(this.f14176h, c0931b.f14176h) == 0 && this.j == c0931b.j && this.f14177k == c0931b.f14177k && this.f14178l == c0931b.f14178l && Intrinsics.areEqual(this.f14179m, c0931b.f14179m);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f14169a), Integer.valueOf(this.f14170b), Float.valueOf(this.f14171c), Float.valueOf(this.f14172d), Float.valueOf(this.f14173e), Float.valueOf(this.f14174f), Float.valueOf(this.f14175g), Float.valueOf(this.f14176h), Boolean.valueOf(this.j), Boolean.valueOf(this.f14177k), Boolean.valueOf(this.f14178l), this.f14179m);
    }

    public final String toString() {
        return StringsKt.trimIndent(StubApp.getString2(17730) + this.f14169a + StubApp.getString2(6092) + this.f14170b + StubApp.getString2(17731) + this.f14171c + StubApp.getString2(16832) + this.f14172d + StubApp.getString2(16833) + this.f14173e + StubApp.getString2(16834) + this.f14174f + StubApp.getString2(7253) + this.f14175g + StubApp.getString2(17732) + this.f14176h + StubApp.getString2(14597) + this.j + StubApp.getString2(17733) + this.f14177k + StubApp.getString2(16835) + this.f14178l + StubApp.getString2(13926) + this.f14179m + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i3) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f14169a ? 1 : 0);
        out.writeInt(this.f14170b);
        out.writeFloat(this.f14171c);
        out.writeFloat(this.f14172d);
        out.writeFloat(this.f14173e);
        out.writeFloat(this.f14174f);
        out.writeFloat(this.f14175g);
        out.writeFloat(this.f14176h);
        out.writeInt(this.j ? 1 : 0);
        out.writeInt(this.f14177k ? 1 : 0);
        out.writeInt(this.f14178l ? 1 : 0);
        ImageHolder imageHolder = this.f14179m;
        if (imageHolder == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageHolder.writeToParcel(out, i3);
        }
    }
}
