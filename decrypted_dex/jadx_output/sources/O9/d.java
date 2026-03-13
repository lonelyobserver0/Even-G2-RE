package O9;

import io.flutter.plugin.common.EventChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f5305a;

    public d(j jVar) {
        this.f5305a = jVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.f5305a.f5321b.j = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f5305a.f5321b.j = eventSink;
    }
}
