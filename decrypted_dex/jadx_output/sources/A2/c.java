package A2;

import H5.a0;
import Qb.J;
import Qb.L;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83b;

    public /* synthetic */ c(Object obj, int i3) {
        this.f82a = i3;
        this.f83b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f82a) {
            case 0:
                if (iBinder instanceof b) {
                    GeolocatorLocationService geolocatorLocationService = ((b) iBinder).f81e;
                    d dVar = (d) this.f83b;
                    dVar.f87d = geolocatorLocationService;
                    geolocatorLocationService.f11094f = dVar.f85b;
                    geolocatorLocationService.f11091c++;
                    Log.d(StubApp.getString2(90), StubApp.getString2(89) + geolocatorLocationService.f11091c);
                    i iVar = dVar.f89f;
                    if (iVar != null) {
                        iVar.f113e = geolocatorLocationService;
                        break;
                    }
                }
                break;
            default:
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(87));
                p2.h hVar = (p2.h) this.f83b;
                sb2.append(((LinkedBlockingDeque) hVar.f19673c).size());
                Log.d(StubApp.getString2(88), sb2.toString());
                hVar.f19672b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                ((LinkedBlockingDeque) hVar.f19673c).drainTo(arrayList);
                L.j(J.a((CoroutineContext) hVar.f19671a), null, new a0(hVar, arrayList, null), 3);
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f82a) {
            case 0:
                d dVar = (d) this.f83b;
                GeolocatorLocationService geolocatorLocationService = dVar.f87d;
                if (geolocatorLocationService != null) {
                    geolocatorLocationService.f11093e = null;
                    dVar.f87d = null;
                    break;
                }
                break;
            default:
                Log.d(StubApp.getString2(88), StubApp.getString2(91));
                p2.h hVar = (p2.h) this.f83b;
                hVar.f19672b = null;
                hVar.getClass();
                break;
        }
    }
}
