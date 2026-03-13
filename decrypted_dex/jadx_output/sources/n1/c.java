package n1;

import L0.U;
import T0.AbstractC0311b;
import android.util.Pair;
import com.stub.StubApp;
import java.nio.charset.StandardCharsets;
import o0.AbstractC1405B;
import org.bouncycastle.asn1.eac.CertificateBody;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f17649a;

    static {
        int i3 = AbstractC1560u.f20190a;
        f17649a = StubApp.getString2(2806).getBytes(StandardCharsets.UTF_8);
    }

    public static U a(int i3, C1553n c1553n) {
        c1553n.G(i3 + 12);
        c1553n.H(1);
        b(c1553n);
        c1553n.H(2);
        int u2 = c1553n.u();
        if ((u2 & 128) != 0) {
            c1553n.H(2);
        }
        if ((u2 & 64) != 0) {
            c1553n.H(c1553n.u());
        }
        if ((u2 & 32) != 0) {
            c1553n.H(2);
        }
        c1553n.H(1);
        b(c1553n);
        String e10 = AbstractC1405B.e(c1553n.u());
        if (StubApp.getString2(1623).equals(e10) || StubApp.getString2(3202).equals(e10) || StubApp.getString2(3208).equals(e10)) {
            return new U(e10, null, -1L, -1L);
        }
        c1553n.H(4);
        long w10 = c1553n.w();
        long w11 = c1553n.w();
        c1553n.H(1);
        int b2 = b(c1553n);
        long j = w11;
        byte[] bArr = new byte[b2];
        c1553n.f(0, b2, bArr);
        if (j <= 0) {
            j = -1;
        }
        return new U(e10, bArr, j, w10 > 0 ? w10 : -1L);
    }

    public static int b(C1553n c1553n) {
        int u2 = c1553n.u();
        int i3 = u2 & CertificateBody.profileType;
        while ((u2 & 128) == 128) {
            u2 = c1553n.u();
            i3 = (i3 << 7) | (u2 & CertificateBody.profileType);
        }
        return i3;
    }

    public static int c(int i3) {
        return (i3 >> 24) & 255;
    }

    public static s0.e d(C1553n c1553n) {
        long o5;
        long o10;
        c1553n.G(8);
        if (c(c1553n.h()) == 0) {
            o5 = c1553n.w();
            o10 = c1553n.w();
        } else {
            o5 = c1553n.o();
            o10 = c1553n.o();
        }
        return new s0.e(o5, o10, c1553n.w());
    }

    public static Pair e(C1553n c1553n, int i3, int i10) {
        Integer num;
        p pVar;
        Pair create;
        int i11;
        int i12;
        Integer num2;
        boolean z2;
        int i13 = c1553n.f20177b;
        while (i13 - i3 < i10) {
            c1553n.G(i13);
            int h2 = c1553n.h();
            AbstractC0311b.e(StubApp.getString2(21260), h2 > 0);
            if (c1553n.h() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = 0;
                int i16 = -1;
                Integer num3 = null;
                String str = null;
                while (i14 - i13 < h2) {
                    c1553n.G(i14);
                    int h4 = c1553n.h();
                    int h5 = c1553n.h();
                    if (h5 == 1718775137) {
                        num3 = Integer.valueOf(c1553n.h());
                    } else if (h5 == 1935894637) {
                        c1553n.H(4);
                        str = c1553n.s(4, StandardCharsets.UTF_8);
                    } else if (h5 == 1935894633) {
                        i16 = i14;
                        i15 = h4;
                    }
                    i14 += h4;
                }
                byte[] bArr = null;
                if (StubApp.getString2(907).equals(str) || StubApp.getString2(21261).equals(str) || StubApp.getString2(21262).equals(str) || StubApp.getString2(906).equals(str)) {
                    AbstractC0311b.e(StubApp.getString2(21263), num3 != null);
                    AbstractC0311b.e(StubApp.getString2(21264), i16 != -1);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = num3;
                            pVar = null;
                            break;
                        }
                        c1553n.G(i17);
                        int h9 = c1553n.h();
                        if (c1553n.h() == 1952804451) {
                            int c10 = c(c1553n.h());
                            c1553n.H(1);
                            if (c10 == 0) {
                                c1553n.H(1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int u2 = c1553n.u();
                                i11 = u2 & 15;
                                i12 = (u2 & 240) >> 4;
                            }
                            if (c1553n.u() == 1) {
                                num2 = num3;
                                z2 = true;
                            } else {
                                num2 = num3;
                                z2 = false;
                            }
                            int u10 = c1553n.u();
                            byte[] bArr2 = new byte[16];
                            c1553n.f(0, 16, bArr2);
                            if (z2 && u10 == 0) {
                                int u11 = c1553n.u();
                                byte[] bArr3 = new byte[u11];
                                c1553n.f(0, u11, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            pVar = new p(z2, str, u10, bArr2, i12, i11, bArr);
                        } else {
                            i17 += h9;
                        }
                    }
                    AbstractC0311b.e(StubApp.getString2(21265), pVar != null);
                    int i18 = AbstractC1560u.f20190a;
                    create = Pair.create(num, pVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i13 += h2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:381:0x088b, code lost:
    
        if (r14 == 2) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0c77, code lost:
    
        r1 = android.support.v4.media.session.b.h(r6);
        r2 = new byte[r1];
        r0.f(0, r1, r2);
        r12 = M4.I.q(r2);
        r3 = r40;
     */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0ad5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0a97  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Tb.U f(r0.C1553n r62, int r63, int r64, java.lang.String r65, o0.C1435j r66, boolean r67) {
        /*
            Method dump skipped, instructions count: 3766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.c.f(r0.n, int, int, java.lang.String, o0.j, boolean):Tb.U");
    }

    /* JADX WARN: Code restructure failed: missing block: B:308:0x00f0, code lost:
    
        if (r4 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x01d0, code lost:
    
        r4 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x069a A[ADDED_TO_REGION, LOOP:14: B:254:0x069a->B:257:0x06a6, LOOP_START, PHI: r18
      0x069a: PHI (r18v5 int) = (r18v4 int), (r18v6 int) binds: [B:253:0x0698, B:257:0x06a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x068c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0a18 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x075d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList g(s0.b r71, T0.w r72, long r73, o0.C1435j r75, boolean r76, boolean r77, L4.e r78) {
        /*
            Method dump skipped, instructions count: 2599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.c.g(s0.b, T0.w, long, o0.j, boolean, boolean, L4.e):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:289:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(r0.C1553n r54, int r55, int r56, int r57, int r58, int r59, o0.C1435j r60, Tb.U r61, int r62) {
        /*
            Method dump skipped, instructions count: 2544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.c.h(r0.n, int, int, int, int, int, o0.j, Tb.U, int):void");
    }
}
