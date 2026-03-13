package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ConfigurationOptions implements Serializable {
    private final Value data;
    private final String digest;
    private final ConfigurationOptionsSource source;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ConfigurationOptions(Value value, String str, ConfigurationOptionsSource configurationOptionsSource) {
        this.data = value;
        this.digest = str;
        this.source = configurationOptionsSource;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationOptions configurationOptions = (ConfigurationOptions) obj;
        return Objects.equals(this.data, configurationOptions.data) && Objects.equals(this.digest, configurationOptions.digest) && Objects.equals(this.source, configurationOptions.source);
    }

    public Value getData() {
        return this.data;
    }

    public String getDigest() {
        return this.digest;
    }

    public ConfigurationOptionsSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return Objects.hash(this.data, this.digest, this.source);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[data: ");
        sb2.append(RecordUtils.fieldToString(this.data));
        sb2.append(", digest: ");
        h.z(sb2, this.digest, ", source: ");
        sb2.append(RecordUtils.fieldToString(this.source));
        sb2.append("]");
        return sb2.toString();
    }
}
