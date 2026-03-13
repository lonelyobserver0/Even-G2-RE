package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigProfilelongTrafficEventIds implements Serializable {
    private final int teAccidentBreakdownCarId;
    private final int teAccidentGeneralTrafficAccidentId;
    private final int teAccidentSeriousTrafficAccidentId;
    private final int teActivitiesCtrlCulturalEventsId;
    private final int teActivitiesCtrlFairId;
    private final int teActivitiesCtrlHolidaysId;
    private final int teActivitiesCtrlLargeMeetingsId;
    private final int teActivitiesCtrlNationalEventsId;
    private final int teActivitiesCtrlRallyId;
    private final int teActivitiesCtrlSportsEventsId;
    private final int teActivityExpoId;
    private final int teActivityGatheringId;
    private final int teActivityHolidaysId;
    private final int teActivityLargeMeetingId;
    private final int teActivityLiteraryActivitiesId;
    private final int teActivityMajorNationalEventsId;
    private final int teActivitySportsActivitiesId;
    private final int teConstructionCtrlRoadWorksId;
    private final int teConstructionNotRecommendedId;
    private final int teConstructionRoadWorkId;
    private final int teControlExitRampClosedId;
    private final int teControlOnrampClosedId;
    private final int teControlRoadClosedId;
    private final int teControlTrafficControlId;
    private final int teDisasterCollapseId;
    private final int teDisasterCtrlFloodingId;
    private final int teDisasterCtrlMudslidesId;
    private final int teDisasterEarthquakeId;
    private final int teDisasterFloodId;
    private final int teDisasterMudslideId;
    private final int teDisasterRockslideId;
    private final int teFlowAmbleId;
    private final int teFlowCloggedId;
    private final int teFlowCongestionId;
    private final int teFlowNoTrafficFlowId;
    private final int teFlowSmoothId;
    private final int teFlowUnknownId;
    private final int teIncidentCtrlGeneralTrafficAccidentsId;
    private final int teIncidentCtrlSeriousTrafficAccidentId;
    private final int teOtherAnnouncementId;
    private final int teOtherCompleteRemodelId;
    private final int teOtherCustomizedBroadcastId;
    private final int teOtherEmergencyId;
    private final int teOtherOpenToTrafficId;
    private final int teOtherRealRoadConditionsId;
    private final int teOtherSubwayIncidentId;
    private final int tePavementCtrlObstaclesOnRoadId;
    private final int tePavementCtrlRoadSubsidenceId;
    private final int tePavementCtrlSevereFiresId;
    private final int tePavementCtrlSnowyRoadsId;
    private final int tePavementCtrlThinIceOnRoadId;
    private final int tePavementCtrlWaterAccumulationId;
    private final int tePavementObstaclesOnRoadId;
    private final int tePavementOilOnRoadId;
    private final int tePavementRoadFireId;
    private final int tePavementRoadSubsidenceId;
    private final int tePavementSlipperyRoadId;
    private final int tePavementSnowOnRoadId;
    private final int tePavementThinIceOnRoadId;
    private final int tePavementWaterAccumulationOnRoadId;
    private final int tePoliceCatchViolationsId;
    private final int tePoliceDrunkDrivingCheckId;
    private final int tePolicePoliceEnforcementId;
    private final int teUnknownId;
    private final int teWeatherCtrlHailId;
    private final int teWeatherCtrlHeavyFogId;
    private final int teWeatherCtrlHeavyRainId;
    private final int teWeatherCtrlHeavySnowId;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigProfilelongTrafficEventIds(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, int i74, int i75, int i76) {
        this.teUnknownId = i3;
        this.teFlowUnknownId = i10;
        this.teFlowSmoothId = i11;
        this.teFlowAmbleId = i12;
        this.teFlowCongestionId = i13;
        this.teFlowCloggedId = i14;
        this.teFlowNoTrafficFlowId = i15;
        this.teAccidentGeneralTrafficAccidentId = i16;
        this.teAccidentSeriousTrafficAccidentId = i17;
        this.teAccidentBreakdownCarId = i18;
        this.teConstructionRoadWorkId = i19;
        this.teConstructionNotRecommendedId = i20;
        this.teControlTrafficControlId = i21;
        this.teControlRoadClosedId = i22;
        this.teControlExitRampClosedId = i23;
        this.teControlOnrampClosedId = i24;
        this.tePavementWaterAccumulationOnRoadId = i25;
        this.tePavementSnowOnRoadId = i26;
        this.tePavementThinIceOnRoadId = i27;
        this.tePavementRoadSubsidenceId = i28;
        this.tePavementObstaclesOnRoadId = i29;
        this.tePavementRoadFireId = i30;
        this.tePavementSlipperyRoadId = i31;
        this.tePavementOilOnRoadId = i32;
        this.teActivityExpoId = i33;
        this.teActivityMajorNationalEventsId = i34;
        this.teActivityGatheringId = i35;
        this.teActivityLargeMeetingId = i36;
        this.teActivitySportsActivitiesId = i37;
        this.teActivityLiteraryActivitiesId = i38;
        this.teActivityHolidaysId = i39;
        this.teDisasterFloodId = i40;
        this.teDisasterEarthquakeId = i41;
        this.teDisasterRockslideId = i42;
        this.teDisasterCollapseId = i43;
        this.teDisasterMudslideId = i44;
        this.tePoliceCatchViolationsId = i45;
        this.tePoliceDrunkDrivingCheckId = i46;
        this.tePolicePoliceEnforcementId = i47;
        this.teOtherAnnouncementId = i48;
        this.teOtherOpenToTrafficId = i49;
        this.teOtherCompleteRemodelId = i50;
        this.teOtherRealRoadConditionsId = i51;
        this.teOtherEmergencyId = i52;
        this.teOtherSubwayIncidentId = i53;
        this.teOtherCustomizedBroadcastId = i54;
        this.teIncidentCtrlGeneralTrafficAccidentsId = i55;
        this.teIncidentCtrlSeriousTrafficAccidentId = i56;
        this.teConstructionCtrlRoadWorksId = i57;
        this.teWeatherCtrlHeavyFogId = i58;
        this.teWeatherCtrlHeavyRainId = i59;
        this.teWeatherCtrlHeavySnowId = i60;
        this.teWeatherCtrlHailId = i61;
        this.tePavementCtrlWaterAccumulationId = i62;
        this.tePavementCtrlSnowyRoadsId = i63;
        this.tePavementCtrlThinIceOnRoadId = i64;
        this.tePavementCtrlRoadSubsidenceId = i65;
        this.tePavementCtrlObstaclesOnRoadId = i66;
        this.tePavementCtrlSevereFiresId = i67;
        this.teActivitiesCtrlFairId = i68;
        this.teActivitiesCtrlNationalEventsId = i69;
        this.teActivitiesCtrlRallyId = i70;
        this.teActivitiesCtrlLargeMeetingsId = i71;
        this.teActivitiesCtrlSportsEventsId = i72;
        this.teActivitiesCtrlCulturalEventsId = i73;
        this.teActivitiesCtrlHolidaysId = i74;
        this.teDisasterCtrlFloodingId = i75;
        this.teDisasterCtrlMudslidesId = i76;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigProfilelongTrafficEventIds adasisConfigProfilelongTrafficEventIds = (AdasisConfigProfilelongTrafficEventIds) obj;
        return this.teUnknownId == adasisConfigProfilelongTrafficEventIds.teUnknownId && this.teFlowUnknownId == adasisConfigProfilelongTrafficEventIds.teFlowUnknownId && this.teFlowSmoothId == adasisConfigProfilelongTrafficEventIds.teFlowSmoothId && this.teFlowAmbleId == adasisConfigProfilelongTrafficEventIds.teFlowAmbleId && this.teFlowCongestionId == adasisConfigProfilelongTrafficEventIds.teFlowCongestionId && this.teFlowCloggedId == adasisConfigProfilelongTrafficEventIds.teFlowCloggedId && this.teFlowNoTrafficFlowId == adasisConfigProfilelongTrafficEventIds.teFlowNoTrafficFlowId && this.teAccidentGeneralTrafficAccidentId == adasisConfigProfilelongTrafficEventIds.teAccidentGeneralTrafficAccidentId && this.teAccidentSeriousTrafficAccidentId == adasisConfigProfilelongTrafficEventIds.teAccidentSeriousTrafficAccidentId && this.teAccidentBreakdownCarId == adasisConfigProfilelongTrafficEventIds.teAccidentBreakdownCarId && this.teConstructionRoadWorkId == adasisConfigProfilelongTrafficEventIds.teConstructionRoadWorkId && this.teConstructionNotRecommendedId == adasisConfigProfilelongTrafficEventIds.teConstructionNotRecommendedId && this.teControlTrafficControlId == adasisConfigProfilelongTrafficEventIds.teControlTrafficControlId && this.teControlRoadClosedId == adasisConfigProfilelongTrafficEventIds.teControlRoadClosedId && this.teControlExitRampClosedId == adasisConfigProfilelongTrafficEventIds.teControlExitRampClosedId && this.teControlOnrampClosedId == adasisConfigProfilelongTrafficEventIds.teControlOnrampClosedId && this.tePavementWaterAccumulationOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementWaterAccumulationOnRoadId && this.tePavementSnowOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementSnowOnRoadId && this.tePavementThinIceOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementThinIceOnRoadId && this.tePavementRoadSubsidenceId == adasisConfigProfilelongTrafficEventIds.tePavementRoadSubsidenceId && this.tePavementObstaclesOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementObstaclesOnRoadId && this.tePavementRoadFireId == adasisConfigProfilelongTrafficEventIds.tePavementRoadFireId && this.tePavementSlipperyRoadId == adasisConfigProfilelongTrafficEventIds.tePavementSlipperyRoadId && this.tePavementOilOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementOilOnRoadId && this.teActivityExpoId == adasisConfigProfilelongTrafficEventIds.teActivityExpoId && this.teActivityMajorNationalEventsId == adasisConfigProfilelongTrafficEventIds.teActivityMajorNationalEventsId && this.teActivityGatheringId == adasisConfigProfilelongTrafficEventIds.teActivityGatheringId && this.teActivityLargeMeetingId == adasisConfigProfilelongTrafficEventIds.teActivityLargeMeetingId && this.teActivitySportsActivitiesId == adasisConfigProfilelongTrafficEventIds.teActivitySportsActivitiesId && this.teActivityLiteraryActivitiesId == adasisConfigProfilelongTrafficEventIds.teActivityLiteraryActivitiesId && this.teActivityHolidaysId == adasisConfigProfilelongTrafficEventIds.teActivityHolidaysId && this.teDisasterFloodId == adasisConfigProfilelongTrafficEventIds.teDisasterFloodId && this.teDisasterEarthquakeId == adasisConfigProfilelongTrafficEventIds.teDisasterEarthquakeId && this.teDisasterRockslideId == adasisConfigProfilelongTrafficEventIds.teDisasterRockslideId && this.teDisasterCollapseId == adasisConfigProfilelongTrafficEventIds.teDisasterCollapseId && this.teDisasterMudslideId == adasisConfigProfilelongTrafficEventIds.teDisasterMudslideId && this.tePoliceCatchViolationsId == adasisConfigProfilelongTrafficEventIds.tePoliceCatchViolationsId && this.tePoliceDrunkDrivingCheckId == adasisConfigProfilelongTrafficEventIds.tePoliceDrunkDrivingCheckId && this.tePolicePoliceEnforcementId == adasisConfigProfilelongTrafficEventIds.tePolicePoliceEnforcementId && this.teOtherAnnouncementId == adasisConfigProfilelongTrafficEventIds.teOtherAnnouncementId && this.teOtherOpenToTrafficId == adasisConfigProfilelongTrafficEventIds.teOtherOpenToTrafficId && this.teOtherCompleteRemodelId == adasisConfigProfilelongTrafficEventIds.teOtherCompleteRemodelId && this.teOtherRealRoadConditionsId == adasisConfigProfilelongTrafficEventIds.teOtherRealRoadConditionsId && this.teOtherEmergencyId == adasisConfigProfilelongTrafficEventIds.teOtherEmergencyId && this.teOtherSubwayIncidentId == adasisConfigProfilelongTrafficEventIds.teOtherSubwayIncidentId && this.teOtherCustomizedBroadcastId == adasisConfigProfilelongTrafficEventIds.teOtherCustomizedBroadcastId && this.teIncidentCtrlGeneralTrafficAccidentsId == adasisConfigProfilelongTrafficEventIds.teIncidentCtrlGeneralTrafficAccidentsId && this.teIncidentCtrlSeriousTrafficAccidentId == adasisConfigProfilelongTrafficEventIds.teIncidentCtrlSeriousTrafficAccidentId && this.teConstructionCtrlRoadWorksId == adasisConfigProfilelongTrafficEventIds.teConstructionCtrlRoadWorksId && this.teWeatherCtrlHeavyFogId == adasisConfigProfilelongTrafficEventIds.teWeatherCtrlHeavyFogId && this.teWeatherCtrlHeavyRainId == adasisConfigProfilelongTrafficEventIds.teWeatherCtrlHeavyRainId && this.teWeatherCtrlHeavySnowId == adasisConfigProfilelongTrafficEventIds.teWeatherCtrlHeavySnowId && this.teWeatherCtrlHailId == adasisConfigProfilelongTrafficEventIds.teWeatherCtrlHailId && this.tePavementCtrlWaterAccumulationId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlWaterAccumulationId && this.tePavementCtrlSnowyRoadsId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlSnowyRoadsId && this.tePavementCtrlThinIceOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlThinIceOnRoadId && this.tePavementCtrlRoadSubsidenceId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlRoadSubsidenceId && this.tePavementCtrlObstaclesOnRoadId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlObstaclesOnRoadId && this.tePavementCtrlSevereFiresId == adasisConfigProfilelongTrafficEventIds.tePavementCtrlSevereFiresId && this.teActivitiesCtrlFairId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlFairId && this.teActivitiesCtrlNationalEventsId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlNationalEventsId && this.teActivitiesCtrlRallyId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlRallyId && this.teActivitiesCtrlLargeMeetingsId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlLargeMeetingsId && this.teActivitiesCtrlSportsEventsId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlSportsEventsId && this.teActivitiesCtrlCulturalEventsId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlCulturalEventsId && this.teActivitiesCtrlHolidaysId == adasisConfigProfilelongTrafficEventIds.teActivitiesCtrlHolidaysId && this.teDisasterCtrlFloodingId == adasisConfigProfilelongTrafficEventIds.teDisasterCtrlFloodingId && this.teDisasterCtrlMudslidesId == adasisConfigProfilelongTrafficEventIds.teDisasterCtrlMudslidesId;
    }

    public int getTeAccidentBreakdownCarId() {
        return this.teAccidentBreakdownCarId;
    }

    public int getTeAccidentGeneralTrafficAccidentId() {
        return this.teAccidentGeneralTrafficAccidentId;
    }

    public int getTeAccidentSeriousTrafficAccidentId() {
        return this.teAccidentSeriousTrafficAccidentId;
    }

    public int getTeActivitiesCtrlCulturalEventsId() {
        return this.teActivitiesCtrlCulturalEventsId;
    }

    public int getTeActivitiesCtrlFairId() {
        return this.teActivitiesCtrlFairId;
    }

    public int getTeActivitiesCtrlHolidaysId() {
        return this.teActivitiesCtrlHolidaysId;
    }

    public int getTeActivitiesCtrlLargeMeetingsId() {
        return this.teActivitiesCtrlLargeMeetingsId;
    }

    public int getTeActivitiesCtrlNationalEventsId() {
        return this.teActivitiesCtrlNationalEventsId;
    }

    public int getTeActivitiesCtrlRallyId() {
        return this.teActivitiesCtrlRallyId;
    }

    public int getTeActivitiesCtrlSportsEventsId() {
        return this.teActivitiesCtrlSportsEventsId;
    }

    public int getTeActivityExpoId() {
        return this.teActivityExpoId;
    }

    public int getTeActivityGatheringId() {
        return this.teActivityGatheringId;
    }

    public int getTeActivityHolidaysId() {
        return this.teActivityHolidaysId;
    }

    public int getTeActivityLargeMeetingId() {
        return this.teActivityLargeMeetingId;
    }

    public int getTeActivityLiteraryActivitiesId() {
        return this.teActivityLiteraryActivitiesId;
    }

    public int getTeActivityMajorNationalEventsId() {
        return this.teActivityMajorNationalEventsId;
    }

    public int getTeActivitySportsActivitiesId() {
        return this.teActivitySportsActivitiesId;
    }

    public int getTeConstructionCtrlRoadWorksId() {
        return this.teConstructionCtrlRoadWorksId;
    }

    public int getTeConstructionNotRecommendedId() {
        return this.teConstructionNotRecommendedId;
    }

    public int getTeConstructionRoadWorkId() {
        return this.teConstructionRoadWorkId;
    }

    public int getTeControlExitRampClosedId() {
        return this.teControlExitRampClosedId;
    }

    public int getTeControlOnrampClosedId() {
        return this.teControlOnrampClosedId;
    }

    public int getTeControlRoadClosedId() {
        return this.teControlRoadClosedId;
    }

    public int getTeControlTrafficControlId() {
        return this.teControlTrafficControlId;
    }

    public int getTeDisasterCollapseId() {
        return this.teDisasterCollapseId;
    }

    public int getTeDisasterCtrlFloodingId() {
        return this.teDisasterCtrlFloodingId;
    }

    public int getTeDisasterCtrlMudslidesId() {
        return this.teDisasterCtrlMudslidesId;
    }

    public int getTeDisasterEarthquakeId() {
        return this.teDisasterEarthquakeId;
    }

    public int getTeDisasterFloodId() {
        return this.teDisasterFloodId;
    }

    public int getTeDisasterMudslideId() {
        return this.teDisasterMudslideId;
    }

    public int getTeDisasterRockslideId() {
        return this.teDisasterRockslideId;
    }

    public int getTeFlowAmbleId() {
        return this.teFlowAmbleId;
    }

    public int getTeFlowCloggedId() {
        return this.teFlowCloggedId;
    }

    public int getTeFlowCongestionId() {
        return this.teFlowCongestionId;
    }

    public int getTeFlowNoTrafficFlowId() {
        return this.teFlowNoTrafficFlowId;
    }

    public int getTeFlowSmoothId() {
        return this.teFlowSmoothId;
    }

    public int getTeFlowUnknownId() {
        return this.teFlowUnknownId;
    }

    public int getTeIncidentCtrlGeneralTrafficAccidentsId() {
        return this.teIncidentCtrlGeneralTrafficAccidentsId;
    }

    public int getTeIncidentCtrlSeriousTrafficAccidentId() {
        return this.teIncidentCtrlSeriousTrafficAccidentId;
    }

    public int getTeOtherAnnouncementId() {
        return this.teOtherAnnouncementId;
    }

    public int getTeOtherCompleteRemodelId() {
        return this.teOtherCompleteRemodelId;
    }

    public int getTeOtherCustomizedBroadcastId() {
        return this.teOtherCustomizedBroadcastId;
    }

    public int getTeOtherEmergencyId() {
        return this.teOtherEmergencyId;
    }

    public int getTeOtherOpenToTrafficId() {
        return this.teOtherOpenToTrafficId;
    }

    public int getTeOtherRealRoadConditionsId() {
        return this.teOtherRealRoadConditionsId;
    }

    public int getTeOtherSubwayIncidentId() {
        return this.teOtherSubwayIncidentId;
    }

    public int getTePavementCtrlObstaclesOnRoadId() {
        return this.tePavementCtrlObstaclesOnRoadId;
    }

    public int getTePavementCtrlRoadSubsidenceId() {
        return this.tePavementCtrlRoadSubsidenceId;
    }

    public int getTePavementCtrlSevereFiresId() {
        return this.tePavementCtrlSevereFiresId;
    }

    public int getTePavementCtrlSnowyRoadsId() {
        return this.tePavementCtrlSnowyRoadsId;
    }

    public int getTePavementCtrlThinIceOnRoadId() {
        return this.tePavementCtrlThinIceOnRoadId;
    }

    public int getTePavementCtrlWaterAccumulationId() {
        return this.tePavementCtrlWaterAccumulationId;
    }

    public int getTePavementObstaclesOnRoadId() {
        return this.tePavementObstaclesOnRoadId;
    }

    public int getTePavementOilOnRoadId() {
        return this.tePavementOilOnRoadId;
    }

    public int getTePavementRoadFireId() {
        return this.tePavementRoadFireId;
    }

    public int getTePavementRoadSubsidenceId() {
        return this.tePavementRoadSubsidenceId;
    }

    public int getTePavementSlipperyRoadId() {
        return this.tePavementSlipperyRoadId;
    }

    public int getTePavementSnowOnRoadId() {
        return this.tePavementSnowOnRoadId;
    }

    public int getTePavementThinIceOnRoadId() {
        return this.tePavementThinIceOnRoadId;
    }

    public int getTePavementWaterAccumulationOnRoadId() {
        return this.tePavementWaterAccumulationOnRoadId;
    }

    public int getTePoliceCatchViolationsId() {
        return this.tePoliceCatchViolationsId;
    }

    public int getTePoliceDrunkDrivingCheckId() {
        return this.tePoliceDrunkDrivingCheckId;
    }

    public int getTePolicePoliceEnforcementId() {
        return this.tePolicePoliceEnforcementId;
    }

    public int getTeUnknownId() {
        return this.teUnknownId;
    }

    public int getTeWeatherCtrlHailId() {
        return this.teWeatherCtrlHailId;
    }

    public int getTeWeatherCtrlHeavyFogId() {
        return this.teWeatherCtrlHeavyFogId;
    }

    public int getTeWeatherCtrlHeavyRainId() {
        return this.teWeatherCtrlHeavyRainId;
    }

    public int getTeWeatherCtrlHeavySnowId() {
        return this.teWeatherCtrlHeavySnowId;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.teUnknownId), Integer.valueOf(this.teFlowUnknownId), Integer.valueOf(this.teFlowSmoothId), Integer.valueOf(this.teFlowAmbleId), Integer.valueOf(this.teFlowCongestionId), Integer.valueOf(this.teFlowCloggedId), Integer.valueOf(this.teFlowNoTrafficFlowId), Integer.valueOf(this.teAccidentGeneralTrafficAccidentId), Integer.valueOf(this.teAccidentSeriousTrafficAccidentId), Integer.valueOf(this.teAccidentBreakdownCarId), Integer.valueOf(this.teConstructionRoadWorkId), Integer.valueOf(this.teConstructionNotRecommendedId), Integer.valueOf(this.teControlTrafficControlId), Integer.valueOf(this.teControlRoadClosedId), Integer.valueOf(this.teControlExitRampClosedId), Integer.valueOf(this.teControlOnrampClosedId), Integer.valueOf(this.tePavementWaterAccumulationOnRoadId), Integer.valueOf(this.tePavementSnowOnRoadId), Integer.valueOf(this.tePavementThinIceOnRoadId), Integer.valueOf(this.tePavementRoadSubsidenceId), Integer.valueOf(this.tePavementObstaclesOnRoadId), Integer.valueOf(this.tePavementRoadFireId), Integer.valueOf(this.tePavementSlipperyRoadId), Integer.valueOf(this.tePavementOilOnRoadId), Integer.valueOf(this.teActivityExpoId), Integer.valueOf(this.teActivityMajorNationalEventsId), Integer.valueOf(this.teActivityGatheringId), Integer.valueOf(this.teActivityLargeMeetingId), Integer.valueOf(this.teActivitySportsActivitiesId), Integer.valueOf(this.teActivityLiteraryActivitiesId), Integer.valueOf(this.teActivityHolidaysId), Integer.valueOf(this.teDisasterFloodId), Integer.valueOf(this.teDisasterEarthquakeId), Integer.valueOf(this.teDisasterRockslideId), Integer.valueOf(this.teDisasterCollapseId), Integer.valueOf(this.teDisasterMudslideId), Integer.valueOf(this.tePoliceCatchViolationsId), Integer.valueOf(this.tePoliceDrunkDrivingCheckId), Integer.valueOf(this.tePolicePoliceEnforcementId), Integer.valueOf(this.teOtherAnnouncementId), Integer.valueOf(this.teOtherOpenToTrafficId), Integer.valueOf(this.teOtherCompleteRemodelId), Integer.valueOf(this.teOtherRealRoadConditionsId), Integer.valueOf(this.teOtherEmergencyId), Integer.valueOf(this.teOtherSubwayIncidentId), Integer.valueOf(this.teOtherCustomizedBroadcastId), Integer.valueOf(this.teIncidentCtrlGeneralTrafficAccidentsId), Integer.valueOf(this.teIncidentCtrlSeriousTrafficAccidentId), Integer.valueOf(this.teConstructionCtrlRoadWorksId), Integer.valueOf(this.teWeatherCtrlHeavyFogId), Integer.valueOf(this.teWeatherCtrlHeavyRainId), Integer.valueOf(this.teWeatherCtrlHeavySnowId), Integer.valueOf(this.teWeatherCtrlHailId), Integer.valueOf(this.tePavementCtrlWaterAccumulationId), Integer.valueOf(this.tePavementCtrlSnowyRoadsId), Integer.valueOf(this.tePavementCtrlThinIceOnRoadId), Integer.valueOf(this.tePavementCtrlRoadSubsidenceId), Integer.valueOf(this.tePavementCtrlObstaclesOnRoadId), Integer.valueOf(this.tePavementCtrlSevereFiresId), Integer.valueOf(this.teActivitiesCtrlFairId), Integer.valueOf(this.teActivitiesCtrlNationalEventsId), Integer.valueOf(this.teActivitiesCtrlRallyId), Integer.valueOf(this.teActivitiesCtrlLargeMeetingsId), Integer.valueOf(this.teActivitiesCtrlSportsEventsId), Integer.valueOf(this.teActivitiesCtrlCulturalEventsId), Integer.valueOf(this.teActivitiesCtrlHolidaysId), Integer.valueOf(this.teDisasterCtrlFloodingId), Integer.valueOf(this.teDisasterCtrlMudslidesId));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[teUnknownId: ");
        b.o(this.teUnknownId, ", teFlowUnknownId: ", sb2);
        b.o(this.teFlowUnknownId, ", teFlowSmoothId: ", sb2);
        b.o(this.teFlowSmoothId, ", teFlowAmbleId: ", sb2);
        b.o(this.teFlowAmbleId, ", teFlowCongestionId: ", sb2);
        b.o(this.teFlowCongestionId, ", teFlowCloggedId: ", sb2);
        b.o(this.teFlowCloggedId, ", teFlowNoTrafficFlowId: ", sb2);
        b.o(this.teFlowNoTrafficFlowId, ", teAccidentGeneralTrafficAccidentId: ", sb2);
        b.o(this.teAccidentGeneralTrafficAccidentId, ", teAccidentSeriousTrafficAccidentId: ", sb2);
        b.o(this.teAccidentSeriousTrafficAccidentId, ", teAccidentBreakdownCarId: ", sb2);
        b.o(this.teAccidentBreakdownCarId, ", teConstructionRoadWorkId: ", sb2);
        b.o(this.teConstructionRoadWorkId, ", teConstructionNotRecommendedId: ", sb2);
        b.o(this.teConstructionNotRecommendedId, ", teControlTrafficControlId: ", sb2);
        b.o(this.teControlTrafficControlId, ", teControlRoadClosedId: ", sb2);
        b.o(this.teControlRoadClosedId, ", teControlExitRampClosedId: ", sb2);
        b.o(this.teControlExitRampClosedId, ", teControlOnrampClosedId: ", sb2);
        b.o(this.teControlOnrampClosedId, ", tePavementWaterAccumulationOnRoadId: ", sb2);
        b.o(this.tePavementWaterAccumulationOnRoadId, ", tePavementSnowOnRoadId: ", sb2);
        b.o(this.tePavementSnowOnRoadId, ", tePavementThinIceOnRoadId: ", sb2);
        b.o(this.tePavementThinIceOnRoadId, ", tePavementRoadSubsidenceId: ", sb2);
        b.o(this.tePavementRoadSubsidenceId, ", tePavementObstaclesOnRoadId: ", sb2);
        b.o(this.tePavementObstaclesOnRoadId, ", tePavementRoadFireId: ", sb2);
        b.o(this.tePavementRoadFireId, ", tePavementSlipperyRoadId: ", sb2);
        b.o(this.tePavementSlipperyRoadId, ", tePavementOilOnRoadId: ", sb2);
        b.o(this.tePavementOilOnRoadId, ", teActivityExpoId: ", sb2);
        b.o(this.teActivityExpoId, ", teActivityMajorNationalEventsId: ", sb2);
        b.o(this.teActivityMajorNationalEventsId, ", teActivityGatheringId: ", sb2);
        b.o(this.teActivityGatheringId, ", teActivityLargeMeetingId: ", sb2);
        b.o(this.teActivityLargeMeetingId, ", teActivitySportsActivitiesId: ", sb2);
        b.o(this.teActivitySportsActivitiesId, ", teActivityLiteraryActivitiesId: ", sb2);
        b.o(this.teActivityLiteraryActivitiesId, ", teActivityHolidaysId: ", sb2);
        b.o(this.teActivityHolidaysId, ", teDisasterFloodId: ", sb2);
        b.o(this.teDisasterFloodId, ", teDisasterEarthquakeId: ", sb2);
        b.o(this.teDisasterEarthquakeId, ", teDisasterRockslideId: ", sb2);
        b.o(this.teDisasterRockslideId, ", teDisasterCollapseId: ", sb2);
        b.o(this.teDisasterCollapseId, ", teDisasterMudslideId: ", sb2);
        b.o(this.teDisasterMudslideId, ", tePoliceCatchViolationsId: ", sb2);
        b.o(this.tePoliceCatchViolationsId, ", tePoliceDrunkDrivingCheckId: ", sb2);
        b.o(this.tePoliceDrunkDrivingCheckId, ", tePolicePoliceEnforcementId: ", sb2);
        b.o(this.tePolicePoliceEnforcementId, ", teOtherAnnouncementId: ", sb2);
        b.o(this.teOtherAnnouncementId, ", teOtherOpenToTrafficId: ", sb2);
        b.o(this.teOtherOpenToTrafficId, ", teOtherCompleteRemodelId: ", sb2);
        b.o(this.teOtherCompleteRemodelId, ", teOtherRealRoadConditionsId: ", sb2);
        b.o(this.teOtherRealRoadConditionsId, ", teOtherEmergencyId: ", sb2);
        b.o(this.teOtherEmergencyId, ", teOtherSubwayIncidentId: ", sb2);
        b.o(this.teOtherSubwayIncidentId, ", teOtherCustomizedBroadcastId: ", sb2);
        b.o(this.teOtherCustomizedBroadcastId, ", teIncidentCtrlGeneralTrafficAccidentsId: ", sb2);
        b.o(this.teIncidentCtrlGeneralTrafficAccidentsId, ", teIncidentCtrlSeriousTrafficAccidentId: ", sb2);
        b.o(this.teIncidentCtrlSeriousTrafficAccidentId, ", teConstructionCtrlRoadWorksId: ", sb2);
        b.o(this.teConstructionCtrlRoadWorksId, ", teWeatherCtrlHeavyFogId: ", sb2);
        b.o(this.teWeatherCtrlHeavyFogId, ", teWeatherCtrlHeavyRainId: ", sb2);
        b.o(this.teWeatherCtrlHeavyRainId, ", teWeatherCtrlHeavySnowId: ", sb2);
        b.o(this.teWeatherCtrlHeavySnowId, ", teWeatherCtrlHailId: ", sb2);
        b.o(this.teWeatherCtrlHailId, ", tePavementCtrlWaterAccumulationId: ", sb2);
        b.o(this.tePavementCtrlWaterAccumulationId, ", tePavementCtrlSnowyRoadsId: ", sb2);
        b.o(this.tePavementCtrlSnowyRoadsId, ", tePavementCtrlThinIceOnRoadId: ", sb2);
        b.o(this.tePavementCtrlThinIceOnRoadId, ", tePavementCtrlRoadSubsidenceId: ", sb2);
        b.o(this.tePavementCtrlRoadSubsidenceId, ", tePavementCtrlObstaclesOnRoadId: ", sb2);
        b.o(this.tePavementCtrlObstaclesOnRoadId, ", tePavementCtrlSevereFiresId: ", sb2);
        b.o(this.tePavementCtrlSevereFiresId, ", teActivitiesCtrlFairId: ", sb2);
        b.o(this.teActivitiesCtrlFairId, ", teActivitiesCtrlNationalEventsId: ", sb2);
        b.o(this.teActivitiesCtrlNationalEventsId, ", teActivitiesCtrlRallyId: ", sb2);
        b.o(this.teActivitiesCtrlRallyId, ", teActivitiesCtrlLargeMeetingsId: ", sb2);
        b.o(this.teActivitiesCtrlLargeMeetingsId, ", teActivitiesCtrlSportsEventsId: ", sb2);
        b.o(this.teActivitiesCtrlSportsEventsId, ", teActivitiesCtrlCulturalEventsId: ", sb2);
        b.o(this.teActivitiesCtrlCulturalEventsId, ", teActivitiesCtrlHolidaysId: ", sb2);
        b.o(this.teActivitiesCtrlHolidaysId, ", teDisasterCtrlFloodingId: ", sb2);
        b.o(this.teDisasterCtrlFloodingId, ", teDisasterCtrlMudslidesId: ", sb2);
        return b.g(this.teDisasterCtrlMudslidesId, "]", sb2);
    }

    public AdasisConfigProfilelongTrafficEventIds() {
        this.teUnknownId = 0;
        this.teFlowUnknownId = 1;
        this.teFlowSmoothId = 2;
        this.teFlowAmbleId = 3;
        this.teFlowCongestionId = 4;
        this.teFlowCloggedId = 5;
        this.teFlowNoTrafficFlowId = 6;
        this.teAccidentGeneralTrafficAccidentId = 7;
        this.teAccidentSeriousTrafficAccidentId = 8;
        this.teAccidentBreakdownCarId = 9;
        this.teConstructionRoadWorkId = 11;
        this.teConstructionNotRecommendedId = 13;
        this.teControlTrafficControlId = 14;
        this.teControlRoadClosedId = 15;
        this.teControlExitRampClosedId = 16;
        this.teControlOnrampClosedId = 17;
        this.tePavementWaterAccumulationOnRoadId = 56;
        this.tePavementSnowOnRoadId = 57;
        this.tePavementThinIceOnRoadId = 58;
        this.tePavementRoadSubsidenceId = 59;
        this.tePavementObstaclesOnRoadId = 60;
        this.tePavementRoadFireId = 61;
        this.tePavementSlipperyRoadId = 62;
        this.tePavementOilOnRoadId = 63;
        this.teActivityExpoId = 68;
        this.teActivityMajorNationalEventsId = 69;
        this.teActivityGatheringId = 70;
        this.teActivityLargeMeetingId = 71;
        this.teActivitySportsActivitiesId = 72;
        this.teActivityLiteraryActivitiesId = 73;
        this.teActivityHolidaysId = 74;
        this.teDisasterFloodId = 75;
        this.teDisasterEarthquakeId = 76;
        this.teDisasterRockslideId = 77;
        this.teDisasterCollapseId = 78;
        this.teDisasterMudslideId = 79;
        this.tePoliceCatchViolationsId = 80;
        this.tePoliceDrunkDrivingCheckId = 81;
        this.tePolicePoliceEnforcementId = 82;
        this.teOtherAnnouncementId = 83;
        this.teOtherOpenToTrafficId = 84;
        this.teOtherCompleteRemodelId = 85;
        this.teOtherRealRoadConditionsId = 86;
        this.teOtherEmergencyId = 87;
        this.teOtherSubwayIncidentId = 88;
        this.teOtherCustomizedBroadcastId = 89;
        this.teIncidentCtrlGeneralTrafficAccidentsId = 90;
        this.teIncidentCtrlSeriousTrafficAccidentId = 91;
        this.teConstructionCtrlRoadWorksId = 92;
        this.teWeatherCtrlHeavyFogId = 93;
        this.teWeatherCtrlHeavyRainId = 94;
        this.teWeatherCtrlHeavySnowId = 95;
        this.teWeatherCtrlHailId = 96;
        this.tePavementCtrlWaterAccumulationId = 97;
        this.tePavementCtrlSnowyRoadsId = 98;
        this.tePavementCtrlThinIceOnRoadId = 99;
        this.tePavementCtrlRoadSubsidenceId = 100;
        this.tePavementCtrlObstaclesOnRoadId = 101;
        this.tePavementCtrlSevereFiresId = 102;
        this.teActivitiesCtrlFairId = 103;
        this.teActivitiesCtrlNationalEventsId = 104;
        this.teActivitiesCtrlRallyId = 105;
        this.teActivitiesCtrlLargeMeetingsId = 106;
        this.teActivitiesCtrlSportsEventsId = 107;
        this.teActivitiesCtrlCulturalEventsId = 108;
        this.teActivitiesCtrlHolidaysId = 109;
        this.teDisasterCtrlFloodingId = 110;
        this.teDisasterCtrlMudslidesId = 114;
    }
}
