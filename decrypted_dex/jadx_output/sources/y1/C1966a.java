package y1;

import com.stub.StubApp;
import java.util.regex.Pattern;
import r0.C1553n;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1966a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f23442c = Pattern.compile(StubApp.getString2(24581));

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f23443d = Pattern.compile(StubApp.getString2(24582));

    /* renamed from: a, reason: collision with root package name */
    public final C1553n f23444a = new C1553n();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f23445b = new StringBuilder();

    public static String a(C1553n c1553n, StringBuilder sb2) {
        boolean z2 = false;
        sb2.setLength(0);
        int i3 = c1553n.f20177b;
        int i10 = c1553n.f20178c;
        while (i3 < i10 && !z2) {
            char c10 = (char) c1553n.f20176a[i3];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z2 = true;
            } else {
                i3++;
                sb2.append(c10);
            }
        }
        c1553n.H(i3 - c1553n.f20177b);
        return sb2.toString();
    }

    public static String b(C1553n c1553n, StringBuilder sb2) {
        c(c1553n);
        if (c1553n.a() == 0) {
            return null;
        }
        String a3 = a(c1553n, sb2);
        if (!"".equals(a3)) {
            return a3;
        }
        return "" + ((char) c1553n.u());
    }

    public static void c(C1553n c1553n) {
        while (true) {
            for (boolean z2 = true; c1553n.a() > 0 && z2; z2 = false) {
                int i3 = c1553n.f20177b;
                byte[] bArr = c1553n.f20176a;
                byte b2 = bArr[i3];
                char c10 = (char) b2;
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    c1553n.H(1);
                } else {
                    int i10 = c1553n.f20178c;
                    int i11 = i3 + 2;
                    if (i11 <= i10) {
                        int i12 = i3 + 1;
                        if (b2 == 47 && bArr[i12] == 42) {
                            while (true) {
                                int i13 = i11 + 1;
                                if (i13 >= i10) {
                                    break;
                                }
                                if (((char) bArr[i11]) == '*' && ((char) bArr[i13]) == '/') {
                                    i11 += 2;
                                    i10 = i11;
                                } else {
                                    i11 = i13;
                                }
                            }
                            c1553n.H(i10 - c1553n.f20177b);
                        }
                    }
                }
            }
            return;
        }
    }
}
