package W4;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import t5.C1730a;
import t5.InterfaceC1731b;
import t5.InterfaceC1732c;
import t5.InterfaceC1733d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements InterfaceC1733d, InterfaceC1732c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8140a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f8141b;

    /* renamed from: c, reason: collision with root package name */
    public final X4.j f8142c;

    public k() {
        X4.j jVar = X4.j.f8405a;
        this.f8140a = new HashMap();
        this.f8141b = new ArrayDeque();
        this.f8142c = jVar;
    }

    @Override // t5.InterfaceC1732c
    public final void a(C1730a c1730a) {
        Set<Map.Entry> entrySet;
        c1730a.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f8141b;
                if (arrayDeque != null) {
                    arrayDeque.add(c1730a);
                    return;
                }
                synchronized (this) {
                    try {
                        Map map = (Map) this.f8140a.get(R4.b.class);
                        entrySet = map == null ? Collections.EMPTY_SET : map.entrySet();
                    } finally {
                    }
                }
                for (Map.Entry entry : entrySet) {
                    ((Executor) entry.getValue()).execute(new Ab.b(21, entry, c1730a));
                }
            } finally {
            }
        }
    }

    public final synchronized void b(Executor executor, InterfaceC1731b interfaceC1731b) {
        try {
            executor.getClass();
            if (!this.f8140a.containsKey(R4.b.class)) {
                this.f8140a.put(R4.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f8140a.get(R4.b.class)).put(interfaceC1731b, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(D5.q qVar) {
        qVar.getClass();
        if (this.f8140a.containsKey(R4.b.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f8140a.get(R4.b.class);
            concurrentHashMap.remove(qVar);
            if (concurrentHashMap.isEmpty()) {
                this.f8140a.remove(R4.b.class);
            }
        }
    }
}
