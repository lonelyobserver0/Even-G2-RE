package p6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1492a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final EventChannel.EventSink f19694a;

    /* renamed from: b, reason: collision with root package name */
    public AudioManager f19695b;

    /* renamed from: c, reason: collision with root package name */
    public int f19696c;

    public C1492a(EventChannel.EventSink eventSink) {
        this.f19694a = eventSink;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(StubApp.getString2(643));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        this.f19695b = audioManager;
        AudioManager audioManager2 = null;
        String string2 = StubApp.getString2(22121);
        if (audioManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            audioManager = null;
        }
        this.f19696c = audioManager.getStreamVolume(3);
        AudioManager audioManager3 = this.f19695b;
        if (audioManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            audioManager2 = audioManager3;
        }
        double d8 = 10000;
        double rint = Math.rint((this.f19696c / audioManager2.getStreamMaxVolume(3)) * d8) / d8;
        EventChannel.EventSink eventSink = this.f19694a;
        if (eventSink != null) {
            eventSink.success(Double.valueOf(rint));
        }
    }
}
