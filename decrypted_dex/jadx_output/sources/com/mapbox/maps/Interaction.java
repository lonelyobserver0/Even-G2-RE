package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class Interaction implements Serializable {
    private final FeaturesetDescriptor featureset;
    private final Value filter;
    private final InteractionHandler handler;
    private final Double radius;
    private final InteractionType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Interaction(FeaturesetDescriptor featuresetDescriptor, Value value, InteractionType interactionType, InteractionHandler interactionHandler, Double d8) {
        this.featureset = featuresetDescriptor;
        this.filter = value;
        this.type = interactionType;
        this.handler = interactionHandler;
        this.radius = d8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Interaction interaction = (Interaction) obj;
        return Objects.equals(this.featureset, interaction.featureset) && Objects.equals(this.filter, interaction.filter) && Objects.equals(this.type, interaction.type) && Objects.equals(this.handler, interaction.handler) && Objects.equals(this.radius, interaction.radius);
    }

    public FeaturesetDescriptor getFeatureset() {
        return this.featureset;
    }

    public Value getFilter() {
        return this.filter;
    }

    public InteractionHandler getHandler() {
        return this.handler;
    }

    public Double getRadius() {
        return this.radius;
    }

    public InteractionType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.featureset, this.filter, this.type, this.handler, this.radius);
    }

    public String toString() {
        return "[featureset: " + RecordUtils.fieldToString(this.featureset) + ", filter: " + RecordUtils.fieldToString(this.filter) + ", type: " + RecordUtils.fieldToString(this.type) + ", handler: " + RecordUtils.fieldToString(this.handler) + ", radius: " + RecordUtils.fieldToString(this.radius) + "]";
    }
}
