package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0628i1 extends AbstractC0639k2 {
    private static final C0628i1 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private InterfaceC0669q2 zzi = J2.f11292e;

    static {
        C0628i1 c0628i1 = new C0628i1();
        zzj = c0628i1;
        AbstractC0639k2.m(C0628i1.class, c0628i1);
    }

    public static C0623h1 B() {
        return (C0623h1) zzj.h();
    }

    public final int A() {
        return this.zzi.size();
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void E() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void H(double d8) {
        this.zzb |= 16;
        this.zzh = d8;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final void J(C0628i1 c0628i1) {
        InterfaceC0669q2 interfaceC0669q2 = this.zzi;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zzi = interfaceC0669q2.A(size + size);
        }
        this.zzi.add(c0628i1);
    }

    public final void K(ArrayList arrayList) {
        InterfaceC0669q2 interfaceC0669q2 = this.zzi;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zzi = interfaceC0669q2.A(size + size);
        }
        V1.c(arrayList, this.zzi);
    }

    public final void L() {
        this.zzi = J2.f11292e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzj, StubApp.getString2(12094), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562), StubApp.getString2(11564), StubApp.getString2(11565), C0628i1.class});
        }
        if (i10 == 3) {
            return new C0628i1();
        }
        if (i10 == 4) {
            return new C0623h1(zzj);
        }
        if (i10 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final String q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final float w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 16) != 0;
    }

    public final double y() {
        return this.zzh;
    }

    public final List z() {
        return this.zzi;
    }
}
