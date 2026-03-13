package Vb;

import Qb.I;
import com.stub.StubApp;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class f implements I {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f7941a;

    public f(CoroutineContext coroutineContext) {
        this.f7941a = coroutineContext;
    }

    @Override // Qb.I
    public final CoroutineContext h() {
        return this.f7941a;
    }

    public final String toString() {
        return StubApp.getString2(25759) + this.f7941a + ')';
    }
}
