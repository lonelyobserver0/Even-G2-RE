package gb;

import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class H implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f14273a;

    public H(L l9) {
        this.f14273a = l9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        char c10;
        L l9 = this.f14273a;
        if (l9.f14294b == null) {
            return;
        }
        String str = methodCall.method;
        str.getClass();
        String string2 = StubApp.getString2(17843);
        String string22 = StubApp.getString2(290);
        String string23 = StubApp.getString2(435);
        switch (str.hashCode()) {
            case -1352294148:
                if (str.equals(StubApp.getString2(11768))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -756050293:
                if (str.equals(StubApp.getString2(17848))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 110550847:
                if (str.equals(StubApp.getString2(17846))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 576796989:
                if (str.equals(StubApp.getString2(17845))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 751366695:
                if (str.equals(StubApp.getString2(17854))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1671767583:
                if (str.equals(StubApp.getString2(17844))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                Map map = (Map) methodCall.arguments();
                String string24 = StubApp.getString2(6368);
                try {
                    l9.f14294b.createPlatformView(new I((String) map.get(StubApp.getString2("17852")), map.containsKey(string24) ? ByteBuffer.wrap((byte[]) map.get(string24)) : null, ((Integer) map.get(string22)).intValue(), ((Integer) map.get(string2)).intValue()));
                    result.success(null);
                    break;
                } catch (IllegalStateException e10) {
                    result.error(string23, Log.getStackTraceString(e10), null);
                    return;
                }
            case 1:
                try {
                    l9.f14294b.clearFocus(((Integer) methodCall.arguments()).intValue());
                    result.success(null);
                    break;
                } catch (IllegalStateException e11) {
                    result.error(string23, Log.getStackTraceString(e11), null);
                    return;
                }
            case 2:
                List list = (List) methodCall.arguments();
                try {
                    l9.f14294b.onTouch(new J(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    result.success(null);
                    break;
                } catch (IllegalStateException e12) {
                    result.error(string23, Log.getStackTraceString(e12), null);
                    return;
                }
            case 3:
                Map map2 = (Map) methodCall.arguments();
                try {
                    l9.f14294b.setDirection(((Integer) map2.get(string22)).intValue(), ((Integer) map2.get(string2)).intValue());
                    result.success(null);
                    break;
                } catch (IllegalStateException e13) {
                    result.error(string23, Log.getStackTraceString(e13), null);
                    return;
                }
            case 4:
                result.success(Boolean.valueOf(l9.f14294b.isSurfaceControlEnabled()));
                break;
            case 5:
                try {
                    l9.f14294b.dispose(((Integer) ((Map) methodCall.arguments()).get(string22)).intValue());
                    result.success(null);
                    break;
                } catch (IllegalStateException e14) {
                    result.error(string23, Log.getStackTraceString(e14), null);
                    return;
                }
            default:
                result.notImplemented();
                break;
        }
    }
}
