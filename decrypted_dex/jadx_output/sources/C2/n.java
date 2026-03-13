package C2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final EventChannel.EventSink f1091a;

    /* renamed from: b, reason: collision with root package name */
    public int f1092b;

    public n(EventChannel.EventSink eventSink) {
        this.f1091a = eventSink;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (StubApp.getString2(101).equals(intent.getAction())) {
            LocationManager locationManager = (LocationManager) context.getSystemService(StubApp.getString2(662));
            boolean isProviderEnabled = locationManager.isProviderEnabled(StubApp.getString2(540));
            boolean isProviderEnabled2 = locationManager.isProviderEnabled(StubApp.getString2(1096));
            EventChannel.EventSink eventSink = this.f1091a;
            if (isProviderEnabled || isProviderEnabled2) {
                int i3 = this.f1092b;
                if (i3 == 0 || i3 == 1) {
                    this.f1092b = 2;
                    eventSink.success(1);
                    return;
                }
                return;
            }
            int i10 = this.f1092b;
            if (i10 == 0 || i10 == 2) {
                this.f1092b = 1;
                eventSink.success(0);
            }
        }
    }
}
