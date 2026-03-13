package Z9;

import com.stub.StubApp;
import java.io.IOException;

/* renamed from: Z9.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0369d extends X5.a {
    public final int h() {
        int f10 = f();
        if (f10 >= 1 && f10 <= 4) {
            return f10;
        }
        StringBuilder u2 = Xa.h.u(f10, StubApp.getString2(8168), StubApp.getString2(8169));
        u2.append(this.f8409b - 1);
        throw new IOException(u2.toString());
    }
}
