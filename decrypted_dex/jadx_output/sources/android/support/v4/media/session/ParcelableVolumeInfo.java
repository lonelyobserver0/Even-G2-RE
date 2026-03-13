package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public int f9367a;

    /* renamed from: b, reason: collision with root package name */
    public int f9368b;

    /* renamed from: c, reason: collision with root package name */
    public int f9369c;

    /* renamed from: d, reason: collision with root package name */
    public int f9370d;

    /* renamed from: e, reason: collision with root package name */
    public int f9371e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f9367a);
        parcel.writeInt(this.f9369c);
        parcel.writeInt(this.f9370d);
        parcel.writeInt(this.f9371e);
        parcel.writeInt(this.f9368b);
    }
}
