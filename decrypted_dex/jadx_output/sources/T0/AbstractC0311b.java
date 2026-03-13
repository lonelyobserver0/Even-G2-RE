package T0;

import android.util.Base64;
import com.stub.StubApp;
import f1.C0870a;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k1.C1103a;
import kotlin.UByte;
import l4.E0;
import o0.C1404A;
import o0.C1406C;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* renamed from: T0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0311b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6956a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6957b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f6958c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f6959d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f6960e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f6961f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f6962g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, BERTags.FLAGS, 256, DilithiumEngine.DilithiumPolyT1PackedBytes, KyberEngine.KyberPolyBytes, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f6963h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f6964i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f6965k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f6966l = {64, 112, 128, 192, BERTags.FLAGS, 256, KyberEngine.KyberPolyBytes, 448, 512, 640, 768, 896, 1024, 1152, PlatformPlugin.DEFAULT_SYSTEM_UI, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f6967m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f6968n = {5, 8, 10, 12};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f6969o = {6, 9, 12, 15};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f6970p = {2, 4, 6, 8};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f6971q = {9, 11, 13, 16};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f6972r = {5, 8, 10, 12};

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f6973s = {StubApp.getString2(6095), StubApp.getString2(6094), StubApp.getString2(1623)};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f6974t = {44100, 48000, 32000};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f6975u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f6976v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f6977w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f6978x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f6979y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i3, int i10) {
        int i11 = -1;
        for (int i12 = 0; i12 < 13; i12++) {
            if (i3 == f6956a[i12]) {
                i11 = i12;
            }
        }
        int i13 = -1;
        for (int i14 = 0; i14 < 16; i14++) {
            if (i10 == f6957b[i14]) {
                i13 = i14;
            }
        }
        if (i3 == -1 || i13 == -1) {
            throw new IllegalArgumentException(Xa.h.o(StubApp.getString2(6096), i3, i10, StubApp.getString2(81)));
        }
        return b(2, i11, i13);
    }

    public static byte[] b(int i3, int i10, int i11) {
        return new byte[]{(byte) (((i3 << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((i10 << 7) & 128) | ((i11 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & UByte.MAX_VALUE) << 8) | (bArr[10] & UByte.MAX_VALUE)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r13 == r22.f7052f) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if ((r21.u() * 1000) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (r4 == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(r0.C1553n r21, T0.u r22, int r23, T0.s r24) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.AbstractC0311b.d(r0.n, T0.u, int, T0.s):boolean");
    }

    public static void e(String str, boolean z2) {
        if (!z2) {
            throw C1406C.a(str, null);
        }
    }

    public static void f(long j3, C1553n c1553n, H[] hArr) {
        int i3;
        while (true) {
            if (c1553n.a() <= 1) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (c1553n.a() == 0) {
                    i3 = -1;
                    break;
                }
                int u2 = c1553n.u();
                i10 += u2;
                if (u2 != 255) {
                    i3 = i10;
                    break;
                }
            }
            int i11 = 0;
            while (true) {
                if (c1553n.a() == 0) {
                    i11 = -1;
                    break;
                }
                int u10 = c1553n.u();
                i11 += u10;
                if (u10 != 255) {
                    break;
                }
            }
            int i12 = c1553n.f20177b + i11;
            if (i11 == -1 || i11 > c1553n.a()) {
                AbstractC1550k.w(StubApp.getString2(6097), StubApp.getString2(6098));
                i12 = c1553n.f20178c;
            } else if (i3 == 4 && i11 >= 8) {
                int u11 = c1553n.u();
                int A4 = c1553n.A();
                int h2 = A4 == 49 ? c1553n.h() : 0;
                int u12 = c1553n.u();
                if (A4 == 47) {
                    c1553n.H(1);
                }
                boolean z2 = u11 == 181 && (A4 == 49 || A4 == 47) && u12 == 3;
                if (A4 == 49) {
                    z2 &= h2 == 1195456820;
                }
                if (z2) {
                    g(j3, c1553n, hArr);
                }
            }
            c1553n.G(i12);
        }
    }

    public static void g(long j3, C1553n c1553n, H[] hArr) {
        int u2 = c1553n.u();
        if ((u2 & 64) != 0) {
            c1553n.H(1);
            int i3 = (u2 & 31) * 3;
            int i10 = c1553n.f20177b;
            for (H h2 : hArr) {
                c1553n.G(i10);
                h2.a(c1553n, i3, 0);
                AbstractC1550k.g(j3 != -9223372036854775807L);
                h2.c(j3, 1, i3, 0, null);
            }
        }
    }

    public static int h(int i3, int i10) {
        int i11 = i10 / 2;
        if (i3 < 0 || i3 >= 3 || i10 < 0 || i11 >= 19) {
            return -1;
        }
        int i12 = f6959d[i3];
        if (i12 == 44100) {
            return ((i10 % 2) + f6963h[i11]) * 2;
        }
        int i13 = f6962g[i11];
        return i12 == 32000 ? i13 * 6 : i13 * 4;
    }

    public static void i(int i3, C1553n c1553n) {
        c1553n.D(7);
        byte[] bArr = c1553n.f20176a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i3 >> 16) & 255);
        bArr[5] = (byte) ((i3 >> 8) & 255);
        bArr[6] = (byte) (i3 & 255);
    }

    public static int j(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!((i3 & (-2097152)) == -2097152) || (i10 = (i3 >>> 19) & 3) == 1 || (i11 = (i3 >>> 17) & 3) == 0 || (i12 = (i3 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i3 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = f6974t[i13];
        if (i10 == 2) {
            i14 /= 2;
        } else if (i10 == 0) {
            i14 /= 4;
        }
        int i15 = (i3 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f6975u[i12 - 1] : f6976v[i12 - 1]) * 12) / i14) + i15) * 4;
        }
        int i16 = i10 == 3 ? i11 == 2 ? f6977w[i12 - 1] : f6978x[i12 - 1] : f6979y[i12 - 1];
        if (i10 == 3) {
            return ((i16 * 144) / i14) + i15;
        }
        return (((i11 == 1 ? 72 : 144) * i16) / i14) + i15;
    }

    public static J k(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new J(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = copyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                byte b11 = copyOf[i3];
                int i10 = i3 + 1;
                copyOf[i3] = copyOf[i10];
                copyOf[i10] = b11;
            }
        }
        J j3 = new J(copyOf, copyOf.length);
        if (copyOf[0] == 31) {
            J j10 = new J(copyOf, copyOf.length);
            while (j10.b() >= 16) {
                j10.t(2);
                int i11 = j10.i(14) & 16383;
                int min = Math.min(8 - j3.f6951d, 14);
                int i12 = j3.f6951d;
                int i13 = (8 - i12) - min;
                byte[] bArr2 = j3.f6949b;
                int i14 = j3.f6950c;
                byte b12 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                bArr2[i14] = b12;
                int i15 = 14 - min;
                bArr2[i14] = (byte) (b12 | ((i11 >>> i15) << i13));
                int i16 = i14 + 1;
                while (i15 > 8) {
                    j3.f6949b[i16] = (byte) (i11 >>> (i15 - 8));
                    i15 -= 8;
                    i16++;
                }
                int i17 = 8 - i15;
                byte[] bArr3 = j3.f6949b;
                byte b13 = (byte) (bArr3[i16] & ((1 << i17) - 1));
                bArr3[i16] = b13;
                bArr3[i16] = (byte) (((i11 & ((1 << i15) - 1)) << i17) | b13);
                j3.t(14);
                j3.a();
            }
        }
        j3.o(copyOf.length, copyOf);
        return j3;
    }

    public static long l(byte b2, byte b10) {
        int i3;
        int i10 = b2 & UByte.MAX_VALUE;
        int i11 = b2 & 3;
        if (i11 != 0) {
            i3 = 2;
            if (i11 != 1 && i11 != 2) {
                i3 = b10 & 63;
            }
        } else {
            i3 = 1;
        }
        int i12 = i10 >> 3;
        return i3 * (i12 >= 16 ? 2500 << r6 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static int m(J j3) {
        int i3 = j3.i(4);
        if (i3 == 15) {
            if (j3.b() >= 24) {
                return j3.i(24);
            }
            throw C1406C.a(StubApp.getString2(6099), null);
        }
        if (i3 < 13) {
            return f6956a[i3];
        }
        throw C1406C.a(StubApp.getString2(6100), null);
    }

    public static int n(int i3) {
        int i10 = 0;
        while (i3 > 0) {
            i10++;
            i3 >>>= 1;
        }
        return i10;
    }

    public static C0312c o(J j3) {
        int h2;
        int i3;
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int g10 = j3.g();
        j3.t(40);
        boolean z2 = j3.i(5) > 10;
        j3.q(g10);
        int[] iArr = f6961f;
        int[] iArr2 = f6959d;
        if (z2) {
            j3.t(16);
            int i21 = j3.i(2);
            if (i21 == 0) {
                r9 = 0;
            } else if (i21 == 1) {
                r9 = 1;
            } else if (i21 == 2) {
                r9 = 2;
            }
            j3.t(3);
            h2 = (j3.i(11) + 1) * 2;
            int i22 = j3.i(2);
            if (i22 == 3) {
                i15 = f6960e[j3.i(2)];
                i14 = 3;
                i16 = 6;
            } else {
                i14 = j3.i(2);
                int i23 = f6958c[i14];
                i15 = iArr2[i22];
                i16 = i23;
            }
            i11 = i16 * 256;
            int i24 = (h2 * i15) / (i16 * 32);
            int i25 = j3.i(3);
            boolean h4 = j3.h();
            i10 = iArr[i25] + (h4 ? 1 : 0);
            j3.t(10);
            if (j3.h()) {
                j3.t(8);
            }
            if (i25 == 0) {
                j3.t(5);
                if (j3.h()) {
                    j3.t(8);
                }
            }
            if (r9 == 1 && j3.h()) {
                j3.t(16);
            }
            if (j3.h()) {
                if (i25 > 2) {
                    j3.t(2);
                }
                if ((i25 & 1) == 0 || i25 <= 2) {
                    i18 = 6;
                } else {
                    i18 = 6;
                    j3.t(6);
                }
                if ((i25 & 4) != 0) {
                    j3.t(i18);
                }
                if (h4 && j3.h()) {
                    j3.t(5);
                }
                if (r9 == 0) {
                    if (j3.h()) {
                        i19 = 6;
                        j3.t(6);
                    } else {
                        i19 = 6;
                    }
                    if (i25 == 0 && j3.h()) {
                        j3.t(i19);
                    }
                    if (j3.h()) {
                        j3.t(i19);
                    }
                    int i26 = j3.i(2);
                    if (i26 == 1) {
                        j3.t(5);
                        i20 = 2;
                    } else {
                        if (i26 == 2) {
                            j3.t(12);
                        } else if (i26 == 3) {
                            int i27 = j3.i(5);
                            if (j3.h()) {
                                j3.t(5);
                                if (j3.h()) {
                                    j3.t(4);
                                }
                                if (j3.h()) {
                                    j3.t(4);
                                }
                                if (j3.h()) {
                                    j3.t(4);
                                }
                                if (j3.h()) {
                                    j3.t(4);
                                }
                                if (j3.h()) {
                                    j3.t(4);
                                }
                                if (j3.h()) {
                                    j3.t(4);
                                }
                                if (j3.h()) {
                                    j3.t(4);
                                }
                                if (j3.h()) {
                                    if (j3.h()) {
                                        j3.t(4);
                                    }
                                    if (j3.h()) {
                                        j3.t(4);
                                    }
                                }
                            }
                            if (j3.h()) {
                                j3.t(5);
                                if (j3.h()) {
                                    j3.t(7);
                                    if (j3.h()) {
                                        j3.t(8);
                                        i20 = 2;
                                        j3.t((i27 + i20) * 8);
                                        j3.c();
                                    }
                                }
                            }
                            i20 = 2;
                            j3.t((i27 + i20) * 8);
                            j3.c();
                        }
                        i20 = 2;
                    }
                    if (i25 < i20) {
                        if (j3.h()) {
                            j3.t(14);
                        }
                        if (i25 == 0 && j3.h()) {
                            j3.t(14);
                        }
                    }
                    if (j3.h()) {
                        if (i14 == 0) {
                            j3.t(5);
                        } else {
                            for (int i28 = 0; i28 < i16; i28++) {
                                if (j3.h()) {
                                    j3.t(5);
                                }
                            }
                        }
                    }
                }
            }
            if (j3.h()) {
                j3.t(5);
                if (i25 == 2) {
                    j3.t(4);
                }
                if (i25 >= 6) {
                    j3.t(2);
                }
                if (j3.h()) {
                    j3.t(8);
                }
                if (i25 == 0 && j3.h()) {
                    j3.t(8);
                }
                if (i22 < 3) {
                    j3.s();
                }
            }
            if (r9 == 0 && i14 != 3) {
                j3.s();
            }
            if (r9 == 2 && (i14 == 3 || j3.h())) {
                i17 = 6;
                j3.t(6);
            } else {
                i17 = 6;
            }
            str = (j3.h() && j3.i(i17) == 1 && j3.i(8) == 1) ? StubApp.getString2(938) : StubApp.getString2(935);
            i13 = i15;
            i12 = i24;
        } else {
            j3.t(32);
            int i29 = j3.i(2);
            String string2 = i29 == 3 ? null : StubApp.getString2(1629);
            int i30 = j3.i(6);
            int i31 = f6962g[i30 / 2] * 1000;
            h2 = h(i29, i30);
            j3.t(8);
            int i32 = j3.i(3);
            if ((i32 & 1) == 0 || i32 == 1) {
                i3 = 2;
            } else {
                i3 = 2;
                j3.t(2);
            }
            if ((i32 & 4) != 0) {
                j3.t(i3);
            }
            if (i32 == i3) {
                j3.t(i3);
            }
            r9 = i29 < 3 ? iArr2[i29] : -1;
            i10 = iArr[i32] + (j3.h() ? 1 : 0);
            i11 = 1536;
            str = string2;
            i12 = i31;
            i13 = r9;
        }
        return new C0312c(str, i10, i13, h2, i11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static R0.d p(T0.J r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = T0.AbstractC0311b.f6964i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            R0.d r1 = new R0.d
            r2 = 1
            r1.<init>(r5, r0, r9, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.AbstractC0311b.p(T0.J):R0.d");
    }

    public static C0310a q(J j3, boolean z2) {
        int i3 = j3.i(5);
        if (i3 == 31) {
            i3 = j3.i(6) + 32;
        }
        int m4 = m(j3);
        int i10 = j3.i(4);
        String p8 = i2.u.p(i3, StubApp.getString2(2484));
        if (i3 == 5 || i3 == 29) {
            m4 = m(j3);
            int i11 = j3.i(5);
            if (i11 == 31) {
                i11 = j3.i(6) + 32;
            }
            i3 = i11;
            if (i3 == 22) {
                i10 = j3.i(4);
            }
        }
        if (z2) {
            if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4 && i3 != 6 && i3 != 7 && i3 != 17) {
                switch (i3) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C1406C.c(StubApp.getString2(6101) + i3);
                }
            }
            if (j3.h()) {
                AbstractC1550k.w(StubApp.getString2(6102), StubApp.getString2(6103));
            }
            if (j3.h()) {
                j3.t(14);
            }
            boolean h2 = j3.h();
            if (i10 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i3 == 6 || i3 == 20) {
                j3.t(3);
            }
            if (h2) {
                if (i3 == 22) {
                    j3.t(16);
                }
                if (i3 == 17 || i3 == 19 || i3 == 20 || i3 == 23) {
                    j3.t(3);
                }
                j3.t(1);
            }
            switch (i3) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i12 = j3.i(2);
                    if (i12 == 2 || i12 == 3) {
                        throw C1406C.c(StubApp.getString2(6104) + i12);
                    }
            }
        }
        int i13 = f6957b[i10];
        if (i13 != -1) {
            return new C0310a(m4, i13, p8);
        }
        throw C1406C.a(null, null);
    }

    public static void r(J j3, C0313d c0313d) {
        int i3 = j3.i(5);
        j3.t(2);
        if (j3.h()) {
            j3.t(5);
        }
        if (i3 >= 7 && i3 <= 10) {
            j3.s();
        }
        if (j3.h()) {
            int i10 = j3.i(3);
            if (c0313d.f6986a == -1 && i3 >= 0 && i3 <= 15 && (i10 == 0 || i10 == 1)) {
                c0313d.f6986a = i3;
            }
            if (j3.h()) {
                y(j3);
            }
        }
    }

    public static void s(J j3, C0313d c0313d) {
        j3.t(2);
        boolean h2 = j3.h();
        int i3 = j3.i(8);
        for (int i10 = 0; i10 < i3; i10++) {
            j3.t(2);
            if (j3.h()) {
                j3.t(5);
            }
            if (h2) {
                j3.t(24);
            } else {
                if (j3.h()) {
                    if (!j3.h()) {
                        j3.t(4);
                    }
                    c0313d.f6987b = j3.i(6) + 1;
                }
                j3.t(4);
            }
        }
        if (j3.h()) {
            j3.t(3);
            if (j3.h()) {
                y(j3);
            }
        }
    }

    public static int t(J j3, int[] iArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 3 && j3.h(); i10++) {
            i3++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            i11 += 1 << iArr[i12];
        }
        return j3.i(iArr[i3]) + i11;
    }

    public static C1404A u(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            String str = (String) list.get(i3);
            int i10 = AbstractC1560u.f20190a;
            String[] split = str.split(StubApp.getString2(2359), 2);
            int length = split.length;
            String string2 = StubApp.getString2(6105);
            if (length != 2) {
                AbstractC1550k.w(string2, StubApp.getString2(6106).concat(str));
            } else if (split[0].equals(StubApp.getString2(6107))) {
                try {
                    arrayList.add(C0870a.d(new C1553n(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    AbstractC1550k.x(string2, StubApp.getString2(6108), e10);
                }
            } else {
                arrayList.add(new C1103a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1404A(arrayList);
    }

    public static int v(int i3, C1553n c1553n) {
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i3 - 2);
            case 6:
                return c1553n.u() + 1;
            case 7:
                return c1553n.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i3 - 8);
            default:
                return -1;
        }
    }

    public static E0 w(C1553n c1553n) {
        c1553n.H(1);
        int x7 = c1553n.x();
        long j3 = c1553n.f20177b + x7;
        int i3 = x7 / 18;
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        int i10 = 0;
        while (true) {
            if (i10 >= i3) {
                break;
            }
            long o5 = c1553n.o();
            if (o5 == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = o5;
            jArr2[i10] = c1553n.o();
            c1553n.H(2);
            i10++;
        }
        c1553n.H((int) (j3 - c1553n.f20177b));
        return new E0(24, jArr, jArr2);
    }

    public static A0.c x(C1553n c1553n, boolean z2, boolean z10) {
        if (z2) {
            z(3, c1553n, false);
        }
        c1553n.s((int) c1553n.l(), StandardCharsets.UTF_8);
        long l9 = c1553n.l();
        String[] strArr = new String[(int) l9];
        for (int i3 = 0; i3 < l9; i3++) {
            strArr[i3] = c1553n.s((int) c1553n.l(), StandardCharsets.UTF_8);
        }
        if (z10 && (c1553n.u() & 1) == 0) {
            throw C1406C.a(StubApp.getString2(6109), null);
        }
        return new A0.c(strArr);
    }

    public static void y(J j3) {
        int i3 = j3.i(6);
        if (i3 < 2 || i3 > 42) {
            throw C1406C.c(String.format(StubApp.getString2(6110), Integer.valueOf(i3)));
        }
        j3.t(i3 * 8);
    }

    public static boolean z(int i3, C1553n c1553n, boolean z2) {
        if (c1553n.a() < 7) {
            if (z2) {
                return false;
            }
            throw C1406C.a(StubApp.getString2(6111) + c1553n.a(), null);
        }
        if (c1553n.u() != i3) {
            if (z2) {
                return false;
            }
            throw C1406C.a(StubApp.getString2(6112) + Integer.toHexString(i3), null);
        }
        if (c1553n.u() == 118 && c1553n.u() == 111 && c1553n.u() == 114 && c1553n.u() == 98 && c1553n.u() == 105 && c1553n.u() == 115) {
            return true;
        }
        if (z2) {
            return false;
        }
        throw C1406C.a(StubApp.getString2(6113), null);
    }
}
