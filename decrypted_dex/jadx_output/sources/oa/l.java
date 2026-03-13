package oa;

import com.stub.StubApp;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class l extends AbstractC1469b {
    static {
        i[] iVarArr = i.f18411c;
        i[] iVarArr2 = i.f18411c;
    }

    public static l d(String str) {
        String string2;
        int length = str.length();
        String string22 = StubApp.getString2(22044);
        if (length == 1) {
            char charAt = str.charAt(0);
            if ('0' <= charAt && charAt <= '9') {
                return i.H(charAt - 48);
            }
            if (charAt == '-' || charAt == '.') {
                return i.f18412d;
            }
            throw new IOException(string22.concat(str));
        }
        int length2 = str.length();
        int i3 = 0;
        while (true) {
            string2 = StubApp.getString2(999);
            if (i3 >= length2) {
                try {
                    return str.charAt(0) == '+' ? i.H(Long.parseLong(str.substring(1))) : i.H(Long.parseLong(str));
                } catch (NumberFormatException unused) {
                    if (((str.startsWith(StubApp.getString2(4966)) || str.startsWith(string2)) ? str.substring(1) : str).matches(StubApp.getString2(22049))) {
                        return str.startsWith(string2) ? i.f18415g : i.f18414f;
                    }
                    throw new IOException(string22.concat(str));
                }
            }
            char charAt2 = str.charAt(i3);
            if (charAt2 == '.' || charAt2 == 'e') {
                break;
            }
            i3++;
        }
        C1473f c1473f = new C1473f();
        try {
            c1473f.f18407b = str;
            c1473f.f18406a = new BigDecimal(c1473f.f18407b);
            c1473f.H();
            return c1473f;
        } catch (NumberFormatException e10) {
            boolean startsWith = str.startsWith(StubApp.getString2(22045));
            String string23 = StubApp.getString2(620);
            String string24 = StubApp.getString2(22046);
            if (startsWith) {
                c1473f.f18407b = str.substring(1);
            } else {
                if (!str.matches(StubApp.getString2(22047))) {
                    throw new IOException(E1.a.k(string24, str, string23), e10);
                }
                c1473f.f18407b = string2 + c1473f.f18407b.replaceFirst(StubApp.getString2(22048), "");
            }
            try {
                c1473f.f18406a = new BigDecimal(c1473f.f18407b);
                c1473f.H();
                return c1473f;
            } catch (NumberFormatException e11) {
                throw new IOException(E1.a.k(string24, str, string23), e11);
            }
        }
    }

    public abstract int F();

    public abstract long G();

    public abstract float a();
}
