package com.mapbox.geojson.shifter;

import com.mapbox.geojson.Point;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface CoordinateShifter {
    List<Double> shiftLonLat(double d8, double d10);

    List<Double> shiftLonLatAlt(double d8, double d10, double d11);

    List<Double> unshiftPoint(Point point);

    List<Double> unshiftPoint(List<Double> list);
}
