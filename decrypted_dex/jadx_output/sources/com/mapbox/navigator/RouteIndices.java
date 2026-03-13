package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteIndices implements Serializable {
    private final int geometryIndex;
    private final int intersectionIndex;
    private final boolean isForkPointPassed;
    private final int legIndex;
    private final int legShapeIndex;
    private final RouteIdentifier routeId;
    private final int stepIndex;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteIndices(RouteIdentifier routeIdentifier, int i3, int i10, int i11, int i12, int i13, boolean z2) {
        this.routeId = routeIdentifier;
        this.legIndex = i3;
        this.stepIndex = i10;
        this.geometryIndex = i11;
        this.legShapeIndex = i12;
        this.intersectionIndex = i13;
        this.isForkPointPassed = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteIndices routeIndices = (RouteIndices) obj;
        return Objects.equals(this.routeId, routeIndices.routeId) && this.legIndex == routeIndices.legIndex && this.stepIndex == routeIndices.stepIndex && this.geometryIndex == routeIndices.geometryIndex && this.legShapeIndex == routeIndices.legShapeIndex && this.intersectionIndex == routeIndices.intersectionIndex && this.isForkPointPassed == routeIndices.isForkPointPassed;
    }

    public int getGeometryIndex() {
        return this.geometryIndex;
    }

    public int getIntersectionIndex() {
        return this.intersectionIndex;
    }

    public boolean getIsForkPointPassed() {
        return this.isForkPointPassed;
    }

    public int getLegIndex() {
        return this.legIndex;
    }

    public int getLegShapeIndex() {
        return this.legShapeIndex;
    }

    public RouteIdentifier getRouteId() {
        return this.routeId;
    }

    public int getStepIndex() {
        return this.stepIndex;
    }

    public int hashCode() {
        return Objects.hash(this.routeId, Integer.valueOf(this.legIndex), Integer.valueOf(this.stepIndex), Integer.valueOf(this.geometryIndex), Integer.valueOf(this.legShapeIndex), Integer.valueOf(this.intersectionIndex), Boolean.valueOf(this.isForkPointPassed));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[routeId: ");
        sb2.append(RecordUtils.fieldToString(this.routeId));
        sb2.append(", legIndex: ");
        b.o(this.legIndex, ", stepIndex: ", sb2);
        b.o(this.stepIndex, ", geometryIndex: ", sb2);
        b.o(this.geometryIndex, ", legShapeIndex: ", sb2);
        b.o(this.legShapeIndex, ", intersectionIndex: ", sb2);
        b.o(this.intersectionIndex, ", isForkPointPassed: ", sb2);
        return b.k(this.isForkPointPassed, sb2, "]");
    }

    public RouteIndices(RouteIdentifier routeIdentifier, int i3, int i10, int i11, int i12, int i13) {
        this.routeId = routeIdentifier;
        this.legIndex = i3;
        this.stepIndex = i10;
        this.geometryIndex = i11;
        this.legShapeIndex = i12;
        this.intersectionIndex = i13;
        this.isForkPointPassed = false;
    }
}
