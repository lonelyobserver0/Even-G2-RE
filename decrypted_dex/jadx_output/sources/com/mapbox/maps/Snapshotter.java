package com.mapbox.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxOptions;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.attribution.AttributionLayout;
import com.mapbox.maps.attribution.AttributionMeasure;
import com.mapbox.maps.attribution.AttributionParser;
import com.mapbox.maps.module.MapTelemetry;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 t2\u00020\u0001:\u0002tuB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB-\b\u0012\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J \u0010#\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 H\u0002J7\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020\u001eJ\u000e\u00102\u001a\u0002032\u0006\u0010\u0004\u001a\u00020'J\u0018\u00104\u001a\u0002052\u0006\u0010!\u001a\u00020\"2\u0006\u00106\u001a\u000207H\u0002J\u0018\u00108\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0002J(\u0010:\u001a\u00020;2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u00106\u001a\u0002072\u0006\u0010<\u001a\u00020\u0013H\u0002J\u0006\u0010=\u001a\u00020\u001eJ\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J \u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0002J \u0010?\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010B\u001a\u00020C2\u0006\u0010F\u001a\u00020GH\u0002J(\u0010H\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020 2\u0006\u0010@\u001a\u00020A2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020GH\u0002J \u0010L\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010I\u001a\u00020JH\u0002J(\u0010M\u001a\u00020C2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010I\u001a\u00020JH\u0002J\u0006\u0010N\u001a\u00020OJ\u0006\u0010P\u001a\u00020QJ\u0006\u0010R\u001a\u000205J\u0006\u0010S\u001a\u000205J\b\u0010T\u001a\u00020\u000bH\u0002J\u000e\u0010U\u001a\u00020\u001e2\u0006\u0010V\u001a\u00020'J\u000e\u0010W\u001a\u00020\u001e2\u0006\u0010X\u001a\u00020QJ\u000e\u0010Y\u001a\u00020\u001e2\u0006\u0010Z\u001a\u000205J\u000e\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020\u0016J\u000e\u0010]\u001a\u00020\u001e2\u0006\u0010^\u001a\u000205J\u001a\u0010_\u001a\u00020\u001e2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010b\u001a\u00020cJ\u0010\u0010d\u001a\u00020\u000f2\u0006\u0010e\u001a\u00020fH\u0002J\u0010\u0010g\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020iH\u0002J\u0010\u0010j\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020lH\u0002J\u0010\u0010m\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020oH\u0002J \u0010p\u001a\b\u0012\u0004\u0012\u00020q0\u000e2\u0006\u0010r\u001a\u00020s2\b\u0010V\u001a\u0004\u0018\u00010'H\u0007R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Lcom/mapbox/maps/Snapshotter;", "", "context", "Landroid/content/Context;", "options", "Lcom/mapbox/maps/MapSnapshotOptions;", "overlayOptions", "Lcom/mapbox/maps/SnapshotOverlayOptions;", "(Landroid/content/Context;Lcom/mapbox/maps/MapSnapshotOptions;Lcom/mapbox/maps/SnapshotOverlayOptions;)V", "Ljava/lang/ref/WeakReference;", "coreSnapshotter", "Lcom/mapbox/maps/MapSnapshotter;", "(Ljava/lang/ref/WeakReference;Lcom/mapbox/maps/MapSnapshotOptions;Lcom/mapbox/maps/SnapshotOverlayOptions;Lcom/mapbox/maps/MapSnapshotter;)V", "cancelableEvents", "", "Lcom/mapbox/common/Cancelable;", "loadingErrorCancelable", "mapSnapshotOptions", "pixelRatio", "", "snapshotOverlayOptions", "<set-?>", "Lcom/mapbox/maps/SnapshotStyleListener;", "snapshotStyleCallback", "getSnapshotStyleCallback$maps_sdk_release", "()Lcom/mapbox/maps/SnapshotStyleListener;", "setSnapshotStyleCallback$maps_sdk_release", "(Lcom/mapbox/maps/SnapshotStyleListener;)V", "styleLoadedCancelable", "addOverlay", "", "snapshotBitmap", "Landroid/graphics/Bitmap;", "overlay", "Lcom/mapbox/maps/SnapshotOverlay;", "calculateLogoScale", "snapshot", "logo", "cameraForCoordinates", "Lcom/mapbox/maps/CameraOptions;", "coordinates", "", "Lcom/mapbox/geojson/Point;", "padding", "Lcom/mapbox/maps/EdgeInsets;", "bearing", "", "pitch", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "cancel", "coordinateBoundsForCamera", "Lcom/mapbox/maps/CoordinateBounds;", "createAttributionString", "", "shortText", "", "createScaledLogo", "Lcom/mapbox/maps/Snapshotter$Logo;", "createTextView", "Landroid/widget/TextView;", "scale", "destroy", "dispatchTelemetryTurnstileEvent", "drawAttribution", "canvas", "Landroid/graphics/Canvas;", "measure", "Lcom/mapbox/maps/attribution/AttributionMeasure;", "anchorPoint", "Landroid/graphics/PointF;", "layout", "Lcom/mapbox/maps/attribution/AttributionLayout;", "drawLogo", "margin", "", "placement", "drawOverlay", "getAttributionMeasure", "getCameraState", "Lcom/mapbox/maps/CameraState;", "getSize", "Lcom/mapbox/maps/Size;", "getStyleJson", "getStyleUri", "requireCoreSnapshotter", "setCamera", "cameraOptions", "setSize", "size", "setStyleJson", "styleJson", "setStyleListener", "listener", "setStyleUri", "styleUri", "start", "overlayCallback", "Lcom/mapbox/maps/SnapshotOverlayCallback;", "resultCallback", "Lcom/mapbox/maps/SnapshotResultCallback;", "subscribeMapLoadingError", "mapLoadingErrorCallback", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "subscribeStyleDataLoaded", "styleDataLoadedCallback", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "subscribeStyleImageMissing", "styleImageMissingCallback", "Lcom/mapbox/maps/StyleImageMissingCallback;", "subscribeStyleLoaded", "styleLoadedCallback", "Lcom/mapbox/maps/StyleLoadedCallback;", "tileCover", "Lcom/mapbox/maps/CanonicalTileID;", "tileCoverOptions", "Lcom/mapbox/maps/TileCoverOptions;", "Companion", "Logo", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Snapshotter {
    private List<Cancelable> cancelableEvents;
    private final WeakReference<Context> context;
    private MapSnapshotter coreSnapshotter;
    private Cancelable loadingErrorCancelable;
    private final MapSnapshotOptions mapSnapshotOptions;
    private final float pixelRatio;
    private final SnapshotOverlayOptions snapshotOverlayOptions;
    private SnapshotStyleListener snapshotStyleCallback;
    private Cancelable styleLoadedCancelable;
    private static final String TAG = StubApp.getString2(14186);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J4\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0081\u0002¢\u0006\u0002\b\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/Snapshotter$Companion;", "", "()V", "TAG", "", "clearData", "", "callback", "Lcom/mapbox/maps/AsyncOperationResultCallback;", "invoke", "Lcom/mapbox/maps/Snapshotter;", "context", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "options", "Lcom/mapbox/maps/MapSnapshotOptions;", "overlayOptions", "Lcom/mapbox/maps/SnapshotOverlayOptions;", "coreSnapshotter", "Lcom/mapbox/maps/MapSnapshotter;", "invoke$maps_sdk_release", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void clearData(AsyncOperationResultCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            MapsResourceOptions.clearData(callback);
        }

        public final /* synthetic */ Snapshotter invoke$maps_sdk_release(WeakReference context, MapSnapshotOptions options, SnapshotOverlayOptions overlayOptions, MapSnapshotter coreSnapshotter) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(overlayOptions, "overlayOptions");
            Intrinsics.checkNotNullParameter(coreSnapshotter, "coreSnapshotter");
            return new Snapshotter(context, options, overlayOptions, coreSnapshotter, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/Snapshotter$Logo;", "", "large", "Landroid/graphics/Bitmap;", "small", "scale", "", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;F)V", "getLarge", "()Landroid/graphics/Bitmap;", "getScale", "()F", "getSmall", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Logo {
        private final Bitmap large;
        private final float scale;
        private final Bitmap small;

        public Logo(Bitmap large, Bitmap small, float f10) {
            Intrinsics.checkNotNullParameter(large, "large");
            Intrinsics.checkNotNullParameter(small, "small");
            this.large = large;
            this.small = small;
            this.scale = f10;
        }

        public static /* synthetic */ Logo copy$default(Logo logo, Bitmap bitmap, Bitmap bitmap2, float f10, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                bitmap = logo.large;
            }
            if ((i3 & 2) != 0) {
                bitmap2 = logo.small;
            }
            if ((i3 & 4) != 0) {
                f10 = logo.scale;
            }
            return logo.copy(bitmap, bitmap2, f10);
        }

        /* renamed from: component1, reason: from getter */
        public final Bitmap getLarge() {
            return this.large;
        }

        /* renamed from: component2, reason: from getter */
        public final Bitmap getSmall() {
            return this.small;
        }

        /* renamed from: component3, reason: from getter */
        public final float getScale() {
            return this.scale;
        }

        public final Logo copy(Bitmap large, Bitmap small, float scale) {
            Intrinsics.checkNotNullParameter(large, "large");
            Intrinsics.checkNotNullParameter(small, "small");
            return new Logo(large, small, scale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) other;
            return Intrinsics.areEqual(this.large, logo.large) && Intrinsics.areEqual(this.small, logo.small) && Float.compare(this.scale, logo.scale) == 0;
        }

        public final Bitmap getLarge() {
            return this.large;
        }

        public final float getScale() {
            return this.scale;
        }

        public final Bitmap getSmall() {
            return this.small;
        }

        public int hashCode() {
            return Float.hashCode(this.scale) + ((this.small.hashCode() + (this.large.hashCode() * 31)) * 31);
        }

        public String toString() {
            return StubApp.getString2(14184) + this.large + StubApp.getString2(12724) + this.small + StubApp.getString2(14185) + this.scale + ')';
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Snapshotter(Context context, MapSnapshotOptions options) {
        this(context, options, (SnapshotOverlayOptions) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(WeakReference weakSelf, MapLoadingError it) {
        Intrinsics.checkNotNullParameter(weakSelf, "$weakSelf");
        Intrinsics.checkNotNullParameter(it, "it");
        Snapshotter snapshotter = (Snapshotter) weakSelf.get();
        if (snapshotter != null) {
            Cancelable cancelable = snapshotter.loadingErrorCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
            SnapshotStyleListener snapshotStyleListener = snapshotter.snapshotStyleCallback;
            if (snapshotStyleListener != null) {
                String message = it.getMessage();
                Intrinsics.checkNotNullExpressionValue(message, "it.message");
                snapshotStyleListener.onDidFailLoadingStyle(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$11(WeakReference weakSelf, StyleImageMissing it) {
        SnapshotStyleListener snapshotStyleListener;
        Intrinsics.checkNotNullParameter(weakSelf, "$weakSelf");
        Intrinsics.checkNotNullParameter(it, "it");
        Snapshotter snapshotter = (Snapshotter) weakSelf.get();
        if (snapshotter == null || (snapshotStyleListener = snapshotter.snapshotStyleCallback) == null) {
            return;
        }
        String imageId = it.getImageId();
        Intrinsics.checkNotNullExpressionValue(imageId, "it.imageId");
        snapshotStyleListener.onStyleImageMissing(imageId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(WeakReference weakSelf, StyleDataLoaded it) {
        Snapshotter snapshotter;
        MapSnapshotter mapSnapshotter;
        SnapshotStyleListener snapshotStyleListener;
        Intrinsics.checkNotNullParameter(weakSelf, "$weakSelf");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getType() != StyleDataLoadedType.STYLE || (snapshotter = (Snapshotter) weakSelf.get()) == null || (mapSnapshotter = snapshotter.coreSnapshotter) == null || (snapshotStyleListener = snapshotter.snapshotStyleCallback) == null) {
            return;
        }
        snapshotStyleListener.onDidFinishLoadingStyle(new Style(mapSnapshotter, snapshotter.pixelRatio, new com.mapbox.common.module.cronet.a(21)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(WeakReference weakSelf, StyleLoaded it) {
        SnapshotStyleListener snapshotStyleListener;
        Intrinsics.checkNotNullParameter(weakSelf, "$weakSelf");
        Intrinsics.checkNotNullParameter(it, "it");
        Snapshotter snapshotter = (Snapshotter) weakSelf.get();
        if (snapshotter != null) {
            MapSnapshotter mapSnapshotter = snapshotter.coreSnapshotter;
            if (mapSnapshotter != null && (snapshotStyleListener = snapshotter.snapshotStyleCallback) != null) {
                snapshotStyleListener.onDidFullyLoadStyle(new Style(mapSnapshotter, snapshotter.pixelRatio, new com.mapbox.common.module.cronet.a(22)));
            }
            Cancelable cancelable = snapshotter.styleLoadedCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }
    }

    private final void addOverlay(Bitmap snapshotBitmap, SnapshotOverlay overlay) {
        Context context = this.context.get();
        if (context != null) {
            drawOverlay(snapshotBitmap, overlay, ((int) context.getResources().getDisplayMetrics().density) * 4);
        }
    }

    private final float calculateLogoScale(Context context, Bitmap snapshot, Bitmap logo) {
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "context.resources.displayMetrics");
        float min = Math.min((logo.getWidth() / (r3.widthPixels / snapshot.getWidth())) / logo.getWidth(), (logo.getHeight() / (r3.heightPixels / snapshot.getHeight())) / logo.getHeight()) * 2;
        if (min > 1.0f) {
            return 1.0f;
        }
        if (min < 0.6f) {
            return 0.6f;
        }
        return min;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraOptions cameraForCoordinates$lambda$20(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MapboxLogger.logE(StubApp.getString2(14186), StubApp.getString2(14187) + it + StubApp.getString2(14000));
        CameraOptions build = new CameraOptions.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
        return build;
    }

    @JvmStatic
    public static final void clearData(AsyncOperationResultCallback asyncOperationResultCallback) {
        INSTANCE.clearData(asyncOperationResultCallback);
    }

    private final String createAttributionString(SnapshotOverlay overlay, boolean shortText) {
        Context context = this.context.get();
        if (context == null) {
            return "";
        }
        AttributionParser.Options options = new AttributionParser.Options(context);
        Object[] array = overlay.getAttributions().toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        return options.withAttributionData((String[]) Arrays.copyOf(strArr, strArr.length)).withCopyrightSign(false).withImproveMap(false).withMapboxPrivacyPolicy(false).withTelemetryAttribution(false).withMapboxGeofencingConsent(false).build().createAttributionString(shortText);
    }

    private final Logo createScaledLogo(Context context, Bitmap snapshotBitmap) {
        Bitmap logo = BitmapFactory.decodeResource(context.getResources(), R.drawable.mapbox_logo_icon, null);
        Intrinsics.checkNotNullExpressionValue(logo, "logo");
        float calculateLogoScale = calculateLogoScale(context, snapshotBitmap, logo);
        Matrix matrix = new Matrix();
        matrix.postScale(calculateLogoScale, calculateLogoScale);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.mapbox_logo_helmet, null);
        Bitmap createBitmap = Bitmap.createBitmap(logo, 0, 0, logo.getWidth(), logo.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(logo, 0, 0,…ogo.height, matrix, true)");
        Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(helmet, 0, …met.height, matrix, true)");
        return new Logo(createBitmap, createBitmap2, calculateLogoScale);
    }

    private final TextView createTextView(Context context, SnapshotOverlay overlay, boolean shortText, float scale) {
        Resources resources = context.getResources();
        int i3 = R.color.mapbox_gray_dark;
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = E.l.f1716a;
        int color = resources.getColor(i3, theme);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        String createAttributionString = createAttributionString(overlay, shortText);
        if (createAttributionString.length() > 0) {
            textView.setSingleLine(true);
            textView.setTextSize(10 * scale);
            textView.setTextColor(color);
            textView.setBackgroundResource(R.drawable.mapbox_rounded_corner);
            textView.setText(Html.fromHtml(createAttributionString));
            textView.measure(makeMeasureSpec, makeMeasureSpec2);
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        }
        return textView;
    }

    private final void dispatchTelemetryTurnstileEvent(final Context context) {
        ((MapTelemetry) MapboxModuleProvider.INSTANCE.createModule(C6.b.f1127f, new Function1<C6.b, ModuleProviderArgument[]>() { // from class: com.mapbox.maps.Snapshotter$dispatchTelemetryTurnstileEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ModuleProviderArgument[] invoke(C6.b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new ModuleProviderArgument[]{new ModuleProviderArgument(Context.class, StubApp.getOrigApplicationContext(context.getApplicationContext()))};
            }
        })).onAppUserTurnstileEvent();
    }

    private final void drawAttribution(SnapshotOverlay overlay, AttributionMeasure measure, AttributionLayout layout) {
        PointF anchorPoint = layout.getAnchorPoint();
        if (anchorPoint != null) {
            drawAttribution(overlay.getCanvas(), measure, anchorPoint);
            return;
        }
        MapboxLogger.logE(StubApp.getString2(14186), StubApp.getString2(14188) + overlay.getCanvas().getWidth() + 'x' + overlay.getCanvas().getHeight() + StubApp.getString2(14189) + overlay.getAttributions());
    }

    private final void drawLogo(Bitmap snapshot, Canvas canvas, int margin, AttributionLayout placement) {
        Bitmap logo = placement.getLogo();
        if (logo != null) {
            canvas.drawBitmap(logo, margin, (snapshot.getHeight() - logo.getHeight()) - margin, (Paint) null);
        }
    }

    private final void drawOverlay(Bitmap snapshotBitmap, SnapshotOverlay overlay, int margin) {
        AttributionMeasure attributionMeasure;
        AttributionLayout measure;
        Context context = this.context.get();
        if (context == null || (measure = (attributionMeasure = getAttributionMeasure(context, overlay, snapshotBitmap, margin)).measure()) == null) {
            return;
        }
        if (this.snapshotOverlayOptions.getShowLogo()) {
            drawLogo(snapshotBitmap, overlay.getCanvas(), margin, measure);
        }
        if (this.snapshotOverlayOptions.getShowAttributes()) {
            drawAttribution(overlay, attributionMeasure, measure);
        }
    }

    private final AttributionMeasure getAttributionMeasure(Context context, SnapshotOverlay overlay, Bitmap snapshotBitmap, int margin) {
        Logo createScaledLogo = createScaledLogo(context, snapshotBitmap);
        return new AttributionMeasure(snapshotBitmap, createScaledLogo.getLarge(), createScaledLogo.getSmall(), createTextView(context, overlay, false, createScaledLogo.getScale()), createTextView(context, overlay, true, createScaledLogo.getScale()), margin);
    }

    private final MapSnapshotter requireCoreSnapshotter() {
        MapSnapshotter mapSnapshotter = this.coreSnapshotter;
        if (mapSnapshotter != null) {
            return mapSnapshotter;
        }
        throw new SnapshotterDestroyedException();
    }

    public static /* synthetic */ void start$default(Snapshotter snapshotter, SnapshotOverlayCallback snapshotOverlayCallback, SnapshotResultCallback snapshotResultCallback, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(StubApp.getString2(14190));
        }
        if ((i3 & 1) != 0) {
            snapshotOverlayCallback = null;
        }
        snapshotter.start(snapshotOverlayCallback, snapshotResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$17(Snapshotter this$0, SnapshotResultCallback resultCallback, SnapshotOverlayCallback snapshotOverlayCallback, Expected result) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(resultCallback, "$resultCallback");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!result.isValue()) {
            String str = (String) result.getError();
            if (str == null) {
                str = StubApp.getString2(14193);
            }
            resultCallback.onSnapshotResult(null, str);
            return;
        }
        final MapSnapshot mapSnapshot = (MapSnapshot) result.getValue();
        if (mapSnapshot != null) {
            Image moveImage = mapSnapshot.moveImage();
            if (moveImage != null) {
                Bitmap createBitmap = Bitmap.createBitmap(moveImage.getWidth(), moveImage.getHeight(), Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(moveImage.getData().getBuffer());
                Intrinsics.checkNotNullExpressionValue(createBitmap, "coreMapSnapshot.moveImag…   return@let\n          }");
                final Canvas canvas = new Canvas(createBitmap);
                SnapshotOverlay snapshotOverlay = new SnapshotOverlay(canvas, mapSnapshot) { // from class: com.mapbox.maps.Snapshotter$start$1$1$snapshotOverlay$1
                    final /* synthetic */ MapSnapshot $coreMapSnapshot;
                    private final List<String> attributions;
                    private final Canvas canvas;

                    {
                        this.$coreMapSnapshot = mapSnapshot;
                        this.canvas = canvas;
                        List<String> attributions = mapSnapshot.attributions();
                        Intrinsics.checkNotNullExpressionValue(attributions, "coreMapSnapshot.attributions()");
                        this.attributions = attributions;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public Point coordinate(ScreenCoordinate screenCoordinate) {
                        Intrinsics.checkNotNullParameter(screenCoordinate, "screenCoordinate");
                        Point coordinate = this.$coreMapSnapshot.coordinate(screenCoordinate);
                        Intrinsics.checkNotNullExpressionValue(coordinate, "coreMapSnapshot.coordinate(screenCoordinate)");
                        return coordinate;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public List<String> getAttributions() {
                        return this.attributions;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public Canvas getCanvas() {
                        return this.canvas;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public ScreenCoordinate screenCoordinate(Point coordinate) {
                        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
                        ScreenCoordinate screenCoordinate = this.$coreMapSnapshot.screenCoordinate(coordinate);
                        Intrinsics.checkNotNullExpressionValue(screenCoordinate, "coreMapSnapshot.screenCoordinate(coordinate)");
                        return screenCoordinate;
                    }
                };
                if (snapshotOverlayCallback != null) {
                    snapshotOverlayCallback.onSnapshotOverlay(snapshotOverlay);
                }
                this$0.addOverlay(createBitmap, snapshotOverlay);
                resultCallback.onSnapshotResult(createBitmap, null);
            } else {
                resultCallback.onSnapshotResult(null, StubApp.getString2(14191));
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            resultCallback.onSnapshotResult(null, StubApp.getString2(14192));
        }
    }

    private final Cancelable subscribeMapLoadingError(MapLoadingErrorCallback mapLoadingErrorCallback) {
        Cancelable subscribe = requireCoreSnapshotter().subscribe(mapLoadingErrorCallback);
        Intrinsics.checkNotNullExpressionValue(subscribe, "requireCoreSnapshotter()…(mapLoadingErrorCallback)");
        return subscribe;
    }

    private final Cancelable subscribeStyleDataLoaded(StyleDataLoadedCallback styleDataLoadedCallback) {
        Cancelable subscribe = requireCoreSnapshotter().subscribe(styleDataLoadedCallback);
        Intrinsics.checkNotNullExpressionValue(subscribe, "requireCoreSnapshotter()…(styleDataLoadedCallback)");
        return subscribe;
    }

    private final Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback) {
        Cancelable subscribe = requireCoreSnapshotter().subscribe(styleImageMissingCallback);
        Intrinsics.checkNotNullExpressionValue(subscribe, "requireCoreSnapshotter()…tyleImageMissingCallback)");
        return subscribe;
    }

    private final Cancelable subscribeStyleLoaded(StyleLoadedCallback styleLoadedCallback) {
        Cancelable subscribe = requireCoreSnapshotter().subscribe(styleLoadedCallback);
        Intrinsics.checkNotNullExpressionValue(subscribe, "requireCoreSnapshotter()…ribe(styleLoadedCallback)");
        return subscribe;
    }

    public final CameraOptions cameraForCoordinates(List<Point> coordinates, EdgeInsets padding, Double bearing, Double pitch) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        MapSnapshotter requireCoreSnapshotter = requireCoreSnapshotter();
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.bearing(bearing);
        builder.pitch(pitch);
        Unit unit = Unit.INSTANCE;
        CameraOptions build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
        CameraOptions valueOrElse = requireCoreSnapshotter.cameraForCoordinates(coordinates, build, padding, null, null).getValueOrElse(new com.mapbox.common.module.cronet.a(23));
        Intrinsics.checkNotNullExpressionValue(valueOrElse, "requireCoreSnapshotter()…e cameraOptions { }\n    }");
        return valueOrElse;
    }

    public final void cancel() {
        requireCoreSnapshotter().cancel();
    }

    public final CoordinateBounds coordinateBoundsForCamera(CameraOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        CoordinateBounds coordinateBoundsForCamera = requireCoreSnapshotter().coordinateBoundsForCamera(options);
        Intrinsics.checkNotNullExpressionValue(coordinateBoundsForCamera, "requireCoreSnapshotter()…eBoundsForCamera(options)");
        return coordinateBoundsForCamera;
    }

    public final void destroy() {
        cancel();
        Iterator<T> it = this.cancelableEvents.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableEvents.clear();
        Cancelable cancelable = this.loadingErrorCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        Cancelable cancelable2 = this.styleLoadedCancelable;
        if (cancelable2 != null) {
            cancelable2.cancel();
        }
        this.snapshotStyleCallback = null;
        this.coreSnapshotter = null;
    }

    public final CameraState getCameraState() {
        CameraState cameraState = requireCoreSnapshotter().getCameraState();
        Intrinsics.checkNotNullExpressionValue(cameraState, "requireCoreSnapshotter().cameraState");
        return cameraState;
    }

    public final Size getSize() {
        Size size = requireCoreSnapshotter().getSize();
        Intrinsics.checkNotNullExpressionValue(size, "requireCoreSnapshotter().size");
        return size;
    }

    /* renamed from: getSnapshotStyleCallback$maps_sdk_release, reason: from getter */
    public final /* synthetic */ SnapshotStyleListener getSnapshotStyleCallback() {
        return this.snapshotStyleCallback;
    }

    public final String getStyleJson() {
        String styleJSON = requireCoreSnapshotter().getStyleJSON();
        Intrinsics.checkNotNullExpressionValue(styleJSON, "requireCoreSnapshotter().styleJSON");
        return styleJSON;
    }

    public final String getStyleUri() {
        String styleURI = requireCoreSnapshotter().getStyleURI();
        Intrinsics.checkNotNullExpressionValue(styleURI, "requireCoreSnapshotter().styleURI");
        return styleURI;
    }

    public final void setCamera(CameraOptions cameraOptions) {
        Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
        requireCoreSnapshotter().setCamera(cameraOptions);
    }

    public final void setSize(Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        requireCoreSnapshotter().setSize(size);
    }

    public final /* synthetic */ void setSnapshotStyleCallback$maps_sdk_release(SnapshotStyleListener snapshotStyleListener) {
        this.snapshotStyleCallback = snapshotStyleListener;
    }

    public final void setStyleJson(String styleJson) {
        Intrinsics.checkNotNullParameter(styleJson, "styleJson");
        requireCoreSnapshotter().setStyleJSON(styleJson);
    }

    public final void setStyleListener(SnapshotStyleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.snapshotStyleCallback = listener;
    }

    public final void setStyleUri(String styleUri) {
        Intrinsics.checkNotNullParameter(styleUri, "styleUri");
        requireCoreSnapshotter().setStyleURI(styleUri);
    }

    public final void start(SnapshotOverlayCallback overlayCallback, SnapshotResultCallback resultCallback) {
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        if (getStyleJson().length() == 0 && getStyleUri().length() == 0) {
            throw new IllegalStateException(StubApp.getString2(14194));
        }
        requireCoreSnapshotter().start(new C2.e(this, resultCallback, overlayCallback, 9));
    }

    @MapboxExperimental
    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        Intrinsics.checkNotNullParameter(tileCoverOptions, "tileCoverOptions");
        List<CanonicalTileID> tileCover = requireCoreSnapshotter().tileCover(tileCoverOptions, cameraOptions);
        Intrinsics.checkNotNullExpressionValue(tileCover, "requireCoreSnapshotter()…erOptions, cameraOptions)");
        return tileCover;
    }

    public /* synthetic */ Snapshotter(WeakReference weakReference, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, MapSnapshotter mapSnapshotter, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, mapSnapshotOptions, snapshotOverlayOptions, mapSnapshotter);
    }

    public /* synthetic */ Snapshotter(Context context, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, mapSnapshotOptions, (i3 & 4) != 0 ? new SnapshotOverlayOptions(false, false, 3, null) : snapshotOverlayOptions);
    }

    @JvmOverloads
    public Snapshotter(Context context, MapSnapshotOptions options, SnapshotOverlayOptions overlayOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(overlayOptions, "overlayOptions");
        this.cancelableEvents = new ArrayList();
        if (!StringsKt.isBlank(MapboxOptions.getAccessToken())) {
            this.context = new WeakReference<>(context);
            this.mapSnapshotOptions = options;
            this.snapshotOverlayOptions = overlayOptions;
            this.pixelRatio = context.getResources().getDisplayMetrics().density;
            this.coreSnapshotter = new MapSnapshotter(options);
            dispatchTelemetryTurnstileEvent(context);
            final WeakReference weakReference = new WeakReference(this);
            this.loadingErrorCancelable = subscribeMapLoadingError(new MapLoadingErrorCallback() { // from class: com.mapbox.maps.k
                @Override // com.mapbox.maps.MapLoadingErrorCallback
                public final void run(MapLoadingError mapLoadingError) {
                    Snapshotter._init_$lambda$1(weakReference, mapLoadingError);
                }
            });
            this.cancelableEvents.add(subscribeStyleDataLoaded(new l(weakReference)));
            this.styleLoadedCancelable = subscribeStyleLoaded(new l(weakReference));
            this.cancelableEvents.add(subscribeStyleImageMissing(new l(weakReference)));
            return;
        }
        throw new MapboxConfigurationException();
    }

    private final void drawAttribution(Canvas canvas, AttributionMeasure measure, PointF anchorPoint) {
        canvas.save();
        canvas.translate(anchorPoint.x, anchorPoint.y);
        measure.getTextView().draw(canvas);
        canvas.restore();
    }

    private Snapshotter(WeakReference<Context> weakReference, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, MapSnapshotter mapSnapshotter) {
        this.cancelableEvents = new ArrayList();
        this.context = weakReference;
        this.mapSnapshotOptions = mapSnapshotOptions;
        this.snapshotOverlayOptions = snapshotOverlayOptions;
        this.coreSnapshotter = mapSnapshotter;
        this.pixelRatio = 1.0f;
    }
}
