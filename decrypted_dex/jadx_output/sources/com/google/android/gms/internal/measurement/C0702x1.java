package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0702x1 extends AbstractC0639k2 {
    private static final C0702x1 zzd;
    private InterfaceC0669q2 zzb = J2.f11292e;

    static {
        C0702x1 c0702x1 = new C0702x1();
        zzd = c0702x1;
        AbstractC0639k2.m(C0702x1.class, c0702x1);
    }

    public static C0702x1 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzd, StubApp.getString2(11886), new Object[]{StubApp.getString2(11560), C0707y1.class});
        }
        if (i10 == 3) {
            return new C0702x1();
        }
        if (i10 == 4) {
            return new C0691v0(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }
}
