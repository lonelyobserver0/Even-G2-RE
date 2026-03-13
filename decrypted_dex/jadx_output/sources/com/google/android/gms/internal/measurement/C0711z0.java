package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0711z0 extends AbstractC0639k2 {
    private static final C0711z0 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private C0686u0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        C0711z0 c0711z0 = new C0711z0();
        zzj = c0711z0;
        AbstractC0639k2.m(C0711z0.class, c0711z0);
    }

    public static C0706y0 x() {
        return (C0706y0) zzj.h();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzj, StubApp.getString2(12326), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562), StubApp.getString2(11564), StubApp.getString2(11565)});
        }
        if (i10 == 3) {
            return new C0711z0();
        }
        if (i10 == 4) {
            return new C0706y0(zzj);
        }
        if (i10 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final C0686u0 s() {
        C0686u0 c0686u0 = this.zzf;
        return c0686u0 == null ? C0686u0.x() : c0686u0;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        return (this.zzb & 32) != 0;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
