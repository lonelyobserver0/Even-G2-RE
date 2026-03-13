package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.D1;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0411k extends D1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f9809g = Logger.getLogger(C0411k.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f9810h = h0.f9796e;

    /* renamed from: b, reason: collision with root package name */
    public D f9811b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9812c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9813d;

    /* renamed from: e, reason: collision with root package name */
    public int f9814e;

    /* renamed from: f, reason: collision with root package name */
    public final OutputStream f9815f;

    public C0411k(OutputStream outputStream, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i3, 20);
        this.f9812c = new byte[max];
        this.f9813d = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f9815f = outputStream;
    }

    public static int O(int i3, C0407g c0407g) {
        int Q10 = Q(i3);
        int size = c0407g.size();
        return R(size) + size + Q10;
    }

    public static int P(String str) {
        int length;
        try {
            length = k0.a(str);
        } catch (j0 unused) {
            length = str.getBytes(AbstractC0422w.f9852a).length;
        }
        return R(length) + length;
    }

    public static int Q(int i3) {
        return R(i3 << 3);
    }

    public static int R(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int S(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void J(int i3) {
        int i10 = this.f9814e;
        int i11 = i10 + 1;
        this.f9814e = i11;
        byte[] bArr = this.f9812c;
        bArr[i10] = (byte) (i3 & 255);
        int i12 = i10 + 2;
        this.f9814e = i12;
        bArr[i11] = (byte) ((i3 >> 8) & 255);
        int i13 = i10 + 3;
        this.f9814e = i13;
        bArr[i12] = (byte) ((i3 >> 16) & 255);
        this.f9814e = i10 + 4;
        bArr[i13] = (byte) ((i3 >> 24) & 255);
    }

    public final void K(long j) {
        int i3 = this.f9814e;
        int i10 = i3 + 1;
        this.f9814e = i10;
        byte[] bArr = this.f9812c;
        bArr[i3] = (byte) (j & 255);
        int i11 = i3 + 2;
        this.f9814e = i11;
        bArr[i10] = (byte) ((j >> 8) & 255);
        int i12 = i3 + 3;
        this.f9814e = i12;
        bArr[i11] = (byte) ((j >> 16) & 255);
        int i13 = i3 + 4;
        this.f9814e = i13;
        bArr[i12] = (byte) (255 & (j >> 24));
        int i14 = i3 + 5;
        this.f9814e = i14;
        bArr[i13] = (byte) (((int) (j >> 32)) & 255);
        int i15 = i3 + 6;
        this.f9814e = i15;
        bArr[i14] = (byte) (((int) (j >> 40)) & 255);
        int i16 = i3 + 7;
        this.f9814e = i16;
        bArr[i15] = (byte) (((int) (j >> 48)) & 255);
        this.f9814e = i3 + 8;
        bArr[i16] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void L(int i3, int i10) {
        M((i3 << 3) | i10);
    }

    public final void M(int i3) {
        boolean z2 = f9810h;
        byte[] bArr = this.f9812c;
        if (z2) {
            while ((i3 & (-128)) != 0) {
                int i10 = this.f9814e;
                this.f9814e = i10 + 1;
                h0.j(bArr, i10, (byte) ((i3 | 128) & 255));
                i3 >>>= 7;
            }
            int i11 = this.f9814e;
            this.f9814e = i11 + 1;
            h0.j(bArr, i11, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i12 = this.f9814e;
            this.f9814e = i12 + 1;
            bArr[i12] = (byte) ((i3 | 128) & 255);
            i3 >>>= 7;
        }
        int i13 = this.f9814e;
        this.f9814e = i13 + 1;
        bArr[i13] = (byte) i3;
    }

    public final void N(long j) {
        boolean z2 = f9810h;
        byte[] bArr = this.f9812c;
        if (z2) {
            while ((j & (-128)) != 0) {
                int i3 = this.f9814e;
                this.f9814e = i3 + 1;
                h0.j(bArr, i3, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i10 = this.f9814e;
            this.f9814e = i10 + 1;
            h0.j(bArr, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i11 = this.f9814e;
            this.f9814e = i11 + 1;
            bArr[i11] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i12 = this.f9814e;
        this.f9814e = i12 + 1;
        bArr[i12] = (byte) j;
    }

    public final void T() {
        this.f9815f.write(this.f9812c, 0, this.f9814e);
        this.f9814e = 0;
    }

    public final void U(int i3) {
        if (this.f9813d - this.f9814e < i3) {
            T();
        }
    }

    public final void V(byte b2) {
        if (this.f9814e == this.f9813d) {
            T();
        }
        int i3 = this.f9814e;
        this.f9814e = i3 + 1;
        this.f9812c[i3] = b2;
    }

    public final void W(byte[] bArr, int i3, int i10) {
        int i11 = this.f9814e;
        int i12 = this.f9813d;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f9812c;
        if (i13 >= i10) {
            System.arraycopy(bArr, i3, bArr2, i11, i10);
            this.f9814e += i10;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i11, i13);
        int i14 = i3 + i13;
        int i15 = i10 - i13;
        this.f9814e = i12;
        T();
        if (i15 > i12) {
            this.f9815f.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f9814e = i15;
        }
    }

    public final void X(int i3, boolean z2) {
        U(11);
        L(i3, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        int i10 = this.f9814e;
        this.f9814e = i10 + 1;
        this.f9812c[i10] = b2;
    }

    public final void Y(int i3, C0407g c0407g) {
        j0(i3, 2);
        Z(c0407g);
    }

    public final void Z(C0407g c0407g) {
        l0(c0407g.size());
        u(c0407g.f(), c0407g.size(), c0407g.f9783b);
    }

    public final void a0(int i3, int i10) {
        U(14);
        L(i3, 5);
        J(i10);
    }

    public final void b0(int i3) {
        U(4);
        J(i3);
    }

    public final void c0(int i3, long j) {
        U(18);
        L(i3, 1);
        K(j);
    }

    public final void d0(long j) {
        U(8);
        K(j);
    }

    public final void e0(int i3, int i10) {
        U(20);
        L(i3, 0);
        if (i10 >= 0) {
            M(i10);
        } else {
            N(i10);
        }
    }

    public final void f0(int i3) {
        if (i3 >= 0) {
            l0(i3);
        } else {
            n0(i3);
        }
    }

    public final void g0(int i3, AbstractC0401a abstractC0401a, U u2) {
        j0(i3, 2);
        l0(abstractC0401a.a(u2));
        u2.e(abstractC0401a, this.f9811b);
    }

    public final void h0(int i3, String str) {
        j0(i3, 2);
        i0(str);
    }

    public final void i0(String str) {
        try {
            int length = str.length() * 3;
            int R10 = R(length);
            int i3 = R10 + length;
            int i10 = this.f9813d;
            if (i3 > i10) {
                byte[] bArr = new byte[length];
                int h2 = k0.f9816a.h(str, bArr, 0, length);
                l0(h2);
                W(bArr, 0, h2);
                return;
            }
            if (i3 > i10 - this.f9814e) {
                T();
            }
            int R11 = R(str.length());
            int i11 = this.f9814e;
            byte[] bArr2 = this.f9812c;
            try {
                try {
                    if (R11 == R10) {
                        int i12 = i11 + R11;
                        this.f9814e = i12;
                        int h4 = k0.f9816a.h(str, bArr2, i12, i10 - i12);
                        this.f9814e = i11;
                        M((h4 - i11) - R11);
                        this.f9814e = h4;
                    } else {
                        int a3 = k0.a(str);
                        M(a3);
                        this.f9814e = k0.f9816a.h(str, bArr2, this.f9814e, a3);
                    }
                } catch (j0 e10) {
                    this.f9814e = i11;
                    throw e10;
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new B0.v(e11);
            }
        } catch (j0 e12) {
            f9809g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(AbstractC0422w.f9852a);
            try {
                l0(bytes.length);
                u(0, bytes.length, bytes);
            } catch (IndexOutOfBoundsException e13) {
                throw new B0.v(e13);
            }
        }
    }

    public final void j0(int i3, int i10) {
        l0((i3 << 3) | i10);
    }

    public final void k0(int i3, int i10) {
        U(20);
        L(i3, 0);
        M(i10);
    }

    public final void l0(int i3) {
        U(5);
        M(i3);
    }

    public final void m0(int i3, long j) {
        U(20);
        L(i3, 0);
        N(j);
    }

    public final void n0(long j) {
        U(10);
        N(j);
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final void u(int i3, int i10, byte[] bArr) {
        W(bArr, i3, i10);
    }
}
