package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ScanResult implements Serializable {
    private final String id;
    private final boolean isConnectable;
    private final String localName;
    private final List<ManufacturerData> manufacturerData;
    private final long monotonicTimestampNanoseconds;
    private final List<String> overflowServiceUUIDs;
    private final int rssi;
    private final List<ServiceData> serviceData;
    private final List<String> serviceUUIDs;
    private final List<String> solicitedServiceUUIDs;
    private final int txPowerLevel;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ScanResult(String str, String str2, List<ManufacturerData> list, List<ServiceData> list2, int i3, List<String> list3, List<String> list4, List<String> list5, boolean z2, int i10, long j) {
        this.id = str;
        this.localName = str2;
        this.manufacturerData = list;
        this.serviceData = list2;
        this.txPowerLevel = i3;
        this.serviceUUIDs = list3;
        this.overflowServiceUUIDs = list4;
        this.solicitedServiceUUIDs = list5;
        this.isConnectable = z2;
        this.rssi = i10;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanResult scanResult = (ScanResult) obj;
        return Objects.equals(this.id, scanResult.id) && Objects.equals(this.localName, scanResult.localName) && Objects.equals(this.manufacturerData, scanResult.manufacturerData) && Objects.equals(this.serviceData, scanResult.serviceData) && this.txPowerLevel == scanResult.txPowerLevel && Objects.equals(this.serviceUUIDs, scanResult.serviceUUIDs) && Objects.equals(this.overflowServiceUUIDs, scanResult.overflowServiceUUIDs) && Objects.equals(this.solicitedServiceUUIDs, scanResult.solicitedServiceUUIDs) && this.isConnectable == scanResult.isConnectable && this.rssi == scanResult.rssi && this.monotonicTimestampNanoseconds == scanResult.monotonicTimestampNanoseconds;
    }

    public String getId() {
        return this.id;
    }

    public boolean getIsConnectable() {
        return this.isConnectable;
    }

    public String getLocalName() {
        return this.localName;
    }

    public List<ManufacturerData> getManufacturerData() {
        return this.manufacturerData;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public List<String> getOverflowServiceUUIDs() {
        return this.overflowServiceUUIDs;
    }

    public int getRssi() {
        return this.rssi;
    }

    public List<ServiceData> getServiceData() {
        return this.serviceData;
    }

    public List<String> getServiceUUIDs() {
        return this.serviceUUIDs;
    }

    public List<String> getSolicitedServiceUUIDs() {
        return this.solicitedServiceUUIDs;
    }

    public int getTxPowerLevel() {
        return this.txPowerLevel;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.localName, this.manufacturerData, this.serviceData, Integer.valueOf(this.txPowerLevel), this.serviceUUIDs, this.overflowServiceUUIDs, this.solicitedServiceUUIDs, Boolean.valueOf(this.isConnectable), Integer.valueOf(this.rssi), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", localName: ");
        h.z(sb2, this.localName, ", manufacturerData: ");
        b.v(", serviceData: ", sb2, this.manufacturerData);
        b.v(", txPowerLevel: ", sb2, this.serviceData);
        b.o(this.txPowerLevel, ", serviceUUIDs: ", sb2);
        b.v(", overflowServiceUUIDs: ", sb2, this.serviceUUIDs);
        b.v(", solicitedServiceUUIDs: ", sb2, this.overflowServiceUUIDs);
        b.v(", isConnectable: ", sb2, this.solicitedServiceUUIDs);
        h.A(this.isConnectable, sb2, ", rssi: ");
        b.o(this.rssi, ", monotonicTimestampNanoseconds: ", sb2);
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
