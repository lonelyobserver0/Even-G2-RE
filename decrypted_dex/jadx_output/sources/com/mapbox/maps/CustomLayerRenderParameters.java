package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CustomLayerRenderParameters implements Serializable {
    private final double bearing;
    private final DepthRange depthRange;
    private final ElevationData elevationData;
    private final double fieldOfView;
    private final double height;
    private final double latitude;
    private final double longitude;
    private final double pitch;
    private final CustomLayerMapProjection projection;
    private final List<Double> projectionMatrix;
    private final List<CanonicalTileID> renderToTilesIDs;
    private final double width;
    private final double zoom;

    private CustomLayerRenderParameters(double d8, double d10, double d11, double d12, double d13, double d14, double d15, double d16, List<Double> list, DepthRange depthRange, ElevationData elevationData, List<CanonicalTileID> list2, CustomLayerMapProjection customLayerMapProjection) {
        this.width = d8;
        this.height = d10;
        this.latitude = d11;
        this.longitude = d12;
        this.zoom = d13;
        this.bearing = d14;
        this.pitch = d15;
        this.fieldOfView = d16;
        this.projectionMatrix = list;
        this.depthRange = depthRange;
        this.elevationData = elevationData;
        this.renderToTilesIDs = list2;
        this.projection = customLayerMapProjection;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomLayerRenderParameters.class != obj.getClass()) {
            return false;
        }
        CustomLayerRenderParameters customLayerRenderParameters = (CustomLayerRenderParameters) obj;
        return Double.compare(this.width, customLayerRenderParameters.width) == 0 && Double.compare(this.height, customLayerRenderParameters.height) == 0 && Double.compare(this.latitude, customLayerRenderParameters.latitude) == 0 && Double.compare(this.longitude, customLayerRenderParameters.longitude) == 0 && Double.compare(this.zoom, customLayerRenderParameters.zoom) == 0 && Double.compare(this.bearing, customLayerRenderParameters.bearing) == 0 && Double.compare(this.pitch, customLayerRenderParameters.pitch) == 0 && Double.compare(this.fieldOfView, customLayerRenderParameters.fieldOfView) == 0 && Objects.equals(this.projectionMatrix, customLayerRenderParameters.projectionMatrix) && Objects.equals(this.depthRange, customLayerRenderParameters.depthRange) && Objects.equals(this.elevationData, customLayerRenderParameters.elevationData) && Objects.equals(this.renderToTilesIDs, customLayerRenderParameters.renderToTilesIDs) && Objects.equals(this.projection, customLayerRenderParameters.projection);
    }

    public double getBearing() {
        return this.bearing;
    }

    public DepthRange getDepthRange() {
        return this.depthRange;
    }

    public ElevationData getElevationData() {
        return this.elevationData;
    }

    public double getFieldOfView() {
        return this.fieldOfView;
    }

    public double getHeight() {
        return this.height;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getPitch() {
        return this.pitch;
    }

    public CustomLayerMapProjection getProjection() {
        return this.projection;
    }

    public List<Double> getProjectionMatrix() {
        return this.projectionMatrix;
    }

    public List<CanonicalTileID> getRenderToTilesIDs() {
        return this.renderToTilesIDs;
    }

    public double getWidth() {
        return this.width;
    }

    public double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.width), Double.valueOf(this.height), Double.valueOf(this.latitude), Double.valueOf(this.longitude), Double.valueOf(this.zoom), Double.valueOf(this.bearing), Double.valueOf(this.pitch), Double.valueOf(this.fieldOfView), this.projectionMatrix, this.depthRange, this.elevationData, this.renderToTilesIDs, this.projection);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[width: ");
        com.mapbox.common.b.m(this.width, sb2, ", height: ");
        com.mapbox.common.b.m(this.height, sb2, ", latitude: ");
        com.mapbox.common.b.m(this.latitude, sb2, ", longitude: ");
        com.mapbox.common.b.m(this.longitude, sb2, ", zoom: ");
        com.mapbox.common.b.m(this.zoom, sb2, ", bearing: ");
        com.mapbox.common.b.m(this.bearing, sb2, ", pitch: ");
        com.mapbox.common.b.m(this.pitch, sb2, ", fieldOfView: ");
        com.mapbox.common.b.m(this.fieldOfView, sb2, ", projectionMatrix: ");
        com.mapbox.common.b.v(", depthRange: ", sb2, this.projectionMatrix);
        sb2.append(RecordUtils.fieldToString(this.depthRange));
        sb2.append(", elevationData: ");
        sb2.append(RecordUtils.fieldToString(this.elevationData));
        sb2.append(", renderToTilesIDs: ");
        com.mapbox.common.b.v(", projection: ", sb2, this.renderToTilesIDs);
        sb2.append(RecordUtils.fieldToString(this.projection));
        sb2.append("]");
        return sb2.toString();
    }

    @Deprecated
    public CustomLayerRenderParameters(double d8, double d10, double d11, double d12, double d13, double d14, double d15, double d16, List<Double> list, DepthRange depthRange, ElevationData elevationData, CustomLayerMapProjection customLayerMapProjection) {
        this.width = d8;
        this.height = d10;
        this.latitude = d11;
        this.longitude = d12;
        this.zoom = d13;
        this.bearing = d14;
        this.pitch = d15;
        this.fieldOfView = d16;
        this.projectionMatrix = list;
        this.depthRange = depthRange;
        this.elevationData = elevationData;
        this.renderToTilesIDs = null;
        this.projection = customLayerMapProjection;
    }
}
