package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.UByte;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    protected char[] _copyBuffer;
    protected SerializableString _currentEscape;
    protected char[] _entityBuffer;
    protected char[] _outputBuffer;
    protected int _outputEnd;
    protected int _outputHead;
    protected int _outputTail;
    protected char _quoteChar;
    protected final Writer _writer;
    protected static final char[] HEX_CHARS_UPPER = CharTypes.copyHexChars(true);
    protected static final char[] HEX_CHARS_LOWER = CharTypes.copyHexChars(false);

    public WriterBasedJsonGenerator(IOContext iOContext, int i3, ObjectCodec objectCodec, Writer writer, char c10) {
        super(iOContext, i3, objectCodec);
        this._writer = writer;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._outputBuffer = allocConcatBuffer;
        this._outputEnd = allocConcatBuffer.length;
        this._quoteChar = c10;
        if (c10 != '\"') {
            this._outputEscapes = CharTypes.get7BitOutputEscapes(c10);
        }
    }

    private char[] _allocateEntityBuffer() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this._entityBuffer = cArr;
        return cArr;
    }

    private void _appendCharacterEscape(char c10, int i3) throws IOException, JsonGenerationException {
        int i10;
        if (i3 >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i11 = this._outputTail;
            int i12 = i11 + 1;
            this._outputTail = i12;
            cArr[i11] = '\\';
            this._outputTail = i11 + 2;
            cArr[i12] = (char) i3;
            return;
        }
        if (i3 == -2) {
            this._currentEscape.getClass();
            String value = this._currentEscape.getValue();
            this._currentEscape = null;
            int length = value.length();
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
                if (length > this._outputEnd) {
                    this._writer.write(value);
                    return;
                }
            }
            value.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i13 = this._outputTail;
        char[] cArr2 = this._outputBuffer;
        char[] hexChars = getHexChars();
        cArr2[i13] = '\\';
        int i14 = i13 + 2;
        cArr2[i13 + 1] = 'u';
        if (c10 > 255) {
            int i15 = c10 >> '\b';
            int i16 = i13 + 3;
            cArr2[i14] = hexChars[(i15 & 255) >> 4];
            i10 = i13 + 4;
            cArr2[i16] = hexChars[i15 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i17 = i13 + 3;
            cArr2[i14] = '0';
            i10 = i13 + 4;
            cArr2[i17] = '0';
        }
        cArr2[i10] = hexChars[c10 >> 4];
        cArr2[i10 + 1] = hexChars[c10 & 15];
        this._outputTail = i10 + 2;
    }

    private void _prependOrWriteCharacterEscape(char c10, int i3) throws IOException, JsonGenerationException {
        int i10;
        if (i3 >= 0) {
            int i11 = this._outputTail;
            if (i11 >= 2) {
                int i12 = i11 - 2;
                this._outputHead = i12;
                char[] cArr = this._outputBuffer;
                cArr[i12] = '\\';
                cArr[i11 - 1] = (char) i3;
                return;
            }
            char[] cArr2 = this._entityBuffer;
            if (cArr2 == null) {
                cArr2 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            cArr2[1] = (char) i3;
            this._writer.write(cArr2, 0, 2);
            return;
        }
        if (i3 == -2) {
            this._currentEscape.getClass();
            String value = this._currentEscape.getValue();
            this._currentEscape = null;
            int length = value.length();
            int i13 = this._outputTail;
            if (i13 < length) {
                this._outputHead = i13;
                this._writer.write(value);
                return;
            } else {
                int i14 = i13 - length;
                this._outputHead = i14;
                value.getChars(0, length, this._outputBuffer, i14);
                return;
            }
        }
        char[] hexChars = getHexChars();
        int i15 = this._outputTail;
        if (i15 < 6) {
            char[] cArr3 = this._entityBuffer;
            if (cArr3 == null) {
                cArr3 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c10 <= 255) {
                cArr3[6] = hexChars[c10 >> 4];
                cArr3[7] = hexChars[c10 & 15];
                this._writer.write(cArr3, 2, 6);
                return;
            } else {
                int i16 = c10 >> '\b';
                cArr3[10] = hexChars[(i16 & 255) >> 4];
                cArr3[11] = hexChars[i16 & 15];
                cArr3[12] = hexChars[(c10 & 255) >> 4];
                cArr3[13] = hexChars[c10 & 15];
                this._writer.write(cArr3, 8, 6);
                return;
            }
        }
        char[] cArr4 = this._outputBuffer;
        int i17 = i15 - 6;
        this._outputHead = i17;
        cArr4[i17] = '\\';
        cArr4[i15 - 5] = 'u';
        if (c10 > 255) {
            int i18 = c10 >> '\b';
            cArr4[i15 - 4] = hexChars[(i18 & 255) >> 4];
            i10 = i15 - 3;
            cArr4[i10] = hexChars[i18 & 15];
            c10 = (char) (c10 & 255);
        } else {
            cArr4[i15 - 4] = '0';
            i10 = i15 - 3;
            cArr4[i10] = '0';
        }
        cArr4[i10 + 1] = hexChars[c10 >> 4];
        cArr4[i10 + 2] = hexChars[c10 & 15];
    }

    private int _readMore(InputStream inputStream, byte[] bArr, int i3, int i10, int i11) throws IOException {
        int read;
        int i12 = 0;
        while (i3 < i10) {
            bArr[i12] = bArr[i3];
            i12++;
            i3++;
        }
        int min = Math.min(i11, bArr.length);
        do {
            int i13 = min - i12;
            if (i13 == 0 || (read = inputStream.read(bArr, i12, i13)) < 0) {
                return i12;
            }
            i12 += read;
        } while (i12 < 3);
        return i12;
    }

    private final void _writeFieldNameTail(SerializableString serializableString) throws IOException {
        char[] asQuotedChars = serializableString.asQuotedChars();
        writeRaw(asQuotedChars, 0, asQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
    }

    private void _writeLongString(String str) throws IOException {
        _flushBuffer();
        int length = str.length();
        int i3 = 0;
        while (true) {
            int i10 = this._outputEnd;
            if (i3 + i10 > length) {
                i10 = length - i3;
            }
            int i11 = i3 + i10;
            str.getChars(i3, i11, this._outputBuffer, 0);
            int i12 = this._maximumNonEscapedChar;
            if (i12 != 0) {
                _writeSegmentASCII(i10, i12);
            } else {
                _writeSegment(i10);
            }
            if (i11 >= length) {
                return;
            } else {
                i3 = i11;
            }
        }
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i3] = 'n';
        cArr[i3 + 1] = 'u';
        cArr[i3 + 2] = 'l';
        cArr[i3 + 3] = 'l';
        this._outputTail = i3 + 4;
    }

    private void _writeQuotedInt(int i3) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        cArr[i10] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(i3, cArr, i11);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        cArr2[outputInt] = this._quoteChar;
    }

    private void _writeQuotedLong(long j) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i10 = i3 + 1;
        this._outputTail = i10;
        cArr[i3] = this._quoteChar;
        int outputLong = NumberOutput.outputLong(j, cArr, i10);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputLong + 1;
        cArr2[outputLong] = this._quoteChar;
    }

    private void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr2[i10] = this._quoteChar;
    }

    private void _writeQuotedShort(short s10) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i10 = i3 + 1;
        this._outputTail = i10;
        cArr[i3] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(s10, cArr, i10);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        cArr2[outputInt] = this._quoteChar;
    }

    private void _writeSegment(int i3) throws IOException {
        char[] cArr;
        char c10;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i3) {
            do {
                cArr = this._outputBuffer;
                c10 = cArr[i10];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i10++;
                }
            } while (i10 < i3);
            int i12 = i10 - i11;
            if (i12 > 0) {
                this._writer.write(cArr, i11, i12);
                if (i10 >= i3) {
                    return;
                }
            }
            int i13 = i10 + 1;
            i11 = _prependOrWriteCharacterEscape(this._outputBuffer, i13, i3, c10, iArr[c10]);
            i10 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[LOOP:1: B:3:0x000e->B:21:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[EDGE_INSN: B:9:0x0018->B:10:0x0018 BREAK  A[LOOP:1: B:3:0x000e->B:21:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _writeSegmentASCII(int r13, int r14) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r12 = this;
            int[] r0 = r12._outputEscapes
            int r1 = r0.length
            int r2 = r14 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            if (r2 >= r13) goto L3c
        Le:
            char[] r5 = r12._outputBuffer
            char r10 = r5[r2]
            if (r10 >= r1) goto L1a
            r4 = r0[r10]
            if (r4 == 0) goto L1e
        L18:
            r11 = r4
            goto L23
        L1a:
            if (r10 <= r14) goto L1e
            r4 = -1
            goto L18
        L1e:
            int r2 = r2 + 1
            if (r2 < r13) goto Le
            goto L18
        L23:
            int r4 = r2 - r3
            if (r4 <= 0) goto L2f
            java.io.Writer r6 = r12._writer
            r6.write(r5, r3, r4)
            if (r2 < r13) goto L2f
            goto L3c
        L2f:
            int r8 = r2 + 1
            char[] r7 = r12._outputBuffer
            r6 = r12
            r9 = r13
            int r3 = r6._prependOrWriteCharacterEscape(r7, r8, r9, r10, r11)
            r2 = r8
            r4 = r11
            goto Lc
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegmentASCII(int, int):void");
    }

    private void _writeString(String str) throws IOException {
        int length = str.length();
        int i3 = this._outputEnd;
        if (length > i3) {
            _writeLongString(str);
            return;
        }
        if (this._outputTail + length > i3) {
            _flushBuffer();
        }
        str.getChars(0, length, this._outputBuffer, this._outputTail);
        int i10 = this._maximumNonEscapedChar;
        if (i10 != 0) {
            _writeStringASCII(length, i10);
        } else {
            _writeString2(length);
        }
    }

    private void _writeString2(SerializableString serializableString) throws IOException {
        char[] asQuotedChars = serializableString.asQuotedChars();
        int length = asQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(asQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(asQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _writeStringASCII(int r9, int r10) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r8 = this;
            int r0 = r8._outputTail
            int r0 = r0 + r9
            int[] r9 = r8._outputEscapes
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        Lc:
            int r2 = r8._outputTail
            if (r2 >= r0) goto L3a
        L10:
            char[] r2 = r8._outputBuffer
            int r3 = r8._outputTail
            char r4 = r2[r3]
            if (r4 >= r1) goto L1d
            r5 = r9[r4]
            if (r5 == 0) goto L34
            goto L20
        L1d:
            if (r4 <= r10) goto L34
            r5 = -1
        L20:
            int r6 = r8._outputHead
            int r3 = r3 - r6
            if (r3 <= 0) goto L2a
            java.io.Writer r7 = r8._writer
            r7.write(r2, r6, r3)
        L2a:
            int r2 = r8._outputTail
            int r2 = r2 + 1
            r8._outputTail = r2
            r8._prependOrWriteCharacterEscape(r4, r5)
            goto Lc
        L34:
            int r3 = r3 + 1
            r8._outputTail = r3
            if (r3 < r0) goto L10
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(int, int):void");
    }

    private char[] getHexChars() {
        return this._cfgWriteHexUppercase ? HEX_CHARS_UPPER : HEX_CHARS_LOWER;
    }

    private void writeRawLong(String str) throws IOException {
        int i3 = this._outputEnd;
        int i10 = this._outputTail;
        int i11 = i3 - i10;
        str.getChars(0, i11, this._outputBuffer, i10);
        this._outputTail += i11;
        _flushBuffer();
        int length = str.length() - i11;
        while (true) {
            int i12 = this._outputEnd;
            if (length <= i12) {
                str.getChars(i11, i11 + length, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            } else {
                int i13 = i11 + i12;
                str.getChars(i11, i13, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = i12;
                _flushBuffer();
                length -= i12;
                i11 = i13;
            }
        }
    }

    public void _flushBuffer() throws IOException {
        int i3 = this._outputTail;
        int i10 = this._outputHead;
        int i11 = i3 - i10;
        if (i11 > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i10, i11);
        }
    }

    public void _releaseBuffers() {
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
        char[] cArr2 = this._copyBuffer;
        if (cArr2 != null) {
            this._copyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr2);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void _verifyValueWrite(String str) throws IOException {
        char c10;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            c10 = ',';
        } else {
            if (writeValue != 2) {
                if (writeValue != 3) {
                    if (writeValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                } else {
                    SerializableString serializableString = this._rootValueSeparator;
                    if (serializableString != null) {
                        writeRaw(serializableString.getValue());
                        return;
                    }
                    return;
                }
            }
            c10 = ':';
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = c10;
    }

    public final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i3, int i10) throws IOException, JsonGenerationException {
        int encodeBase64Chunk;
        int i11 = i10 - 3;
        int i12 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0: while (true) {
            int i13 = maxLineLength >> 2;
            while (i3 <= i11) {
                if (this._outputTail > i12) {
                    _flushBuffer();
                }
                int i14 = i3 + 2;
                int i15 = ((bArr[i3 + 1] & UByte.MAX_VALUE) | (bArr[i3] << 8)) << 8;
                i3 += 3;
                encodeBase64Chunk = base64Variant.encodeBase64Chunk(i15 | (bArr[i14] & UByte.MAX_VALUE), this._outputBuffer, this._outputTail);
                this._outputTail = encodeBase64Chunk;
                i13--;
                if (i13 <= 0) {
                    break;
                }
            }
            char[] cArr = this._outputBuffer;
            int i16 = encodeBase64Chunk + 1;
            this._outputTail = i16;
            cArr[encodeBase64Chunk] = '\\';
            this._outputTail = encodeBase64Chunk + 2;
            cArr[i16] = 'n';
            maxLineLength = base64Variant.getMaxLineLength();
        }
        int i17 = i10 - i3;
        if (i17 > 0) {
            if (this._outputTail > i12) {
                _flushBuffer();
            }
            int i18 = i3 + 1;
            int i19 = bArr[i3] << Tnaf.POW_2_WIDTH;
            if (i17 == 2) {
                i19 |= (bArr[i18] & UByte.MAX_VALUE) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i19, i17, this._outputBuffer, this._outputTail);
        }
    }

    public final void _writeFieldName(String str, boolean z2) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z2);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z2) {
            char[] cArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            cArr[i3] = ',';
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr2[i10] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr3[i11] = this._quoteChar;
    }

    public final void _writePPFieldName(String str, boolean z2) throws IOException {
        if (z2) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr2[i10] = this._quoteChar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            super.close()
            char[] r0 = r2._outputBuffer     // Catch: java.io.IOException -> L1d
            if (r0 == 0) goto L29
            com.fasterxml.jackson.core.JsonGenerator$Feature r0 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT     // Catch: java.io.IOException -> L1d
            boolean r0 = r2.isEnabled(r0)     // Catch: java.io.IOException -> L1d
            if (r0 == 0) goto L29
        Lf:
            com.fasterxml.jackson.core.JsonStreamContext r0 = r2.getOutputContext()     // Catch: java.io.IOException -> L1d
            boolean r1 = r0.inArray()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L1f
            r2.writeEndArray()     // Catch: java.io.IOException -> L1d
            goto Lf
        L1d:
            r0 = move-exception
            goto L2d
        L1f:
            boolean r0 = r0.inObject()     // Catch: java.io.IOException -> L1d
            if (r0 == 0) goto L29
            r2.writeEndObject()     // Catch: java.io.IOException -> L1d
            goto Lf
        L29:
            r2._flushBuffer()     // Catch: java.io.IOException -> L1d
            r0 = 0
        L2d:
            r1 = 0
            r2._outputHead = r1
            r2._outputTail = r1
            java.io.Writer r1 = r2._writer
            if (r1 == 0) goto L65
            com.fasterxml.jackson.core.io.IOContext r1 = r2._ioContext     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            boolean r1 = r1.isResourceManaged()     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            if (r1 != 0) goto L59
            com.fasterxml.jackson.core.JsonGenerator$Feature r1 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            boolean r1 = r2.isEnabled(r1)     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            if (r1 == 0) goto L47
            goto L59
        L47:
            com.fasterxml.jackson.core.JsonGenerator$Feature r1 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            boolean r1 = r2.isEnabled(r1)     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            if (r1 == 0) goto L65
            java.io.Writer r1 = r2._writer     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            r1.flush()     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            goto L65
        L55:
            r1 = move-exception
            goto L5f
        L57:
            r1 = move-exception
            goto L5f
        L59:
            java.io.Writer r1 = r2._writer     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            r1.close()     // Catch: java.lang.RuntimeException -> L55 java.io.IOException -> L57
            goto L65
        L5f:
            if (r0 == 0) goto L64
            r1.addSuppressed(r0)
        L64:
            throw r1
        L65:
            r2._releaseBuffers()
            if (r0 != 0) goto L6b
            return
        L6b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.close():void");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._writer == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._writer.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i3, int i10) throws IOException, JsonGenerationException {
        _checkRangeBoundsForByteArray(bArr, i3, i10);
        _verifyValueWrite(StubApp.getString2(10458));
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr[i11] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i3, i10 + i3);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr2[i12] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z2) throws IOException {
        int i3;
        _verifyValueWrite(StubApp.getString2(10460));
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i10 = this._outputTail;
        char[] cArr = this._outputBuffer;
        if (z2) {
            cArr[i10] = 't';
            cArr[i10 + 1] = 'r';
            cArr[i10 + 2] = 'u';
            i3 = i10 + 3;
            cArr[i3] = 'e';
        } else {
            cArr[i10] = 'f';
            cArr[i10 + 1] = 'a';
            cArr[i10 + 2] = 'l';
            cArr[i10 + 3] = 's';
            i3 = i10 + 4;
            cArr[i3] = 'e';
        }
        this._outputTail = i3 + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            _reportError(StubApp.getString2(10461) + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            cArr[i3] = ']';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            _reportError(StubApp.getString2(10462) + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            cArr[i3] = '}';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError(StubApp.getString2(10456));
        }
        _writeFieldName(str, writeFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite(StubApp.getString2(10463));
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s10) throws IOException {
        _verifyValueWrite(StubApp.getString2(10464));
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s10);
            return;
        }
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(s10, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        int i3 = this._outputEnd - this._outputTail;
        if (i3 == 0) {
            _flushBuffer();
            i3 = this._outputEnd - this._outputTail;
        }
        if (i3 < length) {
            writeRawLong(str);
        } else {
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray() throws IOException {
        _verifyValueWrite(StubApp.getString2(10466));
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject() throws IOException {
        _verifyValueWrite(StubApp.getString2(10467));
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite(StubApp.getString2(10468));
        if (str == null) {
            _writeNull();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr2[i10] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError(StubApp.getString2(10456));
        }
        _writeFieldName(serializableString, writeFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i3) throws IOException {
        _verifyValueWrite(StubApp.getString2(10464));
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i3);
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i3, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        int appendUnquoted = serializableString.appendUnquoted(this._outputBuffer, this._outputTail);
        if (appendUnquoted < 0) {
            writeRaw(serializableString.getValue());
        } else {
            this._outputTail += appendUnquoted;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj) throws IOException {
        _verifyValueWrite(StubApp.getString2(10466));
        this._writeContext = this._writeContext.createChildArrayContext(obj);
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite(StubApp.getString2(10467));
        this._writeContext = this._writeContext.createChildObjectContext(obj);
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = '{';
    }

    private void _writeString(char[] cArr, int i3, int i10) throws IOException {
        int i11 = this._maximumNonEscapedChar;
        if (i11 != 0) {
            _writeStringASCII(cArr, i3, i10, i11);
            return;
        }
        int i12 = i10 + i3;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (i3 < i12) {
            int i13 = i3;
            do {
                char c10 = cArr[i13];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i13++;
                }
            } while (i13 < i12);
            int i14 = i13 - i3;
            if (i14 < 32) {
                if (this._outputTail + i14 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i14 > 0) {
                    System.arraycopy(cArr, i3, this._outputBuffer, this._outputTail, i14);
                    this._outputTail += i14;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i3, i14);
            }
            if (i13 >= i12) {
                return;
            }
            i3 = i13 + 1;
            char c11 = cArr[i13];
            _appendCharacterEscape(c11, iArr[c11]);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i3) throws IOException, JsonGenerationException {
        String string2 = StubApp.getString2(10457);
        _verifyValueWrite(StubApp.getString2(10458));
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            if (i3 < 0) {
                i3 = _writeBinary(base64Variant, inputStream, allocBase64Buffer);
            } else {
                int _writeBinary = _writeBinary(base64Variant, inputStream, allocBase64Buffer, i3);
                if (_writeBinary > 0) {
                    _reportError(string2 + _writeBinary + StubApp.getString2("10459") + i3 + StubApp.getString2("74"));
                }
            }
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr2 = this._outputBuffer;
            int i11 = this._outputTail;
            this._outputTail = i11 + 1;
            cArr2[i11] = this._quoteChar;
            return i3;
        } catch (Throwable th) {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i3, int i10) throws IOException {
        _verifyValueWrite(StubApp.getString2(10468));
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
        _writeString(cArr, i3, i10);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr3[i12] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i3, int i10) throws IOException {
        _checkRangeBoundsForCharArray(cArr, i3, i10);
        if (i10 < 32) {
            if (i10 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i3, this._outputBuffer, this._outputTail, i10);
            this._outputTail += i10;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i3, i10);
    }

    private void _writeString2(int i3) throws IOException {
        int i10;
        int i11 = this._outputTail + i3;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (this._outputTail < i11) {
            do {
                char[] cArr = this._outputBuffer;
                int i12 = this._outputTail;
                char c10 = cArr[i12];
                if (c10 < length && iArr[c10] != 0) {
                    int i13 = this._outputHead;
                    int i14 = i12 - i13;
                    if (i14 > 0) {
                        this._writer.write(cArr, i13, i14);
                    }
                    char[] cArr2 = this._outputBuffer;
                    int i15 = this._outputTail;
                    this._outputTail = i15 + 1;
                    char c11 = cArr2[i15];
                    _prependOrWriteCharacterEscape(c11, iArr[c11]);
                } else {
                    i10 = i12 + 1;
                    this._outputTail = i10;
                }
            } while (i10 < i11);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[EDGE_INSN: B:10:0x001f->B:11:0x001f BREAK  A[LOOP:1: B:4:0x000e->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:1: B:4:0x000e->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _writeStringASCII(char[] r9, int r10, int r11, int r12) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r8 = this;
            int r11 = r11 + r10
            int[] r0 = r8._outputEscapes
            int r1 = r0.length
            int r2 = r12 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
        Lb:
            if (r10 >= r11) goto L4f
            r3 = r10
        Le:
            char r4 = r9[r3]
            if (r4 >= r1) goto L17
            r2 = r0[r4]
            if (r2 == 0) goto L1b
            goto L1f
        L17:
            if (r4 <= r12) goto L1b
            r2 = -1
            goto L1f
        L1b:
            int r3 = r3 + 1
            if (r3 < r11) goto Le
        L1f:
            int r5 = r3 - r10
            r6 = 32
            if (r5 >= r6) goto L3e
            int r6 = r8._outputTail
            int r6 = r6 + r5
            int r7 = r8._outputEnd
            if (r6 <= r7) goto L2f
            r8._flushBuffer()
        L2f:
            if (r5 <= 0) goto L46
            char[] r6 = r8._outputBuffer
            int r7 = r8._outputTail
            java.lang.System.arraycopy(r9, r10, r6, r7, r5)
            int r10 = r8._outputTail
            int r10 = r10 + r5
            r8._outputTail = r10
            goto L46
        L3e:
            r8._flushBuffer()
            java.io.Writer r6 = r8._writer
            r6.write(r9, r10, r5)
        L46:
            if (r3 < r11) goto L49
            goto L4f
        L49:
            int r10 = r3 + 1
            r8._appendCharacterEscape(r4, r2)
            goto Lb
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(char[], int, int, int):void");
    }

    public final void _writePPFieldName(SerializableString serializableString, boolean z2) throws IOException {
        if (z2) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] asQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
        writeRaw(asQuotedChars, 0, asQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr2[i10] = this._quoteChar;
    }

    public final void _writeFieldName(SerializableString serializableString, boolean z2) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z2);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z2) {
            char[] cArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            cArr[i3] = ',';
        }
        if (this._cfgUnqNames) {
            char[] asQuotedChars = serializableString.asQuotedChars();
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        cArr2[i10] = this._quoteChar;
        int appendQuoted = serializableString.appendQuoted(cArr2, i11);
        if (appendQuoted < 0) {
            _writeFieldNameTail(serializableString);
            return;
        }
        int i12 = this._outputTail + appendQuoted;
        this._outputTail = i12;
        if (i12 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        cArr3[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j) throws IOException {
        _verifyValueWrite(StubApp.getString2(10464));
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj, int i3) throws IOException {
        _verifyValueWrite(StubApp.getString2(10466));
        this._writeContext = this._writeContext.createChildArrayContext(obj);
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj, int i3) throws IOException {
        writeStartObject(obj);
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i3) throws IOException, JsonGenerationException {
        int _readMore;
        int i10 = this._outputEnd - 6;
        int i11 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i12 = -3;
        int i13 = i3;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i13 <= 2) {
                break;
            }
            if (i14 > i12) {
                i15 = _readMore(inputStream, bArr, i14, i15, i13);
                if (i15 < 3) {
                    i14 = 0;
                    break;
                }
                i12 = i15 - 3;
                i14 = 0;
            }
            if (this._outputTail > i10) {
                _flushBuffer();
            }
            int i16 = i14 + 2;
            int i17 = ((bArr[i14 + 1] & UByte.MAX_VALUE) | (bArr[i14] << 8)) << 8;
            i14 += 3;
            i13 -= 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk(i17 | (bArr[i16] & UByte.MAX_VALUE), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i18 = encodeBase64Chunk + 1;
                this._outputTail = i18;
                cArr[encodeBase64Chunk] = '\\';
                this._outputTail = encodeBase64Chunk + 2;
                cArr[i18] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i13 <= 0 || (_readMore = _readMore(inputStream, bArr, i14, i15, i13)) <= 0) {
            return i13;
        }
        if (this._outputTail > i10) {
            _flushBuffer();
        }
        int i19 = bArr[0] << Tnaf.POW_2_WIDTH;
        if (1 < _readMore) {
            i19 |= (bArr[1] & UByte.MAX_VALUE) << 8;
        } else {
            i11 = 1;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i19, i11, this._outputBuffer, this._outputTail);
        return i13 - i11;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c10) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = c10;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite(StubApp.getString2(10468));
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i10 = i3 + 1;
        this._outputTail = i10;
        cArr[i3] = this._quoteChar;
        int appendQuoted = serializableString.appendQuoted(cArr, i10);
        if (appendQuoted < 0) {
            _writeString2(serializableString);
            return;
        }
        int i11 = this._outputTail + appendQuoted;
        this._outputTail = i11;
        if (i11 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr2[i12] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite(StubApp.getString2(10464));
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d8) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(d8) || !isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            _verifyValueWrite(StubApp.getString2(10464));
            writeRaw(NumberOutput.toString(d8, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            writeString(NumberOutput.toString(d8, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f10) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(f10) || !isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            _verifyValueWrite(StubApp.getString2(10464));
            writeRaw(NumberOutput.toString(f10, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            writeString(NumberOutput.toString(f10, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite(StubApp.getString2(10464));
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        byte[] bArr2 = bArr;
        int i3 = this._outputEnd - 6;
        int i10 = 2;
        int i11 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i12 > i11) {
                i13 = _readMore(inputStream, bArr2, i12, i13, bArr2.length);
                if (i13 < 3) {
                    break;
                }
                i11 = i13 - 3;
                i12 = 0;
            }
            if (this._outputTail > i3) {
                _flushBuffer();
            }
            int i15 = i12 + 2;
            int i16 = ((bArr[i12 + 1] & UByte.MAX_VALUE) | (bArr[i12] << 8)) << 8;
            i12 += 3;
            i14 += 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk(i16 | (bArr[i15] & UByte.MAX_VALUE), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i17 = encodeBase64Chunk + 1;
                this._outputTail = i17;
                cArr[encodeBase64Chunk] = '\\';
                this._outputTail = encodeBase64Chunk + 2;
                cArr[i17] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            bArr2 = bArr;
        }
        if (i13 <= 0) {
            return i14;
        }
        if (this._outputTail > i3) {
            _flushBuffer();
        }
        int i18 = bArr[0] << Tnaf.POW_2_WIDTH;
        if (1 < i13) {
            i18 |= (bArr[1] & UByte.MAX_VALUE) << 8;
        } else {
            i10 = 1;
        }
        int i19 = i14 + i10;
        this._outputTail = base64Variant.encodeBase64Partial(i18, i10, this._outputBuffer, this._outputTail);
        return i19;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _verifyValueWrite(StubApp.getString2(10464));
        if (str == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    private int _prependOrWriteCharacterEscape(char[] cArr, int i3, int i10, char c10, int i11) throws IOException, JsonGenerationException {
        int i12;
        if (i11 >= 0) {
            if (i3 > 1 && i3 < i10) {
                int i13 = i3 - 2;
                cArr[i13] = '\\';
                cArr[i3 - 1] = (char) i11;
                return i13;
            }
            char[] cArr2 = this._entityBuffer;
            if (cArr2 == null) {
                cArr2 = _allocateEntityBuffer();
            }
            cArr2[1] = (char) i11;
            this._writer.write(cArr2, 0, 2);
            return i3;
        }
        if (i11 != -2) {
            char[] hexChars = getHexChars();
            if (i3 > 5 && i3 < i10) {
                cArr[i3 - 6] = '\\';
                int i14 = i3 - 4;
                cArr[i3 - 5] = 'u';
                if (c10 > 255) {
                    int i15 = c10 >> '\b';
                    int i16 = i3 - 3;
                    cArr[i14] = hexChars[(i15 & 255) >> 4];
                    i12 = i3 - 2;
                    cArr[i16] = hexChars[i15 & 15];
                    c10 = (char) (c10 & 255);
                } else {
                    int i17 = i3 - 3;
                    cArr[i14] = '0';
                    i12 = i3 - 2;
                    cArr[i17] = '0';
                }
                cArr[i12] = hexChars[c10 >> 4];
                cArr[i12 + 1] = hexChars[c10 & 15];
                return i12 - 4;
            }
            char[] cArr3 = this._entityBuffer;
            if (cArr3 == null) {
                cArr3 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c10 > 255) {
                int i18 = c10 >> '\b';
                cArr3[10] = hexChars[(i18 & 255) >> 4];
                cArr3[11] = hexChars[i18 & 15];
                cArr3[12] = hexChars[(c10 & 255) >> 4];
                cArr3[13] = hexChars[c10 & 15];
                this._writer.write(cArr3, 8, 6);
                return i3;
            }
            cArr3[6] = hexChars[c10 >> 4];
            cArr3[7] = hexChars[c10 & 15];
            this._writer.write(cArr3, 2, 6);
            return i3;
        }
        this._currentEscape.getClass();
        String value = this._currentEscape.getValue();
        this._currentEscape = null;
        int length = value.length();
        if (i3 >= length && i3 < i10) {
            int i19 = i3 - length;
            value.getChars(0, length, cArr, i19);
            return i19;
        }
        this._writer.write(value);
        return i3;
    }
}
