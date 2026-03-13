package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ConfigurationServiceError implements Serializable {
    private final ConfigurationServiceErrorCode code;
    private final String message;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ConfigurationServiceError(ConfigurationServiceErrorCode configurationServiceErrorCode, String str) {
        this.code = configurationServiceErrorCode;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationServiceError configurationServiceError = (ConfigurationServiceError) obj;
        return Objects.equals(this.code, configurationServiceError.code) && Objects.equals(this.message, configurationServiceError.message);
    }

    public ConfigurationServiceErrorCode getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return Objects.hash(this.code, this.message);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[code: ");
        sb2.append(RecordUtils.fieldToString(this.code));
        sb2.append(", message: ");
        return h.t(sb2, this.message, "]");
    }
}
