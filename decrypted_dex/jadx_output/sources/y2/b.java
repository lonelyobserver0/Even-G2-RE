package y2;

import android.location.Geocoder$GeocodeListener;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements Geocoder$GeocodeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1967a f23490b;

    public /* synthetic */ b(InterfaceC1967a interfaceC1967a, int i3) {
        this.f23489a = i3;
        this.f23490b = interfaceC1967a;
    }

    public final void onError(String str) {
        switch (this.f23489a) {
            case 0:
                this.f23490b.onError(str);
                break;
            default:
                ((f) this.f23490b).onError(str);
                break;
        }
    }

    public final void onGeocode(List list) {
        switch (this.f23489a) {
            case 0:
                this.f23490b.onGeocode(list);
                break;
            default:
                ((f) this.f23490b).onGeocode(list);
                break;
        }
    }
}
