package U9;

import W4.q;
import android.os.HandlerThread;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public String f7520a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f7521b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f7522c;

    /* renamed from: d, reason: collision with root package name */
    public int f7523d;

    /* renamed from: e, reason: collision with root package name */
    public int f7524e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7525f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7526g;

    public h(int i3, int i10) {
        this.f7525f = new LinkedList();
        this.f7521b = new HashSet();
        this.f7522c = new HashSet();
        this.f7526g = new HashMap();
        this.f7520a = StubApp.getString2(6389);
        this.f7523d = i3;
        this.f7524e = i10;
    }

    public void b(W4.i iVar) {
        if (this.f7521b.contains(iVar.f8137a)) {
            throw new IllegalArgumentException(StubApp.getString2(6408));
        }
        this.f7522c.add(iVar);
    }

    @Override // U9.g
    public synchronized void c() {
        try {
            Iterator it = this.f7521b.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                synchronized (fVar) {
                    HandlerThread handlerThread = fVar.f7516c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        fVar.f7516c = null;
                        fVar.f7517d = null;
                    }
                }
            }
            Iterator it2 = this.f7522c.iterator();
            while (it2.hasNext()) {
                f fVar2 = (f) it2.next();
                synchronized (fVar2) {
                    HandlerThread handlerThread2 = fVar2.f7516c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        fVar2.f7516c = null;
                        fVar2.f7517d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // U9.g
    public synchronized void d(e eVar) {
        ((LinkedList) this.f7525f).add(eVar);
        Iterator it = new HashSet(this.f7521b).iterator();
        while (it.hasNext()) {
            h((f) it.next());
        }
    }

    public W4.b e() {
        if (((W4.e) this.f7525f) != null) {
            return new W4.b(this.f7520a, new HashSet(this.f7521b), new HashSet(this.f7522c), this.f7523d, this.f7524e, (W4.e) this.f7525f, (HashSet) this.f7526g);
        }
        throw new IllegalStateException(StubApp.getString2(6409));
    }

    public synchronized e f(f fVar) {
        e eVar;
        f fVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f7525f).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                eVar = (e) listIterator.next();
                fVar2 = eVar.a() != null ? (f) ((HashMap) this.f7526g).get(eVar.a()) : null;
                if (fVar2 == null) {
                    break;
                }
            } while (fVar2 != fVar);
            listIterator.remove();
            return eVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void g(int i3) {
        if (!(this.f7523d == 0)) {
            throw new IllegalStateException(StubApp.getString2(6410));
        }
        this.f7523d = i3;
    }

    public synchronized void h(f fVar) {
        try {
            e f10 = f(fVar);
            if (f10 != null) {
                this.f7522c.add(fVar);
                this.f7521b.remove(fVar);
                if (f10.a() != null) {
                    ((HashMap) this.f7526g).put(f10.a(), fVar);
                }
                fVar.f7517d.post(new Ab.b(16, fVar, f10));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // U9.g
    public synchronized void start() {
        for (int i3 = 0; i3 < this.f7523d; i3++) {
            f fVar = new f(this.f7520a + i3, this.f7524e);
            fVar.a(new Ab.b(17, this, fVar));
            this.f7521b.add(fVar);
        }
    }

    public h(Class cls, Class[] clsArr) {
        this.f7520a = null;
        HashSet hashSet = new HashSet();
        this.f7521b = hashSet;
        this.f7522c = new HashSet();
        this.f7523d = 0;
        this.f7524e = 0;
        this.f7526g = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            Y3.a.g(cls2, StubApp.getString2(6407));
            this.f7521b.add(q.a(cls2));
        }
    }

    public h(q qVar, q[] qVarArr) {
        this.f7520a = null;
        HashSet hashSet = new HashSet();
        this.f7521b = hashSet;
        this.f7522c = new HashSet();
        this.f7523d = 0;
        this.f7524e = 0;
        this.f7526g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            Y3.a.g(qVar2, StubApp.getString2(6407));
        }
        Collections.addAll(this.f7521b, qVarArr);
    }
}
