package t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1691d implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1692e f21019a;

    public C1691d(C1692e c1692e) {
        this.f21019a = c1692e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f21019a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f21019a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f21019a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1688a(this.f21019a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1692e c1692e = this.f21019a;
        int a3 = c1692e.a(obj);
        if (a3 < 0) {
            return false;
        }
        c1692e.g(a3);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1692e c1692e = this.f21019a;
        int i3 = c1692e.f21040c;
        int i10 = 0;
        boolean z2 = false;
        while (i10 < i3) {
            if (collection.contains(c1692e.i(i10))) {
                c1692e.g(i10);
                i10--;
                i3--;
                z2 = true;
            }
            i10++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1692e c1692e = this.f21019a;
        int i3 = c1692e.f21040c;
        int i10 = 0;
        boolean z2 = false;
        while (i10 < i3) {
            if (!collection.contains(c1692e.i(i10))) {
                c1692e.g(i10);
                i10--;
                i3--;
                z2 = true;
            }
            i10++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f21019a.f21040c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1692e c1692e = this.f21019a;
        int i3 = c1692e.f21040c;
        Object[] objArr = new Object[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = c1692e.i(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1692e c1692e = this.f21019a;
        int i3 = c1692e.f21040c;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = c1692e.i(i10);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
