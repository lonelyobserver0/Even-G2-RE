package E9;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Q2.g f2067a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q2.g f2069c;

    /* renamed from: d, reason: collision with root package name */
    public int f2070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Q2.g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2069c = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2068b = obj;
        this.f2070d |= Integer.MIN_VALUE;
        return this.f2069c.K(null, this);
    }
}
