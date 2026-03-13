package p0;

import com.google.android.gms.internal.measurement.F1;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import i2.u;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1550k;
import sb.C1635a;
import w.AbstractC1856e;

/* renamed from: p0.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class AbstractC1482f {
    public static int a(int i3) {
        for (int i10 : AbstractC1856e.d(4)) {
            if (b(i10) == i3) {
                return i10;
            }
        }
        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(22072)));
    }

    public static /* synthetic */ int b(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 90;
        }
        if (i3 == 3) {
            return 180;
        }
        if (i3 == 4) {
            return 270;
        }
        throw null;
    }

    public static int c(int i3, int i10, int i11, int i12) {
        return (i3 * i10) + i11 + i12;
    }

    public static Q6.a d(String str, String str2) {
        Q6.a aVar = new Q6.a(6, str, str2);
        aVar.k();
        aVar.n();
        return aVar;
    }

    public static String e(int i3, String str, int i10, String str2, String str3) {
        return str + i3 + str2 + i10 + str3;
    }

    public static String f(int i3, String str, StringBuilder sb2) {
        sb2.append(i3);
        sb2.append(str);
        return sb2.toString();
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String k(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder l(int i3, String str, int i10, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i3);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder m(long j, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder n(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static Result o(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, str2);
        return Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a(str3, str4, str5))));
    }

    public static void p(int i3, String str, String str2) {
        AbstractC1550k.w(str2, str + i3);
    }

    public static void q(int i3, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, Integer.valueOf(i3));
        hashMap.put(str2, Integer.valueOf(i10));
    }

    public static void r(String str, String str2, Integer num, Style style, Q6.a aVar) {
        F1.d(style, aVar, new LayerPosition(str, str2, num));
    }

    public static void s(String str, String str2, String str3) {
        AbstractC1550k.w(str3, str + str2);
    }

    public static void t(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, str2);
        Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a(str3, str4, str5))));
    }

    public static void u(C1635a c1635a) {
        Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(c1635a)));
    }

    public static int v(int i3, int i10, int i11, int i12) {
        return ((i3 + i10) - i11) / i12;
    }

    public static /* synthetic */ String w(int i3) {
        switch (i3) {
            case 1:
                return StubApp.getString2(207);
            case 2:
                return StubApp.getString2(14317);
            case 3:
                return StubApp.getString2(14316);
            case 4:
                return StubApp.getString2(14319);
            case 5:
                return StubApp.getString2(14318);
            case 6:
                return StubApp.getString2(22075);
            case 7:
                return StubApp.getString2(7572);
            case 8:
                return StubApp.getString2(22074);
            case 9:
                return StubApp.getString2(22073);
            default:
                throw null;
        }
    }

    public static /* synthetic */ int x(String str) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(7334));
        }
        if (str.equals(StubApp.getString2(22076))) {
            return 1;
        }
        if (str.equals(StubApp.getString2(22077))) {
            return 2;
        }
        if (str.equals(StubApp.getString2(22078))) {
            return 3;
        }
        throw new IllegalArgumentException(StubApp.getString2(22079).concat(str));
    }
}
