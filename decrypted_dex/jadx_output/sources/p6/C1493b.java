package p6;

import Z9.C0366a;
import android.content.Context;
import android.media.AudioManager;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp6/b;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "volume_controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: p6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1493b implements InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public Context f19697a;

    /* renamed from: b, reason: collision with root package name */
    public C0366a f19698b;

    /* renamed from: c, reason: collision with root package name */
    public MethodChannel f19699c;

    /* renamed from: d, reason: collision with root package name */
    public EventChannel f19700d;

    /* renamed from: e, reason: collision with root package name */
    public C1494c f19701e;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context context = flutterPluginBinding.f13553a;
        this.f19697a = context;
        String string2 = StubApp.getString2(354);
        C1494c c1494c = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            context = null;
        }
        Intrinsics.checkNotNullParameter(context, string2);
        C0366a c0366a = new C0366a(22, false);
        Object systemService = context.getSystemService(StubApp.getString2(643));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        c0366a.f9105b = (AudioManager) systemService;
        this.f19698b = c0366a;
        BinaryMessenger binaryMessenger = flutterPluginBinding.f13554b;
        this.f19700d = new EventChannel(binaryMessenger, StubApp.getString2(22122));
        Context context2 = this.f19697a;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            context2 = null;
        }
        this.f19701e = new C1494c(context2);
        EventChannel eventChannel = this.f19700d;
        if (eventChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("volumeListenerEventChannel");
            eventChannel = null;
        }
        C1494c c1494c2 = this.f19701e;
        if (c1494c2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("volumeListenerStreamHandler");
        } else {
            c1494c = c1494c2;
        }
        eventChannel.setStreamHandler(c1494c);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, StubApp.getString2(22123));
        this.f19699c = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f19699c;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
        EventChannel eventChannel = this.f19700d;
        if (eventChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("volumeListenerEventChannel");
            eventChannel = null;
        }
        eventChannel.setStreamHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        boolean areEqual = Intrinsics.areEqual(str, "setVolume");
        C0366a c0366a = null;
        String string2 = StubApp.getString2(22124);
        if (!areEqual) {
            if (Intrinsics.areEqual(str, "getVolume")) {
                C0366a c0366a2 = this.f19698b;
                if (c0366a2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    c0366a = c0366a2;
                }
                AudioManager audioManager = (AudioManager) c0366a.f9105b;
                double d8 = 10000;
                result.success(Double.valueOf(Math.rint((audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) * d8) / d8));
                return;
            }
            return;
        }
        Object argument = call.argument(StubApp.getString2(1968));
        Intrinsics.checkNotNull(argument);
        double doubleValue = ((Number) argument).doubleValue();
        Object argument2 = call.argument(StubApp.getString2(22125));
        Intrinsics.checkNotNull(argument2);
        boolean booleanValue = ((Boolean) argument2).booleanValue();
        C0366a c0366a3 = this.f19698b;
        if (c0366a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            c0366a = c0366a3;
        }
        c0366a.getClass();
        double d10 = doubleValue <= 1.0d ? doubleValue : 1.0d;
        if (doubleValue < 0.0d) {
            d10 = 0.0d;
        }
        ((AudioManager) c0366a.f9105b).setStreamVolume(3, (int) Math.rint(d10 * r10.getStreamMaxVolume(3)), booleanValue ? 1 : 0);
    }
}
