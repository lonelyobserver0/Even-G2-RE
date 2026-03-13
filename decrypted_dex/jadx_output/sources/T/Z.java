package T;

import Qb.C0219s0;
import Qb.D0;
import Qb.InterfaceC0221t0;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final Qb.I f6826a;

    /* renamed from: b, reason: collision with root package name */
    public final N f6827b;

    /* renamed from: c, reason: collision with root package name */
    public final Sb.e f6828c;

    /* renamed from: d, reason: collision with root package name */
    public final F5.c f6829d;

    public Z(Qb.I scope, A8.a onComplete, M onUndeliveredElement, N consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f6826a = scope;
        this.f6827b = consumeMessage;
        this.f6828c = Ec.l.a(IntCompanionObject.MAX_VALUE, 0, 6);
        this.f6829d = new F5.c(20);
        InterfaceC0221t0 interfaceC0221t0 = (InterfaceC0221t0) scope.h().get(C0219s0.f5892a);
        if (interfaceC0221t0 != null) {
            ((D0) interfaceC0221t0).I(new X(onComplete, this, onUndeliveredElement));
        }
    }
}
