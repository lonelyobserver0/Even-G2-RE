package Vb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7939a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, StubApp.getString2(25757));

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7940b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, StubApp.getString2(25758));

    @Volatile
    private volatile Object _next;

    @Volatile
    private volatile Object _prev;

    public e(v vVar) {
        this._prev = vVar;
    }

    public final void a() {
        f7940b.lazySet(this, null);
    }

    public final e b() {
        Object obj = f7939a.get(this);
        if (obj == AbstractC0358d.f7938a) {
            return null;
        }
        return (e) obj;
    }

    public abstract boolean c();

    public final void d() {
        e b2;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7940b;
            e eVar = (e) atomicReferenceFieldUpdater.get(this);
            while (eVar != null && eVar.c()) {
                eVar = (e) atomicReferenceFieldUpdater.get(eVar);
            }
            e b10 = b();
            Intrinsics.checkNotNull(b10);
            while (b10.c() && (b2 = b10.b()) != null) {
                b10 = b2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b10);
                e eVar2 = ((e) obj) == null ? null : eVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b10, obj, eVar2)) {
                    if (atomicReferenceFieldUpdater.get(b10) != obj) {
                        break;
                    }
                }
            }
            if (eVar != null) {
                f7939a.set(eVar, b10);
            }
            if (!b10.c() || b10.b() == null) {
                if (eVar == null || !eVar.c()) {
                    return;
                }
            }
        }
    }
}
