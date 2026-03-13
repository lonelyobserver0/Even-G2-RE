package com.fasterxml.jackson.databind.util;

import Xa.h;
import com.stub.StubApp;
import java.lang.reflect.Array;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ObjectBuffer {
    private Object[] _freeBuffer;
    private LinkedNode<Object[]> _head;
    private int _size;
    private LinkedNode<Object[]> _tail;

    public final void _copyTo(Object obj, int i3, Object[] objArr, int i10) {
        int i11 = 0;
        for (LinkedNode<Object[]> linkedNode = this._head; linkedNode != null; linkedNode = linkedNode.next()) {
            Object[] value = linkedNode.value();
            int length = value.length;
            System.arraycopy(value, 0, obj, i11, length);
            i11 += length;
        }
        System.arraycopy(objArr, 0, obj, i11, i10);
        int i12 = i11 + i10;
        if (i12 != i3) {
            throw new IllegalStateException(h.o(StubApp.getString2(11109), i3, i12, StubApp.getString2(11110)));
        }
    }

    public void _reset() {
        LinkedNode<Object[]> linkedNode = this._tail;
        if (linkedNode != null) {
            this._freeBuffer = linkedNode.value();
        }
        this._tail = null;
        this._head = null;
        this._size = 0;
    }

    public Object[] appendCompletedChunk(Object[] objArr) {
        LinkedNode<Object[]> linkedNode = new LinkedNode<>(objArr, null);
        if (this._head == null) {
            this._tail = linkedNode;
            this._head = linkedNode;
        } else {
            this._tail.linkNext(linkedNode);
            this._tail = linkedNode;
        }
        int length = objArr.length;
        this._size += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int bufferedSize() {
        return this._size;
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i3) {
        int i10 = this._size + i3;
        Object[] objArr2 = new Object[i10];
        _copyTo(objArr2, i10, objArr, i3);
        _reset();
        return objArr2;
    }

    public int initialCapacity() {
        Object[] objArr = this._freeBuffer;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] resetAndStart() {
        _reset();
        Object[] objArr = this._freeBuffer;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this._freeBuffer = objArr2;
        return objArr2;
    }

    public Object[] resetAndStart(Object[] objArr, int i3) {
        _reset();
        Object[] objArr2 = this._freeBuffer;
        if (objArr2 == null || objArr2.length < i3) {
            this._freeBuffer = new Object[Math.max(12, i3)];
        }
        System.arraycopy(objArr, 0, this._freeBuffer, 0, i3);
        return this._freeBuffer;
    }

    public <T> T[] completeAndClearBuffer(Object[] objArr, int i3, Class<T> cls) {
        int i10 = this._size + i3;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
        _copyTo(tArr, i10, objArr, i3);
        _reset();
        return tArr;
    }

    public void completeAndClearBuffer(Object[] objArr, int i3, List<Object> list) {
        int i10;
        LinkedNode<Object[]> linkedNode = this._head;
        while (true) {
            i10 = 0;
            if (linkedNode == null) {
                break;
            }
            Object[] value = linkedNode.value();
            int length = value.length;
            while (i10 < length) {
                list.add(value[i10]);
                i10++;
            }
            linkedNode = linkedNode.next();
        }
        while (i10 < i3) {
            list.add(objArr[i10]);
            i10++;
        }
        _reset();
    }
}
