package Ec;

import D5.A;
import Kc.C0101h;
import Sb.r;
import Z9.C0366a;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import c1.C0548a;
import com.google.android.gms.internal.measurement.F1;
import com.google.protobuf.AbstractC0733j;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapView;
import com.stub.StubApp;
import ic.C1070a;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Properties;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import m8.C1277A;
import m8.C1278B;
import m8.C1279C;
import m8.D;
import m8.E;
import m8.F;
import m8.G;
import o0.C1404A;
import oa.AbstractC1469b;
import oa.C1471d;
import org.bouncycastle.asn1.eac.CertificateBody;
import q8.AbstractC1526a;
import r0.AbstractC1550k;
import s7.C1603a;
import s7.C1604b;
import sa.C1608a;
import wa.p;
import wa.s;
import wa.t;
import wa.u;
import wa.v;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class l {
    public static Sb.e a(int i3, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        if (i3 == -2) {
            if (i10 != 1) {
                return new r(1, i10);
            }
            Sb.i.f6712M.getClass();
            return new Sb.e(Sb.h.f6711b);
        }
        if (i3 != -1) {
            return i3 != 0 ? i3 != Integer.MAX_VALUE ? i10 == 1 ? new Sb.e(i3) : new r(i3, i10) : new Sb.e(IntCompanionObject.MAX_VALUE) : i10 == 1 ? new Sb.e(0) : new r(1, i10);
        }
        if (i10 == 1) {
            return new r(1, 2);
        }
        throw new IllegalArgumentException(StubApp.getString2(25247));
    }

    public static final C1604b b(Function1 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        C1603a c1603a = new C1603a();
        c1603a.f20777a = true;
        c1603a.f20778b = 8388659;
        c1603a.f20779c = 4.0f;
        c1603a.f20780d = 4.0f;
        c1603a.f20781e = 4.0f;
        c1603a.f20782f = 4.0f;
        c1603a.f20783g = -16777216;
        c1603a.f20784h = -16777216;
        c1603a.f20785i = -1;
        c1603a.j = 2.0f;
        c1603a.f20786k = 2.0f;
        c1603a.f20787l = 8.0f;
        c1603a.f20788m = 2.0f;
        c1603a.f20789n = 8.0f;
        c1603a.f20790o = true;
        c1603a.f20791p = 15L;
        c1603a.f20792q = true;
        c1603a.f20793r = 0.5f;
        initializer.invoke(c1603a);
        return new C1604b(c1603a.f20777a, c1603a.f20778b, c1603a.f20779c, c1603a.f20780d, c1603a.f20781e, c1603a.f20782f, c1603a.f20783g, c1603a.f20784h, c1603a.f20785i, c1603a.j, c1603a.f20786k, c1603a.f20787l, c1603a.f20788m, c1603a.f20789n, c1603a.f20790o, c1603a.f20791p, c1603a.f20792q, c1603a.f20793r, c1603a.f20794s);
    }

    public static void c(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + StubApp.getString2(1561) + j + StubApp.getString2(25248));
    }

    public static final X6.d e(boolean z2) {
        ImageHolder.Companion companion = ImageHolder.INSTANCE;
        return new X6.d(companion.from(2131165567), z2 ? companion.from(2131165566) : companion.from(2131165571), z2 ? companion.from(2131165571) : companion.from(2131165568), null, 1.0f);
    }

    public static wa.m f(C1471d c1471d, C1608a c1608a) {
        oa.j jVar = oa.j.f18621y3;
        oa.j jVar2 = oa.j.f18556k1;
        AbstractC1469b J10 = c1471d.J(jVar);
        oa.j jVar3 = J10 instanceof oa.j ? (oa.j) J10 : jVar2;
        boolean equals = jVar2.equals(jVar3);
        String string2 = StubApp.getString2(620);
        String string22 = StubApp.getString2(948);
        if (!equals) {
            Log.e(string22, StubApp.getString2(24012) + jVar3.f18626a + string2);
        }
        oa.j H2 = c1471d.H(oa.j.f18576o3);
        if (oa.j.f18422A3.equals(H2)) {
            AbstractC1469b J11 = c1471d.J(oa.j.f18565m1);
            if (J11 instanceof C1471d) {
                if (((C1471d) J11).f18397a.containsKey(oa.j.f18583q1)) {
                    return new t(c1471d);
                }
            }
            return new u(c1471d);
        }
        if (oa.j.f18551i2.equals(H2)) {
            AbstractC1469b J12 = c1471d.J(oa.j.f18565m1);
            if (J12 instanceof C1471d) {
                if (((C1471d) J12).f18397a.containsKey(oa.j.f18583q1)) {
                    return new t(c1471d);
                }
            }
            return new p(c1471d);
        }
        if (oa.j.f18616x3.equals(H2)) {
            return new wa.r(c1471d);
        }
        if (oa.j.f18427B3.equals(H2)) {
            return new v(c1471d, c1608a);
        }
        if (oa.j.f18625z3.equals(H2)) {
            return new s(c1471d);
        }
        if (oa.j.f18516Y.equals(H2)) {
            throw new IOException(StubApp.getString2(25251));
        }
        if (oa.j.f18520Z.equals(H2)) {
            throw new IOException(StubApp.getString2(25250));
        }
        Log.w(string22, StubApp.getString2(25249) + H2 + string2);
        return new u(c1471d);
    }

    public static String g(Object value, String message) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(message, "message");
        return message + StubApp.getString2(25252) + value;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress j(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ec.l.j(int, int, java.lang.String):java.net.InetAddress");
    }

    public static String k(AbstractC0733j abstractC0733j) {
        StringBuilder sb2 = new StringBuilder(abstractC0733j.size());
        for (int i3 = 0; i3 < abstractC0733j.size(); i3++) {
            byte a3 = abstractC0733j.a(i3);
            if (a3 == 34) {
                sb2.append(StubApp.getString2(11658));
            } else if (a3 == 39) {
                sb2.append(StubApp.getString2(11657));
            } else if (a3 != 92) {
                switch (a3) {
                    case 7:
                        sb2.append(StubApp.getString2(11655));
                        break;
                    case 8:
                        sb2.append(StubApp.getString2(11654));
                        break;
                    case 9:
                        sb2.append(StubApp.getString2(11653));
                        break;
                    case 10:
                        sb2.append(StubApp.getString2(11652));
                        break;
                    case 11:
                        sb2.append(StubApp.getString2(11651));
                        break;
                    case 12:
                        sb2.append(StubApp.getString2(11650));
                        break;
                    case 13:
                        sb2.append(StubApp.getString2(11649));
                        break;
                    default:
                        if (a3 < 32 || a3 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a3 >>> 6) & 3) + 48));
                            sb2.append((char) (((a3 >>> 3) & 7) + 48));
                            sb2.append((char) ((a3 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) a3);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append(StubApp.getString2(11656));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r2 = ((E0.p) r4.get(r1)).f1780d.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int l(boolean r4) {
        /*
            r0 = 0
            o0.l r1 = new o0.l     // Catch: E0.v -> L7c
            r1.<init>()     // Catch: E0.v -> L7c
            java.lang.String r2 = "469"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: E0.v -> L7c
            java.lang.String r2 = o0.AbstractC1405B.m(r2)     // Catch: E0.v -> L7c
            r1.f18177m = r2     // Catch: E0.v -> L7c
            o0.m r2 = new o0.m     // Catch: E0.v -> L7c
            r2.<init>(r1)     // Catch: E0.v -> L7c
            java.lang.String r1 = r2.f18216n     // Catch: E0.v -> L7c
            if (r1 == 0) goto L7c
            E0.k r1 = E0.k.f1775b     // Catch: E0.v -> L7c
            M4.Z r4 = E0.z.g(r1, r2, r4, r0)     // Catch: E0.v -> L7c
            r1 = r0
        L22:
            int r2 = r4.f4580d     // Catch: E0.v -> L7c
            if (r1 >= r2) goto L7c
            java.lang.Object r2 = r4.get(r1)     // Catch: E0.v -> L7c
            E0.p r2 = (E0.p) r2     // Catch: E0.v -> L7c
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.f1780d     // Catch: E0.v -> L7c
            if (r2 == 0) goto L79
            java.lang.Object r2 = r4.get(r1)     // Catch: E0.v -> L7c
            E0.p r2 = (E0.p) r2     // Catch: E0.v -> L7c
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.f1780d     // Catch: E0.v -> L7c
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: E0.v -> L7c
            if (r2 == 0) goto L79
            java.lang.Object r2 = r4.get(r1)     // Catch: E0.v -> L7c
            E0.p r2 = (E0.p) r2     // Catch: E0.v -> L7c
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.f1780d     // Catch: E0.v -> L7c
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: E0.v -> L7c
            java.util.List r2 = A.a.l(r2)     // Catch: E0.v -> L7c
            if (r2 == 0) goto L79
            boolean r3 = r2.isEmpty()     // Catch: E0.v -> L7c
            if (r3 != 0) goto L79
            A.a.m()     // Catch: E0.v -> L7c
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = A.a.b()     // Catch: E0.v -> L7c
            r1 = r0
        L5e:
            int r3 = r2.size()     // Catch: E0.v -> L7c
            if (r1 >= r3) goto L77
            java.lang.Object r3 = r2.get(r1)     // Catch: E0.v -> L7c
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = A.a.d(r3)     // Catch: E0.v -> L7c
            boolean r3 = A.a.t(r3, r4)     // Catch: E0.v -> L7c
            if (r3 == 0) goto L74
            r4 = 2
            return r4
        L74:
            int r1 = r1 + 1
            goto L5e
        L77:
            r4 = 1
            return r4
        L79:
            int r1 = r1 + 1
            goto L22
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ec.l.l(boolean):int");
    }

    public static int m(View view, int i3) {
        return F1.w(view.getContext(), i3, view.getClass().getCanonicalName());
    }

    public static void n(Q4.c cVar) {
        if (!cVar.isDone()) {
            throw new IllegalStateException(AbstractC1526a.C(StubApp.getString2(25254), cVar));
        }
        boolean z2 = false;
        while (true) {
            try {
                cVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public static final l7.r o(MapView mapView) {
        Intrinsics.checkNotNullParameter(mapView, "<this>");
        X6.j plugin = mapView.getPlugin(StubApp.getString2(13942));
        Intrinsics.checkNotNull(plugin);
        return (l7.r) plugin;
    }

    public static final int p(G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        if (g10 instanceof C1277A) {
            return ((C1277A) g10).f17147a;
        }
        if (g10 instanceof E) {
            return ((E) g10).f17151a;
        }
        if (Intrinsics.areEqual(g10, C1278B.f17148a)) {
            return 0;
        }
        if (g10 instanceof C1279C) {
            return ((C1279C) g10).f17149a;
        }
        if (g10 instanceof D) {
            return ((D) g10).f17150a.f21467a;
        }
        if (g10 instanceof F) {
            return ((F) g10).f17152a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int q(float f10, int i3, int i10) {
        return F.a.b(F.a.d(i10, Math.round(Color.alpha(i10) * f10)), i3);
    }

    public static final String r(G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        if (g10 instanceof C1277A) {
            return StubApp.getString2(25255);
        }
        if (Intrinsics.areEqual(g10, C1278B.f17148a)) {
            return StubApp.getString2(25256);
        }
        if (g10 instanceof C1279C ? true : g10 instanceof E) {
            return StubApp.getString2(25257);
        }
        if (g10 instanceof D) {
            return StubApp.getString2(25258);
        }
        if (g10 instanceof F) {
            return StubApp.getString2(25259);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(Xb.d r12, com.mapbox.bindgen.DataRef r13, java.lang.String r14, java.lang.String r15, long r16, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof J7.f
            if (r1 == 0) goto L15
            r1 = r0
            J7.f r1 = (J7.f) r1
            int r2 = r1.f3421b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f3421b = r2
            goto L1a
        L15:
            J7.f r1 = new J7.f
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f3420a
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.f3421b
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L2b
            kotlin.ResultKt.throwOnFailure(r0)
            goto L4f
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r13 = 275(0x113, float:3.85E-43)
            java.lang.String r13 = com.stub.StubApp.getString2(r13)
            r12.<init>(r13)
            throw r12
        L38:
            kotlin.ResultKt.throwOnFailure(r0)
            J7.g r5 = new J7.g
            r11 = 0
            r8 = r13
            r9 = r14
            r10 = r15
            r6 = r16
            r5.<init>(r6, r8, r9, r10, r11)
            r1.f3421b = r4
            java.lang.Object r0 = Qb.L.n(r12, r5, r1)
            if (r0 != r2) goto L4f
            return r2
        L4f:
            java.lang.String r12 = "responseJson: DataRef,\n …Error(ex)\n        }\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ec.l.s(Xb.d, com.mapbox.bindgen.DataRef, java.lang.String, java.lang.String, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final String u(String str) {
        boolean contains$default;
        int indexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        contains$default = StringsKt__StringsKt.contains$default(str, (CharSequence) StubApp.getString2(478), false, 2, (Object) null);
        int i3 = 0;
        int i10 = -1;
        if (!contains$default) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    char charAt = lowerCase.charAt(i11);
                    if (Intrinsics.compare((int) charAt, 31) > 0 && Intrinsics.compare((int) charAt, CertificateBody.profileType) < 0) {
                        indexOf$default = StringsKt__StringsKt.indexOf$default(StubApp.getString2("25261"), charAt, 0, false, 6, (Object) null);
                        if (indexOf$default != -1) {
                            return null;
                        }
                        i11 = i12;
                    }
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress j = (StringsKt.O(str, StubApp.getString2(1557)) && StringsKt.u(str, StubApp.getString2(511))) ? j(1, str.length() - 1, str) : j(0, str.length(), str);
        if (j == null) {
            return null;
        }
        byte[] address = j.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return j.getHostAddress();
            }
            throw new AssertionError(Xa.h.n(StubApp.getString2(25260), '\'', str));
        }
        Intrinsics.checkNotNullExpressionValue(address, "address");
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i10 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        C0101h c0101h = new C0101h();
        while (i3 < address.length) {
            if (i3 == i10) {
                c0101h.Q(58);
                i3 += i14;
                if (i3 == 16) {
                    c0101h.Q(58);
                }
            } else {
                if (i3 > 0) {
                    c0101h.Q(58);
                }
                byte b2 = address[i3];
                byte[] bArr = xc.b.f23179a;
                c0101h.R(((b2 & UByte.MAX_VALUE) << 8) | (address[i3 + 1] & UByte.MAX_VALUE));
                i3 += 2;
            }
        }
        return c0101h.K();
    }

    public static String[] v(char c10, a5.c cVar) {
        char c11;
        C1070a c1070a;
        C0366a c0366a = hc.a.f14498a;
        c0366a.getClass();
        String property = ((Properties) c0366a.f9105b).getProperty(Integer.toHexString(c10).toUpperCase());
        String string2 = StubApp.getString2(74);
        String string22 = StubApp.getString2(2830);
        if (property == null || property.equals(StubApp.getString2(25262)) || !property.startsWith(string22) || !property.endsWith(string2)) {
            property = null;
        }
        String[] split = property != null ? property.substring(property.indexOf(string22) + 1, property.lastIndexOf(string2)).split(StubApp.getString2(321)) : null;
        if (split == null) {
            return null;
        }
        for (int i3 = 0; i3 < split.length; i3++) {
            String str = split[i3];
            C1070a c1070a2 = C1070a.f15016d;
            C1070a c1070a3 = (C1070a) cVar.f9284d;
            C1070a c1070a4 = C1070a.f15018f;
            if (c1070a2 == c1070a3 && (c1070a4 == (c1070a = (C1070a) cVar.f9282b) || C1070a.f15017e == c1070a)) {
                throw new A(StubApp.getString2(25263), 4);
            }
            C1070a c1070a5 = C1070a.f15015c;
            String string23 = StubApp.getString2(25264);
            String string24 = StubApp.getString2(1316);
            String string25 = StubApp.getString2(25265);
            if (c1070a5 == c1070a3) {
                str = str.replaceAll(StubApp.getString2(25266), "");
            } else if (c1070a2 == c1070a3) {
                str = str.replaceAll(string25, string24).toLowerCase();
                if (str.matches(StubApp.getString2(25267))) {
                    if (str.matches(StubApp.getString2(25268))) {
                        int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
                        int indexOf = str.indexOf(97);
                        int indexOf2 = str.indexOf(101);
                        String string26 = StubApp.getString2(25269);
                        int indexOf3 = str.indexOf(string26);
                        if (-1 != indexOf) {
                            indexOf3 = indexOf;
                            c11 = 'a';
                        } else if (-1 != indexOf2) {
                            indexOf3 = indexOf2;
                            c11 = 'e';
                        } else if (-1 == indexOf3) {
                            int length = str.length() - 1;
                            while (true) {
                                if (length < 0) {
                                    indexOf3 = -1;
                                    c11 = '$';
                                    break;
                                }
                                if (String.valueOf(str.charAt(length)).matches(StubApp.getString2(25270))) {
                                    indexOf3 = length;
                                    c11 = str.charAt(length);
                                    break;
                                }
                                length--;
                            }
                        } else {
                            c11 = string26.charAt(0);
                        }
                        if ('$' != c11 && -1 != indexOf3) {
                            char charAt = StubApp.getString2(25272).charAt((StubApp.getString2(25271).indexOf(c11) * 5) + (numericValue - 1));
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append(str.substring(0, indexOf3).replaceAll(string24, string23));
                            stringBuffer.append(charAt);
                            stringBuffer.append(str.substring(indexOf3 + 1, str.length() - 1).replaceAll(string24, string23));
                            str = stringBuffer.toString();
                        }
                    } else {
                        str = str.replaceAll(string24, string23);
                    }
                }
            }
            C1070a c1070a6 = (C1070a) cVar.f9282b;
            if (c1070a4 == c1070a6) {
                str = str.replaceAll(string25, string24);
            } else if (C1070a.f15019g == c1070a6) {
                str = str.replaceAll(string25, string23);
            }
            if (C1070a.f15013a == ((C1070a) cVar.f9283c)) {
                str = str.toUpperCase();
            }
            split[i3] = str;
        }
        return split;
    }

    public static ArrayList w(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof ob.b) {
            ob.b bVar = (ob.b) th;
            arrayList.add(bVar.f18644a);
            arrayList.add(bVar.getMessage());
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add(StubApp.getString2(6769) + th.getCause() + StubApp.getString2(604) + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void x(FileOutputStream fileOutputStream, String str) {
        for (int i3 = 0; i3 < str.length(); i3++) {
            fileOutputStream.write(str.charAt(i3));
        }
    }

    public static void y(FileOutputStream fileOutputStream, int i3) {
        fileOutputStream.write(i3);
        fileOutputStream.write(i3 >> 8);
        fileOutputStream.write(i3 >> 16);
        fileOutputStream.write(i3 >> 24);
    }

    public abstract Object d();

    public C1404A h(C0548a c0548a) {
        ByteBuffer byteBuffer = c0548a.f21396e;
        byteBuffer.getClass();
        AbstractC1550k.c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return i(c0548a, byteBuffer);
    }

    public abstract C1404A i(C0548a c0548a, ByteBuffer byteBuffer);

    public abstract l t(String str, Function1 function1);
}
