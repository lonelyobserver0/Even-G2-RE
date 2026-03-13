package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A1 extends AbstractC0639k2 {
    private static final A1 zzj;
    private int zzb;
    private int zzd;
    private InterfaceC0669q2 zze = J2.f11292e;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        A1 a1 = new A1();
        zzj = a1;
        AbstractC0639k2.m(A1.class, a1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzj, StubApp.getString2(11566), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), C0696w0.f11757o, StubApp.getString2(11559), A1.class, StubApp.getString2(11561), StubApp.getString2(11562), StubApp.getString2(11564), StubApp.getString2(11565)});
        }
        if (i10 == 3) {
            return new A1();
        }
        if (i10 == 4) {
            return new C0691v0(zzj);
        }
        if (i10 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List p() {
        return this.zze;
    }

    public final String q() {
        return this.zzf;
    }

    public final boolean r() {
        return (this.zzb & 4) != 0;
    }

    public final String s() {
        return this.zzg;
    }

    public final boolean t() {
        return (this.zzb & 8) != 0;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        return (this.zzb & 16) != 0;
    }

    public final double w() {
        return this.zzi;
    }

    public final int x() {
        int i3;
        int i10 = this.zzd;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i3 = 4;
                    if (i10 != 3) {
                        i3 = i10 != 4 ? 0 : 5;
                    }
                } else {
                    i3 = 3;
                }
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
