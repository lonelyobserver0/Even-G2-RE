package u5;

import com.stub.StubApp;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21441a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21442b;

    public a(ArrayList arrayList, String str) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(23559));
        }
        this.f21441a = str;
        this.f21442b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21441a.equals(aVar.f21441a) && this.f21442b.equals(aVar.f21442b);
    }

    public final int hashCode() {
        return ((this.f21441a.hashCode() ^ 1000003) * 1000003) ^ this.f21442b.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(23560) + this.f21441a + StubApp.getString2(23561) + this.f21442b + StubApp.getString2(265);
    }
}
