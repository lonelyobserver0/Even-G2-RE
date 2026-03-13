package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gb.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0981j implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0983l f14358a;

    public C0981j(C0983l c0983l) {
        this.f14358a = c0983l;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String string2 = StubApp.getString2(222);
        C0983l c0983l = this.f14358a;
        if (c0983l.f14362b == null) {
            return;
        }
        String str = methodCall.method;
        str.getClass();
        if (!str.equals(StubApp.getString2(18011))) {
            result.notImplemented();
            return;
        }
        JSONObject jSONObject = (JSONObject) methodCall.arguments();
        try {
            result.success(c0983l.f14362b.getStringResource(jSONObject.getString(StubApp.getString2("728")), jSONObject.has(string2) ? jSONObject.getString(string2) : null));
        } catch (JSONException e10) {
            result.error(StubApp.getString2(435), e10.getMessage(), null);
        }
    }
}
