package D5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1348a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f1349b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1350c;

    public /* synthetic */ D() {
    }

    public void a() {
        String string2 = StubApp.getString2(493);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(1354));
        }
        IntentFilter intentFilter = new IntentFilter(StubApp.getString2(1355));
        E e10 = (E) this.f1349b;
        if (e10 != null) {
            Context context = e10.f1353c.f12059b;
            this.f1350c = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f1348a) {
            case 0:
                E e10 = (E) this.f1349b;
                if (e10 != null && e10.a()) {
                    String string2 = StubApp.getString2(493);
                    if (Log.isLoggable(string2, 3)) {
                        Log.d(string2, StubApp.getString2(1356));
                    }
                    E e11 = (E) this.f1349b;
                    e11.f1353c.getClass();
                    FirebaseMessaging.b(e11, 0L);
                    Context context2 = (Context) this.f1350c;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f1349b = null;
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                ((Y8.d) this.f1349b).f8840b.postDelayed(new Ab.b(25, (Z8.f) this.f1350c, context), 100L);
                break;
        }
    }

    public D(Y8.d dVar, Z8.f fVar) {
        this.f1349b = dVar;
        this.f1350c = fVar;
    }
}
