package S3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class z implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f6581e;

    public z(IBinder iBinder) {
        this.f6581e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6581e;
    }

    public final void e(G g10, C0274h c0274h) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(StubApp.getString2("5941"));
            obtain.writeStrongBinder(g10);
            obtain.writeInt(1);
            B0.s.a(c0274h, obtain, 0);
            this.f6581e.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
