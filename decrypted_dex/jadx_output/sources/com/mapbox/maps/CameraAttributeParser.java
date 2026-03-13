package com.mapbox.maps;

import android.content.res.TypedArray;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/CameraAttributeParser;", "", "()V", "cameraOptionsBuilder", "Lcom/mapbox/maps/CameraOptions$Builder;", "parseCameraOptions", "Lcom/mapbox/maps/CameraOptions;", "attrs", "Landroid/content/res/TypedArray;", "pixelRatio", "", "getCameraFloatAttribute", "", "", "typedArray", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CameraAttributeParser {
    public static final CameraAttributeParser INSTANCE = new CameraAttributeParser();
    private static CameraOptions.Builder cameraOptionsBuilder;

    private CameraAttributeParser() {
    }

    private final double getCameraFloatAttribute(int i3, TypedArray typedArray) {
        double d8 = typedArray.getFloat(i3, 0.0f);
        if (cameraOptionsBuilder != null || d8 == 0.0d) {
            return d8;
        }
        cameraOptionsBuilder = new CameraOptions.Builder();
        return d8;
    }

    public static /* synthetic */ CameraOptions parseCameraOptions$default(CameraAttributeParser cameraAttributeParser, TypedArray typedArray, float f10, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            f10 = 1.0f;
        }
        return cameraAttributeParser.parseCameraOptions(typedArray, f10);
    }

    public final CameraOptions parseCameraOptions(TypedArray attrs, float pixelRatio) {
        CameraOptions.Builder builder;
        CameraOptions.Builder builder2;
        CameraOptions.Builder builder3;
        CameraOptions.Builder builder4;
        CameraOptions.Builder builder5;
        CameraOptions.Builder builder6;
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        cameraOptionsBuilder = null;
        CameraAttributeParser cameraAttributeParser = INSTANCE;
        double cameraFloatAttribute = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraZoom, attrs);
        if (cameraFloatAttribute != 0.0d && (builder6 = cameraOptionsBuilder) != null) {
            builder6.zoom(Double.valueOf(cameraFloatAttribute));
        }
        double cameraFloatAttribute2 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraTargetLng, attrs);
        double cameraFloatAttribute3 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraTargetLat, attrs);
        if ((cameraFloatAttribute3 != 0.0d || cameraFloatAttribute2 != 0.0d) && (builder = cameraOptionsBuilder) != null) {
            builder.center(Point.fromLngLat(cameraFloatAttribute2, cameraFloatAttribute3));
        }
        double cameraFloatAttribute4 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraBearing, attrs);
        if (cameraFloatAttribute4 != 0.0d && (builder5 = cameraOptionsBuilder) != null) {
            builder5.bearing(Double.valueOf(cameraFloatAttribute4));
        }
        double cameraFloatAttribute5 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraPitch, attrs);
        if (cameraFloatAttribute5 != 0.0d && (builder4 = cameraOptionsBuilder) != null) {
            builder4.pitch(Double.valueOf(cameraFloatAttribute5));
        }
        double cameraFloatAttribute6 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraAnchorX, attrs);
        double cameraFloatAttribute7 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraAnchorY, attrs);
        if ((cameraFloatAttribute6 != 0.0d || cameraFloatAttribute7 != 0.0d) && (builder2 = cameraOptionsBuilder) != null) {
            builder2.anchor(new ScreenCoordinate(cameraFloatAttribute6, cameraFloatAttribute7));
        }
        double cameraFloatAttribute8 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraPaddingTop, attrs);
        double cameraFloatAttribute9 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraPaddingLeft, attrs);
        double cameraFloatAttribute10 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraPaddingBottom, attrs);
        double cameraFloatAttribute11 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraPaddingRight, attrs);
        if ((cameraFloatAttribute8 != 0.0d || cameraFloatAttribute9 != 0.0d || cameraFloatAttribute10 != 0.0d || cameraFloatAttribute11 != 0.0d) && (builder3 = cameraOptionsBuilder) != null) {
            builder3.padding(new EdgeInsets(cameraFloatAttribute8, cameraFloatAttribute9, cameraFloatAttribute10, cameraFloatAttribute11));
        }
        CameraOptions.Builder builder7 = cameraOptionsBuilder;
        if (builder7 != null) {
            return builder7.build();
        }
        return null;
    }
}
