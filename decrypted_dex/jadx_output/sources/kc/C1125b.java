package kc;

import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkc/b;", "Ldb/b;", "Leb/a;", "<init>", "()V", "qr_code_scanner_plus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kc.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C1125b implements InterfaceC0825b, eb.a {
    @Override // eb.a
    public final void onAttachedToActivity(eb.b activityPluginBinding) {
        Intrinsics.checkNotNullParameter(activityPluginBinding, "activityPluginBinding");
        Ec.d.f2142a = ((Ya.d) activityPluginBinding).f8882a;
        Ec.d.f2143b = activityPluginBinding;
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        PlatformViewRegistry platformViewRegistry = flutterPluginBinding.f13556d;
        BinaryMessenger binaryMessenger = flutterPluginBinding.f13554b;
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        platformViewRegistry.registerViewFactory(StubApp.getString2(26059), new Va.c(binaryMessenger, 1));
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        Ec.d.f2142a = null;
        Ec.d.f2143b = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        Ec.d.f2142a = null;
        Ec.d.f2143b = null;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b activityPluginBinding) {
        Intrinsics.checkNotNullParameter(activityPluginBinding, "activityPluginBinding");
        Ec.d.f2142a = ((Ya.d) activityPluginBinding).f8882a;
        Ec.d.f2143b = activityPluginBinding;
    }
}
