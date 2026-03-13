package Wc;

import com.stub.StubApp;
import java.util.HashMap;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b extends f {

    /* renamed from: b, reason: collision with root package name */
    public Vc.b f8213b;

    @Override // Wc.f
    public final a a() {
        return c.f8214c;
    }

    @Override // Wc.f
    public final int b() {
        return h();
    }

    @Override // Wc.f
    public final void g() {
        this.f8213b.o();
    }

    public final int h() {
        return AbstractC1856e.c(this.f8213b.b());
    }

    public final void i(long j, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(665), Long.valueOf(j));
        hashMap.put(StubApp.getString2(2091), Long.valueOf(j3));
        hashMap.put(StubApp.getString2(25840), Integer.valueOf(h()));
        e(StubApp.getString2(25841), hashMap);
    }
}
