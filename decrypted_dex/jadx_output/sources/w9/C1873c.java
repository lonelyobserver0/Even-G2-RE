package w9;

import com.mapbox.navigation.ui.maps.internal.route.line.LightRouteLine;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiEvent;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiSetRoutesValue;
import com.mapbox.navigation.ui.maps.route.line.model.NavigationRouteLine;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: w9.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1873c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f22148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f22150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1873c(d dVar, int i3, List list, Continuation continuation) {
        super(2, continuation);
        this.f22148a = dVar;
        this.f22149b = i3;
        this.f22150c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1873c(this.f22148a, this.f22149b, this.f22150c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1873c) create((CoroutineContext) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.f22148a.f19796a;
        List<NavigationRouteLine> list = this.f22150c;
        ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
        for (NavigationRouteLine navigationRouteLine : list) {
            arrayList.add(new LightRouteLine(navigationRouteLine.getRoute().f12506i, navigationRouteLine.getIdentifier()));
        }
        return new RouteLineApiEvent(str, new RouteLineApiSetRoutesValue(this.f22149b, arrayList));
    }
}
