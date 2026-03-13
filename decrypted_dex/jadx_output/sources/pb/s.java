package pb;

import io.flutter.plugin.common.EventChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f19801a;

    public s(p pVar) {
        this.f19801a = pVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        p pVar = this.f19801a;
        pVar.f19793a = null;
        pVar.a();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        p pVar = this.f19801a;
        pVar.f19793a = eventSink;
        pVar.a();
    }
}
