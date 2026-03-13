package va;

import com.stub.StubApp;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f21903b = new f();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21904a;

    public f() {
        HashMap hashMap = new HashMap();
        this.f21904a = hashMap;
        HashMap hashMap2 = new HashMap();
        String string2 = StubApp.getString2(23701);
        boolean containsKey = hashMap.containsKey(string2);
        String string22 = StubApp.getString2(23702);
        if (containsKey) {
            throw new IllegalStateException(string22);
        }
        hashMap.put(string2, i.class);
        hashMap2.put(h.class, i.class);
        String string23 = StubApp.getString2(23703);
        if (hashMap.containsKey(string23)) {
            throw new IllegalStateException(string22);
        }
        hashMap.put(string23, C1843d.class);
        hashMap2.put(AbstractC1842c.class, C1843d.class);
    }
}
