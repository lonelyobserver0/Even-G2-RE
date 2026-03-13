package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c4.AbstractC0566a;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class O extends AbstractC0566a implements Q {
    public O(IBinder iBinder) {
        super(iBinder, StubApp.getString2(11683), 1);
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final int c() {
        Parcel f10 = f(g(), 2);
        int readInt = f10.readInt();
        f10.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final void n(long j, Bundle bundle, String str, String str2) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeString(str2);
        AbstractC0705y.b(g10, bundle);
        g10.writeLong(j);
        L(g10, 1);
    }
}
