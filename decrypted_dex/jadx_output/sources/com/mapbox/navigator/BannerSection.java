package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BannerSection implements Serializable {
    private final List<BannerComponent> components;
    private final Integer degrees;
    private final String drivingSide;
    private final String modifier;
    private final String text;
    private final String type;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public BannerSection(String str, String str2, String str3, Integer num, String str4, List<BannerComponent> list) {
        this.text = str;
        this.type = str2;
        this.modifier = str3;
        this.degrees = num;
        this.drivingSide = str4;
        this.components = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerSection bannerSection = (BannerSection) obj;
        return Objects.equals(this.text, bannerSection.text) && Objects.equals(this.type, bannerSection.type) && Objects.equals(this.modifier, bannerSection.modifier) && Objects.equals(this.degrees, bannerSection.degrees) && Objects.equals(this.drivingSide, bannerSection.drivingSide) && Objects.equals(this.components, bannerSection.components);
    }

    public List<BannerComponent> getComponents() {
        return this.components;
    }

    public Integer getDegrees() {
        return this.degrees;
    }

    public String getDrivingSide() {
        return this.drivingSide;
    }

    public String getModifier() {
        return this.modifier;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.text, this.type, this.modifier, this.degrees, this.drivingSide, this.components);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[text: ");
        h.z(sb2, this.text, ", type: ");
        h.z(sb2, this.type, ", modifier: ");
        h.z(sb2, this.modifier, ", degrees: ");
        b.t(this.degrees, sb2, ", drivingSide: ");
        h.z(sb2, this.drivingSide, ", components: ");
        return b.i("]", sb2, this.components);
    }
}
