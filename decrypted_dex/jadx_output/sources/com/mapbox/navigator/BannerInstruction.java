package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BannerInstruction implements Serializable {
    private final int index;
    private final BannerSection primary;
    private final float remainingStepDistance;
    private final BannerSection secondary;
    private final BannerSection sub;
    private final BannerSection view;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public BannerInstruction(BannerSection bannerSection, BannerSection bannerSection2, BannerSection bannerSection3, BannerSection bannerSection4, float f10, int i3) {
        this.primary = bannerSection;
        this.view = bannerSection2;
        this.secondary = bannerSection3;
        this.sub = bannerSection4;
        this.remainingStepDistance = f10;
        this.index = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerInstruction bannerInstruction = (BannerInstruction) obj;
        return Objects.equals(this.primary, bannerInstruction.primary) && Objects.equals(this.view, bannerInstruction.view) && Objects.equals(this.secondary, bannerInstruction.secondary) && Objects.equals(this.sub, bannerInstruction.sub) && PartialEq.compare(this.remainingStepDistance, bannerInstruction.remainingStepDistance) && this.index == bannerInstruction.index;
    }

    public int getIndex() {
        return this.index;
    }

    public BannerSection getPrimary() {
        return this.primary;
    }

    public float getRemainingStepDistance() {
        return this.remainingStepDistance;
    }

    public BannerSection getSecondary() {
        return this.secondary;
    }

    public BannerSection getSub() {
        return this.sub;
    }

    public BannerSection getView() {
        return this.view;
    }

    public int hashCode() {
        return Objects.hash(this.primary, this.view, this.secondary, this.sub, Float.valueOf(this.remainingStepDistance), Integer.valueOf(this.index));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[primary: ");
        sb2.append(RecordUtils.fieldToString(this.primary));
        sb2.append(", view: ");
        sb2.append(RecordUtils.fieldToString(this.view));
        sb2.append(", secondary: ");
        sb2.append(RecordUtils.fieldToString(this.secondary));
        sb2.append(", sub: ");
        sb2.append(RecordUtils.fieldToString(this.sub));
        sb2.append(", remainingStepDistance: ");
        b.n(this.remainingStepDistance, sb2, ", index: ");
        return b.g(this.index, "]", sb2);
    }
}
