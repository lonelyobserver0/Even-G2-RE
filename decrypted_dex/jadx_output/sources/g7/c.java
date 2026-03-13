package g7;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.PlatformEventInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface c {
    Cancelable addInteraction(MapInteraction mapInteraction);

    void dispatch(PlatformEventInfo platformEventInfo);
}
