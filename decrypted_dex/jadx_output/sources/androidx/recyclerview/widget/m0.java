package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new B0.s(26);

    /* renamed from: a, reason: collision with root package name */
    public int f10214a;

    /* renamed from: b, reason: collision with root package name */
    public int f10215b;

    /* renamed from: c, reason: collision with root package name */
    public int f10216c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f10217d;

    /* renamed from: e, reason: collision with root package name */
    public int f10218e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f10219f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f10220g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10221h;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10222k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f10214a);
        parcel.writeInt(this.f10215b);
        parcel.writeInt(this.f10216c);
        if (this.f10216c > 0) {
            parcel.writeIntArray(this.f10217d);
        }
        parcel.writeInt(this.f10218e);
        if (this.f10218e > 0) {
            parcel.writeIntArray(this.f10219f);
        }
        parcel.writeInt(this.f10221h ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.f10222k ? 1 : 0);
        parcel.writeList(this.f10220g);
    }
}
