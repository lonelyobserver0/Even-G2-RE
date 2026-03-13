package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PlatformEventInfo implements Serializable {
    private final ScreenCoordinate screenCoordinate;
    private final PlatformEventType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public PlatformEventInfo(PlatformEventType platformEventType, ScreenCoordinate screenCoordinate) {
        this.type = platformEventType;
        this.screenCoordinate = screenCoordinate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlatformEventInfo platformEventInfo = (PlatformEventInfo) obj;
        return Objects.equals(this.type, platformEventInfo.type) && Objects.equals(this.screenCoordinate, platformEventInfo.screenCoordinate);
    }

    public ScreenCoordinate getScreenCoordinate() {
        return this.screenCoordinate;
    }

    public PlatformEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.screenCoordinate);
    }

    public String toString() {
        return "[type: " + RecordUtils.fieldToString(this.type) + ", screenCoordinate: " + RecordUtils.fieldToString(this.screenCoordinate) + "]";
    }
}
