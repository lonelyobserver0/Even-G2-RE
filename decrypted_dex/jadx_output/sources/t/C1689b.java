package t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1689b implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1692e f21014a;

    public C1689b(C1692e c1692e) {
        this.f21014a = c1692e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f21014a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f21014a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f21014a.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C1692e c1692e = this.f21014a;
        try {
            if (c1692e.f21040c == set.size()) {
                return c1692e.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C1692e c1692e = this.f21014a;
        int i3 = 0;
        for (int i10 = c1692e.f21040c - 1; i10 >= 0; i10--) {
            Object f10 = c1692e.f(i10);
            i3 += f10 == null ? 0 : f10.hashCode();
        }
        return i3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f21014a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1688a(this.f21014a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1692e c1692e = this.f21014a;
        int d8 = c1692e.d(obj);
        if (d8 < 0) {
            return false;
        }
        c1692e.g(d8);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f21014a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1692e c1692e = this.f21014a;
        int i3 = c1692e.f21040c;
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            if (!collection.contains(c1692e.f(i10))) {
                c1692e.g(i10);
            }
        }
        return i3 != c1692e.f21040c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f21014a.f21040c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1692e c1692e = this.f21014a;
        int i3 = c1692e.f21040c;
        Object[] objArr = new Object[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = c1692e.f(i10);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1692e c1692e = this.f21014a;
        int i3 = c1692e.f21040c;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = c1692e.f(i10);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
