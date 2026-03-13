package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BinderC0545c extends Binder implements InterfaceC0544b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f10772f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0546d f10773e;

    public BinderC0545c(C0546d c0546d) {
        this.f10773e = c0546d;
        attachInterface(this, InterfaceC0544b.f10771d);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        String str = InterfaceC0544b.f10771d;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i10);
        }
        this.f10773e.d(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
