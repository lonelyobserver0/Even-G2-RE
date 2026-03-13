package Va;

import android.view.View;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformView;
import java.util.Map;
import q3.C1514g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements PlatformView, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C1514g f7913a;

    /* renamed from: b, reason: collision with root package name */
    public final MethodChannel f7914b;

    /* renamed from: c, reason: collision with root package name */
    public final b f7915c;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r9, io.flutter.plugin.common.BinaryMessenger r10, int r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.a.<init>(android.content.Context, io.flutter.plugin.common.BinaryMessenger, int, java.util.Map):void");
    }

    public static boolean a(String str, Map map) {
        if (map.containsKey(str)) {
            return ((Boolean) map.get(str)).booleanValue();
        }
        return false;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final void dispose() {
        this.f7914b.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final View getView() {
        return this.f7913a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        boolean z2;
        char c10;
        String str = methodCall.method;
        str.getClass();
        C1514g c1514g = this.f7913a;
        switch (str.hashCode()) {
            case -1990164468:
                if (str.equals(StubApp.getString2(6764))) {
                    z2 = false;
                    break;
                }
                z2 = -1;
                break;
            case 601108392:
                if (str.equals(StubApp.getString2(6763))) {
                    z2 = true;
                    break;
                }
                z2 = -1;
                break;
            case 857882560:
                if (str.equals(StubApp.getString2(6762))) {
                    z2 = 2;
                    break;
                }
                z2 = -1;
                break;
            case 1984860689:
                if (str.equals(StubApp.getString2(6761))) {
                    z2 = 3;
                    break;
                }
                z2 = -1;
                break;
            default:
                z2 = -1;
                break;
        }
        switch (z2) {
            case false:
                Map map = (Map) methodCall.arguments;
                for (String str2 : map.keySet()) {
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1439816841:
                            if (str2.equals(StubApp.getString2(6748))) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 820702630:
                            if (str2.equals(StubApp.getString2(6741))) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 859432697:
                            if (str2.equals(StubApp.getString2(6754))) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 860552205:
                            if (str2.equals(StubApp.getString2(6753))) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1365525979:
                            if (str2.equals(StubApp.getString2(6751))) {
                                c10 = 4;
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
                            c1514g.setSwipeEnabled(a(str2, map));
                            break;
                        case 1:
                            this.f7915c.f7919d = a(str2, map);
                            break;
                        case 2:
                            c1514g.setPageSnap(a(str2, map));
                            break;
                        case 3:
                            c1514g.setPageFling(a(str2, map));
                            break;
                        case 4:
                            c1514g.setNightMode(a(str2, map));
                            break;
                        default:
                            throw new IllegalArgumentException(StubApp.getString2(6766).concat(str2));
                    }
                }
                result.success(null);
                return;
            case true:
                result.success(Integer.valueOf(c1514g.getCurrentPage()));
                return;
            case true:
                result.success(Integer.valueOf(c1514g.getPageCount()));
                return;
            case true:
                String string2 = StubApp.getString2(6765);
                if (methodCall.argument(string2) != null) {
                    c1514g.k(((Integer) methodCall.argument(string2)).intValue());
                }
                result.success(Boolean.TRUE);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
