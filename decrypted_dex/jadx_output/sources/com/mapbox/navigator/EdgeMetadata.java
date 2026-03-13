package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EdgeMetadata implements Serializable {
    private final boolean bridge;
    private final String countryCodeIso2;
    private final String countryCodeIso3;
    private final byte curvature;
    private final boolean ferry;
    private final FunctionalRoadClass frc;
    private final double heading;
    private final boolean isOneway;
    private final boolean isRightHandTraffic;
    private final boolean isUrban;
    private final Byte laneCount;
    private final double length;
    private final Double meanElevation;
    private final boolean motorway;
    private final List<RoadName> names;
    private final boolean ramp;
    private final boolean roundabout;
    private final SapaType sapaType;
    private final double speed;
    private final Double speedLimit;
    private final String stateCode;
    private final RoadSurface surface;
    private final boolean toll;
    private final boolean tunnel;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public EdgeMetadata(double d8, double d10, FunctionalRoadClass functionalRoadClass, Double d11, double d12, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List<RoadName> list, Byte b2, Double d13, byte b10, String str, String str2, String str3, boolean z16, boolean z17, RoadSurface roadSurface, boolean z18, SapaType sapaType) {
        this.heading = d8;
        this.length = d10;
        this.frc = functionalRoadClass;
        this.speedLimit = d11;
        this.speed = d12;
        this.ramp = z2;
        this.motorway = z10;
        this.bridge = z11;
        this.tunnel = z12;
        this.toll = z13;
        this.ferry = z14;
        this.roundabout = z15;
        this.names = list;
        this.laneCount = b2;
        this.meanElevation = d13;
        this.curvature = b10;
        this.countryCodeIso3 = str;
        this.countryCodeIso2 = str2;
        this.stateCode = str3;
        this.isRightHandTraffic = z16;
        this.isOneway = z17;
        this.surface = roadSurface;
        this.isUrban = z18;
        this.sapaType = sapaType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EdgeMetadata edgeMetadata = (EdgeMetadata) obj;
        return PartialEq.compare(this.heading, edgeMetadata.heading) && PartialEq.compare(this.length, edgeMetadata.length) && Objects.equals(this.frc, edgeMetadata.frc) && Objects.equals(this.speedLimit, edgeMetadata.speedLimit) && PartialEq.compare(this.speed, edgeMetadata.speed) && this.ramp == edgeMetadata.ramp && this.motorway == edgeMetadata.motorway && this.bridge == edgeMetadata.bridge && this.tunnel == edgeMetadata.tunnel && this.toll == edgeMetadata.toll && this.ferry == edgeMetadata.ferry && this.roundabout == edgeMetadata.roundabout && Objects.equals(this.names, edgeMetadata.names) && Objects.equals(this.laneCount, edgeMetadata.laneCount) && Objects.equals(this.meanElevation, edgeMetadata.meanElevation) && this.curvature == edgeMetadata.curvature && Objects.equals(this.countryCodeIso3, edgeMetadata.countryCodeIso3) && Objects.equals(this.countryCodeIso2, edgeMetadata.countryCodeIso2) && Objects.equals(this.stateCode, edgeMetadata.stateCode) && this.isRightHandTraffic == edgeMetadata.isRightHandTraffic && this.isOneway == edgeMetadata.isOneway && Objects.equals(this.surface, edgeMetadata.surface) && this.isUrban == edgeMetadata.isUrban && Objects.equals(this.sapaType, edgeMetadata.sapaType);
    }

    public boolean getBridge() {
        return this.bridge;
    }

    public String getCountryCodeIso2() {
        return this.countryCodeIso2;
    }

    public String getCountryCodeIso3() {
        return this.countryCodeIso3;
    }

    public byte getCurvature() {
        return this.curvature;
    }

    public boolean getFerry() {
        return this.ferry;
    }

    public FunctionalRoadClass getFrc() {
        return this.frc;
    }

    public double getHeading() {
        return this.heading;
    }

    public boolean getIsOneway() {
        return this.isOneway;
    }

    public boolean getIsRightHandTraffic() {
        return this.isRightHandTraffic;
    }

    public boolean getIsUrban() {
        return this.isUrban;
    }

    public Byte getLaneCount() {
        return this.laneCount;
    }

    public double getLength() {
        return this.length;
    }

    public Double getMeanElevation() {
        return this.meanElevation;
    }

    public boolean getMotorway() {
        return this.motorway;
    }

    public List<RoadName> getNames() {
        return this.names;
    }

    public boolean getRamp() {
        return this.ramp;
    }

    public boolean getRoundabout() {
        return this.roundabout;
    }

    public SapaType getSapaType() {
        return this.sapaType;
    }

    public double getSpeed() {
        return this.speed;
    }

    public Double getSpeedLimit() {
        return this.speedLimit;
    }

    public String getStateCode() {
        return this.stateCode;
    }

    public RoadSurface getSurface() {
        return this.surface;
    }

    public boolean getToll() {
        return this.toll;
    }

    public boolean getTunnel() {
        return this.tunnel;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.heading), Double.valueOf(this.length), this.frc, this.speedLimit, Double.valueOf(this.speed), Boolean.valueOf(this.ramp), Boolean.valueOf(this.motorway), Boolean.valueOf(this.bridge), Boolean.valueOf(this.tunnel), Boolean.valueOf(this.toll), Boolean.valueOf(this.ferry), Boolean.valueOf(this.roundabout), this.names, this.laneCount, this.meanElevation, Byte.valueOf(this.curvature), this.countryCodeIso3, this.countryCodeIso2, this.stateCode, Boolean.valueOf(this.isRightHandTraffic), Boolean.valueOf(this.isOneway), this.surface, Boolean.valueOf(this.isUrban), this.sapaType);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[heading: ");
        b.m(this.heading, sb2, ", length: ");
        b.m(this.length, sb2, ", frc: ");
        sb2.append(RecordUtils.fieldToString(this.frc));
        sb2.append(", speedLimit: ");
        b.r(this.speedLimit, sb2, ", speed: ");
        b.m(this.speed, sb2, ", ramp: ");
        h.A(this.ramp, sb2, ", motorway: ");
        h.A(this.motorway, sb2, ", bridge: ");
        h.A(this.bridge, sb2, ", tunnel: ");
        h.A(this.tunnel, sb2, ", toll: ");
        h.A(this.toll, sb2, ", ferry: ");
        h.A(this.ferry, sb2, ", roundabout: ");
        h.A(this.roundabout, sb2, ", names: ");
        b.v(", laneCount: ", sb2, this.names);
        sb2.append(RecordUtils.fieldToString(this.laneCount));
        sb2.append(", meanElevation: ");
        b.r(this.meanElevation, sb2, ", curvature: ");
        sb2.append(RecordUtils.fieldToString(Byte.valueOf(this.curvature)));
        sb2.append(", countryCodeIso3: ");
        h.z(sb2, this.countryCodeIso3, ", countryCodeIso2: ");
        h.z(sb2, this.countryCodeIso2, ", stateCode: ");
        h.z(sb2, this.stateCode, ", isRightHandTraffic: ");
        h.A(this.isRightHandTraffic, sb2, ", isOneway: ");
        h.A(this.isOneway, sb2, ", surface: ");
        sb2.append(RecordUtils.fieldToString(this.surface));
        sb2.append(", isUrban: ");
        h.A(this.isUrban, sb2, ", sapaType: ");
        sb2.append(RecordUtils.fieldToString(this.sapaType));
        sb2.append("]");
        return sb2.toString();
    }

    public EdgeMetadata(double d8, double d10, FunctionalRoadClass functionalRoadClass, Double d11, double d12, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List<RoadName> list, Byte b2, Double d13, byte b10, String str, String str2, String str3, boolean z16, boolean z17, RoadSurface roadSurface, boolean z18) {
        this.heading = d8;
        this.length = d10;
        this.frc = functionalRoadClass;
        this.speedLimit = d11;
        this.speed = d12;
        this.ramp = z2;
        this.motorway = z10;
        this.bridge = z11;
        this.tunnel = z12;
        this.toll = z13;
        this.ferry = z14;
        this.roundabout = z15;
        this.names = list;
        this.laneCount = b2;
        this.meanElevation = d13;
        this.curvature = b10;
        this.countryCodeIso3 = str;
        this.countryCodeIso2 = str2;
        this.stateCode = str3;
        this.isRightHandTraffic = z16;
        this.isOneway = z17;
        this.surface = roadSurface;
        this.isUrban = z18;
        this.sapaType = SapaType.NONE;
    }
}
