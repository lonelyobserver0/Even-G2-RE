package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class Shield implements Serializable {
    private final String baseUrl;
    private final String displayRef;
    private final String name;
    private final String textColor;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Shield(String str, String str2, String str3, String str4) {
        this.baseUrl = str;
        this.displayRef = str2;
        this.name = str3;
        this.textColor = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Shield shield = (Shield) obj;
        return Objects.equals(this.baseUrl, shield.baseUrl) && Objects.equals(this.displayRef, shield.displayRef) && Objects.equals(this.name, shield.name) && Objects.equals(this.textColor, shield.textColor);
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getDisplayRef() {
        return this.displayRef;
    }

    public String getName() {
        return this.name;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return Objects.hash(this.baseUrl, this.displayRef, this.name, this.textColor);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[baseUrl: ");
        h.z(sb2, this.baseUrl, ", displayRef: ");
        h.z(sb2, this.displayRef, ", name: ");
        h.z(sb2, this.name, ", textColor: ");
        return h.t(sb2, this.textColor, "]");
    }
}
