package android.support.v4.media;

import B0.s;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new s(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f9351a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f9352b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f9353c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f9354d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f9355e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f9356f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f9357g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f9358h;
    public MediaDescription j;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f9351a = str;
        this.f9352b = charSequence;
        this.f9353c = charSequence2;
        this.f9354d = charSequence3;
        this.f9355e = bitmap;
        this.f9356f = uri;
        this.f9357g = bundle;
        this.f9358h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f9352b) + ", " + ((Object) this.f9353c) + ", " + ((Object) this.f9354d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        MediaDescription mediaDescription = this.j;
        if (mediaDescription == null) {
            MediaDescription.Builder b2 = a.b();
            a.n(b2, this.f9351a);
            a.p(b2, this.f9352b);
            a.o(b2, this.f9353c);
            a.j(b2, this.f9354d);
            a.l(b2, this.f9355e);
            a.m(b2, this.f9356f);
            a.k(b2, this.f9357g);
            b.b(b2, this.f9358h);
            mediaDescription = a.a(b2);
            this.j = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i3);
    }
}
