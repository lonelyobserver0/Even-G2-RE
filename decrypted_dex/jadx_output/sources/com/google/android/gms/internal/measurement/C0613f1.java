package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0613f1 extends AbstractC0639k2 {
    private static final C0613f1 zzi;
    private int zzb;
    private InterfaceC0669q2 zzd = J2.f11292e;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    static {
        C0613f1 c0613f1 = new C0613f1();
        zzi = c0613f1;
        AbstractC0639k2.m(C0613f1.class, c0613f1);
    }

    public static C0608e1 z() {
        return (C0608e1) zzi.h();
    }

    public final /* synthetic */ void A(int i3, C0628i1 c0628i1) {
        I();
        this.zzd.set(i3, c0628i1);
    }

    public final /* synthetic */ void B(C0628i1 c0628i1) {
        c0628i1.getClass();
        I();
        this.zzd.add(c0628i1);
    }

    public final /* synthetic */ void C(Iterable iterable) {
        I();
        V1.c(iterable, this.zzd);
    }

    public final void D() {
        this.zzd = J2.f11292e;
    }

    public final /* synthetic */ void E(int i3) {
        I();
        this.zzd.remove(i3);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final void I() {
        InterfaceC0669q2 interfaceC0669q2 = this.zzd;
        if (((W1) interfaceC0669q2).f11400a) {
            return;
        }
        int size = interfaceC0669q2.size();
        this.zzd = interfaceC0669q2.A(size + size);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzi, StubApp.getString2(12028), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), C0628i1.class, StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562), StubApp.getString2(11564)});
        }
        if (i10 == 3) {
            return new C0613f1();
        }
        if (i10 == 4) {
            return new C0608e1(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final C0628i1 r(int i3) {
        return (C0628i1) this.zzd.get(i3);
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final int y() {
        return this.zzh;
    }
}
