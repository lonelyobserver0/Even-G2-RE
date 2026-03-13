package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class RoadName implements Serializable {
    private final String imageBaseUrl;
    private final String language;
    private final Shield shield;
    private final String text;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadName(String str, String str2, String str3, Shield shield) {
        this.text = str;
        this.language = str2;
        this.imageBaseUrl = str3;
        this.shield = shield;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadName roadName = (RoadName) obj;
        return Objects.equals(this.text, roadName.text) && Objects.equals(this.language, roadName.language) && Objects.equals(this.imageBaseUrl, roadName.imageBaseUrl) && Objects.equals(this.shield, roadName.shield);
    }

    public String getImageBaseUrl() {
        return this.imageBaseUrl;
    }

    public String getLanguage() {
        return this.language;
    }

    public Shield getShield() {
        return this.shield;
    }

    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return Objects.hash(this.text, this.language, this.imageBaseUrl, this.shield);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[text: ");
        h.z(sb2, this.text, ", language: ");
        h.z(sb2, this.language, ", imageBaseUrl: ");
        h.z(sb2, this.imageBaseUrl, ", shield: ");
        sb2.append(RecordUtils.fieldToString(this.shield));
        sb2.append("]");
        return sb2.toString();
    }
}
