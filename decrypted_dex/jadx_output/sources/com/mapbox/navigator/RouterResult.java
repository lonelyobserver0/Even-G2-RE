package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouterResult implements Serializable {
    private final String json;
    private final boolean success;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouterResult(String str, boolean z2) {
        this.json = str;
        this.success = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouterResult routerResult = (RouterResult) obj;
        return Objects.equals(this.json, routerResult.json) && this.success == routerResult.success;
    }

    public String getJson() {
        return this.json;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Objects.hash(this.json, Boolean.valueOf(this.success));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[json: ");
        h.z(sb2, this.json, ", success: ");
        return b.k(this.success, sb2, "]");
    }
}
