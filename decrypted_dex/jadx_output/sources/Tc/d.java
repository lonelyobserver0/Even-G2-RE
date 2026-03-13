package Tc;

import N.M;
import Q.f;
import Qb.P;
import T0.J;
import com.google.protobuf.T;
import com.stub.StubApp;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oa.C1471d;
import oa.j;
import q8.AbstractC1526a;
import r0.AbstractC1550k;
import v.C1795h;
import v.C1797j;
import v.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class d implements M, f {

    /* renamed from: a, reason: collision with root package name */
    public static c f7424a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f7425b;

    public static C1797j d(P this_asListenableFuture) {
        String string2 = StubApp.getString2(25681);
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "<this>");
        C1795h completer = new C1795h();
        completer.f21515c = new k();
        C1797j c1797j = new C1797j(completer);
        completer.f21514b = c1797j;
        completer.f21513a = E1.a.class;
        try {
            Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
            Intrinsics.checkNotNullParameter(completer, "completer");
            this_asListenableFuture.I(new E1.b(0, completer, this_asListenableFuture));
            completer.f21513a = string2;
        } catch (Exception e10) {
            c1797j.f21519b.k(e10);
        }
        Intrinsics.checkNotNullExpressionValue(c1797j, "getFuture { completer ->…      }\n        tag\n    }");
        return c1797j;
    }

    public static boolean e(Serializable cameraCurrentValue, Object startValue, Object[] values) {
        Intrinsics.checkNotNullParameter(cameraCurrentValue, "cameraCurrentValue");
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        Intrinsics.checkNotNullParameter(values, "values");
        if (Intrinsics.areEqual(cameraCurrentValue, startValue)) {
            for (Object obj : values) {
                if (Objects.equals(startValue, obj)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap f(int r9, byte[] r10) {
        /*
            r0 = 0
            r1 = 0
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r10, r0, r9, r1)
            if (r2 == 0) goto L5e
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream
            r9.<init>(r10)
            b0.h r10 = new b0.h     // Catch: java.lang.Throwable -> L52
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L52
            r9.close()
            r9 = 3846(0xf06, float:5.39E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            b0.d r9 = r10.c(r9)
            if (r9 != 0) goto L23
            goto L2a
        L23:
            java.nio.ByteOrder r10 = r10.f10467g     // Catch: java.lang.NumberFormatException -> L2a
            int r9 = r9.h(r10)     // Catch: java.lang.NumberFormatException -> L2a
            goto L2b
        L2a:
            r9 = 1
        L2b:
            switch(r9) {
                case 3: goto L35;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L2f;
                case 7: goto L2f;
                case 8: goto L32;
                default: goto L2e;
            }
        L2e:
            goto L37
        L2f:
            r0 = 90
            goto L37
        L32:
            r0 = 270(0x10e, float:3.78E-43)
            goto L37
        L35:
            r0 = 180(0xb4, float:2.52E-43)
        L37:
            if (r0 == 0) goto L51
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            float r9 = (float) r0
            r7.postRotate(r9)
            int r5 = r2.getWidth()
            int r6 = r2.getHeight()
            r3 = 0
            r4 = 0
            r8 = 0
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
        L51:
            return r2
        L52:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L58
            goto L5d
        L58:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)
        L5d:
            throw r10
        L5e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            r10 = 25682(0x6452, float:3.5988E-41)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            o0.C r9 = o0.C1406C.a(r10, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Tc.d.f(int, byte[]):android.graphics.Bitmap");
    }

    public static String h(int i3, ByteBuffer byteBuffer, int i10) {
        if ((i3 | i10 | ((byteBuffer.limit() - i3) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format(StubApp.getString2(12629), Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i3), Integer.valueOf(i10)));
        }
        int i11 = i3 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i3 < i11) {
            byte b2 = byteBuffer.get(i3);
            if (b2 < 0) {
                break;
            }
            i3++;
            cArr[i12] = (char) b2;
            i12++;
        }
        int i13 = i12;
        while (i3 < i11) {
            int i14 = i3 + 1;
            byte b10 = byteBuffer.get(i3);
            if (b10 >= 0) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b10;
                int i16 = i14;
                while (i16 < i11) {
                    byte b11 = byteBuffer.get(i16);
                    if (b11 < 0) {
                        break;
                    }
                    i16++;
                    cArr[i15] = (char) b11;
                    i15++;
                }
                i13 = i15;
                i3 = i16;
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw T.b();
                }
                i3 += 2;
                Oc.a.b(b10, byteBuffer.get(i14), cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw T.b();
                }
                int i17 = i3 + 2;
                i3 += 3;
                Oc.a.c(b10, byteBuffer.get(i14), byteBuffer.get(i17), cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw T.b();
                }
                byte b12 = byteBuffer.get(i14);
                int i18 = i3 + 3;
                byte b13 = byteBuffer.get(i3 + 2);
                i3 += 4;
                Oc.a.a(b10, b12, b13, byteBuffer.get(i18), cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static String k(int i3) {
        String upperCase = Integer.toString(i3, 16).toUpperCase(Locale.US);
        int length = upperCase.length();
        return length != 1 ? length != 2 ? length != 3 ? StubApp.getString2(17157).concat(upperCase) : StubApp.getString2(25683).concat(upperCase) : StubApp.getString2(25684).concat(upperCase) : StubApp.getString2(25685).concat(upperCase);
    }

    public static final y7.c l(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "this.country");
        String upperCase = country.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int hashCode = upperCase.hashCode();
        return (hashCode == 2438 ? upperCase.equals(StubApp.getString2(4644)) : hashCode == 2464 ? upperCase.equals(StubApp.getString2(4629)) : hashCode == 2718 && upperCase.equals(StubApp.getString2(2912))) ? y7.c.f23545b : y7.c.f23546c;
    }

    public static boolean m(String str) {
        X1.b bVar = X1.k.f8247a;
        Set<X1.d> unmodifiableSet = Collections.unmodifiableSet(X1.c.f8239c);
        HashSet hashSet = new HashSet();
        for (X1.d dVar : unmodifiableSet) {
            if (((X1.c) dVar).f8240a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(E1.a.j(StubApp.getString2(25686), str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            X1.c cVar = (X1.c) ((X1.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static Long o(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static int q(J j, int i3, int i10, int i11) {
        AbstractC1550k.c(Math.max(Math.max(i3, i10), i11) <= 31);
        int i12 = (1 << i3) - 1;
        int i13 = (1 << i10) - 1;
        AbstractC1526a.e(AbstractC1526a.e(i12, i13), 1 << i11);
        if (j.b() < i3) {
            return -1;
        }
        int i14 = j.i(i3);
        if (i14 == i12) {
            if (j.b() < i10) {
                return -1;
            }
            int i15 = j.i(i10);
            i14 += i15;
            if (i15 == i13) {
                if (j.b() < i11) {
                    return -1;
                }
                return j.i(i11) + i14;
            }
        }
        return i14;
    }

    public static final void r(String str) {
        System.err.println(StubApp.getString2(25687) + str);
    }

    public static final boolean s(Double d8, Double d10) {
        return d8 == null ? d10 == null : d10 != null && Double.compare(d8.doubleValue(), d10.doubleValue()) == 0;
    }

    public static void t(J j) {
        j.t(3);
        j.t(8);
        boolean h2 = j.h();
        boolean h4 = j.h();
        if (h2) {
            j.t(5);
        }
        if (h4) {
            j.t(6);
        }
    }

    public static void u(J j) {
        int i3;
        int i10 = j.i(2);
        if (i10 == 0) {
            j.t(6);
            return;
        }
        int q10 = q(j, 5, 8, 16) + 1;
        if (i10 == 1) {
            j.t(q10 * 7);
            return;
        }
        if (i10 == 2) {
            boolean h2 = j.h();
            int i11 = h2 ? 1 : 5;
            int i12 = h2 ? 7 : 5;
            int i13 = h2 ? 8 : 6;
            int i14 = 0;
            while (i14 < q10) {
                if (j.h()) {
                    j.t(7);
                    i3 = 0;
                } else {
                    if (j.i(2) == 3 && j.i(i12) * i11 != 0) {
                        j.s();
                    }
                    i3 = j.i(i13) * i11;
                    if (i3 != 0 && i3 != 180) {
                        j.s();
                    }
                    j.s();
                }
                if (i3 != 0 && i3 != 180 && j.h()) {
                    i14++;
                }
                i14++;
            }
        }
    }

    public static OutputStream v(OutputStream outputStream, C1471d c1471d) {
        int N3 = c1471d.N(j.f18463J2, null, -1);
        return N3 > 1 ? new pa.j(outputStream, N3, Math.min(c1471d.N(j.f18573o0, null, 1), 32), c1471d.N(j.f18423B, null, 8), c1471d.N(j.f18582q0, null, 1)) : outputStream;
    }

    public static int w(int i3) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i3) {
                return i11;
            }
        }
        return 1;
    }

    @Override // N.M
    public void a() {
    }

    @Override // N.M
    public void b() {
    }

    public abstract String g(int i3, int i10, byte[] bArr);

    public abstract String i(int i3, ByteBuffer byteBuffer, int i10);

    public abstract int j(String str, byte[] bArr, int i3, int i10);

    public boolean n(int i3, int i10, byte[] bArr) {
        return p(i3, i10, bArr) == 0;
    }

    public abstract int p(int i3, int i10, byte[] bArr);
}
