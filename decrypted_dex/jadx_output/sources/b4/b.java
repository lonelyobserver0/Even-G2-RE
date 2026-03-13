package b4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements d, IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f10665e;

    public b(IBinder iBinder) {
        this.f10665e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10665e;
    }

    public final Parcel e(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f10665e.transact(i3, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
