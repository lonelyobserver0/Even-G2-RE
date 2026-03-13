package Z9;

import com.stub.StubApp;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: Z9.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0377l {

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f9131c = new LinkedHashMap(52);

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f9132d = new LinkedHashMap(52);

    /* renamed from: a, reason: collision with root package name */
    public C0376k f9133a;

    /* renamed from: b, reason: collision with root package name */
    public String f9134b;

    static {
        a(new C0376k(0), StubApp.getString2(2155));
        a(new C0376k(1), StubApp.getString2(6571));
        a(new C0376k(12, 0), StubApp.getString2(7715));
        a(new C0376k(2), StubApp.getString2(6572));
        a(new C0376k(3), StubApp.getString2(6573));
        a(new C0376k(4), StubApp.getString2(6574));
        a(new C0376k(12, 1), StubApp.getString2(6576));
        a(new C0376k(12, 2), StubApp.getString2(6575));
        a(new C0376k(12, 3), StubApp.getString2(6577));
        a(new C0376k(12, 4), StubApp.getString2(6578));
        a(new C0376k(12, 5), StubApp.getString2(6564));
        a(new C0376k(12, 6), StubApp.getString2(7716));
        a(new C0376k(12, 7), StubApp.getString2(6566));
        a(new C0376k(13), StubApp.getString2(6568));
        a(new C0376k(5), StubApp.getString2(6567));
        a(new C0376k(12, 8), StubApp.getString2(6569));
        a(new C0376k(14), StubApp.getString2(7717));
        a(new C0376k(15), StubApp.getString2(7718));
        a(new C0376k(16), StubApp.getString2(6559));
        a(new C0376k(17), StubApp.getString2(6549));
        a(new C0376k(18), StubApp.getString2(6520));
        a(new C0376k(12, 20), StubApp.getString2(7712));
        a(new C0376k(12, 21), StubApp.getString2(8174));
        a(new C0376k(12, 22), StubApp.getString2(8175));
        a(new C0376k(12, 23), StubApp.getString2(8176));
        a(new C0376k(12, 30), StubApp.getString2(7713));
        a(new C0376k(12, 31), StubApp.getString2(8177));
        a(new C0376k(12, 32), StubApp.getString2(8178));
        a(new C0376k(12, 33), StubApp.getString2(8179));
        a(new C0376k(12, 34), StubApp.getString2(8180));
        a(new C0376k(12, 35), StubApp.getString2(8181));
        a(new C0376k(12, 36), StubApp.getString2(7721));
        a(new C0376k(12, 37), StubApp.getString2(7723));
        a(new C0376k(12, 38), StubApp.getString2(6563));
        a(new C0376k(6), StubApp.getString2(6535));
        a(new C0376k(7), StubApp.getString2(6536));
        a(new C0376k(8), StubApp.getString2(6537));
        a(new C0376k(9), StubApp.getString2(6538));
        a(new C0376k(12, 9), StubApp.getString2(6539));
        a(new C0376k(12, 10), StubApp.getString2(6540));
        a(new C0376k(12, 11), StubApp.getString2(6541));
        a(new C0376k(10), StubApp.getString2(6542));
        a(new C0376k(11), StubApp.getString2(6543));
        a(new C0376k(12, 12), StubApp.getString2(6544));
        a(new C0376k(12, 13), StubApp.getString2(6545));
        a(new C0376k(12, 14), StubApp.getString2(6546));
        a(new C0376k(12, 15), StubApp.getString2(6548));
        a(new C0376k(12, 16), StubApp.getString2(7679));
        a(new C0376k(12, 17), StubApp.getString2(7680));
        a(new C0376k(19), StubApp.getString2(6524));
        a(new C0376k(20), StubApp.getString2(7681));
        a(new C0376k(21), StubApp.getString2(7682));
    }

    public static void a(C0376k c0376k, String str) {
        C0377l c0377l = new C0377l();
        c0377l.f9133a = c0376k;
        c0377l.f9134b = str;
        f9131c.put(c0376k, c0377l);
        f9132d.put(str, c0377l);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0377l) {
            return this.f9133a.equals(((C0377l) obj).f9133a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9133a.f9130a);
    }

    public final String toString() {
        return this.f9134b;
    }
}
