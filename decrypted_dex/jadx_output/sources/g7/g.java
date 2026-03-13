package g7;

import com.mapbox.geojson.Point;
import com.mapbox.maps.MercatorCoordinate;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface g {
    double getMetersPerPixelAtLatitude(double d8, double d10);

    MercatorCoordinate project(Point point, double d8);

    Point unproject(MercatorCoordinate mercatorCoordinate, double d8);
}
