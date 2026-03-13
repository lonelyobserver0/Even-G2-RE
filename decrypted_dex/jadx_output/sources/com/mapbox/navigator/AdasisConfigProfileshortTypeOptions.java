package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigProfileshortTypeOptions implements Serializable {
    private final boolean curvature;
    private final boolean headingChange;
    private final boolean historyAverageSpeed;
    private final boolean roadCondition;
    private final boolean slopeLinear;
    private final boolean slopeStep;
    private final boolean variableSpeedSign;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigProfileshortTypeOptions(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.slopeStep = z2;
        this.slopeLinear = z10;
        this.curvature = z11;
        this.roadCondition = z12;
        this.variableSpeedSign = z13;
        this.headingChange = z14;
        this.historyAverageSpeed = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigProfileshortTypeOptions adasisConfigProfileshortTypeOptions = (AdasisConfigProfileshortTypeOptions) obj;
        return this.slopeStep == adasisConfigProfileshortTypeOptions.slopeStep && this.slopeLinear == adasisConfigProfileshortTypeOptions.slopeLinear && this.curvature == adasisConfigProfileshortTypeOptions.curvature && this.roadCondition == adasisConfigProfileshortTypeOptions.roadCondition && this.variableSpeedSign == adasisConfigProfileshortTypeOptions.variableSpeedSign && this.headingChange == adasisConfigProfileshortTypeOptions.headingChange && this.historyAverageSpeed == adasisConfigProfileshortTypeOptions.historyAverageSpeed;
    }

    public boolean getCurvature() {
        return this.curvature;
    }

    public boolean getHeadingChange() {
        return this.headingChange;
    }

    public boolean getHistoryAverageSpeed() {
        return this.historyAverageSpeed;
    }

    public boolean getRoadCondition() {
        return this.roadCondition;
    }

    public boolean getSlopeLinear() {
        return this.slopeLinear;
    }

    public boolean getSlopeStep() {
        return this.slopeStep;
    }

    public boolean getVariableSpeedSign() {
        return this.variableSpeedSign;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.slopeStep), Boolean.valueOf(this.slopeLinear), Boolean.valueOf(this.curvature), Boolean.valueOf(this.roadCondition), Boolean.valueOf(this.variableSpeedSign), Boolean.valueOf(this.headingChange), Boolean.valueOf(this.historyAverageSpeed));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[slopeStep: ");
        h.A(this.slopeStep, sb2, ", slopeLinear: ");
        h.A(this.slopeLinear, sb2, ", curvature: ");
        h.A(this.curvature, sb2, ", roadCondition: ");
        h.A(this.roadCondition, sb2, ", variableSpeedSign: ");
        h.A(this.variableSpeedSign, sb2, ", headingChange: ");
        h.A(this.headingChange, sb2, ", historyAverageSpeed: ");
        return b.k(this.historyAverageSpeed, sb2, "]");
    }

    public AdasisConfigProfileshortTypeOptions() {
        this.slopeStep = true;
        this.slopeLinear = false;
        this.curvature = true;
        this.roadCondition = true;
        this.variableSpeedSign = true;
        this.headingChange = true;
        this.historyAverageSpeed = true;
    }
}
