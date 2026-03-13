package La;

import B0.s;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new s(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f4379a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4380b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4381c;

    public a(String str, float f10, float f11) {
        this.f4379a = str;
        this.f4380b = f10;
        this.f4381c = f11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f4379a);
        parcel.writeFloat(this.f4380b);
        parcel.writeFloat(this.f4381c);
    }

    public a(Parcel parcel) {
        this.f4379a = parcel.readString();
        this.f4380b = parcel.readFloat();
        this.f4381c = parcel.readFloat();
    }
}
