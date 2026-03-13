package s0;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import j1.C1081j;
import o0.z;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements z {
    public static final Parcelable.Creator<d> CREATOR = new C1081j(26);

    /* renamed from: a, reason: collision with root package name */
    public final float f20595a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20596b;

    public d(float f10, float f11) {
        AbstractC1550k.b(StubApp.getString2(23027), f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f20595a = f10;
        this.f20596b = f11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f20595a == dVar.f20595a && this.f20596b == dVar.f20596b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f20596b).hashCode() + ((Float.valueOf(this.f20595a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return StubApp.getString2(23028) + this.f20595a + StubApp.getString2(7065) + this.f20596b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(this.f20595a);
        parcel.writeFloat(this.f20596b);
    }

    public d(Parcel parcel) {
        this.f20595a = parcel.readFloat();
        this.f20596b = parcel.readFloat();
    }
}
