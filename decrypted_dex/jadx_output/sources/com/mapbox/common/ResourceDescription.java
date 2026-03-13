package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ResourceDescription implements Serializable {
    private final TileDataDomain domain;
    private final String url;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceDescription(TileDataDomain tileDataDomain, String str) {
        this.domain = tileDataDomain;
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceDescription resourceDescription = (ResourceDescription) obj;
        return Objects.equals(this.domain, resourceDescription.domain) && Objects.equals(this.url, resourceDescription.url);
    }

    public TileDataDomain getDomain() {
        return this.domain;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.domain, this.url);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[domain: ");
        sb2.append(RecordUtils.fieldToString(this.domain));
        sb2.append(", url: ");
        return h.t(sb2, this.url, "]");
    }
}
