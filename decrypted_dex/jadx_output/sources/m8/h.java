package m8;

import Qb.C0219s0;
import Qb.InterfaceC0221t0;
import Qb.J;
import Qb.L;
import R8.C0246d;
import R8.C0247e;
import R8.C0250h;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import q8.C1528c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class h implements q8.e, FunctionAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0250h f17170a;

    public h(C0250h c0250h) {
        this.f17170a = c0250h;
    }

    @Override // q8.e
    public final void a(q8.g result) {
        String joinToString$default;
        boolean z2;
        Intrinsics.checkNotNullParameter(result, "p0");
        C0250h c0250h = this.f17170a;
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.areEqual(result.f20097c, "ROUTES_UPDATE_REASON_REFRESH")) {
            return;
        }
        ((R8.D) c0250h.f6301f).f6263e = SystemClock.elapsedRealtime();
        Vb.f fVar = (Vb.f) ((F5.c) c0250h.f6298c).f2238b;
        C0219s0 c0219s0 = C0219s0.f5892a;
        CoroutineContext coroutineContext = fVar.f7941a;
        InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) coroutineContext.get(c0219s0);
        if (interfaceC0221t0 == null) {
            throw new IllegalStateException((StubApp.getString2(21099) + coroutineContext).toString());
        }
        L.e(interfaceC0221t0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : result.f20096b) {
            if (Intrinsics.areEqual(((C1528c) obj).f20088b, "Alternative fork point passed")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C1528c) it.next()).f20087a);
        }
        List routes = CollectionsKt___CollectionsKt.plus((Collection) result.f20095a, (Iterable) arrayList2);
        A3.s sVar = (A3.s) c0250h.f6297b;
        Intrinsics.checkNotNullParameter(routes, "routes");
        Vb.f fVar2 = (Vb.f) sVar.f196h;
        if (fVar2 != null) {
            J.b(fVar2);
            sVar.f196h = D9.l.i((Vb.f) sVar.f194f);
        }
        boolean isEmpty = routes.isEmpty();
        String string2 = StubApp.getString2(277);
        Z9.C c10 = (Z9.C) sVar.f191c;
        if (isEmpty) {
            sVar.f197i = null;
            D9.l.f(StubApp.getString2(21097), string2);
            c10.n(null, null);
            return;
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.f(routes));
        Iterator it2 = routes.iterator();
        while (it2.hasNext()) {
            arrayList3.add(D1.t((com.mapbox.navigation.base.route.g) it2.next()));
        }
        int i3 = 0;
        if (!arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (((R8.m) it3.next()) instanceof R8.l) {
                    List<com.mapbox.navigation.base.route.g> list = (List) sVar.f197i;
                    if (list != null && !list.isEmpty()) {
                        loop4: for (com.mapbox.navigation.base.route.g gVar : list) {
                            if (!routes.isEmpty()) {
                                Iterator it4 = routes.iterator();
                                while (it4.hasNext()) {
                                    if (Intrinsics.areEqual(gVar.f12506i, ((com.mapbox.navigation.base.route.g) it4.next()).f12506i)) {
                                        z2 = true;
                                        break loop4;
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                    sVar.f197i = routes;
                    ((i2.o) sVar.f195g).f14746a = 0;
                    C0247e c0247e = new C0247e(sVar, routes, null);
                    Vb.f fVar3 = (Vb.f) sVar.f196h;
                    if (fVar3 != null) {
                        L.j(fVar3, null, new C0246d(z2, sVar, c0247e, null), 3);
                        return;
                    }
                    return;
                }
            }
        }
        sVar.f197i = null;
        ArrayList validations = new ArrayList(CollectionsKt.f(arrayList3));
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            Object next = it5.next();
            int i10 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            validations.add(TuplesKt.to((R8.m) next, routes.get(i3)));
            i3 = i10;
        }
        Intrinsics.checkNotNullParameter(validations, "validations");
        ArrayList arrayList4 = new ArrayList();
        Iterator it6 = validations.iterator();
        while (it6.hasNext()) {
            Pair pair = (Pair) it6.next();
            Object first = pair.getFirst();
            R8.k kVar = first instanceof R8.k ? (R8.k) first : null;
            String str = kVar != null ? ((com.mapbox.navigation.base.route.g) pair.getSecond()).f12506i + ' ' + kVar.f6305a : null;
            if (str != null) {
                arrayList4.add(str);
            }
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList4, StubApp.getString2(2938), null, null, 0, null, null, 62, null);
        String str2 = StubApp.getString2(21098) + joinToString$default;
        D9.l.f(str2, string2);
        c10.n(StubApp.getString2(5766), null);
        c10.n(StubApp.getString2(279), str2);
        c10.n(null, null);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof q8.e) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.f17170a, C0250h.class, StubApp.getString2(21101), StubApp.getString2(21100), 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
