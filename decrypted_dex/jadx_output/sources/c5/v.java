package c5;

import android.os.Process;
import android.util.Log;
import com.stub.StubApp;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10960a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10961b;

    public v(Runnable runnable) {
        this.f10961b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        switch (this.f10960a) {
            case 0:
                ((Runnable) this.f10961b).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) this.f10961b;
                String string2 = StubApp.getString2(280);
                try {
                    String string22 = StubApp.getString2("9592");
                    if (Log.isLoggable(string2, 3)) {
                        Log.d(string2, string22, null);
                    }
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        String string23 = StubApp.getString2("9593");
                        if (Log.isLoggable(string2, 3)) {
                            Log.d(string2, string23, null);
                        }
                        executorService.shutdownNow();
                        break;
                    }
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    if (Log.isLoggable(string2, 3)) {
                        Log.d(string2, StubApp.getString2(9594), null);
                    }
                    executorService.shutdownNow();
                    return;
                }
                break;
        }
    }

    public v(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10961b = executorService;
    }
}
