package Sb;

import Qb.C0203k;
import Qb.L;
import Qb.V0;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a implements V0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f6677a = g.f6706p;

    /* renamed from: b, reason: collision with root package name */
    public C0203k f6678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f6679c;

    public a(e eVar) {
        this.f6679c = eVar;
    }

    public static final void b(a aVar) {
        C0203k c0203k = aVar.f6678b;
        Intrinsics.checkNotNull(c0203k);
        aVar.f6678b = null;
        aVar.f6677a = g.f6702l;
        Throwable p8 = aVar.f6679c.p();
        if (p8 == null) {
            Result.Companion companion = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(Boolean.FALSE));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(p8)));
        }
    }

    @Override // Qb.V0
    public final void a(Vb.v vVar, int i3) {
        C0203k c0203k = this.f6678b;
        if (c0203k != null) {
            c0203k.a(vVar, i3);
        }
    }

    public final Object c(ContinuationImpl continuationImpl) {
        n nVar;
        Boolean boxBoolean;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f6687g;
        e eVar = this.f6679c;
        n nVar2 = (n) atomicReferenceFieldUpdater.get(eVar);
        while (!eVar.v()) {
            long andIncrement = e.f6683c.getAndIncrement(eVar);
            long j = g.f6693b;
            long j3 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (nVar2.f7972c != j3) {
                nVar = eVar.o(j3, nVar2);
                if (nVar == null) {
                    continue;
                }
            } else {
                nVar = nVar2;
            }
            Object E10 = eVar.E(nVar, i3, andIncrement, null);
            F5.c cVar = g.f6703m;
            if (E10 == cVar) {
                throw new IllegalStateException(StubApp.getString2(25596));
            }
            F5.c cVar2 = g.f6705o;
            if (E10 != cVar2) {
                if (E10 != g.f6704n) {
                    nVar.a();
                    this.f6677a = E10;
                    return Boxing.boxBoolean(true);
                }
                e eVar2 = this.f6679c;
                C0203k i10 = L.i(IntrinsicsKt.intercepted(continuationImpl));
                try {
                    this.f6678b = i10;
                    Object E11 = eVar2.E(nVar, i3, andIncrement, this);
                    if (E11 == cVar) {
                        a(nVar, i3);
                    } else {
                        if (E11 == cVar2) {
                            if (andIncrement < eVar2.s()) {
                                nVar.a();
                            }
                            n nVar3 = (n) e.f6687g.get(eVar2);
                            while (true) {
                                if (eVar2.v()) {
                                    b(this);
                                    break;
                                }
                                long andIncrement2 = e.f6683c.getAndIncrement(eVar2);
                                long j10 = g.f6693b;
                                long j11 = andIncrement2 / j10;
                                int i11 = (int) (andIncrement2 % j10);
                                if (nVar3.f7972c != j11) {
                                    n o5 = eVar2.o(j11, nVar3);
                                    if (o5 != null) {
                                        nVar3 = o5;
                                    }
                                }
                                Object E12 = eVar2.E(nVar3, i11, andIncrement2, this);
                                if (E12 == g.f6703m) {
                                    a(nVar3, i11);
                                    break;
                                }
                                if (E12 == g.f6705o) {
                                    if (andIncrement2 < eVar2.s()) {
                                        nVar3.a();
                                    }
                                } else {
                                    if (E12 == g.f6704n) {
                                        throw new IllegalStateException(StubApp.getString2("6086"));
                                    }
                                    nVar3.a();
                                    this.f6677a = E12;
                                    this.f6678b = null;
                                    boxBoolean = Boxing.boxBoolean(true);
                                }
                            }
                        } else {
                            nVar.a();
                            this.f6677a = E11;
                            this.f6678b = null;
                            boxBoolean = Boxing.boxBoolean(true);
                        }
                        i10.i(boxBoolean, null);
                    }
                    Object r8 = i10.r();
                    if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuationImpl);
                    }
                    return r8;
                } catch (Throwable th) {
                    i10.A();
                    throw th;
                }
            }
            if (andIncrement < eVar.s()) {
                nVar.a();
            }
            nVar2 = nVar;
        }
        this.f6677a = g.f6702l;
        Throwable p8 = eVar.p();
        if (p8 == null) {
            return Boxing.boxBoolean(false);
        }
        int i12 = Vb.w.f7973a;
        throw p8;
    }

    public final Object d() {
        Object obj = this.f6677a;
        F5.c cVar = g.f6706p;
        if (obj == cVar) {
            throw new IllegalStateException(StubApp.getString2(25597));
        }
        this.f6677a = cVar;
        if (obj != g.f6702l) {
            return obj;
        }
        Throwable q10 = this.f6679c.q();
        int i3 = Vb.w.f7973a;
        throw q10;
    }
}
