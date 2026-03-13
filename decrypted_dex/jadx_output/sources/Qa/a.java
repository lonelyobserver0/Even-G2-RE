package Qa;

import B0.o;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5785a;

    public a(b bVar) {
        this.f5785a = bVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        b bVar = this.f5785a;
        bVar.f5788c.post(new Ab.b(12, bVar, s2.d.j(((ConnectivityManager) bVar.f5786a.f20712b).getNetworkCapabilities(network))));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        b bVar = this.f5785a;
        bVar.f5786a.getClass();
        bVar.f5788c.post(new Ab.b(12, bVar, s2.d.j(networkCapabilities)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        b bVar = this.f5785a;
        bVar.f5788c.postDelayed(new o(bVar, 8), 500L);
    }
}
