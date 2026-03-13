package M4;

import com.stub.StubApp;
import f5.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class I extends D implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final G f4549b = new G(Z.f4578e, 0);

    public static Z j(int i3, Object[] objArr) {
        return i3 == 0 ? Z.f4578e : new Z(objArr, i3);
    }

    public static F l() {
        return new F(4);
    }

    public static I m(Collection collection) {
        if (!(collection instanceof D)) {
            Object[] array = collection.toArray();
            r.b(array.length, array);
            return j(array.length, array);
        }
        I a3 = ((D) collection).a();
        if (!a3.g()) {
            return a3;
        }
        Object[] array2 = a3.toArray(D.f4540a);
        return j(array2.length, array2);
    }

    public static Z n(Object[] objArr) {
        if (objArr.length == 0) {
            return Z.f4578e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        r.b(objArr2.length, objArr2);
        return j(objArr2.length, objArr2);
    }

    public static Z p(Long l9, Long l10, Long l11, Long l12, Long l13) {
        Object[] objArr = {l9, l10, l11, l12, l13};
        r.b(5, objArr);
        return j(5, objArr);
    }

    public static Z q(Object obj) {
        Object[] objArr = {obj};
        r.b(1, objArr);
        return j(1, objArr);
    }

    public static Z r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        r.b(2, objArr);
        return j(2, objArr);
    }

    public static Z s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        hc.b.h(StubApp.getString2(3540), objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        r.b(length, objArr2);
        return j(length, objArr2);
    }

    public static Z t(Y y10, List list) {
        y10.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        r.b(array.length, array);
        Arrays.sort(array, y10);
        return j(array.length, array);
    }

    @Override // M4.D
    public final I a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // M4.D
    public int b(int i3, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i3 + i10] = get(i10);
        }
        return i3 + size;
    }

    @Override // M4.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && u0.j(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        if (u0.j(get(i3), list.get(i3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i3 = ~(~(get(i10).hashCode() + (i3 * 31)));
        }
        return i3;
    }

    @Override // M4.D
    /* renamed from: i */
    public final n0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (obj.equals(get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    @Override // M4.D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final G listIterator(int i3) {
        hc.b.k(i3, size());
        return isEmpty() ? f4549b : new G(this, i3);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public I subList(int i3, int i10) {
        hc.b.l(i3, i10, size());
        int i11 = i10 - i3;
        return i11 == size() ? this : i11 == 0 ? Z.f4578e : new H(this, i3, i11);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
