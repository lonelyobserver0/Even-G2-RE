package A9;

import com.stub.StubApp;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f221a;

    public b(Object obj) {
        this.f221a = obj;
    }

    @Override // A9.a
    public final Object a(Function function) {
        Function1 f10 = (Function1) function;
        Intrinsics.checkNotNullParameter(f10, "f");
        return f10.invoke(this.f221a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f221a, ((b) obj).f221a);
    }

    public final int hashCode() {
        Object obj = this.f221a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(365) + this.f221a + ')';
    }
}
