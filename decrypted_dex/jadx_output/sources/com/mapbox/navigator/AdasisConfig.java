package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfig implements Serializable {
    private final AdasisConfigDataSending dataSending;
    private final AdasisConfigPathOptions pathOptions;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfig(AdasisConfigDataSending adasisConfigDataSending, AdasisConfigPathOptions adasisConfigPathOptions) {
        this.dataSending = adasisConfigDataSending;
        this.pathOptions = adasisConfigPathOptions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfig adasisConfig = (AdasisConfig) obj;
        return Objects.equals(this.dataSending, adasisConfig.dataSending) && Objects.equals(this.pathOptions, adasisConfig.pathOptions);
    }

    public AdasisConfigDataSending getDataSending() {
        return this.dataSending;
    }

    public AdasisConfigPathOptions getPathOptions() {
        return this.pathOptions;
    }

    public int hashCode() {
        return Objects.hash(this.dataSending, this.pathOptions);
    }

    public String toString() {
        return "[dataSending: " + RecordUtils.fieldToString(this.dataSending) + ", pathOptions: " + RecordUtils.fieldToString(this.pathOptions) + "]";
    }
}
