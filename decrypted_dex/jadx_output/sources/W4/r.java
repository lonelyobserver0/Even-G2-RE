package W4;

import com.stub.StubApp;
import java.util.Set;
import t5.C1730a;
import t5.InterfaceC1732c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r implements InterfaceC1732c {

    /* renamed from: a, reason: collision with root package name */
    public final Set f8154a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1732c f8155b;

    public r(Set set, InterfaceC1732c interfaceC1732c) {
        this.f8154a = set;
        this.f8155b = interfaceC1732c;
    }

    @Override // t5.InterfaceC1732c
    public final void a(C1730a c1730a) {
        if (this.f8154a.contains(R4.b.class)) {
            this.f8155b.a(c1730a);
            return;
        }
        throw new H9.b(StubApp.getString2(6917) + c1730a + StubApp.getString2(1));
    }
}
