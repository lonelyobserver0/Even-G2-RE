package c4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0566a implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10819e;

    /* renamed from: f, reason: collision with root package name */
    public final IBinder f10820f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10821g;

    public /* synthetic */ AbstractC0566a(IBinder iBinder, String str, int i3) {
        this.f10819e = i3;
        this.f10820f = iBinder;
        this.f10821g = str;
    }

    public Parcel K(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f10820f.transact(i3, parcel, obtain, 0);
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

    public void L(Parcel parcel, int i3) {
        Parcel obtain;
        switch (this.f10819e) {
            case 1:
                obtain = Parcel.obtain();
                try {
                    this.f10820f.transact(i3, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            default:
                obtain = Parcel.obtain();
                try {
                    this.f10820f.transact(i3, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void M(Parcel parcel) {
        try {
            this.f10820f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f10819e) {
        }
        return this.f10820f;
    }

    public Parcel e(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f10820f.transact(i3, parcel, obtain, 0);
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

    public Parcel f(Parcel parcel, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f10820f.transact(i3, parcel, obtain, 0);
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

    public Parcel g() {
        switch (this.f10819e) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f10821g);
                return obtain;
            case 2:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f10821g);
                return obtain2;
            default:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.f10821g);
                return obtain3;
        }
    }
}
