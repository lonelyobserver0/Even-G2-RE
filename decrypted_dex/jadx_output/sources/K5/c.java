package K5;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements b, J5.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3721a;

    public c(Object obj) {
        this.f3721a = obj;
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        throw new NullPointerException(StubApp.getString2(3261));
    }

    @Override // Pb.a
    public final Object get() {
        return this.f3721a;
    }
}
