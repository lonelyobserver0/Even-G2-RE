package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class T0 extends AbstractC0639k2 {
    private static final T0 zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        T0 t02 = new T0();
        zzk = t02;
        AbstractC0639k2.m(T0.class, t02);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzk, StubApp.getString2(11812), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562), StubApp.getString2(11564), StubApp.getString2(11565), StubApp.getString2(11688)});
        }
        if (i10 == 3) {
            return new T0();
        }
        if (i10 == 4) {
            return new C0691v0(zzk);
        }
        if (i10 == 5) {
            return zzk;
        }
        throw null;
    }
}
