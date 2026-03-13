package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TextBuffer {
    static final char[] NO_CHARS = new char[0];
    private final BufferRecycler _allocator;
    private char[] _currentSegment;
    private int _currentSize;
    private boolean _hasSegments;
    private char[] _inputBuffer;
    private int _inputLen;
    private int _inputStart;
    private char[] _resultArray;
    private String _resultString;
    private int _segmentSize;
    private ArrayList<char[]> _segments;

    public TextBuffer(BufferRecycler bufferRecycler) {
        this._allocator = bufferRecycler;
    }

    private char[] buf(int i3) {
        BufferRecycler bufferRecycler = this._allocator;
        return bufferRecycler != null ? bufferRecycler.allocCharBuffer(2, i3) : new char[Math.max(i3, 500)];
    }

    private char[] carr(int i3) {
        return new char[i3];
    }

    private void clearSegments() {
        this._hasSegments = false;
        this._segments.clear();
        this._segmentSize = 0;
        this._currentSize = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r3 > 65536) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void expand(int r3) {
        /*
            r2 = this;
            java.util.ArrayList<char[]> r3 = r2._segments
            if (r3 != 0) goto Lb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2._segments = r3
        Lb:
            char[] r3 = r2._currentSegment
            r0 = 1
            r2._hasSegments = r0
            java.util.ArrayList<char[]> r0 = r2._segments
            r0.add(r3)
            int r0 = r2._segmentSize
            int r1 = r3.length
            int r0 = r0 + r1
            r2._segmentSize = r0
            r0 = 0
            r2._currentSize = r0
            int r3 = r3.length
            int r0 = r3 >> 1
            int r3 = r3 + r0
            r0 = 500(0x1f4, float:7.0E-43)
            if (r3 >= r0) goto L28
        L26:
            r3 = r0
            goto L2d
        L28:
            r0 = 65536(0x10000, float:9.1835E-41)
            if (r3 <= r0) goto L2d
            goto L26
        L2d:
            char[] r3 = r2.carr(r3)
            r2._currentSegment = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.expand(int):void");
    }

    public static TextBuffer fromInitial(char[] cArr) {
        return new TextBuffer(null, cArr);
    }

    private char[] resultArray() {
        int i3;
        String str = this._resultString;
        if (str != null) {
            return str.toCharArray();
        }
        int i10 = this._inputStart;
        if (i10 >= 0) {
            int i11 = this._inputLen;
            return i11 < 1 ? NO_CHARS : i10 == 0 ? Arrays.copyOf(this._inputBuffer, i11) : Arrays.copyOfRange(this._inputBuffer, i10, i11 + i10);
        }
        int size = size();
        if (size < 1) {
            return NO_CHARS;
        }
        char[] carr = carr(size);
        ArrayList<char[]> arrayList = this._segments;
        if (arrayList != null) {
            int size2 = arrayList.size();
            i3 = 0;
            for (int i12 = 0; i12 < size2; i12++) {
                char[] cArr = this._segments.get(i12);
                int length = cArr.length;
                System.arraycopy(cArr, 0, carr, i3, length);
                i3 += length;
            }
        } else {
            i3 = 0;
        }
        System.arraycopy(this._currentSegment, 0, carr, i3, this._currentSize);
        return carr;
    }

    private void unshare(int i3) {
        int i10 = this._inputLen;
        this._inputLen = 0;
        char[] cArr = this._inputBuffer;
        this._inputBuffer = null;
        int i11 = this._inputStart;
        this._inputStart = -1;
        int i12 = i3 + i10;
        char[] cArr2 = this._currentSegment;
        if (cArr2 == null || i12 > cArr2.length) {
            this._currentSegment = buf(i12);
        }
        if (i10 > 0) {
            System.arraycopy(cArr, i11, this._currentSegment, 0, i10);
        }
        this._segmentSize = 0;
        this._currentSize = i10;
    }

    public void append(char c10) {
        if (this._inputStart >= 0) {
            unshare(16);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        if (this._currentSize >= cArr.length) {
            expand(1);
            cArr = this._currentSegment;
        }
        int i3 = this._currentSize;
        this._currentSize = i3 + 1;
        cArr[i3] = c10;
    }

    public char[] contentsAsArray() {
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        char[] resultArray = resultArray();
        this._resultArray = resultArray;
        return resultArray;
    }

    public double contentsAsDouble(boolean z2) throws NumberFormatException {
        return NumberInput.parseDouble(contentsAsString(), z2);
    }

    public float contentsAsFloat(boolean z2) throws NumberFormatException {
        return NumberInput.parseFloat(contentsAsString(), z2);
    }

    public int contentsAsInt(boolean z2) {
        char[] cArr;
        int i3 = this._inputStart;
        return (i3 < 0 || (cArr = this._inputBuffer) == null) ? z2 ? -NumberInput.parseInt(this._currentSegment, 1, this._currentSize - 1) : NumberInput.parseInt(this._currentSegment, 0, this._currentSize) : z2 ? -NumberInput.parseInt(cArr, i3 + 1, this._inputLen - 1) : NumberInput.parseInt(cArr, i3, this._inputLen);
    }

    public long contentsAsLong(boolean z2) {
        char[] cArr;
        int i3 = this._inputStart;
        return (i3 < 0 || (cArr = this._inputBuffer) == null) ? z2 ? -NumberInput.parseLong(this._currentSegment, 1, this._currentSize - 1) : NumberInput.parseLong(this._currentSegment, 0, this._currentSize) : z2 ? -NumberInput.parseLong(cArr, i3 + 1, this._inputLen - 1) : NumberInput.parseLong(cArr, i3, this._inputLen);
    }

    public String contentsAsString() {
        if (this._resultString == null) {
            char[] cArr = this._resultArray;
            if (cArr != null) {
                this._resultString = new String(cArr);
            } else {
                int i3 = this._inputStart;
                if (i3 >= 0) {
                    int i10 = this._inputLen;
                    if (i10 < 1) {
                        this._resultString = "";
                        return "";
                    }
                    this._resultString = new String(this._inputBuffer, i3, i10);
                } else {
                    int i11 = this._segmentSize;
                    int i12 = this._currentSize;
                    if (i11 == 0) {
                        this._resultString = i12 != 0 ? new String(this._currentSegment, 0, i12) : "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(i11 + i12);
                        ArrayList<char[]> arrayList = this._segments;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                char[] cArr2 = this._segments.get(i13);
                                sb2.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb2.append(this._currentSegment, 0, this._currentSize);
                        this._resultString = sb2.toString();
                    }
                }
            }
        }
        return this._resultString;
    }

    public char[] emptyAndGetCurrentSegment() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        char[] cArr = this._currentSegment;
        if (cArr != null) {
            return cArr;
        }
        char[] buf = buf(0);
        this._currentSegment = buf;
        return buf;
    }

    public char[] expandCurrentSegment() {
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i3 = (length >> 1) + length;
        if (i3 > 65536) {
            i3 = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i3);
        this._currentSegment = copyOf;
        return copyOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r0 > 65536) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] finishCurrentSegment() {
        /*
            r2 = this;
            java.util.ArrayList<char[]> r0 = r2._segments
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2._segments = r0
        Lb:
            r0 = 1
            r2._hasSegments = r0
            java.util.ArrayList<char[]> r0 = r2._segments
            char[] r1 = r2._currentSegment
            r0.add(r1)
            char[] r0 = r2._currentSegment
            int r0 = r0.length
            int r1 = r2._segmentSize
            int r1 = r1 + r0
            r2._segmentSize = r1
            r1 = 0
            r2._currentSize = r1
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L29
        L27:
            r0 = r1
            goto L2e
        L29:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L2e
            goto L27
        L2e:
            char[] r0 = r2.carr(r0)
            r2._currentSegment = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment():char[]");
    }

    public char[] getCurrentSegment() {
        if (this._inputStart >= 0) {
            unshare(1);
        } else {
            char[] cArr = this._currentSegment;
            if (cArr == null) {
                this._currentSegment = buf(0);
            } else if (this._currentSize >= cArr.length) {
                expand(1);
            }
        }
        return this._currentSegment;
    }

    public int getCurrentSegmentSize() {
        return this._currentSize;
    }

    public char[] getTextBuffer() {
        if (this._inputStart >= 0) {
            return this._inputBuffer;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        String str = this._resultString;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this._resultArray = charArray;
            return charArray;
        }
        if (this._hasSegments) {
            return contentsAsArray();
        }
        char[] cArr2 = this._currentSegment;
        return cArr2 == null ? NO_CHARS : cArr2;
    }

    public int getTextOffset() {
        int i3 = this._inputStart;
        if (i3 >= 0) {
            return i3;
        }
        return 0;
    }

    public boolean hasTextAsCharacters() {
        return this._inputStart >= 0 || this._resultArray != null || this._resultString == null;
    }

    public void releaseBuffers() {
        char[] cArr;
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        BufferRecycler bufferRecycler = this._allocator;
        if (bufferRecycler == null || (cArr = this._currentSegment) == null) {
            return;
        }
        this._currentSegment = null;
        bufferRecycler.releaseCharBuffer(2, cArr);
    }

    public void resetWithCopy(char[] cArr, int i3, int i10) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(i10);
        }
        this._segmentSize = 0;
        this._currentSize = 0;
        append(cArr, i3, i10);
    }

    public void resetWithEmpty() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWithShared(char[] cArr, int i3, int i10) {
        this._resultString = null;
        this._resultArray = null;
        this._inputBuffer = cArr;
        this._inputStart = i3;
        this._inputLen = i10;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWithString(String str) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = str;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        this._currentSize = 0;
    }

    public String setCurrentAndReturn(int i3) {
        this._currentSize = i3;
        if (this._segmentSize > 0) {
            return contentsAsString();
        }
        String str = i3 == 0 ? "" : new String(this._currentSegment, 0, i3);
        this._resultString = str;
        return str;
    }

    public void setCurrentLength(int i3) {
        this._currentSize = i3;
    }

    public int size() {
        if (this._inputStart >= 0) {
            return this._inputLen;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this._resultString;
        return str != null ? str.length() : this._segmentSize + this._currentSize;
    }

    public String toString() {
        return contentsAsString();
    }

    public TextBuffer(BufferRecycler bufferRecycler, char[] cArr) {
        this._allocator = bufferRecycler;
        this._currentSegment = cArr;
        this._currentSize = cArr.length;
        this._inputStart = -1;
    }

    public char[] expandCurrentSegment(int i3) {
        char[] cArr = this._currentSegment;
        if (cArr.length >= i3) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, i3);
        this._currentSegment = copyOf;
        return copyOf;
    }

    public void append(char[] cArr, int i3, int i10) {
        if (this._inputStart >= 0) {
            unshare(i10);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr2 = this._currentSegment;
        int length = cArr2.length;
        int i11 = this._currentSize;
        int i12 = length - i11;
        if (i12 >= i10) {
            System.arraycopy(cArr, i3, cArr2, i11, i10);
            this._currentSize += i10;
            return;
        }
        if (i12 > 0) {
            System.arraycopy(cArr, i3, cArr2, i11, i12);
            i3 += i12;
            i10 -= i12;
        }
        do {
            expand(i10);
            int min = Math.min(this._currentSegment.length, i10);
            System.arraycopy(cArr, i3, this._currentSegment, 0, min);
            this._currentSize += min;
            i3 += min;
            i10 -= min;
        } while (i10 > 0);
    }

    public void append(String str, int i3, int i10) {
        if (this._inputStart >= 0) {
            unshare(i10);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i11 = this._currentSize;
        int i12 = length - i11;
        if (i12 >= i10) {
            str.getChars(i3, i3 + i10, cArr, i11);
            this._currentSize += i10;
            return;
        }
        if (i12 > 0) {
            int i13 = i3 + i12;
            str.getChars(i3, i13, cArr, i11);
            i10 -= i12;
            i3 = i13;
        }
        while (true) {
            expand(i10);
            int min = Math.min(this._currentSegment.length, i10);
            int i14 = i3 + min;
            str.getChars(i3, i14, this._currentSegment, 0);
            this._currentSize += min;
            i10 -= min;
            if (i10 <= 0) {
                return;
            } else {
                i3 = i14;
            }
        }
    }
}
