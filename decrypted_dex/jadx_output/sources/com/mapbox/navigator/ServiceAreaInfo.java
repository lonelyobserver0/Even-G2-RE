package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ServiceAreaInfo implements Serializable {
    private final List<Amenity> amenities;
    private final String guideMapUri;
    private final String id;
    private final String name;
    private final ServiceAreaType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ServiceAreaInfo(String str, ServiceAreaType serviceAreaType, String str2, List<Amenity> list, String str3) {
        this.id = str;
        this.type = serviceAreaType;
        this.name = str2;
        this.amenities = list;
        this.guideMapUri = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceAreaInfo serviceAreaInfo = (ServiceAreaInfo) obj;
        return Objects.equals(this.id, serviceAreaInfo.id) && Objects.equals(this.type, serviceAreaInfo.type) && Objects.equals(this.name, serviceAreaInfo.name) && Objects.equals(this.amenities, serviceAreaInfo.amenities) && Objects.equals(this.guideMapUri, serviceAreaInfo.guideMapUri);
    }

    public List<Amenity> getAmenities() {
        return this.amenities;
    }

    public String getGuideMapUri() {
        return this.guideMapUri;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ServiceAreaType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.type, this.name, this.amenities, this.guideMapUri);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", name: ");
        h.z(sb2, this.name, ", amenities: ");
        b.v(", guideMapUri: ", sb2, this.amenities);
        return h.t(sb2, this.guideMapUri, "]");
    }
}
