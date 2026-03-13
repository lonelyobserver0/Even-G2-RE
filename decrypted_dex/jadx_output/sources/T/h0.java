package T;

import com.stub.StubApp;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h0 implements CoroutineContext.Element {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f6862a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f6863b;

    public h0(h0 h0Var, Q instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f6862a = h0Var;
        this.f6863b = instance;
    }

    public final void b(Q candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f6863b == candidate) {
            throw new IllegalStateException(StubApp.getString2(6087));
        }
        h0 h0Var = this.f6862a;
        if (h0Var != null) {
            h0Var.b(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext, kotlin.coroutines.ContinuationInterceptor
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return g0.f6855a;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext, kotlin.coroutines.ContinuationInterceptor
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
