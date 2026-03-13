package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RawGnssSatelliteData implements Serializable {
    private final Float azimuthDegrees;
    private final Double basebandCn0DbHz;
    private final Float carrierFrequencyHz;
    private final Double cn0DbHz;
    private final ConstellationType constellationType;
    private final Float elevationDegrees;
    private final Boolean hasAlmanacData;
    private final Boolean hasEphemerisData;
    private final Double residual;
    private final int svid;
    private final Boolean usedInFix;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RawGnssSatelliteData(int i3, Float f10, Double d8, Double d10, Boolean bool, Boolean bool2, Boolean bool3, ConstellationType constellationType, Float f11, Float f12, Double d11) {
        this.svid = i3;
        this.carrierFrequencyHz = f10;
        this.basebandCn0DbHz = d8;
        this.cn0DbHz = d10;
        this.usedInFix = bool;
        this.hasEphemerisData = bool2;
        this.hasAlmanacData = bool3;
        this.constellationType = constellationType;
        this.azimuthDegrees = f11;
        this.elevationDegrees = f12;
        this.residual = d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RawGnssSatelliteData rawGnssSatelliteData = (RawGnssSatelliteData) obj;
        return this.svid == rawGnssSatelliteData.svid && Objects.equals(this.carrierFrequencyHz, rawGnssSatelliteData.carrierFrequencyHz) && Objects.equals(this.basebandCn0DbHz, rawGnssSatelliteData.basebandCn0DbHz) && Objects.equals(this.cn0DbHz, rawGnssSatelliteData.cn0DbHz) && Objects.equals(this.usedInFix, rawGnssSatelliteData.usedInFix) && Objects.equals(this.hasEphemerisData, rawGnssSatelliteData.hasEphemerisData) && Objects.equals(this.hasAlmanacData, rawGnssSatelliteData.hasAlmanacData) && Objects.equals(this.constellationType, rawGnssSatelliteData.constellationType) && Objects.equals(this.azimuthDegrees, rawGnssSatelliteData.azimuthDegrees) && Objects.equals(this.elevationDegrees, rawGnssSatelliteData.elevationDegrees) && Objects.equals(this.residual, rawGnssSatelliteData.residual);
    }

    public Float getAzimuthDegrees() {
        return this.azimuthDegrees;
    }

    public Double getBasebandCn0DbHz() {
        return this.basebandCn0DbHz;
    }

    public Float getCarrierFrequencyHz() {
        return this.carrierFrequencyHz;
    }

    public Double getCn0DbHz() {
        return this.cn0DbHz;
    }

    public ConstellationType getConstellationType() {
        return this.constellationType;
    }

    public Float getElevationDegrees() {
        return this.elevationDegrees;
    }

    public Boolean getHasAlmanacData() {
        return this.hasAlmanacData;
    }

    public Boolean getHasEphemerisData() {
        return this.hasEphemerisData;
    }

    public Double getResidual() {
        return this.residual;
    }

    public int getSvid() {
        return this.svid;
    }

    public Boolean getUsedInFix() {
        return this.usedInFix;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.svid), this.carrierFrequencyHz, this.basebandCn0DbHz, this.cn0DbHz, this.usedInFix, this.hasEphemerisData, this.hasAlmanacData, this.constellationType, this.azimuthDegrees, this.elevationDegrees, this.residual);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[svid: ");
        b.o(this.svid, ", carrierFrequencyHz: ", sb2);
        b.s(this.carrierFrequencyHz, sb2, ", basebandCn0DbHz: ");
        b.r(this.basebandCn0DbHz, sb2, ", cn0DbHz: ");
        b.r(this.cn0DbHz, sb2, ", usedInFix: ");
        b.w(sb2, ", hasEphemerisData: ", this.usedInFix);
        b.w(sb2, ", hasAlmanacData: ", this.hasEphemerisData);
        b.w(sb2, ", constellationType: ", this.hasAlmanacData);
        sb2.append(RecordUtils.fieldToString(this.constellationType));
        sb2.append(", azimuthDegrees: ");
        b.s(this.azimuthDegrees, sb2, ", elevationDegrees: ");
        b.s(this.elevationDegrees, sb2, ", residual: ");
        sb2.append(RecordUtils.fieldToString(this.residual));
        sb2.append("]");
        return sb2.toString();
    }
}
