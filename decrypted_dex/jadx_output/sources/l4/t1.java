package l4;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.U1;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final M4.Z f16632a;

    static {
        String[] strArr = {StubApp.getString2(20105), StubApp.getString2(20081), StubApp.getString2(20097), StubApp.getString2(20098), StubApp.getString2(20099), StubApp.getString2(20100), StubApp.getString2(20101), StubApp.getString2(20108), StubApp.getString2(20106), StubApp.getString2(20107), StubApp.getString2(20109), StubApp.getString2(20110)};
        f16632a = M4.I.s(StubApp.getString2(8192), StubApp.getString2(20111), StubApp.getString2(20094), StubApp.getString2(20095), StubApp.getString2(20084), StubApp.getString2(20083), StubApp.getString2(20082), StubApp.getString2(20112), StubApp.getString2(20096), StubApp.getString2(20102), StubApp.getString2(20103), StubApp.getString2(20104), strArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static final boolean c(T1 t12, M4.e0 e0Var, M4.e0 e0Var2, M4.l0 l0Var, char[] cArr, int i3, int i10, int i11, String str, String str2, String str3, boolean z2, boolean z10) {
        s1 s1Var;
        char c10;
        int d8 = d(t12);
        if (d8 > 0 && (i10 != 1 || i3 != 1)) {
            cArr[d8] = '2';
        }
        if (h(t12, e0Var2) == U1.f11379b) {
            c10 = '3';
        } else {
            if (t12 == T1.f11364b && i11 == 1 && l0Var.f4636d.equals(str)) {
                if (d8 > 0 && cArr[d8] != '2') {
                    cArr[d8] = '1';
                }
                return true;
            }
            if (e0Var.containsKey(t12) && (s1Var = (s1) e0Var.get(t12)) != null) {
                int ordinal = s1Var.ordinal();
                U1 u12 = U1.f11381d;
                if (ordinal != 0) {
                    U1 u13 = U1.f11380c;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return h(t12, e0Var2) == u12 ? g(t12, cArr, str3, z10) : f(t12, cArr, str2, z2);
                        }
                        if (ordinal == 3) {
                            return h(t12, e0Var2) == u13 ? f(t12, cArr, str2, z2) : g(t12, cArr, str3, z10);
                        }
                    } else if (h(t12, e0Var2) != u13) {
                        return g(t12, cArr, str3, z10);
                    }
                } else if (h(t12, e0Var2) != u12) {
                    return f(t12, cArr, str2, z2);
                }
                c10 = '8';
            }
            c10 = '0';
        }
        if (d8 <= 0 || cArr[d8] == '2') {
            return false;
        }
        cArr[d8] = c10;
        return false;
    }

    public static final int d(T1 t12) {
        if (t12 == T1.f11364b) {
            return 1;
        }
        if (t12 == T1.f11366d) {
            return 2;
        }
        if (t12 == T1.f11367e) {
            return 3;
        }
        return t12 == T1.f11368f ? 4 : -1;
    }

    public static final String e(T1 t12, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String string2 = StubApp.getString2(824);
        String valueOf = (isEmpty || str.length() < t12.a()) ? string2 : String.valueOf(str.charAt(t12.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= t12.a()) {
            string2 = String.valueOf(str2.charAt(t12.a() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(string2));
    }

    public static final boolean f(T1 t12, char[] cArr, String str, boolean z2) {
        char c10;
        int d8 = d(t12);
        if (!z2) {
            c10 = '4';
        } else {
            if (str.length() >= t12.a()) {
                char charAt = str.charAt(t12.a() - 1);
                boolean z10 = charAt == '1';
                if (d8 > 0 && cArr[d8] != '2') {
                    cArr[d8] = charAt != '1' ? '6' : '1';
                }
                return z10;
            }
            c10 = '0';
        }
        if (d8 > 0 && cArr[d8] != '2') {
            cArr[d8] = c10;
        }
        return false;
    }

    public static final boolean g(T1 t12, char[] cArr, String str, boolean z2) {
        char c10;
        int d8 = d(t12);
        if (!z2) {
            c10 = '5';
        } else {
            if (str.length() >= t12.a()) {
                char charAt = str.charAt(t12.a() - 1);
                boolean z10 = charAt == '1';
                if (d8 > 0 && cArr[d8] != '2') {
                    cArr[d8] = charAt != '1' ? '7' : '1';
                }
                return z10;
            }
            c10 = '0';
        }
        if (d8 > 0 && cArr[d8] != '2') {
            cArr[d8] = c10;
        }
        return false;
    }

    public static final U1 h(T1 t12, M4.e0 e0Var) {
        Object obj = U1.f11382e;
        Object obj2 = e0Var.get(t12);
        if (obj2 != null) {
            obj = obj2;
        }
        return (U1) obj;
    }
}
