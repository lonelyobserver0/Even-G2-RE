package t2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d extends Y3.a {

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f21146f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f21147g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f21148h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f21149i;
    public final AtomicReferenceFieldUpdater j;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f21146f = atomicReferenceFieldUpdater;
        this.f21147g = atomicReferenceFieldUpdater2;
        this.f21148h = atomicReferenceFieldUpdater3;
        this.f21149i = atomicReferenceFieldUpdater4;
        this.j = atomicReferenceFieldUpdater5;
    }

    @Override // Y3.a
    public final boolean d(h hVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f21149i;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == cVar);
        return false;
    }

    @Override // Y3.a
    public final boolean e(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // Y3.a
    public final boolean f(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f21148h;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // Y3.a
    public final void s(g gVar, g gVar2) {
        this.f21147g.lazySet(gVar, gVar2);
    }

    @Override // Y3.a
    public final void t(g gVar, Thread thread) {
        this.f21146f.lazySet(gVar, thread);
    }
}
