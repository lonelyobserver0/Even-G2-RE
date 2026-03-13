package L0;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.AbstractC1416M;
import o0.C1447v;
import r0.AbstractC1550k;
import t0.InterfaceC1726z;

/* renamed from: L0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0105a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4039a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f4040b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final A0.f f4041c;

    /* renamed from: d, reason: collision with root package name */
    public final A0.f f4042d;

    /* renamed from: e, reason: collision with root package name */
    public Looper f4043e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1416M f4044f;

    /* renamed from: g, reason: collision with root package name */
    public w0.j f4045g;

    public AbstractC0105a() {
        int i3 = 0;
        B b2 = null;
        this.f4041c = new A0.f(new CopyOnWriteArrayList(), i3, b2);
        this.f4042d = new A0.f(new CopyOnWriteArrayList(), i3, b2);
    }

    public final A0.f a(B b2) {
        return new A0.f(this.f4041c.f34c, 0, b2);
    }

    public abstract InterfaceC0129z b(B b2, P0.e eVar, long j);

    public final void c(C c10) {
        HashSet hashSet = this.f4040b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(c10);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public void d() {
    }

    public final void e(C c10) {
        this.f4043e.getClass();
        HashSet hashSet = this.f4040b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(c10);
        if (isEmpty) {
            f();
        }
    }

    public void f() {
    }

    public AbstractC1416M g() {
        return null;
    }

    public abstract C1447v h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(C c10, InterfaceC1726z interfaceC1726z, w0.j jVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f4043e;
        AbstractC1550k.c(looper == null || looper == myLooper);
        this.f4045g = jVar;
        AbstractC1416M abstractC1416M = this.f4044f;
        this.f4039a.add(c10);
        if (this.f4043e == null) {
            this.f4043e = myLooper;
            this.f4040b.add(c10);
            l(interfaceC1726z);
        } else if (abstractC1416M != null) {
            e(c10);
            c10.a(this, abstractC1416M);
        }
    }

    public abstract void l(InterfaceC1726z interfaceC1726z);

    public final void m(AbstractC1416M abstractC1416M) {
        this.f4044f = abstractC1416M;
        Iterator it = this.f4039a.iterator();
        while (it.hasNext()) {
            ((C) it.next()).a(this, abstractC1416M);
        }
    }

    public abstract void n(InterfaceC0129z interfaceC0129z);

    public final void p(C c10) {
        ArrayList arrayList = this.f4039a;
        arrayList.remove(c10);
        if (!arrayList.isEmpty()) {
            c(c10);
            return;
        }
        this.f4043e = null;
        this.f4044f = null;
        this.f4045g = null;
        this.f4040b.clear();
        q();
    }

    public abstract void q();

    public final void s(A0.g gVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4042d.f34c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            A0.e eVar = (A0.e) it.next();
            if (eVar.f31a == gVar) {
                copyOnWriteArrayList.remove(eVar);
            }
        }
    }

    public final void u(G g10) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4041c.f34c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            F f10 = (F) it.next();
            if (f10.f3896b == g10) {
                copyOnWriteArrayList.remove(f10);
            }
        }
    }

    public abstract void v(C1447v c1447v);
}
