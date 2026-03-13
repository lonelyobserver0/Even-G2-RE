package com.mapbox.maps.coroutine;

import Qb.C0203k;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.QueriedRenderedFeature;
import com.mapbox.maps.QueriedSourceFeature;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.QuerySourceFeaturesCallback;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.SourceQueryOptions;
import com.mapbox.maps.UtilsKt$suspendMapboxCancellableCoroutine$2$1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lg7/b;", "Lcom/mapbox/maps/RenderedQueryGeometry;", "geometry", "Lcom/mapbox/maps/RenderedQueryOptions;", "options", "Lcom/mapbox/bindgen/Expected;", "", "", "Lcom/mapbox/maps/QueriedRenderedFeature;", "queryRenderedFeatures", "(Lg7/b;Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceId", "Lcom/mapbox/maps/SourceQueryOptions;", "Lcom/mapbox/maps/QueriedSourceFeature;", "querySourceFeatures", "(Lg7/b;Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapFeatureQueryDelegateExtKt {
    public static final /* synthetic */ Object queryRenderedFeatures(g7.b bVar, RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, Continuation continuation) {
        final C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        c0203k.u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(bVar.queryRenderedFeatures(renderedQueryGeometry, renderedQueryOptions, new QueryRenderedFeaturesCallback() { // from class: com.mapbox.maps.coroutine.MapFeatureQueryDelegateExtKt$queryRenderedFeatures$2$1
            @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
            public final void run(Expected<String, List<QueriedRenderedFeature>> p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                c0203k.resumeWith(Result.m40constructorimpl(p02));
            }
        })));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8;
    }

    public static final /* synthetic */ Object querySourceFeatures(g7.b bVar, String str, SourceQueryOptions sourceQueryOptions, Continuation continuation) {
        final C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(continuation));
        c0203k.s();
        c0203k.u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(bVar.querySourceFeatures(str, sourceQueryOptions, new QuerySourceFeaturesCallback() { // from class: com.mapbox.maps.coroutine.MapFeatureQueryDelegateExtKt$querySourceFeatures$2$1
            @Override // com.mapbox.maps.QuerySourceFeaturesCallback
            public final void run(Expected<String, List<QueriedSourceFeature>> p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                c0203k.resumeWith(Result.m40constructorimpl(p02));
            }
        })));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return r8;
    }
}
