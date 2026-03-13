package v;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1791d extends android.support.v4.media.session.b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f21498a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f21499b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f21500c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f21501d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f21502e;

    public C1791d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f21498a = atomicReferenceFieldUpdater;
        this.f21499b = atomicReferenceFieldUpdater2;
        this.f21500c = atomicReferenceFieldUpdater3;
        this.f21501d = atomicReferenceFieldUpdater4;
        this.f21502e = atomicReferenceFieldUpdater5;
    }

    @Override // android.support.v4.media.session.b
    public final boolean c(AbstractC1794g abstractC1794g, C1790c c1790c, C1790c c1790c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f21501d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1794g, c1790c, c1790c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1794g) == c1790c);
        return false;
    }

    @Override // android.support.v4.media.session.b
    public final boolean d(AbstractC1794g abstractC1794g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f21502e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1794g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1794g) == obj);
        return false;
    }

    @Override // android.support.v4.media.session.b
    public final boolean e(AbstractC1794g abstractC1794g, C1793f c1793f, C1793f c1793f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f21500c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1794g, c1793f, c1793f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1794g) == c1793f);
        return false;
    }

    @Override // android.support.v4.media.session.b
    public final void v(C1793f c1793f, C1793f c1793f2) {
        this.f21499b.lazySet(c1793f, c1793f2);
    }

    @Override // android.support.v4.media.session.b
    public final void w(C1793f c1793f, Thread thread) {
        this.f21498a.lazySet(c1793f, thread);
    }
}
