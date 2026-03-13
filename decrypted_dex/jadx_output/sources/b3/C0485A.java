package b3;

import Qb.S;
import a.AbstractC0378a;
import android.content.Context;
import android.util.Log;
import com.even.navigate.service.NavigationForegroundService;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.Location;
import com.mapbox.maps.MapView;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: b3.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0485A extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10496a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0498N f10498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0485A(C0498N c0498n, Continuation continuation) {
        super(2, continuation);
        this.f10498c = c0498n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0485A c0485a = new C0485A(this.f10498c, continuation);
        c0485a.f10497b = obj;
        return c0485a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0485A) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [Qb.I] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r52;
        String string2 = StubApp.getString2(8926);
        String string22 = StubApp.getString2(8927);
        String string23 = StubApp.getString2(8928);
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f10496a;
        C0498N c0498n = this.f10498c;
        String string24 = StubApp.getString2(103);
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Qb.I i10 = (Qb.I) this.f10497b;
                    KProperty[] kPropertyArr = C0498N.f10532Q0;
                    m8.r s10 = c0498n.s();
                    m8.j jVar = new m8.j(s10, 2);
                    boolean z2 = s10.f17218L;
                    if (!z2) {
                        jVar.invoke();
                    } else if (z2) {
                        throw new IllegalStateException(StubApp.getString2("8930"));
                    }
                    R2.c.b(string24, StubApp.getString2("8929"));
                    this.f10497b = i10;
                    this.f10496a = 1;
                    r52 = i10;
                    if (S.a(200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException(StubApp.getString2(275));
                    }
                    Qb.I i11 = (Qb.I) this.f10497b;
                    ResultKt.throwOnFailure(obj);
                    r52 = i11;
                }
            } catch (Exception e10) {
                c0498n.getClass();
                R2.c.f(string24, string23 + e10.getMessage());
                r52 = i3;
            }
            Context context = c0498n.f10568a;
            if (context != null) {
                int i12 = NavigationForegroundService.f11136b;
                AbstractC0378a.C(context);
                R2.c.b(string24, StubApp.getString2("8931"));
            }
            L9.n nVar = c0498n.f10592s0;
            if (nVar != null) {
                c0498n.f10544F.removeCallbacks(nVar);
            }
            c0498n.f10592s0 = null;
            c0498n.f10594t0 = null;
            c0498n.f10595u0 = null;
            c0498n.f10597v0 = 0;
            c0498n.f10604z = false;
            c0498n.f10542E = false;
            c0498n.f10538C = 0L;
            RunnableC0512n runnableC0512n = c0498n.f10546G;
            if (runnableC0512n != null) {
                c0498n.f10544F.removeCallbacks(runnableC0512n);
            }
            c0498n.f10546G = null;
            c0498n.f10579l0 = null;
            c0498n.f10583n0 = 0L;
            c0498n.f10581m0 = 0;
            c0498n.f10598w = null;
            R2.c.b(string24, StubApp.getString2("8932"));
            try {
                MapView mapView = c0498n.f10572e;
                if (mapView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapView");
                    mapView = null;
                }
                Style styleDeprecated = mapView.getMapboxMapDeprecated().getStyleDeprecated();
                if (styleDeprecated != null) {
                    x9.t tVar = c0498n.f10576k;
                    if (tVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("routeLineApi");
                        tVar = null;
                    }
                    tVar.c(new C0507i(c0498n, styleDeprecated, 4));
                    R2.c.b(string24, StubApp.getString2("8933"));
                }
            } catch (Exception e11) {
                R2.c.f(string24, string22 + e11.getMessage());
            }
            try {
                if (!c0498n.s().f17228h.a().isEmpty()) {
                    c0498n.s().k(CollectionsKt.emptyList(), 0, null);
                    R2.c.b(string24, StubApp.getString2("8934"));
                }
            } catch (Exception e12) {
                R2.c.f(string24, string2 + e12.getMessage());
            }
            C0498N c0498n2 = this.f10498c;
            Location location = c0498n2.f10574g;
            if (location != null) {
                Intrinsics.checkNotNull(location);
                double longitude = location.getLongitude();
                Location location2 = c0498n.f10574g;
                Intrinsics.checkNotNull(location2);
                c0498n2.w(longitude, location2.getLatitude(), Boxing.boxDouble(14.5d));
                R2.c.b(string24, StubApp.getString2("8935"));
            } else {
                DeviceLocationProvider deviceLocationProvider = c0498n2.f10573f;
                if (deviceLocationProvider != null) {
                    deviceLocationProvider.getLastLocation(new C0508j((Qb.I) r52, c0498n2));
                }
            }
        } catch (Exception e13) {
            c0498n.getClass();
            String message = e13.getMessage();
            String string25 = StubApp.getString2(8936);
            R2.c.c(string24, string25 + message);
            Log.e(string24, string25 + e13.getMessage(), e13);
            c0498n.f10598w = null;
            Context context2 = c0498n.f10568a;
            if (context2 != null) {
                int i13 = NavigationForegroundService.f11136b;
                AbstractC0378a.C(context2);
            }
        }
        return Unit.INSTANCE;
    }
}
