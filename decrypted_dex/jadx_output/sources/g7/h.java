package g7;

import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.MapOptions;
import com.mapbox.maps.Size;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface h {
    MapOptions getMapOptions();

    Size getSize();

    void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint);

    void setGestureInProgress(boolean z2);

    void setUserAnimationInProgress(boolean z2);
}
