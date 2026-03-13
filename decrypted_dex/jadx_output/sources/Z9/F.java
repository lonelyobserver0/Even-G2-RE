package Z9;

import ba.AbstractC0534b;
import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class F extends AbstractC0374i implements X9.a {

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0370e f9082g;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f9081f = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f9083h = new ConcurrentHashMap();
    public final A0.c j = new A0.c(this);

    @Override // X9.b
    public final List a() {
        return (List) this.f9124b.get(StubApp.getString2(6566));
    }

    @Override // X9.a
    public final AbstractC0534b b() {
        return this.f9082g;
    }

    @Override // X9.b
    public final boolean e(String str) {
        AbstractC0368c abstractC0368c = this.f9125c;
        if (abstractC0368c.f9112a) {
            throw new IllegalStateException(StubApp.getString2(58));
        }
        Integer num = (Integer) abstractC0368c.f9115d.get(str);
        return this.f9125c.d(num == null ? 0 : num.intValue()) != 0;
    }

    public final L f(int i3, String str) {
        ConcurrentHashMap concurrentHashMap = this.f9083h;
        L l9 = (L) concurrentHashMap.get(Integer.valueOf(i3));
        if (l9 != null) {
            return l9;
        }
        byte[][] bArr = this.f9126d;
        byte[] bArr2 = i3 < bArr.length ? bArr[i3] : null;
        if (bArr2 == null) {
            bArr2 = bArr[0];
        }
        Dc.B b2 = new Dc.B();
        b2.f1539a = 0;
        b2.f1540b = 0;
        b2.f1541c = null;
        byte[][] bArr3 = this.f9127e;
        LinkedHashMap linkedHashMap = this.f9081f;
        List d8 = b2.d(bArr2, bArr3, (byte[][]) linkedHashMap.get(StubApp.getString2(6524)), true);
        String str2 = this.f9123a;
        LinkedHashMap linkedHashMap2 = this.f9124b;
        String string2 = StubApp.getString2(7681);
        Object obj = linkedHashMap2.get(string2);
        if (obj == null) {
            obj = linkedHashMap.get(string2);
        }
        Number number = (Number) obj;
        int intValue = number == null ? 1000 : number.intValue();
        String string22 = StubApp.getString2(7682);
        Object obj2 = linkedHashMap2.get(string22);
        if (obj2 == null) {
            obj2 = linkedHashMap.get(string22);
        }
        Number number2 = (Number) obj2;
        L l10 = new L(this.j, str2, str, d8, intValue, number2 != null ? number2.intValue() : 0);
        concurrentHashMap.put(Integer.valueOf(i3), l10);
        return l10;
    }

    @Override // X9.b
    public final float h(String str) {
        AbstractC0368c abstractC0368c = this.f9125c;
        if (abstractC0368c.f9112a) {
            throw new IllegalStateException(StubApp.getString2(58));
        }
        Integer num = (Integer) abstractC0368c.f9115d.get(str);
        L f10 = f(this.f9125c.d(num == null ? 0 : num.intValue()), str);
        if (f10.f9093d == null) {
            f10.a();
        }
        return f10.f9094e;
    }
}
