package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DetectedObjectsData implements Serializable {
    private final List<DetectedObject> detectedObjects;
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public DetectedObjectsData(List<DetectedObject> list, Date date) {
        this.detectedObjects = list;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectedObjectsData detectedObjectsData = (DetectedObjectsData) obj;
        return Objects.equals(this.detectedObjects, detectedObjectsData.detectedObjects) && Objects.equals(this.timestamp, detectedObjectsData.timestamp);
    }

    public List<DetectedObject> getDetectedObjects() {
        return this.detectedObjects;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.detectedObjects, this.timestamp);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[detectedObjects: ");
        b.v(", timestamp: ", sb2, this.detectedObjects);
        sb2.append(RecordUtils.fieldToString(this.timestamp));
        sb2.append("]");
        return sb2.toString();
    }
}
