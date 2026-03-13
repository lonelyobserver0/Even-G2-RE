package R8;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final C f6271a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6272b;

    public I(C primaryRouteRefresherResult, ArrayList alternativesRouteRefresherResults) {
        Intrinsics.checkNotNullParameter(primaryRouteRefresherResult, "primaryRouteRefresherResult");
        Intrinsics.checkNotNullParameter(alternativesRouteRefresherResults, "alternativesRouteRefresherResults");
        this.f6271a = primaryRouteRefresherResult;
        this.f6272b = alternativesRouteRefresherResults;
    }

    public final boolean a() {
        C c10 = this.f6271a;
        E e10 = E.f6264a;
        if (c10.f6258c == e10) {
            return true;
        }
        ArrayList arrayList = this.f6272b;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C) it.next()).f6258c == e10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i3 = (I) obj;
        return Intrinsics.areEqual(this.f6271a, i3.f6271a) && Intrinsics.areEqual(this.f6272b, i3.f6272b);
    }

    public final int hashCode() {
        return this.f6272b.hashCode() + (this.f6271a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(5764) + this.f6271a + StubApp.getString2(5765) + this.f6272b + ')';
    }
}
