package Qb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Ref;

/* renamed from: Qb.z, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0231z {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0230y c0230y = C0230y.f5899a;
        boolean booleanValue = ((Boolean) coroutineContext.fold(bool, c0230y)).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.fold(bool, c0230y)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new C0228x(2));
        if (booleanValue2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, C0226w.f5896a);
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    public static final CoroutineContext b(I i3, CoroutineContext coroutineContext) {
        CoroutineContext a3 = a(i3.h(), coroutineContext, true);
        Xb.d dVar = W.f5838a;
        return (a3 == dVar || a3.get(ContinuationInterceptor.INSTANCE) != null) ? a3 : a3.plus(dVar);
    }

    public static final T0 c(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        T0 t02 = null;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (coroutineContext.get(U0.f5837a) != null) {
            CoroutineStackFrame coroutineStackFrame = (CoroutineStackFrame) continuation;
            while (true) {
                if ((coroutineStackFrame instanceof T) || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                    break;
                }
                if (coroutineStackFrame instanceof T0) {
                    t02 = (T0) coroutineStackFrame;
                    break;
                }
            }
            if (t02 != null) {
                t02.a0(coroutineContext, obj);
            }
        }
        return t02;
    }
}
