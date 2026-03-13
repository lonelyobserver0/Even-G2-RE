package M;

import com.stub.StubApp;
import java.util.Locale;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4430a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static char[] f4431b = new char[24];

    public static void a(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(String str, float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException(str.concat(StubApp.getString2(3475)));
        }
        if (Float.isInfinite(f10)) {
            throw new IllegalArgumentException(str.concat(StubApp.getString2(3474)));
        }
    }

    public static void c(long j, String str) {
        if (j < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str.concat(StubApp.getString2(3477)));
        }
        if (j <= LongCompanionObject.MAX_VALUE) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str.concat(StubApp.getString2(3476)));
    }

    public static void d(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(long j, StringBuilder sb2) {
        synchronized (f4430a) {
            sb2.append(f4431b, 0, g(j));
        }
    }

    public static int g(long j) {
        char c10;
        int i3;
        int i10;
        int i11;
        if (f4431b.length < 0) {
            f4431b = new char[0];
        }
        char[] cArr = f4431b;
        if (j == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j > 0) {
            c10 = '+';
        } else {
            j = -j;
            c10 = '-';
        }
        int i12 = (int) (j % 1000);
        int floor = (int) Math.floor(j / 1000);
        if (floor > 86400) {
            i3 = floor / 86400;
            floor -= 86400 * i3;
        } else {
            i3 = 0;
        }
        if (floor > 3600) {
            i10 = floor / 3600;
            floor -= i10 * 3600;
        } else {
            i10 = 0;
        }
        if (floor > 60) {
            int i13 = floor / 60;
            floor -= i13 * 60;
            i11 = i13;
        } else {
            i11 = 0;
        }
        cArr[0] = c10;
        int h2 = h(cArr, i3, 'd', 1, false, 0);
        int h4 = h(cArr, i10, 'h', h2, h2 != 1, 0);
        int h5 = h(cArr, i11, 'm', h4, h4 != 1, 0);
        int h9 = h(cArr, i12, 'm', h(cArr, floor, 's', h5, h5 != 1, 0), true, 0);
        cArr[h9] = 's';
        return h9 + 1;
    }

    public static int h(char[] cArr, int i3, char c10, int i10, boolean z2, int i11) {
        int i12;
        if (!z2 && i3 <= 0) {
            return i10;
        }
        if ((!z2 || i11 < 3) && i3 <= 99) {
            i12 = i10;
        } else {
            int i13 = i3 / 100;
            cArr[i10] = (char) (i13 + 48);
            i12 = i10 + 1;
            i3 -= i13 * 100;
        }
        if ((z2 && i11 >= 2) || i3 > 9 || i10 != i12) {
            int i14 = i3 / 10;
            cArr[i12] = (char) (i14 + 48);
            i12++;
            i3 -= i14 * 10;
        }
        cArr[i12] = (char) (i3 + 48);
        cArr[i12 + 1] = c10;
        return i12 + 2;
    }
}
