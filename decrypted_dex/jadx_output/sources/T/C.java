package T;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Q f6737a;

    /* renamed from: b, reason: collision with root package name */
    public e0 f6738b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6739c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f6741e;

    /* renamed from: f, reason: collision with root package name */
    public int f6742f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Q q10, Continuation continuation) {
        super(continuation);
        this.f6741e = q10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6740d = obj;
        this.f6742f |= Integer.MIN_VALUE;
        return Q.e(this.f6741e, false, this);
    }
}
