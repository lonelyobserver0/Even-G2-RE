package com.google.protobuf;

import sun.misc.Unsafe;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D0 extends F0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12084b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f12084b = i3;
    }

    @Override // com.google.protobuf.F0
    public final void c(long j, byte[] bArr, long j3) {
        switch (this.f12084b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.F0
    public final boolean d(long j, Object obj) {
        switch (this.f12084b) {
            case 0:
                if (G0.f12104h) {
                    if (G0.h(j, obj) == 0) {
                    }
                } else if (G0.i(j, obj) == 0) {
                }
                break;
            default:
                if (G0.f12104h) {
                    if (G0.h(j, obj) == 0) {
                    }
                } else if (G0.i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.protobuf.F0
    public final byte e(long j) {
        switch (this.f12084b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.F0
    public final byte f(long j, Object obj) {
        switch (this.f12084b) {
            case 0:
                if (!G0.f12104h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!G0.f12104h) {
                    break;
                } else {
                    break;
                }
        }
        return G0.i(j, obj);
    }

    @Override // com.google.protobuf.F0
    public final double g(long j, Object obj) {
        switch (this.f12084b) {
        }
        return Double.longBitsToDouble(j(j, obj));
    }

    @Override // com.google.protobuf.F0
    public final float h(long j, Object obj) {
        switch (this.f12084b) {
        }
        return Float.intBitsToFloat(i(j, obj));
    }

    @Override // com.google.protobuf.F0
    public final void m(Object obj, long j, boolean z2) {
        switch (this.f12084b) {
            case 0:
                if (!G0.f12104h) {
                    G0.m(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    G0.l(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!G0.f12104h) {
                    G0.m(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    G0.l(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.protobuf.F0
    public final void n(Object obj, long j, byte b2) {
        switch (this.f12084b) {
            case 0:
                if (!G0.f12104h) {
                    G0.m(obj, j, b2);
                    break;
                } else {
                    G0.l(obj, j, b2);
                    break;
                }
            default:
                if (!G0.f12104h) {
                    G0.m(obj, j, b2);
                    break;
                } else {
                    G0.l(obj, j, b2);
                    break;
                }
        }
    }

    @Override // com.google.protobuf.F0
    public final void o(Object obj, long j, double d8) {
        switch (this.f12084b) {
            case 0:
                r(obj, j, Double.doubleToLongBits(d8));
                break;
            default:
                r(obj, j, Double.doubleToLongBits(d8));
                break;
        }
    }

    @Override // com.google.protobuf.F0
    public final void p(Object obj, long j, float f10) {
        switch (this.f12084b) {
            case 0:
                q(Float.floatToIntBits(f10), j, obj);
                break;
            default:
                q(Float.floatToIntBits(f10), j, obj);
                break;
        }
    }

    @Override // com.google.protobuf.F0
    public final boolean u() {
        switch (this.f12084b) {
        }
        return false;
    }
}
