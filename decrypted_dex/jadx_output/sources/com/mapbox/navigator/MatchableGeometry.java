package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MatchableGeometry implements Serializable {
    private final List<Point> coordinates;
    private final String id;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchableGeometry(String str, List<Point> list) {
        this.id = str;
        this.coordinates = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchableGeometry matchableGeometry = (MatchableGeometry) obj;
        return Objects.equals(this.id, matchableGeometry.id) && Objects.equals(this.coordinates, matchableGeometry.coordinates);
    }

    public List<Point> getCoordinates() {
        return this.coordinates;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.coordinates);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", coordinates: ");
        return b.i("]", sb2, this.coordinates);
    }
}
