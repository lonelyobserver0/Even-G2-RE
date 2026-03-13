package x;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f22630a = new HashSet(2);

    /* renamed from: b, reason: collision with root package name */
    public int f22631b = 0;

    public final void a(k kVar) {
        this.f22630a.add(kVar);
    }

    public final void b() {
        this.f22631b = 1;
        Iterator it = this.f22630a.iterator();
        while (it.hasNext()) {
            ((k) it.next()).e();
        }
    }

    public final void c() {
        this.f22631b = 0;
        Iterator it = this.f22630a.iterator();
        while (it.hasNext()) {
            ((k) it.next()).c();
        }
    }

    public final boolean d() {
        return this.f22631b == 1;
    }

    public void e() {
    }
}
