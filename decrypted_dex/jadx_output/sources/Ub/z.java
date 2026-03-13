package Ub;

import Tb.InterfaceC0328i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class z implements InterfaceC0328i {

    /* renamed from: a, reason: collision with root package name */
    public final Sb.v f7624a;

    public z(Sb.v vVar) {
        this.f7624a = vVar;
    }

    @Override // Tb.InterfaceC0328i
    public final Object a(Object obj, Continuation continuation) {
        Object k3 = ((Sb.j) this.f7624a).f6713d.k(obj, continuation);
        return k3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? k3 : Unit.INSTANCE;
    }
}
