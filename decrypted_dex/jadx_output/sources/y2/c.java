package y2;

import android.content.Context;
import android.util.Log;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements InterfaceC0825b {

    /* renamed from: a, reason: collision with root package name */
    public g f23491a;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        Context context = c0824a.f13553a;
        C1803F c1803f = new C1803F();
        c1803f.f21581a = context;
        g gVar = new g(c1803f);
        this.f23491a = gVar;
        if (gVar.f23500b != null) {
            String string2 = StubApp.getString2(92);
            String string22 = StubApp.getString2(93);
            Log.wtf(string22, string2);
            MethodChannel methodChannel = gVar.f23500b;
            if (methodChannel == null) {
                Log.d(string22, StubApp.getString2(94));
            } else {
                methodChannel.setMethodCallHandler(null);
                gVar.f23500b = null;
            }
        }
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, StubApp.getString2(24622), StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        gVar.f23500b = methodChannel2;
        methodChannel2.setMethodCallHandler(gVar);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        g gVar = this.f23491a;
        if (gVar == null) {
            Log.wtf(StubApp.getString2(24623), StubApp.getString2(22067));
            return;
        }
        MethodChannel methodChannel = gVar.f23500b;
        if (methodChannel == null) {
            Log.d(StubApp.getString2(93), StubApp.getString2(94));
        } else {
            methodChannel.setMethodCallHandler(null);
            gVar.f23500b = null;
        }
        this.f23491a = null;
    }
}
