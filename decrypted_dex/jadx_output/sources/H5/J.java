package H5;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class J extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2771a;

    /* renamed from: b, reason: collision with root package name */
    public int f2772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f2773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k3, Continuation continuation) {
        super(continuation);
        this.f2773c = k3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2771a = obj;
        this.f2772b |= Integer.MIN_VALUE;
        return this.f2773c.a(null, this);
    }
}
