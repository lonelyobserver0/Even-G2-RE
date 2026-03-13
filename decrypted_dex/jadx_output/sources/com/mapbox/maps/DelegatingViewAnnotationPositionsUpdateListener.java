package com.mapbox.maps;

import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;", "Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;", "()V", "onDelegatingViewAnnotationPositionsUpdate", "", "positions", "", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "onViewAnnotationPositionsUpdate", "", "Lcom/mapbox/maps/ViewAnnotationPositionDescriptor;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DelegatingViewAnnotationPositionsUpdateListener implements ViewAnnotationPositionsUpdateListener {
    public abstract void onDelegatingViewAnnotationPositionsUpdate(List<DelegatingViewAnnotationPositionDescriptor> positions);

    @Override // com.mapbox.maps.ViewAnnotationPositionsUpdateListener
    public final void onViewAnnotationPositionsUpdate(List<ViewAnnotationPositionDescriptor> positions) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        ArrayList arrayList = new ArrayList(CollectionsKt.f(positions));
        for (ViewAnnotationPositionDescriptor viewAnnotationPositionDescriptor : positions) {
            String identifier = viewAnnotationPositionDescriptor.getIdentifier();
            Intrinsics.checkNotNullExpressionValue(identifier, "it.identifier");
            double width = viewAnnotationPositionDescriptor.getWidth();
            double height = viewAnnotationPositionDescriptor.getHeight();
            ScreenCoordinate leftTopCoordinate = viewAnnotationPositionDescriptor.getLeftTopCoordinate();
            Intrinsics.checkNotNullExpressionValue(leftTopCoordinate, "it.leftTopCoordinate");
            Point anchorCoordinate = viewAnnotationPositionDescriptor.getAnchorCoordinate();
            Intrinsics.checkNotNullExpressionValue(anchorCoordinate, "it.anchorCoordinate");
            ViewAnnotationAnchorConfig anchorConfig = viewAnnotationPositionDescriptor.getAnchorConfig();
            Intrinsics.checkNotNullExpressionValue(anchorConfig, "it.anchorConfig");
            arrayList.add(new DelegatingViewAnnotationPositionDescriptor(identifier, width, height, leftTopCoordinate, anchorCoordinate, anchorConfig));
        }
        onDelegatingViewAnnotationPositionsUpdate(arrayList);
    }
}
