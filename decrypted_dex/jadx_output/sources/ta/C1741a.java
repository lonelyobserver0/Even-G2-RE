package ta;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.j;
import oa.p;
import oa.q;

/* renamed from: ta.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1741a implements List {

    /* renamed from: a, reason: collision with root package name */
    public final C1468a f21244a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21245b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21246c;

    /* renamed from: d, reason: collision with root package name */
    public p f21247d;

    /* renamed from: e, reason: collision with root package name */
    public final j f21248e;

    public C1741a(ArrayList arrayList, C1468a c1468a) {
        this.f21246c = false;
        this.f21245b = arrayList;
        this.f21244a = c1468a;
        if (arrayList.size() != c1468a.f18393a.size()) {
            this.f21246c = true;
        }
    }

    public static ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof String) {
                arrayList.add(new q((String) obj));
            } else {
                arrayList.add(((InterfaceC1743c) obj).p());
            }
        }
        return arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        p pVar = this.f21247d;
        C1468a c1468a = this.f21244a;
        if (pVar != null) {
            pVar.V(this.f21248e, c1468a);
            this.f21247d = null;
        }
        if (obj instanceof String) {
            c1468a.a(new q((String) obj));
        } else if (c1468a != null) {
            c1468a.a(((InterfaceC1743c) obj).p());
        }
        return this.f21245b.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (this.f21246c) {
            throw new UnsupportedOperationException(StubApp.getString2(23507));
        }
        p pVar = this.f21247d;
        C1468a c1468a = this.f21244a;
        if (pVar != null && collection.size() > 0) {
            this.f21247d.V(this.f21248e, c1468a);
            this.f21247d = null;
        }
        c1468a.f18393a.addAll(a(collection));
        return this.f21245b.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        p pVar = this.f21247d;
        if (pVar != null) {
            pVar.S(this.f21248e);
        }
        this.f21245b.clear();
        this.f21244a.f18393a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f21245b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f21245b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f21245b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        return this.f21245b.get(i3);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f21245b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f21245b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f21245b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f21245b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f21245b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f21245b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (this.f21246c) {
            throw new UnsupportedOperationException(StubApp.getString2(23508));
        }
        ArrayList arrayList = this.f21245b;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        arrayList.remove(indexOf);
        this.f21244a.H(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC1469b p8 = ((InterfaceC1743c) it.next()).p();
            C1468a c1468a = this.f21244a;
            for (int size = c1468a.f18393a.size() - 1; size >= 0; size--) {
                if (p8.equals(c1468a.G(size))) {
                    c1468a.H(size);
                }
            }
        }
        return this.f21245b.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC1469b p8 = ((InterfaceC1743c) it.next()).p();
            C1468a c1468a = this.f21244a;
            for (int size = c1468a.f18393a.size() - 1; size >= 0; size--) {
                if (!p8.equals(c1468a.G(size))) {
                    c1468a.H(size);
                }
            }
        }
        return this.f21245b.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        if (this.f21246c) {
            throw new UnsupportedOperationException(StubApp.getString2(23509));
        }
        boolean z2 = obj instanceof String;
        j jVar = this.f21248e;
        C1468a c1468a = this.f21244a;
        if (z2) {
            q qVar = new q((String) obj);
            p pVar = this.f21247d;
            if (pVar != null && i3 == 0) {
                pVar.V(jVar, qVar);
            }
            c1468a.J(i3, qVar);
        } else {
            p pVar2 = this.f21247d;
            if (pVar2 != null && i3 == 0) {
                pVar2.V(jVar, ((InterfaceC1743c) obj).p());
            }
            c1468a.J(i3, ((InterfaceC1743c) obj).p());
        }
        return this.f21245b.set(i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f21245b.size();
    }

    @Override // java.util.List
    public final List subList(int i3, int i10) {
        return this.f21245b.subList(i3, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f21245b.toArray();
    }

    public final String toString() {
        return StubApp.getString2(23510) + this.f21244a.toString() + StubApp.getString2(265);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return this.f21245b.listIterator(i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f21245b.toArray(objArr);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        if (!this.f21246c) {
            this.f21244a.H(i3);
            return this.f21245b.remove(i3);
        }
        throw new UnsupportedOperationException(StubApp.getString2(23508));
    }

    public C1741a(j jVar, j jVar2, p pVar, j jVar3) {
        this.f21246c = false;
        C1468a c1468a = new C1468a();
        this.f21244a = c1468a;
        c1468a.a(jVar2);
        ArrayList arrayList = new ArrayList();
        this.f21245b = arrayList;
        arrayList.add(jVar);
        this.f21247d = pVar;
        this.f21248e = jVar3;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        if (!this.f21246c) {
            p pVar = this.f21247d;
            C1468a c1468a = this.f21244a;
            if (pVar != null) {
                pVar.V(this.f21248e, c1468a);
                this.f21247d = null;
            }
            this.f21245b.add(i3, obj);
            if (obj instanceof String) {
                c1468a.f18393a.add(i3, new q((String) obj));
                return;
            } else {
                c1468a.f18393a.add(i3, ((InterfaceC1743c) obj).p());
                return;
            }
        }
        throw new UnsupportedOperationException(StubApp.getString2(23505));
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        if (!this.f21246c) {
            p pVar = this.f21247d;
            C1468a c1468a = this.f21244a;
            if (pVar != null && collection.size() > 0) {
                this.f21247d.V(this.f21248e, c1468a);
                this.f21247d = null;
            }
            c1468a.f18393a.addAll(i3, a(collection));
            return this.f21245b.addAll(i3, collection);
        }
        throw new UnsupportedOperationException(StubApp.getString2(23506));
    }
}
