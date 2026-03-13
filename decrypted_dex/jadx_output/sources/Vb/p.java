package Vb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7961e = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, StubApp.getString2(25757));

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f7962f = AtomicLongFieldUpdater.newUpdater(p.class, StubApp.getString2(25450));

    /* renamed from: g, reason: collision with root package name */
    public static final F5.c f7963g = new F5.c(StubApp.getString2(25769), 24);

    @Volatile
    private volatile Object _next;

    @Volatile
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f7964a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7965b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7966c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f7967d;

    public p(int i3, boolean z2) {
        this.f7964a = i3;
        this.f7965b = z2;
        int i10 = i3 - 1;
        this.f7966c = i10;
        this.f7967d = new AtomicReferenceArray(i3);
        String string2 = StubApp.getString2(6068);
        if (i10 > 1073741823) {
            throw new IllegalStateException(string2);
        }
        if ((i3 & i10) != 0) {
            throw new IllegalStateException(string2);
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7962f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i3 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            int i11 = this.f7966c;
            if (((i10 + 2) & i11) == (i3 & i11)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f7967d;
            if (!this.f7965b && atomicReferenceArray.get(i10 & i11) != null) {
                int i12 = this.f7964a;
                if (i12 < 1024 || ((i10 - i3) & 1073741823) > (i12 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i10 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i10 & i11, runnable);
                p pVar = this;
                while ((atomicLongFieldUpdater.get(pVar) & 1152921504606846976L) != 0) {
                    pVar = pVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = pVar.f7967d;
                    int i13 = pVar.f7966c & i10;
                    Object obj = atomicReferenceArray2.get(i13);
                    if ((obj instanceof o) && ((o) obj).f7960a == i10) {
                        atomicReferenceArray2.set(i13, runnable);
                    } else {
                        pVar = null;
                    }
                    if (pVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f7962f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final p c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        p pVar;
        while (true) {
            atomicLongFieldUpdater = f7962f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                pVar = this;
                break;
            }
            long j3 = 1152921504606846976L | j;
            pVar = this;
            if (atomicLongFieldUpdater.compareAndSet(pVar, j, j3)) {
                j = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7961e;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(this);
            if (pVar2 != null) {
                return pVar2;
            }
            p pVar3 = new p(pVar.f7964a * 2, pVar.f7965b);
            int i3 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i11 = pVar.f7966c;
                int i12 = i3 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = pVar.f7967d.get(i12);
                if (obj == null) {
                    obj = new o(i3);
                }
                pVar3.f7967d.set(pVar3.f7966c & i3, obj);
                i3++;
            }
            atomicLongFieldUpdater.set(pVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, pVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        p pVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7962f;
            long j = atomicLongFieldUpdater.get(pVar);
            if ((j & 1152921504606846976L) != 0) {
                return f7963g;
            }
            int i3 = (int) (j & 1073741823);
            int i10 = pVar.f7966c;
            int i11 = ((int) ((1152921503533105152L & j) >> 30)) & i10;
            int i12 = i10 & i3;
            if (i11 == i12) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = pVar.f7967d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z2 = pVar.f7965b;
            if (obj == null) {
                if (z2) {
                    break;
                }
            } else {
                if (obj instanceof o) {
                    break;
                }
                long j3 = (i3 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(pVar, j, (j & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                }
                pVar = this;
                if (z2) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7962f;
                        long j10 = atomicLongFieldUpdater2.get(pVar);
                        int i13 = (int) (j10 & 1073741823);
                        if ((j10 & 1152921504606846976L) != 0) {
                            pVar = pVar.c();
                        } else {
                            p pVar2 = pVar;
                            pVar = pVar2;
                            if (atomicLongFieldUpdater2.compareAndSet(pVar2, j10, (j10 & (-1073741824)) | j3)) {
                                pVar.f7967d.set(pVar.f7966c & i13, null);
                                pVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (pVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
