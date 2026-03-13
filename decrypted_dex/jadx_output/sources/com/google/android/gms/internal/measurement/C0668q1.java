package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0668q1 extends AbstractC0639k2 {
    private static final C0668q1 zzg;
    private InterfaceC0664p2 zzb;
    private InterfaceC0664p2 zzd;
    private InterfaceC0669q2 zze;
    private InterfaceC0669q2 zzf;

    static {
        C0668q1 c0668q1 = new C0668q1();
        zzg = c0668q1;
        AbstractC0639k2.m(C0668q1.class, c0668q1);
    }

    public C0668q1() {
        C0698w2 c0698w2 = C0698w2.f11760e;
        this.zzb = c0698w2;
        this.zzd = c0698w2;
        J2 j22 = J2.f11292e;
        this.zze = j22;
        this.zzf = j22;
    }

    public static C0663p1 x() {
        return (C0663p1) zzg.h();
    }

    public static C0668q1 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = C0698w2.f11760e;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((W1) randomAccess).f11400a) {
            C0698w2 c0698w2 = (C0698w2) randomAccess;
            int i3 = c0698w2.f11762c;
            this.zzd = c0698w2.A(i3 + i3);
        }
        V1.c(list, this.zzd);
    }

    public final void C() {
        this.zzd = C0698w2.f11760e;
    }

    public final void D(ArrayList arrayList) {
        InterfaceC0669q2 interfaceC0669q2 = this.zze;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zze = interfaceC0669q2.A(size + size);
        }
        V1.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = J2.f11292e;
    }

    public final void F(List list) {
        InterfaceC0669q2 interfaceC0669q2 = this.zzf;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zzf = interfaceC0669q2.A(size + size);
        }
        V1.c(list, this.zzf);
    }

    public final void G() {
        this.zzf = J2.f11292e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzg, StubApp.getString2(12189), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), C0603d1.class, StubApp.getString2(11561), C0677s1.class});
        }
        if (i10 == 3) {
            return new C0668q1();
        }
        if (i10 == 4) {
            return new C0663p1(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return ((C0698w2) this.zzb).size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return ((C0698w2) this.zzd).size();
    }

    public final InterfaceC0669q2 t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final void z(List list) {
        RandomAccess randomAccess = this.zzb;
        if (!((W1) randomAccess).f11400a) {
            C0698w2 c0698w2 = (C0698w2) randomAccess;
            int i3 = c0698w2.f11762c;
            this.zzb = c0698w2.A(i3 + i3);
        }
        V1.c(list, this.zzb);
    }
}
