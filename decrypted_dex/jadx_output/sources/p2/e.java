package p2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.stub.StubApp;
import i2.o;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f19665a;

    public e(f fVar) {
        this.f19665a = fVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        o.e().b(f.f19666i, StubApp.getString2(22094) + networkCapabilities, new Throwable[0]);
        f fVar = this.f19665a;
        fVar.c(fVar.f());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        o.e().b(f.f19666i, StubApp.getString2(22095), new Throwable[0]);
        f fVar = this.f19665a;
        fVar.c(fVar.f());
    }
}
