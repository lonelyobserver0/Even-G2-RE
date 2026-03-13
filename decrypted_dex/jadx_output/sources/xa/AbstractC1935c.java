package xa;

import com.stub.StubApp;
import java.util.HashMap;
import ta.InterfaceC1743c;

/* renamed from: xa.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1935c implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23117a = new HashMap(250);

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23118b = new HashMap(250);

    public static AbstractC1935c b(oa.j jVar) {
        if (oa.j.f18549h3.equals(jVar)) {
            return C1940h.f23131d;
        }
        if (oa.j.f18464J3.equals(jVar)) {
            return C1942j.f23135d;
        }
        if (oa.j.b2.equals(jVar)) {
            return C1939g.f23129d;
        }
        if (oa.j.f18524a2.equals(jVar)) {
            return C1937e.f23125d;
        }
        return null;
    }

    public final void a(int i3, String str) {
        this.f23117a.put(Integer.valueOf(i3), str);
        HashMap hashMap = this.f23118b;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, Integer.valueOf(i3));
    }

    public final String c(int i3) {
        String str = (String) this.f23117a.get(Integer.valueOf(i3));
        return str != null ? str : StubApp.getString2(7719);
    }
}
