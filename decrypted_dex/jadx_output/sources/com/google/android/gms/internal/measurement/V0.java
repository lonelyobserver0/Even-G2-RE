package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class V0 extends AbstractC0639k2 {
    private static final V0 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        V0 v02 = new V0();
        zzk = v02;
        AbstractC0639k2.m(V0.class, v02);
    }

    public static U0 w() {
        return (U0) zzk.h();
    }

    public static V0 x() {
        return zzk;
    }

    public final /* synthetic */ void A(boolean z2) {
        this.zzb |= 4;
        this.zzf = z2;
    }

    public final /* synthetic */ void B(boolean z2) {
        this.zzb |= 8;
        this.zzg = z2;
    }

    public final /* synthetic */ void C(boolean z2) {
        this.zzb |= 16;
        this.zzh = z2;
    }

    public final /* synthetic */ void D(boolean z2) {
        this.zzb |= 32;
        this.zzi = z2;
    }

    public final /* synthetic */ void E(boolean z2) {
        this.zzb |= 64;
        this.zzj = z2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzk, StubApp.getString2(11851), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562), StubApp.getString2(11564), StubApp.getString2(11565), StubApp.getString2(11688)});
        }
        if (i10 == 3) {
            return new V0();
        }
        if (i10 == 4) {
            return new U0(zzk);
        }
        if (i10 == 5) {
            return zzk;
        }
        throw null;
    }

    public final boolean p() {
        return this.zzd;
    }

    public final boolean q() {
        return this.zze;
    }

    public final boolean r() {
        return this.zzf;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzj;
    }

    public final /* synthetic */ void y(boolean z2) {
        this.zzb |= 1;
        this.zzd = z2;
    }

    public final /* synthetic */ void z(boolean z2) {
        this.zzb |= 2;
        this.zze = z2;
    }
}
