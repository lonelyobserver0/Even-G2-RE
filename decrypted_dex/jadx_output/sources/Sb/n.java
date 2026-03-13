package Sb;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class n extends Vb.v {

    /* renamed from: e, reason: collision with root package name */
    public final e f6717e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f6718f;

    public n(long j, n nVar, e eVar, int i3) {
        super(j, nVar, i3);
        this.f6717e = eVar;
        this.f6718f = new AtomicReferenceArray(g.f6693b * 2);
    }

    @Override // Vb.v
    public final int f() {
        return g.f6693b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x005e, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0061, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0063, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // Vb.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r5, kotlin.coroutines.CoroutineContext r6) {
        /*
            r4 = this;
            int r6 = Sb.g.f6693b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r4.f6718f
            int r1 = r5 * 2
            r6.get(r1)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof Qb.V0
            Sb.e r2 = r4.f6717e
            r3 = 0
            if (r1 != 0) goto L6a
            boolean r1 = r6 instanceof Sb.y
            if (r1 == 0) goto L21
            goto L6a
        L21:
            F5.c r1 = Sb.g.j
            if (r6 == r1) goto L5e
            F5.c r1 = Sb.g.f6701k
            if (r6 != r1) goto L2a
            goto L5e
        L2a:
            F5.c r1 = Sb.g.f6698g
            if (r6 == r1) goto L11
            F5.c r1 = Sb.g.f6697f
            if (r6 != r1) goto L33
            goto L11
        L33:
            F5.c r5 = Sb.g.f6700i
            if (r6 == r5) goto L87
            F5.c r5 = Sb.g.f6695d
            if (r6 != r5) goto L3c
            goto L87
        L3c:
            F5.c r5 = Sb.g.f6702l
            if (r6 != r5) goto L41
            goto L87
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 25655(0x6437, float:3.595E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L5e:
            r4.m(r5, r3)
            if (r0 == 0) goto L87
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.getClass()
            return
        L6a:
            if (r0 == 0) goto L6f
            F5.c r1 = Sb.g.j
            goto L71
        L6f:
            F5.c r1 = Sb.g.f6701k
        L71:
            boolean r6 = r4.j(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L87
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2.getClass()
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Sb.n.g(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean j(int i3, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f6718f;
        int i10 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i3) {
        return this.f6718f.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z2) {
        if (z2) {
            e eVar = this.f6717e;
            Intrinsics.checkNotNull(eVar);
            eVar.G((this.f7972c * g.f6693b) + i3);
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f6718f.lazySet(i3 * 2, obj);
    }

    public final void n(int i3, F5.c cVar) {
        this.f6718f.set((i3 * 2) + 1, cVar);
    }
}
