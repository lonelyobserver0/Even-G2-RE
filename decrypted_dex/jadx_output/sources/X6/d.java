package X6;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.ImageHolder;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends f {
    public static final Parcelable.Creator<d> CREATOR = new B0.s(18);

    /* renamed from: a, reason: collision with root package name */
    public final ImageHolder f8424a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageHolder f8425b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageHolder f8426c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8427d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8428e;

    public d(ImageHolder imageHolder, ImageHolder imageHolder2, ImageHolder imageHolder3, String str, float f10) {
        this.f8424a = imageHolder;
        this.f8425b = imageHolder2;
        this.f8426c = imageHolder3;
        this.f8427d = str;
        this.f8428e = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f8424a, dVar.f8424a) && Intrinsics.areEqual(this.f8425b, dVar.f8425b) && Intrinsics.areEqual(this.f8426c, dVar.f8426c) && Intrinsics.areEqual(this.f8427d, dVar.f8427d) && Float.compare(this.f8428e, dVar.f8428e) == 0;
    }

    public final int hashCode() {
        ImageHolder imageHolder = this.f8424a;
        int hashCode = (imageHolder == null ? 0 : imageHolder.hashCode()) * 31;
        ImageHolder imageHolder2 = this.f8425b;
        int hashCode2 = (hashCode + (imageHolder2 == null ? 0 : imageHolder2.hashCode())) * 31;
        ImageHolder imageHolder3 = this.f8426c;
        int hashCode3 = (hashCode2 + (imageHolder3 == null ? 0 : imageHolder3.hashCode())) * 31;
        String str = this.f8427d;
        return Float.hashCode(this.f8428e) + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(7249) + this.f8424a + StubApp.getString2(7250) + this.f8425b + StubApp.getString2(7251) + this.f8426c + StubApp.getString2(7252) + this.f8427d + StubApp.getString2(7253) + this.f8428e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i3) {
        Intrinsics.checkNotNullParameter(out, "out");
        ImageHolder imageHolder = this.f8424a;
        if (imageHolder == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageHolder.writeToParcel(out, i3);
        }
        ImageHolder imageHolder2 = this.f8425b;
        if (imageHolder2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageHolder2.writeToParcel(out, i3);
        }
        ImageHolder imageHolder3 = this.f8426c;
        if (imageHolder3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageHolder3.writeToParcel(out, i3);
        }
        out.writeString(this.f8427d);
        out.writeFloat(this.f8428e);
    }
}
