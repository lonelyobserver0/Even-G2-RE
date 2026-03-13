package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class L0 extends AbstractC0639k2 {
    private static final L0 zzg;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;

    static {
        L0 l02 = new L0();
        zzg = l02;
        AbstractC0639k2.m(L0.class, l02);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzg, StubApp.getString2(11706), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561)});
        }
        if (i10 == 3) {
            return new L0();
        }
        if (i10 == 4) {
            return new C0691v0(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }
}
