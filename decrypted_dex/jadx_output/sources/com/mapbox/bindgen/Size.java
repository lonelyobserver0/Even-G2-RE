package com.mapbox.bindgen;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Size {
    private final int height;
    private final int width;

    public Size(int i3, int i10) {
        this.width = i3;
        this.height = i10;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i3 = this.height;
        int i10 = this.width;
        return i3 ^ ((i10 >>> 16) | (i10 << 16));
    }

    public String toString() {
        return this.width + StubApp.getString2(925) + this.height;
    }
}
