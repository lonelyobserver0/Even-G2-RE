package com.mapbox.maps.viewannotation;

import com.mapbox.geojson.Geometry;
import com.mapbox.maps.AnnotatedFeature;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.ViewAnnotationOptions;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a3\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a)\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001aE\u0010\r\u001a\u00020\u0004*\u00020\u000424\u0010\u000e\u001a\u001b\u0012\u0017\b\u0001\u0012\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00060\u000f\"\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0010\u001a\u0012\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"viewAnnotationOptions", "Lcom/mapbox/maps/ViewAnnotationOptions;", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "", "Lkotlin/ExtensionFunctionType;", "annotatedLayerFeature", "layerId", "", "Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;", "annotationAnchor", "Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;", "annotationAnchors", "blocks", "", "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;[Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "geometry", "Lcom/mapbox/geojson/Geometry;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ViewAnnotationOptionsKtxKt {
    public static final ViewAnnotationOptions.Builder annotatedLayerFeature(ViewAnnotationOptions.Builder builder, String layerId, Function1<? super AnnotatedLayerFeature.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(block, "block");
        AnnotatedLayerFeature.Builder layerId2 = new AnnotatedLayerFeature.Builder().layerId(layerId);
        block.invoke(layerId2);
        ViewAnnotationOptions.Builder annotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(layerId2.build()));
        Intrinsics.checkNotNullExpressionValue(annotatedFeature, "annotatedFeature(\n    An…(block).build()\n    )\n  )");
        return annotatedFeature;
    }

    public static /* synthetic */ ViewAnnotationOptions.Builder annotatedLayerFeature$default(ViewAnnotationOptions.Builder builder, String layerId, Function1 block, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            block = new Function1<AnnotatedLayerFeature.Builder, Unit>() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationOptionsKtxKt$annotatedLayerFeature$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnnotatedLayerFeature.Builder builder2) {
                    Intrinsics.checkNotNullParameter(builder2, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnnotatedLayerFeature.Builder builder2) {
                    invoke2(builder2);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(block, "block");
        AnnotatedLayerFeature.Builder layerId2 = new AnnotatedLayerFeature.Builder().layerId(layerId);
        block.invoke(layerId2);
        ViewAnnotationOptions.Builder annotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(layerId2.build()));
        Intrinsics.checkNotNullExpressionValue(annotatedFeature, "annotatedFeature(\n    An…(block).build()\n    )\n  )");
        return annotatedFeature;
    }

    public static final ViewAnnotationOptions.Builder annotationAnchor(ViewAnnotationOptions.Builder builder, Function1<? super ViewAnnotationAnchorConfig.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ViewAnnotationAnchorConfig.Builder builder2 = new ViewAnnotationAnchorConfig.Builder();
        block.invoke(builder2);
        ViewAnnotationOptions.Builder variableAnchors = builder.variableAnchors(CollectionsKt.listOf(builder2.build()));
        Intrinsics.checkNotNullExpressionValue(variableAnchors, "variableAnchors(listOf(V…().apply(block).build()))");
        return variableAnchors;
    }

    public static final ViewAnnotationOptions.Builder annotationAnchors(ViewAnnotationOptions.Builder builder, Function1<? super ViewAnnotationAnchorConfig.Builder, Unit>... blocks) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        ArrayList arrayList = new ArrayList(blocks.length);
        for (Function1<? super ViewAnnotationAnchorConfig.Builder, Unit> function1 : blocks) {
            ViewAnnotationAnchorConfig.Builder builder2 = new ViewAnnotationAnchorConfig.Builder();
            function1.invoke(builder2);
            arrayList.add(builder2.build());
        }
        Object[] array = arrayList.toArray(new ViewAnnotationAnchorConfig[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        ViewAnnotationAnchorConfig[] viewAnnotationAnchorConfigArr = (ViewAnnotationAnchorConfig[]) array;
        ViewAnnotationOptions.Builder variableAnchors = builder.variableAnchors(CollectionsKt.listOf(Arrays.copyOf(viewAnnotationAnchorConfigArr, viewAnnotationAnchorConfigArr.length)));
        Intrinsics.checkNotNullExpressionValue(variableAnchors, "variableAnchors(\n    lis…d() }.toTypedArray())\n  )");
        return variableAnchors;
    }

    public static final ViewAnnotationOptions.Builder geometry(ViewAnnotationOptions.Builder builder, Geometry geometry) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        ViewAnnotationOptions.Builder geometry2 = builder.annotatedFeature(AnnotatedFeature.valueOf(geometry));
        Intrinsics.checkNotNullExpressionValue(geometry2, "geometry");
        return geometry2;
    }

    public static final ViewAnnotationOptions viewAnnotationOptions(Function1<? super ViewAnnotationOptions.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ViewAnnotationOptions.Builder builder = new ViewAnnotationOptions.Builder();
        block.invoke(builder);
        ViewAnnotationOptions build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
        return build;
    }
}
