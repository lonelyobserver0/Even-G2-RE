package R4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import t.C1691d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f6189b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f6190a;

    public g(Context context) {
        this.f6190a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f6191k) {
            try {
                Iterator it = ((C1691d) h.f6192l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6190a.unregisterReceiver(this);
    }
}
