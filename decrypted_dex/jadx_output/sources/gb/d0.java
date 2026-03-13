package gb;

import android.os.Bundle;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d0 implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f14328a;

    public d0(j0 j0Var) {
        this.f14328a = j0Var;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Bundle bundle;
        String string2 = StubApp.getString2(1485);
        j0 j0Var = this.f14328a;
        if (j0Var.f14360b == null) {
            return;
        }
        String str = methodCall.method;
        Object obj = methodCall.arguments;
        str.getClass();
        String string22 = StubApp.getString2(435);
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1779068172:
                if (str.equals(StubApp.getString2(17891))) {
                    c10 = 0;
                    break;
                }
                break;
            case -1015421462:
                if (str.equals(StubApp.getString2(17890))) {
                    c10 = 1;
                    break;
                }
                break;
            case -37561188:
                if (str.equals(StubApp.getString2(17889))) {
                    c10 = 2;
                    break;
                }
                break;
            case 270476819:
                if (str.equals(StubApp.getString2(17888))) {
                    c10 = 3;
                    break;
                }
                break;
            case 270803918:
                if (str.equals(StubApp.getString2(17887))) {
                    c10 = 4;
                    break;
                }
                break;
            case 649192816:
                if (str.equals(StubApp.getString2(17886))) {
                    c10 = 5;
                    break;
                }
                break;
            case 1204752139:
                if (str.equals(StubApp.getString2(17885))) {
                    c10 = 6;
                    break;
                }
                break;
            case 1727570905:
                if (str.equals(StubApp.getString2(17884))) {
                    c10 = 7;
                    break;
                }
                break;
            case 1904427655:
                if (str.equals(StubApp.getString2(17883))) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2113369584:
                if (str.equals(StubApp.getString2(17882))) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    j0Var.f14360b.setPlatformViewClient(jSONObject.getInt(StubApp.getString2("17893")), jSONObject.optBoolean(StubApp.getString2("17894"), false));
                    result.success(null);
                    break;
                } catch (JSONException e10) {
                    result.error(string22, e10.getMessage(), null);
                    return;
                }
            case 1:
                try {
                    j0Var.f14360b.setEditingState(h0.a((JSONObject) obj));
                    result.success(null);
                    break;
                } catch (JSONException e11) {
                    result.error(string22, e11.getMessage(), null);
                    return;
                }
            case 2:
                try {
                    JSONArray jSONArray = (JSONArray) obj;
                    j0Var.f14360b.setClient(jSONArray.getInt(0), e0.a(jSONArray.getJSONObject(1)));
                    result.success(null);
                    break;
                } catch (NoSuchFieldException | JSONException e12) {
                    result.error(string22, e12.getMessage(), null);
                    return;
                }
            case 3:
                j0Var.f14360b.hide();
                result.success(null);
                break;
            case 4:
                j0Var.f14360b.show();
                result.success(null);
                break;
            case 5:
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    String string = jSONObject2.getString(StubApp.getString2("652"));
                    String string3 = jSONObject2.getString(string2);
                    if (string3 == null || string3.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString(string2, string3);
                    }
                    j0Var.f14360b.sendAppPrivateCommand(string, bundle);
                    result.success(null);
                    break;
                } catch (JSONException e13) {
                    result.error(string22, e13.getMessage(), null);
                    return;
                }
            case 6:
                try {
                    JSONObject jSONObject3 = (JSONObject) obj;
                    double d8 = jSONObject3.getDouble(StubApp.getString2("1650"));
                    double d10 = jSONObject3.getDouble(StubApp.getString2("1651"));
                    JSONArray jSONArray2 = jSONObject3.getJSONArray(StubApp.getString2("17892"));
                    double[] dArr = new double[16];
                    for (int i3 = 0; i3 < 16; i3++) {
                        dArr[i3] = jSONArray2.getDouble(i3);
                    }
                    j0Var.f14360b.setEditableSizeAndTransform(d8, d10, dArr);
                    result.success(null);
                    break;
                } catch (JSONException e14) {
                    result.error(string22, e14.getMessage(), null);
                    return;
                }
            case 7:
                j0Var.f14360b.finishAutofillContext(((Boolean) obj).booleanValue());
                result.success(null);
                break;
            case '\b':
                j0Var.f14360b.clearClient();
                result.success(null);
                break;
            case '\t':
                j0Var.f14360b.requestAutofill();
                result.success(null);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
