package android.support.v4.media;

import B0.s;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new s(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f9360a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9361b;

    public RatingCompat(float f10, int i3) {
        this.f9360a = i3;
        this.f9361b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f9360a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f9360a);
        sb2.append(" rating=");
        float f10 = this.f9361b;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f9360a);
        parcel.writeFloat(this.f9361b);
    }
}
