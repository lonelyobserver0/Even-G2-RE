package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class RuntimeStylingOptions implements Serializable {
    private final StyleManagerCallback canceledCallback;
    private final StyleManagerCallback completedCallback;
    private final StyleManagerErrorCallback errorCallback;
    private final StyleManagerCallback imagesCallback;
    private final StyleManagerCallback layersCallback;
    private final StyleManagerCallback sourcesCallback;

    /* renamed from: com.mapbox.maps.RuntimeStylingOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private StyleManagerCallback canceledCallback;
        private StyleManagerCallback completedCallback;
        private StyleManagerErrorCallback errorCallback;
        private StyleManagerCallback imagesCallback;
        private StyleManagerCallback layersCallback;
        private StyleManagerCallback sourcesCallback;

        public RuntimeStylingOptions build() {
            return new RuntimeStylingOptions(this.sourcesCallback, this.layersCallback, this.imagesCallback, this.completedCallback, this.canceledCallback, this.errorCallback, null);
        }

        public Builder canceledCallback(StyleManagerCallback styleManagerCallback) {
            this.canceledCallback = styleManagerCallback;
            return this;
        }

        public Builder completedCallback(StyleManagerCallback styleManagerCallback) {
            this.completedCallback = styleManagerCallback;
            return this;
        }

        public Builder errorCallback(StyleManagerErrorCallback styleManagerErrorCallback) {
            this.errorCallback = styleManagerErrorCallback;
            return this;
        }

        public Builder imagesCallback(StyleManagerCallback styleManagerCallback) {
            this.imagesCallback = styleManagerCallback;
            return this;
        }

        public Builder layersCallback(StyleManagerCallback styleManagerCallback) {
            this.layersCallback = styleManagerCallback;
            return this;
        }

        public Builder sourcesCallback(StyleManagerCallback styleManagerCallback) {
            this.sourcesCallback = styleManagerCallback;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ RuntimeStylingOptions(StyleManagerCallback styleManagerCallback, StyleManagerCallback styleManagerCallback2, StyleManagerCallback styleManagerCallback3, StyleManagerCallback styleManagerCallback4, StyleManagerCallback styleManagerCallback5, StyleManagerErrorCallback styleManagerErrorCallback, AnonymousClass1 anonymousClass1) {
        this(styleManagerCallback, styleManagerCallback2, styleManagerCallback3, styleManagerCallback4, styleManagerCallback5, styleManagerErrorCallback);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuntimeStylingOptions runtimeStylingOptions = (RuntimeStylingOptions) obj;
        return Objects.equals(this.sourcesCallback, runtimeStylingOptions.sourcesCallback) && Objects.equals(this.layersCallback, runtimeStylingOptions.layersCallback) && Objects.equals(this.imagesCallback, runtimeStylingOptions.imagesCallback) && Objects.equals(this.completedCallback, runtimeStylingOptions.completedCallback) && Objects.equals(this.canceledCallback, runtimeStylingOptions.canceledCallback) && Objects.equals(this.errorCallback, runtimeStylingOptions.errorCallback);
    }

    public StyleManagerCallback getCanceledCallback() {
        return this.canceledCallback;
    }

    public StyleManagerCallback getCompletedCallback() {
        return this.completedCallback;
    }

    public StyleManagerErrorCallback getErrorCallback() {
        return this.errorCallback;
    }

    public StyleManagerCallback getImagesCallback() {
        return this.imagesCallback;
    }

    public StyleManagerCallback getLayersCallback() {
        return this.layersCallback;
    }

    public StyleManagerCallback getSourcesCallback() {
        return this.sourcesCallback;
    }

    public int hashCode() {
        return Objects.hash(this.sourcesCallback, this.layersCallback, this.imagesCallback, this.completedCallback, this.canceledCallback, this.errorCallback);
    }

    public Builder toBuilder() {
        return new Builder().sourcesCallback(this.sourcesCallback).layersCallback(this.layersCallback).imagesCallback(this.imagesCallback).completedCallback(this.completedCallback).canceledCallback(this.canceledCallback).errorCallback(this.errorCallback);
    }

    public String toString() {
        return "[sourcesCallback: " + RecordUtils.fieldToString(this.sourcesCallback) + ", layersCallback: " + RecordUtils.fieldToString(this.layersCallback) + ", imagesCallback: " + RecordUtils.fieldToString(this.imagesCallback) + ", completedCallback: " + RecordUtils.fieldToString(this.completedCallback) + ", canceledCallback: " + RecordUtils.fieldToString(this.canceledCallback) + ", errorCallback: " + RecordUtils.fieldToString(this.errorCallback) + "]";
    }

    private RuntimeStylingOptions(StyleManagerCallback styleManagerCallback, StyleManagerCallback styleManagerCallback2, StyleManagerCallback styleManagerCallback3, StyleManagerCallback styleManagerCallback4, StyleManagerCallback styleManagerCallback5, StyleManagerErrorCallback styleManagerErrorCallback) {
        this.sourcesCallback = styleManagerCallback;
        this.layersCallback = styleManagerCallback2;
        this.imagesCallback = styleManagerCallback3;
        this.completedCallback = styleManagerCallback4;
        this.canceledCallback = styleManagerCallback5;
        this.errorCallback = styleManagerErrorCallback;
    }
}
