package androidx.work.impl.background.systemalarm;

import E1.a;
import K.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import i2.o;
import j2.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10378a = o.g("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            k.L(context).f15299f.j(new m(intent, context, goAsync(), 7));
        } else {
            o.e().b(f10378a, a.j("Ignoring unknown action ", action), new Throwable[0]);
        }
    }
}
