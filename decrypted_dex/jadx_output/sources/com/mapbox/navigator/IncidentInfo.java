package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.navigator.match.openlr.OpenLR;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class IncidentInfo implements Serializable {
    private final List<String> affectedRoadNames;
    private final List<Integer> alertcCodes;
    private final IncidentCongestion congestion;
    private final Date creationTime;
    private final String description;
    private final Date endTime;
    private final String id;
    private final IncidentImpact impact;
    private final String iso_3166_1_alpha2;
    private final String iso_3166_1_alpha3;
    private final List<String> lanesBlocked;
    private final String lanesClearDesc;
    private final Integer length;
    private final String longDescription;
    private final HashMap<String, List<String>> multiLingualAffectedRoadNames;
    private final Long numLanesBlocked;
    private final OpenLR openlr;
    private final boolean roadClosed;
    private final Date startTime;
    private final String subType;
    private final String subTypeDescription;
    private final HashMap<String, Integer> trafficCodes;
    private final IncidentType type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public IncidentInfo(String str, OpenLR openLR, IncidentType incidentType, Date date, Date date2, Date date3, Integer num, String str2, String str3, List<String> list, boolean z2, IncidentCongestion incidentCongestion, IncidentImpact incidentImpact, String str4, String str5, String str6, List<Integer> list2, HashMap<String, Integer> hashMap, String str7, String str8, Long l9, List<String> list3, HashMap<String, List<String>> hashMap2) {
        this.id = str;
        this.openlr = openLR;
        this.type = incidentType;
        this.startTime = date;
        this.endTime = date2;
        this.creationTime = date3;
        this.length = num;
        this.iso_3166_1_alpha2 = str2;
        this.iso_3166_1_alpha3 = str3;
        this.lanesBlocked = list;
        this.roadClosed = z2;
        this.congestion = incidentCongestion;
        this.impact = incidentImpact;
        this.description = str4;
        this.subType = str5;
        this.subTypeDescription = str6;
        this.alertcCodes = list2;
        this.trafficCodes = hashMap;
        this.longDescription = str7;
        this.lanesClearDesc = str8;
        this.numLanesBlocked = l9;
        this.affectedRoadNames = list3;
        this.multiLingualAffectedRoadNames = hashMap2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentInfo incidentInfo = (IncidentInfo) obj;
        return Objects.equals(this.id, incidentInfo.id) && Objects.equals(this.openlr, incidentInfo.openlr) && Objects.equals(this.type, incidentInfo.type) && Objects.equals(this.startTime, incidentInfo.startTime) && Objects.equals(this.endTime, incidentInfo.endTime) && Objects.equals(this.creationTime, incidentInfo.creationTime) && Objects.equals(this.length, incidentInfo.length) && Objects.equals(this.iso_3166_1_alpha2, incidentInfo.iso_3166_1_alpha2) && Objects.equals(this.iso_3166_1_alpha3, incidentInfo.iso_3166_1_alpha3) && Objects.equals(this.lanesBlocked, incidentInfo.lanesBlocked) && this.roadClosed == incidentInfo.roadClosed && Objects.equals(this.congestion, incidentInfo.congestion) && Objects.equals(this.impact, incidentInfo.impact) && Objects.equals(this.description, incidentInfo.description) && Objects.equals(this.subType, incidentInfo.subType) && Objects.equals(this.subTypeDescription, incidentInfo.subTypeDescription) && Objects.equals(this.alertcCodes, incidentInfo.alertcCodes) && Objects.equals(this.trafficCodes, incidentInfo.trafficCodes) && Objects.equals(this.longDescription, incidentInfo.longDescription) && Objects.equals(this.lanesClearDesc, incidentInfo.lanesClearDesc) && Objects.equals(this.numLanesBlocked, incidentInfo.numLanesBlocked) && Objects.equals(this.affectedRoadNames, incidentInfo.affectedRoadNames) && Objects.equals(this.multiLingualAffectedRoadNames, incidentInfo.multiLingualAffectedRoadNames);
    }

    public List<String> getAffectedRoadNames() {
        return this.affectedRoadNames;
    }

    public List<Integer> getAlertcCodes() {
        return this.alertcCodes;
    }

    public IncidentCongestion getCongestion() {
        return this.congestion;
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public String getId() {
        return this.id;
    }

    public IncidentImpact getImpact() {
        return this.impact;
    }

    public String getIso_3166_1_alpha2() {
        return this.iso_3166_1_alpha2;
    }

    public String getIso_3166_1_alpha3() {
        return this.iso_3166_1_alpha3;
    }

    public List<String> getLanesBlocked() {
        return this.lanesBlocked;
    }

    public String getLanesClearDesc() {
        return this.lanesClearDesc;
    }

    public Integer getLength() {
        return this.length;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public HashMap<String, List<String>> getMultiLingualAffectedRoadNames() {
        return this.multiLingualAffectedRoadNames;
    }

    public Long getNumLanesBlocked() {
        return this.numLanesBlocked;
    }

    public OpenLR getOpenlr() {
        return this.openlr;
    }

    public boolean getRoadClosed() {
        return this.roadClosed;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public String getSubType() {
        return this.subType;
    }

    public String getSubTypeDescription() {
        return this.subTypeDescription;
    }

    public HashMap<String, Integer> getTrafficCodes() {
        return this.trafficCodes;
    }

    public IncidentType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.openlr, this.type, this.startTime, this.endTime, this.creationTime, this.length, this.iso_3166_1_alpha2, this.iso_3166_1_alpha3, this.lanesBlocked, Boolean.valueOf(this.roadClosed), this.congestion, this.impact, this.description, this.subType, this.subTypeDescription, this.alertcCodes, this.trafficCodes, this.longDescription, this.lanesClearDesc, this.numLanesBlocked, this.affectedRoadNames, this.multiLingualAffectedRoadNames);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", openlr: ");
        sb2.append(RecordUtils.fieldToString(this.openlr));
        sb2.append(", type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", startTime: ");
        sb2.append(RecordUtils.fieldToString(this.startTime));
        sb2.append(", endTime: ");
        sb2.append(RecordUtils.fieldToString(this.endTime));
        sb2.append(", creationTime: ");
        sb2.append(RecordUtils.fieldToString(this.creationTime));
        sb2.append(", length: ");
        b.t(this.length, sb2, ", iso_3166_1_alpha2: ");
        h.z(sb2, this.iso_3166_1_alpha2, ", iso_3166_1_alpha3: ");
        h.z(sb2, this.iso_3166_1_alpha3, ", lanesBlocked: ");
        b.v(", roadClosed: ", sb2, this.lanesBlocked);
        h.A(this.roadClosed, sb2, ", congestion: ");
        sb2.append(RecordUtils.fieldToString(this.congestion));
        sb2.append(", impact: ");
        sb2.append(RecordUtils.fieldToString(this.impact));
        sb2.append(", description: ");
        h.z(sb2, this.description, ", subType: ");
        h.z(sb2, this.subType, ", subTypeDescription: ");
        h.z(sb2, this.subTypeDescription, ", alertcCodes: ");
        b.v(", trafficCodes: ", sb2, this.alertcCodes);
        sb2.append(RecordUtils.fieldToString(this.trafficCodes));
        sb2.append(", longDescription: ");
        h.z(sb2, this.longDescription, ", lanesClearDesc: ");
        h.z(sb2, this.lanesClearDesc, ", numLanesBlocked: ");
        b.u(this.numLanesBlocked, sb2, ", affectedRoadNames: ");
        b.v(", multiLingualAffectedRoadNames: ", sb2, this.affectedRoadNames);
        sb2.append(RecordUtils.fieldToString(this.multiLingualAffectedRoadNames));
        sb2.append("]");
        return sb2.toString();
    }
}
