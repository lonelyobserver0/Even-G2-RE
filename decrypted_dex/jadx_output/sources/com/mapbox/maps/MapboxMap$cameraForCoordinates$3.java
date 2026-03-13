package com.mapbox.maps;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxMap$cameraForCoordinates$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CameraOptions $camera;
    final /* synthetic */ List<Point> $coordinates;
    final /* synthetic */ EdgeInsets $coordinatesPadding;
    final /* synthetic */ Double $maxZoom;
    final /* synthetic */ ScreenCoordinate $offset;
    final /* synthetic */ Function1<CameraOptions, Unit> $result;
    final /* synthetic */ MapboxMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapboxMap$cameraForCoordinates$3(Function1<? super CameraOptions, Unit> function1, MapboxMap mapboxMap, List<Point> list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d8, ScreenCoordinate screenCoordinate) {
        super(0);
        this.$result = function1;
        this.this$0 = mapboxMap;
        this.$coordinates = list;
        this.$camera = cameraOptions;
        this.$coordinatesPadding = edgeInsets;
        this.$maxZoom = d8;
        this.$offset = screenCoordinate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraOptions invoke$lambda$1(List coordinates, CameraOptions camera, EdgeInsets edgeInsets, Double d8, ScreenCoordinate screenCoordinate, MapboxMap this$0, String it) {
        NativeMapImpl nativeMapImpl;
        Intrinsics.checkNotNullParameter(coordinates, "$coordinates");
        Intrinsics.checkNotNullParameter(camera, "$camera");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(13994));
        sb2.append(coordinates);
        sb2.append(StubApp.getString2(13995));
        sb2.append(camera);
        sb2.append(StubApp.getString2(13996));
        sb2.append(edgeInsets);
        sb2.append(StubApp.getString2(13997));
        sb2.append(d8);
        sb2.append(StubApp.getString2(13998));
        sb2.append(screenCoordinate);
        sb2.append(StubApp.getString2(13999));
        nativeMapImpl = this$0.nativeMap;
        sb2.append(nativeMapImpl.getSize());
        sb2.append(StubApp.getString2(3055));
        sb2.append(it);
        sb2.append(StubApp.getString2(14000));
        MapboxLogger.logE(StubApp.getString2(14001), sb2.toString());
        CameraOptions build = new CameraOptions.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
        return build;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NativeMapImpl nativeMapImpl;
        Function1<CameraOptions, Unit> function1 = this.$result;
        nativeMapImpl = this.this$0.nativeMap;
        CameraOptions valueOrElse = nativeMapImpl.cameraForCoordinates(MapboxMap.INSTANCE.calculateBoundingBox(this.$coordinates), this.$camera, this.$coordinatesPadding, this.$maxZoom, this.$offset).getValueOrElse(new i(this.$coordinates, this.$camera, this.$coordinatesPadding, this.$maxZoom, this.$offset, this.this$0, 0));
        Intrinsics.checkNotNullExpressionValue(valueOrElse, "nativeMap.cameraForCoord…meraOptions { }\n        }");
        function1.invoke(valueOrElse);
    }
}
