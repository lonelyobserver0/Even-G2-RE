package g7;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraBounds;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapCenterAltitudeMode;
import com.mapbox.maps.ScreenCoordinate;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface InterfaceC0962a {
    void cameraForCoordinates(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d8, ScreenCoordinate screenCoordinate, Function1 function1);

    CameraOptions cameraForDrag(ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2);

    Point coordinateForPixel(ScreenCoordinate screenCoordinate);

    CameraBounds getBounds();

    CameraState getCameraState();

    MapCenterAltitudeMode getCenterAltitudeMode();

    ScreenCoordinate pixelForCoordinate(Point point);

    void setCamera(CameraOptions cameraOptions);

    void setCenterAltitudeMode(MapCenterAltitudeMode mapCenterAltitudeMode);
}
