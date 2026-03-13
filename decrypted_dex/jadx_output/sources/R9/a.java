package R9;

import Xa.AbstractActivityC0364d;
import Ya.d;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import eb.b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR9/a;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Leb/a;", "<init>", "()V", "app_settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppSettingsPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSettingsPlugin.kt\ncom/spencerccf/app_settings/AppSettingsPlugin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements InterfaceC0825b, MethodChannel.MethodCallHandler, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0364d f6349a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f6350b;

    public final void a(MethodChannel.Result result, boolean z2) {
        Intent intent = new Intent(StubApp.getString2(143));
        if (z2) {
            intent.addFlags(268435456);
        }
        AbstractActivityC0364d abstractActivityC0364d = this.f6349a;
        if (abstractActivityC0364d != null) {
            intent.setData(Uri.fromParts(StubApp.getString2(3503), abstractActivityC0364d.getPackageName(), null));
            abstractActivityC0364d.startActivity(intent);
        }
        result.success(null);
    }

    public final void b(String str, MethodChannel.Result result, boolean z2) {
        try {
            Intent intent = new Intent(str);
            if (z2) {
                intent.addFlags(268435456);
            }
            AbstractActivityC0364d abstractActivityC0364d = this.f6349a;
            if (abstractActivityC0364d != null) {
                abstractActivityC0364d.startActivity(intent);
            }
            result.success(null);
        } catch (Exception unused) {
            a(result, z2);
        }
    }

    public final void c(Intent intent, MethodChannel.Result result, boolean z2) {
        if (z2) {
            try {
                intent.addFlags(268435456);
            } catch (Exception unused) {
                a(result, z2);
                return;
            }
        }
        AbstractActivityC0364d abstractActivityC0364d = this.f6349a;
        if (abstractActivityC0364d != null) {
            abstractActivityC0364d.startActivity(intent);
        }
        result.success(null);
    }

    @Override // eb.a
    public final void onAttachedToActivity(b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f6349a = ((d) binding).f8882a;
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.f13554b, StubApp.getString2(5822));
        this.f6350b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        this.f6349a = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f6349a = null;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.f6350b;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        boolean areEqual = Intrinsics.areEqual(str, "openSettings");
        String string2 = StubApp.getString2(5823);
        String string22 = StubApp.getString2(5824);
        String string23 = StubApp.getString2(660);
        if (!areEqual) {
            if (!Intrinsics.areEqual(str, "openSettingsPanel")) {
                result.notImplemented();
                return;
            }
            if (Build.VERSION.SDK_INT < 29) {
                result.success(null);
                return;
            }
            AbstractActivityC0364d abstractActivityC0364d = this.f6349a;
            if (abstractActivityC0364d == null) {
                result.success(null);
                return;
            }
            String str2 = (String) call.argument(string23);
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -810883302:
                        if (str2.equals(StubApp.getString2(1968))) {
                            abstractActivityC0364d.startActivity(new Intent(StubApp.getString2(5867)));
                            result.success(null);
                            return;
                        }
                        break;
                    case 108971:
                        if (str2.equals(string2)) {
                            abstractActivityC0364d.startActivity(new Intent(StubApp.getString2(5866)));
                            result.success(null);
                            return;
                        }
                        break;
                    case 3649301:
                        if (str2.equals(string22)) {
                            abstractActivityC0364d.startActivity(new Intent(StubApp.getString2(5865)));
                            result.success(null);
                            return;
                        }
                        break;
                    case 21015448:
                        if (str2.equals(StubApp.getString2(5863))) {
                            abstractActivityC0364d.startActivity(new Intent(StubApp.getString2(5864)));
                            result.success(null);
                            return;
                        }
                        break;
                }
            }
            result.notImplemented();
            return;
        }
        Boolean bool = (Boolean) call.argument(StubApp.getString2(5825));
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str3 = (String) call.argument(string23);
        if (str3 != null) {
            int hashCode = str3.hashCode();
            String string24 = StubApp.getString2(3503);
            switch (hashCode) {
                case -2045253606:
                    if (str3.equals(StubApp.getString2(5861))) {
                        b(StubApp.getString2(5862), result, booleanValue);
                        return;
                    }
                    break;
                case -1928150741:
                    if (str3.equals(StubApp.getString2(5859))) {
                        b(StubApp.getString2(5860), result, booleanValue);
                        return;
                    }
                    break;
                case -1770066084:
                    if (str3.equals(StubApp.getString2(5858))) {
                        b(StubApp.getString2(1805), result, booleanValue);
                        return;
                    }
                    break;
                case -1335157162:
                    if (str3.equals(StubApp.getString2(217))) {
                        b(StubApp.getString2(5857), result, booleanValue);
                        return;
                    }
                    break;
                case -1000044642:
                    if (str3.equals(StubApp.getString2(5855))) {
                        b(StubApp.getString2(5856), result, booleanValue);
                        return;
                    }
                    break;
                case -213139122:
                    if (str3.equals(StubApp.getString2(3258))) {
                        b(StubApp.getString2(5854), result, booleanValue);
                        return;
                    }
                    break;
                case -114233073:
                    if (str3.equals(StubApp.getString2(5852))) {
                        b(StubApp.getString2(5853), result, booleanValue);
                        return;
                    }
                    break;
                case -80681014:
                    if (str3.equals(StubApp.getString2(5850))) {
                        b(StubApp.getString2(5851), result, booleanValue);
                        return;
                    }
                    break;
                case 96799:
                    if (str3.equals(StubApp.getString2(5848))) {
                        b(StubApp.getString2(5849), result, booleanValue);
                        return;
                    }
                    break;
                case 108971:
                    if (str3.equals(string2)) {
                        b(StubApp.getString2(5847), result, booleanValue);
                        return;
                    }
                    break;
                case 116980:
                    if (str3.equals(StubApp.getString2(5845))) {
                        b(StubApp.getString2(5846), result, booleanValue);
                        return;
                    }
                    break;
                case 3076014:
                    if (str3.equals(StubApp.getString2(3713))) {
                        b(StubApp.getString2(5844), result, booleanValue);
                        return;
                    }
                    break;
                case 3649301:
                    if (str3.equals(string22)) {
                        b(StubApp.getString2(5843), result, booleanValue);
                        return;
                    }
                    break;
                case 92895825:
                    if (str3.equals(StubApp.getString2(1822))) {
                        if (Build.VERSION.SDK_INT < 31) {
                            a(result, booleanValue);
                            return;
                        }
                        AbstractActivityC0364d abstractActivityC0364d2 = this.f6349a;
                        Uri fromParts = abstractActivityC0364d2 != null ? Uri.fromParts(string24, abstractActivityC0364d2.getPackageName(), null) : null;
                        if (fromParts == null) {
                            result.success(null);
                            return;
                        } else {
                            c(new Intent(StubApp.getString2(1807), fromParts), result, booleanValue);
                            return;
                        }
                    }
                    break;
                case 109627663:
                    if (str3.equals(StubApp.getString2(5841))) {
                        b(StubApp.getString2(5842), result, booleanValue);
                        return;
                    }
                    break;
                case 595233003:
                    if (str3.equals(StubApp.getString2(490))) {
                        AbstractActivityC0364d abstractActivityC0364d3 = this.f6349a;
                        if (abstractActivityC0364d3 != null) {
                            Intent putExtra = new Intent(StubApp.getString2(5839)).putExtra(StubApp.getString2(5840), abstractActivityC0364d3.getPackageName());
                            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                            if (booleanValue) {
                                putExtra.addFlags(268435456);
                            }
                            abstractActivityC0364d3.startActivity(putExtra);
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 949122880:
                    if (str3.equals(StubApp.getString2(5837))) {
                        b(StubApp.getString2(5838), result, booleanValue);
                        return;
                    }
                    break;
                case 1039955198:
                    if (str3.equals(StubApp.getString2(5835))) {
                        b(StubApp.getString2(5836), result, booleanValue);
                        return;
                    }
                    break;
                case 1099603663:
                    if (str3.equals(StubApp.getString2(5832))) {
                        Intent className = new Intent().setClassName(StubApp.getString2(5833), StubApp.getString2(5834));
                        Intrinsics.checkNotNullExpressionValue(className, "setClassName(...)");
                        c(className, result, booleanValue);
                        return;
                    }
                    break;
                case 1214667623:
                    if (str3.equals(StubApp.getString2(5830))) {
                        b(StubApp.getString2(5831), result, booleanValue);
                        return;
                    }
                    break;
                case 1294374875:
                    if (str3.equals(StubApp.getString2(5828))) {
                        if (Build.VERSION.SDK_INT < 33) {
                            result.success(null);
                            return;
                        }
                        Intent intent = new Intent(StubApp.getString2(5829));
                        if (booleanValue) {
                            intent.addFlags(268435456);
                        }
                        AbstractActivityC0364d abstractActivityC0364d4 = this.f6349a;
                        if (abstractActivityC0364d4 != null) {
                            intent.setData(Uri.fromParts(string24, abstractActivityC0364d4.getPackageName(), null));
                            abstractActivityC0364d4.startActivity(intent);
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 1434631203:
                    if (str3.equals(StubApp.getString2(3402))) {
                        a(result, booleanValue);
                        return;
                    }
                    break;
                case 1671764162:
                    if (str3.equals(StubApp.getString2(3958))) {
                        b(StubApp.getString2(5827), result, booleanValue);
                        return;
                    }
                    break;
                case 1901043637:
                    if (str3.equals(StubApp.getString2(662))) {
                        b(StubApp.getString2(144), result, booleanValue);
                        return;
                    }
                    break;
                case 1968882350:
                    if (str3.equals(StubApp.getString2(1815))) {
                        b(StubApp.getString2(5826), result, booleanValue);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f6349a = ((d) binding).f8882a;
    }
}
