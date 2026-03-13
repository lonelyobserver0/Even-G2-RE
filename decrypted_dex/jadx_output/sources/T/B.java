package T;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Q f6732a;

    /* renamed from: b, reason: collision with root package name */
    public int f6733b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6735d;

    /* renamed from: e, reason: collision with root package name */
    public int f6736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Q q10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6735d = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6734c = obj;
        this.f6736e |= Integer.MIN_VALUE;
        return this.f6735d.h(this);
    }
}
