package android.support.v4.media.session;

import Xa.h;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f9372a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9373b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9374c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9375d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9376e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9377f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f9378g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9379h;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final long f9380k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f9381l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        public final String f9382a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f9383b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9384c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f9385d;

        public CustomAction(Parcel parcel) {
            this.f9382a = parcel.readString();
            this.f9383b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9384c = parcel.readInt();
            this.f9385d = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f9383b) + ", mIcon=" + this.f9384c + ", mExtras=" + this.f9385d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i3) {
            parcel.writeString(this.f9382a);
            TextUtils.writeToParcel(this.f9383b, parcel, i3);
            parcel.writeInt(this.f9384c);
            parcel.writeBundle(this.f9385d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f9372a = parcel.readInt();
        this.f9373b = parcel.readLong();
        this.f9375d = parcel.readFloat();
        this.f9379h = parcel.readLong();
        this.f9374c = parcel.readLong();
        this.f9376e = parcel.readLong();
        this.f9378g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f9380k = parcel.readLong();
        this.f9381l = parcel.readBundle(b.class.getClassLoader());
        this.f9377f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f9372a);
        sb2.append(", position=");
        sb2.append(this.f9373b);
        sb2.append(", buffered position=");
        sb2.append(this.f9374c);
        sb2.append(", speed=");
        sb2.append(this.f9375d);
        sb2.append(", updated=");
        sb2.append(this.f9379h);
        sb2.append(", actions=");
        sb2.append(this.f9376e);
        sb2.append(", error code=");
        sb2.append(this.f9377f);
        sb2.append(", error message=");
        sb2.append(this.f9378g);
        sb2.append(", custom actions=");
        sb2.append(this.j);
        sb2.append(", active item id=");
        return h.q(sb2, this.f9380k, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f9372a);
        parcel.writeLong(this.f9373b);
        parcel.writeFloat(this.f9375d);
        parcel.writeLong(this.f9379h);
        parcel.writeLong(this.f9374c);
        parcel.writeLong(this.f9376e);
        TextUtils.writeToParcel(this.f9378g, parcel, i3);
        parcel.writeTypedList(this.j);
        parcel.writeLong(this.f9380k);
        parcel.writeBundle(this.f9381l);
        parcel.writeInt(this.f9377f);
    }
}
