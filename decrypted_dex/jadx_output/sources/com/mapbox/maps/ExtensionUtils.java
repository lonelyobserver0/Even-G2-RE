package com.mapbox.maps;

import android.graphics.Bitmap;
import com.mapbox.bindgen.DataRef;
import com.mapbox.maps.CameraOptions;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"toCameraOptions", "Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/CameraState;", "anchor", "Lcom/mapbox/maps/ScreenCoordinate;", "toMapboxImage", "Lcom/mapbox/maps/Image;", "Landroid/graphics/Bitmap;", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "ExtensionUtils")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ExtensionUtils {
    @JvmOverloads
    public static final CameraOptions toCameraOptions(CameraState cameraState) {
        Intrinsics.checkNotNullParameter(cameraState, "<this>");
        return toCameraOptions$default(cameraState, null, 1, null);
    }

    public static /* synthetic */ CameraOptions toCameraOptions$default(CameraState cameraState, ScreenCoordinate screenCoordinate, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            screenCoordinate = null;
        }
        return toCameraOptions(cameraState, screenCoordinate);
    }

    @MapboxDelicateApi
    public static final Image toMapboxImage(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException(StubApp.getString2(13909));
        }
        DataRef allocateNative = DataRef.allocateNative(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocateNative.getBuffer());
        return new Image(bitmap.getWidth(), bitmap.getHeight(), allocateNative);
    }

    @JvmOverloads
    public static final CameraOptions toCameraOptions(CameraState cameraState, ScreenCoordinate screenCoordinate) {
        Intrinsics.checkNotNullParameter(cameraState, "<this>");
        if (screenCoordinate != null) {
            CameraOptions build = new CameraOptions.Builder().anchor(screenCoordinate).padding(cameraState.getPadding()).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch())).bearing(Double.valueOf(cameraState.getBearing())).build();
            Intrinsics.checkNotNullExpressionValue(build, "{\n    CameraOptions.Buil…aring)\n      .build()\n  }");
            return build;
        }
        CameraOptions toCameraOptions = new CameraOptions.Builder().center(cameraState.getCenter()).padding(cameraState.getPadding()).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch())).bearing(Double.valueOf(cameraState.getBearing())).build();
        Intrinsics.checkNotNullExpressionValue(toCameraOptions, "toCameraOptions");
        return toCameraOptions;
    }
}
