package com.mapbox.maps.interactions;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0015\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/interactions/FeatureState;", "", "internalState", "Lcom/mapbox/bindgen/Value;", "(Lcom/mapbox/bindgen/Value;)V", "getInternalState", "()Lcom/mapbox/bindgen/Value;", "asJsonString", "", "equals", "", "other", "getBooleanState", "stateName", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getDoubleState", "", "(Ljava/lang/String;)Ljava/lang/Double;", "getLongState", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getStringState", "hashCode", "", "toString", "Builder", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FeatureState {
    private final Value internalState;
    public static final String TAG = StubApp.getString2(14376);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016R0\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/interactions/FeatureState$Builder;", "", "()V", "rawStateMap", "Ljava/util/HashMap;", "", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", "getRawStateMap", "()Ljava/util/HashMap;", "addBooleanState", "stateName", "value", "", "addDoubleState", "", "addLongState", "", "addStringState", "build", "Lcom/mapbox/maps/interactions/FeatureState;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class Builder {
        private final HashMap<String, Value> rawStateMap = new HashMap<>();

        public final Builder addBooleanState(String stateName, boolean value) {
            Intrinsics.checkNotNullParameter(stateName, "stateName");
            HashMap<String, Value> hashMap = this.rawStateMap;
            Value valueOf = Value.valueOf(value);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(value)");
            hashMap.put(stateName, valueOf);
            return this;
        }

        public final Builder addDoubleState(String stateName, double value) {
            Intrinsics.checkNotNullParameter(stateName, "stateName");
            HashMap<String, Value> hashMap = this.rawStateMap;
            Value valueOf = Value.valueOf(value);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(value)");
            hashMap.put(stateName, valueOf);
            return this;
        }

        public final Builder addLongState(String stateName, long value) {
            Intrinsics.checkNotNullParameter(stateName, "stateName");
            HashMap<String, Value> hashMap = this.rawStateMap;
            Value valueOf = Value.valueOf(value);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(value)");
            hashMap.put(stateName, valueOf);
            return this;
        }

        public final Builder addStringState(String stateName, String value) {
            Intrinsics.checkNotNullParameter(stateName, "stateName");
            Intrinsics.checkNotNullParameter(value, "value");
            HashMap<String, Value> hashMap = this.rawStateMap;
            Value valueOf = Value.valueOf(value);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(value)");
            hashMap.put(stateName, valueOf);
            return this;
        }

        public FeatureState build() {
            if (this.rawStateMap.isEmpty()) {
                MapboxLogger.logW(StubApp.getString2(14376), StubApp.getString2(14377));
            }
            return new FeatureState(new Value(this.rawStateMap));
        }

        public final HashMap<String, Value> getRawStateMap() {
            return this.rawStateMap;
        }
    }

    public FeatureState(Value internalState) {
        Intrinsics.checkNotNullParameter(internalState, "internalState");
        this.internalState = internalState;
    }

    public final String asJsonString() {
        String json = getInternalState().toJson();
        Intrinsics.checkNotNullExpressionValue(json, "internalState.toJson()");
        return json;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.maps.interactions.FeatureState");
        return Intrinsics.areEqual(getInternalState(), ((FeatureState) other).getInternalState());
    }

    public final Boolean getBooleanState(String stateName) {
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        Object contents = getInternalState().getContents();
        Intrinsics.checkNotNull(contents, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.mapbox.bindgen.Value>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.mapbox.bindgen.Value> }");
        Value value = (Value) ((HashMap) contents).get(stateName);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Boolean) {
            return (Boolean) contents2;
        }
        return null;
    }

    public final Double getDoubleState(String stateName) {
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        Object contents = getInternalState().getContents();
        Intrinsics.checkNotNull(contents, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.mapbox.bindgen.Value>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.mapbox.bindgen.Value> }");
        Value value = (Value) ((HashMap) contents).get(stateName);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Double) {
            return (Double) contents2;
        }
        return null;
    }

    public Value getInternalState() {
        return this.internalState;
    }

    public final Long getLongState(String stateName) {
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        Object contents = getInternalState().getContents();
        Intrinsics.checkNotNull(contents, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.mapbox.bindgen.Value>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.mapbox.bindgen.Value> }");
        Value value = (Value) ((HashMap) contents).get(stateName);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof Long) {
            return (Long) contents2;
        }
        return null;
    }

    public final String getStringState(String stateName) {
        Intrinsics.checkNotNullParameter(stateName, "stateName");
        Object contents = getInternalState().getContents();
        Intrinsics.checkNotNull(contents, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.mapbox.bindgen.Value>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.mapbox.bindgen.Value> }");
        Value value = (Value) ((HashMap) contents).get(stateName);
        Object contents2 = value != null ? value.getContents() : null;
        if (contents2 instanceof String) {
            return (String) contents2;
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(getInternalState());
    }

    public String toString() {
        return StubApp.getString2(14378) + getInternalState().toJson() + ')';
    }
}
