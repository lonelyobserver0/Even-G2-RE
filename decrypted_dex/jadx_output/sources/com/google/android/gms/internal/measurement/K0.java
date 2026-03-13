package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K0 extends AbstractC0639k2 {
    private static final K0 zzd;
    private InterfaceC0669q2 zzb = J2.f11292e;

    static {
        K0 k02 = new K0();
        zzd = k02;
        AbstractC0639k2.m(K0.class, k02);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzd, StubApp.getString2(11700), new Object[]{StubApp.getString2(11560)});
        }
        if (i10 == 3) {
            return new K0();
        }
        if (i10 == 4) {
            return new C0691v0(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }
}
