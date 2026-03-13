package E8;

import Qb.C0219s0;
import Qb.I;
import Qb.InterfaceC0221t0;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import i5.C1059c;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2015a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ URL f2017c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f2018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1059c f2019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DataRef f2020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2021g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RouterOrigin f2022h;
    public final /* synthetic */ Q2.g j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RouteOptions f2023k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(URL url, Long l9, C1059c c1059c, DataRef dataRef, String str, RouterOrigin routerOrigin, Q2.g gVar, RouteOptions routeOptions, Continuation continuation) {
        super(2, continuation);
        this.f2017c = url;
        this.f2018d = l9;
        this.f2019e = c1059c;
        this.f2020f = dataRef;
        this.f2021g = str;
        this.f2022h = routerOrigin;
        this.j = gVar;
        this.f2023k = routeOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = new r(this.f2017c, this.f2018d, this.f2019e, this.f2020f, this.f2021g, this.f2022h, this.j, this.f2023k, continuation);
        rVar.f2016b = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f2015a;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            I i10 = (I) this.f2016b;
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(1925));
            URL url = this.f2017c;
            sb2.append(url);
            D9.l.f(sb2.toString(), StubApp.getString2(1068));
            C1059c c1059c = this.f2019e;
            Long l9 = this.f2018d;
            if (l9 != null) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) c1059c.f14845d;
                if (linkedHashMap.get(l9) == null) {
                    if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
                        D9.l.f(StubApp.getString2(1926) + l9 + StubApp.getString2(1927), null);
                    }
                    return Unit.INSTANCE;
                }
                e eVar = (e) linkedHashMap.get(l9);
                if (eVar != null) {
                    eVar.f1941a = (InterfaceC0221t0) i10.h().get(C0219s0.f5892a);
                }
            }
            ByteBuffer response = this.f2020f.getBuffer();
            Intrinsics.checkNotNullExpressionValue(response, "responseBody.buffer");
            Intrinsics.checkNotNullParameter(response, "response");
            J7.p pVar = new J7.p(response.capacity());
            J7.o oVar = (J7.o) c1059c.f14843b;
            q qVar = new q(this.f2020f, this.f2021g, this.f2022h, this.j, url, this.f2023k, c1059c, null);
            this.f2015a = 1;
            if (oVar.b(pVar, qVar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
