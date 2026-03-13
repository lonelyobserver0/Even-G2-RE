package d0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new com.google.android.material.datepicker.l(3);

    /* renamed from: a, reason: collision with root package name */
    public String f13137a;

    /* renamed from: b, reason: collision with root package name */
    public int f13138b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f13137a);
        parcel.writeInt(this.f13138b);
    }
}
