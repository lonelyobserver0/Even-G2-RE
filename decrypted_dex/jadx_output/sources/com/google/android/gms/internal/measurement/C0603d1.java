package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0603d1 extends AbstractC0639k2 {
    private static final C0603d1 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        C0603d1 c0603d1 = new C0603d1();
        zzf = c0603d1;
        AbstractC0639k2.m(C0603d1.class, c0603d1);
    }

    public static C0598c1 t() {
        return (C0598c1) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzf, StubApp.getString2(11901), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559)});
        }
        if (i10 == 3) {
            return new C0603d1();
        }
        if (i10 == 4) {
            return new C0598c1(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final long s() {
        return this.zze;
    }

    public final /* synthetic */ void u(int i3) {
        this.zzb |= 1;
        this.zzd = i3;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
