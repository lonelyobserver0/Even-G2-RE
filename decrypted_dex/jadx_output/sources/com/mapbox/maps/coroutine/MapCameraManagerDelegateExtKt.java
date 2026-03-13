package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ScreenCoordinate;
import g7.InterfaceC0962a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\f\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lg7/a;", "", "Lcom/mapbox/geojson/Point;", "coordinates", "Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/EdgeInsets;", "coordinatesPadding", "", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", "offset", "awaitCameraForCoordinates", "(Lg7/a;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapCameraManagerDelegateExtKt {
    public static final /* synthetic */ Object awaitCameraForCoordinates(InterfaceC0962a interfaceC0962a, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d8, ScreenCoordinate screenCoordinate, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        interfaceC0962a.cameraForCoordinates(list, cameraOptions, edgeInsets, d8, screenCoordinate, new MapCameraManagerDelegateExtKt$awaitCameraForCoordinates$2$1(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static /* synthetic */ Object awaitCameraForCoordinates$default(InterfaceC0962a interfaceC0962a, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d8, ScreenCoordinate screenCoordinate, Continuation continuation, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            edgeInsets = null;
        }
        if ((i3 & 8) != 0) {
            d8 = null;
        }
        if ((i3 & 16) != 0) {
            screenCoordinate = null;
        }
        return awaitCameraForCoordinates(interfaceC0962a, list, cameraOptions, edgeInsets, d8, screenCoordinate, continuation);
    }
}
