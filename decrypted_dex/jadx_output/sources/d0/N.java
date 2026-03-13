package d0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new com.google.android.material.datepicker.l(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f13183a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f13184b;

    /* renamed from: c, reason: collision with root package name */
    public C0772b[] f13185c;

    /* renamed from: d, reason: collision with root package name */
    public int f13186d;

    /* renamed from: e, reason: collision with root package name */
    public String f13187e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f13188f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f13189g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f13190h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f13183a);
        parcel.writeStringList(this.f13184b);
        parcel.writeTypedArray(this.f13185c, i3);
        parcel.writeInt(this.f13186d);
        parcel.writeString(this.f13187e);
        parcel.writeStringList(this.f13188f);
        parcel.writeTypedList(this.f13189g);
        parcel.writeTypedList(this.f13190h);
    }
}
