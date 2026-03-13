package V;

import Kc.A;
import Kc.s;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public s f7667a;

    /* renamed from: b, reason: collision with root package name */
    public s f7668b;

    /* renamed from: c, reason: collision with root package name */
    public A f7669c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f7671e;

    /* renamed from: f, reason: collision with root package name */
    public int f7672f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7671e = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7670d = obj;
        this.f7672f |= Integer.MIN_VALUE;
        return this.f7671e.b(null, this);
    }
}
