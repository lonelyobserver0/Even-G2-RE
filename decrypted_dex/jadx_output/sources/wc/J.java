package wc;

import Kc.C0104k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public abstract class J {
    public abstract void onClosed(I i3, int i10, String str);

    public void onClosing(I webSocket, int i3, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public abstract void onFailure(I i3, Throwable th, C1881F c1881f);

    public abstract void onMessage(I i3, C0104k c0104k);

    public abstract void onMessage(I i3, String str);

    public abstract void onOpen(I i3, C1881F c1881f);
}
