package j9;

import ba.AbstractC0534b;
import com.mapbox.geojson.Point;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g extends AbstractC0534b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Point fallback) {
        super(fallback);
        Intrinsics.checkNotNullParameter(fallback, "fallback");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i3) {
        super(Double.valueOf(0.0d));
        switch (i3) {
            case 4:
                super(Double.valueOf(16.35d));
                break;
            default:
                break;
        }
    }

    public g(double d8) {
        super(Double.valueOf(d8));
    }
}
