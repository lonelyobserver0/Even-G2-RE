package Xa;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.C0599c2;
import com.mapbox.bindgen.RecordUtils;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class h {
    public static void A(boolean z2, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(Boolean.valueOf(z2)));
        sb2.append(str);
    }

    public static void B(int i3, String str, String str2) {
        Log.e(str2, str + i3);
    }

    public static /* synthetic */ String C(int i3) {
        switch (i3) {
            case 1:
                return StubApp.getString2(7415);
            case 2:
                return StubApp.getString2(7414);
            case 3:
                return StubApp.getString2(7413);
            case 4:
                return StubApp.getString2(7412);
            case 5:
                return StubApp.getString2(7411);
            case 6:
                return StubApp.getString2(7410);
            case 7:
                return StubApp.getString2(7409);
            case 8:
                return StubApp.getString2(7408);
            case 9:
                return StubApp.getString2(7407);
            case 10:
                return StubApp.getString2(7406);
            case 11:
                return StubApp.getString2(7405);
            case 12:
                return StubApp.getString2(7404);
            default:
                throw null;
        }
    }

    public static int a(int i3) {
        switch (i3) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i3) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ int b(int i3) {
        int i10 = 1;
        if (i3 != 1) {
            i10 = 2;
            if (i3 != 2) {
                i10 = 3;
                if (i3 != 3) {
                    if (i3 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int c(int i3) {
        switch (i3) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int d(int i3, int i10, int i11) {
        return C0599c2.T(i3) + i10 + i11;
    }

    public static int e(int i3, int i10, int i11, int i12) {
        return C0599c2.T(i3) + i10 + i11 + i12;
    }

    public static N6.d f(String value, Q6.c cVar, String str) {
        Intrinsics.checkNotNullParameter(value, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        N6.d[] expressions = {new N6.d(value)};
        Intrinsics.checkNotNullParameter(expressions, "expressions");
        N6.a aVar = new N6.a(StubApp.getString2(6443));
        aVar.a(expressions[0]);
        N6.d b2 = aVar.b();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(b2, str);
        return b2;
    }

    public static String g(int i3, String str, String str2) {
        return str + i3 + str2;
    }

    public static String h(long j, String str) {
        return str + j;
    }

    public static String i(long j, StringBuilder sb2, String str) {
        sb2.append(RecordUtils.fieldToString(Long.valueOf(j)));
        sb2.append(str);
        return sb2.toString();
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String k(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
        return sb2.toString();
    }

    public static String l(IllegalArgumentException illegalArgumentException, StringBuilder sb2) {
        sb2.append(illegalArgumentException.getMessage());
        return sb2.toString();
    }

    public static String m(Object obj, String str) {
        return str + obj;
    }

    public static String n(String str, char c10, String str2) {
        return str + str2 + c10;
    }

    public static String o(String str, int i3, int i10, String str2) {
        return str + i3 + str2 + i10;
    }

    public static String p(String str, Class cls, String str2) {
        return str + cls + str2;
    }

    public static String q(StringBuilder sb2, long j, String str) {
        sb2.append(j);
        sb2.append(str);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, String str) {
        return str + ((Object) sb2);
    }

    public static String s(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String t(StringBuilder sb2, String str, String str2) {
        sb2.append(RecordUtils.fieldToString(str));
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder u(int i3, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i3);
        sb2.append(str2);
        return sb2;
    }

    public static void v(int i3, String str, String str2) {
        Log.d(str2, str + i3);
    }

    public static void w(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void y(String str, N6.d dVar, Q6.c cVar) {
        cVar.i(new R6.a(str, dVar));
    }

    public static void z(StringBuilder sb2, String str, String str2) {
        sb2.append(RecordUtils.fieldToString(str));
        sb2.append(str2);
    }
}
