package Zb;

import Vb.v;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class l extends v {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceArray f9224e;

    public l(long j, l lVar, int i3) {
        super(j, lVar, i3);
        this.f9224e = new AtomicReferenceArray(k.f9223f);
    }

    @Override // Vb.v
    public final int f() {
        return k.f9223f;
    }

    @Override // Vb.v
    public final void g(int i3, CoroutineContext coroutineContext) {
        this.f9224e.set(i3, k.f9222e);
        h();
    }

    public final String toString() {
        return StubApp.getString2(25983) + this.f7972c + StubApp.getString2(25984) + hashCode() + ']';
    }
}
