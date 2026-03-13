package Ab;

import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f268b;

    public /* synthetic */ e(Handler handler, int i3) {
        this.f267a = i3;
        this.f268b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f267a) {
            case 0:
                this.f268b.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.f268b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + StubApp.getString2(441));
            default:
                runnable.getClass();
                Handler handler2 = this.f268b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + StubApp.getString2(441));
        }
    }

    public e() {
        this.f267a = 0;
        this.f268b = new Handler(Looper.getMainLooper());
    }
}
