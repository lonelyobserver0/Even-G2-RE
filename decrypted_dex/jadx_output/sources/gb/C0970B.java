package gb;

import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: gb.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0970B implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f14245a;

    public C0970B(M m4) {
        this.f14245a = m4;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        M m4 = this.f14245a;
        if (m4.f14296b == null) {
            return;
        }
        String str = methodCall.method;
        str.getClass();
        String string2 = StubApp.getString2(1538);
        String string22 = StubApp.getString2(17842);
        String string23 = StubApp.getString2(1651);
        String string24 = StubApp.getString2(1650);
        String string25 = StubApp.getString2(17843);
        String string26 = StubApp.getString2(290);
        String string27 = StubApp.getString2(435);
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1352294148:
                if (str.equals(StubApp.getString2(11768))) {
                    c10 = 0;
                    break;
                }
                break;
            case -1019779949:
                if (str.equals(StubApp.getString2(14005))) {
                    c10 = 1;
                    break;
                }
                break;
            case -934437708:
                if (str.equals(StubApp.getString2(17849))) {
                    c10 = 2;
                    break;
                }
                break;
            case -756050293:
                if (str.equals(StubApp.getString2(17848))) {
                    c10 = 3;
                    break;
                }
                break;
            case -308988850:
                if (str.equals(StubApp.getString2(17847))) {
                    c10 = 4;
                    break;
                }
                break;
            case 110550847:
                if (str.equals(StubApp.getString2(17846))) {
                    c10 = 5;
                    break;
                }
                break;
            case 576796989:
                if (str.equals(StubApp.getString2(17845))) {
                    c10 = 6;
                    break;
                }
                break;
            case 1671767583:
                if (str.equals(StubApp.getString2(17844))) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String string28 = StubApp.getString2(17850);
                Map map = (Map) methodCall.arguments();
                String string29 = StubApp.getString2(17851);
                boolean z2 = map.containsKey(string29) && ((Boolean) map.get(string29)).booleanValue();
                String string210 = StubApp.getString2(6368);
                ByteBuffer wrap = map.containsKey(string210) ? ByteBuffer.wrap((byte[]) map.get(string210)) : null;
                String string211 = StubApp.getString2(17852);
                try {
                    if (z2) {
                        m4.f14296b.createForPlatformViewLayer(new D(((Integer) map.get(string26)).intValue(), (String) map.get(string211), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get(string25)).intValue(), 3, wrap));
                        result.success(null);
                        return;
                    }
                    boolean z10 = map.containsKey(string28) && ((Boolean) map.get(string28)).booleanValue();
                    long createForTextureLayer = m4.f14296b.createForTextureLayer(new D(((Integer) map.get(string26)).intValue(), (String) map.get(string211), map.containsKey(string22) ? ((Double) map.get(string22)).doubleValue() : 0.0d, map.containsKey(string2) ? ((Double) map.get(string2)).doubleValue() : 0.0d, ((Double) map.get(string24)).doubleValue(), ((Double) map.get(string23)).doubleValue(), ((Integer) map.get(string25)).intValue(), z10 ? 2 : 1, wrap));
                    if (createForTextureLayer != -2) {
                        result.success(Long.valueOf(createForTextureLayer));
                        return;
                    } else {
                        if (!z10) {
                            throw new AssertionError(StubApp.getString2("17853"));
                        }
                        result.success(null);
                        return;
                    }
                } catch (IllegalStateException e10) {
                    result.error(string27, Log.getStackTraceString(e10), null);
                    return;
                }
            case 1:
                Map map2 = (Map) methodCall.arguments();
                try {
                    m4.f14296b.offset(((Integer) map2.get(string26)).intValue(), ((Double) map2.get(string22)).doubleValue(), ((Double) map2.get(string2)).doubleValue());
                    result.success(null);
                    return;
                } catch (IllegalStateException e11) {
                    result.error(string27, Log.getStackTraceString(e11), null);
                    return;
                }
            case 2:
                Map map3 = (Map) methodCall.arguments();
                try {
                    m4.f14296b.resize(new E(((Integer) map3.get(string26)).intValue(), ((Double) map3.get(string24)).doubleValue(), ((Double) map3.get(string23)).doubleValue()), new A2.g(result, 5));
                    return;
                } catch (IllegalStateException e12) {
                    result.error(string27, Log.getStackTraceString(e12), null);
                    return;
                }
            case 3:
                try {
                    m4.f14296b.clearFocus(((Integer) methodCall.arguments()).intValue());
                    result.success(null);
                    return;
                } catch (IllegalStateException e13) {
                    result.error(string27, Log.getStackTraceString(e13), null);
                    return;
                }
            case 4:
                try {
                    m4.f14296b.synchronizeToNativeViewHierarchy(((Boolean) methodCall.arguments()).booleanValue());
                    result.success(null);
                    return;
                } catch (IllegalStateException e14) {
                    result.error(string27, Log.getStackTraceString(e14), null);
                    return;
                }
            case 5:
                List list = (List) methodCall.arguments();
                try {
                    m4.f14296b.onTouch(new F(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    result.success(null);
                    return;
                } catch (IllegalStateException e15) {
                    result.error(string27, Log.getStackTraceString(e15), null);
                    return;
                }
            case 6:
                Map map4 = (Map) methodCall.arguments();
                try {
                    m4.f14296b.setDirection(((Integer) map4.get(string26)).intValue(), ((Integer) map4.get(string25)).intValue());
                    result.success(null);
                    return;
                } catch (IllegalStateException e16) {
                    result.error(string27, Log.getStackTraceString(e16), null);
                    return;
                }
            case 7:
                try {
                    m4.f14296b.dispose(((Integer) ((Map) methodCall.arguments()).get(string26)).intValue());
                    result.success(null);
                    return;
                } catch (IllegalStateException e17) {
                    result.error(string27, Log.getStackTraceString(e17), null);
                    return;
                }
            default:
                result.notImplemented();
                return;
        }
    }
}
