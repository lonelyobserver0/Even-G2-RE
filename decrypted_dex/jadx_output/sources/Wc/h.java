package Wc;

import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class h implements InterfaceC0825b, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public C0824a f8219a;

    public final void a() {
        C0824a c0824a = this.f8219a;
        AbstractC1526a.f20083a = c0824a.f13553a;
        if (c.f8214c == null) {
            c.f8214c = new c();
        }
        MethodChannel methodChannel = new MethodChannel(c0824a.f13554b, StubApp.getString2(25904));
        c cVar = c.f8214c;
        if (cVar.f8212b == null) {
            cVar.f8212b = new ArrayList();
        }
        cVar.f8211a = methodChannel;
        methodChannel.setMethodCallHandler(c.f8214c);
        BinaryMessenger binaryMessenger = this.f8219a.f13554b;
        if (e.f8216c == null) {
            e.f8216c = new e();
        }
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, StubApp.getString2(25905));
        e eVar = e.f8216c;
        if (eVar.f8212b == null) {
            eVar.f8212b = new ArrayList();
        }
        eVar.f8211a = methodChannel2;
        methodChannel2.setMethodCallHandler(e.f8216c);
    }

    @Override // eb.a
    public final void onAttachedToActivity(eb.b bVar) {
        a();
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        this.f8219a = c0824a;
        new MethodChannel(c0824a.f13554b, StubApp.getString2(25906)).setMethodCallHandler(new g(this));
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b bVar) {
    }
}
