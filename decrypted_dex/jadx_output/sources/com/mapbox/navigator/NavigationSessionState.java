package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class NavigationSessionState implements Serializable {
    private final List<Byte> serialized;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public NavigationSessionState(List<Byte> list) {
        this.serialized = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.serialized, ((NavigationSessionState) obj).serialized);
    }

    public List<Byte> getSerialized() {
        return this.serialized;
    }

    public int hashCode() {
        return Objects.hash(this.serialized);
    }

    public String toString() {
        return b.i("]", new StringBuilder("[serialized: "), this.serialized);
    }
}
