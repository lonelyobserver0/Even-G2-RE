package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.match.openlr.OpenLR;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchableOpenLr implements Serializable {
    private final String id;
    private final OpenLR openlr;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchableOpenLr(OpenLR openLR, String str) {
        this.openlr = openLR;
        this.id = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchableOpenLr matchableOpenLr = (MatchableOpenLr) obj;
        return Objects.equals(this.openlr, matchableOpenLr.openlr) && Objects.equals(this.id, matchableOpenLr.id);
    }

    public String getId() {
        return this.id;
    }

    public OpenLR getOpenlr() {
        return this.openlr;
    }

    public int hashCode() {
        return Objects.hash(this.openlr, this.id);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[openlr: ");
        sb2.append(RecordUtils.fieldToString(this.openlr));
        sb2.append(", id: ");
        return h.t(sb2, this.id, "]");
    }
}
