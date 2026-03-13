package com.google.android.gms.internal.measurement;

import a.AbstractC0378a;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0 extends AbstractC0639k2 {
    private static final C0 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        C0 c02 = new C0();
        zzf = c02;
        AbstractC0639k2.m(C0.class, c02);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            C0696w0 c0696w0 = C0696w0.f11748e;
            return new K2(zzf, StubApp.getString2(11569), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), c0696w0, StubApp.getString2(11559), c0696w0});
        }
        if (i10 == 3) {
            return new C0();
        }
        if (i10 == 4) {
            return new C0691v0(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int p() {
        int I10 = AbstractC0378a.I(this.zzd);
        if (I10 == 0) {
            return 1;
        }
        return I10;
    }

    public final int q() {
        int I10 = AbstractC0378a.I(this.zze);
        if (I10 == 0) {
            return 1;
        }
        return I10;
    }
}
