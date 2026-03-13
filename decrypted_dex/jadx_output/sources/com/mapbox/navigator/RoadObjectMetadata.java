package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadObjectMetadata {
    private Type type;
    private Object value;

    public enum Type {
        INCIDENT_INFO,
        TUNNEL_INFO,
        BORDER_CROSSING_INFO,
        TOLL_COLLECTION_INFO,
        SERVICE_AREA_INFO,
        RAILWAY_CROSSING_INFO,
        IC_INFO,
        JCT_INFO,
        NOTIFICATION_INFO,
        MERGING_AREA_INFO
    }

    public RoadObjectMetadata(IncidentInfo incidentInfo) {
        this.type = Type.INCIDENT_INFO;
        this.value = incidentInfo;
    }

    public static RoadObjectMetadata valueOf(IncidentInfo incidentInfo) {
        return new RoadObjectMetadata(incidentInfo);
    }

    public BorderCrossingInfo getBorderCrossingInfo() {
        if (isBorderCrossingInfo()) {
            return (BorderCrossingInfo) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15383));
    }

    public IcInfo getIcInfo() {
        if (isIcInfo()) {
            return (IcInfo) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15384));
    }

    public IncidentInfo getIncidentInfo() {
        if (isIncidentInfo()) {
            return (IncidentInfo) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15385));
    }

    public JctInfo getJctInfo() {
        if (isJctInfo()) {
            return (JctInfo) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15386));
    }

    public MergingAreaInfo getMergingAreaInfo() {
        if (isMergingAreaInfo()) {
            return (MergingAreaInfo) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15387));
    }

    public NotificationInfo getNotificationInfo() {
        if (isNotificationInfo()) {
            return (NotificationInfo) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15388));
    }

    public RailwayCrossingInfo getRailwayCrossingInfo() {
        if (isRailwayCrossingInfo()) {
            return (RailwayCrossingInfo) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15389));
    }

    public ServiceAreaInfo getServiceAreaInfo() {
        if (isServiceAreaInfo()) {
            return (ServiceAreaInfo) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15390));
    }

    public TollCollectionInfo getTollCollectionInfo() {
        if (isTollCollectionInfo()) {
            return (TollCollectionInfo) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15391));
    }

    public TunnelInfo getTunnelInfo() {
        if (isTunnelInfo()) {
            return (TunnelInfo) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(15392));
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isBorderCrossingInfo() {
        return this.type == Type.BORDER_CROSSING_INFO;
    }

    public boolean isIcInfo() {
        return this.type == Type.IC_INFO;
    }

    public boolean isIncidentInfo() {
        return this.type == Type.INCIDENT_INFO;
    }

    public boolean isJctInfo() {
        return this.type == Type.JCT_INFO;
    }

    public boolean isMergingAreaInfo() {
        return this.type == Type.MERGING_AREA_INFO;
    }

    public boolean isNotificationInfo() {
        return this.type == Type.NOTIFICATION_INFO;
    }

    public boolean isRailwayCrossingInfo() {
        return this.type == Type.RAILWAY_CROSSING_INFO;
    }

    public boolean isServiceAreaInfo() {
        return this.type == Type.SERVICE_AREA_INFO;
    }

    public boolean isTollCollectionInfo() {
        return this.type == Type.TOLL_COLLECTION_INFO;
    }

    public boolean isTunnelInfo() {
        return this.type == Type.TUNNEL_INFO;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static RoadObjectMetadata valueOf(TunnelInfo tunnelInfo) {
        return new RoadObjectMetadata(tunnelInfo);
    }

    public static RoadObjectMetadata valueOf(BorderCrossingInfo borderCrossingInfo) {
        return new RoadObjectMetadata(borderCrossingInfo);
    }

    public RoadObjectMetadata(TunnelInfo tunnelInfo) {
        this.type = Type.TUNNEL_INFO;
        this.value = tunnelInfo;
    }

    public static RoadObjectMetadata valueOf(TollCollectionInfo tollCollectionInfo) {
        return new RoadObjectMetadata(tollCollectionInfo);
    }

    public static RoadObjectMetadata valueOf(ServiceAreaInfo serviceAreaInfo) {
        return new RoadObjectMetadata(serviceAreaInfo);
    }

    public static RoadObjectMetadata valueOf(RailwayCrossingInfo railwayCrossingInfo) {
        return new RoadObjectMetadata(railwayCrossingInfo);
    }

    public RoadObjectMetadata(BorderCrossingInfo borderCrossingInfo) {
        this.type = Type.BORDER_CROSSING_INFO;
        this.value = borderCrossingInfo;
    }

    public static RoadObjectMetadata valueOf(IcInfo icInfo) {
        return new RoadObjectMetadata(icInfo);
    }

    public static RoadObjectMetadata valueOf(JctInfo jctInfo) {
        return new RoadObjectMetadata(jctInfo);
    }

    public static RoadObjectMetadata valueOf(NotificationInfo notificationInfo) {
        return new RoadObjectMetadata(notificationInfo);
    }

    public RoadObjectMetadata(TollCollectionInfo tollCollectionInfo) {
        this.type = Type.TOLL_COLLECTION_INFO;
        this.value = tollCollectionInfo;
    }

    public static RoadObjectMetadata valueOf(MergingAreaInfo mergingAreaInfo) {
        return new RoadObjectMetadata(mergingAreaInfo);
    }

    public RoadObjectMetadata(ServiceAreaInfo serviceAreaInfo) {
        this.type = Type.SERVICE_AREA_INFO;
        this.value = serviceAreaInfo;
    }

    public RoadObjectMetadata(RailwayCrossingInfo railwayCrossingInfo) {
        this.type = Type.RAILWAY_CROSSING_INFO;
        this.value = railwayCrossingInfo;
    }

    public RoadObjectMetadata(IcInfo icInfo) {
        this.type = Type.IC_INFO;
        this.value = icInfo;
    }

    public RoadObjectMetadata(JctInfo jctInfo) {
        this.type = Type.JCT_INFO;
        this.value = jctInfo;
    }

    public RoadObjectMetadata(NotificationInfo notificationInfo) {
        this.type = Type.NOTIFICATION_INFO;
        this.value = notificationInfo;
    }

    public RoadObjectMetadata(MergingAreaInfo mergingAreaInfo) {
        this.type = Type.MERGING_AREA_INFO;
        this.value = mergingAreaInfo;
    }
}
