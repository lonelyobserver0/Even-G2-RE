package x9;

import android.util.LruCache;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineClearValue;
import com.stub.StubApp;
import e9.InterfaceC0853a;
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
import q9.C1529a;
import w9.C1871a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Zb.e f23022a;

    /* renamed from: b, reason: collision with root package name */
    public t f23023b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0853a f23024c;

    /* renamed from: d, reason: collision with root package name */
    public long f23025d;

    /* renamed from: e, reason: collision with root package name */
    public int f23026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f23027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f23028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0853a f23029h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, long j, InterfaceC0853a interfaceC0853a, Continuation continuation) {
        super(2, continuation);
        this.f23027f = tVar;
        this.f23028g = j;
        this.f23029h = interfaceC0853a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f23027f, this.f23028g, this.f23029h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t tVar;
        Zb.e eVar;
        InterfaceC0853a interfaceC0853a;
        long j;
        String string2 = StubApp.getString2(24205);
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f23026e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            tVar = this.f23027f;
            eVar = tVar.f23073l;
            this.f23022a = eVar;
            this.f23023b = tVar;
            InterfaceC0853a interfaceC0853a2 = this.f23029h;
            this.f23024c = interfaceC0853a2;
            long j3 = this.f23028g;
            this.f23025d = j3;
            this.f23026e = 1;
            if (eVar.e(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC0853a = interfaceC0853a2;
            j = j3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            j = this.f23025d;
            interfaceC0853a = this.f23024c;
            tVar = this.f23023b;
            eVar = this.f23022a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            w9.d dVar = tVar.f23066d;
            dVar.getClass();
            w9.h.f22164a.c(new C1871a(dVar, null));
            tVar.f23068f = null;
            tVar.f23069g = CollectionsKt.emptyList();
            tVar.f23070h = CollectionsKt.emptyList();
            tVar.f23072k.clear();
            tVar.f23071i = CollectionsKt.emptyList();
            ((LruCache) r9.r.f20462b.getValue()).trimToSize(0);
            ((LruCache) r9.r.f20463c.getValue()).trimToSize(0);
            ((LruCache) tVar.f23078q.getValue()).evictAll();
            Iterator it = tVar.f23080s.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            E7.a aVar = E7.a.f1927a;
            String string22 = StubApp.getString2("24206");
            Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(j));
            E7.a.b(string22);
            FeatureCollection fromFeatures = FeatureCollection.fromFeatures((List<Feature>) CollectionsKt.emptyList());
            Intrinsics.checkNotNullExpressionValue(fromFeatures, string2);
            List listOf = CollectionsKt.listOf((Object[]) new FeatureCollection[]{FeatureCollection.fromFeatures((List<Feature>) CollectionsKt.emptyList()), FeatureCollection.fromFeatures((List<Feature>) CollectionsKt.emptyList())});
            FeatureCollection fromFeatures2 = FeatureCollection.fromFeatures((List<Feature>) CollectionsKt.emptyList());
            Intrinsics.checkNotNullExpressionValue(fromFeatures2, string2);
            Expected createValue = ExpectedFactory.createValue(new RouteLineClearValue(fromFeatures, listOf, fromFeatures2, new C1529a(CollectionsKt.emptyList())));
            Intrinsics.checkNotNullExpressionValue(createValue, "createValue(\n           … ),\n                    )");
            interfaceC0853a.accept(createValue);
            Unit unit = Unit.INSTANCE;
            eVar.g(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            eVar.g(null);
            throw th;
        }
    }
}
