package com.google.protobuf;

import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class G extends AbstractC0721d implements N, RandomAccess, q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final G f12094d = new G(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public int[] f12095b;

    /* renamed from: c, reason: collision with root package name */
    public int f12096c;

    public G(int[] iArr, int i3, boolean z2) {
        super(z2);
        this.f12095b = iArr;
        this.f12096c = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i3 < 0 || i3 > (i10 = this.f12096c)) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12096c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
        int[] iArr = this.f12095b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i3, iArr, i3 + 1, i10 - i3);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.f12095b, i3, iArr2, i3 + 1, this.f12096c - i3);
            this.f12095b = iArr2;
        }
        this.f12095b[i3] = intValue;
        this.f12096c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Q.f12119a;
        collection.getClass();
        if (!(collection instanceof G)) {
            return super.addAll(collection);
        }
        G g10 = (G) collection;
        int i3 = g10.f12096c;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.f12096c;
        if (IntCompanionObject.MAX_VALUE - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
        int[] iArr = this.f12095b;
        if (i11 > iArr.length) {
            this.f12095b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(g10.f12095b, 0, this.f12095b, this.f12096c, g10.f12096c);
        this.f12096c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i3) {
        a();
        int i10 = this.f12096c;
        int[] iArr = this.f12095b;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f12095b = iArr2;
        }
        int[] iArr3 = this.f12095b;
        int i11 = this.f12096c;
        this.f12096c = i11 + 1;
        iArr3[i11] = i3;
    }

    public final void c(int i3) {
        if (i3 < 0 || i3 >= this.f12096c) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12096c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.P
    public final P e(int i3) {
        if (i3 >= this.f12096c) {
            return new G(Arrays.copyOf(this.f12095b, i3), this.f12096c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return super.equals(obj);
        }
        G g10 = (G) obj;
        if (this.f12096c != g10.f12096c) {
            return false;
        }
        int[] iArr = g10.f12095b;
        for (int i3 = 0; i3 < this.f12096c; i3++) {
            if (this.f12095b[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        c(i3);
        return Integer.valueOf(this.f12095b[i3]);
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f12096c; i10++) {
            i3 = (i3 * 31) + this.f12095b[i10];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i3 = this.f12096c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.f12095b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        a();
        c(i3);
        int[] iArr = this.f12095b;
        int i10 = iArr[i3];
        if (i3 < this.f12096c - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (r2 - i3) - 1);
        }
        this.f12096c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        a();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException(StubApp.getString2(12120));
        }
        int[] iArr = this.f12095b;
        System.arraycopy(iArr, i10, iArr, i3, this.f12096c - i10);
        this.f12096c -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        c(i3);
        int[] iArr = this.f12095b;
        int i10 = iArr[i3];
        iArr[i3] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12096c;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}
