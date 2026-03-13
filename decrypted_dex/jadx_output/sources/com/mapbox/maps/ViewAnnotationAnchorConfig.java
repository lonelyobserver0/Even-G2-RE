package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ViewAnnotationAnchorConfig implements Serializable {
    private final ViewAnnotationAnchor anchor;
    private final double offsetX;
    private final double offsetY;

    /* renamed from: com.mapbox.maps.ViewAnnotationAnchorConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private ViewAnnotationAnchor anchor;
        private double offsetX;
        private double offsetY;

        public Builder anchor(ViewAnnotationAnchor viewAnnotationAnchor) {
            this.anchor = viewAnnotationAnchor;
            return this;
        }

        public ViewAnnotationAnchorConfig build() {
            if (this.anchor != null) {
                return new ViewAnnotationAnchorConfig(this.anchor, this.offsetX, this.offsetY, null);
            }
            throw new NullPointerException(StubApp.getString2(14324));
        }

        public Builder offsetX(double d8) {
            this.offsetX = d8;
            return this;
        }

        public Builder offsetY(double d8) {
            this.offsetY = d8;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ ViewAnnotationAnchorConfig(ViewAnnotationAnchor viewAnnotationAnchor, double d8, double d10, AnonymousClass1 anonymousClass1) {
        this(viewAnnotationAnchor, d8, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ViewAnnotationAnchorConfig.class != obj.getClass()) {
            return false;
        }
        ViewAnnotationAnchorConfig viewAnnotationAnchorConfig = (ViewAnnotationAnchorConfig) obj;
        return Objects.equals(this.anchor, viewAnnotationAnchorConfig.anchor) && PartialEq.compare(this.offsetX, viewAnnotationAnchorConfig.offsetX) && PartialEq.compare(this.offsetY, viewAnnotationAnchorConfig.offsetY);
    }

    public ViewAnnotationAnchor getAnchor() {
        return this.anchor;
    }

    public double getOffsetX() {
        return this.offsetX;
    }

    public double getOffsetY() {
        return this.offsetY;
    }

    public int hashCode() {
        return Objects.hash(this.anchor, Double.valueOf(this.offsetX), Double.valueOf(this.offsetY));
    }

    public Builder toBuilder() {
        return new Builder().anchor(this.anchor).offsetX(this.offsetX).offsetY(this.offsetY);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[anchor: ");
        sb2.append(RecordUtils.fieldToString(this.anchor));
        sb2.append(", offsetX: ");
        com.mapbox.common.b.m(this.offsetX, sb2, ", offsetY: ");
        return com.mapbox.common.b.f(this.offsetY, sb2, "]");
    }

    private ViewAnnotationAnchorConfig(ViewAnnotationAnchor viewAnnotationAnchor, double d8, double d10) {
        this.anchor = viewAnnotationAnchor;
        this.offsetX = d8;
        this.offsetY = d10;
    }
}
