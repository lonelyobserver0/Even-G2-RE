package Nb;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class w extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public c f5042a;

    /* renamed from: b, reason: collision with root package name */
    public a f5043b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5044c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f5046e;

    /* renamed from: f, reason: collision with root package name */
    public int f5047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5046e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5045d = obj;
        this.f5047f |= Integer.MIN_VALUE;
        return c.b(this.f5046e, null, false, null, null, this);
    }
}
