package Vb;

import Qb.M0;
import com.stub.StubApp;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final F5.c f7923a = new F5.c(StubApp.getString2(25744), 24);

    /* renamed from: b, reason: collision with root package name */
    public static final y f7924b = y.f7975a;

    /* renamed from: c, reason: collision with root package name */
    public static final z f7925c = z.f7976a;

    /* renamed from: d, reason: collision with root package name */
    public static final A f7926d = A.f7922a;

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f7923a) {
            return;
        }
        if (!(obj instanceof D)) {
            Object fold = coroutineContext.fold(null, f7925c);
            Intrinsics.checkNotNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            Xa.h.x(fold);
            throw null;
        }
        D d8 = (D) obj;
        M0[] m0Arr = d8.f7931c;
        int length = m0Arr.length - 1;
        if (length < 0) {
            return;
        }
        M0 m02 = m0Arr[length];
        Intrinsics.checkNotNull(null);
        Object obj2 = d8.f7930b[length];
        throw null;
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f7924b);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f7923a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new D(((Number) obj).intValue(), coroutineContext), f7926d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        Xa.h.x(obj);
        throw null;
    }
}
