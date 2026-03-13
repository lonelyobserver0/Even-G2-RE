package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadItem implements Serializable {
    private final List<Byte> lanes;
    private final RoadItemLocation location;
    private final RoadItemType type;
    private final Integer value;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadItem(RoadItemType roadItemType, RoadItemLocation roadItemLocation, List<Byte> list, Integer num) {
        this.type = roadItemType;
        this.location = roadItemLocation;
        this.lanes = list;
        this.value = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadItem roadItem = (RoadItem) obj;
        return Objects.equals(this.type, roadItem.type) && Objects.equals(this.location, roadItem.location) && Objects.equals(this.lanes, roadItem.lanes) && Objects.equals(this.value, roadItem.value);
    }

    public List<Byte> getLanes() {
        return this.lanes;
    }

    public RoadItemLocation getLocation() {
        return this.location;
    }

    public RoadItemType getType() {
        return this.type;
    }

    public Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.location, this.lanes, this.value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", location: ");
        sb2.append(RecordUtils.fieldToString(this.location));
        sb2.append(", lanes: ");
        b.v(", value: ", sb2, this.lanes);
        sb2.append(RecordUtils.fieldToString(this.value));
        sb2.append("]");
        return sb2.toString();
    }
}
