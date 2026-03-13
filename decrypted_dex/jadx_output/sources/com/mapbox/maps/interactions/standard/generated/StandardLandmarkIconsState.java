package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.interactions.FeatureState;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsState;", "Lcom/mapbox/maps/interactions/FeatureState;", "internalState", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "getInternalState", "()Lcom/mapbox/bindgen/Value;", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StandardLandmarkIconsState extends FeatureState {
    private final Value internalState;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsState$Builder;", "Lcom/mapbox/maps/interactions/FeatureState$Builder;", "()V", "build", "Lcom/mapbox/maps/interactions/standard/generated/StandardLandmarkIconsState;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder extends FeatureState.Builder {
        @Override // com.mapbox.maps.interactions.FeatureState.Builder
        public StandardLandmarkIconsState build() {
            if (getRawStateMap().isEmpty()) {
                MapboxLogger.logW(StubApp.getString2(14376), StubApp.getString2(14390));
            }
            return new StandardLandmarkIconsState(new Value(getRawStateMap()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardLandmarkIconsState(Value internalState) {
        super(internalState);
        Intrinsics.checkNotNullParameter(internalState, "internalState");
        this.internalState = internalState;
    }

    @Override // com.mapbox.maps.interactions.FeatureState
    public Value getInternalState() {
        return this.internalState;
    }
}
