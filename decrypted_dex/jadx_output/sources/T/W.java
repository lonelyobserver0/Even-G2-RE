package T;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class W extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public D5.B f6815a;

    /* renamed from: b, reason: collision with root package name */
    public Zb.a f6816b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D5.B f6818d;

    /* renamed from: e, reason: collision with root package name */
    public int f6819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(D5.B b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6818d = b2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6817c = obj;
        this.f6819e |= Integer.MIN_VALUE;
        return this.f6818d.K(this);
    }
}
