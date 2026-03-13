package E6;

import com.mapbox.api.directions.v5.models.Bearing;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements b {
    @Override // E6.b
    public final Object i(String str) {
        String[] split = str.split(StubApp.getString2(321));
        return Bearing.builder().angle(Double.parseDouble(split[0])).degrees(Double.parseDouble(split[1])).build();
    }
}
