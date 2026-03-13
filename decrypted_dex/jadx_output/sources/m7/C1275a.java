package m7;

import android.animation.TypeEvaluator;
import com.mapbox.geojson.Point;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1275a implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17127a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        switch (this.f17127a) {
            case 0:
                Point point = (Point) obj;
                Point point2 = (Point) obj2;
                double d8 = f10;
                double longitude = ((point2.longitude() - point.longitude()) * d8) + point.longitude();
                double latitude = ((point2.latitude() - point.latitude()) * d8) + point.latitude();
                if (!point.hasAltitude() || !point2.hasAltitude()) {
                    return Point.fromLngLat(longitude, latitude);
                }
                return Point.fromLngLat(longitude, latitude, ((point2.altitude() - point.altitude()) * d8) + point.altitude());
            case 1:
                Double startValue = (Double) obj;
                double doubleValue = startValue.doubleValue();
                double d10 = f10;
                double doubleValue2 = ((Double) obj2).doubleValue();
                Intrinsics.checkNotNullExpressionValue(startValue, "startValue");
                return Double.valueOf(((doubleValue2 - startValue.doubleValue()) * d10) + doubleValue);
            default:
                Point point3 = (Point) obj;
                Point point4 = (Point) obj2;
                double d11 = f10;
                return Point.fromLngLat(((point4.longitude() - point3.longitude()) * d11) + point3.longitude(), ((point4.latitude() - point3.latitude()) * d11) + point3.latitude());
        }
    }
}
