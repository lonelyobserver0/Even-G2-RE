package H5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f2747a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0089w f2749c;

    /* renamed from: d, reason: collision with root package name */
    public int f2750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C0089w c0089w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2749c = c0089w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2748b = obj;
        this.f2750d |= Integer.MIN_VALUE;
        return this.f2749c.a(null, this);
    }
}
