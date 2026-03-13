package com.mapbox.maps.interactions.standard.generated;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.interactions.FeatureState;
import com.stub.StubApp;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsState;", "Lcom/mapbox/maps/interactions/FeatureState;", "internalState", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "hide", "", "getHide$annotations", "()V", "getHide", "()Ljava/lang/Boolean;", "highlight", "getHighlight$annotations", "getHighlight", "getInternalState", "()Lcom/mapbox/bindgen/Value;", "select", "getSelect$annotations", "getSelect", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StandardPlaceLabelsState extends FeatureState {
    private final Value internalState;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsState$Builder;", "Lcom/mapbox/maps/interactions/FeatureState$Builder;", "()V", "build", "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsState;", "hide", "", "highlight", "select", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder extends FeatureState.Builder {
        public final Builder hide(boolean hide) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueOf = Value.valueOf(hide);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(hide)");
            rawStateMap.put(StubApp.getString2(14392), valueOf);
            return this;
        }

        public final Builder highlight(boolean highlight) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueOf = Value.valueOf(highlight);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(highlight)");
            rawStateMap.put(StubApp.getString2(14382), valueOf);
            return this;
        }

        public final Builder select(boolean select) {
            HashMap<String, Value> rawStateMap = getRawStateMap();
            Value valueOf = Value.valueOf(select);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(select)");
            rawStateMap.put(StubApp.getString2(14383), valueOf);
            return this;
        }

        @Override // com.mapbox.maps.interactions.FeatureState.Builder
        public StandardPlaceLabelsState build() {
            if (getRawStateMap().isEmpty()) {
                MapboxLogger.logW(StubApp.getString2(14376), StubApp.getString2(14391));
            }
            return new StandardPlaceLabelsState(new Value(getRawStateMap()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardPlaceLabelsState(Value internalState) {
        super(internalState);
        Intrinsics.checkNotNullParameter(internalState, "internalState");
        this.internalState = internalState;
    }

    public static /* synthetic */ void getHide$annotations() {
    }

    public static /* synthetic */ void getHighlight$annotations() {
    }

    public static /* synthetic */ void getSelect$annotations() {
    }

    public final Boolean getHide() {
        Object contents = getInternalState().getContents();
        Intrinsics.checkNotNull(contents, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.mapbox.bindgen.Value>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.mapbox.bindgen.Value> }");
        Value value = (Value) ((HashMap) contents).get(StubApp.getString2(14392));
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }

    public final Boolean getHighlight() {
        Object contents = getInternalState().getContents();
        Intrinsics.checkNotNull(contents, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.mapbox.bindgen.Value>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.mapbox.bindgen.Value> }");
        Value value = (Value) ((HashMap) contents).get(StubApp.getString2(14382));
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }

    @Override // com.mapbox.maps.interactions.FeatureState
    public Value getInternalState() {
        return this.internalState;
    }

    public final Boolean getSelect() {
        Object contents = getInternalState().getContents();
        Intrinsics.checkNotNull(contents, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.mapbox.bindgen.Value>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.mapbox.bindgen.Value> }");
        Value value = (Value) ((HashMap) contents).get(StubApp.getString2(14383));
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }
}
