package Va;

import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class d implements InterfaceC0825b {
    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        c0824a.f13556d.registerViewFactory(StubApp.getString2(6768), new c(c0824a.f13554b, 0));
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
    }
}
