package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class N implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f14297a;

    public N(P p8) {
        this.f14297a = p8;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        P p8 = this.f14297a;
        if (p8.f14299b == null) {
            return;
        }
        String str = methodCall.method;
        Object obj = methodCall.arguments;
        str.getClass();
        String string2 = StubApp.getString2(435);
        if (!str.equals(StubApp.getString2(17857))) {
            if (!str.equals(StubApp.getString2(17858))) {
                result.notImplemented();
                return;
            }
            try {
                result.success(p8.f14299b.queryTextActions());
                return;
            } catch (IllegalStateException e10) {
                result.error(string2, e10.getMessage(), null);
                return;
            }
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            p8.f14299b.processTextAction((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), result);
        } catch (IllegalStateException e11) {
            result.error(string2, e11.getMessage(), null);
        }
    }
}
