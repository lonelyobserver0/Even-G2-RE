package L4;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4182a;

    public i(Object obj) {
        this.f4182a = obj;
    }

    @Override // L4.f
    public final Object a() {
        return this.f4182a;
    }

    @Override // L4.f
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f4182a.equals(((i) obj).f4182a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4182a.hashCode() + 1502476572;
    }

    public final String toString() {
        return StubApp.getString2(3367) + this.f4182a + StubApp.getString2(74);
    }
}
