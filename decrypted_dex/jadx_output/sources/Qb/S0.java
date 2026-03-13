package Qb;

import com.stub.StubApp;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class S0 extends C {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5833a = 0;

    static {
        new S0();
    }

    @Override // Qb.C
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (coroutineContext.get(X0.f5841a) != null) {
            throw new ClassCastException();
        }
        throw new UnsupportedOperationException(StubApp.getString2(25488));
    }

    @Override // Qb.C
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // Qb.C
    public final C limitedParallelism(int i3) {
        throw new UnsupportedOperationException(StubApp.getString2(25489));
    }

    @Override // Qb.C
    public final String toString() {
        return StubApp.getString2(25490);
    }
}
