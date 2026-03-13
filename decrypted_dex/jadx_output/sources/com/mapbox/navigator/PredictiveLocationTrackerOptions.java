package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PredictiveLocationTrackerOptions implements Serializable {
    private final int currentLocationRadius;
    private final int destinationLocationRadius;
    private final boolean loadPredictiveCacheForAlternativeRoutes;
    private final int routeBufferRadius;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public PredictiveLocationTrackerOptions(int i3, int i10, int i11, boolean z2) {
        this.currentLocationRadius = i3;
        this.routeBufferRadius = i10;
        this.destinationLocationRadius = i11;
        this.loadPredictiveCacheForAlternativeRoutes = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PredictiveLocationTrackerOptions predictiveLocationTrackerOptions = (PredictiveLocationTrackerOptions) obj;
        return this.currentLocationRadius == predictiveLocationTrackerOptions.currentLocationRadius && this.routeBufferRadius == predictiveLocationTrackerOptions.routeBufferRadius && this.destinationLocationRadius == predictiveLocationTrackerOptions.destinationLocationRadius && this.loadPredictiveCacheForAlternativeRoutes == predictiveLocationTrackerOptions.loadPredictiveCacheForAlternativeRoutes;
    }

    public int getCurrentLocationRadius() {
        return this.currentLocationRadius;
    }

    public int getDestinationLocationRadius() {
        return this.destinationLocationRadius;
    }

    public boolean getLoadPredictiveCacheForAlternativeRoutes() {
        return this.loadPredictiveCacheForAlternativeRoutes;
    }

    public int getRouteBufferRadius() {
        return this.routeBufferRadius;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.currentLocationRadius), Integer.valueOf(this.routeBufferRadius), Integer.valueOf(this.destinationLocationRadius), Boolean.valueOf(this.loadPredictiveCacheForAlternativeRoutes));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[currentLocationRadius: ");
        b.o(this.currentLocationRadius, ", routeBufferRadius: ", sb2);
        b.o(this.routeBufferRadius, ", destinationLocationRadius: ", sb2);
        b.o(this.destinationLocationRadius, ", loadPredictiveCacheForAlternativeRoutes: ", sb2);
        return b.k(this.loadPredictiveCacheForAlternativeRoutes, sb2, "]");
    }

    public PredictiveLocationTrackerOptions(int i3, int i10, int i11) {
        this.currentLocationRadius = i3;
        this.routeBufferRadius = i10;
        this.destinationLocationRadius = i11;
        this.loadPredictiveCacheForAlternativeRoutes = false;
    }
}
