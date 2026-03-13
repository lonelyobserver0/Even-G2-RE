package E2;

import C2.i;
import Xa.AbstractActivityC0364d;
import Ya.d;
import android.content.Context;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements InterfaceC0825b, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public c f1869a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f1870b;

    /* renamed from: c, reason: collision with root package name */
    public eb.b f1871c;

    @Override // eb.a
    public final void onAttachedToActivity(eb.b bVar) {
        d dVar = (d) bVar;
        AbstractActivityC0364d abstractActivityC0364d = dVar.f8882a;
        c cVar = this.f1869a;
        if (cVar != null) {
            cVar.f1874c = abstractActivityC0364d;
        }
        this.f1871c = bVar;
        dVar.a(cVar);
        ((d) this.f1871c).b(this.f1869a);
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        Context context = c0824a.f13553a;
        this.f1869a = new c(context);
        MethodChannel methodChannel = new MethodChannel(c0824a.f13554b, StubApp.getString2(1820));
        this.f1870b = methodChannel;
        methodChannel.setMethodCallHandler(new a(context, new u5.d(4), this.f1869a, new i()));
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        c cVar = this.f1869a;
        if (cVar != null) {
            cVar.f1874c = null;
        }
        eb.b bVar = this.f1871c;
        if (bVar != null) {
            ((d) bVar).c(cVar);
            eb.b bVar2 = this.f1871c;
            ((d) bVar2).f8884c.remove(this.f1869a);
        }
        this.f1871c = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        this.f1870b.setMethodCallHandler(null);
        this.f1870b = null;
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b bVar) {
        onAttachedToActivity(bVar);
    }
}
