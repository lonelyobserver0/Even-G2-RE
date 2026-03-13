package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SourceQueryOptions implements Serializable {
    private final Value filter;
    private final List<String> sourceLayerIds;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public SourceQueryOptions(List<String> list, Value value) {
        this.sourceLayerIds = list;
        this.filter = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SourceQueryOptions.class != obj.getClass()) {
            return false;
        }
        SourceQueryOptions sourceQueryOptions = (SourceQueryOptions) obj;
        return Objects.equals(this.sourceLayerIds, sourceQueryOptions.sourceLayerIds) && Objects.equals(this.filter, sourceQueryOptions.filter);
    }

    public Value getFilter() {
        return this.filter;
    }

    public List<String> getSourceLayerIds() {
        return this.sourceLayerIds;
    }

    public int hashCode() {
        return Objects.hash(this.sourceLayerIds, this.filter);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[sourceLayerIds: ");
        com.mapbox.common.b.v(", filter: ", sb2, this.sourceLayerIds);
        sb2.append(RecordUtils.fieldToString(this.filter));
        sb2.append("]");
        return sb2.toString();
    }
}
