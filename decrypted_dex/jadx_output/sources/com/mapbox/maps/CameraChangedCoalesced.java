package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CameraChangedCoalesced implements Serializable {
    private final CameraState cameraState;
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CameraChangedCoalesced(CameraState cameraState, Date date) {
        this.cameraState = cameraState;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraChangedCoalesced.class != obj.getClass()) {
            return false;
        }
        CameraChangedCoalesced cameraChangedCoalesced = (CameraChangedCoalesced) obj;
        return Objects.equals(this.cameraState, cameraChangedCoalesced.cameraState) && Objects.equals(this.timestamp, cameraChangedCoalesced.timestamp);
    }

    public CameraState getCameraState() {
        return this.cameraState;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.cameraState, this.timestamp);
    }

    public String toString() {
        return "[cameraState: " + RecordUtils.fieldToString(this.cameraState) + ", timestamp: " + RecordUtils.fieldToString(this.timestamp) + "]";
    }
}
