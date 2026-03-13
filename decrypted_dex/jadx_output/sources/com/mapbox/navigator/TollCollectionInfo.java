package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TollCollectionInfo implements Serializable {
    private final String id;
    private final String name;
    private final TollCollectionType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public TollCollectionInfo(String str, TollCollectionType tollCollectionType, String str2) {
        this.id = str;
        this.type = tollCollectionType;
        this.name = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TollCollectionInfo tollCollectionInfo = (TollCollectionInfo) obj;
        return Objects.equals(this.id, tollCollectionInfo.id) && Objects.equals(this.type, tollCollectionInfo.type) && Objects.equals(this.name, tollCollectionInfo.name);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public TollCollectionType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.type, this.name);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", name: ");
        return h.t(sb2, this.name, "]");
    }
}
