package D5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.stub.StubApp;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class J extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public K f1375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f1376b;

    public J(K k3, K k4) {
        this.f1376b = k3;
        this.f1375a = k4;
    }

    public final void a() {
        String string2 = StubApp.getString2(493);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(1354));
        }
        K k3 = this.f1376b;
        k3.f1380a.registerReceiver(this, new IntentFilter(StubApp.getString2(1355)));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            K k3 = this.f1375a;
            if (k3 == null) {
                return;
            }
            if (k3.d()) {
                if (Log.isLoggable(StubApp.getString2("493"), 3)) {
                    Log.d(StubApp.getString2("493"), StubApp.getString2("1356"));
                }
                K k4 = this.f1375a;
                k4.f1383d.f1372f.schedule(k4, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f1375a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
