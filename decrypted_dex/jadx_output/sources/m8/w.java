package m8;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.g f17255a;

    /* renamed from: b, reason: collision with root package name */
    public final u8.h f17256b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f17257c;

    /* renamed from: d, reason: collision with root package name */
    public final List f17258d;

    public w(com.mapbox.navigation.base.route.g primaryRoute, u8.h primaryRouteProgressData, ArrayList alternativeRoutesProgressData) {
        Intrinsics.checkNotNullParameter(primaryRoute, "primaryRoute");
        Intrinsics.checkNotNullParameter(primaryRouteProgressData, "primaryRouteProgressData");
        Intrinsics.checkNotNullParameter(alternativeRoutesProgressData, "alternativeRoutesProgressData");
        this.f17255a = primaryRoute;
        this.f17256b = primaryRouteProgressData;
        this.f17257c = alternativeRoutesProgressData;
        this.f17258d = CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt.listOf(TuplesKt.to(primaryRoute, primaryRouteProgressData)), (Iterable) alternativeRoutesProgressData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.f17255a, wVar.f17255a) && Intrinsics.areEqual(this.f17256b, wVar.f17256b) && Intrinsics.areEqual(this.f17257c, wVar.f17257c);
    }

    public final int hashCode() {
        return this.f17257c.hashCode() + ((this.f17256b.hashCode() + (this.f17255a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(21163) + this.f17255a + StubApp.getString2(21164) + this.f17256b + StubApp.getString2(21165) + this.f17257c + ')';
    }
}
