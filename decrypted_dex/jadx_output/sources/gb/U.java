package gb;

import android.os.Build;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class U implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f14309a;

    public U(V v2) {
        this.f14309a = v2;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        V v2 = this.f14309a;
        if (v2.f14310a == null) {
        }
        String str = methodCall.method;
        str.getClass();
        String string2 = StubApp.getString2(435);
        char c10 = 65535;
        switch (str.hashCode()) {
            case -705821951:
                if (str.equals(StubApp.getString2(17866))) {
                    c10 = 0;
                    break;
                }
                break;
            case 1759284829:
                if (str.equals(StubApp.getString2(17865))) {
                    c10 = 1;
                    break;
                }
                break;
            case 2119738044:
                if (str.equals(StubApp.getString2(17864))) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                v2.getClass();
                try {
                    result.success(Boolean.valueOf(v2.f14310a.isFeatureAvailable()));
                    break;
                } catch (IllegalStateException e10) {
                    result.error(string2, e10.getMessage(), null);
                    return;
                }
            case 1:
                v2.getClass();
                if (Build.VERSION.SDK_INT < 33) {
                    result.error(string2, StubApp.getString2(17868), null);
                    break;
                } else {
                    try {
                        v2.f14310a.startStylusHandwriting();
                        result.success(null);
                        break;
                    } catch (IllegalStateException e11) {
                        result.error(string2, e11.getMessage(), null);
                        return;
                    }
                }
            case 2:
                v2.getClass();
                if (Build.VERSION.SDK_INT < 34) {
                    result.error(string2, StubApp.getString2(17867), null);
                    break;
                } else {
                    try {
                        result.success(Boolean.valueOf(v2.f14310a.isStylusHandwritingAvailable()));
                        break;
                    } catch (IllegalStateException e12) {
                        result.error(string2, e12.getMessage(), null);
                        return;
                    }
                }
            default:
                result.notImplemented();
                break;
        }
    }
}
