package z6;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.Intrinsics;
import t6.EnumC1738e;

/* renamed from: z6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2012b implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public EventChannel.EventSink f24127a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC1738e f24128b = EnumC1738e.f21206d;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f24129c = new Handler(Looper.getMainLooper());

    public final void a(EnumC1738e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f24128b != state) {
            this.f24128b = state;
            this.f24129c.post(new com.even.translate.a(27, this, state));
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.f24127a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f24127a = eventSink;
    }
}
