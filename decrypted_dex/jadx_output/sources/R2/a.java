package R2;

import android.os.Build;
import android.util.Log;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR2/a;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "<init>", "()V", "flutter_ezw_logger_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements InterfaceC0825b, MethodChannel.MethodCallHandler, EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f6072a;

    /* renamed from: b, reason: collision with root package name */
    public EventChannel f6073b;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Log.d(StubApp.getString2(5597), StubApp.getString2(5598));
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.f13554b, StubApp.getString2(5599));
        this.f6072a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel = new EventChannel(flutterPluginBinding.f13554b, StubApp.getString2(5600));
        this.f6073b = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        Log.d(StubApp.getString2(5597), StubApp.getString2(5601));
        c.f6075a = null;
        b bVar = c.f6076b;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Log.d(StubApp.getString2(5597), StubApp.getString2(5602));
        MethodChannel methodChannel = this.f6072a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
        EventChannel eventChannel = this.f6073b;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        this.f6073b = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        Log.d(StubApp.getString2(5597), StubApp.getString2(5603));
        Intrinsics.checkNotNullParameter(this, "evenLoggerPlugin");
        c.f6075a = eventSink;
        c.f6076b = new b(this);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.areEqual(call.method, "getPlatformVersion")) {
            result.notImplemented();
            return;
        }
        result.success(StubApp.getString2(2817) + Build.VERSION.RELEASE);
    }
}
