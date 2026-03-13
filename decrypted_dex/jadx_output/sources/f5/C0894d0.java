package f5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: f5.d0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0894d0 extends G0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13996a;

    public C0894d0(String str) {
        this.f13996a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        return this.f13996a.equals(((C0894d0) ((G0) obj)).f13996a);
    }

    public final int hashCode() {
        return this.f13996a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(17623)), this.f13996a, StubApp.getString2(265));
    }
}
