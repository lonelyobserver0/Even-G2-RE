package K;

import android.os.Process;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f3569a;

    public k(Runnable runnable) {
        super(runnable, StubApp.getString2(3124));
        this.f3569a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f3569a);
        super.run();
    }
}
