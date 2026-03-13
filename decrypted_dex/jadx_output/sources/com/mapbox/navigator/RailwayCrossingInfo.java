package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RailwayCrossingInfo implements Serializable {
    private final String id;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RailwayCrossingInfo(String str) {
        this.id = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.id, ((RailwayCrossingInfo) obj).id);
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return Objects.hash(this.id);
    }

    public String toString() {
        return h.t(new StringBuilder("[id: "), this.id, "]");
    }
}
