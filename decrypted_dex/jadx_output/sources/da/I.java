package da;

import com.stub.StubApp;
import fa.AbstractC0936b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class I implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final D f13474a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13475b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f13476c;

    public I(File file) {
        D d8 = new D(file);
        this.f13474a = d8;
        if (!new String(d8.h(4), AbstractC0936b.f14191d).equals(StubApp.getString2(7710))) {
            throw new IOException(StubApp.getString2(17156));
        }
        float k3 = d8.k();
        int F3 = (int) d8.F();
        this.f13475b = F3;
        if (F3 <= 0 || F3 > 1024) {
            throw new IOException(i2.u.p(F3, StubApp.getString2(17155)));
        }
        this.f13476c = new long[F3];
        for (int i3 = 0; i3 < this.f13475b; i3++) {
            this.f13476c[i3] = d8.F();
        }
        if (k3 >= 2.0f) {
            d8.G();
            d8.G();
            d8.G();
        }
    }

    public final J a(int i3) {
        long[] jArr = this.f13476c;
        long j = jArr[i3];
        D d8 = this.f13474a;
        d8.seek(j);
        G zVar = new String(d8.h(4), AbstractC0936b.f14191d).equals(StubApp.getString2(7707)) ? new z(false, true) : new G(false, true);
        d8.seek(jArr[i3]);
        return zVar.b(new E(d8));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13474a.close();
    }
}
