package com.fasterxml.jackson.dataformat.cbor;

import Xa.h;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeature;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CBORParser extends ParserMinimalBase {
    static final BigDecimal BD_MAX_INT;
    static final BigDecimal BD_MAX_LONG;
    static final BigDecimal BD_MIN_INT;
    static final BigDecimal BD_MIN_LONG;
    private static final BigInteger BIT_63;
    static final BigInteger BI_MAX_INT;
    static final BigInteger BI_MAX_LONG;
    static final BigInteger BI_MIN_INT;
    static final BigInteger BI_MIN_LONG;
    protected byte[] _binaryValue;
    protected boolean _bufferRecyclable;
    protected ByteArrayBuilder _byteArrayBuilder;
    private int _chunkEnd;
    private int _chunkLeft;
    protected boolean _closed;
    protected long _currInputProcessed;
    protected int _currInputRow;
    protected int _currInputRowStart;
    protected byte[] _inputBuffer;
    protected int _inputEnd;
    protected int _inputPtr;
    protected InputStream _inputStream;
    protected final IOContext _ioContext;
    protected boolean _nameCopied;
    protected char[] _nameCopyBuffer;
    protected int _numTypesValid;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected float _numberFloat;
    protected int _numberInt;
    protected long _numberLong;
    protected ObjectCodec _objectCodec;
    protected int _quad1;
    protected int _quad2;
    protected int _quad3;
    protected int[] _quadBuffer;
    protected CBORReadContext _streamReadContext;
    protected final ByteQuadsCanonicalizer _symbols;
    protected final boolean _symbolsCanonical;
    protected int _tagValue;
    protected final TextBuffer _textBuffer;
    protected boolean _tokenIncomplete;
    protected int _tokenInputCol;
    protected int _tokenInputRow;
    protected long _tokenInputTotal;
    protected int _typeByte;
    private static final Charset UTF8 = StandardCharsets.UTF_8;
    private static final int[] UTF8_UNIT_CODES = CBORConstants.sUtf8UnitLengths;
    private static final double MATH_POW_2_10 = Math.pow(2.0d, 10.0d);
    private static final double MATH_POW_2_NEG14 = Math.pow(2.0d, -14.0d);
    protected static final JacksonFeatureSet<StreamReadCapability> CBOR_READ_CAPABILITIES = JsonParser.DEFAULT_READ_CAPABILITIES.with(StreamReadCapability.EXACT_FLOATS);

    public enum Feature implements JacksonFeature {
        ;

        public static int collectDefaults() {
            Feature[] values = values();
            if (values.length <= 0) {
                return 0;
            }
            Feature feature = values[0];
            throw null;
        }

        public static Feature valueOf(String str) {
            h.x(Enum.valueOf(Feature.class, str));
            throw null;
        }
    }

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        BI_MIN_INT = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        BI_MAX_INT = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        BI_MIN_LONG = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(LongCompanionObject.MAX_VALUE);
        BI_MAX_LONG = valueOf4;
        BD_MIN_LONG = new BigDecimal(valueOf3);
        BD_MAX_LONG = new BigDecimal(valueOf4);
        BD_MIN_INT = new BigDecimal(valueOf);
        BD_MAX_INT = new BigDecimal(valueOf2);
        BIT_63 = BigInteger.ONE.shiftLeft(63);
    }

    public CBORParser(IOContext iOContext, int i3, int i10, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, InputStream inputStream, byte[] bArr, int i11, int i12, boolean z2) {
        super(i3);
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._currInputProcessed = 0L;
        this._currInputRow = 1;
        this._currInputRowStart = 0;
        this._tokenInputTotal = 0L;
        this._tokenInputRow = 1;
        this._tokenInputCol = 0;
        this._nameCopyBuffer = null;
        this._nameCopied = false;
        this._byteArrayBuilder = null;
        this._tagValue = -1;
        this._tokenIncomplete = false;
        this._quadBuffer = ParserMinimalBase.NO_INTS;
        this._numTypesValid = 0;
        this._ioContext = iOContext;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._symbolsCanonical = byteQuadsCanonicalizer.isCanonicalizing();
        this._inputStream = inputStream;
        this._inputBuffer = bArr;
        this._inputPtr = i11;
        this._inputEnd = i12;
        this._bufferRecyclable = z2;
        this._textBuffer = iOContext.constructTextBuffer();
        this._streamReadContext = CBORReadContext.createRootContext(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i3) ? DupDetector.rootDetector(this) : null);
        this._tokenInputRow = -1;
        this._tokenInputCol = -1;
    }

    private final String _addDecodedToSymbols(int i3, String str) {
        if (i3 < 5) {
            return this._symbols.addName(str, this._quad1);
        }
        if (i3 < 9) {
            return this._symbols.addName(str, this._quad1, this._quad2);
        }
        if (i3 < 13) {
            return this._symbols.addName(str, this._quad1, this._quad2, this._quad3);
        }
        return this._symbols.addName(str, this._quadBuffer, (i3 + 3) >> 2);
    }

    private final BigInteger _bigNegative(long j) {
        return _bigPositive(j).negate().subtract(BigInteger.ONE);
    }

    private final BigInteger _bigPositive(long j) {
        return BigInteger.valueOf((j << 1) >>> 1).or(BIT_63);
    }

    private final int _decode16Bits() throws IOException {
        int i3 = this._inputPtr;
        int i10 = i3 + 1;
        if (i10 >= this._inputEnd) {
            return _slow16();
        }
        byte[] bArr = this._inputBuffer;
        int i11 = ((bArr[i3] & UByte.MAX_VALUE) << 8) + (bArr[i10] & UByte.MAX_VALUE);
        this._inputPtr = i3 + 2;
        return i11;
    }

    private final int _decode32Bits() throws IOException {
        int i3 = this._inputPtr;
        if (i3 + 3 >= this._inputEnd) {
            return _slow32();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = (bArr[i3] << 24) + ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8);
        int i11 = i10 + (bArr[i3 + 3] & UByte.MAX_VALUE);
        this._inputPtr = i3 + 4;
        return i11;
    }

    private final long _decode64Bits() throws IOException {
        int i3 = this._inputPtr;
        if (i3 + 7 >= this._inputEnd) {
            return _slow64();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = (bArr[i3] << 24) + ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8) + (bArr[i3 + 3] & UByte.MAX_VALUE);
        int i11 = (bArr[i3 + 4] << 24) + ((bArr[i3 + 5] & UByte.MAX_VALUE) << 16) + ((bArr[i3 + 6] & UByte.MAX_VALUE) << 8);
        int i12 = i11 + (bArr[i3 + 7] & UByte.MAX_VALUE);
        this._inputPtr = i3 + 8;
        return _long(i10, i12);
    }

    private final int _decode8Bits() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        return bArr[i3] & UByte.MAX_VALUE;
    }

    private int _decodeChunkLength(int i3) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        byte b2 = bArr[i10];
        int i11 = b2 & UByte.MAX_VALUE;
        if (i11 == 255) {
            return -1;
        }
        int i12 = i11 >> 5;
        if (i12 != i3) {
            throw _constructError(String.format(StubApp.getString2(11175), Integer.valueOf(i3), Integer.valueOf(i12), Integer.valueOf(i11)));
        }
        int _decodeExplicitLength = _decodeExplicitLength(b2 & 31);
        if (_decodeExplicitLength >= 0) {
            return _decodeExplicitLength;
        }
        throw _constructReadException(StubApp.getString2(11174), Integer.valueOf(i3));
    }

    private final String _decodeChunkedName() throws IOException {
        _finishChunkedText();
        return this._textBuffer.contentsAsString();
    }

    private final int _decodeChunkedUTF8_3(int i3) throws IOException {
        int i10 = i3 & 15;
        int _nextChunkedByte = _nextChunkedByte();
        if ((_nextChunkedByte & 192) != 128) {
            _reportInvalidOther(_nextChunkedByte & 255, this._inputPtr);
        }
        int i11 = (i10 << 6) | (_nextChunkedByte & 63);
        int _nextChunkedByte2 = _nextChunkedByte();
        if ((_nextChunkedByte2 & 192) != 128) {
            _reportInvalidOther(_nextChunkedByte2 & 255, this._inputPtr);
        }
        return (i11 << 6) | (_nextChunkedByte2 & 63);
    }

    private final int _decodeChunkedUTF8_4(int i3) throws IOException {
        int _nextChunkedByte = _nextChunkedByte();
        if ((_nextChunkedByte & 192) != 128) {
            _reportInvalidOther(_nextChunkedByte & 255, this._inputPtr);
        }
        int i10 = ((i3 & 7) << 6) | (_nextChunkedByte & 63);
        int _nextChunkedByte2 = _nextChunkedByte();
        if ((_nextChunkedByte2 & 192) != 128) {
            _reportInvalidOther(_nextChunkedByte2 & 255, this._inputPtr);
        }
        int i11 = (i10 << 6) | (_nextChunkedByte2 & 63);
        int _nextChunkedByte3 = _nextChunkedByte();
        if ((_nextChunkedByte3 & 192) != 128) {
            _reportInvalidOther(_nextChunkedByte3 & 255, this._inputPtr);
        }
        return ((i11 << 6) | (_nextChunkedByte3 & 63)) - PKIFailureInfo.notAuthorized;
    }

    private final String _decodeContiguousName(int i3) throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (emptyAndGetCurrentSegment.length < i3) {
            emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment(i3);
        }
        int i10 = this._inputPtr;
        this._inputPtr = i10 + i3;
        int[] iArr = UTF8_UNIT_CODES;
        byte[] bArr = this._inputBuffer;
        int i11 = i10 + i3;
        int i12 = 0;
        while (true) {
            int i13 = bArr[i10] & UByte.MAX_VALUE;
            if (iArr[i13] != 0) {
                while (i10 < i11) {
                    int i14 = i10 + 1;
                    byte b2 = bArr[i10];
                    int i15 = b2 & UByte.MAX_VALUE;
                    int i16 = iArr[i15];
                    if (i16 != 0) {
                        if (i14 + i16 > i11) {
                            _reportTruncatedUTF8InName(i3, (i3 - (i11 - i14)) - 1, i15, i16);
                        }
                        if (i16 == 1) {
                            i10 += 2;
                            byte b10 = bArr[i14];
                            if ((b10 & 192) != 128) {
                                _reportInvalidOther(b10 & UByte.MAX_VALUE, i10);
                            }
                            i15 = ((b2 & 31) << 6) | (b10 & 63);
                        } else if (i16 == 2) {
                            int i17 = i10 + 2;
                            byte b11 = bArr[i14];
                            if ((b11 & 192) != 128) {
                                _reportInvalidOther(b11 & UByte.MAX_VALUE, i17);
                            }
                            i10 += 3;
                            byte b12 = bArr[i17];
                            if ((b12 & 192) != 128) {
                                _reportInvalidOther(b12 & UByte.MAX_VALUE, i10);
                            }
                            i15 = ((b11 & 63) << 6) | ((b2 & 15) << 12) | (b12 & 63);
                        } else {
                            if (i16 != 3) {
                                throw _constructReadException(StubApp.getString2(11176), Integer.toHexString(i15));
                            }
                            int i18 = ((bArr[i14] & 63) << 12) | ((b2 & 7) << 18);
                            int i19 = i10 + 3;
                            int i20 = i18 | ((bArr[i10 + 2] & 63) << 6);
                            i10 += 4;
                            int i21 = (i20 | (bArr[i19] & 63)) - PKIFailureInfo.notAuthorized;
                            emptyAndGetCurrentSegment[i12] = (char) ((i21 >> 10) | 55296);
                            i15 = (i21 & 1023) | 56320;
                            i12++;
                        }
                    } else {
                        i10 = i14;
                    }
                    emptyAndGetCurrentSegment[i12] = (char) i15;
                    i12++;
                }
                return this._textBuffer.setCurrentAndReturn(i12);
            }
            int i22 = i12 + 1;
            emptyAndGetCurrentSegment[i12] = (char) i13;
            i10++;
            if (i10 == i11) {
                return this._textBuffer.setCurrentAndReturn(i22);
            }
            i12 = i22;
        }
    }

    private final int _decodeExplicitLength(int i3) throws IOException {
        if (i3 == 31) {
            return -1;
        }
        if (i3 <= 23) {
            return i3;
        }
        int i10 = i3 - 24;
        if (i10 == 0) {
            return _decode8Bits();
        }
        if (i10 == 1) {
            return _decode16Bits();
        }
        if (i10 == 2) {
            return _decode32Bits();
        }
        if (i10 != 3) {
            throw _constructError(String.format(StubApp.getString2(11178), currentToken(), Integer.valueOf(i3)));
        }
        long _decode64Bits = _decode64Bits();
        if (_decode64Bits >= 0 && _decode64Bits <= 2147483647L) {
            return (int) _decode64Bits;
        }
        throw _constructError(StubApp.getString2(11177) + currentToken() + StubApp.getString2(994) + _decode64Bits);
    }

    private float _decodeHalfSizeFloat() throws IOException {
        int _decode16Bits = _decode16Bits();
        int i3 = 65535 & _decode16Bits;
        boolean z2 = (i3 >> 15) != 0;
        int i10 = (i3 >> 10) & 31;
        int i11 = _decode16Bits & 1023;
        if (i10 == 0) {
            float f10 = (float) ((i11 / MATH_POW_2_10) * MATH_POW_2_NEG14);
            return z2 ? -f10 : f10;
        }
        if (i10 != 31) {
            float pow = (float) (((i11 / MATH_POW_2_10) + 1.0d) * Math.pow(2.0d, i10 - 15));
            return z2 ? -pow : pow;
        }
        if (i11 != 0) {
            return Float.NaN;
        }
        return z2 ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
    }

    private final String _decodeLongerName(int i3) throws IOException {
        if (i3 == 0) {
            return "";
        }
        if (this._inputEnd - this._inputPtr < i3) {
            if (i3 >= this._inputBuffer.length) {
                _finishLongText(i3);
                return this._textBuffer.contentsAsString();
            }
            _loadToHaveAtLeast(i3);
        }
        if (!this._symbolsCanonical) {
            return _decodeContiguousName(i3);
        }
        String _findDecodedFromSymbols = _findDecodedFromSymbols(i3);
        if (_findDecodedFromSymbols == null) {
            return _addDecodedToSymbols(i3, _decodeContiguousName(i3));
        }
        this._inputPtr += i3;
        return _findDecodedFromSymbols;
    }

    private final int _decodeTag(int i3) throws IOException {
        if (i3 <= 23) {
            return i3;
        }
        int i10 = i3 - 24;
        if (i10 == 0) {
            return _decode8Bits();
        }
        if (i10 == 1) {
            return _decode16Bits();
        }
        if (i10 == 2) {
            return _decode32Bits();
        }
        if (i10 != 3) {
            throw _constructReadException(StubApp.getString2(11180), Integer.toHexString(i3));
        }
        long _decode64Bits = _decode64Bits();
        if (_decode64Bits >= -2147483648L && _decode64Bits <= 2147483647L) {
            return (int) _decode64Bits;
        }
        throw _constructReadException(StubApp.getString2(11179), Long.valueOf(_decode64Bits));
    }

    private final int _decodeUTF8_3(int i3) throws IOException {
        int i10 = i3 & 15;
        int _nextByte = _nextByte();
        if ((_nextByte & 192) != 128) {
            _reportInvalidOther(_nextByte & 255, this._inputPtr);
        }
        int i11 = (i10 << 6) | (_nextByte & 63);
        int _nextByte2 = _nextByte();
        if ((_nextByte2 & 192) != 128) {
            _reportInvalidOther(_nextByte2 & 255, this._inputPtr);
        }
        return (i11 << 6) | (_nextByte2 & 63);
    }

    private final int _decodeUTF8_4(int i3) throws IOException {
        int _nextByte = _nextByte();
        if ((_nextByte & 192) != 128) {
            _reportInvalidOther(_nextByte & 255, this._inputPtr);
        }
        int i10 = ((i3 & 7) << 6) | (_nextByte & 63);
        int _nextByte2 = _nextByte();
        if ((_nextByte2 & 192) != 128) {
            _reportInvalidOther(_nextByte2 & 255, this._inputPtr);
        }
        int i11 = (i10 << 6) | (_nextByte2 & 63);
        int _nextByte3 = _nextByte();
        if ((_nextByte3 & 192) != 128) {
            _reportInvalidOther(_nextByte3 & 255, this._inputPtr);
        }
        return ((i11 << 6) | (_nextByte3 & 63)) - PKIFailureInfo.notAuthorized;
    }

    private final String _findDecodedFromSymbols(int i3) throws IOException {
        if (i3 < 5) {
            int i10 = this._inputPtr;
            byte[] bArr = this._inputBuffer;
            int _padQuadForNulls = _padQuadForNulls(bArr[i10]);
            if (i3 > 1) {
                _padQuadForNulls = (bArr[i10 + 1] & UByte.MAX_VALUE) + (_padQuadForNulls << 8);
                if (i3 > 2) {
                    _padQuadForNulls = (_padQuadForNulls << 8) + (bArr[i10 + 2] & UByte.MAX_VALUE);
                    if (i3 > 3) {
                        _padQuadForNulls = (_padQuadForNulls << 8) + (bArr[i10 + 3] & UByte.MAX_VALUE);
                    }
                }
            }
            this._quad1 = _padQuadForNulls;
            return this._symbols.findName(_padQuadForNulls);
        }
        byte[] bArr2 = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 4;
        int i13 = (((((bArr2[i11 + 1] & UByte.MAX_VALUE) | ((bArr2[i11] & UByte.MAX_VALUE) << 8)) << 8) | (bArr2[i11 + 2] & UByte.MAX_VALUE)) << 8) | (bArr2[i11 + 3] & UByte.MAX_VALUE);
        if (i3 < 9) {
            int i14 = i11 + 5;
            int _padQuadForNulls2 = _padQuadForNulls(bArr2[i12]);
            int i15 = i3 - 5;
            if (i15 > 0) {
                int i16 = _padQuadForNulls2 << 8;
                int i17 = i11 + 6;
                int i18 = i16 + (bArr2[i14] & UByte.MAX_VALUE);
                if (i15 > 1) {
                    int i19 = i11 + 7;
                    _padQuadForNulls2 = (i18 << 8) + (bArr2[i17] & UByte.MAX_VALUE);
                    if (i15 > 2) {
                        _padQuadForNulls2 = (_padQuadForNulls2 << 8) + (bArr2[i19] & UByte.MAX_VALUE);
                    }
                } else {
                    _padQuadForNulls2 = i18;
                }
            }
            this._quad1 = i13;
            this._quad2 = _padQuadForNulls2;
            return this._symbols.findName(i13, _padQuadForNulls2);
        }
        int i20 = i11 + 8;
        int i21 = (((((bArr2[i11 + 5] & UByte.MAX_VALUE) | ((bArr2[i12] & UByte.MAX_VALUE) << 8)) << 8) | (bArr2[i11 + 6] & UByte.MAX_VALUE)) << 8) | (bArr2[i11 + 7] & UByte.MAX_VALUE);
        if (i3 >= 13) {
            return _findDecodedLong(i3, i13, i21);
        }
        int i22 = i11 + 9;
        int _padQuadForNulls3 = _padQuadForNulls(bArr2[i20]);
        int i23 = i3 - 9;
        if (i23 > 0) {
            int i24 = _padQuadForNulls3 << 8;
            int i25 = i11 + 10;
            int i26 = i24 + (bArr2[i22] & UByte.MAX_VALUE);
            if (i23 > 1) {
                int i27 = i11 + 11;
                _padQuadForNulls3 = (i26 << 8) + (bArr2[i25] & UByte.MAX_VALUE);
                if (i23 > 2) {
                    _padQuadForNulls3 = (_padQuadForNulls3 << 8) + (bArr2[i27] & UByte.MAX_VALUE);
                }
            } else {
                _padQuadForNulls3 = i26;
            }
        }
        this._quad1 = i13;
        this._quad2 = i21;
        this._quad3 = _padQuadForNulls3;
        return this._symbols.findName(i13, i21, _padQuadForNulls3);
    }

    private final String _findDecodedLong(int i3, int i10, int i11) throws IOException {
        int i12;
        int i13;
        int i14 = (i3 + 3) >> 2;
        int[] iArr = this._quadBuffer;
        if (i14 > iArr.length) {
            this._quadBuffer = _growArrayTo(iArr, i14);
        }
        int[] iArr2 = this._quadBuffer;
        iArr2[0] = i10;
        iArr2[1] = i11;
        int i15 = this._inputPtr + 8;
        int i16 = i3 - 8;
        byte[] bArr = this._inputBuffer;
        int i17 = 2;
        while (true) {
            i12 = i15 + 4;
            i13 = i17 + 1;
            this._quadBuffer[i17] = (((((bArr[i15 + 1] & UByte.MAX_VALUE) | ((bArr[i15] & UByte.MAX_VALUE) << 8)) << 8) | (bArr[i15 + 2] & UByte.MAX_VALUE)) << 8) | (bArr[i15 + 3] & UByte.MAX_VALUE);
            i16 -= 4;
            if (i16 <= 3) {
                break;
            }
            i15 = i12;
            i17 = i13;
        }
        if (i16 > 0) {
            int _padQuadForNulls = _padQuadForNulls(bArr[i12]);
            if (i16 > 1) {
                _padQuadForNulls = (bArr[i15 + 5] & UByte.MAX_VALUE) + (_padQuadForNulls << 8);
                if (i16 > 2) {
                    _padQuadForNulls = (_padQuadForNulls << 8) + (bArr[i15 + 6] & UByte.MAX_VALUE);
                }
            }
            this._quadBuffer[i13] = _padQuadForNulls;
            i13 = i17 + 2;
        }
        return this._symbols.findName(this._quadBuffer, i13);
    }

    private final void _finishChunkedText() throws IOException {
        int i3;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = UTF8_UNIT_CODES;
        int length = emptyAndGetCurrentSegment.length;
        byte[] bArr = this._inputBuffer;
        this._chunkEnd = this._inputPtr;
        this._chunkLeft = 0;
        int i10 = 0;
        while (true) {
            if (this._inputPtr >= this._chunkEnd) {
                if (this._chunkLeft == 0) {
                    int _decodeChunkLength = _decodeChunkLength(3);
                    if (_decodeChunkLength > 0) {
                        this._chunkLeft = _decodeChunkLength;
                        int i11 = this._inputPtr + _decodeChunkLength;
                        int i12 = this._inputEnd;
                        if (i11 <= i12) {
                            this._chunkLeft = 0;
                            this._chunkEnd = i11;
                        } else {
                            this._chunkLeft = i11 - i12;
                            this._chunkEnd = i12;
                        }
                    } else if (_decodeChunkLength != 0) {
                        this._textBuffer.setCurrentLength(i10);
                        return;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    loadMoreGuaranteed();
                    int i13 = this._inputPtr + this._chunkLeft;
                    int i14 = this._inputEnd;
                    if (i13 <= i14) {
                        this._chunkLeft = 0;
                        this._chunkEnd = i13;
                    } else {
                        this._chunkLeft = i13 - i14;
                        this._chunkEnd = i14;
                    }
                }
            }
            int i15 = this._inputPtr;
            this._inputPtr = i15 + 1;
            byte b2 = bArr[i15];
            int i16 = b2 & UByte.MAX_VALUE;
            int i17 = iArr[i16];
            if (i17 != 0 || i10 >= length) {
                if (i17 != 0) {
                    if (i17 == 1) {
                        int _nextChunkedByte = _nextChunkedByte();
                        if ((_nextChunkedByte & 192) != 128) {
                            _reportInvalidOther(_nextChunkedByte & 255, this._inputPtr);
                        }
                        i16 = (_nextChunkedByte & 63) | ((b2 & 31) << 6);
                    } else if (i17 == 2) {
                        i16 = _decodeChunkedUTF8_3(i16);
                    } else if (i17 != 3) {
                        _reportInvalidChar(i16);
                    } else {
                        int _decodeChunkedUTF8_4 = _decodeChunkedUTF8_4(i16);
                        if (i10 >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            length = emptyAndGetCurrentSegment.length;
                            i10 = 0;
                        }
                        emptyAndGetCurrentSegment[i10] = (char) ((_decodeChunkedUTF8_4 >> 10) | 55296);
                        i16 = (_decodeChunkedUTF8_4 & 1023) | 56320;
                        i10++;
                    }
                }
                if (i10 >= length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    length = emptyAndGetCurrentSegment.length;
                    i10 = 0;
                }
                i3 = i10 + 1;
                emptyAndGetCurrentSegment[i10] = (char) i16;
            } else {
                i3 = i10 + 1;
                emptyAndGetCurrentSegment[i10] = (char) i16;
            }
            i10 = i3;
        }
    }

    private final void _finishLongText(int i3) throws IOException {
        int i10;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = UTF8_UNIT_CODES;
        int length = emptyAndGetCurrentSegment.length;
        int i11 = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                this._textBuffer.setCurrentLength(i11);
                return;
            }
            int _nextByte = _nextByte();
            int i12 = _nextByte & 255;
            int i13 = iArr[i12];
            if (i13 != 0 || i11 >= length) {
                i3 -= i13;
                if (i3 < 0) {
                    throw _constructReadException(StubApp.getString2(11181));
                }
                if (i13 != 0) {
                    if (i13 == 1) {
                        int _nextByte2 = _nextByte();
                        if ((_nextByte2 & 192) != 128) {
                            _reportInvalidOther(_nextByte2 & 255, this._inputPtr);
                        }
                        i12 = (_nextByte2 & 63) | ((_nextByte & 31) << 6);
                    } else if (i13 == 2) {
                        i12 = _decodeUTF8_3(i12);
                    } else if (i13 != 3) {
                        _reportInvalidChar(i12);
                    } else {
                        int _decodeUTF8_4 = _decodeUTF8_4(i12);
                        if (i11 >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            length = emptyAndGetCurrentSegment.length;
                            i11 = 0;
                        }
                        emptyAndGetCurrentSegment[i11] = (char) ((_decodeUTF8_4 >> 10) | 55296);
                        i12 = (_decodeUTF8_4 & 1023) | 56320;
                        i11++;
                    }
                }
                if (i11 >= length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    length = emptyAndGetCurrentSegment.length;
                    i11 = 0;
                }
                i10 = i11 + 1;
                emptyAndGetCurrentSegment[i11] = (char) i12;
            } else {
                i10 = i11 + 1;
                emptyAndGetCurrentSegment[i11] = (char) i12;
            }
            i11 = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc A[LOOP:1: B:16:0x0031->B:28:0x00cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String _finishShortText(int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.dataformat.cbor.CBORParser._finishShortText(int):java.lang.String");
    }

    private final byte[] _getBinaryFromString(Base64Variant base64Variant) throws IOException {
        if (this._tokenIncomplete) {
            _finishToken();
        }
        if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    private static int[] _growArrayTo(int[] iArr, int i3) {
        return Arrays.copyOf(iArr, i3 + 4);
    }

    private static final long _long(int i3, int i10) {
        return (i3 << 32) + ((i10 << 32) >>> 32);
    }

    private final int _nextByte() throws IOException {
        int i3 = this._inputPtr;
        if (i3 < this._inputEnd) {
            byte b2 = this._inputBuffer[i3];
            this._inputPtr = i3 + 1;
            return b2;
        }
        loadMoreGuaranteed();
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        return bArr[i10];
    }

    private final int _nextChunkedByte() throws IOException {
        int i3 = this._inputPtr;
        if (i3 >= this._chunkEnd) {
            return _nextChunkedByte2();
        }
        byte b2 = this._inputBuffer[i3];
        this._inputPtr = i3 + 1;
        return b2;
    }

    private final int _nextChunkedByte2() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
            int i3 = this._chunkLeft;
            if (i3 > 0) {
                int i10 = this._inputPtr;
                int i11 = i3 + i10;
                int i12 = this._inputEnd;
                if (i11 <= i12) {
                    this._chunkLeft = 0;
                    this._chunkEnd = i11;
                } else {
                    this._chunkLeft = i11 - i12;
                    this._chunkEnd = i12;
                }
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i10 + 1;
                return bArr[i10];
            }
        }
        int _decodeChunkLength = _decodeChunkLength(3);
        if (_decodeChunkLength <= 0) {
            _reportInvalidEOF(StubApp.getString2(11182), JsonToken.VALUE_STRING);
        }
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        int i13 = this._inputPtr;
        int i14 = _decodeChunkLength + i13;
        int i15 = this._inputEnd;
        if (i14 <= i15) {
            this._chunkLeft = 0;
            this._chunkEnd = i14;
        } else {
            this._chunkLeft = i14 - i15;
            this._chunkEnd = i15;
        }
        byte[] bArr2 = this._inputBuffer;
        this._inputPtr = i13 + 1;
        return bArr2[i13];
    }

    private static final int _padQuadForNulls(int i3) {
        return (i3 & 255) | (-256);
    }

    private int _readAndWriteBytes(OutputStream outputStream, int i3) throws IOException {
        int i10 = i3;
        while (i10 > 0) {
            int i11 = this._inputEnd;
            int i12 = this._inputPtr;
            int i13 = i11 - i12;
            if (i12 >= i11) {
                if (!loadMore()) {
                    _reportIncompleteBinaryRead(i3, i3 - i10);
                }
                i13 = this._inputEnd - this._inputPtr;
            }
            int min = Math.min(i13, i10);
            outputStream.write(this._inputBuffer, this._inputPtr, min);
            this._inputPtr += min;
            i10 -= min;
        }
        this._tokenIncomplete = false;
        return i3;
    }

    private String _reportTruncatedUTF8InName(int i3, int i10, int i11, int i12) throws IOException {
        throw _constructReadException(String.format(StubApp.getString2(11183), Integer.valueOf(i3), Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i12)));
    }

    private final int _slow16() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i10 = i3 + 1;
        this._inputPtr = i10;
        int i11 = bArr[i3] & UByte.MAX_VALUE;
        if (i10 >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i12 = this._inputPtr;
        this._inputPtr = i12 + 1;
        return (i11 << 8) + (bArr2[i12] & UByte.MAX_VALUE);
    }

    private final int _slow32() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i10 = i3 + 1;
        this._inputPtr = i10;
        byte b2 = bArr[i3];
        if (i10 >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        int i13 = (b2 << 8) + (bArr2[i11] & UByte.MAX_VALUE);
        if (i12 >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i14 = this._inputPtr;
        int i15 = i14 + 1;
        this._inputPtr = i15;
        int i16 = (i13 << 8) + (bArr3[i14] & UByte.MAX_VALUE);
        if (i15 >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr4 = this._inputBuffer;
        int i17 = this._inputPtr;
        this._inputPtr = i17 + 1;
        return (i16 << 8) + (bArr4[i17] & UByte.MAX_VALUE);
    }

    private final long _slow64() throws IOException {
        return _long(_decode32Bits(), _decode32Bits());
    }

    public final boolean _checkNextIsEndArray() throws IOException {
        if (!this._streamReadContext.expectMoreValues()) {
            this._tagValue = -1;
            this._streamReadContext = this._streamReadContext.getParent();
            this._currToken = JsonToken.END_ARRAY;
            return true;
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b2 = bArr[i3];
        if (((b2 >> 5) & 7) == 6) {
            int _decodeTag = _decodeTag(b2 & 31);
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _eofAsNextToken();
                return false;
            }
            byte[] bArr2 = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            if (((bArr2[i10] >> 5) & 7) == 6) {
                _reportError(StubApp.getString2(11184) + _decodeTag + StubApp.getString2(74));
            }
        }
        this._inputPtr--;
        return nextToken() == JsonToken.END_ARRAY;
    }

    public final boolean _checkNextIsIntInArray(String str) throws IOException {
        int i3 = -1;
        if (!this._streamReadContext.expectMoreValues()) {
            this._tagValue = -1;
            this._streamReadContext = this._streamReadContext.getParent();
            this._currToken = JsonToken.END_ARRAY;
            return false;
        }
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _eofAsNextToken();
            return false;
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        byte b2 = bArr[i10];
        int i11 = b2 & UByte.MAX_VALUE;
        int i12 = i11 >> 5;
        int i13 = b2 & 31;
        if (i12 == 6) {
            i3 = _decodeTag(i13);
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _eofAsNextToken();
                return false;
            }
            byte[] bArr2 = this._inputBuffer;
            int i14 = this._inputPtr;
            this._inputPtr = i14 + 1;
            byte b10 = bArr2[i14];
            i11 = b10 & UByte.MAX_VALUE;
            i12 = i11 >> 5;
            i13 = b10 & 31;
        }
        if (i12 == 0) {
            this._numTypesValid = 1;
            if (i13 <= 23) {
                this._numberInt = i13;
            } else {
                int i15 = i13 - 24;
                if (i15 == 0) {
                    this._numberInt = _decode8Bits();
                } else if (i15 == 1) {
                    this._numberInt = _decode16Bits();
                } else if (i15 == 2) {
                    int _decode32Bits = _decode32Bits();
                    if (_decode32Bits >= 0) {
                        this._numberInt = _decode32Bits;
                    } else {
                        this._numberLong = _decode32Bits & BodyPartID.bodyIdMax;
                        this._numTypesValid = 2;
                    }
                } else if (i15 != 3) {
                    _invalidToken(i11);
                } else {
                    long _decode64Bits = _decode64Bits();
                    if (_decode64Bits >= 0) {
                        this._numberLong = _decode64Bits;
                        this._numTypesValid = 2;
                    } else {
                        this._numberBigInt = _bigPositive(_decode64Bits);
                        this._numTypesValid = 4;
                    }
                }
            }
            this._currToken = JsonToken.VALUE_NUMBER_INT;
            return true;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 6) {
                    _reportError(StubApp.getString2(11184) + i3 + StubApp.getString2(74));
                }
            } else if (i3 >= 0) {
                this._typeByte = i11;
                this._tokenIncomplete = true;
                JsonToken _handleTaggedBinary = _handleTaggedBinary(i3);
                this._currToken = _handleTaggedBinary;
                return _handleTaggedBinary == JsonToken.VALUE_NUMBER_INT;
            }
            this._inputPtr--;
            nextToken();
            return false;
        }
        this._numTypesValid = 1;
        if (i13 <= 23) {
            this._numberInt = (-i13) - 1;
        } else {
            int i16 = i13 - 24;
            if (i16 == 0) {
                this._numberInt = (-_decode8Bits()) - 1;
            } else if (i16 == 1) {
                this._numberInt = (-_decode16Bits()) - 1;
            } else if (i16 == 2) {
                int _decode32Bits2 = _decode32Bits();
                if (_decode32Bits2 < 0) {
                    this._numberLong = (-(_decode32Bits2 & BodyPartID.bodyIdMax)) - 1;
                    this._numTypesValid = 2;
                } else {
                    this._numberInt = (-_decode32Bits2) - 1;
                }
            } else if (i16 != 3) {
                _invalidToken(i11);
            } else {
                long _decode64Bits2 = _decode64Bits();
                if (_decode64Bits2 >= 0) {
                    this._numberLong = (-_decode64Bits2) - 1;
                    this._numTypesValid = 2;
                } else {
                    this._numberBigInt = _bigNegative(_decode64Bits2);
                    this._numTypesValid = 4;
                }
            }
        }
        this._currToken = JsonToken.VALUE_NUMBER_INT;
        return true;
    }

    public void _checkNumericValue(int i3) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return;
        }
        _reportError(StubApp.getString2(10284) + currentToken() + StubApp.getString2(11185));
    }

    public void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    public final void _decodeNonStringName(int i3) throws IOException {
        String str;
        int i10 = (i3 >> 5) & 7;
        if (i10 == 0) {
            str = _numberToName(i3, false);
        } else if (i10 == 1) {
            str = _numberToName(i3, true);
        } else {
            if (i10 != 2) {
                if ((i3 & 255) == 255) {
                    _reportUnexpectedBreak();
                }
                throw _constructReadException(StubApp.getString2(11186), Integer.valueOf(i10));
            }
            str = new String(_finishBytes(_decodeExplicitLength(i3 & 31)), UTF8);
        }
        this._streamReadContext.setCurrentName(str);
    }

    public final JsonToken _decodePropertyName() throws IOException {
        String _decodeChunkedName;
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _eofAsNextToken();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i10 = i3 + 1;
        this._inputPtr = i10;
        byte b2 = bArr[i3];
        if (((b2 >> 5) & 7) != 3) {
            if (b2 == -1) {
                if (!this._streamReadContext.hasExpectedLength()) {
                    this._streamReadContext = this._streamReadContext.getParent();
                    return JsonToken.END_OBJECT;
                }
                _reportUnexpectedBreak();
            }
            _decodeNonStringName(b2);
            return JsonToken.FIELD_NAME;
        }
        int i11 = b2 & 31;
        if (i11 > 23) {
            int _decodeExplicitLength = _decodeExplicitLength(i11);
            _decodeChunkedName = _decodeExplicitLength < 0 ? _decodeChunkedName() : _decodeLongerName(_decodeExplicitLength);
        } else if (i11 == 0) {
            _decodeChunkedName = "";
        } else {
            if (this._inputEnd - i10 < i11) {
                _loadToHaveAtLeast(i11);
            }
            if (this._symbolsCanonical) {
                String _findDecodedFromSymbols = _findDecodedFromSymbols(i11);
                if (_findDecodedFromSymbols != null) {
                    this._inputPtr += i11;
                    _decodeChunkedName = _findDecodedFromSymbols;
                } else {
                    _decodeChunkedName = _addDecodedToSymbols(i11, _decodeContiguousName(i11));
                }
            } else {
                _decodeChunkedName = _decodeContiguousName(i11);
            }
        }
        this._streamReadContext.setCurrentName(_decodeChunkedName);
        return JsonToken.FIELD_NAME;
    }

    public JsonToken _decodeSimpleValue(int i3, int i10) throws IOException {
        if (i3 > 24) {
            _invalidToken(i10);
        }
        if (i3 < 24) {
            this._numberInt = i3;
        } else {
            if (this._inputPtr >= this._inputEnd) {
                loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i11 = this._inputPtr;
            this._inputPtr = i11 + 1;
            int i12 = bArr[i11] & UByte.MAX_VALUE;
            this._numberInt = i12;
            if (i12 < 32) {
                throw _constructError(StubApp.getString2(11187) + Integer.toHexString(this._numberInt) + StubApp.getString2(11188));
            }
        }
        this._numTypesValid = 1;
        return JsonToken.VALUE_NUMBER_INT;
    }

    public JsonToken _decodeUndefinedValue() throws IOException {
        return JsonToken.VALUE_NULL;
    }

    public JsonToken _eofAsNextToken() throws IOException {
        this._tagValue = -1;
        close();
        _handleEOF();
        this._currToken = null;
        return null;
    }

    public byte[] _finishBytes(int i3) throws IOException {
        if (i3 <= 0) {
            return i3 == 0 ? ParserMinimalBase.NO_BYTES : _finishChunkedBytes();
        }
        if (i3 > 250000) {
            return _finishLongContiguousBytes(i3);
        }
        byte[] bArr = new byte[i3];
        int i10 = 0;
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _reportIncompleteBinaryRead(i3, 0);
        }
        int i11 = i3;
        while (true) {
            int min = Math.min(i11, this._inputEnd - this._inputPtr);
            System.arraycopy(this._inputBuffer, this._inputPtr, bArr, i10, min);
            this._inputPtr += min;
            i10 += min;
            i11 -= min;
            if (i11 <= 0) {
                return bArr;
            }
            if (!loadMore()) {
                _reportIncompleteBinaryRead(i3, i10);
            }
        }
    }

    public byte[] _finishChunkedBytes() throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            byte b2 = bArr[i3];
            int i10 = b2 & UByte.MAX_VALUE;
            if (i10 == 255) {
                return _getByteArrayBuilder.toByteArray();
            }
            int i11 = i10 >> 5;
            if (i11 != 2) {
                throw _constructReadException(StubApp.getString2(11190), 2, Integer.valueOf(i11));
            }
            int _decodeExplicitLength = _decodeExplicitLength(b2 & 31);
            if (_decodeExplicitLength < 0) {
                throw _constructReadException(StubApp.getString2(11189), 2);
            }
            int i12 = _decodeExplicitLength;
            while (i12 > 0) {
                int i13 = this._inputEnd;
                int i14 = this._inputPtr;
                int i15 = i13 - i14;
                if (i14 >= i13) {
                    if (!loadMore()) {
                        _reportIncompleteBinaryRead(_decodeExplicitLength, _decodeExplicitLength - i12);
                    }
                    i15 = this._inputEnd - this._inputPtr;
                }
                int min = Math.min(i15, i12);
                _getByteArrayBuilder.write(this._inputBuffer, this._inputPtr, min);
                this._inputPtr += min;
                i12 -= min;
            }
        }
    }

    public byte[] _finishLongContiguousBytes(int i3) throws IOException {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(125000);
        int i10 = i3;
        while (i10 > 0) {
            try {
                int i11 = this._inputEnd - this._inputPtr;
                if (i11 <= 0) {
                    if (!loadMore()) {
                        _reportIncompleteBinaryRead(i3, i3 - i10);
                    }
                    i11 = this._inputEnd - this._inputPtr;
                }
                int min = Math.min(i11, i10);
                byteArrayBuilder.write(this._inputBuffer, this._inputPtr, min);
                this._inputPtr += min;
                i10 -= min;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayBuilder.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        byte[] byteArray = byteArrayBuilder.toByteArray();
        byteArrayBuilder.close();
        return byteArray;
    }

    public String _finishTextToken(int i3) throws IOException {
        this._tokenIncomplete = false;
        int i10 = (i3 >> 5) & 7;
        int i11 = i3 & 31;
        if (i10 != 3) {
            _throwInternal();
        }
        int _decodeExplicitLength = _decodeExplicitLength(i11);
        if (_decodeExplicitLength <= 0) {
            if (_decodeExplicitLength == 0) {
                this._textBuffer.resetWithEmpty();
                return "";
            }
            _finishChunkedText();
            return this._textBuffer.contentsAsString();
        }
        int max = Math.max(_decodeExplicitLength + 3, _decodeExplicitLength);
        if (this._inputEnd - this._inputPtr >= max || (this._inputBuffer.length >= max && _tryToLoadToHaveAtLeast(max))) {
            return _finishShortText(_decodeExplicitLength);
        }
        _finishLongText(_decodeExplicitLength);
        return this._textBuffer.contentsAsString();
    }

    public void _finishToken() throws IOException {
        this._tokenIncomplete = false;
        int i3 = this._typeByte;
        int i10 = (i3 >> 5) & 7;
        int i11 = i3 & 31;
        if (i10 != 3) {
            if (i10 == 2) {
                this._binaryValue = _finishBytes(_decodeExplicitLength(i11));
                return;
            }
            _throwInternal();
        }
        int _decodeExplicitLength = _decodeExplicitLength(i11);
        if (_decodeExplicitLength <= 0) {
            if (_decodeExplicitLength < 0) {
                _finishChunkedText();
                return;
            } else {
                this._textBuffer.resetWithEmpty();
                return;
            }
        }
        int i12 = _decodeExplicitLength + 3;
        if (this._inputEnd - this._inputPtr >= i12 || (this._inputBuffer.length >= i12 && _tryToLoadToHaveAtLeast(i12))) {
            _finishShortText(_decodeExplicitLength);
        } else {
            _finishLongText(_decodeExplicitLength);
        }
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public void _handleEOF() throws JsonParseException {
        if (this._streamReadContext.inRoot()) {
            return;
        }
        JsonLocation startLocation = this._streamReadContext.startLocation(this._ioContext.contentReference());
        String string2 = startLocation == null ? StubApp.getString2(10500) : startLocation.sourceDescription();
        if (this._streamReadContext.hasExpectedLength()) {
            int remainingExpectedLength = this._streamReadContext.getRemainingExpectedLength();
            if (this._streamReadContext.inArray()) {
                _reportInvalidEOF(String.format(StubApp.getString2(11191), Integer.valueOf(remainingExpectedLength), string2), null);
                return;
            } else {
                _reportInvalidEOF(String.format(StubApp.getString2(11192), Integer.valueOf(remainingExpectedLength), string2), null);
                return;
            }
        }
        boolean inArray = this._streamReadContext.inArray();
        String string22 = StubApp.getString2(74);
        if (inArray) {
            _reportInvalidEOF(StubApp.getString2(11193) + string2 + string22, null);
            return;
        }
        _reportInvalidEOF(StubApp.getString2(11194) + string2 + string22, null);
    }

    public JsonToken _handleTaggedArray(int i3, int i10) throws IOException {
        this._streamReadContext = this._streamReadContext.createChildArrayContext(i10);
        if (i3 != 4) {
            JsonToken jsonToken = JsonToken.START_ARRAY;
            this._currToken = jsonToken;
            return jsonToken;
        }
        this._currToken = JsonToken.START_ARRAY;
        if (i10 != 2) {
            _reportError(StubApp.getString2(11195) + i10 + StubApp.getString2(11196));
        }
        String string2 = StubApp.getString2(11197);
        boolean _checkNextIsIntInArray = _checkNextIsIntInArray(string2);
        String string22 = StubApp.getString2(11198);
        if (!_checkNextIsIntInArray) {
            _reportError(string22 + currentToken() + StubApp.getString2(11199));
        }
        int i11 = -getIntValue();
        if (!_checkNextIsIntInArray(string2)) {
            _reportError(string22 + currentToken() + StubApp.getString2(11200));
        }
        BigDecimal bigDecimal = getNumberType() == JsonParser.NumberType.BIG_INTEGER ? new BigDecimal(getBigIntegerValue(), i11) : BigDecimal.valueOf(getLongValue(), i11);
        if (!_checkNextIsEndArray()) {
            _reportError(string22 + currentToken() + StubApp.getString2(11201));
        }
        this._numberBigDecimal = bigDecimal;
        this._numTypesValid = 16;
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_FLOAT;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    public JsonToken _handleTaggedBinary(int i3) throws IOException {
        boolean z2;
        if (i3 == 2) {
            z2 = false;
        } else {
            if (i3 != 3) {
                JsonToken jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
                this._currToken = jsonToken;
                return jsonToken;
            }
            z2 = true;
        }
        _finishToken();
        if (this._binaryValue.length == 0) {
            this._numberBigInt = BigInteger.ZERO;
        } else {
            BigInteger bigInteger = new BigInteger(this._binaryValue);
            if (z2) {
                bigInteger = bigInteger.negate();
            }
            this._numberBigInt = bigInteger;
        }
        this._numTypesValid = 4;
        this._tagValue = -1;
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_INT;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    public void _invalidToken(int i3) throws JsonParseException {
        int i10 = i3 & 255;
        if (i10 == 255) {
            throw _constructError(StubApp.getString2(11202));
        }
        throw _constructError(StubApp.getString2(11203) + Integer.toHexString(i10));
    }

    public final void _loadToHaveAtLeast(int i3) throws IOException {
        InputStream inputStream = this._inputStream;
        String string2 = StubApp.getString2(11204);
        if (inputStream == null) {
            throw _constructError(string2 + i3 + StubApp.getString2(11207));
        }
        int i10 = this._inputEnd;
        int i11 = this._inputPtr;
        int i12 = i10 - i11;
        if (i12 <= 0 || i11 <= 0) {
            this._inputEnd = 0;
        } else {
            byte[] bArr = this._inputBuffer;
            System.arraycopy(bArr, i11, bArr, 0, i12);
            this._inputEnd = i12;
        }
        this._currInputProcessed += this._inputPtr;
        this._inputPtr = 0;
        while (true) {
            int i13 = this._inputEnd;
            if (i13 >= i3) {
                return;
            }
            InputStream inputStream2 = this._inputStream;
            byte[] bArr2 = this._inputBuffer;
            int read = inputStream2.read(bArr2, i13, bArr2.length - i13);
            if (read < 1) {
                _closeInput();
                if (read != 0) {
                    throw _constructError(AbstractC1482f.e(i3, string2, i3, StubApp.getString2(11205), StubApp.getString2(11206)));
                }
                throw new IOException(h.g(i12, StubApp.getString2(10470), StubApp.getString2(693)));
            }
            this._inputEnd += read;
        }
    }

    public String _numberToName(int i3, boolean z2) throws IOException {
        int i10 = i3 & 31;
        if (i10 > 23) {
            switch (i10) {
                case 24:
                    i10 = _decode8Bits();
                    break;
                case 25:
                    i10 = _decode16Bits();
                    break;
                case 26:
                    i10 = _decode32Bits();
                    if (i10 < 0) {
                        return String.valueOf(z2 ? (-(i10 & BodyPartID.bodyIdMax)) - 1 : i10 & BodyPartID.bodyIdMax);
                    }
                    break;
                case 27:
                    long _decode64Bits = _decode64Bits();
                    if (z2) {
                        _decode64Bits = (-_decode64Bits) - 1;
                    }
                    return String.valueOf(_decode64Bits);
                default:
                    throw _constructReadException(StubApp.getString2(11208), Integer.valueOf(i10), Integer.toHexString(i3));
            }
        }
        if (z2) {
            i10 = (-i10) - 1;
        }
        return String.valueOf(i10);
    }

    public void _releaseBuffers() throws IOException {
        byte[] bArr;
        if (this._bufferRecyclable && (bArr = this._inputBuffer) != null) {
            this._inputBuffer = null;
            this._ioContext.releaseReadIOBuffer(bArr);
        }
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    public void _reportIncompleteBinaryRead(int i3, int i10) throws IOException {
        _reportInvalidEOF(String.format(StubApp.getString2(11209), Integer.valueOf(i3), Integer.valueOf(i10)), this._currToken);
    }

    public void _reportInvalidChar(int i3) throws JsonParseException {
        if (i3 < 32) {
            _throwInvalidSpace(i3);
        }
        _reportInvalidInitial(i3);
    }

    public void _reportInvalidInitial(int i3) throws JsonParseException {
        _reportError(StubApp.getString2(10472) + Integer.toHexString(i3));
    }

    public void _reportInvalidOther(int i3) throws JsonParseException {
        _reportError(StubApp.getString2(10473) + Integer.toHexString(i3));
    }

    public void _reportUnexpectedBreak() throws IOException {
        if (this._streamReadContext.inRoot()) {
            throw _constructError(StubApp.getString2(11211));
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(11210));
        sb2.append(this._streamReadContext.getExpectedLength());
        sb2.append(StubApp.getString2(3046));
        sb2.append(this._streamReadContext.inObject() ? StubApp.getString2(10291) : StubApp.getString2(10292));
        throw _constructError(sb2.toString());
    }

    public void _skipBytes(int i3) throws IOException {
        while (true) {
            int min = Math.min(i3, this._inputEnd - this._inputPtr);
            this._inputPtr += min;
            i3 -= min;
            if (i3 <= 0) {
                return;
            } else {
                loadMoreGuaranteed();
            }
        }
    }

    public void _skipBytesL(long j) throws IOException {
        while (j > 2147483647L) {
            _skipBytes(IntCompanionObject.MAX_VALUE);
            j -= 2147483647L;
        }
        _skipBytes((int) j);
    }

    public void _skipChunked(int i3) throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            byte b2 = bArr[i10];
            int i11 = b2 & UByte.MAX_VALUE;
            if (i11 == 255) {
                return;
            }
            int i12 = i11 >> 5;
            if (i12 != i3) {
                throw _constructError(StubApp.getString2(11212) + i3 + StubApp.getString2(11213) + i12);
            }
            int i13 = b2 & 31;
            if (i13 <= 23) {
                if (i13 > 0) {
                    _skipBytes(i13);
                }
            } else {
                if (i13 == 31) {
                    throw _constructReadException(StubApp.getString2(11189), Integer.valueOf(i3));
                }
                switch (i13) {
                    case 24:
                        _skipBytes(_decode8Bits());
                        break;
                    case 25:
                        _skipBytes(_decode16Bits());
                        break;
                    case 26:
                        _skipBytes(_decode32Bits());
                        break;
                    case 27:
                        _skipBytesL(_decode64Bits());
                        break;
                    default:
                        _invalidToken(this._typeByte);
                        break;
                }
            }
        }
    }

    public void _skipIncomplete() throws IOException {
        this._tokenIncomplete = false;
        int i3 = (this._typeByte >> 5) & 7;
        if (i3 != 3 && i3 != 2) {
            _throwInternal();
        }
        int i10 = this._typeByte;
        int i11 = i10 & 31;
        if (i11 <= 23) {
            if (i11 > 0) {
                _skipBytes(i11);
            }
        } else {
            if (i11 == 31) {
                _skipChunked(i3);
                return;
            }
            switch (i11) {
                case 24:
                    _skipBytes(_decode8Bits());
                    break;
                case 25:
                    _skipBytes(_decode16Bits());
                    break;
                case 26:
                    _skipBytes(_decode32Bits());
                    break;
                case 27:
                    _skipBytesL(_decode64Bits());
                    break;
                default:
                    _invalidToken(i10);
                    break;
            }
        }
    }

    public final boolean _tryToLoadToHaveAtLeast(int i3) throws IOException {
        if (this._inputStream == null) {
            return false;
        }
        int i10 = this._inputEnd;
        int i11 = this._inputPtr;
        int i12 = i10 - i11;
        if (i12 <= 0 || i11 <= 0) {
            this._inputEnd = 0;
        } else {
            byte[] bArr = this._inputBuffer;
            System.arraycopy(bArr, i11, bArr, 0, i12);
            this._inputEnd = i12;
        }
        this._currInputProcessed += this._inputPtr;
        this._inputPtr = 0;
        while (true) {
            int i13 = this._inputEnd;
            if (i13 >= i3) {
                return true;
            }
            InputStream inputStream = this._inputStream;
            byte[] bArr2 = this._inputBuffer;
            int read = inputStream.read(bArr2, i13, bArr2.length - i13);
            if (read < 1) {
                _closeInput();
                return false;
            }
            this._inputEnd += read;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        this._closed = true;
        this._symbols.release();
        try {
            _closeInput();
        } finally {
            _releaseBuffers();
        }
    }

    public void convertNumberToBigDecimal() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 40) != 0) {
            this._numberBigDecimal = NumberInput.parseBigDecimal(getText());
        } else if ((i3 & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(this._numberBigInt);
        } else if ((i3 & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((i3 & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    public void convertNumberToBigInteger() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            this._numberBigInt = this._numberBigDecimal.toBigInteger();
        } else if ((i3 & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((i3 & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberInt);
        } else if ((i3 & 8) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
        } else if ((i3 & 32) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberFloat).toBigInteger();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 4;
    }

    public void convertNumberToDouble() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            this._numberDouble = this._numberBigDecimal.doubleValue();
        } else if ((i3 & 32) != 0) {
            this._numberDouble = this._numberFloat;
        } else if ((i3 & 4) != 0) {
            this._numberDouble = this._numberBigInt.doubleValue();
        } else if ((i3 & 2) != 0) {
            this._numberDouble = this._numberLong;
        } else if ((i3 & 1) != 0) {
            this._numberDouble = this._numberInt;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 8;
    }

    public void convertNumberToFloat() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            this._numberFloat = this._numberBigDecimal.floatValue();
        } else if ((i3 & 4) != 0) {
            this._numberFloat = this._numberBigInt.floatValue();
        } else if ((i3 & 8) != 0) {
            this._numberFloat = (float) this._numberDouble;
        } else if ((i3 & 2) != 0) {
            this._numberFloat = this._numberLong;
        } else if ((i3 & 1) != 0) {
            this._numberFloat = this._numberInt;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 32;
    }

    public void convertNumberToInt() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 2) != 0) {
            long j = this._numberLong;
            int i10 = (int) j;
            if (i10 != j) {
                _reportError(StubApp.getString2(10286) + getText() + StubApp.getString2(11214));
            }
            this._numberInt = i10;
        } else if ((i3 & 4) != 0) {
            if (BI_MIN_INT.compareTo(this._numberBigInt) > 0 || BI_MAX_INT.compareTo(this._numberBigInt) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigInt.intValue();
        } else if ((i3 & 8) != 0) {
            double d8 = this._numberDouble;
            if (d8 < -2.147483648E9d || d8 > 2.147483647E9d) {
                reportOverflowInt();
            }
            this._numberInt = (int) this._numberDouble;
        } else if ((i3 & 32) != 0) {
            float f10 = this._numberFloat;
            if (f10 < -2.147483648E9d || f10 > 2.147483647E9d) {
                reportOverflowInt();
            }
            this._numberInt = (int) this._numberFloat;
        } else if ((i3 & 16) != 0) {
            if (BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    public void convertNumberToLong() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 1) != 0) {
            this._numberLong = this._numberInt;
        } else if ((i3 & 4) != 0) {
            if (BI_MIN_LONG.compareTo(this._numberBigInt) > 0 || BI_MAX_LONG.compareTo(this._numberBigInt) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigInt.longValue();
        } else if ((i3 & 8) != 0) {
            double d8 = this._numberDouble;
            if (d8 < -9.223372036854776E18d || d8 > 9.223372036854776E18d) {
                reportOverflowLong();
            }
            this._numberLong = (long) this._numberDouble;
        } else if ((i3 & 32) != 0) {
            float f10 = this._numberFloat;
            if (f10 < -9.223372036854776E18d || f10 > 9.223372036854776E18d) {
                reportOverflowInt();
            }
            this._numberLong = (long) this._numberFloat;
        } else if ((i3 & 16) != 0) {
            if (BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 4) == 0) {
            if (i3 == 0) {
                _checkNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return this._numberBigInt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            if (this._tokenIncomplete) {
                _finishToken();
            }
            return this._binaryValue;
        }
        if (jsonToken == JsonToken.VALUE_STRING) {
            return _getBinaryFromString(base64Variant);
        }
        throw _constructReadException(StubApp.getString2(11215), currentToken());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        long j = this._currInputProcessed + this._inputPtr;
        return new JsonLocation(this._ioContext.contentReference(), j, -1L, -1, (int) j);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() throws IOException {
        JsonToken jsonToken = this._currToken;
        return (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) ? this._streamReadContext.getParent().getCurrentName() : this._streamReadContext.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 16) == 0) {
            if (i3 == 0) {
                _checkNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return this._numberBigDecimal;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 8) == 0) {
            if (i3 == 0) {
                _checkNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() throws IOException {
        if (this._tokenIncomplete) {
            _finishToken();
        }
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this._binaryValue;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 32) == 0) {
            if (i3 == 0) {
                _checkNumericValue(32);
            }
            if ((this._numTypesValid & 32) == 0) {
                convertNumberToFloat();
            }
        }
        return this._numberFloat;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 1) == 0) {
            if (i3 == 0) {
                _checkNumericValue(1);
            }
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() throws IOException {
        int i3 = this._numTypesValid;
        if ((i3 & 2) == 0) {
            if (i3 == 0) {
                _checkNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() throws IOException {
        if (this._numTypesValid == 0) {
            _checkNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i3 = this._numTypesValid;
            return (i3 & 1) != 0 ? JsonParser.NumberType.INT : (i3 & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER;
        }
        int i10 = this._numTypesValid;
        return (i10 & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : (i10 & 8) != 0 ? JsonParser.NumberType.DOUBLE : JsonParser.NumberType.FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() throws IOException {
        if (this._numTypesValid == 0) {
            _checkNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i3 = this._numTypesValid;
            return (i3 & 1) != 0 ? Integer.valueOf(this._numberInt) : (i3 & 2) != 0 ? Long.valueOf(this._numberLong) : (i3 & 4) != 0 ? this._numberBigInt : this._numberBigDecimal;
        }
        int i10 = this._numTypesValid;
        if ((i10 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i10 & 8) != 0) {
            return Double.valueOf(this._numberDouble);
        }
        if ((i10 & 32) == 0) {
            _throwInternal();
        }
        return Float.valueOf(this._numberFloat);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Number getNumberValueExact() throws IOException {
        return getNumberValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return CBOR_READ_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (this._tokenIncomplete && jsonToken == JsonToken.VALUE_STRING) {
            return _finishTextToken(this._typeByte);
        }
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == null) {
            return null;
        }
        return jsonToken == JsonToken.FIELD_NAME ? this._streamReadContext.getCurrentName() : jsonToken.isNumeric() ? getNumberValue().toString() : this._currToken.asString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        if (this._currToken == null) {
            return null;
        }
        if (this._tokenIncomplete) {
            _finishToken();
        }
        JsonToken jsonToken = this._currToken;
        return jsonToken == JsonToken.VALUE_STRING ? this._textBuffer.getTextBuffer() : jsonToken == JsonToken.FIELD_NAME ? this._streamReadContext.getCurrentName().toCharArray() : (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? getNumberValue().toString().toCharArray() : jsonToken.asCharArray();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        if (this._currToken == null) {
            return 0;
        }
        if (this._tokenIncomplete) {
            _finishToken();
        }
        JsonToken jsonToken = this._currToken;
        return jsonToken == JsonToken.VALUE_STRING ? this._textBuffer.size() : jsonToken == JsonToken.FIELD_NAME ? this._streamReadContext.getCurrentName().length() : (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? getNumberValue().toString().length() : jsonToken.asCharArray().length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() throws IOException {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        ContentReference contentReference = this._ioContext.contentReference();
        long j = this._tokenInputTotal;
        return new JsonLocation(contentReference, j, -1L, -1, (int) j);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        if (this._tokenIncomplete && this._currToken == JsonToken.VALUE_STRING) {
            return _finishTextToken(this._typeByte);
        }
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) {
            return null;
        }
        return getText();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.hasTextAsCharacters();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isNaN() {
        if (this._currToken == JsonToken.VALUE_NUMBER_FLOAT) {
            int i3 = this._numTypesValid;
            if ((i3 & 8) != 0) {
                double d8 = this._numberDouble;
                return Double.isNaN(d8) || Double.isInfinite(d8);
            }
            if ((i3 & 32) != 0) {
                float f10 = this._numberFloat;
                return Float.isNaN(f10) || Float.isInfinite(f10);
            }
        }
        return false;
    }

    public boolean loadMore() throws IOException {
        InputStream inputStream = this._inputStream;
        if (inputStream != null) {
            this._currInputProcessed += this._inputEnd;
            byte[] bArr = this._inputBuffer;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                throw new IOException(AbstractC1482f.f(this._inputBuffer.length, StubApp.getString2(693), new StringBuilder(StubApp.getString2(10470))));
            }
        }
        return false;
    }

    public void loadMoreGuaranteed() throws IOException {
        if (loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        String _decodeChunkedName;
        if (this._streamReadContext.inObject()) {
            JsonToken jsonToken = this._currToken;
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (jsonToken != jsonToken2) {
                this._numTypesValid = 0;
                if (this._tokenIncomplete) {
                    _skipIncomplete();
                }
                this._tokenInputTotal = this._currInputProcessed + this._inputPtr;
                this._binaryValue = null;
                this._tagValue = -1;
                if (!this._streamReadContext.expectMoreValues()) {
                    this._streamReadContext = this._streamReadContext.getParent();
                    this._currToken = JsonToken.END_OBJECT;
                    return null;
                }
                if (this._inputPtr >= this._inputEnd && !loadMore()) {
                    _eofAsNextToken();
                }
                byte[] bArr = this._inputBuffer;
                int i3 = this._inputPtr;
                int i10 = i3 + 1;
                this._inputPtr = i10;
                byte b2 = bArr[i3];
                if (((b2 >> 5) & 7) != 3) {
                    if (b2 == -1) {
                        if (!this._streamReadContext.hasExpectedLength()) {
                            this._streamReadContext = this._streamReadContext.getParent();
                            this._currToken = JsonToken.END_OBJECT;
                            return null;
                        }
                        _reportUnexpectedBreak();
                    }
                    _decodeNonStringName(b2);
                    this._currToken = jsonToken2;
                    return getText();
                }
                int i11 = b2 & 31;
                if (i11 > 23) {
                    int _decodeExplicitLength = _decodeExplicitLength(i11);
                    _decodeChunkedName = _decodeExplicitLength < 0 ? _decodeChunkedName() : _decodeLongerName(_decodeExplicitLength);
                } else if (i11 == 0) {
                    _decodeChunkedName = "";
                } else {
                    if (this._inputEnd - i10 < i11) {
                        _loadToHaveAtLeast(i11);
                    }
                    if (this._symbolsCanonical) {
                        String _findDecodedFromSymbols = _findDecodedFromSymbols(i11);
                        if (_findDecodedFromSymbols != null) {
                            this._inputPtr += i11;
                            _decodeChunkedName = _findDecodedFromSymbols;
                        } else {
                            _decodeChunkedName = _addDecodedToSymbols(i11, _decodeContiguousName(i11));
                        }
                    } else {
                        _decodeChunkedName = _decodeContiguousName(i11);
                    }
                }
                this._streamReadContext.setCurrentName(_decodeChunkedName);
                this._currToken = jsonToken2;
                return _decodeChunkedName;
            }
        }
        if (nextToken() == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() throws IOException {
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipIncomplete();
        }
        this._tokenInputTotal = this._currInputProcessed + this._inputPtr;
        this._binaryValue = null;
        this._tagValue = -1;
        if (this._streamReadContext.inObject()) {
            if (this._currToken != JsonToken.FIELD_NAME) {
                this._tagValue = -1;
                if (this._streamReadContext.expectMoreValues()) {
                    this._currToken = _decodePropertyName();
                    return null;
                }
                this._streamReadContext = this._streamReadContext.getParent();
                this._currToken = JsonToken.END_OBJECT;
                return null;
            }
        } else if (!this._streamReadContext.expectMoreValues()) {
            this._tagValue = -1;
            this._streamReadContext = this._streamReadContext.getParent();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        }
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _eofAsNextToken();
            return null;
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b2 = bArr[i3];
        int i10 = b2 & UByte.MAX_VALUE;
        int i11 = i10 >> 5;
        int i12 = b2 & 31;
        if (i11 == 6) {
            this._tagValue = _decodeTag(i12);
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _eofAsNextToken();
                return null;
            }
            byte[] bArr2 = this._inputBuffer;
            int i13 = this._inputPtr;
            this._inputPtr = i13 + 1;
            byte b10 = bArr2[i13];
            i10 = b10 & UByte.MAX_VALUE;
            i11 = i10 >> 5;
            i12 = b10 & 31;
        } else {
            this._tagValue = -1;
        }
        switch (i11) {
            case 0:
                this._numTypesValid = 1;
                if (i12 <= 23) {
                    this._numberInt = i12;
                } else {
                    int i14 = i12 - 24;
                    if (i14 == 0) {
                        this._numberInt = _decode8Bits();
                    } else if (i14 == 1) {
                        this._numberInt = _decode16Bits();
                    } else if (i14 == 2) {
                        int _decode32Bits = _decode32Bits();
                        if (_decode32Bits < 0) {
                            this._numberLong = _decode32Bits & BodyPartID.bodyIdMax;
                            this._numTypesValid = 2;
                        } else {
                            this._numberInt = _decode32Bits;
                        }
                    } else if (i14 != 3) {
                        _invalidToken(i10);
                    } else {
                        long _decode64Bits = _decode64Bits();
                        if (_decode64Bits >= 0) {
                            this._numberLong = _decode64Bits;
                            this._numTypesValid = 2;
                        } else {
                            this._numberBigInt = _bigPositive(_decode64Bits);
                            this._numTypesValid = 4;
                        }
                    }
                }
                this._currToken = JsonToken.VALUE_NUMBER_INT;
                return null;
            case 1:
                this._numTypesValid = 1;
                if (i12 <= 23) {
                    this._numberInt = (-i12) - 1;
                } else {
                    int i15 = i12 - 24;
                    if (i15 == 0) {
                        this._numberInt = (-_decode8Bits()) - 1;
                    } else if (i15 == 1) {
                        this._numberInt = (-_decode16Bits()) - 1;
                    } else if (i15 == 2) {
                        int _decode32Bits2 = _decode32Bits();
                        if (_decode32Bits2 < 0) {
                            this._numberLong = (-(_decode32Bits2 & BodyPartID.bodyIdMax)) - 1;
                            this._numTypesValid = 2;
                        } else {
                            this._numberInt = (-_decode32Bits2) - 1;
                        }
                    } else if (i15 != 3) {
                        _invalidToken(i10);
                    } else {
                        long _decode64Bits2 = _decode64Bits();
                        if (_decode64Bits2 >= 0) {
                            this._numberLong = _decode64Bits2;
                            this._numTypesValid = 2;
                        } else {
                            this._numberBigInt = _bigNegative(_decode64Bits2);
                            this._numTypesValid = 4;
                        }
                    }
                }
                this._currToken = JsonToken.VALUE_NUMBER_INT;
                return null;
            case 2:
                this._typeByte = i10;
                this._tokenIncomplete = true;
                this._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
                return null;
            case 3:
                this._typeByte = i10;
                this._tokenIncomplete = true;
                this._currToken = JsonToken.VALUE_STRING;
                return _finishTextToken(i10);
            case 4:
                this._currToken = JsonToken.START_ARRAY;
                this._streamReadContext = this._streamReadContext.createChildArrayContext(_decodeExplicitLength(i12));
                return null;
            case 5:
                this._currToken = JsonToken.START_OBJECT;
                this._streamReadContext = this._streamReadContext.createChildObjectContext(_decodeExplicitLength(i12));
                return null;
            case 6:
                _reportError(StubApp.getString2(11184) + this._tagValue + StubApp.getString2(74));
                break;
        }
        switch (i12) {
            case 20:
                this._currToken = JsonToken.VALUE_FALSE;
                return null;
            case 21:
                this._currToken = JsonToken.VALUE_TRUE;
                return null;
            case 22:
                this._currToken = JsonToken.VALUE_NULL;
                return null;
            case 23:
                this._currToken = _decodeUndefinedValue();
                return null;
            case 25:
                this._numberFloat = _decodeHalfSizeFloat();
                this._numTypesValid = 32;
                this._currToken = JsonToken.VALUE_NUMBER_FLOAT;
                return null;
            case 26:
                this._numberFloat = Float.intBitsToFloat(_decode32Bits());
                this._numTypesValid = 32;
                this._currToken = JsonToken.VALUE_NUMBER_FLOAT;
                return null;
            case 27:
                this._numberDouble = Double.longBitsToDouble(_decode64Bits());
                this._numTypesValid = 8;
                this._currToken = JsonToken.VALUE_NUMBER_FLOAT;
                return null;
            case 31:
                if (this._streamReadContext.inArray() && !this._streamReadContext.hasExpectedLength()) {
                    this._streamReadContext = this._streamReadContext.getParent();
                    this._currToken = JsonToken.END_ARRAY;
                    return null;
                }
                _reportUnexpectedBreak();
                break;
                break;
        }
        this._currToken = _decodeSimpleValue(i12, i10);
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipIncomplete();
        }
        this._tokenInputTotal = this._currInputProcessed + this._inputPtr;
        this._binaryValue = null;
        if (this._streamReadContext.inObject()) {
            if (this._currToken != JsonToken.FIELD_NAME) {
                this._tagValue = -1;
                if (this._streamReadContext.expectMoreValues()) {
                    JsonToken _decodePropertyName = _decodePropertyName();
                    this._currToken = _decodePropertyName;
                    return _decodePropertyName;
                }
                this._streamReadContext = this._streamReadContext.getParent();
                JsonToken jsonToken = JsonToken.END_OBJECT;
                this._currToken = jsonToken;
                return jsonToken;
            }
        } else if (!this._streamReadContext.expectMoreValues()) {
            this._tagValue = -1;
            this._streamReadContext = this._streamReadContext.getParent();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            return _eofAsNextToken();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b2 = bArr[i3];
        int i10 = b2 & UByte.MAX_VALUE;
        int i11 = i10 >> 5;
        int i12 = b2 & 31;
        if (i11 == 6) {
            this._tagValue = _decodeTag(i12);
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                return _eofAsNextToken();
            }
            byte[] bArr2 = this._inputBuffer;
            int i13 = this._inputPtr;
            this._inputPtr = i13 + 1;
            byte b10 = bArr2[i13];
            i10 = b10 & UByte.MAX_VALUE;
            i11 = i10 >> 5;
            i12 = b10 & 31;
        } else {
            this._tagValue = -1;
        }
        switch (i11) {
            case 0:
                this._numTypesValid = 1;
                if (i12 <= 23) {
                    this._numberInt = i12;
                } else {
                    int i14 = i12 - 24;
                    if (i14 == 0) {
                        this._numberInt = _decode8Bits();
                    } else if (i14 == 1) {
                        this._numberInt = _decode16Bits();
                    } else if (i14 == 2) {
                        int _decode32Bits = _decode32Bits();
                        if (_decode32Bits >= 0) {
                            this._numberInt = _decode32Bits;
                        } else {
                            this._numberLong = _decode32Bits & BodyPartID.bodyIdMax;
                            this._numTypesValid = 2;
                        }
                    } else if (i14 != 3) {
                        _invalidToken(i10);
                    } else {
                        long _decode64Bits = _decode64Bits();
                        if (_decode64Bits >= 0) {
                            this._numberLong = _decode64Bits;
                            this._numTypesValid = 2;
                        } else {
                            this._numberBigInt = _bigPositive(_decode64Bits);
                            this._numTypesValid = 4;
                        }
                    }
                }
                JsonToken jsonToken3 = JsonToken.VALUE_NUMBER_INT;
                this._currToken = jsonToken3;
                return jsonToken3;
            case 1:
                this._numTypesValid = 1;
                if (i12 <= 23) {
                    this._numberInt = (-i12) - 1;
                } else {
                    int i15 = i12 - 24;
                    if (i15 == 0) {
                        this._numberInt = (-_decode8Bits()) - 1;
                    } else if (i15 == 1) {
                        this._numberInt = (-_decode16Bits()) - 1;
                    } else if (i15 == 2) {
                        int _decode32Bits2 = _decode32Bits();
                        if (_decode32Bits2 < 0) {
                            this._numberLong = (-(_decode32Bits2 & BodyPartID.bodyIdMax)) - 1;
                            this._numTypesValid = 2;
                        } else {
                            this._numberInt = (-_decode32Bits2) - 1;
                        }
                    } else if (i15 != 3) {
                        _invalidToken(i10);
                    } else {
                        long _decode64Bits2 = _decode64Bits();
                        if (_decode64Bits2 >= 0) {
                            this._numberLong = (-_decode64Bits2) - 1;
                            this._numTypesValid = 2;
                        } else {
                            this._numberBigInt = _bigNegative(_decode64Bits2);
                            this._numTypesValid = 4;
                        }
                    }
                }
                JsonToken jsonToken4 = JsonToken.VALUE_NUMBER_INT;
                this._currToken = jsonToken4;
                return jsonToken4;
            case 2:
                this._typeByte = i10;
                this._tokenIncomplete = true;
                int i16 = this._tagValue;
                if (i16 >= 0) {
                    return _handleTaggedBinary(i16);
                }
                JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
                this._currToken = jsonToken5;
                return jsonToken5;
            case 3:
                this._typeByte = i10;
                this._tokenIncomplete = true;
                JsonToken jsonToken6 = JsonToken.VALUE_STRING;
                this._currToken = jsonToken6;
                return jsonToken6;
            case 4:
                int _decodeExplicitLength = _decodeExplicitLength(i12);
                int i17 = this._tagValue;
                if (i17 >= 0) {
                    return _handleTaggedArray(i17, _decodeExplicitLength);
                }
                this._streamReadContext = this._streamReadContext.createChildArrayContext(_decodeExplicitLength);
                JsonToken jsonToken7 = JsonToken.START_ARRAY;
                this._currToken = jsonToken7;
                return jsonToken7;
            case 5:
                this._currToken = JsonToken.START_OBJECT;
                this._streamReadContext = this._streamReadContext.createChildObjectContext(_decodeExplicitLength(i12));
                return this._currToken;
            case 6:
                _reportError(StubApp.getString2(11184) + this._tagValue + StubApp.getString2(74));
                break;
        }
        switch (i12) {
            case 20:
                JsonToken jsonToken8 = JsonToken.VALUE_FALSE;
                this._currToken = jsonToken8;
                return jsonToken8;
            case 21:
                JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
                this._currToken = jsonToken9;
                return jsonToken9;
            case 22:
                JsonToken jsonToken10 = JsonToken.VALUE_NULL;
                this._currToken = jsonToken10;
                return jsonToken10;
            case 23:
                JsonToken _decodeUndefinedValue = _decodeUndefinedValue();
                this._currToken = _decodeUndefinedValue;
                return _decodeUndefinedValue;
            case 25:
                this._numberFloat = _decodeHalfSizeFloat();
                this._numTypesValid = 32;
                JsonToken jsonToken11 = JsonToken.VALUE_NUMBER_FLOAT;
                this._currToken = jsonToken11;
                return jsonToken11;
            case 26:
                this._numberFloat = Float.intBitsToFloat(_decode32Bits());
                this._numTypesValid = 32;
                JsonToken jsonToken12 = JsonToken.VALUE_NUMBER_FLOAT;
                this._currToken = jsonToken12;
                return jsonToken12;
            case 27:
                this._numberDouble = Double.longBitsToDouble(_decode64Bits());
                this._numTypesValid = 8;
                JsonToken jsonToken13 = JsonToken.VALUE_NUMBER_FLOAT;
                this._currToken = jsonToken13;
                return jsonToken13;
            case 31:
                if (this._streamReadContext.inArray() && !this._streamReadContext.hasExpectedLength()) {
                    this._streamReadContext = this._streamReadContext.getParent();
                    JsonToken jsonToken14 = JsonToken.END_ARRAY;
                    this._currToken = jsonToken14;
                    return jsonToken14;
                }
                _reportUnexpectedBreak();
                break;
                break;
        }
        JsonToken _decodeSimpleValue = _decodeSimpleValue(i12, i10);
        this._currToken = _decodeSimpleValue;
        return _decodeSimpleValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        JsonToken jsonToken = this._currToken;
        int i3 = 0;
        if (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT) {
            if (jsonToken != JsonToken.VALUE_STRING) {
                throw _constructReadException(StubApp.getString2(11215), currentToken());
            }
            byte[] _getBinaryFromString = _getBinaryFromString(base64Variant);
            int length = _getBinaryFromString.length;
            outputStream.write(_getBinaryFromString, 0, length);
            return length;
        }
        if (!this._tokenIncomplete) {
            byte[] bArr = this._binaryValue;
            if (bArr == null) {
                return 0;
            }
            int length2 = bArr.length;
            outputStream.write(bArr, 0, length2);
            return length2;
        }
        this._tokenIncomplete = false;
        int _decodeExplicitLength = _decodeExplicitLength(this._typeByte & 31);
        if (_decodeExplicitLength >= 0) {
            return _readAndWriteBytes(outputStream, _decodeExplicitLength);
        }
        while (true) {
            int _decodeChunkLength = _decodeChunkLength(2);
            if (_decodeChunkLength < 0) {
                return i3;
            }
            i3 += _readAndWriteBytes(outputStream, _decodeChunkLength);
        }
    }

    public void _reportInvalidOther(int i3, int i10) throws JsonParseException {
        this._inputPtr = i10;
        _reportInvalidOther(i3);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public CBORReadContext getParsingContext() {
        return this._streamReadContext;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        return (jsonToken == JsonToken.VALUE_STRING || !(jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue())) ? getText() : str;
    }
}
