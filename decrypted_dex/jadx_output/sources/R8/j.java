package R8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f6303a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6304b;

    public j(String state, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f6303a = state;
        this.f6304b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.routerefresh.RouteRefreshStateResult");
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f6303a, jVar.f6303a) && Intrinsics.areEqual(this.f6304b, jVar.f6304b);
    }

    public final int hashCode() {
        int hashCode = this.f6303a.hashCode() * 31;
        String str = this.f6304b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5790));
        sb2.append(this.f6303a);
        sb2.append(StubApp.getString2(5791));
        return Xa.h.s(sb2, this.f6304b, ')');
    }
}
