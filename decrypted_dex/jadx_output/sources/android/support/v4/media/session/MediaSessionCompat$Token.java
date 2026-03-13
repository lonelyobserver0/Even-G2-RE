package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final Object f9365a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f9366b;

    public MediaSessionCompat$Token(Parcelable parcelable) {
        this.f9366b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Parcelable parcelable = this.f9366b;
        if (parcelable == null) {
            return mediaSessionCompat$Token.f9366b == null;
        }
        Parcelable parcelable2 = mediaSessionCompat$Token.f9366b;
        if (parcelable2 == null) {
            return false;
        }
        return parcelable.equals(parcelable2);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f9366b;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f9366b, i3);
    }
}
