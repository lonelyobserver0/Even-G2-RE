package R8;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f6309a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6310b;

    /* renamed from: c, reason: collision with root package name */
    public long f6311c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f6313e;

    /* renamed from: f, reason: collision with root package name */
    public int f6314f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6313e = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6312d = obj;
        this.f6314f |= Integer.MIN_VALUE;
        return this.f6313e.b(null, 0L, this);
    }
}
