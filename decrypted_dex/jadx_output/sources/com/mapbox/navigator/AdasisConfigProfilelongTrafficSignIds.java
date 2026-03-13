package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigProfilelongTrafficSignIds implements Serializable {
    private final int tsCarriagewayNarrowsId;
    private final int tsCarriagewayNarrowsLeftId;
    private final int tsCarriagewayNarrowsRightId;
    private final int tsChildrenId;
    private final int tsCurvyRoadId;
    private final int tsCyclistsId;
    private final int tsDangerId;
    private final int tsDangerousIntersectionId;
    private final int tsDipId;
    private final int tsDirectionToTheLeftId;
    private final int tsDirectionToTheRightId;
    private final int tsDomesticAnimalsCrossingId;
    private final int tsDoubleBendLeftFirstId;
    private final int tsDoubleBendRightFirstId;
    private final int tsEndOfProhibitionOnOvertakingForGoodsVehiclesId;
    private final int tsEndOfProhibitionOnOvertakingId;
    private final int tsEndOfResidentialAreaId;
    private final int tsFallingRocksId;
    private final int tsFallingRocksLeftId;
    private final int tsFallingRocksRightId;
    private final int tsFerryTerminalId;
    private final int tsHighAccidentAreaId;
    private final int tsHumpId;
    private final int tsHumpbackBridgeBridgeId;
    private final int tsIcyRoadId;
    private final int tsIntersectionId;
    private final int tsIntersectionWithMinorRoadId;
    private final int tsIntersectionWithPriorityToTheRightId;
    private final int tsLaneMergeCenterId;
    private final int tsLaneMergeLeftId;
    private final int tsLaneMergeRightId;
    private final int tsLeftBendId;
    private final int tsNarrowBridgeId;
    private final int tsOvertakingByGoodsVehiclesProhibitedId;
    private final int tsOvertakingProhibitedId;
    private final int tsPassLeftOrRightSideId;
    private final int tsPassLeftSideId;
    private final int tsPassRightSideId;
    private final int tsPedestrianCrossingId;
    private final int tsPedestriansId;
    private final int tsPriorityForOncomingTrafficId;
    private final int tsPriorityOverOncomingTrafficId;
    private final int tsPriorityRoadId;
    private final int tsProtectiveOvertakingId;
    private final int tsRailroadCrossingId;
    private final int tsRailwayCrossingId;
    private final int tsRailwayCrossingWithGatesId;
    private final int tsRailwayCrossingWithoutGatesId;
    private final int tsResidentialAreaId;
    private final int tsRightBendId;
    private final int tsRiverBankId;
    private final int tsRiverBankLeftId;
    private final int tsRoadCamLaneBusId;
    private final int tsRoadCamLaneEmergencyId;
    private final int tsRoadCamLaneNonMotorizedId;
    private final int tsRoadCamRedLightId;
    private final int tsRoadCamSpeedCurrentSpeedId;
    private final int tsRoadCamSpeedIntervalEndId;
    private final int tsRoadCamSpeedIntervalId;
    private final int tsRoadCamSpeedIntervalStartId;
    private final int tsRoadCamSurveillanceId;
    private final int tsRoadCamViolationId;
    private final int tsRoadFloodsId;
    private final int tsRoadWorksId;
    private final int tsSchoolZoneId;
    private final int tsSideWindsId;
    private final int tsSlipperyRoadId;
    private final int tsSpeedBumpId;
    private final int tsSpeedLimitId;
    private final int tsSteepAscentId;
    private final int tsSteepDescentId;
    private final int tsSteepDropLeftId;
    private final int tsSteepDropRightId;
    private final int tsStopId;
    private final int tsTollBoothId;
    private final int tsTrafficCongestionId;
    private final int tsTrafficLightId;
    private final int tsTramwayId;
    private final int tsTunnelId;
    private final int tsTwoWayTrafficId;
    private final int tsUnevenRoadId;
    private final int tsVariableSignLightElementsId;
    private final int tsVariableSignMechanicElementsId;
    private final int tsWildAnimalsCrossingId;
    private final int tsYieldId;
    private final int tsZebraId;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigProfilelongTrafficSignIds(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, int i74, int i75, int i76, int i77, int i78, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, int i88, int i89, int i90, int i91, int i92, int i93, int i94) {
        this.tsDangerId = i3;
        this.tsPassLeftOrRightSideId = i10;
        this.tsPassLeftSideId = i11;
        this.tsPassRightSideId = i12;
        this.tsDomesticAnimalsCrossingId = i13;
        this.tsWildAnimalsCrossingId = i14;
        this.tsRoadWorksId = i15;
        this.tsResidentialAreaId = i16;
        this.tsEndOfResidentialAreaId = i17;
        this.tsRightBendId = i18;
        this.tsLeftBendId = i19;
        this.tsDoubleBendRightFirstId = i20;
        this.tsDoubleBendLeftFirstId = i21;
        this.tsCurvyRoadId = i22;
        this.tsOvertakingByGoodsVehiclesProhibitedId = i23;
        this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId = i24;
        this.tsDangerousIntersectionId = i25;
        this.tsTunnelId = i26;
        this.tsFerryTerminalId = i27;
        this.tsNarrowBridgeId = i28;
        this.tsHumpbackBridgeBridgeId = i29;
        this.tsRiverBankId = i30;
        this.tsRiverBankLeftId = i31;
        this.tsYieldId = i32;
        this.tsStopId = i33;
        this.tsPriorityRoadId = i34;
        this.tsIntersectionId = i35;
        this.tsIntersectionWithMinorRoadId = i36;
        this.tsIntersectionWithPriorityToTheRightId = i37;
        this.tsDirectionToTheRightId = i38;
        this.tsDirectionToTheLeftId = i39;
        this.tsCarriagewayNarrowsId = i40;
        this.tsCarriagewayNarrowsRightId = i41;
        this.tsCarriagewayNarrowsLeftId = i42;
        this.tsLaneMergeLeftId = i43;
        this.tsLaneMergeRightId = i44;
        this.tsLaneMergeCenterId = i45;
        this.tsOvertakingProhibitedId = i46;
        this.tsEndOfProhibitionOnOvertakingId = i47;
        this.tsProtectiveOvertakingId = i48;
        this.tsPedestriansId = i49;
        this.tsPedestrianCrossingId = i50;
        this.tsChildrenId = i51;
        this.tsSchoolZoneId = i52;
        this.tsCyclistsId = i53;
        this.tsTwoWayTrafficId = i54;
        this.tsRailwayCrossingWithGatesId = i55;
        this.tsRailwayCrossingWithoutGatesId = i56;
        this.tsRailwayCrossingId = i57;
        this.tsTramwayId = i58;
        this.tsFallingRocksId = i59;
        this.tsFallingRocksLeftId = i60;
        this.tsFallingRocksRightId = i61;
        this.tsSteepDropLeftId = i62;
        this.tsSteepDropRightId = i63;
        this.tsVariableSignMechanicElementsId = i64;
        this.tsSlipperyRoadId = i65;
        this.tsSteepAscentId = i66;
        this.tsSteepDescentId = i67;
        this.tsUnevenRoadId = i68;
        this.tsHumpId = i69;
        this.tsDipId = i70;
        this.tsRoadFloodsId = i71;
        this.tsIcyRoadId = i72;
        this.tsSideWindsId = i73;
        this.tsTrafficCongestionId = i74;
        this.tsHighAccidentAreaId = i75;
        this.tsVariableSignLightElementsId = i76;
        this.tsPriorityOverOncomingTrafficId = i77;
        this.tsPriorityForOncomingTrafficId = i78;
        this.tsSpeedLimitId = i79;
        this.tsTollBoothId = i80;
        this.tsRoadCamSpeedIntervalEndId = i81;
        this.tsRoadCamSpeedIntervalStartId = i82;
        this.tsRoadCamSpeedIntervalId = i83;
        this.tsRoadCamLaneNonMotorizedId = i84;
        this.tsRoadCamLaneEmergencyId = i85;
        this.tsRoadCamLaneBusId = i86;
        this.tsRoadCamViolationId = i87;
        this.tsRoadCamRedLightId = i88;
        this.tsRoadCamSurveillanceId = i89;
        this.tsRoadCamSpeedCurrentSpeedId = i90;
        this.tsRailroadCrossingId = i91;
        this.tsZebraId = i92;
        this.tsSpeedBumpId = i93;
        this.tsTrafficLightId = i94;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigProfilelongTrafficSignIds adasisConfigProfilelongTrafficSignIds = (AdasisConfigProfilelongTrafficSignIds) obj;
        return this.tsDangerId == adasisConfigProfilelongTrafficSignIds.tsDangerId && this.tsPassLeftOrRightSideId == adasisConfigProfilelongTrafficSignIds.tsPassLeftOrRightSideId && this.tsPassLeftSideId == adasisConfigProfilelongTrafficSignIds.tsPassLeftSideId && this.tsPassRightSideId == adasisConfigProfilelongTrafficSignIds.tsPassRightSideId && this.tsDomesticAnimalsCrossingId == adasisConfigProfilelongTrafficSignIds.tsDomesticAnimalsCrossingId && this.tsWildAnimalsCrossingId == adasisConfigProfilelongTrafficSignIds.tsWildAnimalsCrossingId && this.tsRoadWorksId == adasisConfigProfilelongTrafficSignIds.tsRoadWorksId && this.tsResidentialAreaId == adasisConfigProfilelongTrafficSignIds.tsResidentialAreaId && this.tsEndOfResidentialAreaId == adasisConfigProfilelongTrafficSignIds.tsEndOfResidentialAreaId && this.tsRightBendId == adasisConfigProfilelongTrafficSignIds.tsRightBendId && this.tsLeftBendId == adasisConfigProfilelongTrafficSignIds.tsLeftBendId && this.tsDoubleBendRightFirstId == adasisConfigProfilelongTrafficSignIds.tsDoubleBendRightFirstId && this.tsDoubleBendLeftFirstId == adasisConfigProfilelongTrafficSignIds.tsDoubleBendLeftFirstId && this.tsCurvyRoadId == adasisConfigProfilelongTrafficSignIds.tsCurvyRoadId && this.tsOvertakingByGoodsVehiclesProhibitedId == adasisConfigProfilelongTrafficSignIds.tsOvertakingByGoodsVehiclesProhibitedId && this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId == adasisConfigProfilelongTrafficSignIds.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId && this.tsDangerousIntersectionId == adasisConfigProfilelongTrafficSignIds.tsDangerousIntersectionId && this.tsTunnelId == adasisConfigProfilelongTrafficSignIds.tsTunnelId && this.tsFerryTerminalId == adasisConfigProfilelongTrafficSignIds.tsFerryTerminalId && this.tsNarrowBridgeId == adasisConfigProfilelongTrafficSignIds.tsNarrowBridgeId && this.tsHumpbackBridgeBridgeId == adasisConfigProfilelongTrafficSignIds.tsHumpbackBridgeBridgeId && this.tsRiverBankId == adasisConfigProfilelongTrafficSignIds.tsRiverBankId && this.tsRiverBankLeftId == adasisConfigProfilelongTrafficSignIds.tsRiverBankLeftId && this.tsYieldId == adasisConfigProfilelongTrafficSignIds.tsYieldId && this.tsStopId == adasisConfigProfilelongTrafficSignIds.tsStopId && this.tsPriorityRoadId == adasisConfigProfilelongTrafficSignIds.tsPriorityRoadId && this.tsIntersectionId == adasisConfigProfilelongTrafficSignIds.tsIntersectionId && this.tsIntersectionWithMinorRoadId == adasisConfigProfilelongTrafficSignIds.tsIntersectionWithMinorRoadId && this.tsIntersectionWithPriorityToTheRightId == adasisConfigProfilelongTrafficSignIds.tsIntersectionWithPriorityToTheRightId && this.tsDirectionToTheRightId == adasisConfigProfilelongTrafficSignIds.tsDirectionToTheRightId && this.tsDirectionToTheLeftId == adasisConfigProfilelongTrafficSignIds.tsDirectionToTheLeftId && this.tsCarriagewayNarrowsId == adasisConfigProfilelongTrafficSignIds.tsCarriagewayNarrowsId && this.tsCarriagewayNarrowsRightId == adasisConfigProfilelongTrafficSignIds.tsCarriagewayNarrowsRightId && this.tsCarriagewayNarrowsLeftId == adasisConfigProfilelongTrafficSignIds.tsCarriagewayNarrowsLeftId && this.tsLaneMergeLeftId == adasisConfigProfilelongTrafficSignIds.tsLaneMergeLeftId && this.tsLaneMergeRightId == adasisConfigProfilelongTrafficSignIds.tsLaneMergeRightId && this.tsLaneMergeCenterId == adasisConfigProfilelongTrafficSignIds.tsLaneMergeCenterId && this.tsOvertakingProhibitedId == adasisConfigProfilelongTrafficSignIds.tsOvertakingProhibitedId && this.tsEndOfProhibitionOnOvertakingId == adasisConfigProfilelongTrafficSignIds.tsEndOfProhibitionOnOvertakingId && this.tsProtectiveOvertakingId == adasisConfigProfilelongTrafficSignIds.tsProtectiveOvertakingId && this.tsPedestriansId == adasisConfigProfilelongTrafficSignIds.tsPedestriansId && this.tsPedestrianCrossingId == adasisConfigProfilelongTrafficSignIds.tsPedestrianCrossingId && this.tsChildrenId == adasisConfigProfilelongTrafficSignIds.tsChildrenId && this.tsSchoolZoneId == adasisConfigProfilelongTrafficSignIds.tsSchoolZoneId && this.tsCyclistsId == adasisConfigProfilelongTrafficSignIds.tsCyclistsId && this.tsTwoWayTrafficId == adasisConfigProfilelongTrafficSignIds.tsTwoWayTrafficId && this.tsRailwayCrossingWithGatesId == adasisConfigProfilelongTrafficSignIds.tsRailwayCrossingWithGatesId && this.tsRailwayCrossingWithoutGatesId == adasisConfigProfilelongTrafficSignIds.tsRailwayCrossingWithoutGatesId && this.tsRailwayCrossingId == adasisConfigProfilelongTrafficSignIds.tsRailwayCrossingId && this.tsTramwayId == adasisConfigProfilelongTrafficSignIds.tsTramwayId && this.tsFallingRocksId == adasisConfigProfilelongTrafficSignIds.tsFallingRocksId && this.tsFallingRocksLeftId == adasisConfigProfilelongTrafficSignIds.tsFallingRocksLeftId && this.tsFallingRocksRightId == adasisConfigProfilelongTrafficSignIds.tsFallingRocksRightId && this.tsSteepDropLeftId == adasisConfigProfilelongTrafficSignIds.tsSteepDropLeftId && this.tsSteepDropRightId == adasisConfigProfilelongTrafficSignIds.tsSteepDropRightId && this.tsVariableSignMechanicElementsId == adasisConfigProfilelongTrafficSignIds.tsVariableSignMechanicElementsId && this.tsSlipperyRoadId == adasisConfigProfilelongTrafficSignIds.tsSlipperyRoadId && this.tsSteepAscentId == adasisConfigProfilelongTrafficSignIds.tsSteepAscentId && this.tsSteepDescentId == adasisConfigProfilelongTrafficSignIds.tsSteepDescentId && this.tsUnevenRoadId == adasisConfigProfilelongTrafficSignIds.tsUnevenRoadId && this.tsHumpId == adasisConfigProfilelongTrafficSignIds.tsHumpId && this.tsDipId == adasisConfigProfilelongTrafficSignIds.tsDipId && this.tsRoadFloodsId == adasisConfigProfilelongTrafficSignIds.tsRoadFloodsId && this.tsIcyRoadId == adasisConfigProfilelongTrafficSignIds.tsIcyRoadId && this.tsSideWindsId == adasisConfigProfilelongTrafficSignIds.tsSideWindsId && this.tsTrafficCongestionId == adasisConfigProfilelongTrafficSignIds.tsTrafficCongestionId && this.tsHighAccidentAreaId == adasisConfigProfilelongTrafficSignIds.tsHighAccidentAreaId && this.tsVariableSignLightElementsId == adasisConfigProfilelongTrafficSignIds.tsVariableSignLightElementsId && this.tsPriorityOverOncomingTrafficId == adasisConfigProfilelongTrafficSignIds.tsPriorityOverOncomingTrafficId && this.tsPriorityForOncomingTrafficId == adasisConfigProfilelongTrafficSignIds.tsPriorityForOncomingTrafficId && this.tsSpeedLimitId == adasisConfigProfilelongTrafficSignIds.tsSpeedLimitId && this.tsTollBoothId == adasisConfigProfilelongTrafficSignIds.tsTollBoothId && this.tsRoadCamSpeedIntervalEndId == adasisConfigProfilelongTrafficSignIds.tsRoadCamSpeedIntervalEndId && this.tsRoadCamSpeedIntervalStartId == adasisConfigProfilelongTrafficSignIds.tsRoadCamSpeedIntervalStartId && this.tsRoadCamSpeedIntervalId == adasisConfigProfilelongTrafficSignIds.tsRoadCamSpeedIntervalId && this.tsRoadCamLaneNonMotorizedId == adasisConfigProfilelongTrafficSignIds.tsRoadCamLaneNonMotorizedId && this.tsRoadCamLaneEmergencyId == adasisConfigProfilelongTrafficSignIds.tsRoadCamLaneEmergencyId && this.tsRoadCamLaneBusId == adasisConfigProfilelongTrafficSignIds.tsRoadCamLaneBusId && this.tsRoadCamViolationId == adasisConfigProfilelongTrafficSignIds.tsRoadCamViolationId && this.tsRoadCamRedLightId == adasisConfigProfilelongTrafficSignIds.tsRoadCamRedLightId && this.tsRoadCamSurveillanceId == adasisConfigProfilelongTrafficSignIds.tsRoadCamSurveillanceId && this.tsRoadCamSpeedCurrentSpeedId == adasisConfigProfilelongTrafficSignIds.tsRoadCamSpeedCurrentSpeedId && this.tsRailroadCrossingId == adasisConfigProfilelongTrafficSignIds.tsRailroadCrossingId && this.tsZebraId == adasisConfigProfilelongTrafficSignIds.tsZebraId && this.tsSpeedBumpId == adasisConfigProfilelongTrafficSignIds.tsSpeedBumpId && this.tsTrafficLightId == adasisConfigProfilelongTrafficSignIds.tsTrafficLightId;
    }

    public int getTsCarriagewayNarrowsId() {
        return this.tsCarriagewayNarrowsId;
    }

    public int getTsCarriagewayNarrowsLeftId() {
        return this.tsCarriagewayNarrowsLeftId;
    }

    public int getTsCarriagewayNarrowsRightId() {
        return this.tsCarriagewayNarrowsRightId;
    }

    public int getTsChildrenId() {
        return this.tsChildrenId;
    }

    public int getTsCurvyRoadId() {
        return this.tsCurvyRoadId;
    }

    public int getTsCyclistsId() {
        return this.tsCyclistsId;
    }

    public int getTsDangerId() {
        return this.tsDangerId;
    }

    public int getTsDangerousIntersectionId() {
        return this.tsDangerousIntersectionId;
    }

    public int getTsDipId() {
        return this.tsDipId;
    }

    public int getTsDirectionToTheLeftId() {
        return this.tsDirectionToTheLeftId;
    }

    public int getTsDirectionToTheRightId() {
        return this.tsDirectionToTheRightId;
    }

    public int getTsDomesticAnimalsCrossingId() {
        return this.tsDomesticAnimalsCrossingId;
    }

    public int getTsDoubleBendLeftFirstId() {
        return this.tsDoubleBendLeftFirstId;
    }

    public int getTsDoubleBendRightFirstId() {
        return this.tsDoubleBendRightFirstId;
    }

    public int getTsEndOfProhibitionOnOvertakingForGoodsVehiclesId() {
        return this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId;
    }

    public int getTsEndOfProhibitionOnOvertakingId() {
        return this.tsEndOfProhibitionOnOvertakingId;
    }

    public int getTsEndOfResidentialAreaId() {
        return this.tsEndOfResidentialAreaId;
    }

    public int getTsFallingRocksId() {
        return this.tsFallingRocksId;
    }

    public int getTsFallingRocksLeftId() {
        return this.tsFallingRocksLeftId;
    }

    public int getTsFallingRocksRightId() {
        return this.tsFallingRocksRightId;
    }

    public int getTsFerryTerminalId() {
        return this.tsFerryTerminalId;
    }

    public int getTsHighAccidentAreaId() {
        return this.tsHighAccidentAreaId;
    }

    public int getTsHumpId() {
        return this.tsHumpId;
    }

    public int getTsHumpbackBridgeBridgeId() {
        return this.tsHumpbackBridgeBridgeId;
    }

    public int getTsIcyRoadId() {
        return this.tsIcyRoadId;
    }

    public int getTsIntersectionId() {
        return this.tsIntersectionId;
    }

    public int getTsIntersectionWithMinorRoadId() {
        return this.tsIntersectionWithMinorRoadId;
    }

    public int getTsIntersectionWithPriorityToTheRightId() {
        return this.tsIntersectionWithPriorityToTheRightId;
    }

    public int getTsLaneMergeCenterId() {
        return this.tsLaneMergeCenterId;
    }

    public int getTsLaneMergeLeftId() {
        return this.tsLaneMergeLeftId;
    }

    public int getTsLaneMergeRightId() {
        return this.tsLaneMergeRightId;
    }

    public int getTsLeftBendId() {
        return this.tsLeftBendId;
    }

    public int getTsNarrowBridgeId() {
        return this.tsNarrowBridgeId;
    }

    public int getTsOvertakingByGoodsVehiclesProhibitedId() {
        return this.tsOvertakingByGoodsVehiclesProhibitedId;
    }

    public int getTsOvertakingProhibitedId() {
        return this.tsOvertakingProhibitedId;
    }

    public int getTsPassLeftOrRightSideId() {
        return this.tsPassLeftOrRightSideId;
    }

    public int getTsPassLeftSideId() {
        return this.tsPassLeftSideId;
    }

    public int getTsPassRightSideId() {
        return this.tsPassRightSideId;
    }

    public int getTsPedestrianCrossingId() {
        return this.tsPedestrianCrossingId;
    }

    public int getTsPedestriansId() {
        return this.tsPedestriansId;
    }

    public int getTsPriorityForOncomingTrafficId() {
        return this.tsPriorityForOncomingTrafficId;
    }

    public int getTsPriorityOverOncomingTrafficId() {
        return this.tsPriorityOverOncomingTrafficId;
    }

    public int getTsPriorityRoadId() {
        return this.tsPriorityRoadId;
    }

    public int getTsProtectiveOvertakingId() {
        return this.tsProtectiveOvertakingId;
    }

    public int getTsRailroadCrossingId() {
        return this.tsRailroadCrossingId;
    }

    public int getTsRailwayCrossingId() {
        return this.tsRailwayCrossingId;
    }

    public int getTsRailwayCrossingWithGatesId() {
        return this.tsRailwayCrossingWithGatesId;
    }

    public int getTsRailwayCrossingWithoutGatesId() {
        return this.tsRailwayCrossingWithoutGatesId;
    }

    public int getTsResidentialAreaId() {
        return this.tsResidentialAreaId;
    }

    public int getTsRightBendId() {
        return this.tsRightBendId;
    }

    public int getTsRiverBankId() {
        return this.tsRiverBankId;
    }

    public int getTsRiverBankLeftId() {
        return this.tsRiverBankLeftId;
    }

    public int getTsRoadCamLaneBusId() {
        return this.tsRoadCamLaneBusId;
    }

    public int getTsRoadCamLaneEmergencyId() {
        return this.tsRoadCamLaneEmergencyId;
    }

    public int getTsRoadCamLaneNonMotorizedId() {
        return this.tsRoadCamLaneNonMotorizedId;
    }

    public int getTsRoadCamRedLightId() {
        return this.tsRoadCamRedLightId;
    }

    public int getTsRoadCamSpeedCurrentSpeedId() {
        return this.tsRoadCamSpeedCurrentSpeedId;
    }

    public int getTsRoadCamSpeedIntervalEndId() {
        return this.tsRoadCamSpeedIntervalEndId;
    }

    public int getTsRoadCamSpeedIntervalId() {
        return this.tsRoadCamSpeedIntervalId;
    }

    public int getTsRoadCamSpeedIntervalStartId() {
        return this.tsRoadCamSpeedIntervalStartId;
    }

    public int getTsRoadCamSurveillanceId() {
        return this.tsRoadCamSurveillanceId;
    }

    public int getTsRoadCamViolationId() {
        return this.tsRoadCamViolationId;
    }

    public int getTsRoadFloodsId() {
        return this.tsRoadFloodsId;
    }

    public int getTsRoadWorksId() {
        return this.tsRoadWorksId;
    }

    public int getTsSchoolZoneId() {
        return this.tsSchoolZoneId;
    }

    public int getTsSideWindsId() {
        return this.tsSideWindsId;
    }

    public int getTsSlipperyRoadId() {
        return this.tsSlipperyRoadId;
    }

    public int getTsSpeedBumpId() {
        return this.tsSpeedBumpId;
    }

    public int getTsSpeedLimitId() {
        return this.tsSpeedLimitId;
    }

    public int getTsSteepAscentId() {
        return this.tsSteepAscentId;
    }

    public int getTsSteepDescentId() {
        return this.tsSteepDescentId;
    }

    public int getTsSteepDropLeftId() {
        return this.tsSteepDropLeftId;
    }

    public int getTsSteepDropRightId() {
        return this.tsSteepDropRightId;
    }

    public int getTsStopId() {
        return this.tsStopId;
    }

    public int getTsTollBoothId() {
        return this.tsTollBoothId;
    }

    public int getTsTrafficCongestionId() {
        return this.tsTrafficCongestionId;
    }

    public int getTsTrafficLightId() {
        return this.tsTrafficLightId;
    }

    public int getTsTramwayId() {
        return this.tsTramwayId;
    }

    public int getTsTunnelId() {
        return this.tsTunnelId;
    }

    public int getTsTwoWayTrafficId() {
        return this.tsTwoWayTrafficId;
    }

    public int getTsUnevenRoadId() {
        return this.tsUnevenRoadId;
    }

    public int getTsVariableSignLightElementsId() {
        return this.tsVariableSignLightElementsId;
    }

    public int getTsVariableSignMechanicElementsId() {
        return this.tsVariableSignMechanicElementsId;
    }

    public int getTsWildAnimalsCrossingId() {
        return this.tsWildAnimalsCrossingId;
    }

    public int getTsYieldId() {
        return this.tsYieldId;
    }

    public int getTsZebraId() {
        return this.tsZebraId;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.tsDangerId), Integer.valueOf(this.tsPassLeftOrRightSideId), Integer.valueOf(this.tsPassLeftSideId), Integer.valueOf(this.tsPassRightSideId), Integer.valueOf(this.tsDomesticAnimalsCrossingId), Integer.valueOf(this.tsWildAnimalsCrossingId), Integer.valueOf(this.tsRoadWorksId), Integer.valueOf(this.tsResidentialAreaId), Integer.valueOf(this.tsEndOfResidentialAreaId), Integer.valueOf(this.tsRightBendId), Integer.valueOf(this.tsLeftBendId), Integer.valueOf(this.tsDoubleBendRightFirstId), Integer.valueOf(this.tsDoubleBendLeftFirstId), Integer.valueOf(this.tsCurvyRoadId), Integer.valueOf(this.tsOvertakingByGoodsVehiclesProhibitedId), Integer.valueOf(this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId), Integer.valueOf(this.tsDangerousIntersectionId), Integer.valueOf(this.tsTunnelId), Integer.valueOf(this.tsFerryTerminalId), Integer.valueOf(this.tsNarrowBridgeId), Integer.valueOf(this.tsHumpbackBridgeBridgeId), Integer.valueOf(this.tsRiverBankId), Integer.valueOf(this.tsRiverBankLeftId), Integer.valueOf(this.tsYieldId), Integer.valueOf(this.tsStopId), Integer.valueOf(this.tsPriorityRoadId), Integer.valueOf(this.tsIntersectionId), Integer.valueOf(this.tsIntersectionWithMinorRoadId), Integer.valueOf(this.tsIntersectionWithPriorityToTheRightId), Integer.valueOf(this.tsDirectionToTheRightId), Integer.valueOf(this.tsDirectionToTheLeftId), Integer.valueOf(this.tsCarriagewayNarrowsId), Integer.valueOf(this.tsCarriagewayNarrowsRightId), Integer.valueOf(this.tsCarriagewayNarrowsLeftId), Integer.valueOf(this.tsLaneMergeLeftId), Integer.valueOf(this.tsLaneMergeRightId), Integer.valueOf(this.tsLaneMergeCenterId), Integer.valueOf(this.tsOvertakingProhibitedId), Integer.valueOf(this.tsEndOfProhibitionOnOvertakingId), Integer.valueOf(this.tsProtectiveOvertakingId), Integer.valueOf(this.tsPedestriansId), Integer.valueOf(this.tsPedestrianCrossingId), Integer.valueOf(this.tsChildrenId), Integer.valueOf(this.tsSchoolZoneId), Integer.valueOf(this.tsCyclistsId), Integer.valueOf(this.tsTwoWayTrafficId), Integer.valueOf(this.tsRailwayCrossingWithGatesId), Integer.valueOf(this.tsRailwayCrossingWithoutGatesId), Integer.valueOf(this.tsRailwayCrossingId), Integer.valueOf(this.tsTramwayId), Integer.valueOf(this.tsFallingRocksId), Integer.valueOf(this.tsFallingRocksLeftId), Integer.valueOf(this.tsFallingRocksRightId), Integer.valueOf(this.tsSteepDropLeftId), Integer.valueOf(this.tsSteepDropRightId), Integer.valueOf(this.tsVariableSignMechanicElementsId), Integer.valueOf(this.tsSlipperyRoadId), Integer.valueOf(this.tsSteepAscentId), Integer.valueOf(this.tsSteepDescentId), Integer.valueOf(this.tsUnevenRoadId), Integer.valueOf(this.tsHumpId), Integer.valueOf(this.tsDipId), Integer.valueOf(this.tsRoadFloodsId), Integer.valueOf(this.tsIcyRoadId), Integer.valueOf(this.tsSideWindsId), Integer.valueOf(this.tsTrafficCongestionId), Integer.valueOf(this.tsHighAccidentAreaId), Integer.valueOf(this.tsVariableSignLightElementsId), Integer.valueOf(this.tsPriorityOverOncomingTrafficId), Integer.valueOf(this.tsPriorityForOncomingTrafficId), Integer.valueOf(this.tsSpeedLimitId), Integer.valueOf(this.tsTollBoothId), Integer.valueOf(this.tsRoadCamSpeedIntervalEndId), Integer.valueOf(this.tsRoadCamSpeedIntervalStartId), Integer.valueOf(this.tsRoadCamSpeedIntervalId), Integer.valueOf(this.tsRoadCamLaneNonMotorizedId), Integer.valueOf(this.tsRoadCamLaneEmergencyId), Integer.valueOf(this.tsRoadCamLaneBusId), Integer.valueOf(this.tsRoadCamViolationId), Integer.valueOf(this.tsRoadCamRedLightId), Integer.valueOf(this.tsRoadCamSurveillanceId), Integer.valueOf(this.tsRoadCamSpeedCurrentSpeedId), Integer.valueOf(this.tsRailroadCrossingId), Integer.valueOf(this.tsZebraId), Integer.valueOf(this.tsSpeedBumpId), Integer.valueOf(this.tsTrafficLightId));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[tsDangerId: ");
        b.o(this.tsDangerId, ", tsPassLeftOrRightSideId: ", sb2);
        b.o(this.tsPassLeftOrRightSideId, ", tsPassLeftSideId: ", sb2);
        b.o(this.tsPassLeftSideId, ", tsPassRightSideId: ", sb2);
        b.o(this.tsPassRightSideId, ", tsDomesticAnimalsCrossingId: ", sb2);
        b.o(this.tsDomesticAnimalsCrossingId, ", tsWildAnimalsCrossingId: ", sb2);
        b.o(this.tsWildAnimalsCrossingId, ", tsRoadWorksId: ", sb2);
        b.o(this.tsRoadWorksId, ", tsResidentialAreaId: ", sb2);
        b.o(this.tsResidentialAreaId, ", tsEndOfResidentialAreaId: ", sb2);
        b.o(this.tsEndOfResidentialAreaId, ", tsRightBendId: ", sb2);
        b.o(this.tsRightBendId, ", tsLeftBendId: ", sb2);
        b.o(this.tsLeftBendId, ", tsDoubleBendRightFirstId: ", sb2);
        b.o(this.tsDoubleBendRightFirstId, ", tsDoubleBendLeftFirstId: ", sb2);
        b.o(this.tsDoubleBendLeftFirstId, ", tsCurvyRoadId: ", sb2);
        b.o(this.tsCurvyRoadId, ", tsOvertakingByGoodsVehiclesProhibitedId: ", sb2);
        b.o(this.tsOvertakingByGoodsVehiclesProhibitedId, ", tsEndOfProhibitionOnOvertakingForGoodsVehiclesId: ", sb2);
        b.o(this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId, ", tsDangerousIntersectionId: ", sb2);
        b.o(this.tsDangerousIntersectionId, ", tsTunnelId: ", sb2);
        b.o(this.tsTunnelId, ", tsFerryTerminalId: ", sb2);
        b.o(this.tsFerryTerminalId, ", tsNarrowBridgeId: ", sb2);
        b.o(this.tsNarrowBridgeId, ", tsHumpbackBridgeBridgeId: ", sb2);
        b.o(this.tsHumpbackBridgeBridgeId, ", tsRiverBankId: ", sb2);
        b.o(this.tsRiverBankId, ", tsRiverBankLeftId: ", sb2);
        b.o(this.tsRiverBankLeftId, ", tsYieldId: ", sb2);
        b.o(this.tsYieldId, ", tsStopId: ", sb2);
        b.o(this.tsStopId, ", tsPriorityRoadId: ", sb2);
        b.o(this.tsPriorityRoadId, ", tsIntersectionId: ", sb2);
        b.o(this.tsIntersectionId, ", tsIntersectionWithMinorRoadId: ", sb2);
        b.o(this.tsIntersectionWithMinorRoadId, ", tsIntersectionWithPriorityToTheRightId: ", sb2);
        b.o(this.tsIntersectionWithPriorityToTheRightId, ", tsDirectionToTheRightId: ", sb2);
        b.o(this.tsDirectionToTheRightId, ", tsDirectionToTheLeftId: ", sb2);
        b.o(this.tsDirectionToTheLeftId, ", tsCarriagewayNarrowsId: ", sb2);
        b.o(this.tsCarriagewayNarrowsId, ", tsCarriagewayNarrowsRightId: ", sb2);
        b.o(this.tsCarriagewayNarrowsRightId, ", tsCarriagewayNarrowsLeftId: ", sb2);
        b.o(this.tsCarriagewayNarrowsLeftId, ", tsLaneMergeLeftId: ", sb2);
        b.o(this.tsLaneMergeLeftId, ", tsLaneMergeRightId: ", sb2);
        b.o(this.tsLaneMergeRightId, ", tsLaneMergeCenterId: ", sb2);
        b.o(this.tsLaneMergeCenterId, ", tsOvertakingProhibitedId: ", sb2);
        b.o(this.tsOvertakingProhibitedId, ", tsEndOfProhibitionOnOvertakingId: ", sb2);
        b.o(this.tsEndOfProhibitionOnOvertakingId, ", tsProtectiveOvertakingId: ", sb2);
        b.o(this.tsProtectiveOvertakingId, ", tsPedestriansId: ", sb2);
        b.o(this.tsPedestriansId, ", tsPedestrianCrossingId: ", sb2);
        b.o(this.tsPedestrianCrossingId, ", tsChildrenId: ", sb2);
        b.o(this.tsChildrenId, ", tsSchoolZoneId: ", sb2);
        b.o(this.tsSchoolZoneId, ", tsCyclistsId: ", sb2);
        b.o(this.tsCyclistsId, ", tsTwoWayTrafficId: ", sb2);
        b.o(this.tsTwoWayTrafficId, ", tsRailwayCrossingWithGatesId: ", sb2);
        b.o(this.tsRailwayCrossingWithGatesId, ", tsRailwayCrossingWithoutGatesId: ", sb2);
        b.o(this.tsRailwayCrossingWithoutGatesId, ", tsRailwayCrossingId: ", sb2);
        b.o(this.tsRailwayCrossingId, ", tsTramwayId: ", sb2);
        b.o(this.tsTramwayId, ", tsFallingRocksId: ", sb2);
        b.o(this.tsFallingRocksId, ", tsFallingRocksLeftId: ", sb2);
        b.o(this.tsFallingRocksLeftId, ", tsFallingRocksRightId: ", sb2);
        b.o(this.tsFallingRocksRightId, ", tsSteepDropLeftId: ", sb2);
        b.o(this.tsSteepDropLeftId, ", tsSteepDropRightId: ", sb2);
        b.o(this.tsSteepDropRightId, ", tsVariableSignMechanicElementsId: ", sb2);
        b.o(this.tsVariableSignMechanicElementsId, ", tsSlipperyRoadId: ", sb2);
        b.o(this.tsSlipperyRoadId, ", tsSteepAscentId: ", sb2);
        b.o(this.tsSteepAscentId, ", tsSteepDescentId: ", sb2);
        b.o(this.tsSteepDescentId, ", tsUnevenRoadId: ", sb2);
        b.o(this.tsUnevenRoadId, ", tsHumpId: ", sb2);
        b.o(this.tsHumpId, ", tsDipId: ", sb2);
        b.o(this.tsDipId, ", tsRoadFloodsId: ", sb2);
        b.o(this.tsRoadFloodsId, ", tsIcyRoadId: ", sb2);
        b.o(this.tsIcyRoadId, ", tsSideWindsId: ", sb2);
        b.o(this.tsSideWindsId, ", tsTrafficCongestionId: ", sb2);
        b.o(this.tsTrafficCongestionId, ", tsHighAccidentAreaId: ", sb2);
        b.o(this.tsHighAccidentAreaId, ", tsVariableSignLightElementsId: ", sb2);
        b.o(this.tsVariableSignLightElementsId, ", tsPriorityOverOncomingTrafficId: ", sb2);
        b.o(this.tsPriorityOverOncomingTrafficId, ", tsPriorityForOncomingTrafficId: ", sb2);
        b.o(this.tsPriorityForOncomingTrafficId, ", tsSpeedLimitId: ", sb2);
        b.o(this.tsSpeedLimitId, ", tsTollBoothId: ", sb2);
        b.o(this.tsTollBoothId, ", tsRoadCamSpeedIntervalEndId: ", sb2);
        b.o(this.tsRoadCamSpeedIntervalEndId, ", tsRoadCamSpeedIntervalStartId: ", sb2);
        b.o(this.tsRoadCamSpeedIntervalStartId, ", tsRoadCamSpeedIntervalId: ", sb2);
        b.o(this.tsRoadCamSpeedIntervalId, ", tsRoadCamLaneNonMotorizedId: ", sb2);
        b.o(this.tsRoadCamLaneNonMotorizedId, ", tsRoadCamLaneEmergencyId: ", sb2);
        b.o(this.tsRoadCamLaneEmergencyId, ", tsRoadCamLaneBusId: ", sb2);
        b.o(this.tsRoadCamLaneBusId, ", tsRoadCamViolationId: ", sb2);
        b.o(this.tsRoadCamViolationId, ", tsRoadCamRedLightId: ", sb2);
        b.o(this.tsRoadCamRedLightId, ", tsRoadCamSurveillanceId: ", sb2);
        b.o(this.tsRoadCamSurveillanceId, ", tsRoadCamSpeedCurrentSpeedId: ", sb2);
        b.o(this.tsRoadCamSpeedCurrentSpeedId, ", tsRailroadCrossingId: ", sb2);
        b.o(this.tsRailroadCrossingId, ", tsZebraId: ", sb2);
        b.o(this.tsZebraId, ", tsSpeedBumpId: ", sb2);
        b.o(this.tsSpeedBumpId, ", tsTrafficLightId: ", sb2);
        return b.g(this.tsTrafficLightId, "]", sb2);
    }

    public AdasisConfigProfilelongTrafficSignIds() {
        this.tsDangerId = 0;
        this.tsPassLeftOrRightSideId = 1;
        this.tsPassLeftSideId = 2;
        this.tsPassRightSideId = 3;
        this.tsDomesticAnimalsCrossingId = 4;
        this.tsWildAnimalsCrossingId = 5;
        this.tsRoadWorksId = 6;
        this.tsResidentialAreaId = 7;
        this.tsEndOfResidentialAreaId = 8;
        this.tsRightBendId = 9;
        this.tsLeftBendId = 10;
        this.tsDoubleBendRightFirstId = 13;
        this.tsDoubleBendLeftFirstId = 14;
        this.tsCurvyRoadId = 17;
        this.tsOvertakingByGoodsVehiclesProhibitedId = 20;
        this.tsEndOfProhibitionOnOvertakingForGoodsVehiclesId = 21;
        this.tsDangerousIntersectionId = 22;
        this.tsTunnelId = 24;
        this.tsFerryTerminalId = 25;
        this.tsNarrowBridgeId = 26;
        this.tsHumpbackBridgeBridgeId = 28;
        this.tsRiverBankId = 29;
        this.tsRiverBankLeftId = 30;
        this.tsYieldId = 32;
        this.tsStopId = 33;
        this.tsPriorityRoadId = 34;
        this.tsIntersectionId = 35;
        this.tsIntersectionWithMinorRoadId = 36;
        this.tsIntersectionWithPriorityToTheRightId = 37;
        this.tsDirectionToTheRightId = 38;
        this.tsDirectionToTheLeftId = 39;
        this.tsCarriagewayNarrowsId = 40;
        this.tsCarriagewayNarrowsRightId = 41;
        this.tsCarriagewayNarrowsLeftId = 42;
        this.tsLaneMergeLeftId = 43;
        this.tsLaneMergeRightId = 44;
        this.tsLaneMergeCenterId = 45;
        this.tsOvertakingProhibitedId = 46;
        this.tsEndOfProhibitionOnOvertakingId = 47;
        this.tsProtectiveOvertakingId = 49;
        this.tsPedestriansId = 50;
        this.tsPedestrianCrossingId = 51;
        this.tsChildrenId = 52;
        this.tsSchoolZoneId = 53;
        this.tsCyclistsId = 54;
        this.tsTwoWayTrafficId = 55;
        this.tsRailwayCrossingWithGatesId = 56;
        this.tsRailwayCrossingWithoutGatesId = 57;
        this.tsRailwayCrossingId = 58;
        this.tsTramwayId = 59;
        this.tsFallingRocksId = 60;
        this.tsFallingRocksLeftId = 61;
        this.tsFallingRocksRightId = 62;
        this.tsSteepDropLeftId = 63;
        this.tsSteepDropRightId = 64;
        this.tsVariableSignMechanicElementsId = 65;
        this.tsSlipperyRoadId = 66;
        this.tsSteepAscentId = 67;
        this.tsSteepDescentId = 68;
        this.tsUnevenRoadId = 69;
        this.tsHumpId = 70;
        this.tsDipId = 71;
        this.tsRoadFloodsId = 72;
        this.tsIcyRoadId = 73;
        this.tsSideWindsId = 74;
        this.tsTrafficCongestionId = 75;
        this.tsHighAccidentAreaId = 76;
        this.tsVariableSignLightElementsId = 80;
        this.tsPriorityOverOncomingTrafficId = 81;
        this.tsPriorityForOncomingTrafficId = 82;
        this.tsSpeedLimitId = 87;
        this.tsTollBoothId = 90;
        this.tsRoadCamSpeedIntervalEndId = 237;
        this.tsRoadCamSpeedIntervalStartId = 238;
        this.tsRoadCamSpeedIntervalId = 239;
        this.tsRoadCamLaneNonMotorizedId = 240;
        this.tsRoadCamLaneEmergencyId = 241;
        this.tsRoadCamLaneBusId = 242;
        this.tsRoadCamViolationId = 243;
        this.tsRoadCamRedLightId = 244;
        this.tsRoadCamSurveillanceId = 249;
        this.tsRoadCamSpeedCurrentSpeedId = 250;
        this.tsRailroadCrossingId = 251;
        this.tsZebraId = 252;
        this.tsSpeedBumpId = 253;
        this.tsTrafficLightId = 254;
    }
}
