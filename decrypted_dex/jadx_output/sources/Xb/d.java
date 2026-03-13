package Xb;

import Qb.C;
import Vb.AbstractC0355a;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class d extends g {

    /* renamed from: b, reason: collision with root package name */
    public static final d f8630b;

    static {
        int i3 = j.f8638c;
        int i10 = j.f8639d;
        long j = j.f8640e;
        String str = j.f8636a;
        d dVar = new d();
        dVar.f8632a = new b(j, str, i3, i10);
        f8630b = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException(StubApp.getString2(25938));
    }

    @Override // Qb.C
    public final C limitedParallelism(int i3) {
        AbstractC0355a.a(i3);
        return i3 >= j.f8638c ? this : super.limitedParallelism(i3);
    }

    @Override // Qb.C
    public final String toString() {
        return StubApp.getString2(25939);
    }
}
