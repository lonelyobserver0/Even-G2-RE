package Sb;

import Qb.V0;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class r extends e {

    /* renamed from: l, reason: collision with root package name */
    public final int f6723l;

    public r(int i3, int i10) {
        super(i3);
        this.f6723l = i10;
        if (i10 != 1) {
            if (i3 < 1) {
                throw new IllegalArgumentException(Xa.h.g(i3, StubApp.getString2(25656), StubApp.getString2(25657)).toString());
            }
        } else {
            throw new IllegalArgumentException((StubApp.getString2(25658) + Reflection.getOrCreateKotlinClass(e.class).getSimpleName() + StubApp.getString2(25659)).toString());
        }
    }

    public final Object H(Object obj, boolean z2) {
        if (this.f6723l == 3) {
            Object j = super.j(obj);
            return (!(j instanceof l) || (j instanceof k)) ? j : Unit.INSTANCE;
        }
        Pb.a aVar = g.f6695d;
        n nVar = (n) e.f6686f.get(this);
        while (true) {
            long andIncrement = e.f6682b.getAndIncrement(this);
            long j3 = 1152921504606846975L & andIncrement;
            boolean u2 = u(andIncrement, false);
            int i3 = g.f6693b;
            long j10 = i3;
            long j11 = j3 / j10;
            int i10 = (int) (j3 % j10);
            if (nVar.f7972c != j11) {
                n a3 = e.a(this, j11, nVar);
                if (a3 != null) {
                    nVar = a3;
                } else if (u2) {
                    return new k(r());
                }
            }
            int e10 = e.e(this, nVar, i10, obj, j3, aVar, u2);
            if (e10 == 0) {
                nVar.a();
                return Unit.INSTANCE;
            }
            if (e10 == 1) {
                return Unit.INSTANCE;
            }
            if (e10 == 2) {
                if (u2) {
                    nVar.h();
                    return new k(r());
                }
                V0 v02 = aVar instanceof V0 ? (V0) aVar : null;
                if (v02 != null) {
                    v02.a(nVar, i10 + i3);
                }
                m((nVar.f7972c * j10) + i10);
                return Unit.INSTANCE;
            }
            if (e10 == 3) {
                throw new IllegalStateException(StubApp.getString2(6086));
            }
            if (e10 == 4) {
                if (j3 < e.f6683c.get(this)) {
                    nVar.a();
                }
                return new k(r());
            }
            if (e10 == 5) {
                nVar.a();
            }
        }
    }

    @Override // Sb.e, Sb.x
    public final Object j(Object obj) {
        return H(obj, false);
    }

    @Override // Sb.e, Sb.x
    public final Object k(Object obj, Continuation continuation) {
        if (H(obj, true) instanceof k) {
            throw r();
        }
        return Unit.INSTANCE;
    }

    @Override // Sb.e
    public final boolean x() {
        return this.f6723l == 2;
    }
}
