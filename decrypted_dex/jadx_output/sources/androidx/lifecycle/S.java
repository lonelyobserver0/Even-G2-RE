package androidx.lifecycle;

import j0.C1071a;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public final C1071a f9896a = new C1071a();

    public final void a() {
        C1071a c1071a = this.f9896a;
        if (c1071a != null && !c1071a.f15223d) {
            c1071a.f15223d = true;
            synchronized (c1071a.f15220a) {
                try {
                    Iterator it = c1071a.f15221b.values().iterator();
                    while (it.hasNext()) {
                        C1071a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c1071a.f15222c.iterator();
                    while (it2.hasNext()) {
                        C1071a.a((AutoCloseable) it2.next());
                    }
                    c1071a.f15222c.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
