package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import i2.o;
import j2.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10379a = o.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o.e().b(f10379a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k L10 = k.L(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (k.f15295n) {
                try {
                    L10.f15303k = goAsync;
                    if (L10.j) {
                        goAsync.finish();
                        L10.f15303k = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e10) {
            o.e().d(f10379a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
