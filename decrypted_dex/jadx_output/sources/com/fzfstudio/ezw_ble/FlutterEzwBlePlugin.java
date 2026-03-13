package com.fzfstudio.ezw_ble;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.fzfstudio.ezw_ble.ble.BleEC;
import com.fzfstudio.ezw_ble.ble.BleMC;
import com.fzfstudio.ezw_ble.ble.BleManager;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/fzfstudio/ezw_ble/FlutterEzwBlePlugin;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Ldb/a;", "flutterPluginBinding", "", "onAttachedToEngine", "(Ldb/a;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "binding", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlutterEzwBlePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterEzwBlePlugin.kt\ncom/fzfstudio/ezw_ble/FlutterEzwBlePlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1869#2,2:66\n*S KotlinDebug\n*F\n+ 1 FlutterEzwBlePlugin.kt\ncom/fzfstudio/ezw_ble/FlutterEzwBlePlugin\n*L\n35#1:66,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FlutterEzwBlePlugin implements InterfaceC0825b, MethodChannel.MethodCallHandler {
    private MethodChannel channel;
    private Context context;

    @Override // db.InterfaceC0825b
    public void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        this.context = flutterPluginBinding.f13553a;
        String string2 = StubApp.getString2(11216);
        BinaryMessenger binaryMessenger = flutterPluginBinding.f13554b;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, string2);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        for (BleEC bleEC : BleEC.getEntries()) {
            Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
            bleEC.registerEventChannel(binaryMessenger);
        }
        BleManager companion = BleManager.INSTANCE.getInstance();
        String string22 = StubApp.getString2(11217);
        Context context = flutterPluginBinding.f13553a;
        Intrinsics.checkNotNullExpressionValue(context, string22);
        companion.init(context);
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.fzfstudio.ezw_ble.FlutterEzwBlePlugin$onAttachedToEngine$2
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                BleManager.INSTANCE.getInstance().checkBluetoothPermission();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
        });
    }

    @Override // db.InterfaceC0825b
    public void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
        BleManager.INSTANCE.getInstance().release();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        BleMC.Companion companion = BleMC.INSTANCE;
        String method = call.method;
        Intrinsics.checkNotNullExpressionValue(method, "method");
        BleMC from = companion.from(method);
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        from.handle(context, call.arguments, result);
    }
}
