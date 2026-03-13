package M4;

import com.stub.StubApp;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class i0 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Set f4626a;

    /* renamed from: b, reason: collision with root package name */
    public final L4.g f4627b;

    public i0(Set set, L4.g gVar) {
        this.f4626a = set;
        this.f4627b = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f4627b.apply(obj)) {
            return this.f4626a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f4627b.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f4626a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f4626a;
        boolean z2 = set instanceof RandomAccess;
        L4.g gVar = this.f4627b;
        if (!z2 || !(set instanceof List)) {
            Iterator it = set.iterator();
            gVar.getClass();
            while (it.hasNext()) {
                if (gVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        gVar.getClass();
        int i3 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            if (!gVar.apply(obj)) {
                if (i10 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException unused) {
                        r.p(list, gVar, i3, i10);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        r.p(list, gVar, i3, i10);
                        return;
                    }
                }
                i3++;
            }
        }
        list.subList(i3, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z2;
        Set set = this.f4626a;
        set.getClass();
        try {
            z2 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z2 = false;
        }
        if (z2) {
            return this.f4627b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return r.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return r.k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f4626a.iterator();
        L4.g gVar = this.f4627b;
        hc.b.j(gVar, StubApp.getString2(3551));
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (gVar.apply(it.next())) {
                break;
            }
            i3++;
        }
        return true ^ (i3 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f4626a.iterator();
        it.getClass();
        L4.g gVar = this.f4627b;
        gVar.getClass();
        return new N(it, gVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f4626a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f4626a.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f4627b.apply(next) && collection.contains(next)) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f4626a.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f4627b.apply(next) && !collection.contains(next)) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f4626a.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (this.f4627b.apply(it.next())) {
                i3++;
            }
        }
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            N n10 = (N) it;
            if (!n10.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(n10.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            N n10 = (N) it;
            if (n10.hasNext()) {
                arrayList.add(n10.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
