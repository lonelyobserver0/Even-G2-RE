package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class F0 extends AbstractC0639k2 {
    private static final F0 zzg;
    private int zzb;
    private String zzd = "";
    private InterfaceC0669q2 zze = J2.f11292e;
    private boolean zzf;

    static {
        F0 f02 = new F0();
        zzg = f02;
        AbstractC0639k2.m(F0.class, f02);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzg, StubApp.getString2(11639), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), M0.class, StubApp.getString2(11561)});
        }
        if (i10 == 3) {
            return new F0();
        }
        if (i10 == 4) {
            return new C0691v0(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
