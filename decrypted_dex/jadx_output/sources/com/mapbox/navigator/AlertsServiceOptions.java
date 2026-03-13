package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AlertsServiceOptions implements Serializable {
    private final Boolean collectBridges;
    private final Boolean collectMergingAreas;
    private final Boolean collectRestrictedAreas;
    private final Boolean collectServiceAreas;
    private final Boolean collectTunnels;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AlertsServiceOptions(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.collectTunnels = bool;
        this.collectBridges = bool2;
        this.collectRestrictedAreas = bool3;
        this.collectMergingAreas = bool4;
        this.collectServiceAreas = bool5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertsServiceOptions alertsServiceOptions = (AlertsServiceOptions) obj;
        return Objects.equals(this.collectTunnels, alertsServiceOptions.collectTunnels) && Objects.equals(this.collectBridges, alertsServiceOptions.collectBridges) && Objects.equals(this.collectRestrictedAreas, alertsServiceOptions.collectRestrictedAreas) && Objects.equals(this.collectMergingAreas, alertsServiceOptions.collectMergingAreas) && Objects.equals(this.collectServiceAreas, alertsServiceOptions.collectServiceAreas);
    }

    public Boolean getCollectBridges() {
        return this.collectBridges;
    }

    public Boolean getCollectMergingAreas() {
        return this.collectMergingAreas;
    }

    public Boolean getCollectRestrictedAreas() {
        return this.collectRestrictedAreas;
    }

    public Boolean getCollectServiceAreas() {
        return this.collectServiceAreas;
    }

    public Boolean getCollectTunnels() {
        return this.collectTunnels;
    }

    public int hashCode() {
        return Objects.hash(this.collectTunnels, this.collectBridges, this.collectRestrictedAreas, this.collectMergingAreas, this.collectServiceAreas);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[collectTunnels: ");
        b.w(sb2, ", collectBridges: ", this.collectTunnels);
        b.w(sb2, ", collectRestrictedAreas: ", this.collectBridges);
        b.w(sb2, ", collectMergingAreas: ", this.collectRestrictedAreas);
        b.w(sb2, ", collectServiceAreas: ", this.collectMergingAreas);
        sb2.append(RecordUtils.fieldToString(this.collectServiceAreas));
        sb2.append("]");
        return sb2.toString();
    }
}
