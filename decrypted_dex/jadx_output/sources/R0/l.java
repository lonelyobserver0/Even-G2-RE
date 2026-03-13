package R0;

import com.stub.StubApp;
import o0.C1423U;
import o0.InterfaceC1424V;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final k f6001a;

    public l(k kVar) {
        this.f6001a = kVar;
    }

    public final void a() {
        try {
            ((l) Class.forName(StubApp.getString2("5588")).getConstructor(InterfaceC1424V.class).newInstance(this.f6001a)).a();
        } catch (Exception e10) {
            int i3 = C1423U.f18112a;
            if (!(e10 instanceof C1423U)) {
                throw new C1423U(e10);
            }
        }
    }
}
