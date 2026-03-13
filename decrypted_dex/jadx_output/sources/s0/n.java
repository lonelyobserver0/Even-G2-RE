package s0;

import T0.J;
import java.util.Arrays;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f20647a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f20648b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f20649c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f20650d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i3, int i10, boolean[] zArr) {
        int i11 = i10 - i3;
        AbstractC1550k.g(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            a(zArr);
            return i3 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i3] == 1) {
            a(zArr);
            return i3 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i3] == 0 && bArr[i3 + 1] == 1) {
            a(zArr);
            return i3 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i3 + 2;
        while (i13 < i12) {
            byte b2 = bArr[i13];
            if ((b2 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static boolean c(byte b2) {
        if (((b2 & 96) >> 5) != 0) {
            return true;
        }
        int i3 = b2 & 31;
        return (i3 == 1 || i3 == 9 || i3 == 14) ? false : true;
    }

    public static Z9.n d(J j) {
        j.s();
        int i3 = j.i(6);
        int i10 = j.i(6);
        j.i(3);
        return new Z9.n(i3, i10, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s0.g e(T0.J r19, boolean r20, int r21, s0.g r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.i(r5)
            boolean r8 = r0.h()
            r9 = 5
            int r9 = r0.i(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.h()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.i(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r16 = r4
            r17 = r8
            r14 = r9
            r15 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f20602a
            boolean r8 = r2.f20603b
            int r9 = r2.f20604c
            int r11 = r2.f20605d
            int[] r4 = r2.f20606e
            r13 = r3
            goto L3b
        L50:
            r16 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r17 = r15
        L57:
            int r18 = r0.i(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.h()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.h()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.t(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.t(r6)
        L7b:
            s0.g r12 = new s0.g
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.n.e(T0.J, boolean, int, s0.g):s0.g");
    }

    public static i2.o f(int i3, int i10, byte[] bArr) {
        byte b2;
        int i11 = i3 + 2;
        do {
            i10--;
            b2 = bArr[i10];
            if (b2 != 0) {
                break;
            }
        } while (i10 > i11);
        if (b2 == 0 || i10 <= i11) {
            return null;
        }
        J j = new J(bArr, i11, i10 + 1);
        while (j.d(16)) {
            int i12 = j.i(8);
            int i13 = 0;
            while (i12 == 255) {
                i13 += 255;
                i12 = j.i(8);
            }
            int i14 = i13 + i12;
            int i15 = j.i(8);
            int i16 = 0;
            while (i15 == 255) {
                i16 += 255;
                i15 = j.i(8);
            }
            int i17 = i16 + i15;
            if (i17 == 0 || !j.d(i17)) {
                return null;
            }
            if (i14 == 176) {
                int m4 = j.m();
                boolean h2 = j.h();
                int m10 = h2 ? j.m() : 0;
                int m11 = j.m();
                int i18 = -1;
                for (int i19 = 0; i19 <= m11; i19++) {
                    i18 = j.m();
                    j.m();
                    int i20 = j.i(6);
                    if (i20 == 63) {
                        return null;
                    }
                    j.i(i20 == 0 ? Math.max(0, m4 - 30) : Math.max(0, (i20 + m4) - 31));
                    if (h2) {
                        int i21 = j.i(6);
                        if (i21 == 63) {
                            return null;
                        }
                        j.i(i21 == 0 ? Math.max(0, m10 - 30) : Math.max(0, (i21 + m10) - 31));
                    }
                    if (j.h()) {
                        j.t(10);
                    }
                }
                return new i2.o(i18);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s0.j g(byte[] r30, int r31, int r32, p2.h r33) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.n.g(byte[], int, int, p2.h):s0.j");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p2.h h(int r40, int r41, byte[] r42) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.n.h(int, int, byte[]):p2.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s0.m i(int r30, int r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.n.i(int, int, byte[]):s0.m");
    }

    public static void j(J j) {
        int m4 = j.m() + 1;
        j.t(8);
        for (int i3 = 0; i3 < m4; i3++) {
            j.m();
            j.m();
            j.s();
        }
        j.t(20);
    }

    public static int k(int i3, byte[] bArr) {
        int i10;
        synchronized (f20649c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i3) {
                while (true) {
                    if (i11 >= i3 - 2) {
                        i11 = i3;
                        break;
                    }
                    try {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i3) {
                    int[] iArr = f20650d;
                    if (iArr.length <= i12) {
                        f20650d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f20650d[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i3 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f20650d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }
}
