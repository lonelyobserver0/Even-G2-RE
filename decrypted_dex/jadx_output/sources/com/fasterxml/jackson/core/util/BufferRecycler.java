package com.fasterxml.jackson.core.util;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bouncycastle.asn1.x509.DisplayText;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BufferRecycler {
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, 2000, 2000};
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE};
    protected final AtomicReferenceArray<byte[]> _byteBuffers;
    protected final AtomicReferenceArray<char[]> _charBuffers;

    public BufferRecycler() {
        this(4, 4);
    }

    public final byte[] allocByteBuffer(int i3) {
        return allocByteBuffer(i3, 0);
    }

    public final char[] allocCharBuffer(int i3) {
        return allocCharBuffer(i3, 0);
    }

    public byte[] balloc(int i3) {
        return new byte[i3];
    }

    public int byteBufferLength(int i3) {
        return BYTE_BUFFER_LENGTHS[i3];
    }

    public char[] calloc(int i3) {
        return new char[i3];
    }

    public int charBufferLength(int i3) {
        return CHAR_BUFFER_LENGTHS[i3];
    }

    public void releaseByteBuffer(int i3, byte[] bArr) {
        this._byteBuffers.set(i3, bArr);
    }

    public void releaseCharBuffer(int i3, char[] cArr) {
        this._charBuffers.set(i3, cArr);
    }

    public BufferRecycler(int i3, int i10) {
        this._byteBuffers = new AtomicReferenceArray<>(i3);
        this._charBuffers = new AtomicReferenceArray<>(i10);
    }

    public byte[] allocByteBuffer(int i3, int i10) {
        int byteBufferLength = byteBufferLength(i3);
        if (i10 < byteBufferLength) {
            i10 = byteBufferLength;
        }
        byte[] andSet = this._byteBuffers.getAndSet(i3, null);
        return (andSet == null || andSet.length < i10) ? balloc(i10) : andSet;
    }

    public char[] allocCharBuffer(int i3, int i10) {
        int charBufferLength = charBufferLength(i3);
        if (i10 < charBufferLength) {
            i10 = charBufferLength;
        }
        char[] andSet = this._charBuffers.getAndSet(i3, null);
        return (andSet == null || andSet.length < i10) ? calloc(i10) : andSet;
    }
}
