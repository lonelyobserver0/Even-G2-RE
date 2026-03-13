package p5;

import com.stub.StubApp;
import java.util.Collections;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f19692a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f19693b;

    public c(String str, Map map) {
        this.f19692a = str;
        this.f19693b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19692a.equals(cVar.f19692a) && this.f19693b.equals(cVar.f19693b);
    }

    public final int hashCode() {
        return this.f19693b.hashCode() + (this.f19692a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(22120) + this.f19692a + StubApp.getString2(2298) + this.f19693b.values() + StubApp.getString2(265);
    }
}
