package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.interactions.FeatureStateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsStateKey;", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsState;", "key", "", "(Ljava/lang/String;)V", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StandardLandmarkIconsStateKey extends FeatureStateKey<StandardLandmarkIconsState> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsStateKey$Companion;", "", "()V", "create", "Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsStateKey;", "key", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @MapboxDelicateApi
        public final StandardLandmarkIconsStateKey create(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new StandardLandmarkIconsStateKey(key, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ StandardLandmarkIconsStateKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private StandardLandmarkIconsStateKey(String str) {
        super(str);
    }
}
