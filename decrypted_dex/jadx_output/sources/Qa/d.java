package Qa;

import android.content.Context;
import android.net.ConnectivityManager;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class d implements InterfaceC0825b {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f5791a;

    /* renamed from: b, reason: collision with root package name */
    public EventChannel f5792b;

    /* renamed from: c, reason: collision with root package name */
    public b f5793c;

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        this.f5791a = new MethodChannel(binaryMessenger, StubApp.getString2(5376));
        this.f5792b = new EventChannel(binaryMessenger, StubApp.getString2(5377));
        Context context = c0824a.f13553a;
        s2.d dVar = new s2.d((ConnectivityManager) context.getSystemService(StubApp.getString2(1008)), 15);
        c cVar = new c(dVar);
        this.f5793c = new b(context, dVar);
        this.f5791a.setMethodCallHandler(cVar);
        this.f5792b.setStreamHandler(this.f5793c);
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        this.f5791a.setMethodCallHandler(null);
        this.f5792b.setStreamHandler(null);
        this.f5793c.onCancel(null);
        this.f5791a = null;
        this.f5792b = null;
        this.f5793c = null;
    }
}
