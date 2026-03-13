package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BinderC0642l0 extends AbstractBinderC0700x implements Q {

    /* renamed from: e, reason: collision with root package name */
    public final U4.b f11605e;

    public BinderC0642l0(U4.b bVar) {
        super(StubApp.getString2(11683));
        this.f11605e = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final int c() {
        return System.identityHashCode(this.f11605e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0700x
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            if (i3 != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(this.f11605e);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        AbstractC0705y.d(parcel);
        n(readLong, bundle, readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final void n(long j, Bundle bundle, String str, String str2) {
        this.f11605e.a(j, bundle, str, str2);
    }
}
