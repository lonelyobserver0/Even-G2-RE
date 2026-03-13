package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigProfilelongTrafficSigns implements Serializable {
    private final byte customConditionForTrailer;
    private final byte profileType;
    private final AdasisConfigProfilelongTrafficSignIds trafficSignIds;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigProfilelongTrafficSigns(byte b2, AdasisConfigProfilelongTrafficSignIds adasisConfigProfilelongTrafficSignIds, byte b10) {
        this.profileType = b2;
        this.trafficSignIds = adasisConfigProfilelongTrafficSignIds;
        this.customConditionForTrailer = b10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigProfilelongTrafficSigns adasisConfigProfilelongTrafficSigns = (AdasisConfigProfilelongTrafficSigns) obj;
        return this.profileType == adasisConfigProfilelongTrafficSigns.profileType && Objects.equals(this.trafficSignIds, adasisConfigProfilelongTrafficSigns.trafficSignIds) && this.customConditionForTrailer == adasisConfigProfilelongTrafficSigns.customConditionForTrailer;
    }

    public byte getCustomConditionForTrailer() {
        return this.customConditionForTrailer;
    }

    public byte getProfileType() {
        return this.profileType;
    }

    public AdasisConfigProfilelongTrafficSignIds getTrafficSignIds() {
        return this.trafficSignIds;
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.profileType), this.trafficSignIds, Byte.valueOf(this.customConditionForTrailer));
    }

    public String toString() {
        return "[profileType: " + RecordUtils.fieldToString(Byte.valueOf(this.profileType)) + ", trafficSignIds: " + RecordUtils.fieldToString(this.trafficSignIds) + ", customConditionForTrailer: " + RecordUtils.fieldToString(Byte.valueOf(this.customConditionForTrailer)) + "]";
    }

    public AdasisConfigProfilelongTrafficSigns(AdasisConfigProfilelongTrafficSignIds adasisConfigProfilelongTrafficSignIds) {
        this.trafficSignIds = adasisConfigProfilelongTrafficSignIds;
        this.profileType = (byte) 8;
        this.customConditionForTrailer = (byte) 14;
    }
}
