package F5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2232a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2233b;

    public a(String str, String str2) {
        this.f2232a = str;
        if (str2 == null) {
            throw new NullPointerException(StubApp.getString2(2012));
        }
        this.f2233b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2232a.equals(aVar.f2232a) && this.f2233b.equals(aVar.f2233b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2232a.hashCode() ^ 1000003) * 1000003) ^ this.f2233b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2013));
        sb2.append(this.f2232a);
        sb2.append(StubApp.getString2(2014));
        return AbstractC1482f.k(sb2, this.f2233b, StubApp.getString2(265));
    }
}
