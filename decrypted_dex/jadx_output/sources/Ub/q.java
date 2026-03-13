package Ub;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class q implements CoroutineContext {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f7610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f7611b;

    public q(CoroutineContext coroutineContext, Throwable th) {
        this.f7610a = th;
        this.f7611b = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.f7611b.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext, kotlin.coroutines.ContinuationInterceptor
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.f7611b.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext, kotlin.coroutines.ContinuationInterceptor
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.f7611b.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f7611b.plus(coroutineContext);
    }
}
