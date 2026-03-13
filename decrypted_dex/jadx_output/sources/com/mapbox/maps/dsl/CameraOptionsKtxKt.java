package com.mapbox.maps.dsl;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"cameraOptions", "Lcom/mapbox/maps/CameraOptions;", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/CameraOptions$Builder;", "", "Lkotlin/ExtensionFunctionType;", "cameraState", "Lcom/mapbox/maps/CameraState;", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CameraOptionsKtxKt {
    public static final CameraOptions cameraOptions(Function1<? super CameraOptions.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        CameraOptions.Builder builder = new CameraOptions.Builder();
        block.invoke(builder);
        CameraOptions build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
        return build;
    }

    public static final CameraOptions cameraOptions(CameraState cameraState, Function1<? super CameraOptions.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(cameraState, "cameraState");
        Intrinsics.checkNotNullParameter(block, "block");
        CameraOptions.Builder pitch = new CameraOptions.Builder().padding(cameraState.getPadding()).center(cameraState.getCenter()).bearing(Double.valueOf(cameraState.getBearing())).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch()));
        block.invoke(pitch);
        CameraOptions cameraOptions = pitch.build();
        Intrinsics.checkNotNullExpressionValue(cameraOptions, "cameraOptions");
        return cameraOptions;
    }
}
