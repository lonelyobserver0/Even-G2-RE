package com.mapbox.maps.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/util/MathUtils;", "", "()V", "normalize", "", "angle", "prepareOptimalBearingPath", "", "targets", "shortestRotation", "targetHeading", "currentHeading", "shortestRotation$sdk_base_release", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MathUtils {
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    private final double normalize(double angle) {
        return ((angle % 360.0d) + 360.0d) % 360.0d;
    }

    public final double[] prepareOptimalBearingPath(double[] targets) {
        double shortestRotation$sdk_base_release;
        Intrinsics.checkNotNullParameter(targets, "targets");
        double[] dArr = new double[targets.length];
        int length = targets.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 == 0) {
                shortestRotation$sdk_base_release = INSTANCE.normalize(targets[i3]);
            } else {
                MathUtils mathUtils = INSTANCE;
                shortestRotation$sdk_base_release = mathUtils.shortestRotation$sdk_base_release(mathUtils.normalize(targets[i3]), dArr[i3 - 1]);
            }
            dArr[i3] = shortestRotation$sdk_base_release;
        }
        return dArr;
    }

    public final double shortestRotation$sdk_base_release(double targetHeading, double currentHeading) {
        double d8 = currentHeading - targetHeading;
        return d8 > 180.0d ? targetHeading + 360.0f : d8 < -180.0d ? targetHeading - 360.0f : targetHeading;
    }
}
