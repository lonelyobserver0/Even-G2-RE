package Z2;

import X2.w;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.flutter.plugin.common.EventChannel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f8970a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w plugin) {
        super(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.f8970a = new WeakReference(plugin);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        EventChannel.EventSink eventSink;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (this.f8970a.get() == null || (eventSink = b.f8971a) == null) {
            return;
        }
        eventSink.success(msg.obj);
    }
}
