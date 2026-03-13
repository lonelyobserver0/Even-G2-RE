package p6;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p6.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1494c implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19702a;

    /* renamed from: b, reason: collision with root package name */
    public C1492a f19703b;

    /* renamed from: c, reason: collision with root package name */
    public AudioManager f19704c;

    /* renamed from: d, reason: collision with root package name */
    public EventChannel.EventSink f19705d;

    public C1494c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f19702a = context;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        C1492a c1492a = this.f19703b;
        if (c1492a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("volumeBroadcastReceiver");
            c1492a = null;
        }
        this.f19702a.unregisterReceiver(c1492a);
        this.f19705d = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f19705d = eventSink;
        Context context = this.f19702a;
        Object systemService = context.getSystemService(StubApp.getString2(643));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f19704c = (AudioManager) systemService;
        this.f19703b = new C1492a(this.f19705d);
        IntentFilter intentFilter = new IntentFilter(StubApp.getString2(22126));
        C1492a c1492a = this.f19703b;
        AudioManager audioManager = null;
        if (c1492a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("volumeBroadcastReceiver");
            c1492a = null;
        }
        context.registerReceiver(c1492a, intentFilter);
        EventChannel.EventSink eventSink2 = this.f19705d;
        if (eventSink2 != null) {
            AudioManager audioManager2 = this.f19704c;
            String string2 = StubApp.getString2(22121);
            if (audioManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                audioManager2 = null;
            }
            int streamVolume = audioManager2.getStreamVolume(3);
            AudioManager audioManager3 = this.f19704c;
            if (audioManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                audioManager = audioManager3;
            }
            double d8 = 10000;
            eventSink2.success(Double.valueOf(Math.rint((streamVolume / audioManager.getStreamMaxVolume(3)) * d8) / d8));
        }
    }
}
