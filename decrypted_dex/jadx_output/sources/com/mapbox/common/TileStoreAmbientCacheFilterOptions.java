package com.mapbox.common;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileStoreAmbientCacheFilterOptions implements Serializable {
    private final List<TileDataDomain> domainFilter;
    private final List<TileStoreAmbientCacheType> typeFilter;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileStoreAmbientCacheFilterOptions(List<TileStoreAmbientCacheType> list, List<TileDataDomain> list2) {
        this.typeFilter = list;
        this.domainFilter = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileStoreAmbientCacheFilterOptions tileStoreAmbientCacheFilterOptions = (TileStoreAmbientCacheFilterOptions) obj;
        return Objects.equals(this.typeFilter, tileStoreAmbientCacheFilterOptions.typeFilter) && Objects.equals(this.domainFilter, tileStoreAmbientCacheFilterOptions.domainFilter);
    }

    public List<TileDataDomain> getDomainFilter() {
        return this.domainFilter;
    }

    public List<TileStoreAmbientCacheType> getTypeFilter() {
        return this.typeFilter;
    }

    public int hashCode() {
        return Objects.hash(this.typeFilter, this.domainFilter);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[typeFilter: ");
        b.v(", domainFilter: ", sb2, this.typeFilter);
        return b.i("]", sb2, this.domainFilter);
    }
}
