package g7;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.QuerySourceFeaturesCallback;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.SourceQueryOptions;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface b {
    Cancelable queryRenderedFeatures(RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, QueryRenderedFeaturesCallback queryRenderedFeaturesCallback);

    Cancelable querySourceFeatures(String str, SourceQueryOptions sourceQueryOptions, QuerySourceFeaturesCallback querySourceFeaturesCallback);
}
