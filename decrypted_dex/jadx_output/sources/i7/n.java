package i7;

import X2.q;
import X2.w;
import Y6.t;
import android.graphics.PointF;
import b3.C0490F;
import b3.C0491G;
import b3.C0498N;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.util.CoreGesturesHandler;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MessageCodec;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i3) {
        super(1);
        this.f14879a = i3;
        this.f14880b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapboxMap mapboxMap;
        MapboxMap mapboxMap2;
        e eVar;
        Y6.a aVar;
        e eVar2;
        String string2 = StubApp.getString2(696);
        String string22 = StubApp.getString2(18587);
        String string23 = StubApp.getString2(390);
        String string24 = StubApp.getString2(18588);
        String string25 = StubApp.getString2(103);
        String string26 = StubApp.getString2(18589);
        String string27 = StubApp.getString2(18590);
        String string28 = StubApp.getString2(18591);
        String string29 = StubApp.getString2(689);
        String string210 = StubApp.getString2(685);
        String string211 = StubApp.getString2(18592);
        String string212 = StubApp.getString2(345);
        o oVar = this.f14880b;
        switch (this.f14879a) {
            case 0:
                MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) obj;
                Intrinsics.checkNotNullParameter(mapboxStyleManager, string212);
                oVar.j = mapboxStyleManager;
                return Unit.INSTANCE;
            case 1:
                InteractionContext context = (InteractionContext) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                ScreenCoordinate screenCoordinate = context.getScreenCoordinate();
                Intrinsics.checkNotNullExpressionValue(screenCoordinate, "context.screenCoordinate");
                oVar.getClass();
                Intrinsics.checkNotNullParameter(screenCoordinate, string27);
                CopyOnWriteArraySet copyOnWriteArraySet = oVar.f14918r;
                if (!copyOnWriteArraySet.isEmpty()) {
                    MapboxMap mapboxMap3 = oVar.f14909m;
                    if (mapboxMap3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string29);
                        mapboxMap = null;
                    } else {
                        mapboxMap = mapboxMap3;
                    }
                    Point coordinateForPixel = mapboxMap.coordinateForPixel(screenCoordinate);
                    Iterator it = copyOnWriteArraySet.iterator();
                    if (it.hasNext()) {
                        C0490F c0490f = (C0490F) it.next();
                        c0490f.getClass();
                        Intrinsics.checkNotNullParameter(coordinateForPixel, string26);
                        C0498N c0498n = c0490f.f10516a;
                        c0498n.getClass();
                        String json = coordinateForPixel.toJson();
                        String string213 = StubApp.getString2(18596);
                        R2.c.b(string25, string213 + json);
                        X2.e eVar3 = new X2.e(coordinateForPixel.latitude(), coordinateForPixel.longitude());
                        F5.c cVar = c0498n.f10571d;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(eVar3, string24);
                        w wVar = (w) cVar.f2238b;
                        R2.c.e(string23, string213 + eVar3);
                        X2.p pVar = wVar.f8336g;
                        if (pVar != null) {
                            Intrinsics.checkNotNullParameter(eVar3, string22);
                            q qVar = wVar.f8345s;
                            Intrinsics.checkNotNullParameter(qVar, string2);
                            String str = StubApp.getString2(18597) + "";
                            new BasicMessageChannel(pVar.f8316a, str, (MessageCodec) X2.p.f8315b.getValue()).send(CollectionsKt.listOf(eVar3), new X2.o(qVar, str, 2));
                        }
                    }
                }
                return Boolean.TRUE;
            case 2:
                InteractionContext interactionContext = (InteractionContext) obj;
                Intrinsics.checkNotNullParameter(interactionContext, string212);
                ScreenCoordinate screenCoordinate2 = interactionContext.getScreenCoordinate();
                Intrinsics.checkNotNullExpressionValue(screenCoordinate2, string28);
                oVar.getClass();
                Intrinsics.checkNotNullParameter(screenCoordinate2, string27);
                CopyOnWriteArraySet copyOnWriteArraySet2 = oVar.f14920s;
                if (!copyOnWriteArraySet2.isEmpty()) {
                    MapboxMap mapboxMap4 = oVar.f14909m;
                    if (mapboxMap4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string29);
                        mapboxMap2 = null;
                    } else {
                        mapboxMap2 = mapboxMap4;
                    }
                    Point coordinateForPixel2 = mapboxMap2.coordinateForPixel(screenCoordinate2);
                    Iterator it2 = copyOnWriteArraySet2.iterator();
                    if (it2.hasNext()) {
                        C0491G c0491g = (C0491G) it2.next();
                        c0491g.getClass();
                        Intrinsics.checkNotNullParameter(coordinateForPixel2, string26);
                        C0498N c0498n2 = c0491g.f10517a;
                        c0498n2.getClass();
                        R2.c.b(string25, StubApp.getString2(18593) + coordinateForPixel2.toJson());
                        X2.e eVar4 = new X2.e(coordinateForPixel2.latitude(), coordinateForPixel2.longitude());
                        F5.c cVar2 = c0498n2.f10571d;
                        cVar2.getClass();
                        Intrinsics.checkNotNullParameter(eVar4, string24);
                        w wVar2 = (w) cVar2.f2238b;
                        R2.c.e(string23, StubApp.getString2(18594) + eVar4);
                        X2.p pVar2 = wVar2.f8336g;
                        if (pVar2 != null) {
                            Intrinsics.checkNotNullParameter(eVar4, string22);
                            q qVar2 = wVar2.f8345s;
                            Intrinsics.checkNotNullParameter(qVar2, string2);
                            String str2 = StubApp.getString2(18595) + "";
                            new BasicMessageChannel(pVar2.f8316a, str2, (MessageCodec) X2.p.f8315b.getValue()).send(CollectionsKt.listOf(eVar4), new X2.o(qVar2, str2, 3));
                        }
                    }
                }
                return Boolean.TRUE;
            case 3:
                Intrinsics.checkNotNullParameter((InteractionContext) obj, string212);
                oVar.I();
                e eVar5 = oVar.f14903g;
                if (eVar5 != null) {
                    eVar = eVar5;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(string211);
                    eVar = null;
                }
                if (eVar.f14861a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string210);
                }
                Iterator it3 = oVar.f14922v.iterator();
                if (it3.hasNext()) {
                    throw com.mapbox.common.b.e(it3);
                }
                return Boolean.TRUE;
            case 4:
                InteractionContext interactionContext2 = (InteractionContext) obj;
                Intrinsics.checkNotNullParameter(interactionContext2, string212);
                ScreenCoordinate targetScreenCoordinate = interactionContext2.getScreenCoordinate();
                Intrinsics.checkNotNullExpressionValue(targetScreenCoordinate, string28);
                oVar.getClass();
                Intrinsics.checkNotNullParameter(targetScreenCoordinate, "targetScreenCoordinate");
                e eVar6 = oVar.f14903g;
                if (eVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string211);
                    eVar6 = null;
                }
                B6.d dVar = eVar6.f14861a;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string210);
                    dVar = null;
                }
                Iterator it4 = oVar.f14922v.iterator();
                if (it4.hasNext()) {
                    throw com.mapbox.common.b.e(it4);
                }
                PointF pointF = dVar.f701n;
                double d8 = pointF.x;
                double d10 = pointF.y;
                CoreGesturesHandler coreGesturesHandler = oVar.f14913o0;
                if (coreGesturesHandler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("coreGesturesHandler");
                    coreGesturesHandler = null;
                }
                coreGesturesHandler.notifyCoreGestureStarted();
                MapboxMap mapboxMap5 = oVar.f14909m;
                if (mapboxMap5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string29);
                    mapboxMap5 = null;
                }
                CameraOptions cameraForDrag = mapboxMap5.cameraForDrag(new ScreenCoordinate(d8, d10), targetScreenCoordinate);
                Y6.a aVar2 = oVar.f14914p;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsPlugin");
                    aVar = null;
                } else {
                    aVar = aVar2;
                }
                t tVar = o.f14881s0;
                ((Y6.j) aVar).e(cameraForDrag, o.f14881s0, null);
                return Unit.INSTANCE;
            default:
                Intrinsics.checkNotNullParameter((InteractionContext) obj, string212);
                e eVar7 = oVar.f14903g;
                if (eVar7 != null) {
                    eVar2 = eVar7;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(string211);
                    eVar2 = null;
                }
                if (eVar2.f14861a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string210);
                }
                Iterator it5 = oVar.f14922v.iterator();
                if (it5.hasNext()) {
                    throw com.mapbox.common.b.e(it5);
                }
                return Unit.INSTANCE;
        }
    }
}
