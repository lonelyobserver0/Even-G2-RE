package Qa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends BroadcastReceiver implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final s2.d f5786a;

    /* renamed from: b, reason: collision with root package name */
    public EventChannel.EventSink f5787b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f5788c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public a f5789d;

    public b(Context context, s2.d dVar) {
        this.f5786a = dVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        a aVar = this.f5789d;
        if (aVar != null) {
            ((ConnectivityManager) this.f5786a.f20712b).unregisterNetworkCallback(aVar);
            this.f5789d = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f5787b = eventSink;
        a aVar = new a(this);
        this.f5789d = aVar;
        s2.d dVar = this.f5786a;
        ((ConnectivityManager) dVar.f20712b).registerDefaultNetworkCallback(aVar);
        ConnectivityManager connectivityManager = (ConnectivityManager) dVar.f20712b;
        this.f5788c.post(new Ab.b(12, this, s2.d.j(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink = this.f5787b;
        if (eventSink != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f5786a.f20712b;
            eventSink.success(s2.d.j(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}
