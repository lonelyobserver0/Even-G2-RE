package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0676s0 extends AbstractC0639k2 {
    private static final C0676s0 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC0669q2 zzf = J2.f11292e;
    private boolean zzg;
    private C0701x0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C0676s0 c0676s0 = new C0676s0();
        zzl = c0676s0;
        AbstractC0639k2.m(C0676s0.class, c0676s0);
    }

    public static C0671r0 B() {
        return (C0671r0) zzl.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void D(int i3, C0686u0 c0686u0) {
        InterfaceC0669q2 interfaceC0669q2 = this.zzf;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zzf = interfaceC0669q2.A(size + size);
        }
        this.zzf.set(i3, c0686u0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzl, StubApp.getString2(12207), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), C0686u0.class, StubApp.getString2(11562), StubApp.getString2(11564), StubApp.getString2(11565), StubApp.getString2(11688), StubApp.getString2(11689)});
        }
        if (i10 == 3) {
            return new C0676s0();
        }
        if (i10 == 4) {
            return new C0671r0(zzl);
        }
        if (i10 == 5) {
            return zzl;
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

    public final List s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final C0686u0 u(int i3) {
        return (C0686u0) this.zzf.get(i3);
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final C0701x0 w() {
        C0701x0 c0701x0 = this.zzh;
        return c0701x0 == null ? C0701x0.y() : c0701x0;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return (this.zzb & 64) != 0;
    }
}
