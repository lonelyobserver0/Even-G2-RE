package com.google.protobuf;

import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r extends AbstractC0721d implements I, RandomAccess, q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final r f12213d = new r(new double[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public double[] f12214b;

    /* renamed from: c, reason: collision with root package name */
    public int f12215c;

    public r(double[] dArr, int i3, boolean z2) {
        super(z2);
        this.f12214b = dArr;
        this.f12215c = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i3 < 0 || i3 > (i10 = this.f12215c)) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12215c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
        double[] dArr = this.f12214b;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i3, dArr, i3 + 1, i10 - i3);
        } else {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i3);
            System.arraycopy(this.f12214b, i3, dArr2, i3 + 1, this.f12215c - i3);
            this.f12214b = dArr2;
        }
        this.f12214b[i3] = doubleValue;
        this.f12215c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Q.f12119a;
        collection.getClass();
        if (!(collection instanceof r)) {
            return super.addAll(collection);
        }
        r rVar = (r) collection;
        int i3 = rVar.f12215c;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.f12215c;
        if (IntCompanionObject.MAX_VALUE - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
        double[] dArr = this.f12214b;
        if (i11 > dArr.length) {
            this.f12214b = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(rVar.f12214b, 0, this.f12214b, this.f12215c, rVar.f12215c);
        this.f12215c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(double d8) {
        a();
        int i3 = this.f12215c;
        double[] dArr = this.f12214b;
        if (i3 == dArr.length) {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i3);
            this.f12214b = dArr2;
        }
        double[] dArr3 = this.f12214b;
        int i10 = this.f12215c;
        this.f12215c = i10 + 1;
        dArr3[i10] = d8;
    }

    public final void c(int i3) {
        if (i3 < 0 || i3 >= this.f12215c) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12215c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.P
    public final P e(int i3) {
        if (i3 >= this.f12215c) {
            return new r(Arrays.copyOf(this.f12214b, i3), this.f12215c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return super.equals(obj);
        }
        r rVar = (r) obj;
        if (this.f12215c != rVar.f12215c) {
            return false;
        }
        double[] dArr = rVar.f12214b;
        for (int i3 = 0; i3 < this.f12215c; i3++) {
            if (Double.doubleToLongBits(this.f12214b[i3]) != Double.doubleToLongBits(dArr[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        c(i3);
        return Double.valueOf(this.f12214b[i3]);
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f12215c; i10++) {
            i3 = (i3 * 31) + Q.b(Double.doubleToLongBits(this.f12214b[i10]));
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i3 = this.f12215c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.f12214b[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        a();
        c(i3);
        double[] dArr = this.f12214b;
        double d8 = dArr[i3];
        if (i3 < this.f12215c - 1) {
            System.arraycopy(dArr, i3 + 1, dArr, i3, (r3 - i3) - 1);
        }
        this.f12215c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        a();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException(StubApp.getString2(12120));
        }
        double[] dArr = this.f12214b;
        System.arraycopy(dArr, i10, dArr, i3, this.f12215c - i10);
        this.f12215c -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        c(i3);
        double[] dArr = this.f12214b;
        double d8 = dArr[i3];
        dArr[i3] = doubleValue;
        return Double.valueOf(d8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12215c;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Double) obj).doubleValue());
        return true;
    }
}
