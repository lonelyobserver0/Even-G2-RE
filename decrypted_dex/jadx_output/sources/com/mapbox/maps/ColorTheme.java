package com.mapbox.maps;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ColorTheme {
    private Type type;
    private Object value;

    public enum Type {
        IMAGE,
        STYLE_PROPERTY_VALUE
    }

    public ColorTheme(Image image) {
        this.type = Type.IMAGE;
        this.value = image;
    }

    public static ColorTheme valueOf(Image image) {
        return new ColorTheme(image);
    }

    public Image getImage() {
        if (isImage()) {
            return (Image) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13891));
    }

    public StylePropertyValue getStylePropertyValue() {
        if (isStylePropertyValue()) {
            return (StylePropertyValue) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(13892));
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isImage() {
        return this.type == Type.IMAGE;
    }

    public boolean isStylePropertyValue() {
        return this.type == Type.STYLE_PROPERTY_VALUE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static ColorTheme valueOf(StylePropertyValue stylePropertyValue) {
        return new ColorTheme(stylePropertyValue);
    }

    public ColorTheme(StylePropertyValue stylePropertyValue) {
        this.type = Type.STYLE_PROPERTY_VALUE;
        this.value = stylePropertyValue;
    }
}
