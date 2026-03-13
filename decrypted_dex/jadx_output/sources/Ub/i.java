package Ub;

import Qb.AbstractC0231z;
import Qb.C0230y;
import Tb.InterfaceC0327h;
import Tb.InterfaceC0328i;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class i extends g {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0327h f7591d;

    public i(int i3, int i10, InterfaceC0327h interfaceC0327h, CoroutineContext coroutineContext) {
        super(coroutineContext, i3, i10);
        this.f7591d = interfaceC0327h;
    }

    @Override // Ub.g
    public final Object a(Sb.v vVar, Continuation continuation) {
        Object d8 = d(new z(vVar), continuation);
        return d8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d8 : Unit.INSTANCE;
    }

    public abstract Object d(InterfaceC0328i interfaceC0328i, Continuation continuation);

    @Override // Ub.g, Tb.InterfaceC0327h
    public final Object p(InterfaceC0328i interfaceC0328i, Continuation continuation) {
        if (this.f7586b == -3) {
            CoroutineContext coroutineContext = continuation.get$context();
            Boolean bool = Boolean.FALSE;
            C0230y c0230y = C0230y.f5899a;
            CoroutineContext coroutineContext2 = this.f7585a;
            CoroutineContext plus = !((Boolean) coroutineContext2.fold(bool, c0230y)).booleanValue() ? coroutineContext.plus(coroutineContext2) : AbstractC0231z.a(coroutineContext, coroutineContext2, false);
            if (Intrinsics.areEqual(plus, coroutineContext)) {
                Object d8 = d(interfaceC0328i, continuation);
                return d8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d8 : Unit.INSTANCE;
            }
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(plus.get(companion), coroutineContext.get(companion))) {
                CoroutineContext coroutineContext3 = continuation.get$context();
                if (!(interfaceC0328i instanceof z ? true : interfaceC0328i instanceof t)) {
                    interfaceC0328i = new D(interfaceC0328i, coroutineContext3);
                }
                Object b2 = AbstractC0347c.b(plus, interfaceC0328i, Vb.B.b(plus), new h(this, null), continuation);
                if (b2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    b2 = Unit.INSTANCE;
                }
                return b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b2 : Unit.INSTANCE;
            }
        }
        Object p8 = super.p(interfaceC0328i, continuation);
        return p8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? p8 : Unit.INSTANCE;
    }

    @Override // Ub.g
    public final String toString() {
        return this.f7591d + StubApp.getString2(438) + super.toString();
    }
}
