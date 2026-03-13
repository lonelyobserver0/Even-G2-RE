package com.mapbox.geojson.utils;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GeoJsonUtils {
    private static long MAX_DOUBLE_TO_ROUND = (long) (9.223372036854776E18d / 1.0E7d);
    private static double ROUND_PRECISION = 1.0E7d;

    public static double trim(double d8) {
        long j = MAX_DOUBLE_TO_ROUND;
        return (d8 > ((double) j) || d8 < ((double) (-j))) ? d8 : Math.round(d8 * ROUND_PRECISION) / ROUND_PRECISION;
    }
}
