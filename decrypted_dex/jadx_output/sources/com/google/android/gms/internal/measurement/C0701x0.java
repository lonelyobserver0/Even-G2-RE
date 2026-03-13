package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0701x0 extends AbstractC0639k2 {
    private static final C0701x0 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        C0701x0 c0701x0 = new C0701x0();
        zzi = c0701x0;
        AbstractC0639k2.m(C0701x0.class, c0701x0);
    }

    public static C0701x0 y() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzi, StubApp.getString2(12319), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), C0696w0.f11745b, StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562), StubApp.getString2(11564)});
        }
        if (i10 == 3) {
            return new C0701x0();
        }
        if (i10 == 4) {
            return new C0691v0(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final boolean q() {
        return (this.zzb & 2) != 0;
    }

    public final boolean r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 16) != 0;
    }

    public final String x() {
        return this.zzh;
    }

    public final int z() {
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
