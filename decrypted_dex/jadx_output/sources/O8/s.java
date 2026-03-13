package O8;

import com.stub.StubApp;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s extends Tc.d {

    /* renamed from: c, reason: collision with root package name */
    public final String f5276c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f5277d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5278e;

    /* renamed from: f, reason: collision with root package name */
    public final List f5279f;

    public s(String message, Throwable th, List list, List preRouterReasons) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(preRouterReasons, "preRouterReasons");
        this.f5276c = message;
        this.f5277d = th;
        this.f5278e = list;
        this.f5279f = preRouterReasons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(s.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.reroute.RerouteState.Failed");
        s sVar = (s) obj;
        if (Intrinsics.areEqual(this.f5276c, sVar.f5276c) && Intrinsics.areEqual(this.f5277d, sVar.f5277d) && Intrinsics.areEqual(this.f5279f, sVar.f5279f)) {
            return Intrinsics.areEqual(this.f5278e, sVar.f5278e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5276c.hashCode() * 31;
        Throwable th = this.f5277d;
        int hashCode2 = (hashCode + (th != null ? th.hashCode() : 0)) * 31;
        List list = this.f5278e;
        return this.f5279f.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(4466) + this.f5276c + StubApp.getString2(4467) + this.f5277d + StubApp.getString2(4468) + this.f5278e + StubApp.getString2(4469) + this.f5279f + ')';
    }

    public /* synthetic */ s(String str, Throwable th, List list, int i3) {
        this(str, (i3 & 2) != 0 ? null : th, (i3 & 4) != 0 ? null : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(String message, Throwable th, List list) {
        this(message, th, list, CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
