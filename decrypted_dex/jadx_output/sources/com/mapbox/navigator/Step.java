package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class Step implements Serializable {
    private final double distance;
    private final double distanceRemaining;
    private final double duration;
    private final double durationRemaining;
    private final String previousInstruction;
    private final String previousModifier;
    private final String previousName;
    private final String previousType;
    private final String upcomingInstruction;
    private final String upcomingModifier;
    private final String upcomingName;
    private final String upcomingType;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Step(double d8, double d10, double d11, double d12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.distance = d8;
        this.distanceRemaining = d10;
        this.duration = d11;
        this.durationRemaining = d12;
        this.upcomingName = str;
        this.upcomingType = str2;
        this.upcomingModifier = str3;
        this.upcomingInstruction = str4;
        this.previousName = str5;
        this.previousType = str6;
        this.previousModifier = str7;
        this.previousInstruction = str8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Step step = (Step) obj;
        return PartialEq.compare(this.distance, step.distance) && PartialEq.compare(this.distanceRemaining, step.distanceRemaining) && PartialEq.compare(this.duration, step.duration) && PartialEq.compare(this.durationRemaining, step.durationRemaining) && Objects.equals(this.upcomingName, step.upcomingName) && Objects.equals(this.upcomingType, step.upcomingType) && Objects.equals(this.upcomingModifier, step.upcomingModifier) && Objects.equals(this.upcomingInstruction, step.upcomingInstruction) && Objects.equals(this.previousName, step.previousName) && Objects.equals(this.previousType, step.previousType) && Objects.equals(this.previousModifier, step.previousModifier) && Objects.equals(this.previousInstruction, step.previousInstruction);
    }

    public double getDistance() {
        return this.distance;
    }

    public double getDistanceRemaining() {
        return this.distanceRemaining;
    }

    public double getDuration() {
        return this.duration;
    }

    public double getDurationRemaining() {
        return this.durationRemaining;
    }

    public String getPreviousInstruction() {
        return this.previousInstruction;
    }

    public String getPreviousModifier() {
        return this.previousModifier;
    }

    public String getPreviousName() {
        return this.previousName;
    }

    public String getPreviousType() {
        return this.previousType;
    }

    public String getUpcomingInstruction() {
        return this.upcomingInstruction;
    }

    public String getUpcomingModifier() {
        return this.upcomingModifier;
    }

    public String getUpcomingName() {
        return this.upcomingName;
    }

    public String getUpcomingType() {
        return this.upcomingType;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.distance), Double.valueOf(this.distanceRemaining), Double.valueOf(this.duration), Double.valueOf(this.durationRemaining), this.upcomingName, this.upcomingType, this.upcomingModifier, this.upcomingInstruction, this.previousName, this.previousType, this.previousModifier, this.previousInstruction);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[distance: ");
        b.m(this.distance, sb2, ", distanceRemaining: ");
        b.m(this.distanceRemaining, sb2, ", duration: ");
        b.m(this.duration, sb2, ", durationRemaining: ");
        b.m(this.durationRemaining, sb2, ", upcomingName: ");
        h.z(sb2, this.upcomingName, ", upcomingType: ");
        h.z(sb2, this.upcomingType, ", upcomingModifier: ");
        h.z(sb2, this.upcomingModifier, ", upcomingInstruction: ");
        h.z(sb2, this.upcomingInstruction, ", previousName: ");
        h.z(sb2, this.previousName, ", previousType: ");
        h.z(sb2, this.previousType, ", previousModifier: ");
        h.z(sb2, this.previousModifier, ", previousInstruction: ");
        return h.t(sb2, this.previousInstruction, "]");
    }

    public Step(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.upcomingName = str;
        this.upcomingType = str2;
        this.upcomingModifier = str3;
        this.upcomingInstruction = str4;
        this.previousName = str5;
        this.previousType = str6;
        this.previousModifier = str7;
        this.previousInstruction = str8;
        this.distance = 0.0d;
        this.distanceRemaining = 0.0d;
        this.duration = 0.0d;
        this.durationRemaining = 0.0d;
    }
}
