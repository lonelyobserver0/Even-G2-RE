package P8;

import D9.l;
import V8.q;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f5611a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f5612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f5613c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F5.c f5614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, F5.c cVar, Continuation continuation) {
        super(3, continuation);
        this.f5613c = iVar;
        this.f5614d = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        F5.c cVar = this.f5614d;
        e eVar = new e(this.f5613c, cVar, (Continuation) obj3);
        eVar.f5611a = (List) obj;
        eVar.f5612b = (String) obj2;
        return eVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List alternatives = this.f5611a;
        String routerOrigin = this.f5612b;
        String str = alternatives.size() + StubApp.getString2(5031);
        String string2 = StubApp.getString2(2039);
        l.d(str, string2);
        i iVar = this.f5613c;
        P7.b routeProgress = ((q) iVar.f5629b).f7890v;
        if (routeProgress == null) {
            l.d(StubApp.getString2(5032), string2);
            return Unit.INSTANCE;
        }
        s2.d dVar = (s2.d) iVar.f5637k;
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
            Intrinsics.checkNotNullParameter(alternatives, "alternatives");
            Intrinsics.checkNotNullParameter(routerOrigin, "routerOrigin");
            com.mapbox.navigation.base.route.g gVar = routeProgress.f5562a;
            String str2 = gVar.j;
            boolean areEqual = Intrinsics.areEqual(str2, "ONLINE");
            j jVar = j.f5639c;
            C9.e eVar = (C9.e) dVar.f20712b;
            if (areEqual) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : alternatives) {
                    if (Intrinsics.areEqual(((com.mapbox.navigation.base.route.g) obj2).j, "ONLINE")) {
                        arrayList.add(obj2);
                    }
                }
                eVar.invoke(new k(CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt.listOf(gVar), (Iterable) arrayList), jVar));
            } else if (Intrinsics.areEqual(str2, "OFFLINE")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : alternatives) {
                    if (Intrinsics.areEqual(((com.mapbox.navigation.base.route.g) obj3).j, "ONLINE")) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : alternatives) {
                    if (Intrinsics.areEqual(((com.mapbox.navigation.base.route.g) obj4).j, "OFFLINE")) {
                        arrayList3.add(obj4);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    eVar.invoke(new k(arrayList2, j.f5640d));
                } else if (!arrayList3.isEmpty()) {
                    eVar.invoke(new k(CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt.listOf(gVar), (Iterable) arrayList3), jVar));
                } else if (alternatives.isEmpty()) {
                    eVar.invoke(new k(CollectionsKt.listOf(gVar), jVar));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
