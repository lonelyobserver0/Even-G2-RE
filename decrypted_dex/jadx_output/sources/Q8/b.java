package Q8;

import O8.q;
import Tc.d;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends d {

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f5769c;

    /* renamed from: d, reason: collision with root package name */
    public final q f5770d;

    public b(Throwable error, q qVar) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f5769c = error;
        this.f5770d = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.routeoptions.RouteOptionsUpdater.RouteOptionsResult.Error");
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f5769c, bVar.f5769c) && Intrinsics.areEqual(this.f5770d, bVar.f5770d);
    }

    public final int hashCode() {
        int hashCode = this.f5769c.hashCode() * 31;
        q qVar = this.f5770d;
        return hashCode + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(5316) + this.f5769c + StubApp.getString2(5317) + this.f5770d + ')';
    }
}
