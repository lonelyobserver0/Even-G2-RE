package Z9;

import com.stub.StubApp;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Z9.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0367b extends AbstractC0374i {

    /* renamed from: f, reason: collision with root package name */
    public String f9106f;

    /* renamed from: g, reason: collision with root package name */
    public String f9107g;

    /* renamed from: h, reason: collision with root package name */
    public int f9108h;
    public LinkedList j;

    /* renamed from: k, reason: collision with root package name */
    public E f9109k;

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f9110l;

    /* renamed from: m, reason: collision with root package name */
    public final C0366a f9111m;

    public C0367b() {
        new LinkedList();
        this.j = new LinkedList();
        this.f9110l = new ConcurrentHashMap();
        this.f9111m = new C0366a(this, 0);
    }

    @Override // X9.b
    public final List a() {
        return (List) this.f9124b.get(StubApp.getString2(6566));
    }

    @Override // X9.b
    public final boolean e(String str) {
        if (str.startsWith(StubApp.getString2(639))) {
            return Integer.parseInt(str.substring(1)) != 0;
        }
        throw new IllegalArgumentException(StubApp.getString2(8165));
    }

    public final G f(int i3) {
        ConcurrentHashMap concurrentHashMap = this.f9110l;
        G g10 = (G) concurrentHashMap.get(Integer.valueOf(i3));
        if (g10 != null) {
            return g10;
        }
        int c10 = this.f9125c.c(i3);
        byte[][] bArr = this.f9126d;
        byte[] bArr2 = bArr[c10];
        int i10 = 0;
        if (bArr2 == null) {
            bArr2 = bArr[0];
        }
        Dc.B b2 = new Dc.B();
        b2.f1539a = 0;
        b2.f1540b = 0;
        b2.f1541c = null;
        Locale locale = Locale.US;
        Object[] objArr = {Integer.valueOf(i3)};
        String string2 = StubApp.getString2(8166);
        String.format(locale, string2, objArr);
        byte[][] bArr3 = this.f9127e;
        int a3 = this.f9109k.a(c10);
        List d8 = b2.d(bArr2, bArr3, a3 != -1 ? (byte[][]) ((Map) this.j.get(a3)).get(StubApp.getString2(6524)) : null, true);
        String str = this.f9123a;
        int a9 = this.f9109k.a(c10);
        int i11 = 1000;
        if (a9 != -1) {
            Map map = (Map) this.j.get(a9);
            String string22 = StubApp.getString2(7681);
            if (map.containsKey(string22)) {
                i11 = ((Number) map.get(string22)).intValue();
            }
        }
        int i12 = i11;
        int a10 = this.f9109k.a(c10);
        if (a10 != -1) {
            Map map2 = (Map) this.j.get(a10);
            String string23 = StubApp.getString2(7682);
            if (map2.containsKey(string23)) {
                i10 = ((Number) map2.get(string23)).intValue();
            }
        }
        G g11 = new G(this.f9111m, str, String.format(locale, string2, Integer.valueOf(i3)), d8, i12, i10);
        concurrentHashMap.put(Integer.valueOf(i3), g11);
        return g11;
    }

    @Override // X9.b
    public final float h(String str) {
        if (!str.startsWith(StubApp.getString2(639))) {
            throw new IllegalArgumentException(StubApp.getString2(8165));
        }
        G f10 = f(Integer.parseInt(str.substring(1)));
        if (f10.f9093d == null) {
            f10.a();
        }
        return f10.f9094e;
    }
}
