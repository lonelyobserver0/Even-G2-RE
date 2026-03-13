package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ArrayIterator<T> implements Iterator<T>, Iterable<T> {
    private final T[] _a;
    private int _index = 0;

    public ArrayIterator(T[] tArr) {
        this._a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this._index < this._a.length;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public T next() {
        int i3 = this._index;
        T[] tArr = this._a;
        if (i3 >= tArr.length) {
            throw new NoSuchElementException();
        }
        this._index = i3 + 1;
        return tArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
