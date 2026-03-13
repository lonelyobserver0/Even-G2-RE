package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0687u1 extends AbstractC0639k2 {
    private static final C0687u1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C0687u1 c0687u1 = new C0687u1();
        zzg = c0687u1;
        AbstractC0639k2.m(C0687u1.class, c0687u1);
    }

    public static C0682t1 q() {
        return (C0682t1) zzg.h();
    }

    public static C0687u1 r() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return new C0687u1();
            }
            if (i10 == 4) {
                return new C0682t1(zzg);
            }
            if (i10 == 5) {
                return zzg;
            }
            throw null;
        }
        return new K2(zzg, StubApp.getString2(11567), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), C0696w0.f11756n, StubApp.getString2(11559), C0696w0.f11754l, StubApp.getString2(11561), C0696w0.f11755m});
    }

    public final int p() {
        int a3 = Xa.h.a(this.zze);
        if (a3 == 0) {
            return 1;
        }
        return a3;
    }

    public final void s(int i3) {
        this.zze = Xa.h.c(i3);
        this.zzb |= 2;
    }

    public final int t() {
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

    public final int u() {
        int i3;
        int i10 = this.zzf;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                int i11 = 3;
                if (i10 != 2) {
                    i3 = 4;
                    if (i10 != 3) {
                        i11 = 5;
                        if (i10 != 4) {
                            i3 = i10 != 5 ? 0 : 6;
                        }
                    }
                }
                i3 = i11;
            }
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final /* synthetic */ void v(int i3) {
        this.zzd = i3 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i3) {
        this.zzf = i3 - 1;
        this.zzb |= 4;
    }
}
