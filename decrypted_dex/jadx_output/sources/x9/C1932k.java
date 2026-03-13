package x9;

import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x9.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1932k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y9.h f23021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1932k(y9.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f23021a = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1932k(this.f23021a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1932k) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        y9.h hVar = this.f23021a;
        r9.r rVar = r9.r.f20461a;
        String string2 = StubApp.getString2(2053);
        com.mapbox.navigation.base.route.g gVar = hVar.f23574a;
        Intrinsics.checkNotNullParameter(gVar, string2);
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        ArrayList arrayList = gVar.f12508l;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (W.a.q((F7.k) next)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.f(arrayList2));
        Iterator it2 = arrayList2.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i10 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Feature fromGeometry = Feature.fromGeometry(((F7.k) next2).f2316a);
            fromGeometry.addStringProperty(StubApp.getString2(22755), i3 == 0 ? StubApp.getString2(3353) : StubApp.getString2(22753));
            arrayList3.add(fromGeometry);
            i3 = i10;
        }
        FeatureCollection fromFeatures = FeatureCollection.fromFeatures(arrayList3);
        Intrinsics.checkNotNullExpressionValue(fromFeatures, "fromFeatures(waypointFeatures)");
        return fromFeatures;
    }
}
