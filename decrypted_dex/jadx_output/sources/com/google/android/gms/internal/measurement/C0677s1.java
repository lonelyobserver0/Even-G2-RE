package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0677s1 extends AbstractC0639k2 {
    private static final C0677s1 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC0664p2 zze = C0698w2.f11760e;

    static {
        C0677s1 c0677s1 = new C0677s1();
        zzf = c0677s1;
        AbstractC0639k2.m(C0677s1.class, c0677s1);
    }

    public static C0672r1 u() {
        return (C0672r1) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzf, StubApp.getString2(12208), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559)});
        }
        if (i10 == 3) {
            return new C0677s1();
        }
        if (i10 == 4) {
            return new C0672r1(zzf);
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

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return ((C0698w2) this.zze).size();
    }

    public final long t(int i3) {
        return ((C0698w2) this.zze).b(i3);
    }

    public final /* synthetic */ void v(int i3) {
        this.zzb |= 1;
        this.zzd = i3;
    }

    public final void w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((W1) randomAccess).f11400a) {
            C0698w2 c0698w2 = (C0698w2) randomAccess;
            int i3 = c0698w2.f11762c;
            this.zze = c0698w2.A(i3 + i3);
        }
        V1.c(list, this.zze);
    }
}
