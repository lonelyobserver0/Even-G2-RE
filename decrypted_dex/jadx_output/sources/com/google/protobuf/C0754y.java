package com.google.protobuf;

import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0754y extends AbstractC0721d implements M, RandomAccess, q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C0754y f12247d = new C0754y(new float[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public float[] f12248b;

    /* renamed from: c, reason: collision with root package name */
    public int f12249c;

    public C0754y(float[] fArr, int i3, boolean z2) {
        super(z2);
        this.f12248b = fArr;
        this.f12249c = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i3 < 0 || i3 > (i10 = this.f12249c)) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12249c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
        float[] fArr = this.f12248b;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i3, fArr, i3 + 1, i10 - i3);
        } else {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i3);
            System.arraycopy(this.f12248b, i3, fArr2, i3 + 1, this.f12249c - i3);
            this.f12248b = fArr2;
        }
        this.f12248b[i3] = floatValue;
        this.f12249c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Q.f12119a;
        collection.getClass();
        if (!(collection instanceof C0754y)) {
            return super.addAll(collection);
        }
        C0754y c0754y = (C0754y) collection;
        int i3 = c0754y.f12249c;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.f12249c;
        if (IntCompanionObject.MAX_VALUE - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
        float[] fArr = this.f12248b;
        if (i11 > fArr.length) {
            this.f12248b = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(c0754y.f12248b, 0, this.f12248b, this.f12249c, c0754y.f12249c);
        this.f12249c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(float f10) {
        a();
        int i3 = this.f12249c;
        float[] fArr = this.f12248b;
        if (i3 == fArr.length) {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i3);
            this.f12248b = fArr2;
        }
        float[] fArr3 = this.f12248b;
        int i10 = this.f12249c;
        this.f12249c = i10 + 1;
        fArr3[i10] = f10;
    }

    public final void c(int i3) {
        if (i3 < 0 || i3 >= this.f12249c) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12249c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.P
    public final P e(int i3) {
        if (i3 >= this.f12249c) {
            return new C0754y(Arrays.copyOf(this.f12248b, i3), this.f12249c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0754y)) {
            return super.equals(obj);
        }
        C0754y c0754y = (C0754y) obj;
        if (this.f12249c != c0754y.f12249c) {
            return false;
        }
        float[] fArr = c0754y.f12248b;
        for (int i3 = 0; i3 < this.f12249c; i3++) {
            if (Float.floatToIntBits(this.f12248b[i3]) != Float.floatToIntBits(fArr[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        c(i3);
        return Float.valueOf(this.f12248b[i3]);
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f12249c; i10++) {
            i3 = (i3 * 31) + Float.floatToIntBits(this.f12248b[i10]);
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i3 = this.f12249c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.f12248b[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        a();
        c(i3);
        float[] fArr = this.f12248b;
        float f10 = fArr[i3];
        if (i3 < this.f12249c - 1) {
            System.arraycopy(fArr, i3 + 1, fArr, i3, (r2 - i3) - 1);
        }
        this.f12249c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        a();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException(StubApp.getString2(12120));
        }
        float[] fArr = this.f12248b;
        System.arraycopy(fArr, i10, fArr, i3, this.f12249c - i10);
        this.f12249c -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        c(i3);
        float[] fArr = this.f12248b;
        float f10 = fArr[i3];
        fArr[i3] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12249c;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}
