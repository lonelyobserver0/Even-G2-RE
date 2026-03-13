package Tb;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: Tb.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0323d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0324e f7351b;

    /* renamed from: c, reason: collision with root package name */
    public int f7352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323d(C0324e c0324e, Continuation continuation) {
        super(continuation);
        this.f7351b = c0324e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7350a = obj;
        this.f7352c |= Integer.MIN_VALUE;
        return this.f7351b.a(null, this);
    }
}
