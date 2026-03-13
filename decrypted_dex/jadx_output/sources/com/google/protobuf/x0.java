package com.google.protobuf;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class x0 {

    /* renamed from: f, reason: collision with root package name */
    public static final x0 f12241f = new x0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f12242a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f12243b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f12244c;

    /* renamed from: d, reason: collision with root package name */
    public int f12245d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12246e;

    public x0() {
        this(0, new int[8], new Object[8], true);
    }

    public static x0 e(x0 x0Var, x0 x0Var2) {
        int i3 = x0Var.f12242a + x0Var2.f12242a;
        int[] copyOf = Arrays.copyOf(x0Var.f12243b, i3);
        System.arraycopy(x0Var2.f12243b, 0, copyOf, x0Var.f12242a, x0Var2.f12242a);
        Object[] copyOf2 = Arrays.copyOf(x0Var.f12244c, i3);
        System.arraycopy(x0Var2.f12244c, 0, copyOf2, x0Var.f12242a, x0Var2.f12242a);
        return new x0(i3, copyOf, copyOf2, true);
    }

    public final void a() {
        if (!this.f12246e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i3) {
        int[] iArr = this.f12243b;
        if (i3 > iArr.length) {
            int i10 = this.f12242a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i3) {
                i3 = i11;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f12243b = Arrays.copyOf(iArr, i3);
            this.f12244c = Arrays.copyOf(this.f12244c, i3);
        }
    }

    public final int c() {
        int R10;
        int T7;
        int R11;
        int i3 = this.f12245d;
        if (i3 != -1) {
            return i3;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12242a; i11++) {
            int i12 = this.f12243b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f12244c[i11]).getClass();
                    R11 = AbstractC0747q.R(i13) + 8;
                } else if (i14 == 2) {
                    R11 = AbstractC0747q.N(i13, (AbstractC0733j) this.f12244c[i11]);
                } else if (i14 == 3) {
                    R10 = AbstractC0747q.R(i13) * 2;
                    T7 = ((x0) this.f12244c[i11]).c();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(T.c());
                    }
                    ((Integer) this.f12244c[i11]).getClass();
                    R11 = AbstractC0747q.R(i13) + 4;
                }
                i10 = R11 + i10;
            } else {
                long longValue = ((Long) this.f12244c[i11]).longValue();
                R10 = AbstractC0747q.R(i13);
                T7 = AbstractC0747q.T(longValue);
            }
            i10 = T7 + R10 + i10;
        }
        this.f12245d = i10;
        return i10;
    }

    public final boolean d(int i3, AbstractC0741n abstractC0741n) {
        int z2;
        a();
        int i10 = i3 >>> 3;
        int i11 = i3 & 7;
        if (i11 == 0) {
            f(i3, Long.valueOf(abstractC0741n.r()));
            return true;
        }
        if (i11 == 1) {
            f(i3, Long.valueOf(abstractC0741n.o()));
            return true;
        }
        if (i11 == 2) {
            f(i3, abstractC0741n.k());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw T.c();
            }
            f(i3, Integer.valueOf(abstractC0741n.n()));
            return true;
        }
        x0 x0Var = new x0();
        do {
            z2 = abstractC0741n.z();
            if (z2 == 0) {
                break;
            }
        } while (x0Var.d(z2, abstractC0741n));
        abstractC0741n.a((i10 << 3) | 4);
        f(i3, x0Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        int i3 = this.f12242a;
        if (i3 == x0Var.f12242a) {
            int[] iArr = this.f12243b;
            int[] iArr2 = x0Var.f12243b;
            int i10 = 0;
            while (true) {
                if (i10 >= i3) {
                    Object[] objArr = this.f12244c;
                    Object[] objArr2 = x0Var.f12244c;
                    int i11 = this.f12242a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final void f(int i3, Object obj) {
        a();
        b(this.f12242a + 1);
        int[] iArr = this.f12243b;
        int i10 = this.f12242a;
        iArr[i10] = i3;
        this.f12244c[i10] = obj;
        this.f12242a = i10 + 1;
    }

    public final void g(C0720c0 c0720c0) {
        if (this.f12242a == 0) {
            return;
        }
        c0720c0.getClass();
        for (int i3 = 0; i3 < this.f12242a; i3++) {
            int i10 = this.f12243b[i3];
            Object obj = this.f12244c[i3];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            AbstractC0747q abstractC0747q = (AbstractC0747q) c0720c0.f12143a;
            if (i12 == 0) {
                abstractC0747q.j0(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                abstractC0747q.a0(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                abstractC0747q.X(i11, (AbstractC0733j) obj);
            } else if (i12 == 3) {
                abstractC0747q.g0(i11, 3);
                ((x0) obj).g(c0720c0);
                abstractC0747q.g0(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(T.c());
                }
                abstractC0747q.Y(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i3 = this.f12242a;
        int i10 = (527 + i3) * 31;
        int[] iArr = this.f12243b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i3; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f12244c;
        int i15 = this.f12242a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public x0(int i3, int[] iArr, Object[] objArr, boolean z2) {
        this.f12245d = -1;
        this.f12242a = i3;
        this.f12243b = iArr;
        this.f12244c = objArr;
        this.f12246e = z2;
    }
}
