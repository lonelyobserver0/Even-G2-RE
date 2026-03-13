package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class S0 extends AbstractC0639k2 {
    private static final S0 zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private A2 zzl;
    private A2 zzm;

    static {
        S0 s02 = new S0();
        zzn = s02;
        AbstractC0639k2.m(S0.class, s02);
    }

    public S0() {
        A2 a22 = A2.f11230b;
        this.zzl = a22;
        this.zzm = a22;
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    public static P0 O() {
        return (P0) zzn.h();
    }

    public static S0 P() {
        return zzn;
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final String B() {
        return this.zze;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final String D() {
        return this.zzf;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final long F() {
        return this.zzg;
    }

    public final boolean G() {
        return (this.zzb & 16) != 0;
    }

    public final String H() {
        return this.zzh;
    }

    public final boolean I() {
        return (this.zzb & 32) != 0;
    }

    public final String J() {
        return this.zzi;
    }

    public final boolean K() {
        return (this.zzb & 64) != 0;
    }

    public final String L() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zzb & 128) != 0;
    }

    public final long N() {
        return this.zzk;
    }

    public final /* synthetic */ void Q(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void R() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void S(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void T() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    public final /* synthetic */ void U(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void V() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    public final /* synthetic */ void W(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzn, StubApp.getString2(11811), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562), StubApp.getString2(11564), StubApp.getString2(11565), StubApp.getString2(11688), StubApp.getString2(11689), StubApp.getString2(11690), Q0.f11349a, StubApp.getString2(11691), R0.f11351a});
        }
        if (i10 == 3) {
            return new S0();
        }
        if (i10 == 4) {
            return new P0(zzn);
        }
        if (i10 == 5) {
            return zzn;
        }
        throw null;
    }

    public final /* synthetic */ void p(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void q() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    public final /* synthetic */ void r(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void s() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    public final /* synthetic */ void t(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void u() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 128;
        this.zzk = j;
    }

    public final A2 w() {
        A2 a22 = this.zzl;
        if (!a22.f11231a) {
            this.zzl = a22.a();
        }
        return this.zzl;
    }

    public final A2 x() {
        A2 a22 = this.zzm;
        if (!a22.f11231a) {
            this.zzm = a22.a();
        }
        return this.zzm;
    }

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final String z() {
        return this.zzd;
    }
}
