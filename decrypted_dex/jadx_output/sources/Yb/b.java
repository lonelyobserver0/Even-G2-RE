package Yb;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public c f8902a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f8904c;

    /* renamed from: d, reason: collision with root package name */
    public int f8905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f8904c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8903b = obj;
        this.f8905d |= Integer.MIN_VALUE;
        return this.f8904c.d(this);
    }
}
