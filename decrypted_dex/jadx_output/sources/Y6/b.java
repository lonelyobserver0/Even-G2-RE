package Y6;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapboxMap;
import kotlin.reflect.KProperty;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements Cancelable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8744a;

    public /* synthetic */ b(int i3) {
        this.f8744a = i3;
    }

    private final void a() {
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        switch (this.f8744a) {
            case 0:
                KProperty[] kPropertyArr = j.f8762B;
                break;
            case 1:
                break;
            case 2:
                MapboxMap.getFeatureState$lambda$31();
                break;
            case 3:
                MapboxMap.setFeatureState$lambda$25();
                break;
            default:
                MapboxMap.removeFeatureState$lambda$37();
                break;
        }
    }
}
