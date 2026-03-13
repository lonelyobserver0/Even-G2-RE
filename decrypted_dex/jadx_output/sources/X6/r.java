package X6;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f8470a;

    /* renamed from: b, reason: collision with root package name */
    public final j f8471b;

    public r(String str, j jVar) {
        this.f8470a = str;
        this.f8471b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Intrinsics.areEqual(getClass(), obj.getClass()) && Intrinsics.areEqual(((r) obj).f8470a, this.f8470a);
    }

    public final int hashCode() {
        return this.f8470a.hashCode() + 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(7283));
        sb2.append(this.f8470a);
        sb2.append(StubApp.getString2(7284));
        j jVar = this.f8471b;
        sb2.append(jVar != null ? jVar.getClass() : null);
        return sb2.toString();
    }
}
