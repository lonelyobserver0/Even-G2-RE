package g6;

import N5.o;
import androidx.recyclerview.widget.o0;
import f4.C0879c;

/* renamed from: g6.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC0961f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0879c f14233a = new C0879c(4);

    /* JADX WARN: Multi-variable type inference failed */
    public static C0957b a(C0959d c0959d) {
        int i3;
        C0957b c0957b;
        int[] iArr;
        int i10;
        o0 o0Var;
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        o0 o0Var2 = null;
        if (c0959d == null) {
            return null;
        }
        o0 A4 = c0959d.A();
        int i11 = -1;
        o0[] o0VarArr = (o0[]) c0959d.f8675c;
        boolean z2 = c0959d.f14231d;
        C0957b c0957b2 = (C0957b) c0959d.f8674b;
        if (A4 == null) {
            iArr = null;
            c0957b = 0;
        } else {
            o oVar5 = z2 ? c0957b2.f14220b : c0957b2.f14222d;
            o oVar6 = z2 ? c0957b2.f14221c : c0957b2.f14223e;
            int p8 = c0959d.p((int) oVar5.f4927b);
            int p9 = c0959d.p((int) oVar6.f4927b);
            int i12 = -1;
            int i13 = 0;
            int i14 = 1;
            while (true) {
                i3 = A4.f10267f;
                if (p8 >= p9) {
                    break;
                }
                o0 o0Var3 = o0VarArr[p8];
                if (o0Var3 == null) {
                    o0Var = o0Var2;
                } else {
                    o0Var3.d();
                    int i15 = o0Var3.f10267f;
                    o0Var = o0Var2;
                    int i16 = i15 - i12;
                    if (i16 == 0) {
                        i13++;
                    } else if (i16 == 1) {
                        i14 = Math.max(i14, i13);
                        i12 = o0Var3.f10267f;
                        i13 = 1;
                    } else if (i15 >= i3) {
                        o0VarArr[p8] = o0Var;
                    } else {
                        i13 = 1;
                        i12 = i15;
                    }
                }
                p8++;
                o0Var2 = o0Var;
            }
            c0957b = o0Var2;
            iArr = new int[i3];
            for (o0 o0Var4 : o0VarArr) {
                if (o0Var4 != null && (i10 = o0Var4.f10267f) < i3) {
                    iArr[i10] = iArr[i10] + 1;
                }
            }
        }
        if (iArr == null) {
            return c0957b;
        }
        for (int i17 : iArr) {
            i11 = Math.max(i11, i17);
        }
        int i18 = 0;
        for (int i19 : iArr) {
            i18 += i11 - i19;
            if (i19 > 0) {
                break;
            }
        }
        for (int i20 = 0; i18 > 0 && o0VarArr[i20] == null; i20++) {
            i18--;
        }
        int i21 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i22 = iArr[length];
            i21 += i11 - i22;
            if (i22 > 0) {
                break;
            }
        }
        for (int length2 = o0VarArr.length - 1; i21 > 0 && o0VarArr[length2] == null; length2--) {
            i21--;
        }
        o oVar7 = c0957b2.f14220b;
        o oVar8 = c0957b2.f14222d;
        if (i18 > 0) {
            o oVar9 = z2 ? oVar7 : oVar8;
            o oVar10 = new o(oVar9.f4926a, ((int) oVar9.f4927b) - i18 >= 0 ? r6 : 0);
            if (z2) {
                oVar2 = oVar8;
                oVar = oVar10;
            } else {
                oVar = oVar7;
                oVar2 = oVar10;
            }
        } else {
            oVar = oVar7;
            oVar2 = oVar8;
        }
        o oVar11 = c0957b2.f14221c;
        o oVar12 = c0957b2.f14223e;
        if (i21 > 0) {
            o oVar13 = z2 ? oVar11 : oVar12;
            int i23 = ((int) oVar13.f4927b) + i21;
            int i24 = c0957b2.f14219a.f7184b;
            if (i23 >= i24) {
                i23 = i24 - 1;
            }
            o oVar14 = new o(oVar13.f4926a, i23);
            if (z2) {
                oVar4 = oVar12;
                oVar3 = oVar14;
            } else {
                oVar3 = oVar11;
                oVar4 = oVar14;
            }
        } else {
            oVar3 = oVar11;
            oVar4 = oVar12;
        }
        return new C0957b(c0957b2.f14219a, oVar, oVar3, oVar2, oVar4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x052e, code lost:
    
        if (r7 == 924) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0534, code lost:
    
        if (r11 >= r26[0]) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x053a, code lost:
    
        if (r26[r11] >= 900) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0542, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0546, code lost:
    
        if (r8 >= 6) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0548, code lost:
    
        ((java.lang.StringBuilder) r4.f5711b).append((char) (((byte) (r14 >> ((5 - r8) * 8))) & kotlin.UByte.MAX_VALUE));
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x055f, code lost:
    
        r21 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Ac.f b(int r25, int[] r26, int[] r27) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.AbstractC0961f.b(int, int[], int[]):Ac.f");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c A[EDGE_INSN: B:31:0x005c->B:32:0x005c BREAK  A[LOOP:2: B:19:0x0043->B:27:0x0043], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.recyclerview.widget.o0 c(T5.b r19, int r20, int r21, boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.AbstractC0961f.c(T5.b, int, int, boolean, int, int, int, int):androidx.recyclerview.widget.o0");
    }

    public static C0959d d(T5.b bVar, C0957b c0957b, o oVar, boolean z2, int i3, int i10) {
        boolean z10 = z2;
        C0959d c0959d = new C0959d(c0957b, z2);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = i11 == 0 ? 1 : -1;
            int i13 = (int) oVar.f4926a;
            int i14 = (int) oVar.f4927b;
            while (i14 <= c0957b.f14227i && i14 >= c0957b.f14226h) {
                o0 c10 = c(bVar, 0, bVar.f7183a, z10, i13, i14, i3, i10);
                if (c10 != null) {
                    ((o0[]) c0959d.f8675c)[c0959d.p(i14)] = c10;
                    i13 = z2 ? c10.f10263b : c10.f10264c;
                }
                i14 += i12;
                z10 = z2;
            }
            i11++;
            z10 = z2;
        }
        return c0959d;
    }
}
