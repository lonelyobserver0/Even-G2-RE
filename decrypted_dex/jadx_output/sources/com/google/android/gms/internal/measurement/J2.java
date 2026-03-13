package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class J2 extends W1 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f11291d;

    /* renamed from: e, reason: collision with root package name */
    public static final J2 f11292e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f11293b;

    /* renamed from: c, reason: collision with root package name */
    public int f11294c;

    static {
        Object[] objArr = new Object[0];
        f11291d = objArr;
        f11292e = new J2(objArr, 0, false);
    }

    public J2(Object[] objArr, int i3, boolean z2) {
        super(z2);
        this.f11293b = objArr;
        this.f11294c = i3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0669q2
    public final /* bridge */ /* synthetic */ InterfaceC0669q2 A(int i3) {
        if (i3 >= this.f11294c) {
            return new J2(i3 == 0 ? f11291d : Arrays.copyOf(this.f11293b, i3), this.f11294c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        a();
        if (i3 < 0 || i3 > (i10 = this.f11294c)) {
            throw new IndexOutOfBoundsException(Y1.a(this.f11294c, i3, (byte) 13, StubApp.getString2(11698), StubApp.getString2(11699)));
        }
        int i11 = i3 + 1;
        Object[] objArr = this.f11293b;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i3, objArr, i11, i10 - i3);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f11293b, 0, objArr2, 0, i3);
            System.arraycopy(this.f11293b, i3, objArr2, i11, this.f11294c - i3);
            this.f11293b = objArr2;
        }
        this.f11293b[i3] = obj;
        this.f11294c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i3) {
        if (i3 < 0 || i3 >= this.f11294c) {
            throw new IndexOutOfBoundsException(Y1.a(this.f11294c, i3, (byte) 13, StubApp.getString2(11698), StubApp.getString2(11699)));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        b(i3);
        return this.f11293b[i3];
    }

    @Override // com.google.android.gms.internal.measurement.W1, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        a();
        b(i3);
        Object[] objArr = this.f11293b;
        Object obj = objArr[i3];
        if (i3 < this.f11294c - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f11294c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        a();
        b(i3);
        Object[] objArr = this.f11293b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11294c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i3 = this.f11294c;
        int length = this.f11293b.length;
        if (i3 == length) {
            this.f11293b = Arrays.copyOf(this.f11293b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f11293b;
        int i10 = this.f11294c;
        this.f11294c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
