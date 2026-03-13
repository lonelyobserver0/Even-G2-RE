package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0707y1 extends AbstractC0639k2 {
    private static final C0707y1 zzf;
    private int zzb;
    private String zzd = "";
    private InterfaceC0669q2 zze = J2.f11292e;

    static {
        C0707y1 c0707y1 = new C0707y1();
        zzf = c0707y1;
        AbstractC0639k2.m(C0707y1.class, c0707y1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzf, StubApp.getString2(12320), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), StubApp.getString2(11559), A1.class});
        }
        if (i10 == 3) {
            return new C0707y1();
        }
        if (i10 == 4) {
            return new C0691v0(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }
}
