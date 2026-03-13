package androidx.versionedparcelable;

import B0.s;
import V1.b;
import V1.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new s(17);

    /* renamed from: a, reason: collision with root package name */
    public final c f10345a;

    public ParcelImpl(Parcel parcel) {
        this.f10345a = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new b(parcel).l(this.f10345a);
    }
}
