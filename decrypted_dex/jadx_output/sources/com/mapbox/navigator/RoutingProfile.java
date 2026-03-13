package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoutingProfile implements Serializable {
    private final String account;
    private final RoutingMode mode;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoutingProfile(RoutingMode routingMode, String str) {
        this.mode = routingMode;
        this.account = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoutingProfile routingProfile = (RoutingProfile) obj;
        return Objects.equals(this.mode, routingProfile.mode) && Objects.equals(this.account, routingProfile.account);
    }

    public String getAccount() {
        return this.account;
    }

    public RoutingMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        return Objects.hash(this.mode, this.account);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[mode: ");
        sb2.append(RecordUtils.fieldToString(this.mode));
        sb2.append(", account: ");
        return h.t(sb2, this.account, "]");
    }
}
