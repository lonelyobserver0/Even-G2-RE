package com.mapbox.common;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class ConnectionChangeCallback extends ConnectivityManager.NetworkCallback {
    private final WeakReference<Reachability> reachability;

    public ConnectionChangeCallback(Reachability reachability) {
        this.reachability = new WeakReference<>(reachability);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyReachability$0() {
        Reachability reachability = this.reachability.get();
        if (reachability != null) {
            reachability.onNetworkChanged();
        }
    }

    private void notifyReachability() {
        boolean z2 = Looper.myLooper() == Looper.getMainLooper();
        a aVar = new a(this, 0);
        if (z2) {
            aVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(aVar);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        notifyReachability();
    }
}
