package com.google.protobuf;

import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0725f extends AbstractC0721d implements H, RandomAccess, q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C0725f f12149d = new C0725f(new boolean[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f12150b;

    /* renamed from: c, reason: collision with root package name */
    public int f12151c;

    public C0725f(boolean[] zArr, int i3, boolean z2) {
        super(z2);
        this.f12150b = zArr;
        this.f12151c = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i3 < 0 || i3 > (i10 = this.f12151c)) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12151c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
        boolean[] zArr = this.f12150b;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i3, zArr, i3 + 1, i10 - i3);
        } else {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i3);
            System.arraycopy(this.f12150b, i3, zArr2, i3 + 1, this.f12151c - i3);
            this.f12150b = zArr2;
        }
        this.f12150b[i3] = booleanValue;
        this.f12151c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Q.f12119a;
        collection.getClass();
        if (!(collection instanceof C0725f)) {
            return super.addAll(collection);
        }
        C0725f c0725f = (C0725f) collection;
        int i3 = c0725f.f12151c;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.f12151c;
        if (IntCompanionObject.MAX_VALUE - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
        boolean[] zArr = this.f12150b;
        if (i11 > zArr.length) {
            this.f12150b = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(c0725f.f12150b, 0, this.f12150b, this.f12151c, c0725f.f12151c);
        this.f12151c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(boolean z2) {
        a();
        int i3 = this.f12151c;
        boolean[] zArr = this.f12150b;
        if (i3 == zArr.length) {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i3);
            this.f12150b = zArr2;
        }
        boolean[] zArr3 = this.f12150b;
        int i10 = this.f12151c;
        this.f12151c = i10 + 1;
        zArr3[i10] = z2;
    }

    public final void c(int i3) {
        if (i3 < 0 || i3 >= this.f12151c) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12151c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.P
    public final P e(int i3) {
        if (i3 >= this.f12151c) {
            return new C0725f(Arrays.copyOf(this.f12150b, i3), this.f12151c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0725f)) {
            return super.equals(obj);
        }
        C0725f c0725f = (C0725f) obj;
        if (this.f12151c != c0725f.f12151c) {
            return false;
        }
        boolean[] zArr = c0725f.f12150b;
        for (int i3 = 0; i3 < this.f12151c; i3++) {
            if (this.f12150b[i3] != zArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        c(i3);
        return Boolean.valueOf(this.f12150b[i3]);
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f12151c; i10++) {
            int i11 = i3 * 31;
            boolean z2 = this.f12150b[i10];
            Charset charset = Q.f12119a;
            i3 = i11 + (z2 ? 1231 : 1237);
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i3 = this.f12151c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.f12150b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        a();
        c(i3);
        boolean[] zArr = this.f12150b;
        boolean z2 = zArr[i3];
        if (i3 < this.f12151c - 1) {
            System.arraycopy(zArr, i3 + 1, zArr, i3, (r2 - i3) - 1);
        }
        this.f12151c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        a();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException(StubApp.getString2(12120));
        }
        boolean[] zArr = this.f12150b;
        System.arraycopy(zArr, i10, zArr, i3, this.f12151c - i10);
        this.f12151c -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i3);
        boolean[] zArr = this.f12150b;
        boolean z2 = zArr[i3];
        zArr[i3] = booleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12151c;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}
