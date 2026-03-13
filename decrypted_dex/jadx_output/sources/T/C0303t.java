package T;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: T.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0303t extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6898a;

    /* renamed from: b, reason: collision with root package name */
    public int f6899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0304u f6900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0303t(C0304u c0304u, Continuation continuation) {
        super(continuation);
        this.f6900c = c0304u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6898a = obj;
        this.f6899b |= Integer.MIN_VALUE;
        return this.f6900c.a(null, this);
    }
}
