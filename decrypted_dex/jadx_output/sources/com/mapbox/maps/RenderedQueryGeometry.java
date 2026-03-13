package com.mapbox.maps;

import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class RenderedQueryGeometry {
    private Type type;
    private Object value;

    public enum Type {
        SCREEN_BOX,
        SCREEN_COORDINATE,
        LIST
    }

    public RenderedQueryGeometry(ScreenBox screenBox) {
        this.type = Type.SCREEN_BOX;
        this.value = screenBox;
    }

    public static RenderedQueryGeometry valueOf(ScreenBox screenBox) {
        return new RenderedQueryGeometry(screenBox);
    }

    public List<ScreenCoordinate> getList() {
        if (isList()) {
            return (List) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(14152));
    }

    public ScreenBox getScreenBox() {
        if (isScreenBox()) {
            return (ScreenBox) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(14153));
    }

    public ScreenCoordinate getScreenCoordinate() {
        if (isScreenCoordinate()) {
            return (ScreenCoordinate) this.value;
        }
        throw new IllegalStateException(StubApp.getString2(14154));
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isList() {
        return this.type == Type.LIST;
    }

    public boolean isScreenBox() {
        return this.type == Type.SCREEN_BOX;
    }

    public boolean isScreenCoordinate() {
        return this.type == Type.SCREEN_COORDINATE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static RenderedQueryGeometry valueOf(ScreenCoordinate screenCoordinate) {
        return new RenderedQueryGeometry(screenCoordinate);
    }

    public static RenderedQueryGeometry valueOf(List<ScreenCoordinate> list) {
        return new RenderedQueryGeometry(list);
    }

    public RenderedQueryGeometry(ScreenCoordinate screenCoordinate) {
        this.type = Type.SCREEN_COORDINATE;
        this.value = screenCoordinate;
    }

    public RenderedQueryGeometry(List<ScreenCoordinate> list) {
        this.type = Type.LIST;
        this.value = list;
    }
}
