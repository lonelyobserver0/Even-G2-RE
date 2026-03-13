package F0;

import Ec.l;
import com.stub.StubApp;
import d1.C0797b;
import g1.C0950a;
import h1.C1005h;
import j1.C1074c;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2183a = new a();

    public final l a(C1438m c1438m) {
        String str = c1438m.f18216n;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals(StubApp.getString2(2006))) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals(StubApp.getString2(2005))) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals(StubApp.getString2(474))) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals(StubApp.getString2(494))) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals(StubApp.getString2(2004))) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new C0797b(0);
                case 1:
                    return new C0950a();
                case 2:
                    return new C1005h(null);
                case 3:
                    return new C0797b(1);
                case 4:
                    return new C1074c();
            }
        }
        throw new IllegalArgumentException(E1.a.j(StubApp.getString2(2007), str));
    }

    public final boolean b(C1438m c1438m) {
        String str = c1438m.f18216n;
        return StubApp.getString2(474).equals(str) || StubApp.getString2(494).equals(str) || StubApp.getString2(2004).equals(str) || StubApp.getString2(2005).equals(str) || StubApp.getString2(2006).equals(str);
    }
}
