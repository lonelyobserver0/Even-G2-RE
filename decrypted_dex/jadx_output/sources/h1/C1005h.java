package h1;

import M4.F;
import M4.I;
import M4.Z;
import T0.J;
import c1.C0548a;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import g5.C0955a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;
import o0.AbstractC1405B;
import o0.C1404A;
import org.bouncycastle.asn1.cmc.BodyPartID;
import r0.AbstractC1560u;
import r0.C1553n;

/* renamed from: h1.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1005h extends Ec.l {

    /* renamed from: b, reason: collision with root package name */
    public static final C0955a f14445b = new C0955a(5);

    /* renamed from: a, reason: collision with root package name */
    public final C0955a f14446a;

    public C1005h(C0955a c0955a) {
        this.f14446a = c0955a;
    }

    public static C0998a A(C1553n c1553n, int i3, int i10) {
        int S5;
        String concat;
        int u2 = c1553n.u();
        Charset P10 = P(u2);
        int i11 = i3 - 1;
        byte[] bArr = new byte[i11];
        c1553n.f(0, i11, bArr);
        String string2 = StubApp.getString2(18071);
        if (i10 == 2) {
            concat = string2 + AbstractC0624h2.y(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if (StubApp.getString2(18072).equals(concat)) {
                concat = StubApp.getString2(6953);
            }
            S5 = 2;
        } else {
            S5 = S(0, bArr);
            String y10 = AbstractC0624h2.y(new String(bArr, 0, S5, StandardCharsets.ISO_8859_1));
            concat = y10.indexOf(47) == -1 ? string2.concat(y10) : y10;
        }
        int i12 = bArr[S5 + 1] & UByte.MAX_VALUE;
        int i13 = S5 + 2;
        int R10 = R(i13, u2, bArr);
        String str = new String(bArr, i13, R10 - i13, P10);
        int O7 = O(u2) + R10;
        return new C0998a(i12, concat, str, i11 <= O7 ? AbstractC1560u.f20195f : Arrays.copyOfRange(bArr, O7, i11));
    }

    public static C1000c B(C1553n c1553n, int i3, int i10, boolean z2, int i11, C0955a c0955a) {
        int i12 = c1553n.f20177b;
        int S5 = S(i12, c1553n.f20176a);
        String str = new String(c1553n.f20176a, i12, S5 - i12, StandardCharsets.ISO_8859_1);
        c1553n.G(S5 + 1);
        int h2 = c1553n.h();
        int h4 = c1553n.h();
        long w10 = c1553n.w();
        if (w10 == BodyPartID.bodyIdMax) {
            w10 = -1;
        }
        long w11 = c1553n.w();
        long j = w11 == BodyPartID.bodyIdMax ? -1L : w11;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i3;
        while (c1553n.f20177b < i13) {
            AbstractC1006i E10 = E(i10, c1553n, z2, i11, c0955a);
            if (E10 != null) {
                arrayList.add(E10);
            }
        }
        return new C1000c(str, h2, h4, w10, j, (AbstractC1006i[]) arrayList.toArray(new AbstractC1006i[0]));
    }

    public static C1001d C(C1553n c1553n, int i3, int i10, boolean z2, int i11, C0955a c0955a) {
        int i12 = c1553n.f20177b;
        int S5 = S(i12, c1553n.f20176a);
        String str = new String(c1553n.f20176a, i12, S5 - i12, StandardCharsets.ISO_8859_1);
        c1553n.G(S5 + 1);
        int u2 = c1553n.u();
        boolean z10 = (u2 & 2) != 0;
        boolean z11 = (u2 & 1) != 0;
        int u10 = c1553n.u();
        String[] strArr = new String[u10];
        for (int i13 = 0; i13 < u10; i13++) {
            int i14 = c1553n.f20177b;
            int S10 = S(i14, c1553n.f20176a);
            strArr[i13] = new String(c1553n.f20176a, i14, S10 - i14, StandardCharsets.ISO_8859_1);
            c1553n.G(S10 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i3;
        while (c1553n.f20177b < i15) {
            AbstractC1006i E10 = E(i10, c1553n, z2, i11, c0955a);
            if (E10 != null) {
                arrayList.add(E10);
            }
        }
        return new C1001d(str, z10, z11, strArr, (AbstractC1006i[]) arrayList.toArray(new AbstractC1006i[0]));
    }

    public static C1002e D(int i3, C1553n c1553n) {
        if (i3 < 4) {
            return null;
        }
        int u2 = c1553n.u();
        Charset P10 = P(u2);
        byte[] bArr = new byte[3];
        c1553n.f(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i10 = i3 - 4;
        byte[] bArr2 = new byte[i10];
        c1553n.f(0, i10, bArr2);
        int R10 = R(0, u2, bArr2);
        String str2 = new String(bArr2, 0, R10, P10);
        int O7 = O(u2) + R10;
        return new C1002e(str, str2, I(bArr2, O7, R(O7, u2, bArr2), P10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x01ac, code lost:
    
        if (r10 == 67) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023a  */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h1.AbstractC1006i E(int r19, r0.C1553n r20, boolean r21, int r22, g5.C0955a r23) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1005h.E(int, r0.n, boolean, int, g5.a):h1.i");
    }

    public static C1003f F(int i3, C1553n c1553n) {
        int u2 = c1553n.u();
        Charset P10 = P(u2);
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        c1553n.f(0, i10, bArr);
        int S5 = S(0, bArr);
        String m4 = AbstractC1405B.m(new String(bArr, 0, S5, StandardCharsets.ISO_8859_1));
        int i11 = S5 + 1;
        int R10 = R(i11, u2, bArr);
        String I10 = I(bArr, i11, R10, P10);
        int O7 = O(u2) + R10;
        int R11 = R(O7, u2, bArr);
        String I11 = I(bArr, O7, R11, P10);
        int O10 = O(u2) + R11;
        return new C1003f(m4, I10, I11, i10 <= O10 ? AbstractC1560u.f20195f : Arrays.copyOfRange(bArr, O10, i10));
    }

    public static l G(int i3, C1553n c1553n) {
        int A4 = c1553n.A();
        int x7 = c1553n.x();
        int x10 = c1553n.x();
        int u2 = c1553n.u();
        int u10 = c1553n.u();
        J j = new J();
        j.p(c1553n);
        int i10 = ((i3 - 10) * 8) / (u2 + u10);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = j.i(u2);
            int i13 = j.i(u10);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new l(A4, x7, iArr, iArr2, x10);
    }

    public static m H(int i3, C1553n c1553n) {
        byte[] bArr = new byte[i3];
        c1553n.f(0, i3, bArr);
        int S5 = S(0, bArr);
        String str = new String(bArr, 0, S5, StandardCharsets.ISO_8859_1);
        int i10 = S5 + 1;
        return new m(str, i3 <= i10 ? AbstractC1560u.f20195f : Arrays.copyOfRange(bArr, i10, i3));
    }

    public static String I(byte[] bArr, int i3, int i10, Charset charset) {
        return (i10 <= i3 || i10 > bArr.length) ? "" : new String(bArr, i3, i10 - i3, charset);
    }

    public static o J(int i3, String str, C1553n c1553n) {
        if (i3 < 1) {
            return null;
        }
        int u2 = c1553n.u();
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        c1553n.f(0, i10, bArr);
        return new o(str, null, K(u2, 0, bArr));
    }

    public static Z K(int i3, int i10, byte[] bArr) {
        if (i10 >= bArr.length) {
            return I.q("");
        }
        F l9 = I.l();
        int R10 = R(i10, i3, bArr);
        while (i10 < R10) {
            l9.a(new String(bArr, i10, R10 - i10, P(i3)));
            i10 = O(i3) + R10;
            R10 = R(i10, i3, bArr);
        }
        Z g10 = l9.g();
        return g10.isEmpty() ? I.q("") : g10;
    }

    public static o L(int i3, C1553n c1553n) {
        if (i3 < 1) {
            return null;
        }
        int u2 = c1553n.u();
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        c1553n.f(0, i10, bArr);
        int R10 = R(0, u2, bArr);
        return new o(StubApp.getString2(18078), new String(bArr, 0, R10, P(u2)), K(u2, O(u2) + R10, bArr));
    }

    public static p M(int i3, String str, C1553n c1553n) {
        byte[] bArr = new byte[i3];
        c1553n.f(0, i3, bArr);
        return new p(str, null, new String(bArr, 0, S(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static p N(int i3, C1553n c1553n) {
        if (i3 < 1) {
            return null;
        }
        int u2 = c1553n.u();
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        c1553n.f(0, i10, bArr);
        int R10 = R(0, u2, bArr);
        String str = new String(bArr, 0, R10, P(u2));
        int O7 = O(u2) + R10;
        return new p(StubApp.getString2(18079), str, I(bArr, O7, S(O7, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int O(int i3) {
        return (i3 == 0 || i3 == 3) ? 1 : 2;
    }

    public static Charset P(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String Q(int i3, int i10, int i11, int i12, int i13) {
        if (i3 == 2) {
            return String.format(Locale.US, StubApp.getString2(18080), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, StubApp.getString2(18081), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int R(int i3, int i10, byte[] bArr) {
        int S5 = S(i3, bArr);
        if (i10 == 0 || i10 == 3) {
            return S5;
        }
        while (S5 < bArr.length - 1) {
            if ((S5 - i3) % 2 == 0 && bArr[S5 + 1] == 0) {
                return S5;
            }
            S5 = S(S5 + 1, bArr);
        }
        return bArr.length;
    }

    public static int S(int i3, byte[] bArr) {
        while (i3 < bArr.length) {
            if (bArr[i3] == 0) {
                return i3;
            }
            i3++;
        }
        return bArr.length;
    }

    public static int T(int i3, C1553n c1553n) {
        byte[] bArr = c1553n.f20176a;
        int i10 = c1553n.f20177b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10 + i3) {
                return i3;
            }
            if ((bArr[i11] & UByte.MAX_VALUE) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i3 - (i11 - i10)) - 2);
                i3--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean U(r0.C1553n r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f20177b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.h()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.w()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.x()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.G(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.G(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.G(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.G(r2)
            return r4
        Lb0:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1005h.U(r0.n, int, int, boolean):boolean");
    }

    @Override // Ec.l
    public final C1404A i(C0548a c0548a, ByteBuffer byteBuffer) {
        return z(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o0.C1404A z(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1005h.z(int, byte[]):o0.A");
    }
}
