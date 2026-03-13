package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileRegion implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final Date expires;
    private final Value extraData;
    private final String id;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegion(String str, long j, long j3, long j10, Date date, Value value) {
        this.id = str;
        this.requiredResourceCount = j;
        this.completedResourceCount = j3;
        this.completedResourceSize = j10;
        this.expires = date;
        this.extraData = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegion tileRegion = (TileRegion) obj;
        return Objects.equals(this.id, tileRegion.id) && this.requiredResourceCount == tileRegion.requiredResourceCount && this.completedResourceCount == tileRegion.completedResourceCount && this.completedResourceSize == tileRegion.completedResourceSize && Objects.equals(this.expires, tileRegion.expires) && Objects.equals(this.extraData, tileRegion.extraData);
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public String getId() {
        return this.id;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(this.id, Long.valueOf(this.requiredResourceCount), Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), this.expires, this.extraData);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        h.z(sb2, this.id, ", requiredResourceCount: ");
        b.p(this.requiredResourceCount, sb2, ", completedResourceCount: ");
        b.p(this.completedResourceCount, sb2, ", completedResourceSize: ");
        b.p(this.completedResourceSize, sb2, ", expires: ");
        sb2.append(RecordUtils.fieldToString(this.expires));
        sb2.append(", extraData: ");
        sb2.append(RecordUtils.fieldToString(this.extraData));
        sb2.append("]");
        return sb2.toString();
    }
}
