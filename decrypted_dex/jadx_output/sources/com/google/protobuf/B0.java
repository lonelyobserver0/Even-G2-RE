package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B0 extends AbstractList implements W, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final V f12080a;

    public B0(V v2) {
        this.f12080a = v2;
    }

    @Override // com.google.protobuf.W
    public final Object C(int i3) {
        return this.f12080a.f12133b.get(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        return (String) this.f12080a.get(i3);
    }

    @Override // com.google.protobuf.W
    public final void h(AbstractC0733j abstractC0733j) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        A0 a02 = new A0();
        a02.f12079a = this.f12080a.iterator();
        return a02;
    }

    @Override // com.google.protobuf.W
    public final List k() {
        return Collections.unmodifiableList(this.f12080a.f12133b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        z0 z0Var = new z0();
        z0Var.f12252a = this.f12080a.listIterator(i3);
        return z0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12080a.f12133b.size();
    }

    @Override // com.google.protobuf.W
    public final W v() {
        return this;
    }
}
