package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TileRegionLoadOptions implements Serializable {
    private final boolean acceptExpired;
    private final Integer averageBytesPerSecond;
    private final List<TilesetDescriptor> descriptors;
    private final Value extraOptions;
    private final Geometry geometry;
    private final Value metadata;
    private final NetworkRestriction networkRestriction;
    private final Point startLocation;

    /* renamed from: com.mapbox.common.TileRegionLoadOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private Integer averageBytesPerSecond;
        private List<TilesetDescriptor> descriptors;
        private Value extraOptions;
        private Geometry geometry;
        private Value metadata;
        private Point startLocation;
        private boolean acceptExpired = false;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;

        public Builder acceptExpired(boolean z2) {
            this.acceptExpired = z2;
            return this;
        }

        public Builder averageBytesPerSecond(Integer num) {
            this.averageBytesPerSecond = num;
            return this;
        }

        public TileRegionLoadOptions build() {
            if (this.networkRestriction != null) {
                return new TileRegionLoadOptions(this.geometry, this.descriptors, this.metadata, this.acceptExpired, this.networkRestriction, this.startLocation, this.averageBytesPerSecond, this.extraOptions, null);
            }
            throw new NullPointerException(StubApp.getString2(13316));
        }

        public Builder descriptors(List<TilesetDescriptor> list) {
            this.descriptors = list;
            return this;
        }

        public Builder extraOptions(Value value) {
            this.extraOptions = value;
            return this;
        }

        public Builder geometry(Geometry geometry) {
            this.geometry = geometry;
            return this;
        }

        public Builder metadata(Value value) {
            this.metadata = value;
            return this;
        }

        public Builder networkRestriction(NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
            return this;
        }

        public Builder startLocation(Point point) {
            this.startLocation = point;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public /* synthetic */ TileRegionLoadOptions(Geometry geometry, List list, Value value, boolean z2, NetworkRestriction networkRestriction, Point point, Integer num, Value value2, AnonymousClass1 anonymousClass1) {
        this(geometry, list, value, z2, networkRestriction, point, num, value2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TileRegionLoadOptions.class != obj.getClass()) {
            return false;
        }
        TileRegionLoadOptions tileRegionLoadOptions = (TileRegionLoadOptions) obj;
        return Objects.equals(this.geometry, tileRegionLoadOptions.geometry) && Objects.equals(this.descriptors, tileRegionLoadOptions.descriptors) && Objects.equals(this.metadata, tileRegionLoadOptions.metadata) && this.acceptExpired == tileRegionLoadOptions.acceptExpired && Objects.equals(this.networkRestriction, tileRegionLoadOptions.networkRestriction) && Objects.equals(this.startLocation, tileRegionLoadOptions.startLocation) && Objects.equals(this.averageBytesPerSecond, tileRegionLoadOptions.averageBytesPerSecond) && Objects.equals(this.extraOptions, tileRegionLoadOptions.extraOptions);
    }

    public boolean getAcceptExpired() {
        return this.acceptExpired;
    }

    public Integer getAverageBytesPerSecond() {
        return this.averageBytesPerSecond;
    }

    public List<TilesetDescriptor> getDescriptors() {
        return this.descriptors;
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public Value getMetadata() {
        return this.metadata;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public Point getStartLocation() {
        return this.startLocation;
    }

    public int hashCode() {
        return Objects.hash(this.geometry, this.descriptors, this.metadata, Boolean.valueOf(this.acceptExpired), this.networkRestriction, this.startLocation, this.averageBytesPerSecond, this.extraOptions);
    }

    public Builder toBuilder() {
        return new Builder().geometry(this.geometry).descriptors(this.descriptors).metadata(this.metadata).acceptExpired(this.acceptExpired).networkRestriction(this.networkRestriction).startLocation(this.startLocation).averageBytesPerSecond(this.averageBytesPerSecond).extraOptions(this.extraOptions);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[geometry: ");
        sb2.append(RecordUtils.fieldToString(this.geometry));
        sb2.append(", descriptors: ");
        b.v(", metadata: ", sb2, this.descriptors);
        sb2.append(RecordUtils.fieldToString(this.metadata));
        sb2.append(", acceptExpired: ");
        h.A(this.acceptExpired, sb2, ", networkRestriction: ");
        sb2.append(RecordUtils.fieldToString(this.networkRestriction));
        sb2.append(", startLocation: ");
        b.q(this.startLocation, sb2, ", averageBytesPerSecond: ");
        b.t(this.averageBytesPerSecond, sb2, ", extraOptions: ");
        sb2.append(RecordUtils.fieldToString(this.extraOptions));
        sb2.append("]");
        return sb2.toString();
    }

    private TileRegionLoadOptions(Geometry geometry, List<TilesetDescriptor> list, Value value, boolean z2, NetworkRestriction networkRestriction, Point point, Integer num, Value value2) {
        this.geometry = geometry;
        this.descriptors = list;
        this.metadata = value;
        this.acceptExpired = z2;
        this.networkRestriction = networkRestriction;
        this.startLocation = point;
        this.averageBytesPerSecond = num;
        this.extraOptions = value2;
    }

    private TileRegionLoadOptions(Geometry geometry, List<TilesetDescriptor> list, Value value, Point point, Integer num, Value value2) {
        this.geometry = geometry;
        this.descriptors = list;
        this.metadata = value;
        this.startLocation = point;
        this.averageBytesPerSecond = num;
        this.extraOptions = value2;
        this.acceptExpired = false;
        this.networkRestriction = NetworkRestriction.NONE;
    }
}
