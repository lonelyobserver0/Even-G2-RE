package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0667q0 extends AbstractC0639k2 {
    private static final C0667q0 zzi;
    private int zzb;
    private int zzd;
    private InterfaceC0669q2 zze;
    private InterfaceC0669q2 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        C0667q0 c0667q0 = new C0667q0();
        zzi = c0667q0;
        AbstractC0639k2.m(C0667q0.class, c0667q0);
    }

    public C0667q0() {
        J2 j22 = J2.f11292e;
        this.zze = j22;
        this.zzf = j22;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzi, StubApp.getString2(12188), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), C0711z0.class, StubApp.getString2(11561), C0676s0.class, StubApp.getString2(11562), StubApp.getString2(11564)});
        }
        if (i10 == 3) {
            return new C0667q0();
        }
        if (i10 == 4) {
            return new C0662p0(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final C0711z0 t(int i3) {
        return (C0711z0) this.zze.get(i3);
    }

    public final InterfaceC0669q2 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final C0676s0 w(int i3) {
        return (C0676s0) this.zzf.get(i3);
    }

    public final void x(int i3, C0711z0 c0711z0) {
        InterfaceC0669q2 interfaceC0669q2 = this.zze;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zze = interfaceC0669q2.A(size + size);
        }
        this.zze.set(i3, c0711z0);
    }

    public final void y(int i3, C0676s0 c0676s0) {
        InterfaceC0669q2 interfaceC0669q2 = this.zzf;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zzf = interfaceC0669q2.A(size + size);
        }
        this.zzf.set(i3, c0676s0);
    }
}
