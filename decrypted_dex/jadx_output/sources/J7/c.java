package J7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3415a;

    public c(Object obj) {
        this.f3415a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f3415a, ((c) obj).f3415a);
    }

    public final int hashCode() {
        Object obj = this.f3415a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(3025) + this.f3415a + ')';
    }
}
