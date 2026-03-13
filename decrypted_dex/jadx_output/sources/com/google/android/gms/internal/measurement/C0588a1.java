package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.a1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0588a1 extends AbstractC0639k2 {
    private static final C0588a1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        C0588a1 c0588a1 = new C0588a1();
        zzf = c0588a1;
        AbstractC0639k2.m(C0588a1.class, c0588a1);
    }

    public static Z0 p() {
        return (Z0) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzf, StubApp.getString2(11569), new Object[]{StubApp.getString2(11560), StubApp.getString2(11558), C0696w0.f11751h, StubApp.getString2(11559), C0696w0.f11752i});
        }
        if (i10 == 3) {
            return new C0588a1();
        }
        if (i10 == 4) {
            return new Z0(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int q() {
        int i3;
        int i10 = this.zzd;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i3 = 4;
                    if (i10 != 3) {
                        i3 = i10 != 4 ? 0 : 5;
                    }
                } else {
                    i3 = 3;
                }
            }
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int r() {
        int i3;
        int i10 = this.zze;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                i3 = i10 != 2 ? 0 : 3;
            }
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final /* synthetic */ void s(int i3) {
        this.zzd = i3 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void t(int i3) {
        this.zze = i3 - 1;
        this.zzb |= 2;
    }
}
