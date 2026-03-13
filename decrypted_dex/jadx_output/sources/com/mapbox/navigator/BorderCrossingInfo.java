package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BorderCrossingInfo implements Serializable {
    private final AdminInfo from;
    private final String id;
    private final AdminInfo to;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public BorderCrossingInfo(String str, AdminInfo adminInfo, AdminInfo adminInfo2) {
        this.id = str;
        this.from = adminInfo;
        this.to = adminInfo2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BorderCrossingInfo borderCrossingInfo = (BorderCrossingInfo) obj;
        return Objects.equals(this.id, borderCrossingInfo.id) && Objects.equals(this.from, borderCrossingInfo.from) && Objects.equals(this.to, borderCrossingInfo.to);
    }

    public AdminInfo getFrom() {
        return this.from;
    }

    public String getId() {
        return this.id;
    }

    public AdminInfo getTo() {
        return this.to;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.from, this.to);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", from: ");
        sb2.append(RecordUtils.fieldToString(this.from));
        sb2.append(", to: ");
        sb2.append(RecordUtils.fieldToString(this.to));
        sb2.append("]");
        return sb2.toString();
    }
}
