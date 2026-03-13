package com.mapbox.common.location;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ExtendedLocationProviderParameters implements Serializable {
    private final Boolean allowUserDefined;
    private final DeviceLocationProviderType deviceLocationProviderType;
    private final String locationProviderName;

    /* renamed from: com.mapbox.common.location.ExtendedLocationProviderParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Boolean allowUserDefined;
        private DeviceLocationProviderType deviceLocationProviderType;
        private String locationProviderName;

        public Builder allowUserDefined(Boolean bool) {
            this.allowUserDefined = bool;
            return this;
        }

        public ExtendedLocationProviderParameters build() {
            return new ExtendedLocationProviderParameters(this.deviceLocationProviderType, this.allowUserDefined, this.locationProviderName, null);
        }

        public Builder deviceLocationProviderType(DeviceLocationProviderType deviceLocationProviderType) {
            this.deviceLocationProviderType = deviceLocationProviderType;
            return this;
        }

        public Builder locationProviderName(String str) {
            this.locationProviderName = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public /* synthetic */ ExtendedLocationProviderParameters(DeviceLocationProviderType deviceLocationProviderType, Boolean bool, String str, AnonymousClass1 anonymousClass1) {
        this(deviceLocationProviderType, bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtendedLocationProviderParameters extendedLocationProviderParameters = (ExtendedLocationProviderParameters) obj;
        return Objects.equals(this.deviceLocationProviderType, extendedLocationProviderParameters.deviceLocationProviderType) && Objects.equals(this.allowUserDefined, extendedLocationProviderParameters.allowUserDefined) && Objects.equals(this.locationProviderName, extendedLocationProviderParameters.locationProviderName);
    }

    public Boolean getAllowUserDefined() {
        return this.allowUserDefined;
    }

    public DeviceLocationProviderType getDeviceLocationProviderType() {
        return this.deviceLocationProviderType;
    }

    public String getLocationProviderName() {
        return this.locationProviderName;
    }

    public int hashCode() {
        return Objects.hash(this.deviceLocationProviderType, this.allowUserDefined, this.locationProviderName);
    }

    public Builder toBuilder() {
        return new Builder().deviceLocationProviderType(this.deviceLocationProviderType).allowUserDefined(this.allowUserDefined).locationProviderName(this.locationProviderName);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[deviceLocationProviderType: ");
        sb2.append(RecordUtils.fieldToString(this.deviceLocationProviderType));
        sb2.append(", allowUserDefined: ");
        com.mapbox.common.b.w(sb2, ", locationProviderName: ", this.allowUserDefined);
        return h.t(sb2, this.locationProviderName, "]");
    }

    private ExtendedLocationProviderParameters(DeviceLocationProviderType deviceLocationProviderType, Boolean bool, String str) {
        this.deviceLocationProviderType = deviceLocationProviderType;
        this.allowUserDefined = bool;
        this.locationProviderName = str;
    }
}
