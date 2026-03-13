package x9;

import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.NavigationRouteLine;
import com.stub.StubApp;
import e9.InterfaceC0853a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import w9.C1872b;
import w9.C1873c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Zb.a f23045a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23046b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f23047c;

    /* renamed from: d, reason: collision with root package name */
    public List f23048d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0853a f23049e;

    /* renamed from: f, reason: collision with root package name */
    public long f23050f;

    /* renamed from: g, reason: collision with root package name */
    public int f23051g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t f23052h;
    public final /* synthetic */ ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f23053k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f23054l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0853a f23055m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, ArrayList arrayList, List list, long j, InterfaceC0853a interfaceC0853a, Continuation continuation) {
        super(2, continuation);
        this.f23052h = tVar;
        this.j = arrayList;
        this.f23053k = list;
        this.f23054l = j;
        this.f23055m = interfaceC0853a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InterfaceC0853a interfaceC0853a = this.f23055m;
        return new r(this.f23052h, this.j, this.f23053k, this.f23054l, interfaceC0853a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [Zb.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        long j;
        t tVar;
        Zb.e eVar;
        ArrayList directionsRoutes;
        InterfaceC0853a interfaceC0853a;
        List list2;
        Zb.a aVar;
        Object a3;
        InterfaceC0853a interfaceC0853a2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f23051g;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = this.f23052h;
                Zb.e eVar2 = tVar2.f23073l;
                this.f23045a = eVar2;
                this.f23046b = tVar2;
                ArrayList arrayList = this.j;
                this.f23047c = arrayList;
                list = this.f23053k;
                this.f23048d = list;
                InterfaceC0853a interfaceC0853a3 = this.f23055m;
                this.f23049e = interfaceC0853a3;
                j = this.f23054l;
                this.f23050f = j;
                this.f23051g = 1;
                if (eVar2.e(this) != coroutine_suspended) {
                    tVar = tVar2;
                    eVar = eVar2;
                    directionsRoutes = arrayList;
                    interfaceC0853a = interfaceC0853a3;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                long j3 = this.f23050f;
                interfaceC0853a2 = (InterfaceC0853a) this.f23046b;
                aVar = this.f23045a;
                try {
                    ResultKt.throwOnFailure(obj);
                    j = j3;
                    a3 = obj;
                    E7.a aVar2 = E7.a.f1927a;
                    String string2 = StubApp.getString2("24204");
                    Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(j));
                    E7.a.b(string2);
                    interfaceC0853a2.accept((Expected) a3);
                    Unit unit = Unit.INSTANCE;
                    ((Zb.e) aVar).g(null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    ((Zb.e) aVar).g(null);
                    throw th;
                }
            }
            long j10 = this.f23050f;
            InterfaceC0853a interfaceC0853a4 = this.f23049e;
            list = this.f23048d;
            ArrayList arrayList2 = this.f23047c;
            t tVar3 = (t) this.f23046b;
            ?? r10 = this.f23045a;
            ResultKt.throwOnFailure(obj);
            interfaceC0853a = interfaceC0853a4;
            directionsRoutes = arrayList2;
            tVar = tVar3;
            eVar = r10;
            j = j10;
            w9.d dVar = tVar.f23066d;
            MapboxRouteLineApiOptions options = tVar.f23063a;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(options, "options");
            w9.g gVar = w9.h.f22164a;
            gVar.d(new C1872b(dVar, options, null));
            w9.d dVar2 = tVar.f23066d;
            dVar2.getClass();
            Intrinsics.checkNotNullParameter(directionsRoutes, "routeLines");
            gVar.c(new C1873c(dVar2, 0, directionsRoutes, null));
            r9.r rVar = r9.r.f20461a;
            Intrinsics.checkNotNullParameter(directionsRoutes, "directionsRoutes");
            t tVar4 = tVar;
            r9.p pVar = new r9.p(0, directionsRoutes);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.f(directionsRoutes));
            Iterator it = directionsRoutes.iterator();
            while (it.hasNext()) {
                arrayList3.add(((NavigationRouteLine) it.next()).getRoute());
            }
            this.f23045a = eVar;
            this.f23046b = interfaceC0853a;
            this.f23047c = null;
            this.f23048d = null;
            this.f23049e = null;
            this.f23050f = j;
            this.f23051g = 2;
            a3 = t.a(tVar4, arrayList3, pVar, list2, 0, this);
            if (a3 != coroutine_suspended) {
                interfaceC0853a2 = interfaceC0853a;
                aVar = eVar;
                E7.a aVar22 = E7.a.f1927a;
                String string22 = StubApp.getString2("24204");
                Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(j));
                E7.a.b(string22);
                interfaceC0853a2.accept((Expected) a3);
                Unit unit2 = Unit.INSTANCE;
                ((Zb.e) aVar).g(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            aVar = eVar;
            ((Zb.e) aVar).g(null);
            throw th;
        }
        list2 = list;
    }
}
