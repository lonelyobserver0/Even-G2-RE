package com.fasterxml.jackson.core.util;

import com.stub.StubApp;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ByteArrayBuilder extends OutputStream {
    public static final byte[] NO_BYTES = new byte[0];
    private final BufferRecycler _bufferRecycler;
    private byte[] _currBlock;
    private int _currBlockPtr;
    private final LinkedList<byte[]> _pastBlocks;
    private int _pastLen;

    public ByteArrayBuilder() {
        this((BufferRecycler) null);
    }

    private void _allocMore() {
        int length = this._pastLen + this._currBlock.length;
        if (length < 0) {
            throw new IllegalStateException(StubApp.getString2(10492));
        }
        this._pastLen = length;
        int max = Math.max(length >> 1, 1000);
        if (max > 131072) {
            max = 131072;
        }
        this._pastBlocks.add(this._currBlock);
        this._currBlock = new byte[max];
        this._currBlockPtr = 0;
    }

    public static ByteArrayBuilder fromInitial(byte[] bArr, int i3) {
        return new ByteArrayBuilder(null, bArr, i3);
    }

    public void append(int i3) {
        if (this._currBlockPtr >= this._currBlock.length) {
            _allocMore();
        }
        byte[] bArr = this._currBlock;
        int i10 = this._currBlockPtr;
        this._currBlockPtr = i10 + 1;
        bArr[i10] = (byte) i3;
    }

    public void appendThreeBytes(int i3) {
        int i10 = this._currBlockPtr;
        int i11 = i10 + 2;
        byte[] bArr = this._currBlock;
        if (i11 >= bArr.length) {
            append(i3 >> 16);
            append(i3 >> 8);
            append(i3);
            return;
        }
        int i12 = i10 + 1;
        this._currBlockPtr = i12;
        bArr[i10] = (byte) (i3 >> 16);
        int i13 = i10 + 2;
        this._currBlockPtr = i13;
        bArr[i12] = (byte) (i3 >> 8);
        this._currBlockPtr = i10 + 3;
        bArr[i13] = (byte) i3;
    }

    public void appendTwoBytes(int i3) {
        int i10 = this._currBlockPtr;
        int i11 = i10 + 1;
        byte[] bArr = this._currBlock;
        if (i11 >= bArr.length) {
            append(i3 >> 8);
            append(i3);
            return;
        }
        int i12 = i10 + 1;
        this._currBlockPtr = i12;
        bArr[i10] = (byte) (i3 >> 8);
        this._currBlockPtr = i10 + 2;
        bArr[i12] = (byte) i3;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public byte[] completeAndCoalesce(int i3) {
        this._currBlockPtr = i3;
        return toByteArray();
    }

    public byte[] finishCurrentSegment() {
        _allocMore();
        return this._currBlock;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public byte[] getCurrentSegment() {
        return this._currBlock;
    }

    public int getCurrentSegmentLength() {
        return this._currBlockPtr;
    }

    public void release() {
        byte[] bArr;
        reset();
        BufferRecycler bufferRecycler = this._bufferRecycler;
        if (bufferRecycler == null || (bArr = this._currBlock) == null) {
            return;
        }
        bufferRecycler.releaseByteBuffer(2, bArr);
        this._currBlock = null;
    }

    public void reset() {
        this._pastLen = 0;
        this._currBlockPtr = 0;
        if (this._pastBlocks.isEmpty()) {
            return;
        }
        this._pastBlocks.clear();
    }

    public void setCurrentSegmentLength(int i3) {
        this._currBlockPtr = i3;
    }

    public byte[] toByteArray() {
        int i3 = this._pastLen + this._currBlockPtr;
        if (i3 == 0) {
            return NO_BYTES;
        }
        byte[] bArr = new byte[i3];
        Iterator<byte[]> it = this._pastBlocks.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i10, length);
            i10 += length;
        }
        System.arraycopy(this._currBlock, 0, bArr, i10, this._currBlockPtr);
        int i11 = i10 + this._currBlockPtr;
        if (i11 != i3) {
            throw new RuntimeException(AbstractC1482f.e(i3, StubApp.getString2(10493), i11, StubApp.getString2(10494), StubApp.getString2(693)));
        }
        if (!this._pastBlocks.isEmpty()) {
            reset();
        }
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler) {
        this(bufferRecycler, 500);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) {
        while (true) {
            int min = Math.min(this._currBlock.length - this._currBlockPtr, i10);
            if (min > 0) {
                System.arraycopy(bArr, i3, this._currBlock, this._currBlockPtr, min);
                i3 += min;
                this._currBlockPtr += min;
                i10 -= min;
            }
            if (i10 <= 0) {
                return;
            } else {
                _allocMore();
            }
        }
    }

    public ByteArrayBuilder(int i3) {
        this(null, i3);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i3) {
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = bufferRecycler;
        this._currBlock = bufferRecycler == null ? new byte[i3 > 131072 ? 131072 : i3] : bufferRecycler.allocByteBuffer(2);
    }

    @Override // java.io.OutputStream
    public void write(int i3) {
        append(i3);
    }

    private ByteArrayBuilder(BufferRecycler bufferRecycler, byte[] bArr, int i3) {
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = null;
        this._currBlock = bArr;
        this._currBlockPtr = i3;
    }
}
