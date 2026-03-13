package o0;

import f5.u0;
import java.util.Arrays;
import r0.AbstractC1560u;

/* renamed from: o0.H, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1411H {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18030a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18031b;

    /* renamed from: c, reason: collision with root package name */
    public final C1447v f18032c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18033d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18034e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18035f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18036g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18037h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18038i;

    static {
        i2.u.A(0, 1, 2, 3, 4);
        AbstractC1560u.E(5);
        AbstractC1560u.E(6);
    }

    public C1411H(Object obj, int i3, C1447v c1447v, Object obj2, int i10, long j, long j3, int i11, int i12) {
        this.f18030a = obj;
        this.f18031b = i3;
        this.f18032c = c1447v;
        this.f18033d = obj2;
        this.f18034e = i10;
        this.f18035f = j;
        this.f18036g = j3;
        this.f18037h = i11;
        this.f18038i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1411H.class == obj.getClass()) {
            C1411H c1411h = (C1411H) obj;
            if (this.f18031b == c1411h.f18031b && this.f18034e == c1411h.f18034e && this.f18035f == c1411h.f18035f && this.f18036g == c1411h.f18036g && this.f18037h == c1411h.f18037h && this.f18038i == c1411h.f18038i && u0.j(this.f18032c, c1411h.f18032c) && u0.j(this.f18030a, c1411h.f18030a) && u0.j(this.f18033d, c1411h.f18033d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18030a, Integer.valueOf(this.f18031b), this.f18032c, this.f18033d, Integer.valueOf(this.f18034e), Long.valueOf(this.f18035f), Long.valueOf(this.f18036g), Integer.valueOf(this.f18037h), Integer.valueOf(this.f18038i)});
    }
}
