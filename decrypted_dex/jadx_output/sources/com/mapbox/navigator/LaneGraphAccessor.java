package com.mapbox.navigator;

import com.mapbox.geojson.Point;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface LaneGraphAccessor {
    LaneData getLaneData(long j);

    List<Point> getLaneGeometry(long j);

    LaneGroupData getLaneGroupData(long j);

    List<Point> getLaneGroupGeometry(long j);

    List<LaneWidthPoint> getLaneWidthPoints(long j);

    List<Point> getSmoothedLaneGroupGeometry(long j, double d8, String str);

    LaneGroupData getVirtualLaneGroupData(long j, String str);

    List<Point> getVirtualLaneGroupGeometry(long j, String str);

    boolean isVirtualLaneGroup(long j);
}
