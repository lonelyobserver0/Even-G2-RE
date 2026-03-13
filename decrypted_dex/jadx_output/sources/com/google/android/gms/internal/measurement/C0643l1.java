package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0643l1 extends AbstractC0639k2 {
    private static final C0643l1 zzh;
    private int zzb;
    private InterfaceC0669q2 zzd = J2.f11292e;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C0643l1 c0643l1 = new C0643l1();
        zzh = c0643l1;
        AbstractC0639k2.m(C0643l1.class, c0643l1);
    }

    public static C0638k1 w() {
        return (C0638k1) zzh.h();
    }

    public static C0638k1 x(C0643l1 c0643l1) {
        AbstractC0634j2 h2 = zzh.h();
        h2.f(c0643l1);
        return (C0638k1) h2;
    }

    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        V1.c(arrayList, this.zzd);
    }

    public final void B() {
        this.zzd = J2.f11292e;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void E() {
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
            return new K2(zzh, StubApp.getString2(12119), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), C0653n1.class, StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562), C0696w0.j});
        }
        if (i10 == 3) {
            return new C0643l1();
        }
        if (i10 == 4) {
            return new C0638k1(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final C0653n1 r(int i3) {
        return (C0653n1) this.zzd.get(i3);
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i3, C0653n1 c0653n1) {
        E();
        this.zzd.set(i3, c0653n1);
    }

    public final /* synthetic */ void z(C0653n1 c0653n1) {
        E();
        this.zzd.add(c0653n1);
    }
}
