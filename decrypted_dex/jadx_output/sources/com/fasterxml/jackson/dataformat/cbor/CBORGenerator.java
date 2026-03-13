package com.fasterxml.jackson.dataformat.cbor;

import Xa.h;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.util.JacksonFeature;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CBORGenerator extends GeneratorBase {
    private static final int[] NO_INTS = new int[0];
    protected boolean _bufferRecyclable;
    protected int _bytesWritten;
    protected boolean _cfgMinimalInts;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected int _currentRemainingElements;
    protected int[] _elementCounts;
    protected int _elementCountsPtr;
    protected int _formatFeatures;
    protected final IOContext _ioContext;
    protected final OutputStream _out;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected int _outputTail;
    protected CBORWriteContext _streamWriteContext;

    public enum Feature implements JacksonFeature {
        WRITE_MINIMAL_INTS(true),
        WRITE_TYPE_HEADER(false),
        LENIENT_UTF_ENCODING(false);

        protected final boolean _defaultState;
        protected final int _mask = 1 << ordinal();

        Feature(boolean z2) {
            this._defaultState = z2;
        }

        public static int collectDefaults() {
            int i3 = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i3 |= feature.getMask();
                }
            }
            return i3;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public boolean enabledIn(int i3) {
            return (i3 & getMask()) != 0;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public int getMask() {
            return this._mask;
        }
    }

    public CBORGenerator(IOContext iOContext, int i3, int i10, ObjectCodec objectCodec, OutputStream outputStream) {
        super(i3, objectCodec, null);
        this._outputTail = 0;
        this._elementCounts = NO_INTS;
        this._currentRemainingElements = -2;
        this._streamWriteContext = CBORWriteContext.createRootContext(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i3) ? DupDetector.rootDetector(this) : null);
        this._formatFeatures = i10;
        this._cfgMinimalInts = Feature.WRITE_MINIMAL_INTS.enabledIn(i10);
        this._ioContext = iOContext;
        this._out = outputStream;
        this._bufferRecyclable = true;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer(16000);
        this._outputBuffer = allocWriteEncodingBuffer;
        int length = allocWriteEncodingBuffer.length;
        this._outputEnd = length;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = allocConcatBuffer;
        this._charBufferLength = allocConcatBuffer.length;
        if (length < 770) {
            throw new IllegalStateException(h.g(length, StubApp.getString2(11157), StubApp.getString2(11158)));
        }
    }

    private int _appendReplacementChar(byte[] bArr, int i3) {
        bArr[i3] = -17;
        int i10 = i3 + 2;
        bArr[i3 + 1] = -65;
        int i11 = i3 + 3;
        bArr[i10] = -67;
        return i11;
    }

    private int _decodeAndWriteSurrogate(int i3, int i10, byte[] bArr, int i11) {
        int i12 = (i10 - 56320) + ((i3 - 55296) << 10) + PKIFailureInfo.notAuthorized;
        bArr[i11] = (byte) ((i12 >> 18) | 240);
        bArr[i11 + 1] = (byte) (((i12 >> 12) & 63) | 128);
        int i13 = i11 + 3;
        bArr[i11 + 2] = (byte) (((i12 >> 6) & 63) | 128);
        int i14 = i11 + 4;
        bArr[i13] = (byte) ((i12 & 63) | 128);
        return i14;
    }

    private final int _encode(int i3, char[] cArr, int i10, int i11) throws IOException {
        byte[] bArr = this._outputBuffer;
        int i12 = i3;
        int i13 = i10;
        while (true) {
            char c10 = cArr[i13];
            if (c10 > 127) {
                return _shortUTF8Encode2(cArr, i13, i11, i12, i3);
            }
            int i14 = i3;
            char[] cArr2 = cArr;
            int i15 = i11;
            int i16 = i12 + 1;
            bArr[i12] = (byte) c10;
            i13++;
            if (i13 >= i15) {
                return i16 - i14;
            }
            i12 = i16;
            cArr = cArr2;
            i11 = i15;
            i3 = i14;
        }
    }

    private final int _encode2(int i3, int i10, String str, int i11, int i12) throws IOException {
        byte[] bArr = this._outputBuffer;
        while (i3 < i11) {
            int i13 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt <= 127) {
                bArr[i10] = (byte) charAt;
                i10++;
            } else if (charAt < 2048) {
                int i14 = i10 + 1;
                bArr[i10] = (byte) ((charAt >> 6) | 192);
                i10 += 2;
                bArr[i14] = (byte) ((charAt & '?') | 128);
            } else if (charAt < 55296 || charAt > 57343) {
                bArr[i10] = (byte) ((charAt >> '\f') | BERTags.FLAGS);
                int i15 = i10 + 2;
                bArr[i10 + 1] = (byte) (((charAt >> 6) & 63) | 128);
                i10 += 3;
                bArr[i15] = (byte) ((charAt & '?') | 128);
            } else if (charAt > 56319 || i13 >= i11) {
                i10 = _invalidSurrogateStart(charAt, bArr, i10);
            } else {
                char charAt2 = str.charAt(i13);
                if (charAt2 > 57343 || charAt2 < 56320) {
                    i10 = _invalidSurrogateEnd(charAt, charAt2, bArr, i10);
                } else {
                    i3 += 2;
                    i10 = _decodeAndWriteSurrogate(charAt, charAt2, bArr, i10);
                }
            }
            i3 = i13;
        }
        return i10 - i12;
    }

    private final void _ensureRoomForOutput(int i3) throws IOException {
        if (this._outputTail + i3 >= this._outputEnd) {
            _flushBuffer();
        }
    }

    private void _failSizedArrayOrObject() throws IOException {
        _reportError(this._streamWriteContext.typeDesc() + StubApp.getString2(11159));
    }

    private int _invalidSurrogateEnd(int i3, int i10, byte[] bArr, int i11) throws IOException {
        if (isEnabled(Feature.LENIENT_UTF_ENCODING)) {
            return _appendReplacementChar(bArr, i11);
        }
        _reportError(String.format(StubApp.getString2(11160), Integer.valueOf(i3), Integer.valueOf(i10)));
        return 0;
    }

    private int _invalidSurrogateStart(int i3, byte[] bArr, int i10) throws IOException {
        if (isEnabled(Feature.LENIENT_UTF_ENCODING)) {
            return _appendReplacementChar(bArr, i10);
        }
        if (i3 <= 56319) {
            _reportError(String.format(StubApp.getString2(11161), Integer.valueOf(i3)));
        }
        _reportError(String.format(StubApp.getString2(11162), Integer.valueOf(i3)));
        return 0;
    }

    private final void _pushRemainingElements() {
        int[] iArr = this._elementCounts;
        if (iArr.length == this._elementCountsPtr) {
            this._elementCounts = Arrays.copyOf(iArr, iArr.length + 10);
        }
        int[] iArr2 = this._elementCounts;
        int i3 = this._elementCountsPtr;
        this._elementCountsPtr = i3 + 1;
        iArr2[i3] = this._currentRemainingElements;
    }

    private final int _shortUTF8Encode2(char[] cArr, int i3, int i10, int i11, int i12) throws IOException {
        byte[] bArr = this._outputBuffer;
        while (i3 < i10) {
            int i13 = i3 + 1;
            char c10 = cArr[i3];
            if (c10 <= 127) {
                bArr[i11] = (byte) c10;
                i11++;
            } else if (c10 < 2048) {
                int i14 = i11 + 1;
                bArr[i11] = (byte) ((c10 >> 6) | 192);
                i11 += 2;
                bArr[i14] = (byte) ((c10 & '?') | 128);
            } else if (c10 < 55296 || c10 > 57343) {
                bArr[i11] = (byte) ((c10 >> '\f') | BERTags.FLAGS);
                int i15 = i11 + 2;
                bArr[i11 + 1] = (byte) (((c10 >> 6) & 63) | 128);
                i11 += 3;
                bArr[i15] = (byte) ((c10 & '?') | 128);
            } else if (c10 > 56319 || i13 >= i10) {
                i11 = _invalidSurrogateStart(c10, bArr, i11);
            } else {
                char c11 = cArr[i13];
                if (c11 > 57343 || c11 < 56320) {
                    i11 = _invalidSurrogateEnd(c10, c11, bArr, i11);
                } else {
                    i3 += 2;
                    i11 = _decodeAndWriteSurrogate(c10, c11, bArr, i11);
                }
            }
            i3 = i13;
        }
        return i11 - i12;
    }

    private final void _writeByte(byte b2) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = b2;
    }

    private final void _writeBytes(byte[] bArr, int i3, int i10) throws IOException {
        if (i10 == 0) {
            return;
        }
        int i11 = this._outputTail;
        if (i11 + i10 >= this._outputEnd) {
            _writeBytesLong(bArr, i3, i10);
        } else {
            System.arraycopy(bArr, i3, this._outputBuffer, i11, i10);
            this._outputTail += i10;
        }
    }

    private final void _writeBytesLong(byte[] bArr, int i3, int i10) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        while (true) {
            int min = Math.min(i10, this._outputEnd - this._outputTail);
            System.arraycopy(bArr, i3, this._outputBuffer, this._outputTail, min);
            this._outputTail += min;
            i10 -= min;
            if (i10 == 0) {
                return;
            }
            i3 += min;
            _flushBuffer();
        }
    }

    private final void _writeDoubleNoCheck(double d8) throws IOException {
        _ensureRoomForOutput(11);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d8);
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i10 = i3 + 1;
        this._outputTail = i10;
        bArr[i3] = -5;
        int i11 = (int) (doubleToRawLongBits >> 32);
        int i12 = i3 + 2;
        this._outputTail = i12;
        bArr[i10] = (byte) (i11 >> 24);
        int i13 = i3 + 3;
        this._outputTail = i13;
        bArr[i12] = (byte) (i11 >> 16);
        int i14 = i3 + 4;
        this._outputTail = i14;
        bArr[i13] = (byte) (i11 >> 8);
        int i15 = i3 + 5;
        this._outputTail = i15;
        bArr[i14] = (byte) i11;
        int i16 = (int) doubleToRawLongBits;
        int i17 = i3 + 6;
        this._outputTail = i17;
        bArr[i15] = (byte) (i16 >> 24);
        int i18 = i3 + 7;
        this._outputTail = i18;
        bArr[i17] = (byte) (i16 >> 16);
        int i19 = i3 + 8;
        this._outputTail = i19;
        bArr[i18] = (byte) (i16 >> 8);
        this._outputTail = i3 + 9;
        bArr[i19] = (byte) i16;
    }

    private final void _writeIntFull(int i3, int i10) throws IOException {
        _ensureRoomForOutput(5);
        byte[] bArr = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        bArr[i11] = (byte) (i3 + 26);
        int i13 = i11 + 2;
        this._outputTail = i13;
        bArr[i12] = (byte) (i10 >> 24);
        int i14 = i11 + 3;
        this._outputTail = i14;
        bArr[i13] = (byte) (i10 >> 16);
        int i15 = i11 + 4;
        this._outputTail = i15;
        bArr[i14] = (byte) (i10 >> 8);
        this._outputTail = i11 + 5;
        bArr[i15] = (byte) i10;
    }

    private final void _writeIntMinimal(int i3, int i10) throws IOException {
        byte b2;
        int i11;
        _ensureRoomForOutput(5);
        if (i10 < 0) {
            b2 = (byte) i10;
            i11 = i10 >> 8;
        } else {
            if (i10 < 24) {
                byte[] bArr = this._outputBuffer;
                int i12 = this._outputTail;
                this._outputTail = i12 + 1;
                bArr[i12] = (byte) (i3 + i10);
                return;
            }
            if (i10 <= 255) {
                byte[] bArr2 = this._outputBuffer;
                int i13 = this._outputTail;
                int i14 = i13 + 1;
                this._outputTail = i14;
                bArr2[i13] = (byte) (i3 + 24);
                this._outputTail = i13 + 2;
                bArr2[i14] = (byte) i10;
                return;
            }
            b2 = (byte) i10;
            i11 = i10 >> 8;
            if (i11 <= 255) {
                byte[] bArr3 = this._outputBuffer;
                int i15 = this._outputTail;
                int i16 = i15 + 1;
                this._outputTail = i16;
                bArr3[i15] = (byte) (i3 + 25);
                int i17 = i15 + 2;
                this._outputTail = i17;
                bArr3[i16] = (byte) i11;
                this._outputTail = i15 + 3;
                bArr3[i17] = b2;
                return;
            }
        }
        byte[] bArr4 = this._outputBuffer;
        int i18 = this._outputTail;
        int i19 = i18 + 1;
        this._outputTail = i19;
        bArr4[i18] = (byte) (i3 + 26);
        int i20 = i18 + 2;
        this._outputTail = i20;
        bArr4[i19] = (byte) (i11 >> 16);
        int i21 = i18 + 3;
        this._outputTail = i21;
        bArr4[i20] = (byte) (i11 >> 8);
        int i22 = i18 + 4;
        this._outputTail = i22;
        bArr4[i21] = (byte) i11;
        this._outputTail = i18 + 5;
        bArr4[i22] = b2;
    }

    private final void _writeIntValue(int i3) throws IOException {
        int i10;
        if (i3 < 0) {
            i3 = (-i3) - 1;
            i10 = 32;
        } else {
            i10 = 0;
        }
        _writeLengthMarker(i10, i3);
    }

    private final void _writeLengthMarker(int i3, int i10) throws IOException {
        _ensureRoomForOutput(5);
        if (i10 < 24) {
            byte[] bArr = this._outputBuffer;
            int i11 = this._outputTail;
            this._outputTail = i11 + 1;
            bArr[i11] = (byte) (i3 + i10);
            return;
        }
        if (i10 <= 255) {
            byte[] bArr2 = this._outputBuffer;
            int i12 = this._outputTail;
            int i13 = i12 + 1;
            this._outputTail = i13;
            bArr2[i12] = (byte) (i3 + 24);
            this._outputTail = i12 + 2;
            bArr2[i13] = (byte) i10;
            return;
        }
        byte b2 = (byte) i10;
        int i14 = i10 >> 8;
        if (i14 <= 255) {
            byte[] bArr3 = this._outputBuffer;
            int i15 = this._outputTail;
            int i16 = i15 + 1;
            this._outputTail = i16;
            bArr3[i15] = (byte) (i3 + 25);
            int i17 = i15 + 2;
            this._outputTail = i17;
            bArr3[i16] = (byte) i14;
            this._outputTail = i15 + 3;
            bArr3[i17] = b2;
            return;
        }
        byte[] bArr4 = this._outputBuffer;
        int i18 = this._outputTail;
        int i19 = i18 + 1;
        this._outputTail = i19;
        bArr4[i18] = (byte) (i3 + 26);
        int i20 = i18 + 2;
        this._outputTail = i20;
        bArr4[i19] = (byte) (i10 >> 24);
        int i21 = i18 + 3;
        this._outputTail = i21;
        bArr4[i20] = (byte) (i10 >> 16);
        int i22 = i18 + 4;
        this._outputTail = i22;
        bArr4[i21] = (byte) i14;
        this._outputTail = i18 + 5;
        bArr4[i22] = b2;
    }

    private final void _writeLongNoCheck(long j) throws IOException {
        if (this._cfgMinimalInts) {
            if (j >= 0) {
                if (j < 4294967296L) {
                    _writeIntMinimal(0, (int) j);
                    return;
                }
            } else if (j >= -4294967296L) {
                _writeIntMinimal(32, (int) ((-j) - 1));
                return;
            }
        }
        _ensureRoomForOutput(9);
        if (j < 0) {
            j = -(j + 1);
            byte[] bArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = 59;
        } else {
            byte[] bArr2 = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr2[i10] = 27;
        }
        int i11 = (int) (j >> 32);
        byte[] bArr3 = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr3[i12] = (byte) (i11 >> 24);
        int i14 = i12 + 2;
        this._outputTail = i14;
        bArr3[i13] = (byte) (i11 >> 16);
        int i15 = i12 + 3;
        this._outputTail = i15;
        bArr3[i14] = (byte) (i11 >> 8);
        int i16 = i12 + 4;
        this._outputTail = i16;
        bArr3[i15] = (byte) i11;
        int i17 = (int) j;
        int i18 = i12 + 5;
        this._outputTail = i18;
        bArr3[i16] = (byte) (i17 >> 24);
        int i19 = i12 + 6;
        this._outputTail = i19;
        bArr3[i18] = (byte) (i17 >> 16);
        int i20 = i12 + 7;
        this._outputTail = i20;
        bArr3[i19] = (byte) (i17 >> 8);
        this._outputTail = i12 + 8;
        bArr3[i20] = (byte) i17;
    }

    private final void _writeLongValue(long j) throws IOException {
        _ensureRoomForOutput(9);
        if (j < 0) {
            j = -(j + 1);
            byte[] bArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = 59;
        } else {
            byte[] bArr2 = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr2[i10] = 27;
        }
        int i11 = (int) (j >> 32);
        byte[] bArr3 = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr3[i12] = (byte) (i11 >> 24);
        int i14 = i12 + 2;
        this._outputTail = i14;
        bArr3[i13] = (byte) (i11 >> 16);
        int i15 = i12 + 3;
        this._outputTail = i15;
        bArr3[i14] = (byte) (i11 >> 8);
        int i16 = i12 + 4;
        this._outputTail = i16;
        bArr3[i15] = (byte) i11;
        int i17 = (int) j;
        int i18 = i12 + 5;
        this._outputTail = i18;
        bArr3[i16] = (byte) (i17 >> 24);
        int i19 = i12 + 6;
        this._outputTail = i19;
        bArr3[i18] = (byte) (i17 >> 16);
        int i20 = i12 + 7;
        this._outputTail = i20;
        bArr3[i19] = (byte) (i17 >> 8);
        this._outputTail = i12 + 8;
        bArr3[i20] = (byte) i17;
    }

    private final void closeComplexElement() throws IOException {
        int i3 = this._currentRemainingElements;
        int i10 = -2;
        if (i3 == -2) {
            _writeByte((byte) -1);
        } else if (i3 != 0) {
            _reportError(String.format(StubApp.getString2(11163), this._streamWriteContext.typeDesc(), Integer.valueOf(this._currentRemainingElements)));
        }
        int i11 = this._elementCountsPtr;
        if (i11 != 0) {
            int[] iArr = this._elementCounts;
            int i12 = i11 - 1;
            this._elementCountsPtr = i12;
            i10 = iArr[i12];
        }
        this._currentRemainingElements = i10;
    }

    public final void _ensureSpace(int i3) throws IOException {
        if (this._outputTail + i3 + 3 > this._outputEnd) {
            _flushBuffer();
        }
    }

    public final void _flushBuffer() throws IOException {
        int i3 = this._outputTail;
        if (i3 > 0) {
            this._bytesWritten += i3;
            this._out.write(this._outputBuffer, 0, i3);
            this._outputTail = 0;
        }
    }

    public UnsupportedOperationException _notSupported() {
        return new UnsupportedOperationException();
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
        if (!this._streamWriteContext.writeValue()) {
            _reportError(StubApp.getString2(10411) + str + StubApp.getString2(11164));
        }
        int i3 = this._currentRemainingElements;
        if (i3 != -2) {
            int i10 = i3 - 1;
            if (i10 < 0) {
                _failSizedArrayOrObject();
            } else {
                this._currentRemainingElements = i10;
            }
        }
    }

    public void _write(BigInteger bigInteger) throws IOException {
        if (bigInteger.signum() < 0) {
            _writeByte((byte) -61);
            bigInteger = bigInteger.negate();
        } else {
            _writeByte((byte) -62);
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        _writeLengthMarker(64, length);
        _writeBytes(byteArray, 0, length);
    }

    public final void _writeChunkedString(char[] cArr, int i3, int i10) throws IOException {
        _writeByte(ByteCompanionObject.MAX_VALUE);
        while (true) {
            int i11 = 3996;
            if (i10 <= 3996) {
                break;
            }
            _ensureSpace(11991);
            int i12 = this._outputTail;
            int i13 = i3 + 3996;
            char c10 = cArr[i3 + 3995];
            if (c10 >= 55296 && c10 <= 56319) {
                i13 = i3 + 3995;
                i11 = 3995;
            }
            int _encode = _encode(i12 + 3, cArr, i3, i13);
            byte[] bArr = this._outputBuffer;
            bArr[i12] = 121;
            bArr[i12 + 1] = (byte) (_encode >> 8);
            bArr[i12 + 2] = (byte) _encode;
            this._outputTail = i12 + 3 + _encode;
            i3 += i11;
            i10 -= i11;
        }
        if (i10 > 0) {
            _writeString(cArr, i3, i10);
        }
        _writeByte((byte) -1);
    }

    public final void _writeString(String str) throws IOException {
        int length = str.length();
        if (length == 0) {
            _writeByte((byte) 96);
            return;
        }
        if (length > 23) {
            char[] cArr = this._charBuffer;
            if (length > cArr.length) {
                cArr = new char[Math.max(cArr.length + 32, length)];
                this._charBuffer = cArr;
            }
            str.getChars(0, length, cArr, 0);
            _writeString(cArr, 0, length);
            return;
        }
        _ensureSpace(71);
        int _encode = _encode(this._outputTail + 1, str, length);
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        if (_encode <= 23) {
            bArr[i3] = (byte) (_encode + 96);
            this._outputTail = i3 + 1 + _encode;
            return;
        }
        int i10 = i3 + 1;
        System.arraycopy(bArr, i10, bArr, i3 + 2, _encode);
        bArr[i3] = 120;
        bArr[i10] = (byte) _encode;
        this._outputTail = i3 + 2 + _encode;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteBinaryNatively() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    } else {
                        writeEndObject();
                    }
                } else {
                    writeEndArray();
                }
            }
        }
        super.close();
        _flushBuffer();
        if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
            this._out.close();
        } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this._out.flush();
        }
        _releaseBuffers();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public final void flush() throws IOException {
        _flushBuffer();
        if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this._out.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public JsonStreamContext getOutputContext() {
        return this._streamWriteContext;
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._formatFeatures) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideFormatFeatures(int i3, int i10) {
        int i11 = this._formatFeatures;
        int i12 = (i3 & i10) | ((~i10) & i11);
        if (i11 != i12) {
            this._formatFeatures = i12;
            this._cfgMinimalInts = Feature.WRITE_MINIMAL_INTS.enabledIn(i12);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i3, int i10) {
        int i11 = this._features;
        int i12 = (i3 & i10) | ((~i10) & i11);
        if (i11 != i12) {
            this._features = i12;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void setCurrentValue(Object obj) {
        this._streamWriteContext.setCurrentValue(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeArray(int[] iArr, int i3, int i10) throws IOException {
        _verifyOffsets(iArr.length, i3, i10);
        _verifyValueWrite(StubApp.getString2(11165));
        _writeLengthMarker(128, i10);
        if (this._cfgMinimalInts) {
            int i11 = i10 + i3;
            while (i3 < i11) {
                int i12 = iArr[i3];
                if (i12 < 0) {
                    _writeIntMinimal(32, (-i12) - 1);
                } else {
                    _writeIntMinimal(0, i12);
                }
                i3++;
            }
            return;
        }
        int i13 = i10 + i3;
        while (i3 < i13) {
            int i14 = iArr[i3];
            if (i14 < 0) {
                _writeIntFull(32, (-i14) - 1);
            } else {
                _writeIntFull(0, i14);
            }
            i3++;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i3, int i10) throws IOException {
        if (bArr == null) {
            writeNull();
            return;
        }
        _verifyValueWrite(StubApp.getString2(11166));
        _writeLengthMarker(64, i10);
        _writeBytes(bArr, i3, i10);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z2) throws IOException {
        _verifyValueWrite(StubApp.getString2(11168));
        if (z2) {
            _writeByte((byte) -11);
        } else {
            _writeByte((byte) -12);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
        if (!this._streamWriteContext.inArray()) {
            _reportError(StubApp.getString2(10461) + this._streamWriteContext.typeDesc());
        }
        closeComplexElement();
        this._streamWriteContext = this._streamWriteContext.getParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
        if (!this._streamWriteContext.inObject()) {
            _reportError(StubApp.getString2(10462) + this._streamWriteContext.typeDesc());
        }
        closeComplexElement();
        this._streamWriteContext = this._streamWriteContext.getParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeFieldId(long j) throws IOException {
        if (!this._streamWriteContext.writeFieldId(j)) {
            _reportError(StubApp.getString2(11169));
        }
        _writeLongNoCheck(j);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeFieldName(String str) throws IOException {
        if (!this._streamWriteContext.writeFieldName(str)) {
            _reportError(StubApp.getString2(10456));
        }
        _writeString(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite(StubApp.getString2(11170));
        _writeByte((byte) -10);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i3) throws IOException {
        int i10;
        byte b2;
        int i11;
        _verifyValueWrite(StubApp.getString2(11171));
        if (i3 < 0) {
            i3 = (-i3) - 1;
            i10 = 32;
        } else {
            i10 = 0;
        }
        _ensureRoomForOutput(5);
        if (!this._cfgMinimalInts) {
            b2 = (byte) i3;
            i11 = i3 >> 8;
        } else {
            if (i3 < 24) {
                byte[] bArr = this._outputBuffer;
                int i12 = this._outputTail;
                this._outputTail = i12 + 1;
                bArr[i12] = (byte) (i10 + i3);
                return;
            }
            if (i3 <= 255) {
                byte[] bArr2 = this._outputBuffer;
                int i13 = this._outputTail;
                int i14 = i13 + 1;
                this._outputTail = i14;
                bArr2[i13] = (byte) (i10 + 24);
                this._outputTail = i13 + 2;
                bArr2[i14] = (byte) i3;
                return;
            }
            b2 = (byte) i3;
            i11 = i3 >> 8;
            if (i11 <= 255) {
                byte[] bArr3 = this._outputBuffer;
                int i15 = this._outputTail;
                int i16 = i15 + 1;
                this._outputTail = i16;
                bArr3[i15] = (byte) (i10 + 25);
                int i17 = i15 + 2;
                this._outputTail = i17;
                bArr3[i16] = (byte) i11;
                this._outputTail = i15 + 3;
                bArr3[i17] = b2;
                return;
            }
        }
        byte[] bArr4 = this._outputBuffer;
        int i18 = this._outputTail;
        int i19 = i18 + 1;
        this._outputTail = i19;
        bArr4[i18] = (byte) (i10 + 26);
        int i20 = i18 + 2;
        this._outputTail = i20;
        bArr4[i19] = (byte) (i11 >> 16);
        int i21 = i18 + 3;
        this._outputTail = i21;
        bArr4[i20] = (byte) (i11 >> 8);
        int i22 = i18 + 4;
        this._outputTail = i22;
        bArr4[i21] = (byte) i11;
        this._outputTail = i18 + 5;
        bArr4[i22] = b2;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        throw _notSupported();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) throws IOException {
        throw _notSupported();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
        _verifyValueWrite(StubApp.getString2(10466));
        this._streamWriteContext = this._streamWriteContext.createChildArrayContext(null);
        if (this._elementCountsPtr > 0) {
            _pushRemainingElements();
        }
        this._currentRemainingElements = -2;
        _writeByte((byte) -97);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
        _verifyValueWrite(StubApp.getString2(10467));
        this._streamWriteContext = this._streamWriteContext.createChildObjectContext(null);
        if (this._elementCountsPtr > 0) {
            _pushRemainingElements();
        }
        this._currentRemainingElements = -2;
        _writeByte((byte) -65);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        if (str == null) {
            writeNull();
        } else {
            _verifyValueWrite(StubApp.getString2(11172));
            _writeString(str);
        }
    }

    public void writeTag(int i3) throws IOException {
        if (i3 < 0) {
            throw new IllegalArgumentException(h.g(i3, StubApp.getString2(11173), StubApp.getString2(74)));
        }
        _writeLengthMarker(192, i3);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i3, int i10) throws IOException {
        throw _notSupported();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c10) throws IOException {
        throw _notSupported();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeFieldName(SerializableString serializableString) throws IOException {
        if (!this._streamWriteContext.writeFieldName(serializableString.getValue())) {
            _reportError(StubApp.getString2(10456));
        }
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = asUnquotedUTF8.length;
        if (length == 0) {
            _writeByte((byte) 96);
        } else {
            _writeLengthMarker(96, length);
            _writeBytes(asUnquotedUTF8, 0, length);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite(StubApp.getString2(11172));
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = asUnquotedUTF8.length;
        if (length == 0) {
            _writeByte((byte) 96);
        } else {
            _writeLengthMarker(96, length);
            _writeBytes(asUnquotedUTF8, 0, length);
        }
    }

    private final int _encode(int i3, String str, int i10) throws IOException {
        byte[] bArr = this._outputBuffer;
        int i11 = i3;
        int i12 = 0;
        while (i12 < i10) {
            char charAt = str.charAt(i12);
            if (charAt > 127) {
                return _encode2(i12, i11, str, i10, i3);
            }
            bArr[i11] = (byte) charAt;
            i12++;
            i11++;
            str = str;
            i3 = i3;
        }
        return i11 - i3;
    }

    private final int _writeBytes(InputStream inputStream, int i3) throws IOException {
        while (i3 > 0) {
            int i10 = this._outputEnd - this._outputTail;
            if (i10 <= 0) {
                _flushBuffer();
                i10 = this._outputEnd - this._outputTail;
            }
            int read = inputStream.read(this._outputBuffer, this._outputTail, i10);
            if (read < 0) {
                break;
            }
            this._outputTail += read;
            i3 -= read;
        }
        return i3;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(InputStream inputStream, int i3) throws IOException {
        if (i3 >= 0) {
            _verifyValueWrite(StubApp.getString2(11166));
            _writeLengthMarker(64, i3);
            int _writeBytes = _writeBytes(inputStream, i3);
            if (_writeBytes > 0) {
                _reportError(AbstractC1482f.e(_writeBytes, StubApp.getString2(10457), i3, StubApp.getString2(10459), StubApp.getString2(74)));
            }
            return i3;
        }
        throw new UnsupportedOperationException(StubApp.getString2(11167));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj) throws IOException {
        _verifyValueWrite(StubApp.getString2(10466));
        this._streamWriteContext = this._streamWriteContext.createChildArrayContext(obj);
        if (this._elementCountsPtr > 0) {
            _pushRemainingElements();
        }
        this._currentRemainingElements = -2;
        _writeByte((byte) -97);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite(StubApp.getString2(10467));
        this._streamWriteContext = this._streamWriteContext.createChildObjectContext(obj);
        if (this._elementCountsPtr > 0) {
            _pushRemainingElements();
        }
        this._currentRemainingElements = -2;
        _writeByte((byte) -65);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i3, int i10) throws IOException {
        _verifyValueWrite(StubApp.getString2(11172));
        if (i10 == 0) {
            _writeByte((byte) 96);
        } else {
            _writeString(cArr, i3, i10);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeArray(long[] jArr, int i3, int i10) throws IOException {
        _verifyOffsets(jArr.length, i3, i10);
        _verifyValueWrite(StubApp.getString2(11165));
        _writeLengthMarker(128, i10);
        int i11 = i10 + i3;
        while (i3 < i11) {
            _writeLongNoCheck(jArr[i3]);
            i3++;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj, int i3) throws IOException {
        _verifyValueWrite(StubApp.getString2(10466));
        this._streamWriteContext = this._streamWriteContext.createChildArrayContext(obj);
        _pushRemainingElements();
        this._currentRemainingElements = i3;
        _writeLengthMarker(128, i3);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj, int i3) throws IOException {
        _verifyValueWrite(StubApp.getString2(10467));
        this._streamWriteContext = this._streamWriteContext.createChildObjectContext(obj);
        _pushRemainingElements();
        this._currentRemainingElements = i3;
        _writeLengthMarker(160, i3);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeArray(double[] dArr, int i3, int i10) throws IOException {
        _verifyOffsets(dArr.length, i3, i10);
        _verifyValueWrite(StubApp.getString2(11165));
        _writeLengthMarker(128, i10);
        int i11 = i10 + i3;
        while (i3 < i11) {
            _writeDoubleNoCheck(dArr[i3]);
            i3++;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j) throws IOException {
        _verifyValueWrite(StubApp.getString2(11171));
        if (this._cfgMinimalInts) {
            if (j >= 0) {
                if (j < 4294967296L) {
                    _writeIntMinimal(0, (int) j);
                    return;
                }
            } else if (j >= -4294967296L) {
                _writeIntMinimal(32, (int) ((-j) - 1));
                return;
            }
        }
        _ensureRoomForOutput(9);
        if (j < 0) {
            j = -(j + 1);
            byte[] bArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr[i3] = 59;
        } else {
            byte[] bArr2 = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr2[i10] = 27;
        }
        int i11 = (int) (j >> 32);
        byte[] bArr3 = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr3[i12] = (byte) (i11 >> 24);
        int i14 = i12 + 2;
        this._outputTail = i14;
        bArr3[i13] = (byte) (i11 >> 16);
        int i15 = i12 + 3;
        this._outputTail = i15;
        bArr3[i14] = (byte) (i11 >> 8);
        int i16 = i12 + 4;
        this._outputTail = i16;
        bArr3[i15] = (byte) i11;
        int i17 = (int) j;
        int i18 = i12 + 5;
        this._outputTail = i18;
        bArr3[i16] = (byte) (i17 >> 24);
        int i19 = i12 + 6;
        this._outputTail = i19;
        bArr3[i18] = (byte) (i17 >> 16);
        int i20 = i12 + 7;
        this._outputTail = i20;
        bArr3[i19] = (byte) (i17 >> 8);
        this._outputTail = i12 + 8;
        bArr3[i20] = (byte) i17;
    }

    public final void _writeString(char[] cArr, int i3, int i10) throws IOException {
        if (i10 <= 23) {
            _ensureSpace(71);
            int _encode = _encode(this._outputTail + 1, cArr, i3, i10 + i3);
            byte[] bArr = this._outputBuffer;
            int i11 = this._outputTail;
            if (_encode <= 23) {
                bArr[i11] = (byte) (_encode + 96);
                this._outputTail = i11 + 1 + _encode;
                return;
            }
            int i12 = i11 + 1;
            System.arraycopy(bArr, i12, bArr, i11 + 2, _encode);
            bArr[i11] = 120;
            bArr[i12] = (byte) _encode;
            this._outputTail = i11 + 2 + _encode;
            return;
        }
        if (i10 > 255) {
            if (i10 <= 3996) {
                _ensureSpace(11991);
                int i13 = this._outputTail;
                int _encode2 = _encode(i13 + 3, cArr, i3, i10 + i3);
                byte[] bArr2 = this._outputBuffer;
                bArr2[i13] = 121;
                bArr2[i13 + 1] = (byte) (_encode2 >> 8);
                bArr2[i13 + 2] = (byte) _encode2;
                this._outputTail = i13 + 3 + _encode2;
                return;
            }
            _writeChunkedString(cArr, i3, i10);
            return;
        }
        _ensureSpace(768);
        int _encode3 = _encode(this._outputTail + 2, cArr, i3, i10 + i3);
        byte[] bArr3 = this._outputBuffer;
        int i14 = this._outputTail;
        if (_encode3 <= 255) {
            bArr3[i14] = 120;
            bArr3[i14 + 1] = (byte) _encode3;
            this._outputTail = i14 + 2 + _encode3;
            return;
        }
        System.arraycopy(bArr3, i14 + 2, bArr3, i14 + 3, _encode3);
        bArr3[i14] = 121;
        bArr3[i14 + 1] = (byte) (_encode3 >> 8);
        bArr3[i14 + 2] = (byte) _encode3;
        this._outputTail = i14 + 3 + _encode3;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i3) throws IOException {
        return writeBinary(inputStream, i3);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            writeNull();
        } else {
            _verifyValueWrite(StubApp.getString2(11171));
            _write(bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d8) throws IOException {
        _verifyValueWrite(StubApp.getString2(11171));
        _ensureRoomForOutput(11);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d8);
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i10 = i3 + 1;
        this._outputTail = i10;
        bArr[i3] = -5;
        int i11 = (int) (doubleToRawLongBits >> 32);
        int i12 = i3 + 2;
        this._outputTail = i12;
        bArr[i10] = (byte) (i11 >> 24);
        int i13 = i3 + 3;
        this._outputTail = i13;
        bArr[i12] = (byte) (i11 >> 16);
        int i14 = i3 + 4;
        this._outputTail = i14;
        bArr[i13] = (byte) (i11 >> 8);
        int i15 = i3 + 5;
        this._outputTail = i15;
        bArr[i14] = (byte) i11;
        int i16 = (int) doubleToRawLongBits;
        int i17 = i3 + 6;
        this._outputTail = i17;
        bArr[i15] = (byte) (i16 >> 24);
        int i18 = i3 + 7;
        this._outputTail = i18;
        bArr[i17] = (byte) (i16 >> 16);
        int i19 = i3 + 8;
        this._outputTail = i19;
        bArr[i18] = (byte) (i16 >> 8);
        this._outputTail = i3 + 9;
        bArr[i19] = (byte) i16;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f10) throws IOException {
        _ensureRoomForOutput(6);
        _verifyValueWrite(StubApp.getString2(11171));
        int floatToRawIntBits = Float.floatToRawIntBits(f10);
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i10 = i3 + 1;
        this._outputTail = i10;
        bArr[i3] = -6;
        int i11 = i3 + 2;
        this._outputTail = i11;
        bArr[i10] = (byte) (floatToRawIntBits >> 24);
        int i12 = i3 + 3;
        this._outputTail = i12;
        bArr[i11] = (byte) (floatToRawIntBits >> 16);
        int i13 = i3 + 4;
        this._outputTail = i13;
        bArr[i12] = (byte) (floatToRawIntBits >> 8);
        this._outputTail = i3 + 5;
        bArr[i13] = (byte) floatToRawIntBits;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            writeNull();
            return;
        }
        _verifyValueWrite(StubApp.getString2(11171));
        _writeByte((byte) -60);
        _writeByte((byte) -126);
        _writeIntValue(-bigDecimal.scale());
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        int bitLength = unscaledValue.bitLength();
        if (bitLength <= 31) {
            _writeIntValue(unscaledValue.intValue());
        } else if (bitLength <= 63) {
            _writeLongValue(unscaledValue.longValue());
        } else {
            _write(unscaledValue);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException, JsonGenerationException, UnsupportedOperationException {
        writeString(str);
    }
}
