package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class X0 extends AbstractC0639k2 {
    private static final X0 zzh;
    private int zzb;
    private int zzd;
    private C0668q1 zze;
    private C0668q1 zzf;
    private boolean zzg;

    static {
        X0 x02 = new X0();
        zzh = x02;
        AbstractC0639k2.m(X0.class, x02);
    }

    public static W0 w() {
        return (W0) zzh.h();
    }

    public final /* synthetic */ void A(boolean z2) {
        this.zzb |= 8;
        this.zzg = z2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzh, StubApp.getString2(11859), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562)});
        }
        if (i10 == 3) {
            return new X0();
        }
        if (i10 == 4) {
            return new W0(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final C0668q1 r() {
        C0668q1 c0668q1 = this.zze;
        return c0668q1 == null ? C0668q1.y() : c0668q1;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final C0668q1 t() {
        C0668q1 c0668q1 = this.zzf;
        return c0668q1 == null ? C0668q1.y() : c0668q1;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final /* synthetic */ void x(int i3) {
        this.zzb |= 1;
        this.zzd = i3;
    }

    public final /* synthetic */ void y(C0668q1 c0668q1) {
        this.zze = c0668q1;
        this.zzb |= 2;
    }

    public final /* synthetic */ void z(C0668q1 c0668q1) {
        this.zzf = c0668q1;
        this.zzb |= 4;
    }
}
