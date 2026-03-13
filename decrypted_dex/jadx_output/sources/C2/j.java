package C2;

import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.location.LocationManager;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface j {
    static boolean a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    void b(b bVar);

    boolean c(int i3, int i10);

    void d();

    void e(AbstractActivityC0364d abstractActivityC0364d, r rVar, B2.a aVar);

    void f(A2.g gVar, A2.g gVar2);
}
