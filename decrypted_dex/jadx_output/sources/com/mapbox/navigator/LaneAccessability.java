package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LaneAccessability implements Serializable {
    private final List<String> designated;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneAccessability(List<String> list) {
        this.designated = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.designated, ((LaneAccessability) obj).designated);
    }

    public List<String> getDesignated() {
        return this.designated;
    }

    public int hashCode() {
        return Objects.hash(this.designated);
    }

    public String toString() {
        return b.i("]", new StringBuilder("[designated: "), this.designated);
    }
}
