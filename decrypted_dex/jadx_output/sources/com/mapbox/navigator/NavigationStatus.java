package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class NavigationStatus implements Serializable {
    private final ActiveGuidanceInfo activeGuidanceInfo;
    private final List<RouteIndices> alternativeRouteIndices;
    private final BannerInstruction bannerInstruction;
    private final CorrectedLocationData correctedLocationData;
    private final HdMatchingResult hdMatchingResult;
    private final boolean inParkingAisle;
    private final boolean inRoundabout;
    private final boolean inTunnel;
    private final Boolean isAdasDataAvailable;
    private final boolean isFallback;
    private final boolean isSyntheticLocation;
    private final List<FixLocation> keyPoints;
    private final Integer layer;
    private final String locatedAlternativeRouteId;
    private final FixLocation location;
    private final Date mapMatchedSystemTime;
    private final MapMatcherOutput mapMatcherOutput;
    private final int nextWaypointIndex;
    private final float offRoadProba;
    private final OffRoadStateProvider offRoadStateProvider;
    private final long predicted;
    private final RouteIndices primaryRouteIndices;
    private final List<RoadName> roads;
    private final RouteState routeState;
    private final SpeedLimit speedLimit;
    private final boolean stale;
    private final List<TurnLane> turnLanes;
    private final List<UpcomingRouteAlertUpdate> upcomingRouteAlertUpdates;
    private final VoiceInstruction voiceInstruction;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public NavigationStatus(RouteState routeState, boolean z2, FixLocation fixLocation, boolean z10, boolean z11, boolean z12, boolean z13, long j, List<TurnLane> list, List<RoadName> list2, RouteIndices routeIndices, List<RouteIndices> list3, String str, VoiceInstruction voiceInstruction, BannerInstruction bannerInstruction, SpeedLimit speedLimit, List<FixLocation> list4, MapMatcherOutput mapMatcherOutput, float f10, OffRoadStateProvider offRoadStateProvider, ActiveGuidanceInfo activeGuidanceInfo, List<UpcomingRouteAlertUpdate> list5, int i3, Integer num, boolean z14, CorrectedLocationData correctedLocationData, HdMatchingResult hdMatchingResult, Date date, Boolean bool) {
        this.routeState = routeState;
        this.stale = z2;
        this.location = fixLocation;
        this.isFallback = z10;
        this.inTunnel = z11;
        this.inParkingAisle = z12;
        this.inRoundabout = z13;
        this.predicted = j;
        this.turnLanes = list;
        this.roads = list2;
        this.primaryRouteIndices = routeIndices;
        this.alternativeRouteIndices = list3;
        this.locatedAlternativeRouteId = str;
        this.voiceInstruction = voiceInstruction;
        this.bannerInstruction = bannerInstruction;
        this.speedLimit = speedLimit;
        this.keyPoints = list4;
        this.mapMatcherOutput = mapMatcherOutput;
        this.offRoadProba = f10;
        this.offRoadStateProvider = offRoadStateProvider;
        this.activeGuidanceInfo = activeGuidanceInfo;
        this.upcomingRouteAlertUpdates = list5;
        this.nextWaypointIndex = i3;
        this.layer = num;
        this.isSyntheticLocation = z14;
        this.correctedLocationData = correctedLocationData;
        this.hdMatchingResult = hdMatchingResult;
        this.mapMatchedSystemTime = date;
        this.isAdasDataAvailable = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NavigationStatus navigationStatus = (NavigationStatus) obj;
        return Objects.equals(this.routeState, navigationStatus.routeState) && this.stale == navigationStatus.stale && Objects.equals(this.location, navigationStatus.location) && this.isFallback == navigationStatus.isFallback && this.inTunnel == navigationStatus.inTunnel && this.inParkingAisle == navigationStatus.inParkingAisle && this.inRoundabout == navigationStatus.inRoundabout && this.predicted == navigationStatus.predicted && Objects.equals(this.turnLanes, navigationStatus.turnLanes) && Objects.equals(this.roads, navigationStatus.roads) && Objects.equals(this.primaryRouteIndices, navigationStatus.primaryRouteIndices) && Objects.equals(this.alternativeRouteIndices, navigationStatus.alternativeRouteIndices) && Objects.equals(this.locatedAlternativeRouteId, navigationStatus.locatedAlternativeRouteId) && Objects.equals(this.voiceInstruction, navigationStatus.voiceInstruction) && Objects.equals(this.bannerInstruction, navigationStatus.bannerInstruction) && Objects.equals(this.speedLimit, navigationStatus.speedLimit) && Objects.equals(this.keyPoints, navigationStatus.keyPoints) && Objects.equals(this.mapMatcherOutput, navigationStatus.mapMatcherOutput) && PartialEq.compare(this.offRoadProba, navigationStatus.offRoadProba) && Objects.equals(this.offRoadStateProvider, navigationStatus.offRoadStateProvider) && Objects.equals(this.activeGuidanceInfo, navigationStatus.activeGuidanceInfo) && Objects.equals(this.upcomingRouteAlertUpdates, navigationStatus.upcomingRouteAlertUpdates) && this.nextWaypointIndex == navigationStatus.nextWaypointIndex && Objects.equals(this.layer, navigationStatus.layer) && this.isSyntheticLocation == navigationStatus.isSyntheticLocation && Objects.equals(this.correctedLocationData, navigationStatus.correctedLocationData) && Objects.equals(this.hdMatchingResult, navigationStatus.hdMatchingResult) && Objects.equals(this.mapMatchedSystemTime, navigationStatus.mapMatchedSystemTime) && Objects.equals(this.isAdasDataAvailable, navigationStatus.isAdasDataAvailable);
    }

    public ActiveGuidanceInfo getActiveGuidanceInfo() {
        return this.activeGuidanceInfo;
    }

    public List<RouteIndices> getAlternativeRouteIndices() {
        return this.alternativeRouteIndices;
    }

    public BannerInstruction getBannerInstruction() {
        return this.bannerInstruction;
    }

    public CorrectedLocationData getCorrectedLocationData() {
        return this.correctedLocationData;
    }

    public HdMatchingResult getHdMatchingResult() {
        return this.hdMatchingResult;
    }

    public boolean getInParkingAisle() {
        return this.inParkingAisle;
    }

    public boolean getInRoundabout() {
        return this.inRoundabout;
    }

    public boolean getInTunnel() {
        return this.inTunnel;
    }

    public Boolean getIsAdasDataAvailable() {
        return this.isAdasDataAvailable;
    }

    public boolean getIsFallback() {
        return this.isFallback;
    }

    public boolean getIsSyntheticLocation() {
        return this.isSyntheticLocation;
    }

    public List<FixLocation> getKeyPoints() {
        return this.keyPoints;
    }

    public Integer getLayer() {
        return this.layer;
    }

    public String getLocatedAlternativeRouteId() {
        return this.locatedAlternativeRouteId;
    }

    public FixLocation getLocation() {
        return this.location;
    }

    public Date getMapMatchedSystemTime() {
        return this.mapMatchedSystemTime;
    }

    public MapMatcherOutput getMapMatcherOutput() {
        return this.mapMatcherOutput;
    }

    public int getNextWaypointIndex() {
        return this.nextWaypointIndex;
    }

    public float getOffRoadProba() {
        return this.offRoadProba;
    }

    public OffRoadStateProvider getOffRoadStateProvider() {
        return this.offRoadStateProvider;
    }

    public long getPredicted() {
        return this.predicted;
    }

    public RouteIndices getPrimaryRouteIndices() {
        return this.primaryRouteIndices;
    }

    public List<RoadName> getRoads() {
        return this.roads;
    }

    public RouteState getRouteState() {
        return this.routeState;
    }

    public SpeedLimit getSpeedLimit() {
        return this.speedLimit;
    }

    public boolean getStale() {
        return this.stale;
    }

    public List<TurnLane> getTurnLanes() {
        return this.turnLanes;
    }

    public List<UpcomingRouteAlertUpdate> getUpcomingRouteAlertUpdates() {
        return this.upcomingRouteAlertUpdates;
    }

    public VoiceInstruction getVoiceInstruction() {
        return this.voiceInstruction;
    }

    public int hashCode() {
        return Objects.hash(this.routeState, Boolean.valueOf(this.stale), this.location, Boolean.valueOf(this.isFallback), Boolean.valueOf(this.inTunnel), Boolean.valueOf(this.inParkingAisle), Boolean.valueOf(this.inRoundabout), Long.valueOf(this.predicted), this.turnLanes, this.roads, this.primaryRouteIndices, this.alternativeRouteIndices, this.locatedAlternativeRouteId, this.voiceInstruction, this.bannerInstruction, this.speedLimit, this.keyPoints, this.mapMatcherOutput, Float.valueOf(this.offRoadProba), this.offRoadStateProvider, this.activeGuidanceInfo, this.upcomingRouteAlertUpdates, Integer.valueOf(this.nextWaypointIndex), this.layer, Boolean.valueOf(this.isSyntheticLocation), this.correctedLocationData, this.hdMatchingResult, this.mapMatchedSystemTime, this.isAdasDataAvailable);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[routeState: ");
        sb2.append(RecordUtils.fieldToString(this.routeState));
        sb2.append(", stale: ");
        h.A(this.stale, sb2, ", location: ");
        sb2.append(RecordUtils.fieldToString(this.location));
        sb2.append(", isFallback: ");
        h.A(this.isFallback, sb2, ", inTunnel: ");
        h.A(this.inTunnel, sb2, ", inParkingAisle: ");
        h.A(this.inParkingAisle, sb2, ", inRoundabout: ");
        h.A(this.inRoundabout, sb2, ", predicted: ");
        b.p(this.predicted, sb2, ", turnLanes: ");
        b.v(", roads: ", sb2, this.turnLanes);
        b.v(", primaryRouteIndices: ", sb2, this.roads);
        sb2.append(RecordUtils.fieldToString(this.primaryRouteIndices));
        sb2.append(", alternativeRouteIndices: ");
        b.v(", locatedAlternativeRouteId: ", sb2, this.alternativeRouteIndices);
        h.z(sb2, this.locatedAlternativeRouteId, ", voiceInstruction: ");
        sb2.append(RecordUtils.fieldToString(this.voiceInstruction));
        sb2.append(", bannerInstruction: ");
        sb2.append(RecordUtils.fieldToString(this.bannerInstruction));
        sb2.append(", speedLimit: ");
        sb2.append(RecordUtils.fieldToString(this.speedLimit));
        sb2.append(", keyPoints: ");
        b.v(", mapMatcherOutput: ", sb2, this.keyPoints);
        sb2.append(RecordUtils.fieldToString(this.mapMatcherOutput));
        sb2.append(", offRoadProba: ");
        b.n(this.offRoadProba, sb2, ", offRoadStateProvider: ");
        sb2.append(RecordUtils.fieldToString(this.offRoadStateProvider));
        sb2.append(", activeGuidanceInfo: ");
        sb2.append(RecordUtils.fieldToString(this.activeGuidanceInfo));
        sb2.append(", upcomingRouteAlertUpdates: ");
        b.v(", nextWaypointIndex: ", sb2, this.upcomingRouteAlertUpdates);
        b.o(this.nextWaypointIndex, ", layer: ", sb2);
        b.t(this.layer, sb2, ", isSyntheticLocation: ");
        h.A(this.isSyntheticLocation, sb2, ", correctedLocationData: ");
        sb2.append(RecordUtils.fieldToString(this.correctedLocationData));
        sb2.append(", hdMatchingResult: ");
        sb2.append(RecordUtils.fieldToString(this.hdMatchingResult));
        sb2.append(", mapMatchedSystemTime: ");
        sb2.append(RecordUtils.fieldToString(this.mapMatchedSystemTime));
        sb2.append(", isAdasDataAvailable: ");
        sb2.append(RecordUtils.fieldToString(this.isAdasDataAvailable));
        sb2.append("]");
        return sb2.toString();
    }
}
