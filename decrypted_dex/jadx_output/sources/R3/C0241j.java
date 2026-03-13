package R3;

import com.stub.StubApp;

/* renamed from: R3.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0241j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6139b;

    public C0241j(Object obj, String str) {
        this.f6138a = obj;
        this.f6139b = str;
    }

    public final String a() {
        return this.f6139b + StubApp.getString2(893) + System.identityHashCode(this.f6138a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0241j)) {
            return false;
        }
        C0241j c0241j = (C0241j) obj;
        return this.f6138a == c0241j.f6138a && this.f6139b.equals(c0241j.f6139b);
    }

    public final int hashCode() {
        return this.f6139b.hashCode() + (System.identityHashCode(this.f6138a) * 31);
    }
}
