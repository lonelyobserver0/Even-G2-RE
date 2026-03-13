package f5;

import com.stub.StubApp;
import java.util.List;

/* renamed from: f5.h0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0902h0 extends J0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f14023a;

    public C0902h0(List list) {
        this.f14023a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        return this.f14023a.equals(((C0902h0) ((J0) obj)).f14023a);
    }

    public final int hashCode() {
        return this.f14023a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return E1.a.l(StubApp.getString2(265), new StringBuilder(StubApp.getString2(17643)), this.f14023a);
    }
}
