package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TunnelInfo implements Serializable {
    private final String id;
    private final String name;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public TunnelInfo(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TunnelInfo tunnelInfo = (TunnelInfo) obj;
        return Objects.equals(this.id, tunnelInfo.id) && Objects.equals(this.name, tunnelInfo.name);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", name: ");
        return h.t(sb2, this.name, "]");
    }
}
