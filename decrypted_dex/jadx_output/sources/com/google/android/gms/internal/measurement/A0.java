package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A0 extends AbstractC0639k2 {
    private static final A0 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private InterfaceC0669q2 zzg = J2.f11292e;

    static {
        A0 a02 = new A0();
        zzh = a02;
        AbstractC0639k2.m(A0.class, a02);
    }

    public static A0 w() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzh, StubApp.getString2(11563), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), C0696w0.f11746c, StubApp.getString2(11559), StubApp.getString2(11561), StubApp.getString2(11562)});
        }
        if (i10 == 3) {
            return new A0();
        }
        if (i10 == 4) {
            return new C0691v0(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final boolean q() {
        return (this.zzb & 2) != 0;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final InterfaceC0669q2 u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final int x() {
        int i3;
        switch (this.zzd) {
            case 0:
                i3 = 1;
                break;
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
                i3 = 5;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
                i3 = 7;
                break;
            default:
                i3 = 0;
                break;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}
