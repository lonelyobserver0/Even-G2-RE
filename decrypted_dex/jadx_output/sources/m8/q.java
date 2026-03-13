package m8;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class q extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public r f17202a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f17204c;

    /* renamed from: d, reason: collision with root package name */
    public int f17205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f17204c = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17203b = obj;
        this.f17205d |= Integer.MIN_VALUE;
        return r.b(this.f17204c, null, null, this);
    }
}
