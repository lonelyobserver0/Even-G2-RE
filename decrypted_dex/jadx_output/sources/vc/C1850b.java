package vc;

import io.flutter.plugin.common.EventChannel;

/* renamed from: vc.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1850b implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public EventChannel.EventSink f21940a;

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.f21940a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f21940a = eventSink;
    }
}
