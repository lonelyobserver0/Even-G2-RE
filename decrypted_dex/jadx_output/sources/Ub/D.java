package Ub;

import Tb.InterfaceC0328i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class D implements InterfaceC0328i {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f7568a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7569b;

    /* renamed from: c, reason: collision with root package name */
    public final C f7570c;

    public D(InterfaceC0328i interfaceC0328i, CoroutineContext coroutineContext) {
        this.f7568a = coroutineContext;
        this.f7569b = Vb.B.b(coroutineContext);
        this.f7570c = new C(interfaceC0328i, null);
    }

    @Override // Tb.InterfaceC0328i
    public final Object a(Object obj, Continuation continuation) {
        Object b2 = AbstractC0347c.b(this.f7568a, obj, this.f7569b, this.f7570c, continuation);
        return b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b2 : Unit.INSTANCE;
    }
}
