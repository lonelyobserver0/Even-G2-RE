package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class P2 {

    /* renamed from: f, reason: collision with root package name */
    public static final P2 f11341f = new P2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f11342a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11343b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f11344c;

    /* renamed from: d, reason: collision with root package name */
    public int f11345d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11346e;

    public P2(int i3, int[] iArr, Object[] objArr, boolean z2) {
        this.f11342a = i3;
        this.f11343b = iArr;
        this.f11344c = objArr;
        this.f11346e = z2;
    }

    public static P2 a() {
        return new P2(0, new int[8], new Object[8], true);
    }

    public final void b(C0708y2 c0708y2) {
        if (this.f11342a != 0) {
            for (int i3 = 0; i3 < this.f11342a; i3++) {
                int i10 = this.f11343b[i3];
                Object obj = this.f11344c[i3];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    ((C0599c2) c0708y2.f11771a).I(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    ((C0599c2) c0708y2.f11771a).J(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    C0599c2 c0599c2 = (C0599c2) c0708y2.f11771a;
                    c0599c2.N((i12 << 3) | 2);
                    c0599c2.K((C0594b2) obj);
                } else if (i11 == 3) {
                    ((C0599c2) c0708y2.f11771a).E(i12, 3);
                    ((P2) obj).b(c0708y2);
                    ((C0599c2) c0708y2.f11771a).E(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new C0678s2());
                    }
                    ((C0599c2) c0708y2.f11771a).H(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int T7;
        int C10;
        int T10;
        int i3 = this.f11345d;
        if (i3 != -1) {
            return i3;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f11342a; i11++) {
            int i12 = this.f11343b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f11344c[i11]).getClass();
                    T10 = C0599c2.T(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    C0594b2 c0594b2 = (C0594b2) this.f11344c[i11];
                    int T11 = C0599c2.T(i15);
                    int c10 = c0594b2.c();
                    i10 = Xa.h.e(c10, c10, T11, i10);
                } else if (i14 == 3) {
                    int T12 = C0599c2.T(i13 << 3);
                    T7 = T12 + T12;
                    C10 = ((P2) this.f11344c[i11]).c();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new C0678s2());
                    }
                    ((Integer) this.f11344c[i11]).getClass();
                    T10 = C0599c2.T(i13 << 3) + 4;
                }
                i10 = T10 + i10;
            } else {
                int i16 = i13 << 3;
                long longValue = ((Long) this.f11344c[i11]).longValue();
                T7 = C0599c2.T(i16);
                C10 = C0599c2.C(longValue);
            }
            i10 = C10 + T7 + i10;
        }
        this.f11345d = i10;
        return i10;
    }

    public final void d(int i3, Object obj) {
        if (!this.f11346e) {
            throw new UnsupportedOperationException();
        }
        e(this.f11342a + 1);
        int[] iArr = this.f11343b;
        int i10 = this.f11342a;
        iArr[i10] = i3;
        this.f11344c[i10] = obj;
        this.f11342a = i10 + 1;
    }

    public final void e(int i3) {
        int[] iArr = this.f11343b;
        if (i3 > iArr.length) {
            int i10 = this.f11342a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i3) {
                i3 = i11;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f11343b = Arrays.copyOf(iArr, i3);
            this.f11344c = Arrays.copyOf(this.f11344c, i3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof P2)) {
            return false;
        }
        P2 p22 = (P2) obj;
        int i3 = this.f11342a;
        if (i3 == p22.f11342a) {
            int[] iArr = this.f11343b;
            int[] iArr2 = p22.f11343b;
            int i10 = 0;
            while (true) {
                if (i10 >= i3) {
                    Object[] objArr = this.f11344c;
                    Object[] objArr2 = p22.f11344c;
                    int i11 = this.f11342a;
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

    public final int hashCode() {
        int i3 = this.f11342a;
        int i10 = i3 + 527;
        int[] iArr = this.f11343b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i3; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.f11344c;
        int i15 = this.f11342a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
