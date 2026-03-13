package Xa;

import aa.C0398e;
import android.util.Log;
import android.view.KeyEvent;
import com.stub.StubApp;
import gb.C0978g;
import gb.C0979h;
import gb.C0980i;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import io.flutter.plugin.editing.InputConnectionAdaptor;
import java.util.HashSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class z implements InputConnectionAdaptor.KeyboardDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final x[] f8607a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f8608b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final y f8609c;

    public z(y yVar) {
        this.f8609c = yVar;
        r rVar = (r) yVar;
        this.f8607a = new x[]{new w(rVar.getBinaryMessenger()), new V6.b(new C0978g(rVar.getBinaryMessenger()))};
        BinaryMessenger binaryMessenger = rVar.getBinaryMessenger();
        C0980i c0980i = new C0980i();
        new MethodChannel(binaryMessenger, StubApp.getString2(7459), StandardMethodCodec.INSTANCE).setMethodCallHandler(new C0979h(c0980i));
        c0980i.f14357a = this;
    }

    public final void a(KeyEvent keyEvent) {
        y yVar = this.f8609c;
        if (yVar == null || ((r) yVar).f8577l.handleKeyEvent(keyEvent)) {
            return;
        }
        HashSet hashSet = this.f8608b;
        hashSet.add(keyEvent);
        ((r) yVar).getRootView().dispatchKeyEvent(keyEvent);
        if (hashSet.remove(keyEvent)) {
            Log.w(StubApp.getString2(7435), StubApp.getString2(7460));
        }
    }

    @Override // io.flutter.plugin.editing.InputConnectionAdaptor.KeyboardDelegate
    public final boolean handleEvent(KeyEvent keyEvent) {
        if (this.f8608b.remove(keyEvent)) {
            return false;
        }
        x[] xVarArr = this.f8607a;
        if (xVarArr.length <= 0) {
            a(keyEvent);
            return true;
        }
        Fb.a aVar = new Fb.a();
        aVar.f2348d = this;
        aVar.f2346b = this.f8607a.length;
        aVar.f2345a = false;
        aVar.f2347c = keyEvent;
        for (x xVar : xVarArr) {
            C0398e c0398e = new C0398e();
            c0398e.f9344b = aVar;
            c0398e.f9343a = false;
            xVar.a(keyEvent, c0398e);
        }
        return true;
    }
}
