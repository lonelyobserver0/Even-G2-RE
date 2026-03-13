package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c4.AbstractC0566a;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K extends AbstractC0566a implements L {
    public K(IBinder iBinder) {
        super(iBinder, StubApp.getString2(11676), 1);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void y(Bundle bundle) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, bundle);
        L(g10, 1);
    }
}
