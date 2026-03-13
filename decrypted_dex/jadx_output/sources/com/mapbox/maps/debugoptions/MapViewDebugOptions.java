package com.mapbox.maps.debugoptions;

import Xa.h;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;", "", "name", "", "(Ljava/lang/String;)V", "getName$maps_sdk_release", "()Ljava/lang/String;", "component1", "component1$maps_sdk_release", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class MapViewDebugOptions {
    private final String name;

    @JvmField
    public static final MapViewDebugOptions TILE_BORDERS = new MapViewDebugOptions(StubApp.getString2(13955));

    @JvmField
    public static final MapViewDebugOptions PARSE_STATUS = new MapViewDebugOptions(StubApp.getString2(13956));

    @JvmField
    public static final MapViewDebugOptions TIMESTAMPS = new MapViewDebugOptions(StubApp.getString2(13957));

    @JvmField
    public static final MapViewDebugOptions COLLISION = new MapViewDebugOptions(StubApp.getString2(13958));

    @JvmField
    public static final MapViewDebugOptions OVERDRAW = new MapViewDebugOptions(StubApp.getString2(13959));

    @JvmField
    public static final MapViewDebugOptions STENCIL_CLIP = new MapViewDebugOptions(StubApp.getString2(13960));

    @JvmField
    public static final MapViewDebugOptions DEPTH_BUFFER = new MapViewDebugOptions(StubApp.getString2(13961));

    @JvmField
    public static final MapViewDebugOptions MODEL_BOUNDS = new MapViewDebugOptions(StubApp.getString2(13962));

    @JvmField
    public static final MapViewDebugOptions TERRAIN_WIREFRAME = new MapViewDebugOptions(StubApp.getString2(13963));

    @JvmField
    public static final MapViewDebugOptions LAYERS2_DWIREFRAME = new MapViewDebugOptions(StubApp.getString2(13964));

    @JvmField
    public static final MapViewDebugOptions LAYERS3_DWIREFRAME = new MapViewDebugOptions(StubApp.getString2(13965));

    @JvmField
    public static final MapViewDebugOptions LIGHT = new MapViewDebugOptions(StubApp.getString2(13966));

    @JvmField
    public static final MapViewDebugOptions CAMERA = new MapViewDebugOptions(StubApp.getString2(14361));

    @JvmField
    public static final MapViewDebugOptions PADDING = new MapViewDebugOptions(StubApp.getString2(7577));

    public MapViewDebugOptions(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    public static /* synthetic */ MapViewDebugOptions copy$default(MapViewDebugOptions mapViewDebugOptions, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = mapViewDebugOptions.name;
        }
        return mapViewDebugOptions.copy(str);
    }

    /* renamed from: component1$maps_sdk_release, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final MapViewDebugOptions copy(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new MapViewDebugOptions(name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapViewDebugOptions) && Intrinsics.areEqual(this.name, ((MapViewDebugOptions) other).name);
    }

    public final String getName$maps_sdk_release() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return h.s(new StringBuilder(StubApp.getString2(14362)), this.name, ')');
    }
}
