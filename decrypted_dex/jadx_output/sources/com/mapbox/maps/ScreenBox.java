package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ScreenBox implements Serializable {
    private final ScreenCoordinate max;
    private final ScreenCoordinate min;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ScreenBox(ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2) {
        this.min = screenCoordinate;
        this.max = screenCoordinate2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScreenBox.class != obj.getClass()) {
            return false;
        }
        ScreenBox screenBox = (ScreenBox) obj;
        return Objects.equals(this.min, screenBox.min) && Objects.equals(this.max, screenBox.max);
    }

    public ScreenCoordinate getMax() {
        return this.max;
    }

    public ScreenCoordinate getMin() {
        return this.min;
    }

    public int hashCode() {
        return Objects.hash(this.min, this.max);
    }

    public String toString() {
        return "[min: " + RecordUtils.fieldToString(this.min) + ", max: " + RecordUtils.fieldToString(this.max) + "]";
    }
}
