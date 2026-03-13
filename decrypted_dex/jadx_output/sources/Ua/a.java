package Ua;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements MethodChannel.MethodCallHandler {
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        try {
            System.loadLibrary(StubApp.getString2("6457"));
            result.success(null);
        } catch (Throwable th) {
            result.error(th.toString(), null, null);
        }
    }
}
