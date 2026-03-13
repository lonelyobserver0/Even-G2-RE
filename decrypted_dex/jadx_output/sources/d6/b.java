package d6;

import com.stub.StubApp;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13428a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13429b;

    public b(int i3, ArrayList arrayList) {
        this.f13428a = new ArrayList(arrayList);
        this.f13429b = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f13428a.equals(((b) obj).f13428a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13428a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(16822) + this.f13428a + StubApp.getString2(9385);
    }
}
