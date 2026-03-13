package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: Tb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0320a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ub.v f7329a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z9.q f7331c;

    /* renamed from: d, reason: collision with root package name */
    public int f7332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0320a(Z9.q qVar, Continuation continuation) {
        super(continuation);
        this.f7331c = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7330b = obj;
        this.f7332d |= Integer.MIN_VALUE;
        return this.f7331c.p(null, this);
    }
}
