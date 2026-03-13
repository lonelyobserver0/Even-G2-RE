package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0644l2 extends W1 implements RandomAccess, InterfaceC0659o2, H2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f11606d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0644l2 f11607e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11608b;

    /* renamed from: c, reason: collision with root package name */
    public int f11609c;

    static {
        int[] iArr = new int[0];
        f11606d = iArr;
        f11607e = new C0644l2(iArr, 0, false);
    }

    public C0644l2(int[] iArr, int i3, boolean z2) {
        super(z2);
        this.f11608b = iArr;
        this.f11609c = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i3 < 0 || i3 > (i10 = this.f11609c)) {
            throw new IndexOutOfBoundsException(Y1.a(this.f11609c, i3, (byte) 13, StubApp.getString2(11698), StubApp.getString2(11699)));
        }
        int i11 = i3 + 1;
        int[] iArr = this.f11608b;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i3, iArr, i11, i10 - i3);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f11608b, 0, iArr2, 0, i3);
            System.arraycopy(this.f11608b, i3, iArr2, i11, this.f11609c - i3);
            this.f11608b = iArr2;
        }
        this.f11608b[i3] = intValue;
        this.f11609c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC0673r2.f11652a;
        collection.getClass();
        if (!(collection instanceof C0644l2)) {
            return super.addAll(collection);
        }
        C0644l2 c0644l2 = (C0644l2) collection;
        int i3 = c0644l2.f11609c;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.f11609c;
        if (IntCompanionObject.MAX_VALUE - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
        int[] iArr = this.f11608b;
        if (i11 > iArr.length) {
            this.f11608b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(c0644l2.f11608b, 0, this.f11608b, this.f11609c, c0644l2.f11609c);
        this.f11609c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0669q2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0644l2 A(int i3) {
        if (i3 >= this.f11609c) {
            return new C0644l2(i3 == 0 ? f11606d : Arrays.copyOf(this.f11608b, i3), this.f11609c, true);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i3) {
        f(i3);
        return this.f11608b[i3];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i3) {
        a();
        int i10 = this.f11609c;
        int length = this.f11608b.length;
        if (i10 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f11608b, 0, iArr, 0, this.f11609c);
            this.f11608b = iArr;
        }
        int[] iArr2 = this.f11608b;
        int i11 = this.f11609c;
        this.f11609c = i11 + 1;
        iArr2[i11] = i3;
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0644l2)) {
            return super.equals(obj);
        }
        C0644l2 c0644l2 = (C0644l2) obj;
        if (this.f11609c != c0644l2.f11609c) {
            return false;
        }
        int[] iArr = c0644l2.f11608b;
        for (int i3 = 0; i3 < this.f11609c; i3++) {
            if (this.f11608b[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i3) {
        if (i3 < 0 || i3 >= this.f11609c) {
            throw new IndexOutOfBoundsException(Y1.a(this.f11609c, i3, (byte) 13, StubApp.getString2(11698), StubApp.getString2(11699)));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        f(i3);
        return Integer.valueOf(this.f11608b[i3]);
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f11609c; i10++) {
            i3 = (i3 * 31) + this.f11608b[i10];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i3 = this.f11609c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.f11608b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        a();
        f(i3);
        int[] iArr = this.f11608b;
        int i10 = iArr[i3];
        if (i3 < this.f11609c - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (r2 - i3) - 1);
        }
        this.f11609c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        a();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException(StubApp.getString2(12120));
        }
        int[] iArr = this.f11608b;
        System.arraycopy(iArr, i10, iArr, i3, this.f11609c - i10);
        this.f11609c -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        f(i3);
        int[] iArr = this.f11608b;
        int i10 = iArr[i3];
        iArr[i3] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11609c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
