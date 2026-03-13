package r0;

import com.stub.StubApp;
import java.util.concurrent.ThreadFactory;

/* renamed from: r0.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class ThreadFactoryC1559t implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, StubApp.getString2(22546));
    }
}
