package Kc;

import com.stub.StubApp;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p0.AbstractC1482f;

/* renamed from: Kc.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0095b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0100g f3798a = new C0100g();

    public static final boolean a(byte[] a3, int i3, byte[] b2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a3[i12 + i3] != b2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static C0099f b() {
        C0099f c0099f = C0099f.f3807l;
        Intrinsics.checkNotNull(c0099f);
        C0099f c0099f2 = c0099f.f3809f;
        if (c0099f2 == null) {
            long nanoTime = System.nanoTime();
            C0099f.f3805i.await(C0099f.j, TimeUnit.MILLISECONDS);
            C0099f c0099f3 = C0099f.f3807l;
            Intrinsics.checkNotNull(c0099f3);
            if (c0099f3.f3809f != null || System.nanoTime() - nanoTime < C0099f.f3806k) {
                return null;
            }
            return C0099f.f3807l;
        }
        long nanoTime2 = c0099f2.f3810g - System.nanoTime();
        if (nanoTime2 > 0) {
            C0099f.f3805i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0099f c0099f4 = C0099f.f3807l;
        Intrinsics.checkNotNull(c0099f4);
        c0099f4.f3809f = c0099f2.f3809f;
        c0099f2.f3809f = null;
        return c0099f2;
    }

    public static final A c(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        return new A(f10);
    }

    public static final B d(H h2) {
        Intrinsics.checkNotNullParameter(h2, "<this>");
        return new B(h2);
    }

    public static void e(long j, C0101h c0101h, int i3, List list, int i10, int i11, List list2) {
        int i12;
        int i13;
        List list3;
        long j3;
        int i14;
        int i15 = i3;
        List list4 = list;
        List list5 = list2;
        String string2 = StubApp.getString2(353);
        if (i10 >= i11) {
            throw new IllegalArgumentException(string2);
        }
        for (int i16 = i10; i16 < i11; i16++) {
            if (((C0104k) list4.get(i16)).e() < i15) {
                throw new IllegalArgumentException(string2);
            }
        }
        C0104k c0104k = (C0104k) list.get(i10);
        C0104k c0104k2 = (C0104k) list4.get(i11 - 1);
        if (i15 == c0104k.e()) {
            int intValue = ((Number) list5.get(i10)).intValue();
            int i17 = i10 + 1;
            C0104k c0104k3 = (C0104k) list4.get(i17);
            i12 = i17;
            i13 = intValue;
            c0104k = c0104k3;
        } else {
            i12 = i10;
            i13 = -1;
        }
        if (c0104k.j(i15) == c0104k2.j(i15)) {
            int min = Math.min(c0104k.e(), c0104k2.e());
            int i18 = 0;
            for (int i19 = i15; i19 < min && c0104k.j(i19) == c0104k2.j(i19); i19++) {
                i18++;
            }
            long j10 = 4;
            long j11 = (c0101h.f3819b / j10) + j + 2 + i18 + 1;
            c0101h.S(-i18);
            c0101h.S(i13);
            int i20 = i15 + i18;
            while (i15 < i20) {
                c0101h.S(c0104k.j(i15) & 255);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i20 != ((C0104k) list4.get(i12)).e()) {
                    throw new IllegalStateException(StubApp.getString2(6068));
                }
                c0101h.S(((Number) list5.get(i12)).intValue());
                return;
            } else {
                C0101h c0101h2 = new C0101h();
                c0101h.S(((int) ((c0101h2.f3819b / j10) + j11)) * (-1));
                e(j11, c0101h2, i20, list4, i12, i11, list5);
                c0101h.t(c0101h2);
                return;
            }
        }
        int i21 = 1;
        for (int i22 = i12 + 1; i22 < i11; i22++) {
            if (((C0104k) list4.get(i22 - 1)).j(i15) != ((C0104k) list4.get(i22)).j(i15)) {
                i21++;
            }
        }
        long j12 = 4;
        long j13 = (c0101h.f3819b / j12) + j + 2 + (i21 * 2);
        c0101h.S(i21);
        c0101h.S(i13);
        for (int i23 = i12; i23 < i11; i23++) {
            int j14 = ((C0104k) list4.get(i23)).j(i15);
            if (i23 == i12 || j14 != ((C0104k) list4.get(i23 - 1)).j(i15)) {
                c0101h.S(j14 & 255);
            }
        }
        C0101h c0101h3 = new C0101h();
        int i24 = i12;
        while (i24 < i11) {
            byte j15 = ((C0104k) list4.get(i24)).j(i15);
            int i25 = i24 + 1;
            int i26 = i25;
            while (true) {
                if (i26 >= i11) {
                    i26 = i11;
                    break;
                } else if (j15 != ((C0104k) list4.get(i26)).j(i15)) {
                    break;
                } else {
                    i26++;
                }
            }
            if (i25 == i26 && i15 + 1 == ((C0104k) list4.get(i24)).e()) {
                c0101h.S(((Number) list5.get(i24)).intValue());
                list3 = list5;
                j3 = j13;
                i14 = i26;
            } else {
                c0101h.S(((int) ((c0101h3.f3819b / j12) + j13)) * (-1));
                list3 = list5;
                j3 = j13;
                i14 = i26;
                e(j3, c0101h3, i15 + 1, list, i24, i14, list3);
                list4 = list;
            }
            j13 = j3;
            i24 = i14;
            list5 = list3;
        }
        c0101h.t(c0101h3);
    }

    public static final void f(long j, long j3, long j10) {
        if ((j3 | j10) < 0 || j3 > j || j - j3 < j10) {
            StringBuilder m4 = AbstractC1482f.m(j, StubApp.getString2(25324), StubApp.getString2(25342));
            m4.append(j3);
            m4.append(StubApp.getString2(25343));
            m4.append(j10);
            throw new ArrayIndexOutOfBoundsException(m4.toString());
        }
    }

    public static final boolean g(AssertionError assertionError) {
        Logger logger = v.f3853a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt__StringsKt.contains$default(message, (CharSequence) StubApp.getString2(25344), false, 2, (Object) null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final int h(int i3) {
        return ((i3 & 255) << 24) | (((-16777216) & i3) >>> 24) | ((16711680 & i3) >>> 8) | ((65280 & i3) << 8);
    }

    public static final long i(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final C0097d j(Socket socket) {
        Logger logger = v.f3853a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        G g10 = new G(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        x sink = new x(outputStream, g10);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C0097d(g10, sink);
    }

    public static long k(String str) {
        int i3;
        int length = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(Xa.h.o(StubApp.getString2(25346), length, 0, StubApp.getString2(2975)).toString());
        }
        if (length > str.length()) {
            StringBuilder u2 = Xa.h.u(length, StubApp.getString2(25345), StubApp.getString2(21089));
            u2.append(str.length());
            throw new IllegalArgumentException(u2.toString().toString());
        }
        long j = 0;
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i3 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i3 = 3;
                } else {
                    int i11 = i10 + 1;
                    char charAt2 = i11 < length ? str.charAt(i11) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i10 = i11;
                    } else {
                        j += 4;
                        i10 += 2;
                    }
                }
                j += i3;
            }
            i10++;
        }
        return j;
    }

    public static final C0098e l(Socket socket) {
        Logger logger = v.f3853a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        G g10 = new G(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        C0098e source = new C0098e(inputStream, g10);
        Intrinsics.checkNotNullParameter(source, "source");
        return new C0098e(g10, source);
    }
}
