package R2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.flutter.plugin.common.EventChannel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f6074a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a plugin) {
        super(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.f6074a = new WeakReference(plugin);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        EventChannel.EventSink eventSink;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (this.f6074a.get() == null || (eventSink = c.f6075a) == null) {
            return;
        }
        eventSink.success(msg.obj);
    }
}
