package d6;

import c6.C0573b;
import com.stub.StubApp;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0573b f13425a;

    /* renamed from: b, reason: collision with root package name */
    public final C0573b f13426b;

    /* renamed from: c, reason: collision with root package name */
    public final c6.c f13427c;

    public a(C0573b c0573b, C0573b c0573b2, c6.c cVar) {
        this.f13425a = c0573b;
        this.f13426b = c0573b2;
        this.f13427c = cVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f13425a, aVar.f13425a) && Objects.equals(this.f13426b, aVar.f13426b) && Objects.equals(this.f13427c, aVar.f13427c);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f13425a) ^ Objects.hashCode(this.f13426b)) ^ Objects.hashCode(this.f13427c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(16820));
        sb2.append(this.f13425a);
        sb2.append(StubApp.getString2(16821));
        sb2.append(this.f13426b);
        sb2.append(StubApp.getString2(8801));
        c6.c cVar = this.f13427c;
        sb2.append(cVar == null ? StubApp.getString2(1116) : Integer.valueOf(cVar.f10982a));
        sb2.append(StubApp.getString2(3120));
        return sb2.toString();
    }
}
