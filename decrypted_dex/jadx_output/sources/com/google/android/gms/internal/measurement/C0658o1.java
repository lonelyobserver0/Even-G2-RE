package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0658o1 extends AbstractC0639k2 {
    private static final C0658o1 zzf;
    private int zzb;
    private int zzd = 1;
    private InterfaceC0669q2 zze = J2.f11292e;

    static {
        C0658o1 c0658o1 = new C0658o1();
        zzf = c0658o1;
        AbstractC0639k2.m(C0658o1.class, c0658o1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzf, StubApp.getString2(12182), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), C0696w0.f11753k, StubApp.getString2(11559), C0618g1.class});
        }
        if (i10 == 3) {
            return new C0658o1();
        }
        if (i10 == 4) {
            return new C0691v0(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }
}
