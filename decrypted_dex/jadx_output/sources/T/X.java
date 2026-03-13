package T;

import Qb.V0;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class X extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A8.a f6820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f6821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f6822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(A8.a aVar, Z z2, M m4) {
        super(1);
        this.f6820a = aVar;
        this.f6821b = z2;
        this.f6822c = m4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object kVar;
        Sb.n nVar;
        Unit unit;
        Throwable th = (Throwable) obj;
        this.f6820a.invoke(th);
        Z z2 = this.f6821b;
        z2.f6828c.i(th, false);
        do {
            Sb.e eVar = z2.f6828c;
            eVar.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = Sb.e.f6683c;
            long j = atomicLongFieldUpdater.get(eVar);
            long j3 = Sb.e.f6682b.get(eVar);
            if (eVar.u(j3, true)) {
                kVar = new Sb.k(eVar.p());
            } else {
                long j10 = j3 & 1152921504606846975L;
                Sb.l lVar = Sb.m.f6715b;
                if (j < j10) {
                    Object obj2 = Sb.g.f6701k;
                    Sb.n nVar2 = (Sb.n) Sb.e.f6687g.get(eVar);
                    while (true) {
                        if (eVar.v()) {
                            kVar = new Sb.k(eVar.p());
                            break;
                        }
                        long andIncrement = atomicLongFieldUpdater.getAndIncrement(eVar);
                        long j11 = Sb.g.f6693b;
                        long j12 = andIncrement / j11;
                        int i3 = (int) (andIncrement % j11);
                        if (nVar2.f7972c != j12) {
                            nVar = eVar.o(j12, nVar2);
                            if (nVar == null) {
                                continue;
                            }
                        } else {
                            nVar = nVar2;
                        }
                        kVar = eVar.E(nVar, i3, andIncrement, obj2);
                        if (kVar == Sb.g.f6703m) {
                            V0 v02 = obj2 instanceof V0 ? (V0) obj2 : null;
                            if (v02 != null) {
                                v02.a(nVar, i3);
                            }
                            eVar.G(andIncrement);
                            nVar.h();
                        } else if (kVar == Sb.g.f6705o) {
                            if (andIncrement < eVar.s()) {
                                nVar.a();
                            }
                            nVar2 = nVar;
                        } else {
                            if (kVar == Sb.g.f6704n) {
                                throw new IllegalStateException(StubApp.getString2(6086));
                            }
                            nVar.a();
                        }
                    }
                }
                kVar = lVar;
            }
            unit = null;
            if (kVar instanceof Sb.l) {
                kVar = null;
            }
            if (kVar != null) {
                this.f6822c.invoke(kVar, th);
                unit = Unit.INSTANCE;
            }
        } while (unit != null);
        return Unit.INSTANCE;
    }
}
