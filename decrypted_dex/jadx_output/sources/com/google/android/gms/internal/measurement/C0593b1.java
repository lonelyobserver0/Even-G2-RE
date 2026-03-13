package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0593b1 extends AbstractC0639k2 {
    private static final C0593b1 zzd;
    private InterfaceC0669q2 zzb = J2.f11292e;

    static {
        C0593b1 c0593b1 = new C0593b1();
        zzd = c0593b1;
        AbstractC0639k2.m(C0593b1.class, c0593b1);
    }

    public static Y0 q() {
        return (Y0) zzd.h();
    }

    public static C0593b1 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0639k2
    public final Object o(int i3) {
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new K2(zzd, StubApp.getString2(11886), new Object[]{StubApp.getString2(11560), C0588a1.class});
        }
        if (i10 == 3) {
            return new C0593b1();
        }
        if (i10 == 4) {
            return new Y0(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        InterfaceC0669q2 interfaceC0669q2 = this.zzb;
        if (!((W1) interfaceC0669q2).f11400a) {
            int size = interfaceC0669q2.size();
            this.zzb = interfaceC0669q2.A(size + size);
        }
        V1.c(arrayList, this.zzb);
    }
}
