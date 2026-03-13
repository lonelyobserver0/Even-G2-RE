package x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1901h {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f22619a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01f8, code lost:
    
        if (r13.f22521b == r6) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x027f, code lost:
    
        if (r0.h0[r32] == 2) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
    
        if (r5.f22521b == r4) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(x.C1898e r30, w.C1855d r31, int r32) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC1901h.a(x.e, w.d, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r8 == 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x002f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x003f, code lost:
    
        if (r8 == 2) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARN: Type inference failed for: r0v69, types: [x.d] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [x.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(x.C1898e r35, w.C1855d r36, int r37, int r38, x.C1895b r39) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC1901h.b(x.e, w.d, int, int, x.b):void");
    }

    public static int c(C1899f c1899f, int i3) {
        ArrayList arrayList;
        int i10 = i3 * 2;
        if (i3 == 0) {
            arrayList = c1899f.f22608d;
        } else if (i3 == 1) {
            arrayList = c1899f.f22609e;
        } else {
            c1899f.getClass();
            arrayList = null;
        }
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C1897d c1897d = (C1897d) arrayList.get(i12);
            C1896c[] c1896cArr = c1897d.f22529A;
            i11 = Math.max(i11, d(c1897d, i3, c1896cArr[i10 + 1].f22523d == null || c1896cArr[i10].f22523d != null, 0));
        }
        c1899f.f22607c[i3] = i11;
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(C1897d c1897d, int i3, boolean z2, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int k3;
        int i16;
        int i17;
        C1896c c1896c;
        C1897d c1897d2;
        boolean z10;
        int i18;
        int max;
        if (!c1897d.f22554Z) {
            return 0;
        }
        C1896c c1896c2 = c1897d.f22583w;
        boolean z11 = c1896c2.f22523d != null && i3 == 1;
        if (z2) {
            i12 = c1897d.f22544P;
            i11 = c1897d.g() - c1897d.f22544P;
            i14 = i3 * 2;
            i13 = i14 + 1;
        } else {
            int g10 = c1897d.g();
            i11 = c1897d.f22544P;
            i12 = g10 - i11;
            i13 = i3 * 2;
            i14 = i13 + 1;
        }
        C1896c[] c1896cArr = c1897d.f22529A;
        if (c1896cArr[i13].f22523d == null || c1896cArr[i14].f22523d != null) {
            i15 = 1;
        } else {
            int i19 = i13;
            i13 = i14;
            i14 = i19;
            i15 = -1;
        }
        int i20 = z11 ? i10 - i12 : i10;
        int e10 = e(c1897d, i3) + (c1896cArr[i14].b() * i15);
        int i21 = e10 + i20;
        int k4 = (i3 == 0 ? c1897d.k() : c1897d.g()) * i15;
        Iterator it = c1896cArr[i14].f22520a.f22630a.iterator();
        int i22 = 0;
        while (it.hasNext()) {
            i22 = Math.max(i22, d(((C1902i) ((k) it.next())).f22620c.f22521b, i3, z2, i21));
        }
        Iterator it2 = c1896cArr[i13].f22520a.f22630a.iterator();
        int i23 = 0;
        boolean z12 = z11;
        while (it2.hasNext()) {
            i23 = Math.max(i23, d(((C1902i) ((k) it2.next())).f22620c.f22521b, i3, z2, k4 + i21));
            it2 = it2;
            z12 = z12 ? 1 : 0;
        }
        boolean z13 = z12;
        if (z13) {
            i22 -= i12;
            k3 = i23 + i11;
        } else {
            k3 = i23 + ((i3 == 0 ? c1897d.k() : c1897d.g()) * i15);
        }
        int i24 = 1;
        if (i3 == 1) {
            Iterator it3 = c1896c2.f22520a.f22630a.iterator();
            int i25 = 0;
            while (it3.hasNext()) {
                Iterator it4 = it3;
                C1902i c1902i = (C1902i) ((k) it3.next());
                if (i15 == i24) {
                    max = Math.max(i25, d(c1902i.f22620c.f22521b, i3, z2, i12 + i21));
                    i18 = i12;
                } else {
                    i18 = i12;
                    max = Math.max(i25, d(c1902i.f22620c.f22521b, i3, z2, (i11 * i15) + i21));
                }
                i25 = max;
                it3 = it4;
                i12 = i18;
                i24 = 1;
            }
            int i26 = i12;
            i16 = i25;
            if (c1896c2.f22520a.f22630a.size() > 0 && !z13) {
                i16 = i15 == 1 ? i16 + i26 : i16 - i11;
            }
        } else {
            i16 = 0;
        }
        int max2 = Math.max(i22, Math.max(k3, i16)) + e10;
        int i27 = k4 + i21;
        if (i15 == -1) {
            i27 = i21;
            i21 = i27;
        }
        if (z2) {
            h(c1897d, i3, i21);
            if (i3 == 0) {
                c1897d.f22536H = i21;
                int i28 = i27 - i21;
                c1897d.f22532D = i28;
                int i29 = c1897d.f22545Q;
                if (i28 < i29) {
                    c1897d.f22532D = i29;
                }
                z10 = 1;
            } else {
                z10 = 1;
                z10 = 1;
                if (i3 == 1) {
                    c1897d.v(i21, i27);
                }
            }
            c1897d.f22556a0 = z10;
            i17 = z10;
        } else {
            i17 = 1;
            i17 = 1;
            i17 = 1;
            c1897d.f22576p.a(c1897d, i3);
            if (i3 == 0) {
                c1897d.f22538J = i21;
            } else if (i3 == 1) {
                c1897d.f22539K = i21;
            }
        }
        int[] iArr = c1897d.h0;
        if ((i3 == 0 ? iArr[0] : i3 == i17 ? iArr[i17] : 0) == 3 && c1897d.f22534F != 0.0f) {
            c1897d.f22576p.a(c1897d, i3);
        }
        C1896c c1896c3 = c1896cArr[i14].f22523d;
        if (c1896c3 != null && (c1896c = c1896cArr[i13].f22523d) != null && c1896c3.f22521b == (c1897d2 = c1897d.f22531C) && c1896c.f22521b == c1897d2) {
            c1897d.f22576p.a(c1897d, i3);
        }
        return max2;
    }

    public static int e(C1897d c1897d, int i3) {
        C1897d c1897d2;
        C1896c c1896c;
        int i10 = i3 * 2;
        C1896c[] c1896cArr = c1897d.f22529A;
        C1896c c1896c2 = c1896cArr[i10];
        C1896c c1896c3 = c1896cArr[i10 + 1];
        C1896c c1896c4 = c1896c2.f22523d;
        if (c1896c4 == null || c1896c4.f22521b != (c1897d2 = c1897d.f22531C) || (c1896c = c1896c3.f22523d) == null || c1896c.f22521b != c1897d2) {
            return 0;
        }
        return (int) ((((c1897d2.h(i3) - c1896c2.b()) - c1896c3.b()) - c1897d.h(i3)) * (i3 == 0 ? c1897d.f22549U : c1897d.f22550V));
    }

    public static boolean f(C1897d c1897d, int i3) {
        int[] iArr = c1897d.h0;
        if (iArr[i3] == 3) {
            if (c1897d.f22534F != 0.0f) {
                int i10 = iArr[i3 != 0 ? (char) 0 : (char) 1];
                return false;
            }
            if (i3 != 0 ? c1897d.f22565f == 0 && c1897d.f22571k == 0 && c1897d.f22572l == 0 : c1897d.f22563e == 0 && c1897d.f22569h == 0 && c1897d.f22570i == 0) {
                return true;
            }
        }
        return false;
    }

    public static int g(C1897d c1897d) {
        int[] iArr = c1897d.h0;
        if (iArr[0] == 3) {
            int g10 = (int) (c1897d.f22535G == 0 ? c1897d.g() * c1897d.f22534F : c1897d.g() / c1897d.f22534F);
            c1897d.x(g10);
            return g10;
        }
        if (iArr[1] != 3) {
            return -1;
        }
        int k3 = (int) (c1897d.f22535G == 1 ? c1897d.k() * c1897d.f22534F : c1897d.k() / c1897d.f22534F);
        c1897d.s(k3);
        return k3;
    }

    public static void h(C1897d c1897d, int i3, int i10) {
        int i11 = i3 * 2;
        int i12 = i11 + 1;
        C1896c[] c1896cArr = c1897d.f22529A;
        C1902i c1902i = c1896cArr[i11].f22520a;
        c1902i.f22623f = c1897d.f22531C.f22579s.f22520a;
        c1902i.f22624g = i10;
        c1902i.f22631b = 1;
        C1902i c1902i2 = c1896cArr[i12].f22520a;
        c1902i2.f22623f = c1902i;
        c1902i2.f22624g = c1897d.h(i3);
        c1897d.f22529A[i12].f22520a.f22631b = 1;
    }

    public static void i(ArrayList arrayList, int i3, int i10) {
        HashSet<C1897d> hashSet;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1899f c1899f = (C1899f) arrayList.get(i11);
            if (i3 == 0) {
                hashSet = c1899f.f22610f;
            } else if (i3 == 1) {
                hashSet = c1899f.f22611g;
            } else {
                c1899f.getClass();
                hashSet = null;
            }
            for (C1897d c1897d : hashSet) {
                if (c1897d.f22554Z) {
                    int i12 = i3 * 2;
                    C1896c[] c1896cArr = c1897d.f22529A;
                    C1896c c1896c = c1896cArr[i12];
                    C1896c c1896c2 = c1896cArr[i12 + 1];
                    if (c1896c.f22523d == null || c1896c2.f22523d == null) {
                        if (c1897d.f22534F != 0.0f) {
                            int[] iArr = c1897d.h0;
                            if ((i3 == 0 ? iArr[0] : i3 == 1 ? iArr[1] : 0) == 3) {
                                int g10 = g(c1897d);
                                int i13 = (int) c1896cArr[i12].f22520a.f22624g;
                                int i14 = i13 + g10;
                                C1902i c1902i = c1896c2.f22520a;
                                c1902i.f22623f = c1896c.f22520a;
                                c1902i.f22624g = g10;
                                c1902i.f22631b = 1;
                                if (i3 == 0) {
                                    c1897d.f22536H = i13;
                                    int i15 = i14 - i13;
                                    c1897d.f22532D = i15;
                                    int i16 = c1897d.f22545Q;
                                    if (i15 < i16) {
                                        c1897d.f22532D = i16;
                                    }
                                } else if (i3 == 1) {
                                    c1897d.v(i13, i14);
                                }
                                c1897d.f22556a0 = true;
                            }
                        }
                        int i17 = i10 - (i3 == 0 ? c1897d.f22538J : i3 == 1 ? c1897d.f22539K : 0);
                        int h2 = i17 - c1897d.h(i3);
                        if (i3 == 0) {
                            c1897d.f22536H = h2;
                            int i18 = i17 - h2;
                            c1897d.f22532D = i18;
                            int i19 = c1897d.f22545Q;
                            if (i18 < i19) {
                                c1897d.f22532D = i19;
                            }
                        } else if (i3 == 1) {
                            c1897d.v(h2, i17);
                        }
                        c1897d.f22556a0 = true;
                        h(c1897d, i3, h2);
                    } else {
                        h(c1897d, i3, c1896c.b() + e(c1897d, i3));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x00cc, code lost:
    
        if (r21 != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r21 != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        if (r15.f22521b != r4) goto L34;
     */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(x.C1897d r18, x.C1899f r19, java.util.ArrayList r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC1901h.j(x.d, x.f, java.util.ArrayList, boolean):boolean");
    }
}
