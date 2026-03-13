package E8;

import D5.C0043g;
import Qb.C0219s0;
import Qb.I;
import Qb.InterfaceC0221t0;
import Qb.L;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigator.RouteRefreshOptions;
import com.stub.StubApp;
import i5.C1059c;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import z7.C2014b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1998a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f2000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1059c f2001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DataRef f2002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.mapbox.navigation.base.route.g f2003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RouteRefreshOptions f2004g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2014b f2005h;
    public final /* synthetic */ long j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q2.g f2006k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Long l9, C1059c c1059c, DataRef dataRef, com.mapbox.navigation.base.route.g gVar, RouteRefreshOptions routeRefreshOptions, C2014b c2014b, long j, Q2.g gVar2, Continuation continuation) {
        super(2, continuation);
        this.f2000c = l9;
        this.f2001d = c1059c;
        this.f2002e = dataRef;
        this.f2003f = gVar;
        this.f2004g = routeRefreshOptions;
        this.f2005h = c2014b;
        this.j = j;
        this.f2006k = gVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        p pVar = new p(this.f2000c, this.f2001d, this.f2002e, this.f2003f, this.f2004g, this.f2005h, this.j, this.f2006k, continuation);
        pVar.f1999b = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f1998a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            I i10 = (I) this.f1999b;
            Long l9 = this.f2000c;
            if (l9 != null) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2001d.f14846e;
                if (linkedHashMap.get(l9) == null) {
                    if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
                        D9.l.f(StubApp.getString2(1923) + l9 + StubApp.getString2(1924), null);
                    }
                    return Unit.INSTANCE;
                }
                e eVar = (e) linkedHashMap.get(l9);
                if (eVar != null) {
                    eVar.f1941a = (InterfaceC0221t0) i10.h().get(C0219s0.f5892a);
                }
            }
            Xb.d dVar = D9.h.f1516d;
            o oVar = new o(this.f2002e, this.f2003f, this.f2004g, this.f2005h, this.j, null);
            this.f1998a = 1;
            obj = L.n(dVar, oVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        Q2.g gVar = this.f2006k;
        ((Expected) obj).fold(new C0043g(2, gVar, this.f2002e), new C2.d(gVar, 9));
        return Unit.INSTANCE;
    }
}
