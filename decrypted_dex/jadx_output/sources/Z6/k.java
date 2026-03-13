package Z6;

import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.ScreenCoordinate;
import com.stub.StubApp;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final k f9011b = new k(0);

    /* renamed from: c, reason: collision with root package name */
    public static final k f9012c = new k(1);

    /* renamed from: d, reason: collision with root package name */
    public static final k f9013d = new k(2);

    /* renamed from: e, reason: collision with root package name */
    public static final k f9014e = new k(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9015a;

    public /* synthetic */ k(int i3) {
        this.f9015a = i3;
    }

    @Override // Z6.i
    public final boolean a(Serializable cameraCurrentValue, Object startValue, Object[] values) {
        switch (this.f9015a) {
            case 0:
                return Tc.d.e(cameraCurrentValue, startValue, values);
            case 1:
                return Tc.d.e(cameraCurrentValue, startValue, values);
            case 2:
                return Tc.d.e(cameraCurrentValue, startValue, values);
            case 3:
                return Tc.d.e(cameraCurrentValue, startValue, values);
            default:
                Intrinsics.checkNotNullParameter(cameraCurrentValue, "cameraCurrentValue");
                Intrinsics.checkNotNullParameter(startValue, "startValue");
                Intrinsics.checkNotNullParameter(values, "values");
                return false;
        }
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        switch (this.f9015a) {
            case 0:
                Double startValue = (Double) obj;
                Double d8 = (Double) obj2;
                if (f10 == 1.0f) {
                    return d8;
                }
                if (f10 == 0.0f) {
                    return startValue;
                }
                double doubleValue = d8.doubleValue();
                Intrinsics.checkNotNullExpressionValue(startValue, "startValue");
                double doubleValue2 = doubleValue - startValue.doubleValue();
                if (doubleValue2 == 0.0d) {
                    return startValue;
                }
                return Double.valueOf((f10 * doubleValue2) + startValue.doubleValue());
            case 1:
                EdgeInsets edgeInsets = (EdgeInsets) obj;
                EdgeInsets edgeInsets2 = (EdgeInsets) obj2;
                String string2 = StubApp.getString2(374);
                if (edgeInsets2 == null) {
                    MapboxLogger.logW(string2, StubApp.getString2(7628) + f10 + ')');
                    edgeInsets2 = l.f9016a;
                }
                if (f10 == 1.0f) {
                    return edgeInsets2;
                }
                if (edgeInsets == null) {
                    MapboxLogger.logW(string2, StubApp.getString2(7629) + f10 + ')');
                    edgeInsets = l.f9016a;
                }
                if (f10 != 0.0f) {
                    double top = edgeInsets2.getTop() - edgeInsets.getTop();
                    double left = edgeInsets2.getLeft() - edgeInsets.getLeft();
                    double bottom = edgeInsets2.getBottom() - edgeInsets.getBottom();
                    double right = edgeInsets2.getRight() - edgeInsets.getRight();
                    if (top != 0.0d || left != 0.0d || bottom != 0.0d || right != 0.0d) {
                        double d10 = f10;
                        return new EdgeInsets(edgeInsets.getTop() + (top * d10), (left * d10) + edgeInsets.getLeft(), (bottom * d10) + edgeInsets.getBottom(), (d10 * right) + edgeInsets.getRight());
                    }
                }
                return edgeInsets;
            case 2:
                Point point = (Point) obj;
                Point point2 = (Point) obj2;
                if (f10 == 1.0f) {
                    return point2;
                }
                if (f10 == 0.0f) {
                    return point;
                }
                double longitude = point2.longitude() - point.longitude();
                double latitude = point2.latitude() - point.latitude();
                if (longitude == 0.0d && latitude == 0.0d) {
                    return point;
                }
                double d11 = f10;
                return Point.fromLngLat((longitude * d11) + point.longitude(), (d11 * latitude) + point.latitude());
            case 3:
                ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
                ScreenCoordinate screenCoordinate2 = (ScreenCoordinate) obj2;
                if (f10 != 1.0f) {
                    if (f10 == 0.0f) {
                        return screenCoordinate;
                    }
                    double x7 = screenCoordinate2.getX() - screenCoordinate.getX();
                    double y10 = screenCoordinate2.getY() - screenCoordinate.getY();
                    if (x7 == 0.0d && y10 == 0.0d) {
                        return screenCoordinate;
                    }
                    double d12 = f10;
                    screenCoordinate2 = new ScreenCoordinate((x7 * d12) + screenCoordinate.getX(), (d12 * y10) + screenCoordinate.getY());
                }
                return screenCoordinate2;
            default:
                return (ScreenCoordinate) l.f9018c.evaluate(f10, (ScreenCoordinate) obj, (ScreenCoordinate) obj2);
        }
    }
}
