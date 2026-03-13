package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Event implements Serializable {
    private final Value attributes;
    private final DeferredDeliveryRequestOptions deferredOptions;
    private EventPriority priority;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Event(EventPriority eventPriority, Value value, DeferredDeliveryRequestOptions deferredDeliveryRequestOptions) {
        this.priority = eventPriority;
        this.attributes = value;
        this.deferredOptions = deferredDeliveryRequestOptions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event event = (Event) obj;
        return Objects.equals(this.priority, event.priority) && Objects.equals(this.attributes, event.attributes) && Objects.equals(this.deferredOptions, event.deferredOptions);
    }

    public Value getAttributes() {
        return this.attributes;
    }

    public DeferredDeliveryRequestOptions getDeferredOptions() {
        return this.deferredOptions;
    }

    public EventPriority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return Objects.hash(this.priority, this.attributes, this.deferredOptions);
    }

    public void setPriority(EventPriority eventPriority) {
        this.priority = eventPriority;
    }

    public String toString() {
        return "[priority: " + RecordUtils.fieldToString(this.priority) + ", attributes: " + RecordUtils.fieldToString(this.attributes) + ", deferredOptions: " + RecordUtils.fieldToString(this.deferredOptions) + "]";
    }

    public Event(Value value, DeferredDeliveryRequestOptions deferredDeliveryRequestOptions) {
        this.attributes = value;
        this.deferredOptions = deferredDeliveryRequestOptions;
        this.priority = EventPriority.QUEUED;
    }
}
