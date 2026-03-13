package com.mapbox.navigator.match.openlr;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class OpenLR implements Serializable {
    private final String base64Encoded;
    private final Standard standard;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public OpenLR(String str, Standard standard) {
        this.base64Encoded = str;
        this.standard = standard;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenLR openLR = (OpenLR) obj;
        return Objects.equals(this.base64Encoded, openLR.base64Encoded) && Objects.equals(this.standard, openLR.standard);
    }

    public String getBase64Encoded() {
        return this.base64Encoded;
    }

    public Standard getStandard() {
        return this.standard;
    }

    public int hashCode() {
        return Objects.hash(this.base64Encoded, this.standard);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[base64Encoded: ");
        h.z(sb2, this.base64Encoded, ", standard: ");
        sb2.append(RecordUtils.fieldToString(this.standard));
        sb2.append("]");
        return sb2.toString();
    }
}
