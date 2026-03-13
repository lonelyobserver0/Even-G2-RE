package com.google.android.gms.internal.measurement;

import a.AbstractC0378a;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B0 extends AbstractC0639k2 {
    private static final B0 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        B0 b02 = new B0();
        zzg = b02;
        AbstractC0639k2.m(B0.class, b02);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return new B0();
            }
            if (i10 == 4) {
                return new C0691v0(zzg);
            }
            if (i10 == 5) {
                return zzg;
            }
            throw null;
        }
        return new K2(zzg, StubApp.getString2(11567), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), C0696w0.f11748e, StubApp.getString2(11559), C0696w0.f11747d, StubApp.getString2(11561), C0696w0.f11749f});
    }

    public final int p() {
        int I10 = AbstractC0378a.I(this.zzd);
        if (I10 == 0) {
            return 1;
        }
        return I10;
    }

    public final int q() {
        int i3;
        int i10 = this.zze;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                i3 = i10 != 2 ? 0 : 3;
            }
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int r() {
        int i3;
        int i10 = this.zzf;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                i3 = i10 != 2 ? 0 : 3;
            }
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}
