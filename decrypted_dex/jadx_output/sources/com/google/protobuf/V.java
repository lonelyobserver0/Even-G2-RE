package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class V extends AbstractC0721d implements W, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List f12133b;

    static {
        new V();
    }

    public V(ArrayList arrayList) {
        super(true);
        this.f12133b = arrayList;
    }

    @Override // com.google.protobuf.W
    public final Object C(int i3) {
        return this.f12133b.get(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        a();
        this.f12133b.add(i3, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f12133b.size(), collection);
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f12133b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.P
    public final P e(int i3) {
        List list = this.f12133b;
        if (i3 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i3);
        arrayList.addAll(list);
        return new V(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        List list = this.f12133b;
        Object obj = list.get(i3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0733j) {
            AbstractC0733j abstractC0733j = (AbstractC0733j) obj;
            String n10 = abstractC0733j.n();
            if (abstractC0733j.g()) {
                list.set(i3, n10);
            }
            return n10;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, Q.f12119a);
        Tc.d dVar = J0.f12106a;
        if (J0.f12106a.n(0, bArr.length, bArr)) {
            list.set(i3, str);
        }
        return str;
    }

    @Override // com.google.protobuf.W
    public final void h(AbstractC0733j abstractC0733j) {
        a();
        this.f12133b.add(abstractC0733j);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.W
    public final List k() {
        return Collections.unmodifiableList(this.f12133b);
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        a();
        Object remove = this.f12133b.remove(i3);
        ((AbstractList) this).modCount++;
        return remove instanceof String ? (String) remove : remove instanceof AbstractC0733j ? ((AbstractC0733j) remove).n() : new String((byte[]) remove, Q.f12119a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        a();
        Object obj2 = this.f12133b.set(i3, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof AbstractC0733j ? ((AbstractC0733j) obj2).n() : new String((byte[]) obj2, Q.f12119a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12133b.size();
    }

    @Override // com.google.protobuf.W
    public final W v() {
        return this.f12144a ? new B0(this) : this;
    }

    public V() {
        super(false);
        this.f12133b = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractC0721d, java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        a();
        if (collection instanceof W) {
            collection = ((W) collection).k();
        }
        boolean addAll = this.f12133b.addAll(i3, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public V(int i3) {
        this(new ArrayList(i3));
    }
}
