package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JctInfo implements Serializable {
    private final String id;
    private final List<LocalizedString> name;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public JctInfo(String str, List<LocalizedString> list) {
        this.id = str;
        this.name = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JctInfo jctInfo = (JctInfo) obj;
        return Objects.equals(this.id, jctInfo.id) && Objects.equals(this.name, jctInfo.name);
    }

    public String getId() {
        return this.id;
    }

    public List<LocalizedString> getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", name: ");
        return b.i("]", sb2, this.name);
    }
}
