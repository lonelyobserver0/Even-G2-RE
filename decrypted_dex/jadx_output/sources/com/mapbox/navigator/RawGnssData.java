package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RawGnssData implements Serializable {
    private final Double edop;
    private final Double gdop;
    private final Double hdop;
    private final long monotonicTimestampNanoseconds;
    private final Double ndop;
    private final Double pdop;
    private final List<RawGnssSatelliteData> satellites;
    private final Double tdop;
    private final Double vdop;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RawGnssData(Double d8, Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, List<RawGnssSatelliteData> list, long j) {
        this.gdop = d8;
        this.pdop = d10;
        this.tdop = d11;
        this.vdop = d12;
        this.hdop = d13;
        this.ndop = d14;
        this.edop = d15;
        this.satellites = list;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RawGnssData rawGnssData = (RawGnssData) obj;
        return Objects.equals(this.gdop, rawGnssData.gdop) && Objects.equals(this.pdop, rawGnssData.pdop) && Objects.equals(this.tdop, rawGnssData.tdop) && Objects.equals(this.vdop, rawGnssData.vdop) && Objects.equals(this.hdop, rawGnssData.hdop) && Objects.equals(this.ndop, rawGnssData.ndop) && Objects.equals(this.edop, rawGnssData.edop) && Objects.equals(this.satellites, rawGnssData.satellites) && this.monotonicTimestampNanoseconds == rawGnssData.monotonicTimestampNanoseconds;
    }

    public Double getEdop() {
        return this.edop;
    }

    public Double getGdop() {
        return this.gdop;
    }

    public Double getHdop() {
        return this.hdop;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public Double getNdop() {
        return this.ndop;
    }

    public Double getPdop() {
        return this.pdop;
    }

    public List<RawGnssSatelliteData> getSatellites() {
        return this.satellites;
    }

    public Double getTdop() {
        return this.tdop;
    }

    public Double getVdop() {
        return this.vdop;
    }

    public int hashCode() {
        return Objects.hash(this.gdop, this.pdop, this.tdop, this.vdop, this.hdop, this.ndop, this.edop, this.satellites, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[gdop: ");
        b.r(this.gdop, sb2, ", pdop: ");
        b.r(this.pdop, sb2, ", tdop: ");
        b.r(this.tdop, sb2, ", vdop: ");
        b.r(this.vdop, sb2, ", hdop: ");
        b.r(this.hdop, sb2, ", ndop: ");
        b.r(this.ndop, sb2, ", edop: ");
        b.r(this.edop, sb2, ", satellites: ");
        b.v(", monotonicTimestampNanoseconds: ", sb2, this.satellites);
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
