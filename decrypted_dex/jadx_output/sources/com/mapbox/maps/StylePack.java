package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class StylePack implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final Date expires;
    private final Value extraData;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final long requiredResourceCount;
    private final String styleURI;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StylePack(String str, GlyphsRasterizationMode glyphsRasterizationMode, long j, long j3, long j10, Date date, Value value) {
        this.styleURI = str;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
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
        if (obj == null || StylePack.class != obj.getClass()) {
            return false;
        }
        StylePack stylePack = (StylePack) obj;
        return Objects.equals(this.styleURI, stylePack.styleURI) && Objects.equals(this.glyphsRasterizationMode, stylePack.glyphsRasterizationMode) && this.requiredResourceCount == stylePack.requiredResourceCount && this.completedResourceCount == stylePack.completedResourceCount && this.completedResourceSize == stylePack.completedResourceSize && Objects.equals(this.expires, stylePack.expires) && Objects.equals(this.extraData, stylePack.extraData);
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

    public GlyphsRasterizationMode getGlyphsRasterizationMode() {
        return this.glyphsRasterizationMode;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public String getStyleURI() {
        return this.styleURI;
    }

    public int hashCode() {
        return Objects.hash(this.styleURI, this.glyphsRasterizationMode, Long.valueOf(this.requiredResourceCount), Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), this.expires, this.extraData);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[styleURI: ");
        Xa.h.z(sb2, this.styleURI, ", glyphsRasterizationMode: ");
        sb2.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb2.append(", requiredResourceCount: ");
        com.mapbox.common.b.p(this.requiredResourceCount, sb2, ", completedResourceCount: ");
        com.mapbox.common.b.p(this.completedResourceCount, sb2, ", completedResourceSize: ");
        com.mapbox.common.b.p(this.completedResourceSize, sb2, ", expires: ");
        sb2.append(RecordUtils.fieldToString(this.expires));
        sb2.append(", extraData: ");
        sb2.append(RecordUtils.fieldToString(this.extraData));
        sb2.append("]");
        return sb2.toString();
    }
}
