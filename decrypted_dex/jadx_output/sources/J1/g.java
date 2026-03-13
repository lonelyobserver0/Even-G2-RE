package J1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements h {

    /* renamed from: e, reason: collision with root package name */
    public IBinder f3321e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3321e;
    }

    @Override // J1.h
    public final void k(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(h.f3322a);
            obtain.writeStringArray(strArr);
            this.f3321e.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
