package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e0 extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f9777b = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final boolean c(long j, Object obj) {
        switch (this.f9777b) {
            case 0:
                if (!h0.f9798g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!h0.f9798g) {
                    break;
                } else {
                    break;
                }
        }
        return h0.c(j, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final double d(long j, Object obj) {
        switch (this.f9777b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final float e(long j, Object obj) {
        switch (this.f9777b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void j(Object obj, long j, boolean z2) {
        switch (this.f9777b) {
            case 0:
                if (!h0.f9798g) {
                    h0.l(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    h0.k(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!h0.f9798g) {
                    h0.l(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    h0.k(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void k(Object obj, long j, byte b2) {
        switch (this.f9777b) {
            case 0:
                if (!h0.f9798g) {
                    h0.l(obj, j, b2);
                    break;
                } else {
                    h0.k(obj, j, b2);
                    break;
                }
            default:
                if (!h0.f9798g) {
                    h0.l(obj, j, b2);
                    break;
                } else {
                    h0.k(obj, j, b2);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void l(Object obj, long j, double d8) {
        switch (this.f9777b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d8));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d8));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void m(Object obj, long j, float f10) {
        switch (this.f9777b) {
            case 0:
                n(Float.floatToIntBits(f10), j, obj);
                break;
            default:
                n(Float.floatToIntBits(f10), j, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final boolean r() {
        switch (this.f9777b) {
        }
        return false;
    }
}
