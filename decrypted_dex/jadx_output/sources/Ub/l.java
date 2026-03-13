package Ub;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class l extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public m f7596a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7597b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f7599d;

    /* renamed from: e, reason: collision with root package name */
    public int f7600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(continuation);
        this.f7599d = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7598c = obj;
        this.f7600e |= Integer.MIN_VALUE;
        return this.f7599d.a(null, this);
    }
}
