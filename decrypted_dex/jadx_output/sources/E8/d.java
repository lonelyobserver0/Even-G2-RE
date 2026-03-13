package E8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1938a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f1939b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f1940c;

    public d(String str, Throwable th, Integer num, int i3) {
        th = (i3 & 2) != 0 ? null : th;
        num = (i3 & 8) != 0 ? null : num;
        this.f1938a = str;
        this.f1939b = th;
        this.f1940c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.internal.router.NavigationRouterRefreshError");
        d dVar = (d) obj;
        if (Intrinsics.areEqual(this.f1938a, dVar.f1938a) && Intrinsics.areEqual(this.f1939b, dVar.f1939b) && Intrinsics.areEqual((Object) null, (Object) null)) {
            return Intrinsics.areEqual(this.f1940c, dVar.f1940c);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1938a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Throwable th = this.f1939b;
        int hashCode2 = (hashCode + (th != null ? th.hashCode() : 0)) * 961;
        Integer num = this.f1940c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(1887) + this.f1938a + StubApp.getString2(1888) + this.f1939b + StubApp.getString2(1889) + this.f1940c + ')';
    }
}
