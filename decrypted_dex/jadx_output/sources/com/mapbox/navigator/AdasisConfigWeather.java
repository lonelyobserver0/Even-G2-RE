package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigWeather implements Serializable {
    private final byte profileType;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigWeather(byte b2) {
        this.profileType = b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.profileType == ((AdasisConfigWeather) obj).profileType;
    }

    public byte getProfileType() {
        return this.profileType;
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.profileType));
    }

    public String toString() {
        return "[profileType: " + RecordUtils.fieldToString(Byte.valueOf(this.profileType)) + "]";
    }

    public AdasisConfigWeather() {
        this.profileType = (byte) 20;
    }
}
