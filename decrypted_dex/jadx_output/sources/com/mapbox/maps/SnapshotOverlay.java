package com.mapbox.maps;

import android.graphics.Canvas;
import com.mapbox.geojson.Point;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/SnapshotOverlay;", "", "()V", "attributions", "", "", "getAttributions", "()Ljava/util/List;", "canvas", "Landroid/graphics/Canvas;", "getCanvas", "()Landroid/graphics/Canvas;", "coordinate", "Lcom/mapbox/geojson/Point;", "screenCoordinate", "Lcom/mapbox/maps/ScreenCoordinate;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class SnapshotOverlay {
    public abstract Point coordinate(ScreenCoordinate screenCoordinate);

    public abstract List<String> getAttributions();

    public abstract Canvas getCanvas();

    public abstract ScreenCoordinate screenCoordinate(Point coordinate);
}
