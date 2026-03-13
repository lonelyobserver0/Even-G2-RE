package org.chromium.net;

import com.stub.StubApp;
import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class NetworkQualityRttListener {
    private final Executor mExecutor;

    public NetworkQualityRttListener(Executor executor) {
        if (executor == null) {
            throw new IllegalStateException(StubApp.getString2(5645));
        }
        this.mExecutor = executor;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onRttObservation(int i3, long j, int i10);
}
