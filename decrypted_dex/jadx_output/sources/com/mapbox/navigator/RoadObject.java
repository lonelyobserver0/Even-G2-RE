package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadObject implements Serializable {
    private final String id;
    private final Boolean isUrban;
    private final Double length;
    private final MatchedRoadObjectLocation location;
    private final RoadObjectMetadata metadata;
    private final RoadObjectProvider provider;
    private final RoadObjectType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadObject(String str, Double d8, MatchedRoadObjectLocation matchedRoadObjectLocation, RoadObjectType roadObjectType, RoadObjectProvider roadObjectProvider, RoadObjectMetadata roadObjectMetadata, Boolean bool) {
        this.id = str;
        this.length = d8;
        this.location = matchedRoadObjectLocation;
        this.type = roadObjectType;
        this.provider = roadObjectProvider;
        this.metadata = roadObjectMetadata;
        this.isUrban = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadObject roadObject = (RoadObject) obj;
        return Objects.equals(this.id, roadObject.id) && Objects.equals(this.length, roadObject.length) && Objects.equals(this.location, roadObject.location) && Objects.equals(this.type, roadObject.type) && Objects.equals(this.provider, roadObject.provider) && Objects.equals(this.metadata, roadObject.metadata) && Objects.equals(this.isUrban, roadObject.isUrban);
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsUrban() {
        return this.isUrban;
    }

    public Double getLength() {
        return this.length;
    }

    public MatchedRoadObjectLocation getLocation() {
        return this.location;
    }

    public RoadObjectMetadata getMetadata() {
        return this.metadata;
    }

    public RoadObjectProvider getProvider() {
        return this.provider;
    }

    public RoadObjectType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.length, this.location, this.type, this.provider, this.metadata, this.isUrban);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", length: ");
        b.r(this.length, sb2, ", location: ");
        sb2.append(RecordUtils.fieldToString(this.location));
        sb2.append(", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", provider: ");
        sb2.append(RecordUtils.fieldToString(this.provider));
        sb2.append(", metadata: ");
        sb2.append(RecordUtils.fieldToString(this.metadata));
        sb2.append(", isUrban: ");
        sb2.append(RecordUtils.fieldToString(this.isUrban));
        sb2.append("]");
        return sb2.toString();
    }
}
