package a4;

import android.os.Process;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
