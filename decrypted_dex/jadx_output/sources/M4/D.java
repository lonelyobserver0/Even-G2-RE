package M4;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class D extends AbstractCollection implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f4540a = new Object[0];

    public abstract I a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public abstract int b(int i3, Object[] objArr);

    public Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean g();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract n0 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f4540a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] c10 = c();
            if (c10 != null) {
                return Arrays.copyOfRange(c10, f(), d(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        b(0, objArr);
        return objArr;
    }
}
