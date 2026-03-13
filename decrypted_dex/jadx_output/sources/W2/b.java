package W2;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f8074a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c handler) {
        super(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f8074a = new WeakReference(handler);
    }
}
