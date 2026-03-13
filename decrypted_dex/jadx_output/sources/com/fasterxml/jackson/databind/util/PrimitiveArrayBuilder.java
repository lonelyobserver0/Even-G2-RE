package com.fasterxml.jackson.databind.util;

import Xa.h;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class PrimitiveArrayBuilder<T> {
    protected Node<T> _bufferHead;
    protected Node<T> _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    public static final class Node<T> {
        final T _data;
        final int _dataLength;
        Node<T> _next;

        public Node(T t3, int i3) {
            this._data = t3;
            this._dataLength = i3;
        }

        public int copyData(T t3, int i3) {
            System.arraycopy(this._data, 0, t3, i3, this._dataLength);
            return i3 + this._dataLength;
        }

        public T getData() {
            return this._data;
        }

        public void linkNext(Node<T> node) {
            if (this._next != null) {
                throw new IllegalStateException();
            }
            this._next = node;
        }

        public Node<T> next() {
            return this._next;
        }
    }

    public abstract T _constructArray(int i3);

    public void _reset() {
        Node<T> node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node.getData();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t3, int i3) {
        Node<T> node = new Node<>(t3, i3);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            this._bufferTail.linkNext(node);
            this._bufferTail = node;
        }
        this._bufferedEntryCount += i3;
        return _constructArray(i3 < 16384 ? i3 + i3 : i3 + (i3 >> 2));
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t3, int i3) {
        int i10 = this._bufferedEntryCount + i3;
        T _constructArray = _constructArray(i10);
        int i11 = 0;
        for (Node<T> node = this._bufferHead; node != null; node = node.next()) {
            i11 = node.copyData(_constructArray, i11);
        }
        System.arraycopy(t3, 0, _constructArray, i11, i3);
        int i12 = i11 + i3;
        if (i12 == i10) {
            return _constructArray;
        }
        throw new IllegalStateException(h.o(StubApp.getString2(11109), i10, i12, StubApp.getString2(11110)));
    }

    public T resetAndStart() {
        _reset();
        T t3 = this._freeBuffer;
        return t3 == null ? _constructArray(12) : t3;
    }
}
