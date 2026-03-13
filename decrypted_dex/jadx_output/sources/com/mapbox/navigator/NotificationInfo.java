package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class NotificationInfo implements Serializable {
    private final NotificationDetails details;
    private final Integer geometryIndexEnd;
    private final Integer geometryIndexStart;
    private final String id;
    private final String subType;
    private final String type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public NotificationInfo(String str, String str2, String str3, Integer num, Integer num2, NotificationDetails notificationDetails) {
        this.id = str;
        this.type = str2;
        this.subType = str3;
        this.geometryIndexStart = num;
        this.geometryIndexEnd = num2;
        this.details = notificationDetails;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotificationInfo notificationInfo = (NotificationInfo) obj;
        return Objects.equals(this.id, notificationInfo.id) && Objects.equals(this.type, notificationInfo.type) && Objects.equals(this.subType, notificationInfo.subType) && Objects.equals(this.geometryIndexStart, notificationInfo.geometryIndexStart) && Objects.equals(this.geometryIndexEnd, notificationInfo.geometryIndexEnd) && Objects.equals(this.details, notificationInfo.details);
    }

    public NotificationDetails getDetails() {
        return this.details;
    }

    public Integer getGeometryIndexEnd() {
        return this.geometryIndexEnd;
    }

    public Integer getGeometryIndexStart() {
        return this.geometryIndexStart;
    }

    public String getId() {
        return this.id;
    }

    public String getSubType() {
        return this.subType;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.type, this.subType, this.geometryIndexStart, this.geometryIndexEnd, this.details);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", type: ");
        h.z(sb2, this.type, ", subType: ");
        h.z(sb2, this.subType, ", geometryIndexStart: ");
        b.t(this.geometryIndexStart, sb2, ", geometryIndexEnd: ");
        b.t(this.geometryIndexEnd, sb2, ", details: ");
        sb2.append(RecordUtils.fieldToString(this.details));
        sb2.append("]");
        return sb2.toString();
    }
}
