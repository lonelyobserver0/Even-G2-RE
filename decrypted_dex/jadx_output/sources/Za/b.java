package Za;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9161c;

    public b(String str, String str2) {
        this.f9159a = str;
        this.f9160b = null;
        this.f9161c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f9159a.equals(bVar.f9159a)) {
            return this.f9161c.equals(bVar.f9161c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9161c.hashCode() + (this.f9159a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(8255));
        sb2.append(this.f9159a);
        sb2.append(StubApp.getString2(5142));
        return AbstractC1482f.k(sb2, this.f9161c, StubApp.getString2(5143));
    }

    public b(String str, String str2, String str3) {
        this.f9159a = str;
        this.f9160b = str2;
        this.f9161c = str3;
    }
}
