package J7;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3438b;

    /* renamed from: c, reason: collision with root package name */
    public int f3439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3438b = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3437a = obj;
        this.f3439c |= Integer.MIN_VALUE;
        return this.f3438b.a(null, null, this);
    }
}
