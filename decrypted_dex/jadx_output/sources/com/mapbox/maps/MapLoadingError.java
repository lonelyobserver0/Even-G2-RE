package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapLoadingError implements Serializable {
    private final String message;
    private final String sourceId;
    private final CanonicalTileID tileId;
    private final Date timestamp;
    private final MapLoadingErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapLoadingError(MapLoadingErrorType mapLoadingErrorType, String str, String str2, CanonicalTileID canonicalTileID, Date date) {
        this.type = mapLoadingErrorType;
        this.message = str;
        this.sourceId = str2;
        this.tileId = canonicalTileID;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapLoadingError.class != obj.getClass()) {
            return false;
        }
        MapLoadingError mapLoadingError = (MapLoadingError) obj;
        return Objects.equals(this.type, mapLoadingError.type) && Objects.equals(this.message, mapLoadingError.message) && Objects.equals(this.sourceId, mapLoadingError.sourceId) && Objects.equals(this.tileId, mapLoadingError.tileId) && Objects.equals(this.timestamp, mapLoadingError.timestamp);
    }

    public String getMessage() {
        return this.message;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public CanonicalTileID getTileId() {
        return this.tileId;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public MapLoadingErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message, this.sourceId, this.tileId, this.timestamp);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[type: ");
        sb2.append(RecordUtils.fieldToString(this.type));
        sb2.append(", message: ");
        Xa.h.z(sb2, this.message, ", sourceId: ");
        Xa.h.z(sb2, this.sourceId, ", tileId: ");
        sb2.append(RecordUtils.fieldToString(this.tileId));
        sb2.append(", timestamp: ");
        sb2.append(RecordUtils.fieldToString(this.timestamp));
        sb2.append("]");
        return sb2.toString();
    }
}
