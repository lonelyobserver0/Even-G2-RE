package com.fasterxml.jackson.core.json;

import E1.a;
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
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.UByte;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class UTF8JsonGenerator extends JsonGeneratorImpl {
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;
    protected byte _quoteChar;
    private static final byte[] HEX_BYTES_UPPER = CharTypes.copyHexBytes(true);
    private static final byte[] HEX_BYTES_LOWER = CharTypes.copyHexBytes(false);
    private static final byte[] NULL_BYTES = {110, 117, 108, 108};
    private static final byte[] TRUE_BYTES = {116, 114, 117, 101};
    private static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};

    public UTF8JsonGenerator(IOContext iOContext, int i3, ObjectCodec objectCodec, OutputStream outputStream, char c10) {
        super(iOContext, i3, objectCodec);
        this._outputStream = outputStream;
        this._quoteChar = (byte) c10;
        if (c10 != '\"') {
            this._outputEscapes = CharTypes.get7BitOutputEscapes(c10);
        }
        this._bufferRecyclable = true;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputBuffer = allocWriteEncodingBuffer;
        int length = allocWriteEncodingBuffer.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = allocConcatBuffer;
        this._charBufferLength = allocConcatBuffer.length;
        if (isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(CertificateBody.profileType);
        }
    }

    private final int _outputMultiByteChar(int i3, int i10) throws IOException {
        byte[] hexBytes = getHexBytes();
        byte[] bArr = this._outputBuffer;
        if (i3 < 55296 || i3 > 57343) {
            bArr[i10] = (byte) ((i3 >> 12) | BERTags.FLAGS);
            int i11 = i10 + 2;
            bArr[i10 + 1] = (byte) (((i3 >> 6) & 63) | 128);
            int i12 = i10 + 3;
            bArr[i11] = (byte) ((i3 & 63) | 128);
            return i12;
        }
        bArr[i10] = 92;
        bArr[i10 + 1] = 117;
        bArr[i10 + 2] = hexBytes[(i3 >> 12) & 15];
        bArr[i10 + 3] = hexBytes[(i3 >> 8) & 15];
        int i13 = i10 + 5;
        bArr[i10 + 4] = hexBytes[(i3 >> 4) & 15];
        int i14 = i10 + 6;
        bArr[i13] = hexBytes[i3 & 15];
        return i14;
    }

    private final int _outputRawMultiByteChar(int i3, char[] cArr, int i10, int i11) throws IOException {
        if (i3 >= 55296 && i3 <= 57343) {
            if (i10 >= i11 || cArr == null) {
                _reportError(String.format(StubApp.getString2(10455), Integer.valueOf(i3)));
            } else {
                _outputSurrogates(i3, cArr[i10]);
            }
            return i10 + 1;
        }
        byte[] bArr = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr[i12] = (byte) ((i3 >> 12) | BERTags.FLAGS);
        int i14 = i12 + 2;
        this._outputTail = i14;
        bArr[i13] = (byte) (((i3 >> 6) & 63) | 128);
        this._outputTail = i12 + 3;
        bArr[i14] = (byte) ((i3 & 63) | 128);
        return i10;
    }

    private final int _readMore(InputStream inputStream, byte[] bArr, int i3, int i10, int i11) throws IOException {
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

    private final void _writeBytes(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > 512) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    private int _writeGenericEscape(int i3, int i10) throws IOException {
        int i11;
        byte[] bArr = this._outputBuffer;
        byte[] hexBytes = getHexBytes();
        bArr[i10] = 92;
        int i12 = i10 + 2;
        bArr[i10 + 1] = 117;
        if (i3 > 255) {
            int i13 = i3 >> 8;
            int i14 = i10 + 3;
            bArr[i12] = hexBytes[(i13 & 255) >> 4];
            i11 = i10 + 4;
            bArr[i14] = hexBytes[i13 & 15];
            i3 &= 255;
        } else {
            int i15 = i10 + 3;
            bArr[i12] = 48;
            i11 = i10 + 4;
            bArr[i15] = 48;
        }
        int i16 = i11 + 1;
        bArr[i11] = hexBytes[i3 >> 4];
        int i17 = i11 + 2;
        bArr[i16] = hexBytes[i3 & 15];
        return i17;
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    private final void _writeQuotedInt(int i3) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr[i10] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(i3, bArr, i11);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        bArr2[outputInt] = this._quoteChar;
    }

    private final void _writeQuotedLong(long j) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i10 = i3 + 1;
        this._outputTail = i10;
        bArr[i3] = this._quoteChar;
        int outputLong = NumberOutput.outputLong(j, bArr, i10);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputLong + 1;
        bArr2[outputLong] = this._quoteChar;
    }

    private final void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr2[i10] = this._quoteChar;
    }

    private final void _writeQuotedShort(short s10) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i10 = i3 + 1;
        this._outputTail = i10;
        bArr[i3] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(s10, bArr, i10);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        bArr2[outputInt] = this._quoteChar;
    }

    private void _writeRawSegment(char[] cArr, int i3, int i10) throws IOException {
        while (i3 < i10) {
            do {
                char c10 = cArr[i3];
                if (c10 > 127) {
                    i3++;
                    if (c10 < 2048) {
                        byte[] bArr = this._outputBuffer;
                        int i11 = this._outputTail;
                        int i12 = i11 + 1;
                        this._outputTail = i12;
                        bArr[i11] = (byte) ((c10 >> 6) | 192);
                        this._outputTail = i11 + 2;
                        bArr[i12] = (byte) ((c10 & '?') | 128);
                    } else {
                        i3 = _outputRawMultiByteChar(c10, cArr, i3, i10);
                    }
                } else {
                    byte[] bArr2 = this._outputBuffer;
                    int i13 = this._outputTail;
                    this._outputTail = i13 + 1;
                    bArr2[i13] = (byte) c10;
                    i3++;
                }
            } while (i3 < i10);
            return;
        }
    }

    private final void _writeSegmentedRaw(char[] cArr, int i3, int i10) throws IOException {
        int i11 = this._outputEnd;
        byte[] bArr = this._outputBuffer;
        int i12 = i10 + i3;
        while (i3 < i12) {
            do {
                char c10 = cArr[i3];
                if (c10 >= 128) {
                    if (this._outputTail + 3 >= this._outputEnd) {
                        _flushBuffer();
                    }
                    int i13 = i3 + 1;
                    char c11 = cArr[i3];
                    if (c11 < 2048) {
                        int i14 = this._outputTail;
                        int i15 = i14 + 1;
                        this._outputTail = i15;
                        bArr[i14] = (byte) ((c11 >> 6) | 192);
                        this._outputTail = i14 + 2;
                        bArr[i15] = (byte) ((c11 & '?') | 128);
                        i3 = i13;
                    } else {
                        i3 = _outputRawMultiByteChar(c11, cArr, i13, i12);
                    }
                } else {
                    if (this._outputTail >= i11) {
                        _flushBuffer();
                    }
                    int i16 = this._outputTail;
                    this._outputTail = i16 + 1;
                    bArr[i16] = (byte) c10;
                    i3++;
                }
            } while (i3 < i12);
            return;
        }
    }

    private final void _writeStringSegment(char[] cArr, int i3, int i10) throws IOException {
        int i11 = i10 + i3;
        int i12 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i3 < i11) {
            char c10 = cArr[i3];
            if (c10 > 127 || iArr[c10] != 0) {
                break;
            }
            bArr[i12] = (byte) c10;
            i3++;
            i12++;
        }
        this._outputTail = i12;
        if (i3 < i11) {
            if (this._maximumNonEscapedChar == 0) {
                _writeStringSegment2(cArr, i3, i11);
            } else {
                _writeStringSegmentASCII2(cArr, i3, i11);
            }
        }
    }

    private final void _writeStringSegment2(char[] cArr, int i3, int i10) throws IOException {
        if (a.f(i10, i3, 6, this._outputTail) > this._outputEnd) {
            _flushBuffer();
        }
        int i11 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i3 < i10) {
            int i12 = i3 + 1;
            char c10 = cArr[i3];
            if (c10 <= 127) {
                int i13 = iArr[c10];
                if (i13 == 0) {
                    bArr[i11] = (byte) c10;
                    i3 = i12;
                    i11++;
                } else if (i13 > 0) {
                    int i14 = i11 + 1;
                    bArr[i11] = 92;
                    i11 += 2;
                    bArr[i14] = (byte) i13;
                } else {
                    i11 = _writeGenericEscape(c10, i11);
                }
            } else if (c10 <= 2047) {
                int i15 = i11 + 1;
                bArr[i11] = (byte) ((c10 >> 6) | 192);
                i11 += 2;
                bArr[i15] = (byte) ((c10 & '?') | 128);
            } else {
                i11 = _outputMultiByteChar(c10, i11);
            }
            i3 = i12;
        }
        this._outputTail = i11;
    }

    private final void _writeStringSegmentASCII2(char[] cArr, int i3, int i10) throws IOException {
        if (a.f(i10, i3, 6, this._outputTail) > this._outputEnd) {
            _flushBuffer();
        }
        int i11 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i12 = this._maximumNonEscapedChar;
        while (i3 < i10) {
            int i13 = i3 + 1;
            char c10 = cArr[i3];
            if (c10 <= 127) {
                int i14 = iArr[c10];
                if (i14 == 0) {
                    bArr[i11] = (byte) c10;
                    i3 = i13;
                    i11++;
                } else if (i14 > 0) {
                    int i15 = i11 + 1;
                    bArr[i11] = 92;
                    i11 += 2;
                    bArr[i15] = (byte) i14;
                } else {
                    i11 = _writeGenericEscape(c10, i11);
                }
            } else if (c10 > i12) {
                i11 = _writeGenericEscape(c10, i11);
            } else if (c10 <= 2047) {
                int i16 = i11 + 1;
                bArr[i11] = (byte) ((c10 >> 6) | 192);
                i11 += 2;
                bArr[i16] = (byte) ((c10 & '?') | 128);
            } else {
                i11 = _outputMultiByteChar(c10, i11);
            }
            i3 = i13;
        }
        this._outputTail = i11;
    }

    private final void _writeStringSegments(String str, boolean z2) throws IOException {
        if (z2) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = this._quoteChar;
        }
        int length = str.length();
        int i10 = 0;
        while (length > 0) {
            int min = Math.min(this._outputMaxContiguous, length);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i10, min);
            i10 += min;
            length -= min;
        }
        if (z2) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i11 = this._outputTail;
            this._outputTail = i11 + 1;
            bArr2[i11] = this._quoteChar;
        }
    }

    private final void _writeUnq(SerializableString serializableString) throws IOException {
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
    }

    private byte[] getHexBytes() {
        return this._cfgWriteHexUppercase ? HEX_BYTES_UPPER : HEX_BYTES_LOWER;
    }

    public final void _flushBuffer() throws IOException {
        int i3 = this._outputTail;
        if (i3 > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i3);
        }
    }

    public final void _outputSurrogates(int i3, int i10) throws IOException {
        int _decodeSurrogate = _decodeSurrogate(i3, i10);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        bArr[i11] = (byte) ((_decodeSurrogate >> 18) | 240);
        int i13 = i11 + 2;
        this._outputTail = i13;
        bArr[i12] = (byte) (((_decodeSurrogate >> 12) & 63) | 128);
        int i14 = i11 + 3;
        this._outputTail = i14;
        bArr[i13] = (byte) (((_decodeSurrogate >> 6) & 63) | 128);
        this._outputTail = i11 + 4;
        bArr[i14] = (byte) ((_decodeSurrogate & 63) | 128);
    }

    public void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void _verifyValueWrite(String str) throws IOException {
        byte b2;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            b2 = 44;
        } else {
            if (writeValue != 2) {
                if (writeValue != 3) {
                    if (writeValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                }
                SerializableString serializableString = this._rootValueSeparator;
                if (serializableString != null) {
                    byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
                    if (asUnquotedUTF8.length > 0) {
                        _writeBytes(asUnquotedUTF8);
                        return;
                    }
                    return;
                }
                return;
            }
            b2 = 58;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = b2;
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
            byte[] bArr2 = this._outputBuffer;
            int i16 = encodeBase64Chunk + 1;
            this._outputTail = i16;
            bArr2[encodeBase64Chunk] = 92;
            this._outputTail = encodeBase64Chunk + 2;
            bArr2[i16] = 110;
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

    public final void _writePPFieldName(String str) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError(StubApp.getString2(10456));
        }
        if (writeFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = this._quoteChar;
        str.getChars(0, length, this._charBuffer, 0);
        if (length <= this._outputMaxContiguous) {
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(this._charBuffer, 0, length);
        } else {
            _writeStringSegments(this._charBuffer, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr2[i10] = this._quoteChar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x005f  */
    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            super.close()
            byte[] r0 = r2._outputBuffer     // Catch: java.io.IOException -> L1d
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
            r2._outputTail = r1
            java.io.OutputStream r1 = r2._outputStream
            if (r1 == 0) goto L63
            com.fasterxml.jackson.core.io.IOContext r1 = r2._ioContext     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            boolean r1 = r1.isResourceManaged()     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            if (r1 != 0) goto L57
            com.fasterxml.jackson.core.JsonGenerator$Feature r1 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            boolean r1 = r2.isEnabled(r1)     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            if (r1 == 0) goto L45
            goto L57
        L45:
            com.fasterxml.jackson.core.JsonGenerator$Feature r1 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            boolean r1 = r2.isEnabled(r1)     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            if (r1 == 0) goto L63
            java.io.OutputStream r1 = r2._outputStream     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            r1.flush()     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            goto L63
        L53:
            r1 = move-exception
            goto L5d
        L55:
            r1 = move-exception
            goto L5d
        L57:
            java.io.OutputStream r1 = r2._outputStream     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            r1.close()     // Catch: java.lang.RuntimeException -> L53 java.io.IOException -> L55
            goto L63
        L5d:
            if (r0 == 0) goto L62
            r1.addSuppressed(r0)
        L62:
            throw r1
        L63:
            r2._releaseBuffers()
            if (r0 != 0) goto L69
            return
        L69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator.close():void");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._outputStream == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._outputStream.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i3, int i10) throws IOException, JsonGenerationException {
        _checkRangeBoundsForByteArray(bArr, i3, i10);
        _verifyValueWrite(StubApp.getString2(10458));
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i3, i10 + i3);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr3[i12] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z2) throws IOException {
        _verifyValueWrite(StubApp.getString2(10460));
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = z2 ? TRUE_BYTES : FALSE_BYTES;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
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
            byte[] bArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = 93;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
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
            byte[] bArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = 125;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError(StubApp.getString2(10456));
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = 44;
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr2[i10] = this._quoteChar;
        if (length <= this._outputMaxContiguous) {
            if (i11 + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, 0, length);
        } else {
            _writeStringSegments(str, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr3[i12] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite(StubApp.getString2(10463));
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s10) throws IOException {
        _verifyValueWrite(StubApp.getString2(10464));
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s10);
        } else {
            this._outputTail = NumberOutput.outputInt(s10, this._outputBuffer, this._outputTail);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        char[] cArr = this._charBuffer;
        if (length > cArr.length) {
            writeRaw(str, 0, length);
        } else {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite(StubApp.getString2(10465));
        int appendUnquotedUTF8 = serializableString.appendUnquotedUTF8(this._outputBuffer, this._outputTail);
        if (appendUnquotedUTF8 < 0) {
            _writeBytes(serializableString.asUnquotedUTF8());
        } else {
            this._outputTail += appendUnquotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
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
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
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
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite(StubApp.getString2(10468));
        if (str == null) {
            _writeNull();
            return;
        }
        int length = str.length();
        if (length > this._outputMaxContiguous) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = this._quoteChar;
        _writeStringSegment(str, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr2[i10] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i3) throws IOException {
        _verifyValueWrite(StubApp.getString2(10464));
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i3);
        } else {
            this._outputTail = NumberOutput.outputInt(i3, this._outputBuffer, this._outputTail);
        }
    }

    public void writeRaw(String str, int i3, int i10) throws IOException {
        char c10;
        _checkRangeBoundsForString(str, i3, i10);
        char[] cArr = this._charBuffer;
        int length = cArr.length;
        if (i10 <= length) {
            str.getChars(i3, i3 + i10, cArr, 0);
            writeRaw(cArr, 0, i10);
            return;
        }
        int i11 = this._outputEnd;
        int min = Math.min(length, (i11 >> 2) + (i11 >> 4));
        int i12 = min * 3;
        while (i10 > 0) {
            int min2 = Math.min(min, i10);
            str.getChars(i3, i3 + min2, cArr, 0);
            if (this._outputTail + i12 > this._outputEnd) {
                _flushBuffer();
            }
            if (min2 > 1 && (c10 = cArr[min2 - 1]) >= 55296 && c10 <= 56319) {
                min2--;
            }
            _writeRawSegment(cArr, 0, min2);
            i3 += min2;
            i10 -= min2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray(Object obj) throws IOException {
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
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = 91;
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
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i3) throws IOException, JsonGenerationException {
        String string2 = StubApp.getString2(10457);
        _verifyValueWrite(StubApp.getString2(10458));
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = this._quoteChar;
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
            byte[] bArr2 = this._outputBuffer;
            int i11 = this._outputTail;
            this._outputTail = i11 + 1;
            bArr2[i11] = this._quoteChar;
            return i3;
        } catch (Throwable th) {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            throw th;
        }
    }

    private final void _writeStringSegment(String str, int i3, int i10) throws IOException {
        int i11 = i10 + i3;
        int i12 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i3 < i11) {
            char charAt = str.charAt(i3);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            bArr[i12] = (byte) charAt;
            i3++;
            i12++;
        }
        this._outputTail = i12;
        if (i3 < i11) {
            if (this._maximumNonEscapedChar == 0) {
                _writeStringSegment2(str, i3, i11);
            } else {
                _writeStringSegmentASCII2(str, i3, i11);
            }
        }
    }

    private final void _writeStringSegments(char[] cArr, int i3, int i10) throws IOException {
        do {
            int min = Math.min(this._outputMaxContiguous, i10);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i3, min);
            i3 += min;
            i10 -= min;
        } while (i10 > 0);
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
    public void writeString(char[] cArr, int i3, int i10) throws IOException {
        _verifyValueWrite(StubApp.getString2(10468));
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        bArr[i11] = this._quoteChar;
        if (i10 <= this._outputMaxContiguous) {
            if (i12 + i10 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i3, i10);
        } else {
            _writeStringSegments(cArr, i3, i10);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr2[i13] = this._quoteChar;
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
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = 91;
    }

    private final void _writeStringSegment2(String str, int i3, int i10) throws IOException {
        if (a.f(i10, i3, 6, this._outputTail) > this._outputEnd) {
            _flushBuffer();
        }
        int i11 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i3 < i10) {
            int i12 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt <= 127) {
                int i13 = iArr[charAt];
                if (i13 == 0) {
                    bArr[i11] = (byte) charAt;
                    i3 = i12;
                    i11++;
                } else if (i13 > 0) {
                    int i14 = i11 + 1;
                    bArr[i11] = 92;
                    i11 += 2;
                    bArr[i14] = (byte) i13;
                } else {
                    i11 = _writeGenericEscape(charAt, i11);
                }
            } else if (charAt <= 2047) {
                int i15 = i11 + 1;
                bArr[i11] = (byte) ((charAt >> 6) | 192);
                i11 += 2;
                bArr[i15] = (byte) ((charAt & '?') | 128);
            } else {
                i11 = _outputMultiByteChar(charAt, i11);
            }
            i3 = i12;
        }
        this._outputTail = i11;
    }

    private final void _writeStringSegments(String str, int i3, int i10) throws IOException {
        do {
            int min = Math.min(this._outputMaxContiguous, i10);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i3, min);
            i3 += min;
            i10 -= min;
        } while (i10 > 0);
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
                byte[] bArr2 = this._outputBuffer;
                int i18 = encodeBase64Chunk + 1;
                this._outputTail = i18;
                bArr2[encodeBase64Chunk] = 92;
                this._outputTail = encodeBase64Chunk + 2;
                bArr2[i18] = 110;
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

    private final void _writeStringSegmentASCII2(String str, int i3, int i10) throws IOException {
        if (a.f(i10, i3, 6, this._outputTail) > this._outputEnd) {
            _flushBuffer();
        }
        int i11 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i12 = this._maximumNonEscapedChar;
        while (i3 < i10) {
            int i13 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt <= 127) {
                int i14 = iArr[charAt];
                if (i14 == 0) {
                    bArr[i11] = (byte) charAt;
                    i3 = i13;
                    i11++;
                } else if (i14 > 0) {
                    int i15 = i11 + 1;
                    bArr[i11] = 92;
                    i11 += 2;
                    bArr[i15] = (byte) i14;
                } else {
                    i11 = _writeGenericEscape(charAt, i11);
                }
            } else if (charAt > i12) {
                i11 = _writeGenericEscape(charAt, i11);
            } else if (charAt <= 2047) {
                int i16 = i11 + 1;
                bArr[i11] = (byte) ((charAt >> 6) | 192);
                i11 += 2;
                bArr[i16] = (byte) ((charAt & '?') | 128);
            } else {
                i11 = _outputMultiByteChar(charAt, i11);
            }
            i3 = i13;
        }
        this._outputTail = i11;
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
    public void writeRaw(SerializableString serializableString) throws IOException {
        int appendUnquotedUTF8 = serializableString.appendUnquotedUTF8(this._outputBuffer, this._outputTail);
        if (appendUnquotedUTF8 < 0) {
            _writeBytes(serializableString.asUnquotedUTF8());
        } else {
            this._outputTail += appendUnquotedUTF8;
        }
    }

    public final void _writePPFieldName(SerializableString serializableString) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError(StubApp.getString2(10456));
        }
        if (writeFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        boolean z2 = this._cfgUnqNames;
        if (!z2) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = this._quoteChar;
        }
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (z2) {
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr2[i10] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeRaw(char[] cArr, int i3, int i10) throws IOException {
        _checkRangeBoundsForCharArray(cArr, i3, i10);
        int i11 = i10 + i10 + i10;
        int i12 = this._outputTail + i11;
        int i13 = this._outputEnd;
        if (i12 > i13) {
            if (i13 < i11) {
                _writeSegmentedRaw(cArr, i3, i10);
                return;
            }
            _flushBuffer();
        }
        int i14 = i10 + i3;
        while (i3 < i14) {
            do {
                char c10 = cArr[i3];
                if (c10 > 127) {
                    i3++;
                    if (c10 < 2048) {
                        byte[] bArr = this._outputBuffer;
                        int i15 = this._outputTail;
                        int i16 = i15 + 1;
                        this._outputTail = i16;
                        bArr[i15] = (byte) ((c10 >> 6) | 192);
                        this._outputTail = i15 + 2;
                        bArr[i16] = (byte) ((c10 & '?') | 128);
                    } else {
                        i3 = _outputRawMultiByteChar(c10, cArr, i3, i14);
                    }
                } else {
                    byte[] bArr2 = this._outputBuffer;
                    int i17 = this._outputTail;
                    this._outputTail = i17 + 1;
                    bArr2[i17] = (byte) c10;
                    i3++;
                }
            } while (i3 < i14);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError(StubApp.getString2(10456));
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = 44;
        }
        if (this._cfgUnqNames) {
            _writeUnq(serializableString);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr2[i10] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr2, i11);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr3[i12] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d8) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(d8) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            _verifyValueWrite(StubApp.getString2(10464));
            writeRaw(NumberOutput.toString(d8, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            writeString(NumberOutput.toString(d8, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite(StubApp.getString2(10468));
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i10 = i3 + 1;
        this._outputTail = i10;
        bArr[i3] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, i10);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f10) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(f10) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            _verifyValueWrite(StubApp.getString2(10464));
            writeRaw(NumberOutput.toString(f10, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            writeString(NumberOutput.toString(f10, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c10) throws IOException {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        if (c10 <= 127) {
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = (byte) c10;
        } else {
            if (c10 < 2048) {
                int i10 = this._outputTail;
                int i11 = i10 + 1;
                this._outputTail = i11;
                bArr[i10] = (byte) ((c10 >> 6) | 192);
                this._outputTail = i10 + 2;
                bArr[i11] = (byte) ((c10 & '?') | 128);
                return;
            }
            _outputRawMultiByteChar(c10, null, 0, 0);
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
                byte[] bArr3 = this._outputBuffer;
                int i17 = encodeBase64Chunk + 1;
                this._outputTail = i17;
                bArr3[encodeBase64Chunk] = 92;
                this._outputTail = encodeBase64Chunk + 2;
                bArr3[i17] = 110;
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
}
