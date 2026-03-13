package A9;

import com.stub.StubApp;
import kotlin.Function;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f222a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f223b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f224c;

    public c(Object obj, Object obj2, Object obj3) {
        this.f222a = obj;
        this.f223b = obj2;
        this.f224c = obj3;
    }

    @Override // A9.a
    public final Object a(Function function) {
        Function3 f10 = (Function3) function;
        Intrinsics.checkNotNullParameter(f10, "f");
        return f10.invoke(this.f222a, this.f223b, this.f224c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f222a, cVar.f222a) && Intrinsics.areEqual(this.f223b, cVar.f223b) && Intrinsics.areEqual(this.f224c, cVar.f224c);
    }

    public final int hashCode() {
        Object obj = this.f222a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f223b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f224c;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(366) + this.f222a + StubApp.getString2(367) + this.f223b + StubApp.getString2(368) + this.f224c + ')';
    }
}
