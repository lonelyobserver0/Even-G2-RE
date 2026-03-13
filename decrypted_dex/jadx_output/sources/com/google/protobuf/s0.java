package com.google.protobuf;

import com.stub.StubApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s0 extends AbstractC0721d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final s0 f12219d = new s0(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f12220b;

    /* renamed from: c, reason: collision with root package name */
    public int f12221c;

    public s0(Object[] objArr, int i3, boolean z2) {
        super(z2);
        this.f12220b = objArr;
        this.f12221c = i3;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i3 = this.f12221c;
        Object[] objArr = this.f12220b;
        if (i3 == objArr.length) {
            this.f12220b = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f12220b;
        int i10 = this.f12221c;
        this.f12221c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i3) {
        if (i3 < 0 || i3 >= this.f12221c) {
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
            u2.append(this.f12221c);
            throw new IndexOutOfBoundsException(u2.toString());
        }
    }

    @Override // com.google.protobuf.P
    public final P e(int i3) {
        if (i3 >= this.f12221c) {
            return new s0(Arrays.copyOf(this.f12220b, i3), this.f12221c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        b(i3);
        return this.f12220b[i3];
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        a();
        b(i3);
        Object[] objArr = this.f12220b;
        Object obj = objArr[i3];
        if (i3 < this.f12221c - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f12221c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        a();
        b(i3);
        Object[] objArr = this.f12220b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12221c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        a();
        if (i3 >= 0 && i3 <= (i10 = this.f12221c)) {
            Object[] objArr = this.f12220b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i10 - i3);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(this.f12220b, i3, objArr2, i3 + 1, this.f12221c - i3);
                this.f12220b = objArr2;
            }
            this.f12220b[i3] = obj;
            this.f12221c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(11698), StubApp.getString2(11699));
        u2.append(this.f12221c);
        throw new IndexOutOfBoundsException(u2.toString());
    }
}
