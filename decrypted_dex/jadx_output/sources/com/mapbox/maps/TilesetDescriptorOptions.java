package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TilesetDescriptorOptions implements Serializable {
    private final Value extraOptions;
    private final byte maxZoom;
    private final byte minZoom;
    private final float pixelRatio;
    private final StylePackLoadOptions stylePackOptions;
    private final String styleURI;
    private final List<String> tilesets;

    /* renamed from: com.mapbox.maps.TilesetDescriptorOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Value extraOptions;
        private byte maxZoom;
        private byte minZoom;
        private float pixelRatio = 1.0f;
        private StylePackLoadOptions stylePackOptions;
        private String styleURI;
        private List<String> tilesets;

        public TilesetDescriptorOptions build() {
            if (this.styleURI != null) {
                return new TilesetDescriptorOptions(this.styleURI, this.minZoom, this.maxZoom, this.pixelRatio, this.tilesets, this.stylePackOptions, this.extraOptions, null);
            }
            throw new NullPointerException(StubApp.getString2(14310));
        }

        public Builder extraOptions(Value value) {
            this.extraOptions = value;
            return this;
        }

        public Builder maxZoom(byte b2) {
            this.maxZoom = b2;
            return this;
        }

        public Builder minZoom(byte b2) {
            this.minZoom = b2;
            return this;
        }

        public Builder pixelRatio(float f10) {
            this.pixelRatio = f10;
            return this;
        }

        public Builder stylePackOptions(StylePackLoadOptions stylePackLoadOptions) {
            this.stylePackOptions = stylePackLoadOptions;
            return this;
        }

        public Builder styleURI(String str) {
            this.styleURI = str;
            return this;
        }

        public Builder tilesets(List<String> list) {
            this.tilesets = list;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ TilesetDescriptorOptions(String str, byte b2, byte b10, float f10, List list, StylePackLoadOptions stylePackLoadOptions, Value value, AnonymousClass1 anonymousClass1) {
        this(str, b2, b10, f10, list, stylePackLoadOptions, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TilesetDescriptorOptions.class != obj.getClass()) {
            return false;
        }
        TilesetDescriptorOptions tilesetDescriptorOptions = (TilesetDescriptorOptions) obj;
        return Objects.equals(this.styleURI, tilesetDescriptorOptions.styleURI) && this.minZoom == tilesetDescriptorOptions.minZoom && this.maxZoom == tilesetDescriptorOptions.maxZoom && PartialEq.compare(this.pixelRatio, tilesetDescriptorOptions.pixelRatio) && Objects.equals(this.tilesets, tilesetDescriptorOptions.tilesets) && Objects.equals(this.stylePackOptions, tilesetDescriptorOptions.stylePackOptions) && Objects.equals(this.extraOptions, tilesetDescriptorOptions.extraOptions);
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public byte getMaxZoom() {
        return this.maxZoom;
    }

    public byte getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public StylePackLoadOptions getStylePackOptions() {
        return this.stylePackOptions;
    }

    public String getStyleURI() {
        return this.styleURI;
    }

    public List<String> getTilesets() {
        return this.tilesets;
    }

    public int hashCode() {
        return Objects.hash(this.styleURI, Byte.valueOf(this.minZoom), Byte.valueOf(this.maxZoom), Float.valueOf(this.pixelRatio), this.tilesets, this.stylePackOptions, this.extraOptions);
    }

    public Builder toBuilder() {
        return new Builder().styleURI(this.styleURI).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).tilesets(this.tilesets).stylePackOptions(this.stylePackOptions).extraOptions(this.extraOptions);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[styleURI: ");
        Xa.h.z(sb2, this.styleURI, ", minZoom: ");
        sb2.append(RecordUtils.fieldToString(Byte.valueOf(this.minZoom)));
        sb2.append(", maxZoom: ");
        sb2.append(RecordUtils.fieldToString(Byte.valueOf(this.maxZoom)));
        sb2.append(", pixelRatio: ");
        com.mapbox.common.b.n(this.pixelRatio, sb2, ", tilesets: ");
        com.mapbox.common.b.v(", stylePackOptions: ", sb2, this.tilesets);
        sb2.append(RecordUtils.fieldToString(this.stylePackOptions));
        sb2.append(", extraOptions: ");
        sb2.append(RecordUtils.fieldToString(this.extraOptions));
        sb2.append("]");
        return sb2.toString();
    }

    private TilesetDescriptorOptions(String str, byte b2, byte b10, float f10, List<String> list, StylePackLoadOptions stylePackLoadOptions, Value value) {
        this.styleURI = str;
        this.minZoom = b2;
        this.maxZoom = b10;
        this.pixelRatio = f10;
        this.tilesets = list;
        this.stylePackOptions = stylePackLoadOptions;
        this.extraOptions = value;
    }

    private TilesetDescriptorOptions(String str, byte b2, byte b10, List<String> list, StylePackLoadOptions stylePackLoadOptions, Value value) {
        this.styleURI = str;
        this.minZoom = b2;
        this.maxZoom = b10;
        this.tilesets = list;
        this.stylePackOptions = stylePackLoadOptions;
        this.extraOptions = value;
        this.pixelRatio = 1.0f;
    }
}
