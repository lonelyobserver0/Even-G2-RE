package Qb;

import Vb.AbstractC0355a;
import com.stub.StubApp;
import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class F {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        try {
            E e10 = (E) coroutineContext.get(D.f5808a);
            if (e10 != null) {
                e10.handleException(coroutineContext, th);
            } else {
                AbstractC0355a.c(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException(StubApp.getString2(25468), th2);
                ExceptionsKt.addSuppressed(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0355a.c(coroutineContext, th);
        }
    }
}
