package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ElectronicHorizonOptions implements Serializable {
    private final AlertsServiceOptions alertsService;
    private final double branchLength;
    private final boolean doNotRecalculateInUncertainState;
    private final boolean enableEnhancedDataAlongEH;
    private final byte expansion;
    private final double length;
    private final Double minTimeDeltaBetweenUpdates;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ElectronicHorizonOptions(double d8, byte b2, double d10, boolean z2, Double d11, AlertsServiceOptions alertsServiceOptions, boolean z10) {
        this.length = d8;
        this.expansion = b2;
        this.branchLength = d10;
        this.doNotRecalculateInUncertainState = z2;
        this.minTimeDeltaBetweenUpdates = d11;
        this.alertsService = alertsServiceOptions;
        this.enableEnhancedDataAlongEH = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElectronicHorizonOptions electronicHorizonOptions = (ElectronicHorizonOptions) obj;
        return PartialEq.compare(this.length, electronicHorizonOptions.length) && this.expansion == electronicHorizonOptions.expansion && PartialEq.compare(this.branchLength, electronicHorizonOptions.branchLength) && this.doNotRecalculateInUncertainState == electronicHorizonOptions.doNotRecalculateInUncertainState && Objects.equals(this.minTimeDeltaBetweenUpdates, electronicHorizonOptions.minTimeDeltaBetweenUpdates) && Objects.equals(this.alertsService, electronicHorizonOptions.alertsService) && this.enableEnhancedDataAlongEH == electronicHorizonOptions.enableEnhancedDataAlongEH;
    }

    public AlertsServiceOptions getAlertsService() {
        return this.alertsService;
    }

    public double getBranchLength() {
        return this.branchLength;
    }

    public boolean getDoNotRecalculateInUncertainState() {
        return this.doNotRecalculateInUncertainState;
    }

    public boolean getEnableEnhancedDataAlongEH() {
        return this.enableEnhancedDataAlongEH;
    }

    public byte getExpansion() {
        return this.expansion;
    }

    public double getLength() {
        return this.length;
    }

    public Double getMinTimeDeltaBetweenUpdates() {
        return this.minTimeDeltaBetweenUpdates;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.length), Byte.valueOf(this.expansion), Double.valueOf(this.branchLength), Boolean.valueOf(this.doNotRecalculateInUncertainState), this.minTimeDeltaBetweenUpdates, this.alertsService, Boolean.valueOf(this.enableEnhancedDataAlongEH));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[length: ");
        b.m(this.length, sb2, ", expansion: ");
        sb2.append(RecordUtils.fieldToString(Byte.valueOf(this.expansion)));
        sb2.append(", branchLength: ");
        b.m(this.branchLength, sb2, ", doNotRecalculateInUncertainState: ");
        h.A(this.doNotRecalculateInUncertainState, sb2, ", minTimeDeltaBetweenUpdates: ");
        b.r(this.minTimeDeltaBetweenUpdates, sb2, ", alertsService: ");
        sb2.append(RecordUtils.fieldToString(this.alertsService));
        sb2.append(", enableEnhancedDataAlongEH: ");
        return b.k(this.enableEnhancedDataAlongEH, sb2, "]");
    }

    public ElectronicHorizonOptions(double d8, boolean z2, Double d10, AlertsServiceOptions alertsServiceOptions) {
        this.length = d8;
        this.doNotRecalculateInUncertainState = z2;
        this.minTimeDeltaBetweenUpdates = d10;
        this.alertsService = alertsServiceOptions;
        this.expansion = (byte) 0;
        this.branchLength = 1.0d;
        this.enableEnhancedDataAlongEH = false;
    }
}
