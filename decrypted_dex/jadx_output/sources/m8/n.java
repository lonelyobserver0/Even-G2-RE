package m8;

import Qb.I;
import com.mapbox.navigator.Experimental;
import com.mapbox.navigator.NavigationSessionState;
import com.mapbox.navigator.RouterInterface;
import com.mapbox.navigator.SetRoutesReason;
import com.mapbox.navigator.TilesConfig;
import com.stub.StubApp;
import f4.C0882f;
import i5.C1059c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f17189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17190c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, boolean z2, String str, Continuation continuation) {
        super(2, continuation);
        this.f17189b = rVar;
        this.f17190c = z2;
        this.f17191d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f17189b, this.f17190c, this.f17191d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SetRoutesReason setRoutesReason;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f17188a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            r rVar = this.f17189b;
            Z8.f g10 = rVar.g();
            String str = this.f17191d;
            boolean z2 = this.f17190c;
            TilesConfig tilesConfig = rVar.f(str, z2);
            Intrinsics.checkNotNullParameter(tilesConfig, "tilesConfig");
            NavigationSessionState storeNavigationSession = g10.a().storeNavigationSession();
            Intrinsics.checkNotNullExpressionValue(storeNavigationSession, "navigator.storeNavigationSession()");
            g10.f();
            g10.a().shutdown();
            g10.b(tilesConfig);
            g10.a().restoreNavigationSession(storeNavigationSession);
            Iterator it = g10.f9061n.iterator();
            while (it.hasNext()) {
                ((Z8.g) it.next()).a();
            }
            RouterInterface router = rVar.g().a().getRouter();
            Intrinsics.checkNotNullExpressionValue(router, "navigator.router");
            C1059c c1059c = rVar.f17244y;
            c1059c.getClass();
            Intrinsics.checkNotNullParameter(router, "router");
            ((RouterInterface) ((AtomicReference) c1059c.f14848g).getAndSet(router)).cancelAll();
            Experimental experimental = rVar.g().f9056h;
            if (experimental == null) {
                Intrinsics.throwUninitializedPropertyAccessException("experimental");
                experimental = null;
            }
            C0882f c0882f = rVar.f17211E;
            c0882f.getClass();
            Intrinsics.checkNotNullParameter(experimental, "<set-?>");
            c0882f.f13748b = experimental;
            List a3 = rVar.f17228h.a();
            if (!a3.isEmpty()) {
                Z8.f g11 = rVar.g();
                com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) a3.get(0);
                P7.b bVar = rVar.f17229i.f7890v;
                int i10 = bVar != null ? bVar.f5566e.f5553a : 0;
                List drop = CollectionsKt.drop(a3, 1);
                if (z2) {
                    setRoutesReason = SetRoutesReason.FALLBACK_TO_OFFLINE;
                } else {
                    if (z2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    setRoutesReason = SetRoutesReason.RESTORE_TO_ONLINE;
                }
                SetRoutesReason setRoutesReason2 = setRoutesReason;
                this.f17188a = 1;
                if (g11.d(gVar, i10, drop, setRoutesReason2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
