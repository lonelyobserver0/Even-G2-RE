package O8;

import Qb.C0203k;
import Qb.I;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O8.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0182c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f5226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RouteOptions f5227c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E8.c f5228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c5.B f5229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0182c(g gVar, RouteOptions routeOptions, E8.c cVar, c5.B b2, Continuation continuation) {
        super(2, continuation);
        this.f5226b = gVar;
        this.f5227c = routeOptions;
        this.f5228d = cVar;
        this.f5229e = b2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0182c(this.f5226b, this.f5227c, this.f5228d, this.f5229e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0182c) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f5225a;
        g gVar = this.f5226b;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f5225a = 1;
            gVar.getClass();
            C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(this));
            c0203k.s();
            e eVar = new e(c0203k);
            c0203k.u(new C9.d(gVar, gVar.f5238b.b(this.f5227c, this.f5228d, eVar), 1));
            obj = c0203k.r();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        C c10 = (C) obj;
        boolean z2 = c10 instanceof B;
        u uVar = u.f5281c;
        if (z2) {
            B b2 = (B) c10;
            gVar.V(new w(b2.f5223b));
            gVar.V(uVar);
            this.f5229e.a(new r(0, b2.f5223b, b2.f5222a));
        } else if (c10 instanceof A) {
            gVar.V(new s(StubApp.getString2(4414), (Throwable) null, ((A) c10).f5221a, 2));
            gVar.V(uVar);
        } else if (c10 instanceof z) {
            Tc.d dVar = gVar.f5246k;
            t tVar = t.f5280c;
            if (Intrinsics.areEqual(dVar, tVar)) {
                D9.l.f(StubApp.getString2(4415), null);
            }
            if (Intrinsics.areEqual(gVar.f5246k, tVar)) {
                gVar.V(v.f5282c);
                gVar.V(uVar);
            }
        }
        return Unit.INSTANCE;
    }
}
