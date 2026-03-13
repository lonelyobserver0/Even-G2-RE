package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 &2\u00020\u0001:\u0002&'B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J0\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0\u000b0\u001f\"\u0004\b\u0000\u0010 2\b\u0010!\u001a\u0004\u0018\u00010\u00052\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0002J\u0012\u0010$\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010%\u001a\u00020\u0005H\u0016R$\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lcom/mapbox/maps/module/telemetry/PerformanceEvent;", "Lcom/mapbox/maps/module/telemetry/MapBaseEvent;", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", "sessionId", "", "bundle", "Landroid/os/Bundle;", "(Lcom/mapbox/maps/module/telemetry/PhoneState;Ljava/lang/String;Landroid/os/Bundle;)V", "attributes", "", "Lcom/mapbox/maps/module/telemetry/PerformanceEvent$PerformanceAttribute;", "getAttributes", "()Ljava/util/List;", "counters", "", "getCounters", "metadata", "Lcom/google/gson/JsonObject;", "getMetadata", "()Lcom/google/gson/JsonObject;", "getSessionId", "()Ljava/lang/String;", "equals", "", "other", "", "getEventName", "hashCode", "", "initList", "Ljava/util/ArrayList;", "T", "fromString", "typeToken", "Lcom/google/gson/reflect/TypeToken;", "initMetaData", "toString", "Companion", "PerformanceAttribute", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"ParcelCreator"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class PerformanceEvent extends MapBaseEvent {

    @SerializedName("attributes")
    private final List<PerformanceAttribute<String>> attributes;

    @SerializedName("counters")
    private final List<PerformanceAttribute<Double>> counters;

    @SerializedName("metadata")
    private final JsonObject metadata;

    @SerializedName("sessionId")
    private final String sessionId;
    private static final String PERFORMANCE_TRACE = StubApp.getString2(14419);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/module/telemetry/PerformanceEvent$PerformanceAttribute;", "T", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PerformanceAttribute<T> {
        private final String name;
        private final T value;

        public PerformanceAttribute(String str, T t3) {
            this.name = str;
            this.value = t3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual(PerformanceAttribute.class, other.getClass())) {
                return false;
            }
            PerformanceAttribute performanceAttribute = (PerformanceAttribute) other;
            if (Intrinsics.areEqual(this.name, performanceAttribute.name)) {
                return Intrinsics.areEqual(this.value, performanceAttribute.value);
            }
            return false;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            T t3 = this.value;
            return hashCode + (t3 != null ? t3.hashCode() : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceEvent(PhoneState phoneState, String str, Bundle bundle) {
        super(phoneState);
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.sessionId = str;
        this.attributes = initList(bundle.getString(StubApp.getString2(14420)), new TypeToken<ArrayList<PerformanceAttribute<String>>>() { // from class: com.mapbox.maps.module.telemetry.PerformanceEvent.1
        });
        this.counters = initList(bundle.getString(StubApp.getString2(14421)), new TypeToken<ArrayList<PerformanceAttribute<Double>>>() { // from class: com.mapbox.maps.module.telemetry.PerformanceEvent.2
        });
        this.metadata = initMetaData(bundle.getString(StubApp.getString2(2127)));
    }

    private final <T> ArrayList<PerformanceAttribute<T>> initList(String fromString, TypeToken<?> typeToken) {
        if (fromString == null || fromString.length() == 0) {
            return new ArrayList<>();
        }
        Object fromJson = new Gson().fromJson(fromString, typeToken.getType());
        Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(fromString, typeToken.type)");
        return (ArrayList) fromJson;
    }

    private final JsonObject initMetaData(String fromString) {
        if (fromString == null) {
            return new JsonObject();
        }
        Object fromJson = new Gson().fromJson(fromString, (Class<Object>) JsonObject.class);
        Intrinsics.checkNotNullExpressionValue(fromJson, "{\n      Gson()\n        .…Object::class.java)\n    }");
        return (JsonObject) fromJson;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(PerformanceEvent.class, other.getClass())) {
            return false;
        }
        PerformanceEvent performanceEvent = (PerformanceEvent) other;
        if (Intrinsics.areEqual(getEvent(), performanceEvent.getEvent()) && Intrinsics.areEqual(getCreated(), performanceEvent.getCreated()) && Intrinsics.areEqual(this.sessionId, performanceEvent.sessionId) && Intrinsics.areEqual(this.attributes, performanceEvent.attributes) && Intrinsics.areEqual(this.counters, performanceEvent.counters)) {
            return Intrinsics.areEqual(this.metadata, performanceEvent.metadata);
        }
        return false;
    }

    public final List<PerformanceAttribute<String>> getAttributes() {
        return this.attributes;
    }

    public final List<PerformanceAttribute<Double>> getCounters() {
        return this.counters;
    }

    @Override // com.mapbox.maps.module.telemetry.MapBaseEvent
    public String getEventName() {
        return StubApp.getString2(14419);
    }

    public final JsonObject getMetadata() {
        return this.metadata;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        int hashCode = (getCreated().hashCode() + ((getEvent().hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31)) * 31;
        List<PerformanceAttribute<String>> list = this.attributes;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<PerformanceAttribute<Double>> list2 = this.counters;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        JsonObject jsonObject = this.metadata;
        return hashCode3 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        return StubApp.getString2(14422) + this.sessionId + StubApp.getString2(14423) + this.attributes + StubApp.getString2(14424) + this.counters + StubApp.getString2(2151) + this.metadata + '}';
    }
}
