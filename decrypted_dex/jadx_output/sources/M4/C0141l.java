package M4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: M4.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0141l extends AbstractCollection implements List {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4630a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f4631b;

    /* renamed from: c, reason: collision with root package name */
    public final C0141l f4632c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f4633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W f4634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f4635f;

    public C0141l(W w10, Object obj, List list, C0141l c0141l) {
        this.f4635f = w10;
        this.f4634e = w10;
        this.f4630a = obj;
        this.f4631b = list;
        this.f4632c = c0141l;
        this.f4633d = c0141l == null ? null : c0141l.f4631b;
    }

    public final void a() {
        C0141l c0141l = this.f4632c;
        if (c0141l != null) {
            c0141l.a();
        } else {
            this.f4634e.f4572d.put(this.f4630a, this.f4631b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.f4631b.isEmpty();
        boolean add = this.f4631b.add(obj);
        if (add) {
            this.f4634e.f4573e++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f4631b.addAll(collection);
        if (addAll) {
            this.f4634e.f4573e += this.f4631b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final void b() {
        Collection collection;
        C0141l c0141l = this.f4632c;
        if (c0141l != null) {
            c0141l.b();
            if (c0141l.f4631b != this.f4633d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f4631b.isEmpty() || (collection = (Collection) this.f4634e.f4572d.get(this.f4630a)) == null) {
                return;
            }
            this.f4631b = collection;
        }
    }

    public final void c() {
        C0141l c0141l = this.f4632c;
        if (c0141l != null) {
            c0141l.c();
        } else if (this.f4631b.isEmpty()) {
            this.f4634e.f4572d.remove(this.f4630a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f4631b.clear();
        this.f4634e.f4573e -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.f4631b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.f4631b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f4631b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        b();
        return ((List) this.f4631b).get(i3);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.f4631b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f4631b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new C0132c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f4631b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new C0140k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.f4631b.remove(obj);
        if (remove) {
            W w10 = this.f4634e;
            w10.f4573e--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f4631b.removeAll(collection);
        if (removeAll) {
            this.f4634e.f4573e += this.f4631b.size() - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f4631b.retainAll(collection);
        if (retainAll) {
            this.f4634e.f4573e += this.f4631b.size() - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        b();
        return ((List) this.f4631b).set(i3, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.f4631b.size();
    }

    @Override // java.util.List
    public final List subList(int i3, int i10) {
        b();
        List subList = ((List) this.f4631b).subList(i3, i10);
        C0141l c0141l = this.f4632c;
        if (c0141l == null) {
            c0141l = this;
        }
        W w10 = this.f4635f;
        w10.getClass();
        boolean z2 = subList instanceof RandomAccess;
        Object obj = this.f4630a;
        return z2 ? new C0137h(w10, obj, subList, c0141l) : new C0141l(w10, obj, subList, c0141l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f4631b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        b();
        return new C0140k(this, i3);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        b();
        Object remove = ((List) this.f4631b).remove(i3);
        W w10 = this.f4635f;
        w10.f4573e--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        b();
        boolean isEmpty = this.f4631b.isEmpty();
        ((List) this.f4631b).add(i3, obj);
        this.f4635f.f4573e++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f4631b).addAll(i3, collection);
        if (addAll) {
            this.f4635f.f4573e += this.f4631b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }
}
