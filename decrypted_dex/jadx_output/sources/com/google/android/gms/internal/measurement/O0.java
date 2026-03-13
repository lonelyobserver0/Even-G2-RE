package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class O0 extends AbstractC0639k2 {
    private static final O0 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        O0 o02 = new O0();
        zzi = o02;
        AbstractC0639k2.m(O0.class, o02);
    }

    public static O0 r() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzi, StubApp.getString2(11774), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562), StubApp.getString2(11564)});
        }
        if (i10 == 3) {
            return new O0();
        }
        if (i10 == 4) {
            return new C0691v0(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        throw null;
    }

    public final int p() {
        return this.zzg;
    }

    public final String q() {
        return this.zzh;
    }
}
