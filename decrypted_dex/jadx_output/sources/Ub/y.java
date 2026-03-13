package Ub;

import Qb.C0219s0;
import Qb.D0;
import Qb.InterfaceC0209n;
import Qb.InterfaceC0221t0;
import com.stub.StubApp;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class y extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f7623a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v vVar) {
        super(2);
        this.f7623a = vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        CoroutineContext.Key<?> key = element.getKey();
        CoroutineContext.Element element2 = this.f7623a.f7617b.get(key);
        if (key != C0219s0.f5892a) {
            return Integer.valueOf(element != element2 ? Integer.MIN_VALUE : intValue + 1);
        }
        InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) element2;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        InterfaceC0221t0 interfaceC0221t02 = (InterfaceC0221t0) element;
        while (true) {
            if (interfaceC0221t02 != null) {
                if (interfaceC0221t02 == interfaceC0221t0 || !(interfaceC0221t02 instanceof Vb.u)) {
                    break;
                }
                InterfaceC0209n interfaceC0209n = (InterfaceC0209n) D0.f5810b.get((D0) interfaceC0221t02);
                interfaceC0221t02 = interfaceC0209n != null ? interfaceC0209n.getParent() : null;
            } else {
                interfaceC0221t02 = null;
                break;
            }
        }
        if (interfaceC0221t02 == interfaceC0221t0) {
            if (interfaceC0221t0 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException((StubApp.getString2(25700) + interfaceC0221t02 + StubApp.getString2(25701) + interfaceC0221t0 + StubApp.getString2(25702)).toString());
    }
}
