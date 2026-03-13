package com.google.protobuf;

import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f12079a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12079a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f12079a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
