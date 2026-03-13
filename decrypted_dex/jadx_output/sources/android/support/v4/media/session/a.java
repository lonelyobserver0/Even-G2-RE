package android.support.v4.media.session;

import Xa.h;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9386a;

    public /* synthetic */ a(int i3) {
        this.f9386a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f9386a) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f9364a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(1);

                    /* renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f9362a;

                    /* renamed from: b, reason: collision with root package name */
                    public final long f9363b;

                    {
                        this.f9362a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f9363b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f9362a);
                        sb2.append(", Id=");
                        return h.q(sb2, this.f9363b, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i3) {
                        this.f9362a.writeToParcel(parcel2, i3);
                        parcel2.writeLong(this.f9363b);
                    }
                };
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null));
            case 3:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f9367a = parcel.readInt();
                parcelableVolumeInfo.f9369c = parcel.readInt();
                parcelableVolumeInfo.f9370d = parcel.readInt();
                parcelableVolumeInfo.f9371e = parcel.readInt();
                parcelableVolumeInfo.f9368b = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f9386a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i3];
            case 1:
                return new MediaSessionCompat$QueueItem[i3];
            case 2:
                return new MediaSessionCompat$Token[i3];
            case 3:
                return new ParcelableVolumeInfo[i3];
            default:
                return new PlaybackStateCompat[i3];
        }
    }
}
