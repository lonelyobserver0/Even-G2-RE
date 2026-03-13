package ob;

import android.util.Log;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g implements InterfaceC0825b, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public a5.c f18651a;

    @Override // eb.a
    public final void onAttachedToActivity(eb.b bVar) {
        a5.c cVar = this.f18651a;
        if (cVar == null) {
            Log.wtf(StubApp.getString2(22065), StubApp.getString2(22066));
        } else {
            cVar.f9284d = ((Ya.d) bVar).f8882a;
        }
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        a5.c cVar = new a5.c(c0824a.f13553a, 23);
        this.f18651a = cVar;
        e.b(c0824a.f13554b, cVar);
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        a5.c cVar = this.f18651a;
        if (cVar == null) {
            Log.wtf(StubApp.getString2(22065), StubApp.getString2(22066));
        } else {
            cVar.f9284d = null;
        }
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        if (this.f18651a == null) {
            Log.wtf(StubApp.getString2(22065), StubApp.getString2(22067));
        } else {
            e.b(c0824a.f13554b, null);
            this.f18651a = null;
        }
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b bVar) {
        onAttachedToActivity(bVar);
    }
}
