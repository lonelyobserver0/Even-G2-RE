package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import i2.o;
import s2.c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10392a = o.g("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (o.e().f14746a <= 2) {
            Log.v(f10392a, "Rescheduling alarm that keeps track of force-stops.");
        }
        c.c(context);
    }
}
