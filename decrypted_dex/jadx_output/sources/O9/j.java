package O9;

import Xa.AbstractActivityC0364d;
import android.app.Application;
import androidx.lifecycle.AbstractC0440o;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class j implements MethodChannel.MethodCallHandler, InterfaceC0825b, eb.a {
    public static String j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f5316k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f5317l;

    /* renamed from: m, reason: collision with root package name */
    public static int f5318m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f5319n;

    /* renamed from: a, reason: collision with root package name */
    public eb.b f5320a;

    /* renamed from: b, reason: collision with root package name */
    public c f5321b;

    /* renamed from: c, reason: collision with root package name */
    public Application f5322c;

    /* renamed from: d, reason: collision with root package name */
    public C0824a f5323d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0440o f5324e;

    /* renamed from: f, reason: collision with root package name */
    public e f5325f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractActivityC0364d f5326g;

    /* renamed from: h, reason: collision with root package name */
    public MethodChannel f5327h;

    @Override // eb.a
    public final void onAttachedToActivity(eb.b bVar) {
        this.f5320a = bVar;
        C0824a c0824a = this.f5323d;
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        Application application = (Application) c0824a.f13553a;
        Ya.d dVar = (Ya.d) bVar;
        AbstractActivityC0364d abstractActivityC0364d = dVar.f8882a;
        this.f5326g = abstractActivityC0364d;
        this.f5322c = application;
        this.f5321b = new c(abstractActivityC0364d);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, StubApp.getString2(4481));
        this.f5327h = methodChannel;
        methodChannel.setMethodCallHandler(this);
        new EventChannel(binaryMessenger, StubApp.getString2(4482)).setStreamHandler(new d(this));
        this.f5325f = new e(abstractActivityC0364d);
        dVar.a(this.f5321b);
        AbstractC0440o lifecycle = dVar.f8883b.getLifecycle();
        this.f5324e = lifecycle;
        lifecycle.a(this.f5325f);
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        this.f5323d = c0824a;
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        ((Ya.d) this.f5320a).c(this.f5321b);
        this.f5320a = null;
        e eVar = this.f5325f;
        if (eVar != null) {
            this.f5324e.b(eVar);
            this.f5322c.unregisterActivityLifecycleCallbacks(this.f5325f);
        }
        this.f5324e = null;
        this.f5321b.j = null;
        this.f5321b = null;
        this.f5327h.setMethodCallHandler(null);
        this.f5327h = null;
        this.f5322c = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        this.f5323d = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0386  */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(io.flutter.plugin.common.MethodCall r32, io.flutter.plugin.common.MethodChannel.Result r33) {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O9.j.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b bVar) {
        onAttachedToActivity(bVar);
    }
}
