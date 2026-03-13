package com.mapbox.maps;

import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0018*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003:\u0001\u0018B\u008b\u0001\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000f\u0012 \u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0002\u0010\u0016BC\b\u0012\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/DragInteraction;", "T", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/MapInteraction;", "featureset", "Lcom/mapbox/maps/FeaturesetDescriptor;", "filter", "Lcom/mapbox/bindgen/Value;", "radius", "", "onDragBegin", "Lkotlin/Function2;", "Lcom/mapbox/maps/InteractionContext;", "", "onDrag", "Lkotlin/Function1;", "", "onDragEnd", "featuresetFeatureBuilder", "Lkotlin/Function3;", "Lcom/mapbox/geojson/Feature;", "Lcom/mapbox/maps/FeaturesetFeatureId;", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class DragInteraction<T extends FeaturesetFeature<?>> extends MapInteraction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0081\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u001e\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0002\u0010\u0016JK\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u0013H\u0087\u0002Jd\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u001e\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/DragInteraction$Companion;", "", "()V", "featureset", "Lcom/mapbox/maps/MapInteraction;", "id", "", "importId", "filter", "Lcom/mapbox/bindgen/Value;", "radius", "", "onDragBegin", "Lkotlin/Function2;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/InteractionContext;", "", "onDrag", "Lkotlin/Function1;", "", "onDragEnd", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/MapInteraction;", "invoke", "Lcom/mapbox/maps/DragInteraction;", "", "layer", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MapInteraction featureset$default(Companion companion, String str, String str2, Value value, Double d8, Function2 function2, Function1 function1, Function1 function12, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                str2 = null;
            }
            if ((i3 & 4) != 0) {
                value = null;
            }
            if ((i3 & 8) != 0) {
                d8 = null;
            }
            return companion.featureset(str, str2, value, d8, function2, function1, function12);
        }

        public static /* synthetic */ MapInteraction layer$default(Companion companion, String str, Value value, Function2 function2, Function1 function1, Function1 function12, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                value = null;
            }
            return companion.layer(str, value, function2, function1, function12);
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction featureset(String id, String str, Value value, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onDragBegin, Function1<? super InteractionContext, Unit> function1, Function1<? super InteractionContext, Unit> function12) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onDragBegin, "onDragBegin");
            Intrinsics.checkNotNullParameter(function1, StubApp.getString2(13907));
            Intrinsics.checkNotNullParameter(function12, StubApp.getString2(13908));
            return featureset$default(this, id, str, value, null, onDragBegin, function1, function12, 8, null);
        }

        public final /* synthetic */ DragInteraction invoke(Function1 onDragBegin, Function1 onDrag, Function1 onDragEnd) {
            Intrinsics.checkNotNullParameter(onDragBegin, "onDragBegin");
            Intrinsics.checkNotNullParameter(onDrag, "onDrag");
            Intrinsics.checkNotNullParameter(onDragEnd, "onDragEnd");
            return new DragInteraction(onDragBegin, onDrag, onDragEnd, null);
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction layer(String id, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onDragBegin, Function1<? super InteractionContext, Unit> onDrag, Function1<? super InteractionContext, Unit> onDragEnd) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onDragBegin, "onDragBegin");
            Intrinsics.checkNotNullParameter(onDrag, "onDrag");
            Intrinsics.checkNotNullParameter(onDragEnd, "onDragEnd");
            return layer$default(this, id, null, onDragBegin, onDrag, onDragEnd, 2, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction featureset(String id, String str, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onDragBegin, Function1<? super InteractionContext, Unit> onDrag, Function1<? super InteractionContext, Unit> function1) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onDragBegin, "onDragBegin");
            Intrinsics.checkNotNullParameter(onDrag, "onDrag");
            Intrinsics.checkNotNullParameter(function1, StubApp.getString2(13908));
            return featureset$default(this, id, str, null, null, onDragBegin, onDrag, function1, 12, null);
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction layer(final String id, Value filter, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onDragBegin, Function1<? super InteractionContext, Unit> onDrag, Function1<? super InteractionContext, Unit> onDragEnd) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onDragBegin, "onDragBegin");
            Intrinsics.checkNotNullParameter(onDrag, "onDrag");
            Intrinsics.checkNotNullParameter(onDragEnd, "onDragEnd");
            return new DragInteraction(new FeaturesetDescriptor(null, null, id), filter, null, onDragBegin, onDrag, onDragEnd, new Function3<Feature, FeaturesetFeatureId, Value, FeaturesetFeature<FeatureState>>() { // from class: com.mapbox.maps.DragInteraction$Companion$layer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final FeaturesetFeature<FeatureState> invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value state) {
                    Intrinsics.checkNotNullParameter(feature, "feature");
                    Intrinsics.checkNotNullParameter(state, "state");
                    return new FeaturesetFeature<>(featuresetFeatureId, new TypedFeaturesetDescriptor.Layer(id), new FeatureState(state), feature);
                }
            }, null);
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction featureset(String id, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onDragBegin, Function1<? super InteractionContext, Unit> onDrag, Function1<? super InteractionContext, Unit> onDragEnd) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onDragBegin, "onDragBegin");
            Intrinsics.checkNotNullParameter(onDrag, "onDrag");
            Intrinsics.checkNotNullParameter(onDragEnd, "onDragEnd");
            return featureset$default(this, id, null, null, null, onDragBegin, onDrag, onDragEnd, 14, null);
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction featureset(final String id, final String importId, Value filter, Double radius, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onDragBegin, Function1<? super InteractionContext, Unit> onDrag, Function1<? super InteractionContext, Unit> onDragEnd) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onDragBegin, "onDragBegin");
            Intrinsics.checkNotNullParameter(onDrag, StubApp.getString2(13907));
            Intrinsics.checkNotNullParameter(onDragEnd, StubApp.getString2(13908));
            return new DragInteraction(new FeaturesetDescriptor(id, importId, null), filter, radius, onDragBegin, onDrag, onDragEnd, new Function3<Feature, FeaturesetFeatureId, Value, FeaturesetFeature<FeatureState>>() { // from class: com.mapbox.maps.DragInteraction$Companion$featureset$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final FeaturesetFeature<FeatureState> invoke(Feature feature, FeaturesetFeatureId featuresetFeatureId, Value state) {
                    Intrinsics.checkNotNullParameter(feature, "feature");
                    Intrinsics.checkNotNullParameter(state, "state");
                    return new FeaturesetFeature<>(featuresetFeatureId, new TypedFeaturesetDescriptor.Featureset(id, importId), new FeatureState(state), feature);
                }
            }, null);
        }
    }

    public /* synthetic */ DragInteraction(FeaturesetDescriptor featuresetDescriptor, Value value, Double d8, Function2 function2, Function1 function1, Function1 function12, Function3 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(featuresetDescriptor, value, d8, function2, function1, function12, function3);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction featureset(String str, String str2, Value value, Double d8, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2, Function1<? super InteractionContext, Unit> function1, Function1<? super InteractionContext, Unit> function12) {
        return INSTANCE.featureset(str, str2, value, d8, function2, function1, function12);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction layer(String str, Value value, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2, Function1<? super InteractionContext, Unit> function1, Function1<? super InteractionContext, Unit> function12) {
        return INSTANCE.layer(str, value, function2, function1, function12);
    }

    public /* synthetic */ DragInteraction(Function1 function1, Function1 function12, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction featureset(String str, String str2, Value value, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2, Function1<? super InteractionContext, Unit> function1, Function1<? super InteractionContext, Unit> function12) {
        return INSTANCE.featureset(str, str2, value, function2, function1, function12);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction layer(String str, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2, Function1<? super InteractionContext, Unit> function1, Function1<? super InteractionContext, Unit> function12) {
        return INSTANCE.layer(str, function2, function1, function12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DragInteraction(com.mapbox.maps.FeaturesetDescriptor r2, com.mapbox.bindgen.Value r3, java.lang.Double r4, kotlin.jvm.functions.Function2 r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function3 r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L6
            r3 = r0
        L6:
            r9 = r9 & 4
            if (r9 == 0) goto L13
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r0
        Lf:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L19
        L13:
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            goto Lf
        L19:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.DragInteraction.<init>(com.mapbox.maps.FeaturesetDescriptor, com.mapbox.bindgen.Value, java.lang.Double, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction featureset(String str, String str2, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2, Function1<? super InteractionContext, Unit> function1, Function1<? super InteractionContext, Unit> function12) {
        return INSTANCE.featureset(str, str2, function2, function1, function12);
    }

    private DragInteraction(FeaturesetDescriptor featuresetDescriptor, Value value, Double d8, final Function2<? super T, ? super InteractionContext, Boolean> function2, final Function1<? super InteractionContext, Unit> function1, final Function1<? super InteractionContext, Unit> function12, final Function3<? super Feature, ? super FeaturesetFeatureId, ? super Value, ? extends T> function3) {
        this.coreInteraction = new Interaction(featuresetDescriptor, value, InteractionType.DRAG, new InteractionHandler() { // from class: com.mapbox.maps.DragInteraction.1
            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature feature, InteractionContext context) {
                Feature feature2;
                Intrinsics.checkNotNullParameter(context, "context");
                if (((feature == null || (feature2 = feature.getFeature()) == null) ? null : feature2.geometry()) == null) {
                    return false;
                }
                Function2<T, InteractionContext, Boolean> function22 = function2;
                Function3<Feature, FeaturesetFeatureId, Value, T> function32 = function3;
                Feature feature3 = feature.getFeature();
                Intrinsics.checkNotNullExpressionValue(feature3, "feature.feature");
                FeaturesetFeatureId featuresetFeatureId = feature.getFeaturesetFeatureId();
                Value state = feature.getState();
                Intrinsics.checkNotNullExpressionValue(state, "feature.state");
                return ((Boolean) function22.invoke(function32.invoke(feature3, featuresetFeatureId, state), context)).booleanValue();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                function1.invoke(context);
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                function12.invoke(context);
            }
        }, d8);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction featureset(String str, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2, Function1<? super InteractionContext, Unit> function1, Function1<? super InteractionContext, Unit> function12) {
        return INSTANCE.featureset(str, function2, function1, function12);
    }

    private DragInteraction(final Function1<? super InteractionContext, Boolean> function1, final Function1<? super InteractionContext, Unit> function12, final Function1<? super InteractionContext, Unit> function13) {
        this.coreInteraction = new Interaction(null, null, InteractionType.DRAG, new InteractionHandler() { // from class: com.mapbox.maps.DragInteraction.2
            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature feature, InteractionContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return function1.invoke(context).booleanValue();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                function12.invoke(context);
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                function13.invoke(context);
            }
        }, null);
    }
}
