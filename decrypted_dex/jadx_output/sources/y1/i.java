package y1;

import com.stub.StubApp;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import o0.C1406C;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f23488a = Pattern.compile(StubApp.getString2(24618));

    public static boolean a(C1553n c1553n) {
        c1553n.getClass();
        String i3 = c1553n.i(StandardCharsets.UTF_8);
        return i3 != null && i3.startsWith(StubApp.getString2(24619));
    }

    public static float b(String str) {
        if (str.endsWith(StubApp.getString2(4964))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(StubApp.getString2(24620));
    }

    public static long c(String str) {
        int i3 = AbstractC1560u.f20190a;
        String[] split = str.split(StubApp.getString2(1612), 2);
        long j = 0;
        for (String str2 : split[0].split(StubApp.getString2(478), -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j3 = j * 1000;
        if (split.length == 2) {
            j3 += Long.parseLong(split[1]);
        }
        return j3 * 1000;
    }

    public static void d(C1553n c1553n) {
        int i3 = c1553n.f20177b;
        if (a(c1553n)) {
            return;
        }
        c1553n.G(i3);
        throw C1406C.a(StubApp.getString2(24621) + c1553n.i(StandardCharsets.UTF_8), null);
    }
}
