package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0698w2 extends W1 implements RandomAccess, InterfaceC0664p2, H2 {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f11759d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0698w2 f11760e;

    /* renamed from: b, reason: collision with root package name */
    public long[] f11761b;

    /* renamed from: c, reason: collision with root package name */
    public int f11762c;

    static {
        long[] jArr = new long[0];
        f11759d = jArr;
        f11760e = new C0698w2(jArr, 0, false);
    }

    public C0698w2(long[] jArr, int i3, boolean z2) {
        super(z2);
        this.f11761b = jArr;
        this.f11762c = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        a();
        if (i3 < 0 || i3 > (i10 = this.f11762c)) {
            throw new IndexOutOfBoundsException(Y1.a(this.f11762c, i3, (byte) 13, StubApp.getString2(11698), StubApp.getString2(11699)));
        }
        int i11 = i3 + 1;
        long[] jArr = this.f11761b;
        int length = jArr.length;
        if (i10 < length) {
            System.arraycopy(jArr, i3, jArr, i11, i10 - i3);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f11761b, 0, jArr2, 0, i3);
            System.arraycopy(this.f11761b, i3, jArr2, i11, this.f11762c - i3);
            this.f11761b = jArr2;
        }
        this.f11761b[i3] = longValue;
        this.f11762c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC0673r2.f11652a;
        collection.getClass();
        if (!(collection instanceof C0698w2)) {
            return super.addAll(collection);
        }
        C0698w2 c0698w2 = (C0698w2) collection;
        int i3 = c0698w2.f11762c;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.f11762c;
        if (IntCompanionObject.MAX_VALUE - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
        long[] jArr = this.f11761b;
        if (i11 > jArr.length) {
            this.f11761b = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(c0698w2.f11761b, 0, this.f11761b, this.f11762c, c0698w2.f11762c);
        this.f11762c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long b(int i3) {
        f(i3);
        return this.f11761b[i3];
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0669q2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0698w2 A(int i3) {
        if (i3 >= this.f11762c) {
            return new C0698w2(i3 == 0 ? f11759d : Arrays.copyOf(this.f11761b, i3), this.f11762c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j) {
        a();
        int i3 = this.f11762c;
        int length = this.f11761b.length;
        if (i3 == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f11761b, 0, jArr, 0, this.f11762c);
            this.f11761b = jArr;
        }
        long[] jArr2 = this.f11761b;
        int i10 = this.f11762c;
        this.f11762c = i10 + 1;
        jArr2[i10] = j;
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0698w2)) {
            return super.equals(obj);
        }
        C0698w2 c0698w2 = (C0698w2) obj;
        if (this.f11762c != c0698w2.f11762c) {
            return false;
        }
        long[] jArr = c0698w2.f11761b;
        for (int i3 = 0; i3 < this.f11762c; i3++) {
            if (this.f11761b[i3] != jArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i3) {
        if (i3 < 0 || i3 >= this.f11762c) {
            throw new IndexOutOfBoundsException(Y1.a(this.f11762c, i3, (byte) 13, StubApp.getString2(11698), StubApp.getString2(11699)));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        f(i3);
        return Long.valueOf(this.f11761b[i3]);
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f11762c; i10++) {
            long j = this.f11761b[i10];
            Charset charset = AbstractC0673r2.f11652a;
            i3 = (i3 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i3 = this.f11762c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.f11761b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        a();
        f(i3);
        long[] jArr = this.f11761b;
        long j = jArr[i3];
        if (i3 < this.f11762c - 1) {
            System.arraycopy(jArr, i3 + 1, jArr, i3, (r3 - i3) - 1);
        }
        this.f11762c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        a();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException(StubApp.getString2(12120));
        }
        long[] jArr = this.f11761b;
        System.arraycopy(jArr, i10, jArr, i3, this.f11762c - i10);
        this.f11762c -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        f(i3);
        long[] jArr = this.f11761b;
        long j = jArr[i3];
        jArr[i3] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11762c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
