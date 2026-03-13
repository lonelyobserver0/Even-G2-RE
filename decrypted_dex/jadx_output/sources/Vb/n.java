package Vb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7959a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, StubApp.getString2(25768));

    @Volatile
    private volatile Object _cur = new p(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7959a;
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            int a3 = pVar.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                p c10 = pVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, c10) && atomicReferenceFieldUpdater.get(this) == pVar) {
                }
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7959a;
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            if (pVar.b()) {
                return;
            }
            p c10 = pVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, c10) && atomicReferenceFieldUpdater.get(this) == pVar) {
            }
        }
    }

    public final int c() {
        p pVar = (p) f7959a.get(this);
        pVar.getClass();
        long j = p.f7962f.get(pVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7959a;
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            Object d8 = pVar.d();
            if (d8 != p.f7963g) {
                return d8;
            }
            p c10 = pVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, c10) && atomicReferenceFieldUpdater.get(this) == pVar) {
            }
        }
    }
}
