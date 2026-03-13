package androidx.work.impl.diagnostics;

import O0.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import i2.o;
import j2.C1087e;
import j2.k;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10386a = o.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f10386a;
        o.e().b(str, "Requesting diagnostics", new Throwable[0]);
        try {
            k L10 = k.L(context);
            List singletonList = Collections.singletonList(new l(DiagnosticsWorker.class).d());
            if (singletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new C1087e(L10, null, 2, singletonList).G();
        } catch (IllegalStateException e10) {
            o.e().d(str, "WorkManager is not initialized", e10);
        }
    }
}
