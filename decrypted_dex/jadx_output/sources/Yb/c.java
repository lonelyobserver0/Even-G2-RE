package Yb;

import Q2.g;
import Qb.AbstractC0199i;
import Qb.V0;
import Vb.v;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c extends AbstractC0199i implements d, V0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8906f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, StubApp.getString2(291));

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f8907a;

    /* renamed from: c, reason: collision with root package name */
    public v f8909c;

    @Volatile
    private volatile Object state = e.f8912a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f8908b = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public int f8910d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f8911e = e.f8915d;

    public c(CoroutineContext coroutineContext) {
        this.f8907a = coroutineContext;
    }

    @Override // Qb.V0
    public final void a(v vVar, int i3) {
        this.f8909c = vVar;
        this.f8910d = i3;
    }

    @Override // Qb.AbstractC0199i
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8906f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == e.f8913b) {
                return;
            }
            F5.c cVar = e.f8914c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, cVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f8908b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
            this.f8911e = e.f8915d;
            this.f8908b = null;
            return;
        }
    }

    public final Object c(ContinuationImpl continuationImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8906f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f8911e;
        ArrayList arrayList = this.f8908b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2 != aVar) {
                    aVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, e.f8913b);
            this.f8911e = e.f8915d;
            this.f8908b = null;
        }
        Object invoke = aVar.f8897c.invoke(aVar.f8895a, null, obj2);
        Function2 function2 = aVar.f8898d;
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return function2.invoke(invoke, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Yb.c.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final a e(Object obj) {
        ArrayList arrayList = this.f8908b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f8895a == obj) {
                obj2 = next;
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException((StubApp.getString2(25951) + obj + StubApp.getString2(25952)).toString());
    }

    public final void f(g gVar, Function2 function2) {
        g(new a(this, (Sb.e) gVar.f5711b, (Function3) gVar.f5712c, (Function3) gVar.f5713d, function2, null), false);
    }

    public final void g(a aVar, boolean z2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8906f;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        Sb.e eVar = aVar.f8895a;
        if (!z2) {
            ArrayList arrayList = this.f8908b;
            Intrinsics.checkNotNull(arrayList);
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()).f8895a == eVar) {
                        throw new IllegalStateException((StubApp.getString2(25953) + eVar).toString());
                    }
                }
            }
        }
        aVar.f8896b.invoke(eVar, this, null);
        if (this.f8911e != e.f8915d) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z2) {
            ArrayList arrayList2 = this.f8908b;
            Intrinsics.checkNotNull(arrayList2);
            arrayList2.add(aVar);
        }
        aVar.f8899e = this.f8909c;
        aVar.f8900f = this.f8910d;
        this.f8909c = null;
        this.f8910d = -1;
    }

    public final boolean h(Object obj, Object obj2) {
        return i(obj, obj2) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yb.c.f8906f
            java.lang.Object r1 = r0.get(r7)
            boolean r2 = r1 instanceof Qb.InterfaceC0201j
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L34
            Yb.a r2 = r7.e(r8)
            if (r2 != 0) goto L13
            goto L0
        L13:
            r5 = 0
        L14:
            boolean r6 = r0.compareAndSet(r7, r1, r2)
            if (r6 == 0) goto L2d
            Qb.j r1 = (Qb.InterfaceC0201j) r1
            r7.f8911e = r9
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            F5.c r8 = r1.c(r8, r5)
            if (r8 != 0) goto L29
            r7.f8911e = r5
            return r3
        L29:
            r1.l(r8)
            return r4
        L2d:
            java.lang.Object r6 = r0.get(r7)
            if (r6 == r1) goto L14
            goto L0
        L34:
            F5.c r2 = Yb.e.f8913b
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r5 = 1
            if (r2 == 0) goto L3f
            r2 = r5
            goto L41
        L3f:
            boolean r2 = r1 instanceof Yb.a
        L41:
            if (r2 == 0) goto L45
            r8 = 3
            return r8
        L45:
            F5.c r2 = Yb.e.f8914c
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 == 0) goto L4e
            return r3
        L4e:
            F5.c r2 = Yb.e.f8912a
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 == 0) goto L6b
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r8)
        L5a:
            boolean r3 = r0.compareAndSet(r7, r1, r2)
            if (r3 == 0) goto L62
            r4 = r5
            goto L68
        L62:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r1) goto L5a
        L68:
            if (r4 == 0) goto L0
            goto L86
        L6b:
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L87
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r8)
        L76:
            boolean r3 = r0.compareAndSet(r7, r1, r2)
            if (r3 == 0) goto L7e
            r4 = r5
            goto L84
        L7e:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r1) goto L76
        L84:
            if (r4 == 0) goto L0
        L86:
            return r5
        L87:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r0 = 25954(0x6562, float:3.637E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Yb.c.i(java.lang.Object, java.lang.Object):int");
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.INSTANCE;
    }
}
