package A8;

import Cb.l;
import E9.r;
import L7.i;
import Nb.k;
import R8.B;
import Sb.e;
import T.Q;
import T.S;
import V.h;
import X6.t;
import Zb.j;
import a0.C0379a;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.stub.StubApp;
import j7.C1093a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import l4.E0;
import q8.AbstractC1526a;
import t8.C1739a;
import w9.g;
import y7.InterfaceC1975a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i3) {
        super(1);
        this.f218a = i3;
        this.f219b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonArray asJsonArray;
        MeasurementManager measurementManager;
        List<Integer> congestionNumeric;
        String string2;
        ScreenCoordinate screenCoordinate = null;
        String string22 = StubApp.getString2(345);
        Object obj2 = this.f219b;
        switch (this.f218a) {
            case 0:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, string22);
                ((b) obj2).getClass();
                return b.c(pair);
            case 1:
                MediaPlayer mediaPlayer = (MediaPlayer) obj;
                Intrinsics.checkNotNullParameter(mediaPlayer, "$this$null");
                mediaPlayer.setAudioAttributes(((r) obj2).a(F9.a.f2331a));
                return Unit.INSTANCE;
            case 2:
                LegAnnotation annotation = (LegAnnotation) obj;
                Intrinsics.checkNotNullParameter(annotation, "annotation");
                JsonElement unrecognizedProperty = annotation.getUnrecognizedProperty((String) obj2);
                if (unrecognizedProperty == null || (asJsonArray = unrecognizedProperty.getAsJsonArray()) == null) {
                    return null;
                }
                return CollectionsKt.toList(asJsonArray);
            case 3:
                return AbstractC1526a.a((List) obj, (ArrayList) obj2);
            case 4:
                Intrinsics.checkNotNullParameter((Context) obj, string22);
                Context context = (Context) obj2;
                Intrinsics.checkNotNullParameter(context, StubApp.getString2(354));
                measurementManager = MeasurementManager.get(context);
                Intrinsics.checkNotNullExpressionValue(measurementManager, "get(context)");
                return new G1.b(measurementManager);
            case 5:
                Throwable th = (Throwable) obj;
                E0 e02 = (E0) obj2;
                l lVar = (l) e02.f16038c;
                Mb.a aVar = (Mb.a) e02.f16037b;
                if (th == null) {
                    aVar.h(lVar);
                } else if (th instanceof CancellationException) {
                    aVar.h(lVar);
                } else if (th instanceof Db.c) {
                    aVar.i(lVar, (Db.c) th);
                } else {
                    aVar.i(lVar, new Db.c(th));
                }
                return Unit.INSTANCE;
            case 6:
                k result = (k) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                ((e) obj2).j(result);
                return Unit.INSTANCE;
            case 7:
                B b2 = (B) obj2;
                b2.f6254d = null;
                b2.f6255e = null;
                return Unit.INSTANCE;
            case 8:
                Throwable th2 = (Throwable) obj;
                Q q10 = (Q) obj2;
                if (th2 != null) {
                    q10.f6805h.K(new S(th2));
                }
                if (q10.j.isInitialized()) {
                    ((h) q10.j.getValue()).close();
                }
                return Unit.INSTANCE;
            case 9:
                ((j) obj2).c();
                return Unit.INSTANCE;
            case 10:
                Throwable th3 = (Throwable) obj;
                i2.j jVar = (i2.j) obj2;
                if (th3 == null) {
                    if (!jVar.f14742a.isDone()) {
                        throw new IllegalArgumentException(StubApp.getString2(353));
                    }
                } else if (th3 instanceof CancellationException) {
                    jVar.f14742a.cancel(true);
                } else {
                    t2.j jVar2 = jVar.f14742a;
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        th3 = cause;
                    }
                    jVar2.k(th3);
                }
                return Unit.INSTANCE;
            case 11:
                C1093a GesturesSettings = (C1093a) obj;
                Intrinsics.checkNotNullParameter(GesturesSettings, "$this$GesturesSettings");
                TypedArray typedArray = (TypedArray) obj2;
                GesturesSettings.f15342a = typedArray.getBoolean(43, true);
                GesturesSettings.f15343b = typedArray.getBoolean(39, true);
                GesturesSettings.f15344c = typedArray.getBoolean(45, true);
                GesturesSettings.f15345d = typedArray.getBoolean(47, true);
                GesturesSettings.f15346e = typedArray.getBoolean(40, true);
                t tVar = t.values()[typedArray.getInt(46, 2)];
                Intrinsics.checkNotNullParameter(tVar, "<set-?>");
                GesturesSettings.f15347f = tVar;
                GesturesSettings.f15348g = typedArray.getBoolean(31, true);
                GesturesSettings.f15349h = typedArray.getBoolean(32, true);
                GesturesSettings.f15350i = typedArray.getBoolean(41, true);
                if (typedArray.hasValue(33) && typedArray.hasValue(34)) {
                    screenCoordinate = new ScreenCoordinate(typedArray.getFloat(33, 0.0f), typedArray.getFloat(34, 0.0f));
                }
                GesturesSettings.j = screenCoordinate;
                GesturesSettings.f15351k = typedArray.getBoolean(38, true);
                GesturesSettings.f15352l = typedArray.getBoolean(42, true);
                GesturesSettings.f15353m = typedArray.getBoolean(44, true);
                GesturesSettings.f15354n = typedArray.getBoolean(36, true);
                GesturesSettings.f15355o = typedArray.getBoolean(35, true);
                GesturesSettings.f15356p = typedArray.getFloat(48, 1.0f);
                GesturesSettings.f15357q = typedArray.getBoolean(37, true);
                return Unit.INSTANCE;
            case 12:
                Intrinsics.checkNotNullParameter((C6.b) obj, string22);
                m8.r rVar = (m8.r) obj2;
                i navigationOptions = rVar.f17221a;
                y7.b distanceFormatterOptions = navigationOptions.f4278b;
                Intrinsics.checkNotNullParameter(navigationOptions, "navigationOptions");
                String string23 = StubApp.getString2(352);
                I7.b bVar = rVar.f17235p;
                Intrinsics.checkNotNullParameter(bVar, string23);
                Intrinsics.checkNotNullParameter(distanceFormatterOptions, "distanceFormatterOptions");
                G8.b moduleParams = new G8.b();
                Intrinsics.checkNotNullParameter(moduleParams, "moduleParams");
                return new ModuleProviderArgument[]{new ModuleProviderArgument(i.class, navigationOptions), new ModuleProviderArgument(I7.b.class, bVar), new ModuleProviderArgument(InterfaceC1975a.class, new C0379a(distanceFormatterOptions))};
            case 13:
                List getNonServerAddedWaypointsOnRoute = (List) obj;
                Intrinsics.checkNotNullParameter(getNonServerAddedWaypointsOnRoute, "$this$getNonServerAddedWaypointsOnRoute");
                return Integer.valueOf(RangesKt.coerceAtLeast(getNonServerAddedWaypointsOnRoute.size() - ((P7.b) obj2).f5572l, 1));
            case 14:
                RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
                Intrinsics.checkNotNullParameter(routeLineViewOptionsData, string22);
                return (StylePropertyValue) ((r9.l) obj2).invoke(routeLineViewOptionsData);
            case 15:
                RouteLeg routeLeg = (RouteLeg) obj;
                Intrinsics.checkNotNullParameter(routeLeg, "routeLeg");
                LegAnnotation annotation2 = routeLeg.annotation();
                if (annotation2 == null || (congestionNumeric = annotation2.congestionNumeric()) == null) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.f(congestionNumeric));
                for (Integer num : congestionNumeric) {
                    r9.r rVar2 = r9.r.f20461a;
                    MapboxRouteLineApiOptions mapboxRouteLineApiOptions = (MapboxRouteLineApiOptions) obj2;
                    Intrinsics.checkNotNullParameter(mapboxRouteLineApiOptions, StubApp.getString2(346));
                    IntRange lowCongestionRange = mapboxRouteLineApiOptions.getLowCongestionRange();
                    if (num == null || !lowCongestionRange.contains(num.intValue())) {
                        IntRange heavyCongestionRange = mapboxRouteLineApiOptions.getHeavyCongestionRange();
                        if (num == null || !heavyCongestionRange.contains(num.intValue())) {
                            string2 = (num == null || !mapboxRouteLineApiOptions.getSevereCongestionRange().contains(num.intValue())) ? (num == null || !mapboxRouteLineApiOptions.getModerateCongestionRange().contains(num.intValue())) ? StubApp.getString2(351) : StubApp.getString2(350) : StubApp.getString2(349);
                        } else {
                            string2 = StubApp.getString2(348);
                        }
                    } else {
                        string2 = StubApp.getString2(347);
                    }
                    arrayList.add(string2);
                }
                return arrayList;
            default:
                ((g) obj2).e((C1739a) obj);
                return Unit.INSTANCE;
        }
    }
}
