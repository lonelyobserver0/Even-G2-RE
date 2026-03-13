package x0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f22728a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f22728a.post(runnable);
    }
}
