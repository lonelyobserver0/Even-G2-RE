package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class a0 implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f14322a;

    public a0(c0 c0Var) {
        this.f14322a = c0Var;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        c0 c0Var = this.f14322a;
        if (c0Var.f14326a == null) {
            return;
        }
        String str = methodCall.method;
        Object obj = methodCall.arguments;
        str.getClass();
        if (!str.equals(StubApp.getString2(17872))) {
            result.notImplemented();
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            c0Var.f14326a.initiateSpellCheck((String) arrayList.get(0), (String) arrayList.get(1), result);
        } catch (IllegalStateException e10) {
            result.error(StubApp.getString2(435), e10.getMessage(), null);
        }
    }
}
