package Nb;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class v extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public c f5038a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f5040c;

    /* renamed from: d, reason: collision with root package name */
    public int f5041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5040c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5039b = obj;
        this.f5041d |= Integer.MIN_VALUE;
        return c.a(this.f5040c, this);
    }
}
