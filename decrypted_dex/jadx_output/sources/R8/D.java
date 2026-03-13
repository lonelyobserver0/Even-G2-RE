package R8;

import android.os.SystemClock;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final Z9.C f6259a;

    /* renamed from: b, reason: collision with root package name */
    public final E0 f6260b;

    /* renamed from: c, reason: collision with root package name */
    public final s2.d f6261c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6262d;

    /* renamed from: e, reason: collision with root package name */
    public long f6263e;

    public D(Z9.C stateHolder, E0 observersManager, s2.d expiringDataRemover, long j) {
        D9.k timeProvider = D9.k.f1527a;
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(observersManager, "observersManager");
        Intrinsics.checkNotNullParameter(expiringDataRemover, "expiringDataRemover");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f6259a = stateHolder;
        this.f6260b = observersManager;
        this.f6261c = expiringDataRemover;
        this.f6262d = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(I routesRefresherResult) {
        Intrinsics.checkNotNullParameter(routesRefresherResult, "result");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a3 = routesRefresherResult.a();
        E0 e02 = this.f6260b;
        if (a3) {
            this.f6263e = elapsedRealtime;
            e02.I(routesRefresherResult);
            return;
        }
        if (elapsedRealtime >= this.f6263e + this.f6262d) {
            this.f6263e = elapsedRealtime;
            s2.d dVar = this.f6261c;
            Intrinsics.checkNotNullParameter(routesRefresherResult, "routesRefresherResult");
            C c10 = routesRefresherResult.f6271a;
            Object obj = c10.f6257b;
            int i3 = ((u8.h) obj).f21467a;
            com.mapbox.navigation.base.route.g gVar = c10.f6256a;
            F7.b bVar = new F7.b(gVar.f12498a.legs(), i3, dVar);
            boolean z2 = false;
            com.mapbox.navigation.base.route.g N3 = AbstractC1526a.N(gVar, bVar, C0243a.f6273a, null, null, new com.mapbox.navigation.base.route.m(false), 12);
            ArrayList arrayList = routesRefresherResult.f6272b;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C c11 = (C) it.next();
                com.mapbox.navigation.base.route.g gVar2 = c11.f6256a;
                Object obj2 = c11.f6257b;
                u8.h hVar = (u8.h) obj2;
                arrayList2.add(new C(AbstractC1526a.N(gVar2, new F7.b(gVar2.f12498a.legs(), hVar != null ? hVar.f21467a : z2, dVar), C0243a.f6273a, null, null, new com.mapbox.navigation.base.route.m(z2), 12), obj2, c11.f6258c));
                z2 = false;
            }
            I i10 = new I(new C(N3, obj, c10.f6258c), arrayList2);
            this.f6259a.n(StubApp.getString2(5758), null);
            if (Intrinsics.areEqual(routesRefresherResult, i10)) {
                return;
            }
            e02.I(i10);
        }
    }
}
