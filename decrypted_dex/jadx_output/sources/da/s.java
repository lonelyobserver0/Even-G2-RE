package da;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s extends H {

    /* renamed from: f, reason: collision with root package name */
    public long[] f13532f;

    @Override // da.H
    public final void a(J j, F f10) {
        p v2 = j.v();
        if (v2 == null) {
            throw new IOException(StubApp.getString2(17225));
        }
        int A4 = j.A() + 1;
        this.f13532f = new long[A4];
        for (int i3 = 0; i3 < A4; i3++) {
            short s10 = v2.f13526l;
            if (s10 == 0) {
                this.f13532f[i3] = f10.G() * 2;
            } else {
                if (s10 != 1) {
                    throw new IOException(StubApp.getString2(17224));
                }
                this.f13532f[i3] = f10.F();
            }
        }
        this.f13472d = true;
    }
}
