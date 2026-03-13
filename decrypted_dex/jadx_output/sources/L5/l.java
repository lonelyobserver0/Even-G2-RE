package L5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f4240b;

    /* renamed from: c, reason: collision with root package name */
    public int f4241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4240b = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4239a = obj;
        this.f4241c |= Integer.MIN_VALUE;
        return this.f4240b.c(null, null, this);
    }
}
