package p0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: p0.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1484h implements InterfaceC1480d {

    /* renamed from: b, reason: collision with root package name */
    public int f19641b;

    /* renamed from: c, reason: collision with root package name */
    public float f19642c;

    /* renamed from: d, reason: collision with root package name */
    public float f19643d;

    /* renamed from: e, reason: collision with root package name */
    public C1478b f19644e;

    /* renamed from: f, reason: collision with root package name */
    public C1478b f19645f;

    /* renamed from: g, reason: collision with root package name */
    public C1478b f19646g;

    /* renamed from: h, reason: collision with root package name */
    public C1478b f19647h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19648i;
    public C1483g j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f19649k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f19650l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f19651m;

    /* renamed from: n, reason: collision with root package name */
    public long f19652n;

    /* renamed from: o, reason: collision with root package name */
    public long f19653o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19654p;

    @Override // p0.InterfaceC1480d
    public final boolean a() {
        if (this.f19645f.f19607a != -1) {
            return Math.abs(this.f19642c - 1.0f) >= 1.0E-4f || Math.abs(this.f19643d - 1.0f) >= 1.0E-4f || this.f19645f.f19607a != this.f19644e.f19607a;
        }
        return false;
    }

    @Override // p0.InterfaceC1480d
    public final ByteBuffer b() {
        C1483g c1483g = this.j;
        if (c1483g != null) {
            int i3 = c1483g.f19630m;
            int i10 = c1483g.f19620b;
            int i11 = i3 * i10 * 2;
            if (i11 > 0) {
                if (this.f19649k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f19649k = order;
                    this.f19650l = order.asShortBuffer();
                } else {
                    this.f19649k.clear();
                    this.f19650l.clear();
                }
                ShortBuffer shortBuffer = this.f19650l;
                int min = Math.min(shortBuffer.remaining() / i10, c1483g.f19630m);
                int i12 = min * i10;
                shortBuffer.put(c1483g.f19629l, 0, i12);
                int i13 = c1483g.f19630m - min;
                c1483g.f19630m = i13;
                short[] sArr = c1483g.f19629l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f19653o += i11;
                this.f19649k.limit(i11);
                this.f19651m = this.f19649k;
            }
        }
        ByteBuffer byteBuffer = this.f19651m;
        this.f19651m = InterfaceC1480d.f19611a;
        return byteBuffer;
    }

    @Override // p0.InterfaceC1480d
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C1483g c1483g = this.j;
            c1483g.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f19652n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i3 = c1483g.f19620b;
            int i10 = remaining2 / i3;
            short[] c10 = c1483g.c(c1483g.j, c1483g.f19628k, i10);
            c1483g.j = c10;
            asShortBuffer.get(c10, c1483g.f19628k * i3, ((i10 * i3) * 2) / 2);
            c1483g.f19628k += i10;
            c1483g.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // p0.InterfaceC1480d
    public final C1478b d(C1478b c1478b) {
        if (c1478b.f19609c != 2) {
            throw new C1479c(c1478b);
        }
        int i3 = this.f19641b;
        if (i3 == -1) {
            i3 = c1478b.f19607a;
        }
        this.f19644e = c1478b;
        C1478b c1478b2 = new C1478b(i3, c1478b.f19608b, 2);
        this.f19645f = c1478b2;
        this.f19648i = true;
        return c1478b2;
    }

    @Override // p0.InterfaceC1480d
    public final void e() {
        C1483g c1483g = this.j;
        if (c1483g != null) {
            int i3 = c1483g.f19628k;
            float f10 = c1483g.f19621c;
            float f11 = c1483g.f19622d;
            double d8 = f10 / f11;
            int i10 = c1483g.f19630m + ((int) (((((((i3 - r6) / d8) + c1483g.f19635r) + c1483g.f19640w) + c1483g.f19632o) / (c1483g.f19623e * f11)) + 0.5d));
            c1483g.f19640w = 0.0d;
            short[] sArr = c1483g.j;
            int i11 = c1483g.f19626h * 2;
            c1483g.j = c1483g.c(sArr, i3, i11 + i3);
            int i12 = 0;
            while (true) {
                int i13 = c1483g.f19620b;
                if (i12 >= i11 * i13) {
                    break;
                }
                c1483g.j[(i13 * i3) + i12] = 0;
                i12++;
            }
            c1483g.f19628k = i11 + c1483g.f19628k;
            c1483g.f();
            if (c1483g.f19630m > i10) {
                c1483g.f19630m = i10;
            }
            c1483g.f19628k = 0;
            c1483g.f19635r = 0;
            c1483g.f19632o = 0;
        }
        this.f19654p = true;
    }

    @Override // p0.InterfaceC1480d
    public final boolean f() {
        if (!this.f19654p) {
            return false;
        }
        C1483g c1483g = this.j;
        return c1483g == null || (c1483g.f19630m * c1483g.f19620b) * 2 == 0;
    }

    @Override // p0.InterfaceC1480d
    public final void flush() {
        if (a()) {
            C1478b c1478b = this.f19644e;
            this.f19646g = c1478b;
            C1478b c1478b2 = this.f19645f;
            this.f19647h = c1478b2;
            if (this.f19648i) {
                this.j = new C1483g(c1478b.f19607a, c1478b.f19608b, this.f19642c, this.f19643d, c1478b2.f19607a);
            } else {
                C1483g c1483g = this.j;
                if (c1483g != null) {
                    c1483g.f19628k = 0;
                    c1483g.f19630m = 0;
                    c1483g.f19632o = 0;
                    c1483g.f19633p = 0;
                    c1483g.f19634q = 0;
                    c1483g.f19635r = 0;
                    c1483g.f19636s = 0;
                    c1483g.f19637t = 0;
                    c1483g.f19638u = 0;
                    c1483g.f19639v = 0;
                    c1483g.f19640w = 0.0d;
                }
            }
        }
        this.f19651m = InterfaceC1480d.f19611a;
        this.f19652n = 0L;
        this.f19653o = 0L;
        this.f19654p = false;
    }

    @Override // p0.InterfaceC1480d
    public final void reset() {
        this.f19642c = 1.0f;
        this.f19643d = 1.0f;
        C1478b c1478b = C1478b.f19606e;
        this.f19644e = c1478b;
        this.f19645f = c1478b;
        this.f19646g = c1478b;
        this.f19647h = c1478b;
        ByteBuffer byteBuffer = InterfaceC1480d.f19611a;
        this.f19649k = byteBuffer;
        this.f19650l = byteBuffer.asShortBuffer();
        this.f19651m = byteBuffer;
        this.f19641b = -1;
        this.f19648i = false;
        this.j = null;
        this.f19652n = 0L;
        this.f19653o = 0L;
        this.f19654p = false;
    }
}
