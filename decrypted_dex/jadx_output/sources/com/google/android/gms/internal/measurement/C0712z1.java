package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0712z1 extends AbstractC0639k2 {
    private static final C0712z1 zzf;
    private int zzb;
    private InterfaceC0669q2 zzd = J2.f11292e;
    private C0702x1 zze;

    static {
        C0712z1 c0712z1 = new C0712z1();
        zzf = c0712z1;
        AbstractC0639k2.m(C0712z1.class, c0712z1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzf, StubApp.getString2(12327), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), A1.class, StubApp.getString2(11559)});
        }
        if (i10 == 3) {
            return new C0712z1();
        }
        if (i10 == 4) {
            return new C0691v0(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final C0702x1 q() {
        C0702x1 c0702x1 = this.zze;
        return c0702x1 == null ? C0702x1.r() : c0702x1;
    }
}
