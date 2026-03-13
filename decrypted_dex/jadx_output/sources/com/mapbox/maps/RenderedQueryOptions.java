package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RenderedQueryOptions implements Serializable {
    private final Value filter;
    private final List<String> layerIds;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public RenderedQueryOptions(List<String> list, Value value) {
        this.layerIds = list;
        this.filter = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RenderedQueryOptions.class != obj.getClass()) {
            return false;
        }
        RenderedQueryOptions renderedQueryOptions = (RenderedQueryOptions) obj;
        return Objects.equals(this.layerIds, renderedQueryOptions.layerIds) && Objects.equals(this.filter, renderedQueryOptions.filter);
    }

    public Value getFilter() {
        return this.filter;
    }

    public List<String> getLayerIds() {
        return this.layerIds;
    }

    public int hashCode() {
        return Objects.hash(this.layerIds, this.filter);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[layerIds: ");
        com.mapbox.common.b.v(", filter: ", sb2, this.layerIds);
        sb2.append(RecordUtils.fieldToString(this.filter));
        sb2.append("]");
        return sb2.toString();
    }
}
