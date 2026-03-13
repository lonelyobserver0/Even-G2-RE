package com.google.android.gms.internal.measurement;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class F2 implements L2 {

    /* renamed from: a, reason: collision with root package name */
    public final V1 f11267a;

    /* renamed from: b, reason: collision with root package name */
    public final C0629i2 f11268b;

    public F2(C0629i2 c0629i2, V1 v12) {
        C0629i2 c0629i22 = AbstractC0609e2.f11482a;
        this.f11268b = c0629i2;
        this.f11267a = v12;
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final AbstractC0639k2 a() {
        V1 v12 = this.f11267a;
        return v12 instanceof AbstractC0639k2 ? (AbstractC0639k2) ((AbstractC0639k2) v12).o(4) : ((AbstractC0634j2) ((AbstractC0639k2) v12).o(5)).d();
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final int b(AbstractC0639k2 abstractC0639k2) {
        P2 p22 = abstractC0639k2.zzc;
        int i3 = p22.f11345d;
        if (i3 != -1) {
            return i3;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < p22.f11342a; i11++) {
            int i12 = p22.f11343b[i11] >>> 3;
            C0594b2 c0594b2 = (C0594b2) p22.f11344c[i11];
            int T7 = C0599c2.T(8);
            int T10 = C0599c2.T(i12) + C0599c2.T(16);
            int T11 = C0599c2.T(24);
            int c10 = c0594b2.c();
            i10 = i2.u.C(T7 + T7, T10, Xa.h.d(c10, c10, T11), i10);
        }
        p22.f11345d = i10;
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void c(Object obj, Object obj2) {
        M2.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void d(Object obj, C0708y2 c0708y2) {
        throw com.mapbox.common.b.d(obj);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final boolean e(Object obj) {
        throw com.mapbox.common.b.d(obj);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void f(Object obj) {
        this.f11268b.getClass();
        P2 p22 = ((AbstractC0639k2) obj).zzc;
        if (p22.f11346e) {
            p22.f11346e = false;
        }
        C0629i2 c0629i2 = AbstractC0609e2.f11482a;
        throw com.mapbox.common.b.d(obj);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final boolean g(AbstractC0639k2 abstractC0639k2, AbstractC0639k2 abstractC0639k22) {
        return abstractC0639k2.zzc.equals(abstractC0639k22.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void h(Object obj, byte[] bArr, int i3, int i10, Y1 y12) {
        AbstractC0639k2 abstractC0639k2 = (AbstractC0639k2) obj;
        if (abstractC0639k2.zzc == P2.f11341f) {
            abstractC0639k2.zzc = P2.a();
        }
        throw com.mapbox.common.b.d(obj);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final int i(AbstractC0639k2 abstractC0639k2) {
        return abstractC0639k2.zzc.hashCode();
    }
}
