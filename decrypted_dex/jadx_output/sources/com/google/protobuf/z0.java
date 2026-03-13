package com.google.protobuf;

import java.util.ListIterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class z0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public ListIterator f12252a;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12252a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12252a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f12252a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12252a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f12252a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12252a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
