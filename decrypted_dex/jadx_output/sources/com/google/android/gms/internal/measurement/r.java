package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r implements InterfaceC0651n {
    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Boolean a() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final String b() {
        return StubApp.getString2(1146);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof r;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n i(String str, p2.h hVar, ArrayList arrayList) {
        throw new IllegalStateException(StubApp.getString2(12206).concat(str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0651n
    public final InterfaceC0651n m() {
        return InterfaceC0651n.f11619U;
    }
}
