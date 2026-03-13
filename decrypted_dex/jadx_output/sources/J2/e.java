package J2;

import android.content.Context;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LJ2/e;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f3403a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3404b;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.f13554b, StubApp.getString2(2978));
        this.f3403a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f3404b = flutterPluginBinding.f13553a;
        d callback = new d(this, 0);
        Intrinsics.checkNotNullParameter(callback, "callback");
        c.f3400b = callback;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f3403a;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x00a7, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0143, code lost:
    
        if (r7.checkSelfPermission(r14) == 0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r29v0, types: [io.flutter.plugin.common.MethodChannel$Result, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(io.flutter.plugin.common.MethodCall r28, io.flutter.plugin.common.MethodChannel.Result r29) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.e.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
