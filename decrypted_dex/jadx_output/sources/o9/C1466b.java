package o9;

import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.view.animation.PathInterpolator;
import com.mapbox.geojson.Point;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o9.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1466b implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f18389a;

    public C1466b(Point point, Point[] keyPoints) {
        TimeInterpolator c1465a;
        Point point2 = point;
        Intrinsics.checkNotNullParameter(point2, StubApp.getString2(21622));
        Intrinsics.checkNotNullParameter(keyPoints, "keyPoints");
        ArrayList arrayList = new ArrayList();
        int length = keyPoints.length;
        double d8 = 0.0d;
        int i3 = 0;
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < length) {
            Point point3 = keyPoints[i10];
            double hypot = Math.hypot(point3.latitude() - point2.latitude(), point3.longitude() - point2.longitude());
            arrayList.add(Double.valueOf(hypot));
            d10 += hypot;
            i10++;
            point2 = point3;
        }
        if (0.0d < d10) {
            Path path = new Path();
            double size = 1.0d / arrayList.size();
            int size2 = arrayList.size() - 2;
            if (size2 >= 0) {
                while (true) {
                    double doubleValue = (((Number) arrayList.get(i3)).doubleValue() / d10) + d8;
                    d8 = doubleValue > 1.0d ? 1.0d : doubleValue;
                    int i11 = i3 + 1;
                    path.lineTo((float) d8, (float) (i11 * size));
                    if (i3 == size2) {
                        break;
                    } else {
                        i3 = i11;
                    }
                }
            }
            path.lineTo(1.0f, 1.0f);
            c1465a = new PathInterpolator(path);
        } else {
            c1465a = new C1465a();
        }
        this.f18389a = c1465a;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return this.f18389a.getInterpolation(f10);
    }
}
