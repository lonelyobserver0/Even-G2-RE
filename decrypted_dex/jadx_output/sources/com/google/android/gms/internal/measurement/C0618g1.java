package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0618g1 extends AbstractC0639k2 {
    private static final C0618g1 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        C0618g1 c0618g1 = new C0618g1();
        zzf = c0618g1;
        AbstractC0639k2.m(C0618g1.class, c0618g1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzf, StubApp.getString2(12033), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559)});
        }
        if (i10 == 3) {
            return new C0618g1();
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
