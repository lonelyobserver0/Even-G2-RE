package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class IncidentsOptions implements Serializable {
    private final String apiUrl;
    private final String graph;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public IncidentsOptions(String str, String str2) {
        this.graph = str;
        this.apiUrl = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentsOptions incidentsOptions = (IncidentsOptions) obj;
        return Objects.equals(this.graph, incidentsOptions.graph) && Objects.equals(this.apiUrl, incidentsOptions.apiUrl);
    }

    public String getApiUrl() {
        return this.apiUrl;
    }

    public String getGraph() {
        return this.graph;
    }

    public int hashCode() {
        return Objects.hash(this.graph, this.apiUrl);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[graph: ");
        h.z(sb2, this.graph, ", apiUrl: ");
        return h.t(sb2, this.apiUrl, "]");
    }
}
