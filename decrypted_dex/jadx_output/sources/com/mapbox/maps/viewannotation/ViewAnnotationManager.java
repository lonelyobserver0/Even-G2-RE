package com.mapbox.maps.viewannotation;

import android.view.View;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.ViewAnnotationOptions;
import com.stub.StubApp;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 72\u00020\u0001:\u00017J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0005H&J\u001a\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0005H&J6\u0010\u0016\u001a\u00020\u00132\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u001eH&JA\u0010\u001f\u001a\u0004\u0018\u00010 2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H'¢\u0006\u0002\u0010'JS\u0010\u001f\u001a\u00020\u00132\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u001eH&¢\u0006\u0002\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020,H&J\u0012\u0010-\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0004H&J\u0012\u0010-\u001a\u0004\u0018\u00010\u00052\u0006\u0010+\u001a\u00020,H&J\b\u0010.\u001a\u00020/H&J\b\u00100\u001a\u00020\u0013H&J\u0010\u00101\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u00102\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\u0004H&J\u0010\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u00020/H&J\u0018\u00106\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0005H&R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R2\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8&@&X§\u000e¢\u0006\u0012\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00068"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "", "annotations", "", "Landroid/view/View;", "Lcom/mapbox/maps/ViewAnnotationOptions;", "getAnnotations", "()Ljava/util/Map;", "viewAnnotationAvoidLayers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "getViewAnnotationAvoidLayers$annotations", "()V", "getViewAnnotationAvoidLayers", "()Ljava/util/HashSet;", "setViewAnnotationAvoidLayers", "(Ljava/util/HashSet;)V", "addOnViewAnnotationUpdatedListener", "", "listener", "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;", "addViewAnnotation", "view", "options", "resId", "", "asyncInflater", "Landroidx/asynclayoutinflater/view/AsyncLayoutInflater;", "asyncInflateCallback", "Lkotlin/Function1;", "cameraForAnnotations", "Lcom/mapbox/maps/CameraOptions;", "", "edgeInsets", "Lcom/mapbox/maps/EdgeInsets;", "bearing", "", "pitch", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "result", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)V", "getViewAnnotation", "annotatedLayerFeature", "Lcom/mapbox/maps/AnnotatedLayerFeature;", "getViewAnnotationOptions", "getViewAnnotationUpdateMode", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "removeAllViewAnnotations", "removeOnViewAnnotationUpdatedListener", "removeViewAnnotation", "", "setViewAnnotationUpdateMode", "mode", "updateViewAnnotation", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ViewAnnotationManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @JvmField
    public static final ViewAnnotationUpdateMode DEFAULT_UPDATE_MODE = ViewAnnotationUpdateMode.MAP_SYNCHRONIZED;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManager$Companion;", "", "()V", "DEFAULT_UPDATE_MODE", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ CameraOptions cameraForAnnotations$default(ViewAnnotationManager viewAnnotationManager, List list, EdgeInsets edgeInsets, Double d8, Double d10, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(StubApp.getString2(14592));
            }
            if ((i3 & 2) != 0) {
                edgeInsets = null;
            }
            if ((i3 & 4) != 0) {
                d8 = null;
            }
            if ((i3 & 8) != 0) {
                d10 = null;
            }
            return viewAnnotationManager.cameraForAnnotations(list, edgeInsets, d8, d10);
        }

        @MapboxExperimental
        public static /* synthetic */ void getViewAnnotationAvoidLayers$annotations() {
        }

        public static /* synthetic */ void cameraForAnnotations$default(ViewAnnotationManager viewAnnotationManager, List list, EdgeInsets edgeInsets, Double d8, Double d10, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(StubApp.getString2(14592));
            }
            if ((i3 & 2) != 0) {
                edgeInsets = null;
            }
            if ((i3 & 4) != 0) {
                d8 = null;
            }
            if ((i3 & 8) != 0) {
                d10 = null;
            }
            viewAnnotationManager.cameraForAnnotations(list, edgeInsets, d8, d10, function1);
        }
    }

    void addOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener listener);

    View addViewAnnotation(int resId, ViewAnnotationOptions options);

    void addViewAnnotation(int resId, ViewAnnotationOptions options, AsyncLayoutInflater asyncInflater, Function1<? super View, Unit> asyncInflateCallback);

    void addViewAnnotation(View view, ViewAnnotationOptions options);

    @MapboxDelicateApi
    CameraOptions cameraForAnnotations(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch);

    void cameraForAnnotations(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch, Function1<? super CameraOptions, Unit> result);

    Map<View, ViewAnnotationOptions> getAnnotations();

    View getViewAnnotation(AnnotatedLayerFeature annotatedLayerFeature);

    HashSet<String> getViewAnnotationAvoidLayers();

    ViewAnnotationOptions getViewAnnotationOptions(View view);

    ViewAnnotationOptions getViewAnnotationOptions(AnnotatedLayerFeature annotatedLayerFeature);

    ViewAnnotationUpdateMode getViewAnnotationUpdateMode();

    void removeAllViewAnnotations();

    void removeOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener listener);

    boolean removeViewAnnotation(View view);

    void setViewAnnotationAvoidLayers(HashSet<String> hashSet);

    void setViewAnnotationUpdateMode(ViewAnnotationUpdateMode mode);

    boolean updateViewAnnotation(View view, ViewAnnotationOptions options);
}
