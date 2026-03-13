package M4;

import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import oa.C1471d;
import sa.C1609b;

/* renamed from: M4.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0132c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4591a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4592b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4594d;

    public C0132c(sa.e eVar, C1471d c1471d) {
        this.f4591a = 3;
        this.f4594d = eVar;
        this.f4592b = new ArrayDeque();
        this.f4593c = new HashSet();
        a(c1471d);
        this.f4593c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r7.f18397a.containsKey(oa.j.f18480N1) != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(oa.C1471d r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L18
            oa.j r0 = oa.j.f18621y3
            oa.j r0 = r7.H(r0)
            oa.j r1 = oa.j.f18431C2
            if (r0 == r1) goto L16
            oa.j r0 = oa.j.f18480N1
            java.util.Map r1 = r7.f18397a
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L18
        L16:
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            r1 = 948(0x3b4, float:1.328E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            if (r0 == 0) goto La8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            oa.j r2 = oa.j.f18480N1
            oa.a r7 = r7.F(r2)
            if (r7 != 0) goto L30
            goto L71
        L30:
            java.util.ArrayList r2 = r7.f18393a
            int r2 = r2.size()
            r3 = 0
        L37:
            if (r3 >= r2) goto L71
            oa.b r4 = r7.G(r3)
            boolean r5 = r4 instanceof oa.C1471d
            if (r5 == 0) goto L47
            oa.d r4 = (oa.C1471d) r4
            r0.add(r4)
            goto L6e
        L47:
            if (r4 != 0) goto L51
            r4 = 1116(0x45c, float:1.564E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            goto L59
        L51:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
        L59:
            r5 = 3547(0xddb, float:4.97E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            java.lang.String r4 = r5.concat(r4)
            r5 = 948(0x3b4, float:1.328E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            android.util.Log.w(r5, r4)
        L6e:
            int r3 = r3 + 1
            goto L37
        L71:
            java.util.Iterator r7 = r0.iterator()
        L75:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r7.next()
            oa.d r0 = (oa.C1471d) r0
            java.lang.Object r2 = r6.f4593c
            java.util.HashSet r2 = (java.util.HashSet) r2
            boolean r3 = r2.contains(r0)
            if (r3 == 0) goto L96
            r0 = 3548(0xddc, float:4.972E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            android.util.Log.e(r1, r0)
            goto L75
        L96:
            oa.j r3 = oa.j.f18480N1
            java.util.Map r4 = r0.f18397a
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto La3
            r2.add(r0)
        La3:
            r6.a(r0)
            goto L75
        La7:
            return
        La8:
            oa.j r0 = oa.j.f18426B2
            oa.j r2 = oa.j.f18621y3
            oa.j r3 = r7.H(r2)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r6.f4592b
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            r0.add(r7)
            return
        Lbe:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 3549(0xddd, float:4.973E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r0.<init>(r3)
            oa.j r7 = r7.H(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.e(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0132c.a(oa.d):void");
    }

    public void b() {
        C0141l c0141l = (C0141l) this.f4594d;
        c0141l.b();
        if (c0141l.f4631b != ((Collection) this.f4593c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4591a) {
            case 0:
                return ((Iterator) this.f4592b).hasNext();
            case 1:
                return ((Iterator) this.f4592b).hasNext();
            case 2:
                b();
                return ((Iterator) this.f4592b).hasNext();
            default:
                return !((ArrayDeque) this.f4592b).isEmpty();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4591a) {
            case 0:
                Map.Entry entry = (Map.Entry) ((Iterator) this.f4592b).next();
                this.f4593c = (Collection) entry.getValue();
                return ((C0133d) this.f4594d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) ((Iterator) this.f4592b).next();
                this.f4593c = entry2;
                return entry2.getKey();
            case 2:
                b();
                return ((Iterator) this.f4592b).next();
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                C1471d c1471d = (C1471d) ((ArrayDeque) this.f4592b).poll();
                oa.j jVar = oa.j.f18621y3;
                oa.j H2 = c1471d.H(jVar);
                if (H2 == null) {
                    c1471d.V(jVar, oa.j.f18426B2);
                } else if (!oa.j.f18426B2.equals(H2)) {
                    throw new IllegalStateException(StubApp.getString2(3550) + H2);
                }
                C1609b c1609b = ((sa.e) this.f4594d).f20836b;
                return new sa.d(c1471d, c1609b != null ? c1609b.f20827e : null);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4591a) {
            case 0:
                hc.b.n(StubApp.getString2(3546), ((Collection) this.f4593c) != null);
                ((Iterator) this.f4592b).remove();
                C0133d c0133d = (C0133d) this.f4594d;
                c0133d.f4600d.f4573e -= ((Collection) this.f4593c).size();
                ((Collection) this.f4593c).clear();
                this.f4593c = null;
                return;
            case 1:
                hc.b.n(StubApp.getString2(3546), ((Map.Entry) this.f4593c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f4593c).getValue();
                ((Iterator) this.f4592b).remove();
                C0134e c0134e = (C0134e) this.f4594d;
                c0134e.f4605b.f4573e -= collection.size();
                collection.clear();
                this.f4593c = null;
                return;
            case 2:
                ((Iterator) this.f4592b).remove();
                C0141l c0141l = (C0141l) this.f4594d;
                W w10 = c0141l.f4634e;
                w10.f4573e--;
                c0141l.c();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0132c(C0141l c0141l) {
        Object it;
        this.f4591a = 2;
        this.f4594d = c0141l;
        Collection collection = c0141l.f4631b;
        this.f4593c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f4592b = it;
    }

    public C0132c(C0141l c0141l, ListIterator listIterator) {
        this.f4591a = 2;
        this.f4594d = c0141l;
        this.f4593c = c0141l.f4631b;
        this.f4592b = listIterator;
    }

    public C0132c(C0134e c0134e, Iterator it) {
        this.f4591a = 1;
        this.f4592b = it;
        this.f4594d = c0134e;
    }

    public C0132c(C0133d c0133d) {
        this.f4591a = 0;
        this.f4594d = c0133d;
        this.f4592b = c0133d.f4599c.entrySet().iterator();
    }
}
