package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* renamed from: gb.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0984m implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0986o f14363a;

    public C0984m(C0986o c0986o) {
        this.f14363a = c0986o;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String string2 = StubApp.getString2(435);
        String string22 = StubApp.getString2(18013);
        C0986o c0986o = this.f14363a;
        if (c0986o.f14364a == null) {
            return;
        }
        String str = methodCall.method;
        try {
            if (str.hashCode() == -1307105544 && str.equals(StubApp.getString2("18014"))) {
                try {
                    c0986o.f14364a.activateSystemCursor((String) ((HashMap) methodCall.arguments).get(StubApp.getString2("18015")));
                    result.success(Boolean.TRUE);
                } catch (Exception e10) {
                    result.error(string2, string22 + e10.getMessage(), null);
                }
            }
        } catch (Exception e11) {
            result.error(string2, StubApp.getString2(4410) + e11.getMessage(), null);
        }
    }
}
