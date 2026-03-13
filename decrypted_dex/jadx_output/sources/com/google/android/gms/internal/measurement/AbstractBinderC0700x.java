package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractBinderC0700x extends Binder implements IInterface {
    public AbstractBinderC0700x(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public abstract boolean e(int i3, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i10)) {
            return true;
        }
        return e(i3, parcel, parcel2);
    }
}
