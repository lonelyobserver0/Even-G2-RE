package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CustomLayerRenderConfiguration implements Serializable {
    private final boolean isRenderToTileSupported;
    private final boolean shouldRerenderTiles;

    /* renamed from: com.mapbox.maps.CustomLayerRenderConfiguration$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private boolean isRenderToTileSupported = false;
        private boolean shouldRerenderTiles = false;

        public CustomLayerRenderConfiguration build() {
            return new CustomLayerRenderConfiguration(this.isRenderToTileSupported, this.shouldRerenderTiles, null);
        }

        public Builder isRenderToTileSupported(boolean z2) {
            this.isRenderToTileSupported = z2;
            return this;
        }

        public Builder shouldRerenderTiles(boolean z2) {
            this.shouldRerenderTiles = z2;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public /* synthetic */ CustomLayerRenderConfiguration(boolean z2, boolean z10, AnonymousClass1 anonymousClass1) {
        this(z2, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomLayerRenderConfiguration.class != obj.getClass()) {
            return false;
        }
        CustomLayerRenderConfiguration customLayerRenderConfiguration = (CustomLayerRenderConfiguration) obj;
        return this.isRenderToTileSupported == customLayerRenderConfiguration.isRenderToTileSupported && this.shouldRerenderTiles == customLayerRenderConfiguration.shouldRerenderTiles;
    }

    public boolean getIsRenderToTileSupported() {
        return this.isRenderToTileSupported;
    }

    public boolean getShouldRerenderTiles() {
        return this.shouldRerenderTiles;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isRenderToTileSupported), Boolean.valueOf(this.shouldRerenderTiles));
    }

    public Builder toBuilder() {
        return new Builder().isRenderToTileSupported(this.isRenderToTileSupported).shouldRerenderTiles(this.shouldRerenderTiles);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[isRenderToTileSupported: ");
        Xa.h.A(this.isRenderToTileSupported, sb2, ", shouldRerenderTiles: ");
        return com.mapbox.common.b.k(this.shouldRerenderTiles, sb2, "]");
    }

    private CustomLayerRenderConfiguration(boolean z2, boolean z10) {
        this.isRenderToTileSupported = z2;
        this.shouldRerenderTiles = z10;
    }

    private CustomLayerRenderConfiguration() {
        this.isRenderToTileSupported = false;
        this.shouldRerenderTiles = false;
    }
}
