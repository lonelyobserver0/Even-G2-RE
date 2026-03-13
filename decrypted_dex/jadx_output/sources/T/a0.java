package T;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f6830a;

    /* renamed from: b, reason: collision with root package name */
    public Zb.e f6831b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6832c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f6833d;

    /* renamed from: e, reason: collision with root package name */
    public int f6834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6833d = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6832c = obj;
        this.f6834e |= Integer.MIN_VALUE;
        return this.f6833d.b(null, this);
    }
}
