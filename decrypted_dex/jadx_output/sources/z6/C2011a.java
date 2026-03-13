package z6;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;

/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2011a implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public EventChannel.EventSink f24125a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f24126b = new Handler(Looper.getMainLooper());

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.f24125a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f24125a = eventSink;
    }
}
