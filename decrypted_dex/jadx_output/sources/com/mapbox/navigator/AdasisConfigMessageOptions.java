package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigMessageOptions implements Serializable {
    private final int branchRadiusMeters;
    private final boolean enabled;
    private final int radiusMeters;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigMessageOptions(boolean z2, int i3, int i10) {
        this.enabled = z2;
        this.radiusMeters = i3;
        this.branchRadiusMeters = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigMessageOptions adasisConfigMessageOptions = (AdasisConfigMessageOptions) obj;
        return this.enabled == adasisConfigMessageOptions.enabled && this.radiusMeters == adasisConfigMessageOptions.radiusMeters && this.branchRadiusMeters == adasisConfigMessageOptions.branchRadiusMeters;
    }

    public int getBranchRadiusMeters() {
        return this.branchRadiusMeters;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public int getRadiusMeters() {
        return this.radiusMeters;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Integer.valueOf(this.radiusMeters), Integer.valueOf(this.branchRadiusMeters));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[enabled: ");
        h.A(this.enabled, sb2, ", radiusMeters: ");
        b.o(this.radiusMeters, ", branchRadiusMeters: ", sb2);
        return b.g(this.branchRadiusMeters, "]", sb2);
    }

    public AdasisConfigMessageOptions() {
        this.enabled = true;
        this.radiusMeters = 2000;
        this.branchRadiusMeters = 50;
    }
}
