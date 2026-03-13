package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class J0 extends AbstractC0639k2 {
    private static final J0 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private InterfaceC0669q2 zzg;
    private InterfaceC0669q2 zzh;
    private InterfaceC0669q2 zzi;
    private String zzj;
    private boolean zzk;
    private InterfaceC0669q2 zzl;
    private InterfaceC0669q2 zzm;
    private String zzn;
    private String zzo;
    private E0 zzp;
    private L0 zzq;
    private O0 zzr;
    private M0 zzs;
    private K0 zzt;

    static {
        J0 j02 = new J0();
        zzu = j02;
        AbstractC0639k2.m(J0.class, j02);
    }

    public J0() {
        J2 j22 = J2.f11292e;
        this.zzg = j22;
        this.zzh = j22;
        this.zzi = j22;
        this.zzj = "";
        this.zzl = j22;
        this.zzm = j22;
        this.zzn = "";
        this.zzo = "";
    }

    public static I0 F() {
        return (I0) zzu.h();
    }

    public static J0 G() {
        return zzu;
    }

    public final String A() {
        return this.zzn;
    }

    public final boolean B() {
        return (this.zzb & 128) != 0;
    }

    public final E0 C() {
        E0 e02 = this.zzp;
        return e02 == null ? E0.v() : e02;
    }

    public final boolean D() {
        return (this.zzb & 512) != 0;
    }

    public final O0 E() {
        O0 o02 = this.zzr;
        return o02 == null ? O0.r() : o02;
    }

    public final void H(int i3, H0 h0) {
        InterfaceC0669q2 interfaceC0669q2 = this.zzh;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zzh = interfaceC0669q2.A(size + size);
        }
        this.zzh.set(i3, h0);
    }

    public final void I() {
        this.zzi = J2.f11292e;
    }

    public final void J() {
        this.zzl = J2.f11292e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzu, StubApp.getString2(11697), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562), N0.class, StubApp.getString2(11564), H0.class, StubApp.getString2(11565), C0667q0.class, StubApp.getString2(11688), StubApp.getString2(11689), StubApp.getString2(11690), C0712z1.class, StubApp.getString2(11691), F0.class, StubApp.getString2(11692), StubApp.getString2(11693), StubApp.getString2(11694), StubApp.getString2(11686), StubApp.getString2(11687), StubApp.getString2(11695), StubApp.getString2(11696)});
        }
        if (i10 == 3) {
            return new J0();
        }
        if (i10 == 4) {
            return new I0(zzu);
        }
        if (i10 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final long q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final String s() {
        return this.zze;
    }

    public final InterfaceC0669q2 t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final H0 v(int i3) {
        return (H0) this.zzh.get(i3);
    }

    public final InterfaceC0669q2 w() {
        return this.zzi;
    }

    public final InterfaceC0669q2 x() {
        return this.zzl;
    }

    public final int y() {
        return this.zzl.size();
    }

    public final List z() {
        return this.zzm;
    }
}
