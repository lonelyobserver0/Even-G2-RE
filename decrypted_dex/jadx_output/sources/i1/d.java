package i1;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import h1.n;
import o0.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d implements z {
    public static final Parcelable.Creator<d> CREATOR = new n(5);

    /* renamed from: a, reason: collision with root package name */
    public final float f14713a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14714b;

    public d(float f10, int i3) {
        this.f14713a = f10;
        this.f14714b = i3;
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
            if (this.f14713a == dVar.f14713a && this.f14714b == dVar.f14714b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f14713a).hashCode() + 527) * 31) + this.f14714b;
    }

    public final String toString() {
        return StubApp.getString2(18459) + this.f14713a + StubApp.getString2(18460) + this.f14714b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(this.f14713a);
        parcel.writeInt(this.f14714b);
    }

    public d(Parcel parcel) {
        this.f14713a = parcel.readFloat();
        this.f14714b = parcel.readInt();
    }
}
