package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SetRoutesDataParams implements Serializable {
    private final int legIndex;
    private final RoutesData routes;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SetRoutesDataParams(RoutesData routesData, int i3) {
        this.routes = routesData;
        this.legIndex = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRoutesDataParams setRoutesDataParams = (SetRoutesDataParams) obj;
        return Objects.equals(this.routes, setRoutesDataParams.routes) && this.legIndex == setRoutesDataParams.legIndex;
    }

    public int getLegIndex() {
        return this.legIndex;
    }

    public RoutesData getRoutes() {
        return this.routes;
    }

    public int hashCode() {
        return Objects.hash(this.routes, Integer.valueOf(this.legIndex));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[routes: ");
        sb2.append(RecordUtils.fieldToString(this.routes));
        sb2.append(", legIndex: ");
        return b.g(this.legIndex, "]", sb2);
    }
}
