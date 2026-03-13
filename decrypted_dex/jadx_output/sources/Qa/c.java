package Qa;

import android.net.ConnectivityManager;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final s2.d f5790a;

    public c(s2.d dVar) {
        this.f5790a = dVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (!StubApp.getString2(5375).equals(methodCall.method)) {
            result.notImplemented();
        } else {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f5790a.f20712b;
            result.success(s2.d.j(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}
