package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f9764f = new b0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f9765a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f9766b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9767c;

    /* renamed from: d, reason: collision with root package name */
    public int f9768d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9769e;

    public b0(int i3, int[] iArr, Object[] objArr, boolean z2) {
        this.f9765a = i3;
        this.f9766b = iArr;
        this.f9767c = objArr;
        this.f9769e = z2;
    }

    public final void a(int i3) {
        int[] iArr = this.f9766b;
        if (i3 > iArr.length) {
            int i10 = this.f9765a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i3) {
                i3 = i11;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f9766b = Arrays.copyOf(iArr, i3);
            this.f9767c = Arrays.copyOf(this.f9767c, i3);
        }
    }

    public final int b() {
        int Q10;
        int S5;
        int Q11;
        int i3 = this.f9768d;
        if (i3 != -1) {
            return i3;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f9765a; i11++) {
            int i12 = this.f9766b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f9767c[i11]).getClass();
                    Q11 = C0411k.Q(i13) + 8;
                } else if (i14 == 2) {
                    Q11 = C0411k.O(i13, (C0407g) this.f9767c[i11]);
                } else if (i14 == 3) {
                    Q10 = C0411k.Q(i13) * 2;
                    S5 = ((b0) this.f9767c[i11]).b();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(C0424y.b());
                    }
                    ((Integer) this.f9767c[i11]).getClass();
                    Q11 = C0411k.Q(i13) + 4;
                }
                i10 = Q11 + i10;
            } else {
                long longValue = ((Long) this.f9767c[i11]).longValue();
                Q10 = C0411k.Q(i13);
                S5 = C0411k.S(longValue);
            }
            i10 = S5 + Q10 + i10;
        }
        this.f9768d = i10;
        return i10;
    }

    public final void c(int i3, Object obj) {
        if (!this.f9769e) {
            throw new UnsupportedOperationException();
        }
        a(this.f9765a + 1);
        int[] iArr = this.f9766b;
        int i10 = this.f9765a;
        iArr[i10] = i3;
        this.f9767c[i10] = obj;
        this.f9765a = i10 + 1;
    }

    public final void d(D d8) {
        if (this.f9765a == 0) {
            return;
        }
        d8.getClass();
        for (int i3 = 0; i3 < this.f9765a; i3++) {
            int i10 = this.f9766b[i3];
            Object obj = this.f9767c[i3];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            C0411k c0411k = (C0411k) d8.f9705a;
            if (i12 == 0) {
                c0411k.m0(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                c0411k.c0(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                c0411k.Y(i11, (C0407g) obj);
            } else if (i12 == 3) {
                c0411k.j0(i11, 3);
                ((b0) obj).d(d8);
                c0411k.j0(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(C0424y.b());
                }
                c0411k.a0(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        int i3 = this.f9765a;
        if (i3 == b0Var.f9765a) {
            int[] iArr = this.f9766b;
            int[] iArr2 = b0Var.f9766b;
            int i10 = 0;
            while (true) {
                if (i10 >= i3) {
                    Object[] objArr = this.f9767c;
                    Object[] objArr2 = b0Var.f9767c;
                    int i11 = this.f9765a;
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
        int i3 = this.f9765a;
        int i10 = (527 + i3) * 31;
        int[] iArr = this.f9766b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i3; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f9767c;
        int i15 = this.f9765a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
