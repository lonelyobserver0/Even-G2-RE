package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BannerComponent implements Serializable {
    private final String abbr;
    private final Integer abbrPriority;
    private final Boolean active;
    private final String activeDirection;
    private final List<String> directions;
    private final String imageBaseUrl;
    private final String imageURL;
    private final Shield shield;
    private final BannerComponentSubType subType;
    private final String text;
    private final String type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public BannerComponent(String str, String str2, String str3, Integer num, String str4, Boolean bool, List<String> list, String str5, String str6, BannerComponentSubType bannerComponentSubType, Shield shield) {
        this.type = str;
        this.text = str2;
        this.abbr = str3;
        this.abbrPriority = num;
        this.imageBaseUrl = str4;
        this.active = bool;
        this.directions = list;
        this.activeDirection = str5;
        this.imageURL = str6;
        this.subType = bannerComponentSubType;
        this.shield = shield;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerComponent bannerComponent = (BannerComponent) obj;
        return Objects.equals(this.type, bannerComponent.type) && Objects.equals(this.text, bannerComponent.text) && Objects.equals(this.abbr, bannerComponent.abbr) && Objects.equals(this.abbrPriority, bannerComponent.abbrPriority) && Objects.equals(this.imageBaseUrl, bannerComponent.imageBaseUrl) && Objects.equals(this.active, bannerComponent.active) && Objects.equals(this.directions, bannerComponent.directions) && Objects.equals(this.activeDirection, bannerComponent.activeDirection) && Objects.equals(this.imageURL, bannerComponent.imageURL) && Objects.equals(this.subType, bannerComponent.subType) && Objects.equals(this.shield, bannerComponent.shield);
    }

    public String getAbbr() {
        return this.abbr;
    }

    public Integer getAbbrPriority() {
        return this.abbrPriority;
    }

    public Boolean getActive() {
        return this.active;
    }

    public String getActiveDirection() {
        return this.activeDirection;
    }

    public List<String> getDirections() {
        return this.directions;
    }

    public String getImageBaseUrl() {
        return this.imageBaseUrl;
    }

    public String getImageURL() {
        return this.imageURL;
    }

    public Shield getShield() {
        return this.shield;
    }

    public BannerComponentSubType getSubType() {
        return this.subType;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.text, this.abbr, this.abbrPriority, this.imageBaseUrl, this.active, this.directions, this.activeDirection, this.imageURL, this.subType, this.shield);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[type: ");
        h.z(sb2, this.type, ", text: ");
        h.z(sb2, this.text, ", abbr: ");
        h.z(sb2, this.abbr, ", abbrPriority: ");
        b.t(this.abbrPriority, sb2, ", imageBaseUrl: ");
        h.z(sb2, this.imageBaseUrl, ", active: ");
        b.w(sb2, ", directions: ", this.active);
        b.v(", activeDirection: ", sb2, this.directions);
        h.z(sb2, this.activeDirection, ", imageURL: ");
        h.z(sb2, this.imageURL, ", subType: ");
        sb2.append(RecordUtils.fieldToString(this.subType));
        sb2.append(", shield: ");
        sb2.append(RecordUtils.fieldToString(this.shield));
        sb2.append("]");
        return sb2.toString();
    }
}
