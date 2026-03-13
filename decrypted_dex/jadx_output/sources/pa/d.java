package pa;

import com.stub.StubApp;
import f4.C0882f;
import i2.u;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d extends FilterInputStream {

    /* renamed from: A, reason: collision with root package name */
    public static final C0882f f19730A;

    /* renamed from: q, reason: collision with root package name */
    public static final short[][] f19731q = {new short[]{2, 3}, new short[]{2, 3}, new short[]{2, 3}, new short[]{3}, new short[]{4, 5}, new short[]{4, 5, 7}, new short[]{4, 7}, new short[]{24}, new short[]{23, 24, 55, 8, 15}, new short[]{23, 24, 40, 55, 103, 104, 108, 8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31, 36, 39, 40, 43, 44, 51, 52, 53, 55, 56, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 200, 201, 202, 203, 204, 205, 210, 211, 212, 213, 214, 215, 218, 219}, new short[]{74, 75, 76, 77, 82, 83, 84, 85, 90, 91, 100, 101, 108, 109, 114, 115, 116, 117, 118, 119}};

    /* renamed from: r, reason: collision with root package name */
    public static final short[][] f19732r = {new short[]{3, 2}, new short[]{1, 4}, new short[]{6, 5}, new short[]{7}, new short[]{9, 8}, new short[]{10, 11, 12}, new short[]{13, 14}, new short[]{15}, new short[]{16, 17, 0, 18, 64}, new short[]{24, 25, 23, 22, 19, 20, 21, 1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560, 52, 55, 56, 59, 60, 320, 384, 448, 53, 54, 50, 51, 44, 45, 46, 47, 57, 58, 61, 256, 48, 49, 62, 63, 30, 31, 32, 33, 40, 41, 128, 192, 26, 27, 28, 29, 34, 35, 36, 37, 38, 39, 42, 43}, new short[]{640, 704, 768, 832, 1280, 1344, 1408, 1472, 1536, 1600, 1664, 1728, 512, 576, 896, 960, 1024, 1088, 1152, 1216}};

    /* renamed from: s, reason: collision with root package name */
    public static final short[][] f19733s = {new short[]{7, 8, 11, 12, 14, 15}, new short[]{18, 19, 20, 27, 7, 8}, new short[]{23, 24, 42, 43, 3, 52, 53, 7, 8}, new short[]{19, 23, 24, 36, 39, 40, 43, 3, 55, 4, 8, 12}, new short[]{18, 19, 20, 21, 22, 23, 26, 27, 2, 36, 37, 40, 41, 42, 43, 44, 45, 3, 50, 51, 52, 53, 54, 55, 4, 74, 75, 5, 82, 83, 84, 85, 88, 89, 90, 91, 100, 101, 103, 104, 10, 11}, new short[]{152, 153, 154, 155, 204, 205, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219}, new short[0], new short[]{8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31}};

    /* renamed from: t, reason: collision with root package name */
    public static final short[][] f19734t = {new short[]{2, 3, 4, 5, 6, 7}, new short[]{128, 8, 9, 64, 10, 11}, new short[]{192, 1664, 16, 17, 13, 14, 15, 1, 12}, new short[]{26, 21, 28, 27, 18, 24, 25, 22, 256, 23, 20, 19}, new short[]{33, 34, 35, 36, 37, 38, 31, 32, 29, 53, 54, 39, 40, 41, 42, 43, 44, 30, 61, 62, 63, 0, 320, 384, 45, 59, 60, 46, 49, 50, 51, 52, 55, 56, 57, 58, 448, 512, 640, 576, 47, 48}, new short[]{1472, 1536, 1600, 1728, 704, 768, 832, 896, 960, 1024, 1088, 1152, 1216, 1280, 1344, 1408}, new short[0], new short[]{1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560}};

    /* renamed from: v, reason: collision with root package name */
    public static final c f19735v;

    /* renamed from: w, reason: collision with root package name */
    public static final c f19736w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0882f f19737x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0882f f19738y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0882f f19739z;

    /* renamed from: a, reason: collision with root package name */
    public final int f19740a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19741b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19742c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19743d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19744e;

    /* renamed from: f, reason: collision with root package name */
    public int f19745f;

    /* renamed from: g, reason: collision with root package name */
    public int f19746g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f19747h;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f19748k;

    /* renamed from: l, reason: collision with root package name */
    public int f19749l;

    /* renamed from: m, reason: collision with root package name */
    public int f19750m;

    /* renamed from: n, reason: collision with root package name */
    public int f19751n;

    /* renamed from: p, reason: collision with root package name */
    public int f19752p;

    static {
        c cVar = new c();
        f19735v = cVar;
        cVar.f19729e = true;
        cVar.f19727c = -2000;
        c cVar2 = new c();
        f19736w = cVar2;
        cVar2.f19727c = -1000;
        cVar2.f19725a = cVar2;
        cVar2.f19726b = cVar;
        C0882f c0882f = new C0882f(15);
        f19739z = c0882f;
        try {
            c0882f.g(0, cVar2);
            c0882f.g(1, cVar);
            f19737x = new C0882f(15);
            for (int i3 = 0; i3 < 12; i3++) {
                int i10 = 0;
                while (true) {
                    try {
                        short[] sArr = f19731q[i3];
                        if (i10 < sArr.length) {
                            f19737x.f(i3 + 2, sArr[i10], f19732r[i3][i10]);
                            i10++;
                        }
                    } catch (IOException e10) {
                        throw new AssertionError(e10);
                    }
                }
            }
            C0882f c0882f2 = f19737x;
            c0882f2.g(0, f19736w);
            c0882f2.g(1, f19735v);
            f19738y = new C0882f(15);
            for (int i11 = 0; i11 < 9; i11++) {
                int i12 = 0;
                while (true) {
                    try {
                        short[] sArr2 = f19733s[i11];
                        if (i12 < sArr2.length) {
                            f19738y.f(i11 + 4, sArr2[i12], f19734t[i11][i12]);
                            i12++;
                        }
                    } catch (IOException e11) {
                        throw new AssertionError(e11);
                    }
                }
            }
            C0882f c0882f3 = f19738y;
            c0882f3.g(0, f19736w);
            c0882f3.g(1, f19735v);
            C0882f c0882f4 = new C0882f(15);
            f19730A = c0882f4;
            try {
                c0882f4.f(4, 1, -3000);
                c0882f4.f(3, 1, -4000);
                c0882f4.f(1, 1, 0);
                c0882f4.f(3, 3, 1);
                c0882f4.f(6, 3, 2);
                c0882f4.f(7, 3, 3);
                c0882f4.f(3, 2, -1);
                c0882f4.f(6, 2, -2);
                c0882f4.f(7, 2, -3);
            } catch (IOException e12) {
                throw new AssertionError(e12);
            }
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public d(InputStream inputStream, int i3, int i10, long j, boolean z2) {
        super(inputStream);
        this.f19750m = 0;
        this.f19751n = -1;
        this.f19752p = -1;
        this.f19740a = i3;
        this.f19744e = i10;
        this.f19741b = new byte[(i3 + 7) / 8];
        int i11 = i3 + 2;
        this.f19747h = new int[i11];
        this.j = new int[i11];
        if (i10 == 2) {
            this.f19743d = z2;
            this.f19742c = false;
        } else if (i10 == 3) {
            this.f19743d = z2;
            this.f19742c = (1 & j) != 0;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException(u.p(i10, StubApp.getString2(22141)));
            }
            this.f19743d = z2;
            this.f19742c = false;
        }
    }

    public final void a() {
        int i3 = 0;
        this.f19749l = 0;
        boolean z2 = true;
        do {
            i3 += z2 ? h(f19738y) : h(f19737x);
            int[] iArr = this.j;
            int i10 = this.f19749l;
            this.f19749l = i10 + 1;
            iArr[i10] = i3;
            z2 = !z2;
        } while (i3 < this.f19740a);
    }

    public final void d() {
        int i3;
        this.f19748k = this.f19749l;
        int[] iArr = this.j;
        this.j = this.f19747h;
        this.f19747h = iArr;
        int i10 = 0;
        this.f19749l = 0;
        boolean z2 = true;
        while (true) {
            int i11 = this.f19740a;
            if (i10 >= i11) {
                return;
            }
            c cVar = (c) f19730A.f13748b;
            while (true) {
                cVar = v() ? cVar.f19726b : cVar.f19725a;
                if (cVar != null) {
                    if (cVar.f19729e) {
                        int i12 = cVar.f19727c;
                        if (i12 == -4000) {
                            C0882f c0882f = f19737x;
                            C0882f c0882f2 = f19738y;
                            int h2 = h(z2 ? c0882f2 : c0882f) + i10;
                            int[] iArr2 = this.j;
                            int i13 = this.f19749l;
                            this.f19749l = i13 + 1;
                            iArr2[i13] = h2;
                            if (!z2) {
                                c0882f = c0882f2;
                            }
                            i10 = h(c0882f) + h2;
                            int[] iArr3 = this.j;
                            int i14 = this.f19749l;
                            this.f19749l = i14 + 1;
                            iArr3[i14] = i10;
                        } else if (i12 != -3000) {
                            int p8 = p(i10, z2);
                            if (p8 >= this.f19748k || p8 == -1) {
                                i3 = cVar.f19727c;
                            } else {
                                i3 = this.f19747h[p8];
                                i11 = cVar.f19727c;
                            }
                            i10 = i3 + i11;
                            int[] iArr4 = this.j;
                            int i15 = this.f19749l;
                            iArr4[i15] = i10;
                            this.f19749l = i15 + 1;
                            z2 = !z2;
                        } else {
                            int p9 = p(i10, z2) + 1;
                            i10 = p9 >= this.f19748k ? i11 : this.f19747h[p9];
                        }
                    }
                }
            }
        }
    }

    public final void e() {
        int i3;
        int i10;
        byte[] bArr;
        boolean z2 = this.f19743d;
        int i11 = this.f19744e;
        if (i11 == 2) {
            if (z2) {
                this.f19752p = -1;
            }
            a();
        } else if (i11 == 3) {
            if (z2) {
                this.f19752p = -1;
            }
            loop4: while (true) {
                c cVar = (c) f19739z.f13748b;
                do {
                    cVar = v() ? cVar.f19726b : cVar.f19725a;
                    if (cVar == null) {
                        break;
                    }
                } while (!cVar.f19729e);
                if (this.f19742c || v()) {
                    a();
                } else {
                    d();
                }
            }
            if (this.f19742c) {
            }
            a();
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException(u.p(i11, StubApp.getString2(22141)));
            }
            if (z2) {
                this.f19752p = -1;
            }
            d();
        }
        this.f19750m = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            int i14 = this.f19749l;
            i3 = this.f19740a;
            if (i12 > i14) {
                break;
            }
            int i15 = i12 != i14 ? this.j[i12] : i3;
            if (i15 <= i3) {
                i3 = i15;
            }
            int i16 = i13 / 8;
            while (true) {
                i10 = i13 % 8;
                bArr = this.f19741b;
                if (i10 == 0 || i3 - i13 <= 0) {
                    break;
                }
                bArr[i16] = (byte) ((z10 ? 0 : 1 << (7 - i10)) | bArr[i16]);
                i13++;
            }
            if (i10 == 0) {
                i16 = i13 / 8;
                byte b2 = (byte) (z10 ? 0 : 255);
                while (i3 - i13 > 7) {
                    bArr[i16] = b2;
                    i13 += 8;
                    i16++;
                }
            }
            while (i3 - i13 > 0) {
                int i17 = i13 % 8;
                if (i17 == 0) {
                    bArr[i16] = 0;
                }
                bArr[i16] = (byte) ((z10 ? 0 : 1 << (7 - i17)) | bArr[i16]);
                i13++;
            }
            z10 = !z10;
            i12++;
        }
        if (i13 != i3) {
            throw new IOException(Xa.h.o(StubApp.getString2(22142), i13, i3, StubApp.getString2(21089)));
        }
        this.f19745f = (i13 + 7) / 8;
    }

    public final int h(C0882f c0882f) {
        c cVar = (c) c0882f.f13748b;
        int i3 = 0;
        while (true) {
            cVar = v() ? cVar.f19726b : cVar.f19725a;
            if (cVar == null) {
                throw new IOException(StubApp.getString2(22143));
            }
            if (cVar.f19729e) {
                int i10 = cVar.f19727c;
                i3 += i10;
                if (i10 < 64) {
                    return i10 >= 0 ? i3 : this.f19740a;
                }
                cVar = (c) c0882f.f13748b;
            }
        }
    }

    public final void k() {
        if (this.f19746g >= this.f19745f) {
            this.f19745f = 0;
            try {
                e();
            } catch (EOFException e10) {
                if (this.f19745f != 0) {
                    throw e10;
                }
                this.f19745f = -1;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new IOException(StubApp.getString2(22144), e11);
            }
            this.f19746g = 0;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public final int p(int i3, boolean z2) {
        int i10 = (this.f19750m & (-2)) + (!z2 ? 1 : 0);
        if (i10 > 2) {
            i10 -= 2;
        }
        if (i3 == 0) {
            return i10;
        }
        while (i10 < this.f19748k) {
            if (i3 < this.f19747h[i10]) {
                this.f19750m = i10;
                return i10;
            }
            i10 += 2;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i3 = this.f19745f;
        if (i3 < 0) {
            return 0;
        }
        if (this.f19746g >= i3) {
            k();
            if (this.f19745f < 0) {
                return 0;
            }
        }
        int i10 = this.f19746g;
        this.f19746g = i10 + 1;
        return this.f19741b[i10] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new IOException(StubApp.getString2("22145"));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int i3 = this.f19745f;
        if (i3 < 0) {
            return -1L;
        }
        if (this.f19746g >= i3) {
            k();
            if (this.f19745f < 0) {
                return -1L;
            }
        }
        int min = (int) Math.min(this.f19745f - this.f19746g, j);
        this.f19746g += min;
        return min;
    }

    public final boolean v() {
        int i3 = this.f19752p;
        if (i3 < 0 || i3 > 7) {
            int read = ((FilterInputStream) this).in.read();
            this.f19751n = read;
            if (read == -1) {
                throw new EOFException(StubApp.getString2(22146));
            }
            this.f19752p = 0;
        }
        int i10 = this.f19751n;
        boolean z2 = (i10 & 128) != 0;
        this.f19751n = i10 << 1;
        this.f19752p++;
        return z2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        int i11 = this.f19745f;
        if (i11 < 0) {
            Arrays.fill(bArr, i3, i3 + i10, (byte) 0);
            return i10;
        }
        if (this.f19746g >= i11) {
            k();
            if (this.f19745f < 0) {
                Arrays.fill(bArr, i3, i3 + i10, (byte) 0);
                return i10;
            }
        }
        int min = Math.min(this.f19745f - this.f19746g, i10);
        System.arraycopy(this.f19741b, this.f19746g, bArr, i3, min);
        this.f19746g += min;
        return min;
    }
}
