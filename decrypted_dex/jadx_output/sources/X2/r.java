package X2;

import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f8318a;

    public r(w wVar) {
        this.f8318a = wVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        Z2.b.f8971a = null;
        Z2.a aVar = Z2.b.f8972b;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        w plugin = this.f8318a;
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Z2.b.f8971a = eventSink;
        Z2.b.f8972b = new Z2.a(plugin);
    }
}
