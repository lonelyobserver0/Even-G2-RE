package D7;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1495a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1496b;

    public c(int i3, boolean z2) {
        this.f1495a = i3;
        this.f1496b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1495a == cVar.f1495a && this.f1496b == cVar.f1496b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f1495a) * 31;
        boolean z2 = this.f1496b;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return hashCode + i3;
    }

    public final String toString() {
        return StubApp.getString2(1527) + this.f1495a + StubApp.getString2(1528) + this.f1496b + ')';
    }
}
