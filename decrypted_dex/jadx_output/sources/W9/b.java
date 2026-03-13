package W9;

import android.content.Context;
import android.os.Build;
import com.stub.StubApp;
import com.tencent.mmkv.MMKV;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class b implements InterfaceC0825b, MethodChannel.MethodCallHandler {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f8203c;

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f8204a;

    /* renamed from: b, reason: collision with root package name */
    public Context f8205b;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        boolean z2 = f8203c;
        String string2 = StubApp.getString2(6936);
        if (!z2) {
            System.loadLibrary(string2);
            f8203c = true;
        }
        this.f8205b = c0824a.f13553a;
        MethodChannel methodChannel = new MethodChannel(c0824a.f13554b, string2);
        this.f8204a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        this.f8204a.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        if (str.equals(StubApp.getString2(6937))) {
            result.success(Integer.valueOf(Build.VERSION.SDK_INT));
            return;
        }
        if (!str.equals(StubApp.getString2(6938))) {
            result.notImplemented();
            return;
        }
        String str2 = (String) methodCall.argument(StubApp.getString2(6939));
        Object argument = methodCall.argument(StubApp.getString2(6444));
        MMKV.a(this.f8205b, str2, a.values()[argument instanceof Integer ? ((Integer) argument).intValue() : 1]);
        result.success(str2);
    }
}
