package y2;

import android.content.Context;
import android.location.Geocoder;
import android.os.Build;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C1803F f23499a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f23500b;

    public g(C1803F c1803f) {
        this.f23499a = c1803f;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        C1803F c1803f = this.f23499a;
        String string2 = StubApp.getString2(9846);
        String string22 = StubApp.getString2(24628);
        String string23 = StubApp.getString2(661);
        Locale locale = null;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1276560131:
                if (str.equals(StubApp.getString2(24633))) {
                    c10 = 0;
                    break;
                }
                break;
            case -898056143:
                if (str.equals(StubApp.getString2(24632))) {
                    c10 = 1;
                    break;
                }
                break;
            case -533029387:
                if (str.equals(StubApp.getString2(24631))) {
                    c10 = 2;
                    break;
                }
                break;
            case 769355766:
                if (str.equals(StubApp.getString2(24630))) {
                    c10 = 3;
                    break;
                }
                break;
            case 930278181:
                if (str.equals(StubApp.getString2(24629))) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                double doubleValue = ((Double) methodCall.argument(StubApp.getString2(2044))).doubleValue();
                double doubleValue2 = ((Double) methodCall.argument(StubApp.getString2(2043))).doubleValue();
                f fVar = new f(result, doubleValue, doubleValue2);
                Locale locale2 = (Locale) c1803f.f21582b;
                Context context = (Context) c1803f.f21581a;
                Geocoder geocoder = locale2 != null ? new Geocoder(context, locale2) : new Geocoder(context);
                if (Build.VERSION.SDK_INT >= 33) {
                    geocoder.getFromLocation(doubleValue, doubleValue2, 5, new b(fVar, 1));
                    break;
                } else {
                    try {
                        fVar.onGeocode(geocoder.getFromLocation(doubleValue, doubleValue2, 5));
                        break;
                    } catch (IOException e10) {
                        fVar.onError(e10.getMessage());
                        return;
                    }
                }
            case 1:
                result.success(Boolean.valueOf(Geocoder.isPresent()));
                break;
            case 2:
                String str2 = (String) methodCall.argument(string23);
                if (str2 == null || str2.isEmpty()) {
                    result.error(string2, string22, null);
                }
                c1803f.h(str2, new d(result, str2));
                break;
            case 3:
                String str3 = (String) methodCall.argument(string23);
                if (str3 == null || str3.isEmpty()) {
                    result.error(string2, string22, null);
                }
                c1803f.h(str3, new e(result, str3));
                break;
            case 4:
                String str4 = (String) methodCall.argument(StubApp.getString2(24634));
                if (str4 != null && !str4.isEmpty()) {
                    StringTokenizer stringTokenizer = new StringTokenizer(str4, StubApp.getString2(4956), false);
                    String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
                    String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
                    String nextToken3 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
                    if (nextToken != null && nextToken2 != null && nextToken3 != null) {
                        locale = new Locale(nextToken, nextToken2, nextToken3);
                    } else if (nextToken != null && nextToken2 != null) {
                        locale = new Locale(nextToken, nextToken2);
                    } else if (nextToken != null) {
                        locale = new Locale(nextToken);
                    }
                }
                c1803f.f21582b = locale;
                result.success(Boolean.TRUE);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
