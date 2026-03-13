package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Amenity implements Serializable {
    private final String brand;
    private final String name;
    private final AmenityType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Amenity(AmenityType amenityType, String str, String str2) {
        this.type = amenityType;
        this.name = str;
        this.brand = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Amenity amenity = (Amenity) obj;
        return Objects.equals(this.type, amenity.type) && Objects.equals(this.name, amenity.name) && Objects.equals(this.brand, amenity.brand);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getName() {
        return this.name;
    }

    public AmenityType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.name, this.brand);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", name: ");
        h.z(sb2, this.name, ", brand: ");
        return h.t(sb2, this.brand, "]");
    }
}
