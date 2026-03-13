package C9;

import D9.l;
import J7.o;
import P8.k;
import Qb.L;
import Qb.W;
import Vb.q;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.route.g;
import com.mapbox.navigator.RouteInterface;
import com.stub.StubApp;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import m8.m;
import m8.r;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements Function1, SuspendFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1156a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i3, obj, cls, str, str2, i10);
        this.f1156a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = null;
        String string2 = StubApp.getString2(1220);
        switch (this.f1156a) {
            case 0:
                Expected expected = (Expected) obj;
                Intrinsics.checkNotNullParameter(expected, string2);
                ((Continuation) this.receiver).resumeWith(Result.m40constructorimpl(expected));
                break;
            case 1:
                String routeId = (String) obj;
                Intrinsics.checkNotNullParameter(routeId, string2);
                q8.d dVar = (q8.d) this.receiver;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(routeId, "routeId");
                Iterator it = AbstractC1526a.v(dVar).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (Intrinsics.areEqual(((g) next).f12506i, routeId)) {
                            obj2 = next;
                        }
                    }
                }
                break;
            case 2:
                RouteInterface route = (RouteInterface) obj;
                Intrinsics.checkNotNullParameter(route, string2);
                ((o) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(route, "route");
                if (l.a(l.g(), LoggingLevel.DEBUG)) {
                    l.d(StubApp.getString2(1221) + route.getRouteId(), StubApp.getString2(1222));
                }
                DataRef responseJsonRef = route.getResponseJsonRef();
                Intrinsics.checkNotNullExpressionValue(responseJsonRef, "route.responseJsonRef");
                break;
            case 3:
                r rVar = (r) this.receiver;
                rVar.getClass();
                Xb.d dVar2 = W.f5838a;
                Object n10 = L.n(q.f7968a.f6359c, new m(rVar, null), (Continuation) obj);
                if (n10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    break;
                }
                break;
            default:
                k kVar = (k) obj;
                Intrinsics.checkNotNullParameter(kVar, string2);
                r rVar2 = (r) this.receiver;
                rVar2.getClass();
                rVar2.k(kVar.f5641a, 0, null);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj) {
        super(1, obj, o.class, StubApp.getString2(1218), StubApp.getString2(1219), 0);
        this.f1156a = 2;
    }
}
