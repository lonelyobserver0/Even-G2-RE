package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class S implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f14302a;

    public S(T t3) {
        this.f14302a = t3;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        Object obj = methodCall.arguments;
        str.getClass();
        T t3 = this.f14302a;
        if (!str.equals(StubApp.getString2(6443))) {
            if (!str.equals(StubApp.getString2(6562))) {
                result.notImplemented();
                return;
            } else {
                t3.f14304b = (byte[]) obj;
                result.success(null);
                return;
            }
        }
        t3.f14308f = true;
        if (t3.f14307e || !t3.f14303a) {
            result.success(T.a(t3.f14304b));
        } else {
            t3.f14306d = result;
        }
    }
}
