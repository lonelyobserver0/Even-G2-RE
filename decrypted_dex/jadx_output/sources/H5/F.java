package H5;

import Tb.InterfaceC0328i;
import Ub.C0345a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class F implements InterfaceC0328i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2764b;

    public /* synthetic */ F(Object obj, int i3) {
        this.f2763a = i3;
        this.f2764b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Tb.InterfaceC0328i
    public final Object a(Object obj, Continuation continuation) {
        Object e10;
        switch (this.f2763a) {
            case 0:
                ((N) this.f2764b).f2784c.set((C0090x) obj);
                return Unit.INSTANCE;
            case 1:
                T.Q q10 = (T.Q) this.f2764b;
                return ((q10.f6805h.u() instanceof T.S) || (e10 = T.Q.e(q10, true, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : e10;
            case 2:
                ((Ref.ObjectRef) this.f2764b).element = obj;
                throw new C0345a(this);
            default:
                ((Xa.o) this.f2764b).accept(obj);
                return Unit.INSTANCE;
        }
    }
}
