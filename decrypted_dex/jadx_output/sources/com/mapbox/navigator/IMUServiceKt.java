package com.mapbox.navigator;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a2\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0002\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0004H\u0002¨\u0006\f"}, d2 = {"normalizeAngle", "", "angle", "copyFrom", "", "from", "destinationOffset", "", "startIndex", "endIndex", "toPoint3d", "Lcom/mapbox/navigator/Point3d;", "dash-native_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class IMUServiceKt {
    private static final float[] copyFrom(float[] fArr, float[] fArr2, int i3, int i10, int i11) {
        return ArraysKt.copyInto(fArr2, fArr, i3, i10, i11);
    }

    public static /* synthetic */ float[] copyFrom$default(float[] fArr, float[] fArr2, int i3, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i3 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = fArr2.length;
        }
        return copyFrom(fArr, fArr2, i3, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double normalizeAngle(double d8) {
        while (d8 < 0.0d) {
            d8 += 360;
        }
        while (d8 > 360.0d) {
            d8 -= 360;
        }
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point3d toPoint3d(float[] fArr) {
        return new Point3d(fArr[0], fArr[1], fArr[2]);
    }
}
