package com.mapbox.geojson.utils;

import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class PolylineUtils {
    private static final boolean SIMPLIFY_DEFAULT_HIGHEST_QUALITY = false;
    private static final double SIMPLIFY_DEFAULT_TOLERANCE = 1.0d;

    private PolylineUtils() {
    }

    public static List<Point> decode(String str, int i3) {
        int i10;
        int i11;
        int length = str.length();
        double pow = Math.pow(10.0d, i3);
        ArrayList arrayList = new ArrayList((length + 1) / 2);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 < length) {
            int i16 = 1;
            int i17 = 0;
            int i18 = 1;
            while (true) {
                i10 = i12 + 1;
                int charAt = str.charAt(i12) - '@';
                i18 += charAt << i17;
                i17 += 5;
                if (charAt < 31) {
                    break;
                }
                i12 = i10;
            }
            int i19 = ((i18 & 1) != 0 ? ~(i18 >> 1) : i18 >> 1) + i14;
            int i20 = 0;
            while (true) {
                i11 = i10 + 1;
                int charAt2 = str.charAt(i10) - '@';
                i16 += charAt2 << i20;
                i20 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i10 = i11;
            }
            i15 += (i16 & 1) != 0 ? ~(i16 >> 1) : i16 >> 1;
            arrayList.add(Point.fromLngLat(i15 / pow, i19 / pow));
            i13++;
            i14 = i19;
            i12 = i11;
        }
        return arrayList.subList(0, i13);
    }

    public static String encode(List<Point> list, int i3) {
        StringBuilder sb2 = new StringBuilder();
        double pow = Math.pow(10.0d, i3);
        long j = 0;
        long j3 = 0;
        for (Point point : list) {
            long round = Math.round(point.latitude() * pow);
            long round2 = Math.round(point.longitude() * pow);
            encode(round - j, sb2);
            encode(round2 - j3, sb2);
            j = round;
            j3 = round2;
        }
        return sb2.toString();
    }

    private static double getSqDist(Point point, Point point2) {
        double longitude = point.longitude() - point2.longitude();
        double latitude = point.latitude() - point2.latitude();
        return (latitude * latitude) + (longitude * longitude);
    }

    private static double getSqSegDist(Point point, Point point2, Point point3) {
        double longitude = point2.longitude();
        double latitude = point2.latitude();
        double longitude2 = point3.longitude() - longitude;
        double latitude2 = point3.latitude() - latitude;
        if (longitude2 != 0.0d || latitude2 != 0.0d) {
            double latitude3 = (((point.latitude() - latitude) * latitude2) + ((point.longitude() - longitude) * longitude2)) / ((latitude2 * latitude2) + (longitude2 * longitude2));
            if (latitude3 > SIMPLIFY_DEFAULT_TOLERANCE) {
                longitude = point3.longitude();
                latitude = point3.latitude();
            } else if (latitude3 > 0.0d) {
                longitude += longitude2 * latitude3;
                latitude += latitude2 * latitude3;
            }
        }
        double longitude3 = point.longitude() - longitude;
        double latitude4 = point.latitude() - latitude;
        return (latitude4 * latitude4) + (longitude3 * longitude3);
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list) {
        return simplify(list, SIMPLIFY_DEFAULT_TOLERANCE, SIMPLIFY_DEFAULT_HIGHEST_QUALITY);
    }

    private static List<Point> simplifyDouglasPeucker(List<Point> list, double d8) {
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(list.get(0));
        arrayList.addAll(simplifyDpStep(list, 0, size, d8, arrayList));
        arrayList.add(list.get(size));
        return arrayList;
    }

    private static List<Point> simplifyDpStep(List<Point> list, int i3, int i10, double d8, List<Point> list2) {
        int i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        double d10 = d8;
        for (int i13 = i3 + 1; i13 < i10; i13++) {
            double sqSegDist = getSqSegDist(list.get(i13), list.get(i3), list.get(i10));
            if (sqSegDist > d10) {
                i12 = i13;
                d10 = sqSegDist;
            }
        }
        if (d10 > d8) {
            if (i12 - i3 > 1) {
                List<Point> simplifyDpStep = simplifyDpStep(list, i3, i12, d8, list2);
                i11 = i12;
                arrayList.addAll(simplifyDpStep);
            } else {
                i11 = i12;
            }
            arrayList.add(list.get(i11));
            if (i10 - i11 > 1) {
                arrayList.addAll(simplifyDpStep(list, i11, i10, d8, list2));
            }
        }
        return arrayList;
    }

    private static List<Point> simplifyRadialDist(List<Point> list, double d8) {
        Point point = list.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        int size = list.size();
        Point point2 = null;
        for (int i3 = 1; i3 < size; i3++) {
            point2 = list.get(i3);
            if (getSqDist(point2, point) > d8) {
                arrayList.add(point2);
                point = point2;
            }
        }
        if (!point.equals(point2)) {
            arrayList.add(point2);
        }
        return arrayList;
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list, double d8) {
        return simplify(list, d8, SIMPLIFY_DEFAULT_HIGHEST_QUALITY);
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list, boolean z2) {
        return simplify(list, SIMPLIFY_DEFAULT_TOLERANCE, z2);
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list, double d8, boolean z2) {
        if (list.size() <= 2) {
            return list;
        }
        double d10 = d8 * d8;
        if (!z2) {
            list = simplifyRadialDist(list, d10);
        }
        return simplifyDouglasPeucker(list, d10);
    }

    private static void encode(long j, StringBuilder sb2) {
        long j3 = j << 1;
        if (j < 0) {
            j3 = ~j3;
        }
        while (j3 >= 32) {
            sb2.append(Character.toChars((int) ((32 | (31 & j3)) + 63)));
            j3 >>= 5;
        }
        sb2.append(Character.toChars((int) (j3 + 63)));
    }
}
