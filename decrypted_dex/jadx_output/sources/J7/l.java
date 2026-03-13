package J7;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f3440a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3441b;

    /* renamed from: c, reason: collision with root package name */
    public Zb.e f3442c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3444e;

    /* renamed from: f, reason: collision with root package name */
    public int f3445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3444e = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3443d = obj;
        this.f3445f |= Integer.MIN_VALUE;
        return this.f3444e.b(null, null, this);
    }
}
