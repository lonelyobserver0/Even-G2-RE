package P3;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f5504a;

    public g(IBinder iBinder) {
        this.f5504a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f5504a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((g) obj).f5504a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f5504a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        Messenger messenger = this.f5504a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
