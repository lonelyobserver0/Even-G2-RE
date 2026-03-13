package Ua;

import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class b implements InterfaceC0825b {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f7562a;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        MethodChannel methodChannel = new MethodChannel(c0824a.f13554b, StubApp.getString2(6458));
        this.f7562a = methodChannel;
        methodChannel.setMethodCallHandler(new a());
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        MethodChannel methodChannel = this.f7562a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.f7562a = null;
        }
    }
}
