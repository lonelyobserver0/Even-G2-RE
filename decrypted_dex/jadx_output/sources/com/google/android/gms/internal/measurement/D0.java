package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D0 extends AbstractC0639k2 {
    private static final D0 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        D0 d02 = new D0();
        zzf = d02;
        AbstractC0639k2.m(D0.class, d02);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzf, StubApp.getString2(11582), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559)});
        }
        if (i10 == 3) {
            return new D0();
        }
        if (i10 == 4) {
            return new C0691v0(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
