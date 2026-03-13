package O8;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public p f5254a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f5256c;

    /* renamed from: d, reason: collision with root package name */
    public int f5257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5256c = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5255b = obj;
        this.f5257d |= Integer.MIN_VALUE;
        return p.V(this.f5256c, null, null, null, this);
    }
}
