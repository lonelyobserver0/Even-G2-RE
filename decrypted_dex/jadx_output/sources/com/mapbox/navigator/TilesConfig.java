package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.TileStore;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TilesConfig implements Serializable {
    private final TileEndpointConfiguration endpointConfig;
    private final TileEndpointConfiguration hdEndpointConfig;
    private final Integer inMemoryTileCache;
    private final Long onDiskTileCache;
    private final TileStore tileStore;
    private final String tilesPath;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public TilesConfig(String str, TileStore tileStore, Integer num, Long l9, TileEndpointConfiguration tileEndpointConfiguration, TileEndpointConfiguration tileEndpointConfiguration2) {
        this.tilesPath = str;
        this.tileStore = tileStore;
        this.inMemoryTileCache = num;
        this.onDiskTileCache = l9;
        this.endpointConfig = tileEndpointConfiguration;
        this.hdEndpointConfig = tileEndpointConfiguration2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TilesConfig tilesConfig = (TilesConfig) obj;
        return Objects.equals(this.tilesPath, tilesConfig.tilesPath) && Objects.equals(this.tileStore, tilesConfig.tileStore) && Objects.equals(this.inMemoryTileCache, tilesConfig.inMemoryTileCache) && Objects.equals(this.onDiskTileCache, tilesConfig.onDiskTileCache) && Objects.equals(this.endpointConfig, tilesConfig.endpointConfig) && Objects.equals(this.hdEndpointConfig, tilesConfig.hdEndpointConfig);
    }

    public TileEndpointConfiguration getEndpointConfig() {
        return this.endpointConfig;
    }

    public TileEndpointConfiguration getHdEndpointConfig() {
        return this.hdEndpointConfig;
    }

    public Integer getInMemoryTileCache() {
        return this.inMemoryTileCache;
    }

    public Long getOnDiskTileCache() {
        return this.onDiskTileCache;
    }

    public TileStore getTileStore() {
        return this.tileStore;
    }

    public String getTilesPath() {
        return this.tilesPath;
    }

    public int hashCode() {
        return Objects.hash(this.tilesPath, this.tileStore, this.inMemoryTileCache, this.onDiskTileCache, this.endpointConfig, this.hdEndpointConfig);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[tilesPath: ");
        h.z(sb2, this.tilesPath, ", tileStore: ");
        sb2.append(RecordUtils.fieldToString(this.tileStore));
        sb2.append(", inMemoryTileCache: ");
        b.t(this.inMemoryTileCache, sb2, ", onDiskTileCache: ");
        b.u(this.onDiskTileCache, sb2, ", endpointConfig: ");
        sb2.append(RecordUtils.fieldToString(this.endpointConfig));
        sb2.append(", hdEndpointConfig: ");
        sb2.append(RecordUtils.fieldToString(this.hdEndpointConfig));
        sb2.append("]");
        return sb2.toString();
    }
}
