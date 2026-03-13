package com.mapbox.geojson;

import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface GeoJson extends Serializable {
    BoundingBox bbox();

    String toJson();

    String type();
}
