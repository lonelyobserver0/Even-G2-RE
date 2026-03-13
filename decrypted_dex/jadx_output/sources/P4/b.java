package P4;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5535a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5537c;

    public b(int i3, int i10, int[] iArr) {
        this.f5535a = iArr;
        this.f5536b = i3;
        this.f5537c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return android.support.v4.media.session.b.s(this.f5535a, ((Integer) obj).intValue(), this.f5536b, this.f5537c) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f5535a[this.f5536b + i3] != bVar.f5535a[bVar.f5536b + i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        hc.b.i(i3, size());
        return Integer.valueOf(this.f5535a[this.f5536b + i3]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = this.f5536b; i10 < this.f5537c; i10++) {
            i3 = (i3 * 31) + this.f5535a[i10];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int[] iArr = this.f5535a;
        int i3 = this.f5536b;
        int s10 = android.support.v4.media.session.b.s(iArr, intValue, i3, this.f5537c);
        if (s10 >= 0) {
            return s10 - i3;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i3;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f5537c;
            while (true) {
                i10--;
                i3 = this.f5536b;
                if (i10 < i3) {
                    i10 = -1;
                    break;
                }
                if (this.f5535a[i10] == intValue) {
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        Integer num = (Integer) obj;
        hc.b.i(i3, size());
        int i10 = this.f5536b + i3;
        int[] iArr = this.f5535a;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5537c - this.f5536b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i10) {
        hc.b.l(i3, i10, size());
        if (i3 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.f5536b;
        return new b(i3 + i11, i11 + i10, this.f5535a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f5535a;
        int i3 = this.f5536b;
        sb2.append(iArr[i3]);
        while (true) {
            i3++;
            if (i3 >= this.f5537c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i3]);
        }
    }
}
