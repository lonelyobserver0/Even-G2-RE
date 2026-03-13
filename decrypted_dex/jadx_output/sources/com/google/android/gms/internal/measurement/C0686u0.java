package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0686u0 extends AbstractC0639k2 {
    private static final C0686u0 zzh;
    private int zzb;
    private A0 zzd;
    private C0701x0 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        C0686u0 c0686u0 = new C0686u0();
        zzh = c0686u0;
        AbstractC0639k2.m(C0686u0.class, c0686u0);
    }

    public static C0686u0 x() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzh, StubApp.getString2(12290), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562)});
        }
        if (i10 == 3) {
            return new C0686u0();
        }
        if (i10 == 4) {
            return new C0681t0(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final A0 q() {
        A0 a02 = this.zzd;
        return a02 == null ? A0.w() : a02;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final C0701x0 s() {
        C0701x0 c0701x0 = this.zze;
        return c0701x0 == null ? C0701x0.y() : c0701x0;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final String w() {
        return this.zzg;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
