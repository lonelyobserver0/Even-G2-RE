package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RouteIdentifier implements Serializable {
    private final int index;
    private final String uuid;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteIdentifier(String str, int i3) {
        this.uuid = str;
        this.index = i3;
    }

    public static native RouteIdentifier fromString(String str);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteIdentifier routeIdentifier = (RouteIdentifier) obj;
        return Objects.equals(this.uuid, routeIdentifier.uuid) && this.index == routeIdentifier.index;
    }

    public int getIndex() {
        return this.index;
    }

    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return Objects.hash(this.uuid, Integer.valueOf(this.index));
    }

    public native String toRouteIdString();

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[uuid: ");
        h.z(sb2, this.uuid, ", index: ");
        return b.g(this.index, "]", sb2);
    }
}
