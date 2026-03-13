package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E0 extends AbstractC0639k2 {
    private static final E0 zzi;
    private int zzb;
    private InterfaceC0669q2 zzd;
    private InterfaceC0669q2 zze;
    private InterfaceC0669q2 zzf;
    private boolean zzg;
    private InterfaceC0669q2 zzh;

    static {
        E0 e02 = new E0();
        zzi = e02;
        AbstractC0639k2.m(E0.class, e02);
    }

    public E0() {
        J2 j22 = J2.f11292e;
        this.zzd = j22;
        this.zze = j22;
        this.zzf = j22;
        this.zzh = j22;
    }

    public static E0 v() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzi, StubApp.getString2(11632), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), B0.class, StubApp.getString2(11559), C0.class, StubApp.getString2(11561), D0.class, StubApp.getString2(11562), StubApp.getString2(11564), B0.class});
        }
        if (i10 == 3) {
            return new E0();
        }
        if (i10 == 4) {
            return new C0691v0(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }

    public final List r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final InterfaceC0669q2 u() {
        return this.zzh;
    }
}
