package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ViewAnnotationOptions implements Serializable {
    private final Boolean allowOverlap;
    private final Boolean allowOverlapWithPuck;
    private final Boolean allowZElevate;
    private final AnnotatedFeature annotatedFeature;
    private final Double height;
    private final Boolean ignoreCameraPadding;
    private final Float maxZoom;
    private final Float minZoom;
    private final Long priority;
    private final Boolean selected;
    private final List<ViewAnnotationAnchorConfig> variableAnchors;
    private final Boolean visible;
    private final Double width;

    /* renamed from: com.mapbox.maps.ViewAnnotationOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Boolean allowOverlap;
        private Boolean allowOverlapWithPuck;
        private Boolean allowZElevate;
        private AnnotatedFeature annotatedFeature;
        private Double height;
        private Boolean ignoreCameraPadding;
        private Float maxZoom;
        private Float minZoom;
        private Long priority;
        private Boolean selected;
        private List<ViewAnnotationAnchorConfig> variableAnchors;
        private Boolean visible;
        private Double width;

        public Builder allowOverlap(Boolean bool) {
            this.allowOverlap = bool;
            return this;
        }

        public Builder allowOverlapWithPuck(Boolean bool) {
            this.allowOverlapWithPuck = bool;
            return this;
        }

        public Builder allowZElevate(Boolean bool) {
            this.allowZElevate = bool;
            return this;
        }

        public Builder annotatedFeature(AnnotatedFeature annotatedFeature) {
            this.annotatedFeature = annotatedFeature;
            return this;
        }

        public ViewAnnotationOptions build() {
            return new ViewAnnotationOptions(this.annotatedFeature, this.width, this.height, this.allowOverlap, this.allowOverlapWithPuck, this.allowZElevate, this.visible, this.variableAnchors, this.selected, this.priority, this.ignoreCameraPadding, this.minZoom, this.maxZoom, null);
        }

        public Builder height(Double d8) {
            this.height = d8;
            return this;
        }

        public Builder ignoreCameraPadding(Boolean bool) {
            this.ignoreCameraPadding = bool;
            return this;
        }

        public Builder maxZoom(Float f10) {
            this.maxZoom = f10;
            return this;
        }

        public Builder minZoom(Float f10) {
            this.minZoom = f10;
            return this;
        }

        public Builder priority(Long l9) {
            this.priority = l9;
            return this;
        }

        @Deprecated
        public Builder selected(Boolean bool) {
            this.selected = bool;
            return this;
        }

        public Builder variableAnchors(List<ViewAnnotationAnchorConfig> list) {
            this.variableAnchors = list;
            return this;
        }

        public Builder visible(Boolean bool) {
            this.visible = bool;
            return this;
        }

        public Builder width(Double d8) {
            this.width = d8;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ ViewAnnotationOptions(AnnotatedFeature annotatedFeature, Double d8, Double d10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, Boolean bool5, Long l9, Boolean bool6, Float f10, Float f11, AnonymousClass1 anonymousClass1) {
        this(annotatedFeature, d8, d10, bool, bool2, bool3, bool4, list, bool5, l9, bool6, f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ViewAnnotationOptions.class != obj.getClass()) {
            return false;
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) obj;
        return Objects.equals(this.annotatedFeature, viewAnnotationOptions.annotatedFeature) && Objects.equals(this.width, viewAnnotationOptions.width) && Objects.equals(this.height, viewAnnotationOptions.height) && Objects.equals(this.allowOverlap, viewAnnotationOptions.allowOverlap) && Objects.equals(this.allowOverlapWithPuck, viewAnnotationOptions.allowOverlapWithPuck) && Objects.equals(this.allowZElevate, viewAnnotationOptions.allowZElevate) && Objects.equals(this.visible, viewAnnotationOptions.visible) && Objects.equals(this.variableAnchors, viewAnnotationOptions.variableAnchors) && Objects.equals(this.selected, viewAnnotationOptions.selected) && Objects.equals(this.priority, viewAnnotationOptions.priority) && Objects.equals(this.ignoreCameraPadding, viewAnnotationOptions.ignoreCameraPadding) && Objects.equals(this.minZoom, viewAnnotationOptions.minZoom) && Objects.equals(this.maxZoom, viewAnnotationOptions.maxZoom);
    }

    public Boolean getAllowOverlap() {
        return this.allowOverlap;
    }

    public Boolean getAllowOverlapWithPuck() {
        return this.allowOverlapWithPuck;
    }

    public Boolean getAllowZElevate() {
        return this.allowZElevate;
    }

    public AnnotatedFeature getAnnotatedFeature() {
        return this.annotatedFeature;
    }

    public Double getHeight() {
        return this.height;
    }

    public Boolean getIgnoreCameraPadding() {
        return this.ignoreCameraPadding;
    }

    public Float getMaxZoom() {
        return this.maxZoom;
    }

    public Float getMinZoom() {
        return this.minZoom;
    }

    public Long getPriority() {
        return this.priority;
    }

    @Deprecated
    public Boolean getSelected() {
        return this.selected;
    }

    public List<ViewAnnotationAnchorConfig> getVariableAnchors() {
        return this.variableAnchors;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(this.annotatedFeature, this.width, this.height, this.allowOverlap, this.allowOverlapWithPuck, this.allowZElevate, this.visible, this.variableAnchors, this.selected, this.priority, this.ignoreCameraPadding, this.minZoom, this.maxZoom);
    }

    public Builder toBuilder() {
        return new Builder().annotatedFeature(this.annotatedFeature).width(this.width).height(this.height).allowOverlap(this.allowOverlap).allowOverlapWithPuck(this.allowOverlapWithPuck).allowZElevate(this.allowZElevate).visible(this.visible).variableAnchors(this.variableAnchors).selected(this.selected).priority(this.priority).ignoreCameraPadding(this.ignoreCameraPadding).minZoom(this.minZoom).maxZoom(this.maxZoom);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[annotatedFeature: ");
        sb2.append(RecordUtils.fieldToString(this.annotatedFeature));
        sb2.append(", width: ");
        com.mapbox.common.b.r(this.width, sb2, ", height: ");
        com.mapbox.common.b.r(this.height, sb2, ", allowOverlap: ");
        com.mapbox.common.b.w(sb2, ", allowOverlapWithPuck: ", this.allowOverlap);
        com.mapbox.common.b.w(sb2, ", allowZElevate: ", this.allowOverlapWithPuck);
        com.mapbox.common.b.w(sb2, ", visible: ", this.allowZElevate);
        com.mapbox.common.b.w(sb2, ", variableAnchors: ", this.visible);
        com.mapbox.common.b.v(", selected: ", sb2, this.variableAnchors);
        com.mapbox.common.b.w(sb2, ", priority: ", this.selected);
        com.mapbox.common.b.u(this.priority, sb2, ", ignoreCameraPadding: ");
        com.mapbox.common.b.w(sb2, ", minZoom: ", this.ignoreCameraPadding);
        com.mapbox.common.b.s(this.minZoom, sb2, ", maxZoom: ");
        sb2.append(RecordUtils.fieldToString(this.maxZoom));
        sb2.append("]");
        return sb2.toString();
    }

    private ViewAnnotationOptions(AnnotatedFeature annotatedFeature, Double d8, Double d10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<ViewAnnotationAnchorConfig> list, Boolean bool5, Long l9, Boolean bool6, Float f10, Float f11) {
        this.annotatedFeature = annotatedFeature;
        this.width = d8;
        this.height = d10;
        this.allowOverlap = bool;
        this.allowOverlapWithPuck = bool2;
        this.allowZElevate = bool3;
        this.visible = bool4;
        this.variableAnchors = list;
        this.selected = bool5;
        this.priority = l9;
        this.ignoreCameraPadding = bool6;
        this.minZoom = f10;
        this.maxZoom = f11;
    }
}
