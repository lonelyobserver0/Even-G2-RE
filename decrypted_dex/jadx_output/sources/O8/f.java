package O8;

import Qb.I;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5235c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.mapbox.navigation.base.route.g f5236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c5.B f5237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, List list, com.mapbox.navigation.base.route.g gVar2, c5.B b2, Continuation continuation) {
        super(2, continuation);
        this.f5233a = gVar;
        this.f5234b = str;
        this.f5235c = list;
        this.f5236d = gVar2;
        this.f5237e = b2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f5233a, this.f5234b, this.f5235c, this.f5236d, this.f5237e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        g gVar = this.f5233a;
        P7.b bVar = gVar.f5239c.f7890v;
        String string2 = StubApp.getString2(4416);
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(bVar, string2);
            H7.a aVar = (H7.a) bVar.f5578r.get(this.f5234b);
            if (aVar != null) {
                i3 = aVar.f2930a;
                List mutableList = CollectionsKt.toMutableList((Collection) this.f5235c);
                com.mapbox.navigation.base.route.g gVar2 = this.f5236d;
                mutableList.remove(gVar2);
                mutableList.add(0, gVar2);
                D9.l.f(StubApp.getString2(4417), StubApp.getString2(4418));
                Intrinsics.checkNotNullParameter(gVar2, string2);
                RouterOrigin routerOrigin = gVar2.f12501d.getRouterOrigin();
                Intrinsics.checkNotNullExpressionValue(routerOrigin, "nativeRoute.routerOrigin");
                String p8 = Y3.a.p(routerOrigin);
                gVar.V(new w(p8));
                this.f5237e.a(new r(i3, p8, mutableList));
                gVar.V(u.f5281c);
                return Unit.INSTANCE;
            }
        }
        i3 = 0;
        List mutableList2 = CollectionsKt.toMutableList((Collection) this.f5235c);
        com.mapbox.navigation.base.route.g gVar22 = this.f5236d;
        mutableList2.remove(gVar22);
        mutableList2.add(0, gVar22);
        D9.l.f(StubApp.getString2(4417), StubApp.getString2(4418));
        Intrinsics.checkNotNullParameter(gVar22, string2);
        RouterOrigin routerOrigin2 = gVar22.f12501d.getRouterOrigin();
        Intrinsics.checkNotNullExpressionValue(routerOrigin2, "nativeRoute.routerOrigin");
        String p82 = Y3.a.p(routerOrigin2);
        gVar.V(new w(p82));
        this.f5237e.a(new r(i3, p82, mutableList2));
        gVar.V(u.f5281c);
        return Unit.INSTANCE;
    }
}
