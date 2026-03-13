package com.mapbox.maps;

import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0015*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003:\u0001\u0015Bc\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u0012B\u001b\b\u0012\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0013¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/LongClickInteraction;", "T", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/MapInteraction;", "featureset", "Lcom/mapbox/maps/FeaturesetDescriptor;", "filter", "Lcom/mapbox/bindgen/Value;", "radius", "", "onLongClick", "Lkotlin/Function2;", "Lcom/mapbox/maps/InteractionContext;", "", "featuresetFeatureBuilder", "Lkotlin/Function3;", "Lcom/mapbox/geojson/Feature;", "Lcom/mapbox/maps/FeaturesetFeatureId;", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LongClickInteraction<T extends FeaturesetFeature<?>> extends MapInteraction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JY\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u001e\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0007¢\u0006\u0002\u0010\u0012J(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0016H\u0087\u0002¢\u0006\u0002\b\u0017JM\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u001e\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/LongClickInteraction$Companion;", "", "()V", "featureset", "Lcom/mapbox/maps/MapInteraction;", "id", "", "importId", "filter", "Lcom/mapbox/bindgen/Value;", "radius", "", "onLongClick", "Lkotlin/Function2;", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "Lcom/mapbox/maps/interactions/FeatureState;", "Lcom/mapbox/maps/InteractionContext;", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;)Lcom/mapbox/maps/MapInteraction;", "invoke", "Lcom/mapbox/maps/LongClickInteraction;", "", "Lkotlin/Function1;", "map", "layer", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;)Lcom/mapbox/maps/MapInteraction;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MapInteraction featureset$default(Companion companion, String str, String str2, Value value, Double d8, Function2 function2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                str2 = null;
            }
            if ((i3 & 4) != 0) {
                value = null;
            }
            if ((i3 & 8) != 0) {
                d8 = null;
            }
            return companion.featureset(str, str2, value, d8, function2);
        }

        public static /* synthetic */ MapInteraction layer$default(Companion companion, String str, Value value, Double d8, Function2 function2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                value = null;
            }
            if ((i3 & 4) != 0) {
                d8 = null;
            }
            return companion.layer(str, value, d8, function2);
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction featureset(String id, String str, Value value, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
            return featureset$default(this, id, str, value, null, onLongClick, 8, null);
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction layer(String id, Value value, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
            return layer$default(this, id, value, null, onLongClick, 4, null);
        }

        @JvmStatic
        @JvmName(name = "map")
        public final LongClickInteraction map(Function1<? super InteractionContext, Boolean> onLongClick) {
            Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
            return new LongClickInteraction(onLongClick, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction featureset(String id, String str, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
            return featureset$default(this, id, str, null, null, onLongClick, 12, null);
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction layer(String id, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
            return layer$default(this, id, null, null, onLongClick, 6, null);
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction featureset(String id, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
            return featureset$default(this, id, null, null, null, onLongClick, 14, null);
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction layer(final String id, Value filter, Double radius, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
            return new LongClickInteraction(new FeaturesetDescriptor(null, null, id), filter, radius, onLongClick, new Function3<Feature, FeaturesetFeatureId, Value, FeaturesetFeature<FeatureState>>() { // from class: com.mapbox.maps.LongClickInteraction$Companion$layer$1
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
            });
        }

        @JvmStatic
        @JvmOverloads
        public final MapInteraction featureset(final String id, final String importId, Value filter, Double radius, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> onLongClick) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
            return new LongClickInteraction(new FeaturesetDescriptor(id, importId, null), filter, radius, onLongClick, new Function3<Feature, FeaturesetFeatureId, Value, FeaturesetFeature<FeatureState>>() { // from class: com.mapbox.maps.LongClickInteraction$Companion$featureset$1
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
            });
        }
    }

    public /* synthetic */ LongClickInteraction(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction featureset(String str, String str2, Value value, Double d8, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2) {
        return INSTANCE.featureset(str, str2, value, d8, function2);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction layer(String str, Value value, Double d8, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2) {
        return INSTANCE.layer(str, value, d8, function2);
    }

    @JvmStatic
    @JvmName(name = "map")
    public static final LongClickInteraction map(Function1<? super InteractionContext, Boolean> function1) {
        return INSTANCE.map(function1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LongClickInteraction(com.mapbox.maps.FeaturesetDescriptor r2, com.mapbox.bindgen.Value r3, java.lang.Double r4, kotlin.jvm.functions.Function2 r5, kotlin.jvm.functions.Function3 r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto L6
            r3 = r0
        L6:
            r7 = r7 & 4
            if (r7 == 0) goto L11
            r7 = r6
            r6 = r5
            r5 = r0
        Ld:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L15
        L11:
            r7 = r6
            r6 = r5
            r5 = r4
            goto Ld
        L15:
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.LongClickInteraction.<init>(com.mapbox.maps.FeaturesetDescriptor, com.mapbox.bindgen.Value, java.lang.Double, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction featureset(String str, String str2, Value value, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2) {
        return INSTANCE.featureset(str, str2, value, function2);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction layer(String str, Value value, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2) {
        return INSTANCE.layer(str, value, function2);
    }

    public LongClickInteraction(FeaturesetDescriptor featureset, Value value, Double d8, final Function2<? super T, ? super InteractionContext, Boolean> onLongClick, final Function3<? super Feature, ? super FeaturesetFeatureId, ? super Value, ? extends T> featuresetFeatureBuilder) {
        Intrinsics.checkNotNullParameter(featureset, "featureset");
        Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
        Intrinsics.checkNotNullParameter(featuresetFeatureBuilder, "featuresetFeatureBuilder");
        this.coreInteraction = new Interaction(featureset, value, InteractionType.LONG_CLICK, new InteractionHandler() { // from class: com.mapbox.maps.LongClickInteraction.1
            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature feature, InteractionContext context) {
                Feature feature2;
                Intrinsics.checkNotNullParameter(context, "context");
                if (((feature == null || (feature2 = feature.getFeature()) == null) ? null : feature2.geometry()) == null) {
                    return false;
                }
                Function2<T, InteractionContext, Boolean> function2 = onLongClick;
                Function3<Feature, FeaturesetFeatureId, Value, T> function3 = featuresetFeatureBuilder;
                Feature feature3 = feature.getFeature();
                Intrinsics.checkNotNullExpressionValue(feature3, "feature.feature");
                FeaturesetFeatureId featuresetFeatureId = feature.getFeaturesetFeatureId();
                Value state = feature.getState();
                Intrinsics.checkNotNullExpressionValue(state, "feature.state");
                return ((Boolean) function2.invoke(function3.invoke(feature3, featuresetFeatureId, state), context)).booleanValue();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
            }
        }, d8);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction featureset(String str, String str2, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2) {
        return INSTANCE.featureset(str, str2, function2);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction layer(String str, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2) {
        return INSTANCE.layer(str, function2);
    }

    @JvmStatic
    @JvmOverloads
    public static final MapInteraction featureset(String str, Function2<? super FeaturesetFeature<FeatureState>, ? super InteractionContext, Boolean> function2) {
        return INSTANCE.featureset(str, function2);
    }

    private LongClickInteraction(final Function1<? super InteractionContext, Boolean> function1) {
        this.coreInteraction = new Interaction(null, null, InteractionType.LONG_CLICK, new InteractionHandler() { // from class: com.mapbox.maps.LongClickInteraction.2
            @Override // com.mapbox.maps.InteractionHandler
            public boolean handleBegin(QueriedFeature feature, InteractionContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return function1.invoke(context).booleanValue();
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleChange(InteractionContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
            }

            @Override // com.mapbox.maps.InteractionHandler
            public void handleEnd(InteractionContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
            }
        }, null);
    }
}
