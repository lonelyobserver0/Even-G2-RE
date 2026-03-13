package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ScreenshotFormat implements Serializable {
    private final String base64;
    private final DataRef jpeg;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ScreenshotFormat(DataRef dataRef, String str) {
        this.jpeg = dataRef;
        this.base64 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScreenshotFormat screenshotFormat = (ScreenshotFormat) obj;
        return Objects.equals(this.jpeg, screenshotFormat.jpeg) && Objects.equals(this.base64, screenshotFormat.base64);
    }

    public String getBase64() {
        return this.base64;
    }

    public DataRef getJpeg() {
        return this.jpeg;
    }

    public int hashCode() {
        return Objects.hash(this.jpeg, this.base64);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[jpeg: ");
        sb2.append(RecordUtils.fieldToString(this.jpeg));
        sb2.append(", base64: ");
        return h.t(sb2, this.base64, "]");
    }
}
