package com.google.protobuf;

import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: com.google.protobuf.a0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0716a0 extends AbstractC0721d implements O, RandomAccess, q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C0716a0 f12138d = new C0716a0(new long[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public long[] f12139b;

    /* renamed from: c, reason: collision with root package name */
    public int f12140c;

    public C0716a0(long[] jArr, int i3, boolean z2) {
        super(z2);
        this.f12139b = jArr;
        this.f12140c = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        a();
        if (i3 < 0 || i3 > (i10 = this.f12140c)) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12140c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
        long[] jArr = this.f12139b;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i3, jArr, i3 + 1, i10 - i3);
        } else {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i3);
            System.arraycopy(this.f12139b, i3, jArr2, i3 + 1, this.f12140c - i3);
            this.f12139b = jArr2;
        }
        this.f12139b[i3] = longValue;
        this.f12140c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Q.f12119a;
        collection.getClass();
        if (!(collection instanceof C0716a0)) {
            return super.addAll(collection);
        }
        C0716a0 c0716a0 = (C0716a0) collection;
        int i3 = c0716a0.f12140c;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.f12140c;
        if (IntCompanionObject.MAX_VALUE - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
        long[] jArr = this.f12139b;
        if (i11 > jArr.length) {
            this.f12139b = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(c0716a0.f12139b, 0, this.f12139b, this.f12140c, c0716a0.f12140c);
        this.f12140c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(long j) {
        a();
        int i3 = this.f12140c;
        long[] jArr = this.f12139b;
        if (i3 == jArr.length) {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i3);
            this.f12139b = jArr2;
        }
        long[] jArr3 = this.f12139b;
        int i10 = this.f12140c;
        this.f12140c = i10 + 1;
        jArr3[i10] = j;
    }

    public final void c(int i3) {
        if (i3 < 0 || i3 >= this.f12140c) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12140c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.P
    public final P e(int i3) {
        if (i3 >= this.f12140c) {
            return new C0716a0(Arrays.copyOf(this.f12139b, i3), this.f12140c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0716a0)) {
            return super.equals(obj);
        }
        C0716a0 c0716a0 = (C0716a0) obj;
        if (this.f12140c != c0716a0.f12140c) {
            return false;
        }
        long[] jArr = c0716a0.f12139b;
        for (int i3 = 0; i3 < this.f12140c; i3++) {
            if (this.f12139b[i3] != jArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        c(i3);
        return Long.valueOf(this.f12139b[i3]);
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f12140c; i10++) {
            i3 = (i3 * 31) + Q.b(this.f12139b[i10]);
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i3 = this.f12140c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.f12139b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        a();
        c(i3);
        long[] jArr = this.f12139b;
        long j = jArr[i3];
        if (i3 < this.f12140c - 1) {
            System.arraycopy(jArr, i3 + 1, jArr, i3, (r3 - i3) - 1);
        }
        this.f12140c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        a();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException(StubApp.getString2(12120));
        }
        long[] jArr = this.f12139b;
        System.arraycopy(jArr, i10, jArr, i3, this.f12140c - i10);
        this.f12140c -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        c(i3);
        long[] jArr = this.f12139b;
        long j = jArr[i3];
        jArr[i3] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12140c;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }
}
