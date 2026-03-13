package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LocalizedString implements Serializable {
    private final String language;
    private final String value;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LocalizedString(String str, String str2) {
        this.language = str;
        this.value = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocalizedString localizedString = (LocalizedString) obj;
        return Objects.equals(this.language, localizedString.language) && Objects.equals(this.value, localizedString.value);
    }

    public String getLanguage() {
        return this.language;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.language, this.value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[language: ");
        h.z(sb2, this.language, ", value: ");
        return h.t(sb2, this.value, "]");
    }
}
