package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CustomRasterSourceClient {
    private Type type;
    private Object value;

    public enum Type {
        CUSTOM_RASTER_SOURCE_TILE_STATUS_CHANGED_CALLBACK,
        CUSTOM_RASTER_SOURCE_TILE_RENDERER
    }

    public CustomRasterSourceClient(CustomRasterSourceTileStatusChangedCallback customRasterSourceTileStatusChangedCallback) {
        this.type = Type.CUSTOM_RASTER_SOURCE_TILE_STATUS_CHANGED_CALLBACK;
        this.value = customRasterSourceTileStatusChangedCallback;
    }

    public static CustomRasterSourceClient valueOf(CustomRasterSourceTileStatusChangedCallback customRasterSourceTileStatusChangedCallback) {
        return new CustomRasterSourceClient(customRasterSourceTileStatusChangedCallback);
    }

    public CustomRasterSourceTileRenderer getCustomRasterSourceTileRenderer() {
        if (isCustomRasterSourceTileRenderer()) {
            return (CustomRasterSourceTileRenderer) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13902));
    }

    public CustomRasterSourceTileStatusChangedCallback getCustomRasterSourceTileStatusChangedCallback() {
        if (isCustomRasterSourceTileStatusChangedCallback()) {
            return (CustomRasterSourceTileStatusChangedCallback) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13903));
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isCustomRasterSourceTileRenderer() {
        return this.type == Type.CUSTOM_RASTER_SOURCE_TILE_RENDERER;
    }

    public boolean isCustomRasterSourceTileStatusChangedCallback() {
        return this.type == Type.CUSTOM_RASTER_SOURCE_TILE_STATUS_CHANGED_CALLBACK;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static CustomRasterSourceClient valueOf(CustomRasterSourceTileRenderer customRasterSourceTileRenderer) {
        return new CustomRasterSourceClient(customRasterSourceTileRenderer);
    }

    public CustomRasterSourceClient(CustomRasterSourceTileRenderer customRasterSourceTileRenderer) {
        this.type = Type.CUSTOM_RASTER_SOURCE_TILE_RENDERER;
        this.value = customRasterSourceTileRenderer;
    }
}
