package com.mapbox.maps;

import com.mapbox.common.TileStore;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR.\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/MapboxMapsOptions;", "", "()V", "value", "", "baseUrl", "getBaseUrl$annotations", "getBaseUrl", "()Ljava/lang/String;", "setBaseUrl", "(Ljava/lang/String;)V", "dataPath", "getDataPath$annotations", "getDataPath", "setDataPath", "Lcom/mapbox/common/TileStore;", "tileStore", "getTileStore$annotations", "getTileStore", "()Lcom/mapbox/common/TileStore;", "setTileStore", "(Lcom/mapbox/common/TileStore;)V", "Lcom/mapbox/maps/TileStoreUsageMode;", "tileStoreUsageMode", "getTileStoreUsageMode$annotations", "getTileStoreUsageMode", "()Lcom/mapbox/maps/TileStoreUsageMode;", "setTileStoreUsageMode", "(Lcom/mapbox/maps/TileStoreUsageMode;)V", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxMapsOptions {
    public static final MapboxMapsOptions INSTANCE = new MapboxMapsOptions();

    private MapboxMapsOptions() {
    }

    public static final String getBaseUrl() {
        String baseURL = MapsResourceOptions.getBaseURL();
        Intrinsics.checkNotNullExpressionValue(baseURL, "getBaseURL()");
        return baseURL;
    }

    @JvmStatic
    public static /* synthetic */ void getBaseUrl$annotations() {
    }

    public static final String getDataPath() {
        String dataPath = MapsResourceOptions.getDataPath();
        Intrinsics.checkNotNullExpressionValue(dataPath, "getDataPath()");
        return dataPath;
    }

    @JvmStatic
    public static /* synthetic */ void getDataPath$annotations() {
    }

    public static final TileStore getTileStore() {
        return MapsResourceOptions.getTileStore();
    }

    @JvmStatic
    public static /* synthetic */ void getTileStore$annotations() {
    }

    public static final TileStoreUsageMode getTileStoreUsageMode() {
        TileStoreUsageMode tileStoreUsageMode = MapsResourceOptions.getTileStoreUsageMode();
        Intrinsics.checkNotNullExpressionValue(tileStoreUsageMode, "getTileStoreUsageMode()");
        return tileStoreUsageMode;
    }

    @JvmStatic
    public static /* synthetic */ void getTileStoreUsageMode$annotations() {
    }

    public static final void setBaseUrl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MapsResourceOptions.setBaseURL(value);
    }

    public static final void setDataPath(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MapsResourceOptions.setDataPath(value);
    }

    public static final void setTileStore(TileStore tileStore) {
        MapsResourceOptions.setTileStore(tileStore);
    }

    public static final void setTileStoreUsageMode(TileStoreUsageMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MapsResourceOptions.setTileStoreUsageMode(value);
    }
}
