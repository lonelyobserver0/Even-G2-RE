package c4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b extends Binder implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10822e;

    public b(String str, int i3) {
        this.f10822e = i3;
        switch (i3) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    public abstract boolean K(int i3, Parcel parcel, Parcel parcel2);

    public boolean L(int i3, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean M(Parcel parcel, int i3);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i3 = this.f10822e;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.f10822e) {
            case 0:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return K(i3, parcel, parcel2);
            case 1:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return L(i3, parcel, parcel2);
            default:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return M(parcel, i3);
        }
    }
}
