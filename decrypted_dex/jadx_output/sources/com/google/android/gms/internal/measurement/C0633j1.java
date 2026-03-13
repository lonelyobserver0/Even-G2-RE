package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0633j1 extends AbstractC0639k2 {
    private static final C0633j1 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private T0 zzf;

    static {
        C0633j1 c0633j1 = new C0633j1();
        zzg = c0633j1;
        AbstractC0639k2.m(C0633j1.class, c0633j1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzg, StubApp.getString2(12098), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), StubApp.getString2(11561)});
        }
        if (i10 == 3) {
            return new C0633j1();
        }
        if (i10 == 4) {
            return new C0691v0(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }
}
