package com.mapbox.geojson.shifter;

import com.mapbox.geojson.Point;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CoordinateShifterManager {
    private static final CoordinateShifter DEFAULT;
    private static volatile CoordinateShifter coordinateShifter;

    static {
        CoordinateShifter coordinateShifter2 = new CoordinateShifter() { // from class: com.mapbox.geojson.shifter.CoordinateShifterManager.1
            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> shiftLonLat(double d8, double d10) {
                return Arrays.asList(Double.valueOf(d8), Double.valueOf(d10));
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> shiftLonLatAlt(double d8, double d10, double d11) {
                return Double.isNaN(d11) ? Arrays.asList(Double.valueOf(d8), Double.valueOf(d10)) : Arrays.asList(Double.valueOf(d8), Double.valueOf(d10), Double.valueOf(d11));
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> unshiftPoint(List<Double> list) {
                return list;
            }

            @Override // com.mapbox.geojson.shifter.CoordinateShifter
            public List<Double> unshiftPoint(Point point) {
                return point.coordinates();
            }
        };
        DEFAULT = coordinateShifter2;
        coordinateShifter = coordinateShifter2;
    }

    public static CoordinateShifter getCoordinateShifter() {
        return coordinateShifter;
    }

    public static boolean isUsingDefaultShifter() {
        return coordinateShifter == DEFAULT;
    }

    public static void setCoordinateShifter(CoordinateShifter coordinateShifter2) {
        if (coordinateShifter2 == null) {
            coordinateShifter2 = DEFAULT;
        }
        coordinateShifter = coordinateShifter2;
    }
}
