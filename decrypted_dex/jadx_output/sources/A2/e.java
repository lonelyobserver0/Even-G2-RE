package A2;

import C2.n;
import android.content.Context;
import android.content.IntentFilter;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public EventChannel f92a;

    /* renamed from: b, reason: collision with root package name */
    public Context f93b;

    /* renamed from: c, reason: collision with root package name */
    public n f94c;

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        n nVar;
        Context context = this.f93b;
        if (context == null || (nVar = this.f94c) == null) {
            return;
        }
        context.unregisterReceiver(nVar);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        if (this.f93b == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter(StubApp.getString2(101));
        intentFilter.addAction(StubApp.getString2(102));
        n nVar = new n(eventSink);
        this.f94c = nVar;
        D.a.c(this.f93b, nVar, intentFilter, 2);
    }
}
