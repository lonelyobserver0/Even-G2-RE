package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.c2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0599c2 extends F1 {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f11462i = Logger.getLogger(C0599c2.class.getName());
    public static final boolean j = U2.f11390e;

    /* renamed from: e, reason: collision with root package name */
    public C0708y2 f11463e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f11464f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11465g;

    /* renamed from: h, reason: collision with root package name */
    public int f11466h;

    public C0599c2(byte[] bArr, int i3) {
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(Xa.h.o(StubApp.getString2(11896), length, i3, StubApp.getString2(11897)));
        }
        this.f11464f = bArr;
        this.f11466h = 0;
        this.f11465g = i3;
    }

    public static int C(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public static int D(String str) {
        int length;
        try {
            length = W2.b(str);
        } catch (V2 unused) {
            length = str.getBytes(AbstractC0673r2.f11652a).length;
        }
        return T(length) + length;
    }

    public static int T(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public final void E(int i3, int i10) {
        N((i3 << 3) | i10);
    }

    public final void F(int i3, int i10) {
        N(i3 << 3);
        M(i10);
    }

    public final void G(int i3, int i10) {
        N(i3 << 3);
        N(i10);
    }

    public final void H(int i3, int i10) {
        N((i3 << 3) | 5);
        O(i10);
    }

    public final void I(int i3, long j3) {
        N(i3 << 3);
        P(j3);
    }

    public final void J(int i3, long j3) {
        N((i3 << 3) | 1);
        Q(j3);
    }

    public final void K(C0594b2 c0594b2) {
        N(c0594b2.c());
        R(c0594b2.c(), c0594b2.f11455b);
    }

    public final void L(byte b2) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.f11466h;
        try {
            int i10 = i3 + 1;
            try {
                this.f11464f[i3] = b2;
                this.f11466h = i10;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i3 = i10;
                throw new B0.v(i3, this.f11465g, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
        }
    }

    public final void M(int i3) {
        if (i3 >= 0) {
            N(i3);
        } else {
            P(i3);
        }
    }

    public final void N(int i3) {
        int i10;
        int i11 = this.f11466h;
        while (true) {
            int i12 = i3 & (-128);
            byte[] bArr = this.f11464f;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i3;
                this.f11466h = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i3 | 128);
                    i3 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new B0.v(i10, this.f11465g, 1, e10);
                }
            }
            throw new B0.v(i10, this.f11465g, 1, e10);
        }
    }

    public final void O(int i3) {
        int i10 = this.f11466h;
        try {
            byte[] bArr = this.f11464f;
            bArr[i10] = (byte) i3;
            bArr[i10 + 1] = (byte) (i3 >> 8);
            bArr[i10 + 2] = (byte) (i3 >> 16);
            bArr[i10 + 3] = (byte) (i3 >> 24);
            this.f11466h = i10 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new B0.v(i10, this.f11465g, 4, e10);
        }
    }

    public final void P(long j3) {
        int i3;
        int i10 = this.f11466h;
        byte[] bArr = this.f11464f;
        boolean z2 = j;
        int i11 = this.f11465g;
        if (!z2 || i11 - i10 < 10) {
            long j10 = j3;
            while ((j10 & (-128)) != 0) {
                i3 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i10 = i3;
                } catch (IndexOutOfBoundsException e10) {
                    throw new B0.v(i3, i11, 1, e10);
                }
            }
            i3 = i10 + 1;
            bArr[i10] = (byte) j10;
        } else {
            long j11 = j3;
            while ((j11 & (-128)) != 0) {
                U2.f11388c.a(bArr, U2.f11391f + i10, (byte) (((int) j11) | 128));
                j11 >>>= 7;
                i10++;
            }
            i3 = i10 + 1;
            U2.f11388c.a(bArr, U2.f11391f + i10, (byte) j11);
        }
        this.f11466h = i3;
    }

    public final void Q(long j3) {
        int i3 = this.f11466h;
        try {
            byte[] bArr = this.f11464f;
            bArr[i3] = (byte) j3;
            bArr[i3 + 1] = (byte) (j3 >> 8);
            bArr[i3 + 2] = (byte) (j3 >> 16);
            bArr[i3 + 3] = (byte) (j3 >> 24);
            bArr[i3 + 4] = (byte) (j3 >> 32);
            bArr[i3 + 5] = (byte) (j3 >> 40);
            bArr[i3 + 6] = (byte) (j3 >> 48);
            bArr[i3 + 7] = (byte) (j3 >> 56);
            this.f11466h = i3 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new B0.v(i3, this.f11465g, 8, e10);
        }
    }

    public final void R(int i3, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f11464f, this.f11466h, i3);
            this.f11466h += i3;
        } catch (IndexOutOfBoundsException e10) {
            throw new B0.v(this.f11466h, this.f11465g, i3, e10);
        }
    }

    public final void S(String str) {
        int i3 = this.f11466h;
        try {
            int T7 = T(str.length() * 3);
            int T10 = T(str.length());
            byte[] bArr = this.f11464f;
            int i10 = this.f11465g;
            if (T10 != T7) {
                N(W2.b(str));
                int i11 = this.f11466h;
                this.f11466h = W2.c(str, bArr, i11, i10 - i11);
            } else {
                int i12 = i3 + T10;
                this.f11466h = i12;
                int c10 = W2.c(str, bArr, i12, i10 - i12);
                this.f11466h = i3;
                N((c10 - i3) - T10);
                this.f11466h = c10;
            }
        } catch (V2 e10) {
            this.f11466h = i3;
            f11462i.logp(Level.WARNING, StubApp.getString2(11900), StubApp.getString2(11898), StubApp.getString2(11899), (Throwable) e10);
            byte[] bytes = str.getBytes(AbstractC0673r2.f11652a);
            try {
                int length = bytes.length;
                N(length);
                R(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new B0.v(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new B0.v(e12);
        }
    }
}
