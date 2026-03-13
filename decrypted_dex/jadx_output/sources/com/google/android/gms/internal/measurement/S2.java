package com.google.android.gms.internal.measurement;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class S2 extends T2 {
    @Override // com.google.android.gms.internal.measurement.T2
    public final void a(Object obj, long j, byte b2) {
        if (U2.f11392g) {
            U2.b(obj, j, b2);
        } else {
            U2.c(obj, j, b2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.T2
    public final boolean b(long j, Object obj) {
        return U2.f11392g ? U2.m(j, obj) : U2.n(j, obj);
    }

    @Override // com.google.android.gms.internal.measurement.T2
    public final void c(Object obj, long j, boolean z2) {
        if (U2.f11392g) {
            U2.b(obj, j, z2 ? (byte) 1 : (byte) 0);
        } else {
            U2.c(obj, j, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.T2
    public final float d(long j, Object obj) {
        return Float.intBitsToFloat(this.f11373a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.T2
    public final void e(Object obj, long j, float f10) {
        this.f11373a.putInt(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.T2
    public final double f(long j, Object obj) {
        return Double.longBitsToDouble(this.f11373a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.T2
    public final void g(Object obj, long j, double d8) {
        this.f11373a.putLong(obj, j, Double.doubleToLongBits(d8));
    }
}
