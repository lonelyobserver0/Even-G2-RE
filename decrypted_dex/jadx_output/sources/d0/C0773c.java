package d0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0773c implements Parcelable {
    public static final Parcelable.Creator<C0773c> CREATOR = new com.google.android.material.datepicker.l(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13285a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13286b;

    public C0773c(Parcel parcel) {
        this.f13285a = parcel.createStringArrayList();
        this.f13286b = parcel.createTypedArrayList(C0772b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f13285a);
        parcel.writeTypedList(this.f13286b);
    }
}
