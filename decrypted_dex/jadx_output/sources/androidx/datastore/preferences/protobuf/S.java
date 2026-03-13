package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class S extends AbstractC0402b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final S f9737d = new S(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f9738b;

    /* renamed from: c, reason: collision with root package name */
    public int f9739c;

    public S(Object[] objArr, int i3, boolean z2) {
        this.f9763a = z2;
        this.f9738b = objArr;
        this.f9739c = i3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i3 = this.f9739c;
        Object[] objArr = this.f9738b;
        if (i3 == objArr.length) {
            this.f9738b = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9738b;
        int i10 = this.f9739c;
        this.f9739c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i3) {
        if (i3 < 0 || i3 >= this.f9739c) {
            StringBuilder u2 = Xa.h.u(i3, "Index:", ", Size:");
            u2.append(this.f9739c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
    }

    public final S c(int i3) {
        if (i3 >= this.f9739c) {
            return new S(Arrays.copyOf(this.f9738b, i3), this.f9739c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        b(i3);
        return this.f9738b[i3];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0402b, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        a();
        b(i3);
        Object[] objArr = this.f9738b;
        Object obj = objArr[i3];
        if (i3 < this.f9739c - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f9739c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        a();
        b(i3);
        Object[] objArr = this.f9738b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9739c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        a();
        if (i3 >= 0 && i3 <= (i10 = this.f9739c)) {
            Object[] objArr = this.f9738b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i10 - i3);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(this.f9738b, i3, objArr2, i3 + 1, this.f9739c - i3);
                this.f9738b = objArr2;
            }
            this.f9738b[i3] = obj;
            this.f9739c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder u2 = Xa.h.u(i3, "Index:", ", Size:");
        u2.append(this.f9739c);
        throw new IndexOutOfBoundsException(u2.toString());
    }
}
