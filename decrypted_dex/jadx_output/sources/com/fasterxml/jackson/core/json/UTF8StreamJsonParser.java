package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.UByte;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class UTF8StreamJsonParser extends ParserBase {
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int[] _quadBuffer;
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_NON_NUM_NUMBERS = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public UTF8StreamJsonParser(IOContext iOContext, int i3, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i10, int i11, int i12, boolean z2) {
        super(iOContext, i3);
        this._quadBuffer = new int[16];
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i10;
        this._inputEnd = i11;
        this._currInputRowStart = i10 - i12;
        this._currInputProcessed = (-i10) + i12;
        this._bufferRecyclable = z2;
    }

    private final void _checkMatchEnd(String str, int i3, int i10) throws IOException {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i10))) {
            _reportInvalidToken(str.substring(0, i3));
        }
    }

    private final void _closeArrayScope() throws JsonParseException {
        _updateLocation();
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final void _closeObjectScope() throws JsonParseException {
        _updateLocation();
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final JsonToken _closeScope(int i3) throws JsonParseException {
        if (i3 == 125) {
            _closeObjectScope();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        _closeArrayScope();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final int _decodeUtf8_2(int i3) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        byte b2 = bArr[i10];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i11);
        }
        return ((i3 & 31) << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_3(int i3) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i10 = i3 & 15;
        byte[] bArr = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b2 = bArr[i11];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i12);
        }
        int i13 = (i10 << 6) | (b2 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i14 = this._inputPtr;
        int i15 = i14 + 1;
        this._inputPtr = i15;
        byte b10 = bArr2[i14];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & UByte.MAX_VALUE, i15);
        }
        return (i13 << 6) | (b10 & 63);
    }

    private final int _decodeUtf8_3fast(int i3) throws IOException {
        int i10 = i3 & 15;
        byte[] bArr = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b2 = bArr[i11];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i12);
        }
        int i13 = (i10 << 6) | (b2 & 63);
        byte[] bArr2 = this._inputBuffer;
        int i14 = this._inputPtr;
        int i15 = i14 + 1;
        this._inputPtr = i15;
        byte b10 = bArr2[i14];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & UByte.MAX_VALUE, i15);
        }
        return (i13 << 6) | (b10 & 63);
    }

    private final int _decodeUtf8_4(int i3) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        byte b2 = bArr[i10];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i11);
        }
        int i12 = ((i3 & 7) << 6) | (b2 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i13 = this._inputPtr;
        int i14 = i13 + 1;
        this._inputPtr = i14;
        byte b10 = bArr2[i13];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & UByte.MAX_VALUE, i14);
        }
        int i15 = (i12 << 6) | (b10 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i16 = this._inputPtr;
        int i17 = i16 + 1;
        this._inputPtr = i17;
        byte b11 = bArr3[i16];
        if ((b11 & 192) != 128) {
            _reportInvalidOther(b11 & UByte.MAX_VALUE, i17);
        }
        return ((i15 << 6) | (b11 & 63)) - PKIFailureInfo.notAuthorized;
    }

    private final void _finishString2(char[] cArr, int i3) throws IOException {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i10 = this._inputPtr;
            if (i10 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i10 = this._inputPtr;
            }
            int i11 = 0;
            if (i3 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int min = Math.min(this._inputEnd, (cArr.length - i3) + i10);
            while (true) {
                if (i10 >= min) {
                    this._inputPtr = i10;
                    break;
                }
                int i12 = i10 + 1;
                int i13 = bArr[i10] & UByte.MAX_VALUE;
                int i14 = iArr[i13];
                if (i14 != 0) {
                    this._inputPtr = i12;
                    if (i13 == 34) {
                        this._textBuffer.setCurrentLength(i3);
                        return;
                    }
                    if (i14 == 1) {
                        i13 = _decodeEscaped();
                    } else if (i14 == 2) {
                        i13 = _decodeUtf8_2(i13);
                    } else if (i14 == 3) {
                        i13 = this._inputEnd - i12 >= 2 ? _decodeUtf8_3fast(i13) : _decodeUtf8_3(i13);
                    } else if (i14 == 4) {
                        int _decodeUtf8_4 = _decodeUtf8_4(i13);
                        int i15 = i3 + 1;
                        cArr[i3] = (char) ((_decodeUtf8_4 >> 10) | 55296);
                        if (i15 >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                            i3 = 0;
                        } else {
                            i3 = i15;
                        }
                        i13 = (_decodeUtf8_4 & 1023) | 56320;
                    } else if (i13 < 32) {
                        _throwUnquotedSpace(i13, StubApp.getString2(10435));
                    } else {
                        _reportInvalidChar(i13);
                    }
                    if (i3 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                    } else {
                        i11 = i3;
                    }
                    i3 = i11 + 1;
                    cArr[i11] = (char) i13;
                } else {
                    cArr[i3] = (char) i13;
                    i10 = i12;
                    i3++;
                }
            }
        }
    }

    private final void _matchToken2(String str, int i3) throws IOException {
        int i10;
        int i11;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i3)) {
                _reportInvalidToken(str.substring(0, i3));
            }
            i10 = this._inputPtr + 1;
            this._inputPtr = i10;
            i3++;
        } while (i3 < length);
        if ((i10 < this._inputEnd || _loadMore()) && (i11 = this._inputBuffer[this._inputPtr] & UByte.MAX_VALUE) >= 48 && i11 != 93 && i11 != 125) {
            _checkMatchEnd(str, i3, i11);
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i3) throws IOException {
        if (i3 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i3 == 43) {
            if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                JsonToken _parseSignedNumber = _parseSignedNumber(false);
                this._currToken = _parseSignedNumber;
                return _parseSignedNumber;
            }
            JsonToken _handleUnexpectedValue = _handleUnexpectedValue(i3);
            this._currToken = _handleUnexpectedValue;
            return _handleUnexpectedValue;
        }
        if (i3 == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i3 == 102) {
            _matchFalse();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i3 == 110) {
            _matchNull();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i3 == 116) {
            _matchTrue();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        }
        if (i3 == 123) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
        if (i3 == 45) {
            JsonToken _parseSignedNumber2 = _parseSignedNumber(true);
            this._currToken = _parseSignedNumber2;
            return _parseSignedNumber2;
        }
        if (i3 == 46) {
            JsonToken _parseFloatThatStartsWithPeriod = _parseFloatThatStartsWithPeriod(false, false);
            this._currToken = _parseFloatThatStartsWithPeriod;
            return _parseFloatThatStartsWithPeriod;
        }
        switch (i3) {
            case 48:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case EACTags.SEX /* 53 */:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case 55:
            case 56:
            case 57:
                JsonToken _parseUnsignedNumber = _parseUnsignedNumber(i3);
                this._currToken = _parseUnsignedNumber;
                return _parseUnsignedNumber;
            default:
                JsonToken _handleUnexpectedValue2 = _handleUnexpectedValue(i3);
                this._currToken = _handleUnexpectedValue2;
                return _handleUnexpectedValue2;
        }
    }

    private static final int _padLastQuad(int i3, int i10) {
        return i10 == 4 ? i3 : i3 | ((-1) << (i10 << 3));
    }

    private final JsonToken _parseFloat(char[] cArr, int i3, int i10, boolean z2, int i11) throws IOException {
        int i12;
        boolean z10;
        int i13 = 0;
        if (i10 == 46) {
            if (i3 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            cArr[i3] = (char) i10;
            i3++;
            i12 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z10 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                i10 = bArr[i14] & UByte.MAX_VALUE;
                if (i10 < 48 || i10 > 57) {
                    break;
                }
                i12++;
                if (i3 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i3 = 0;
                }
                cArr[i3] = (char) i10;
                i3++;
            }
            z10 = false;
            if (i12 == 0 && !isEnabled(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                _reportUnexpectedNumberChar(i10, StubApp.getString2(10417));
            }
        } else {
            i12 = 0;
            z10 = false;
        }
        if (i10 == 101 || i10 == 69) {
            if (i3 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int i15 = i3 + 1;
            cArr[i3] = (char) i10;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i16 = this._inputPtr;
            this._inputPtr = i16 + 1;
            int i17 = bArr2[i16] & UByte.MAX_VALUE;
            if (i17 == 45 || i17 == 43) {
                if (i15 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i15 = 0;
                }
                int i18 = i15 + 1;
                cArr[i15] = (char) i17;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i19 = this._inputPtr;
                this._inputPtr = i19 + 1;
                i17 = bArr3[i19] & UByte.MAX_VALUE;
                i15 = i18;
            }
            i10 = i17;
            int i20 = 0;
            while (i10 >= 48 && i10 <= 57) {
                i20++;
                if (i15 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i15 = 0;
                }
                int i21 = i15 + 1;
                cArr[i15] = (char) i10;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i13 = i20;
                    z10 = true;
                    i3 = i21;
                    break;
                }
                byte[] bArr4 = this._inputBuffer;
                int i22 = this._inputPtr;
                this._inputPtr = i22 + 1;
                i10 = bArr4[i22] & UByte.MAX_VALUE;
                i15 = i21;
            }
            i13 = i20;
            i3 = i15;
            if (i13 == 0) {
                _reportUnexpectedNumberChar(i10, StubApp.getString2(10418));
            }
        }
        if (!z10) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(i10);
            }
        }
        this._textBuffer.setCurrentLength(i3);
        return resetFloat(z2, i11, i12, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r3 == 46) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3 == 101) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r3 != 69) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r6._inputPtr = r8;
        r6._textBuffer.setCurrentLength(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r6._parsingContext.inRoot() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        _verifyRootSpace(r6._inputBuffer[r6._inputPtr] & kotlin.UByte.MAX_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        return resetInt(r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        return _parseFloat(r1, r2, r3, r9, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.fasterxml.jackson.core.JsonToken _parseNumber2(char[] r7, int r8, boolean r9, int r10) throws java.io.IOException {
        /*
            r6 = this;
            r1 = r7
            r2 = r8
            r5 = r10
        L3:
            int r7 = r6._inputPtr
            int r8 = r6._inputEnd
            if (r7 < r8) goto L19
            boolean r7 = r6._loadMore()
            if (r7 != 0) goto L19
            com.fasterxml.jackson.core.util.TextBuffer r7 = r6._textBuffer
            r7.setCurrentLength(r2)
            com.fasterxml.jackson.core.JsonToken r7 = r6.resetInt(r9, r5)
            return r7
        L19:
            byte[] r7 = r6._inputBuffer
            int r8 = r6._inputPtr
            int r10 = r8 + 1
            r6._inputPtr = r10
            r7 = r7[r8]
            r3 = r7 & 255(0xff, float:3.57E-43)
            r7 = 57
            if (r3 > r7) goto L42
            r7 = 48
            if (r3 >= r7) goto L2e
            goto L42
        L2e:
            int r7 = r1.length
            if (r2 < r7) goto L39
            com.fasterxml.jackson.core.util.TextBuffer r7 = r6._textBuffer
            char[] r7 = r7.finishCurrentSegment()
            r2 = 0
            r1 = r7
        L39:
            int r7 = r2 + 1
            char r8 = (char) r3
            r1[r2] = r8
            int r5 = r5 + 1
            r2 = r7
            goto L3
        L42:
            r7 = 46
            if (r3 == r7) goto L4e
            r7 = 101(0x65, float:1.42E-43)
            if (r3 == r7) goto L4e
            r7 = 69
            if (r3 != r7) goto L51
        L4e:
            r0 = r6
            r4 = r9
            goto L70
        L51:
            r6._inputPtr = r8
            com.fasterxml.jackson.core.util.TextBuffer r7 = r6._textBuffer
            r7.setCurrentLength(r2)
            com.fasterxml.jackson.core.json.JsonReadContext r7 = r6._parsingContext
            boolean r7 = r7.inRoot()
            if (r7 == 0) goto L6b
            byte[] r7 = r6._inputBuffer
            int r8 = r6._inputPtr
            r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6._verifyRootSpace(r7)
        L6b:
            com.fasterxml.jackson.core.JsonToken r7 = r6.resetInt(r9, r5)
            return r7
        L70:
            com.fasterxml.jackson.core.JsonToken r7 = r0._parseFloat(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._parseNumber2(char[], int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private final JsonToken _parseSignedNumber(boolean z2) throws IOException {
        int i3;
        int i10;
        int i11;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i12 = 1;
        int i13 = 0;
        if (z2) {
            emptyAndGetCurrentSegment[0] = '-';
            i13 = 1;
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i14 = this._inputPtr;
        this._inputPtr = i14 + 1;
        int i15 = bArr[i14] & UByte.MAX_VALUE;
        if (i15 <= 48) {
            if (i15 != 48) {
                return i15 == 46 ? _parseFloatThatStartsWithPeriod(z2, true) : _handleInvalidNumberStart(i15, z2, true);
            }
            i15 = _verifyNoLeadingZeroes();
        } else if (i15 > 57) {
            return _handleInvalidNumberStart(i15, z2, true);
        }
        int i16 = i13 + 1;
        emptyAndGetCurrentSegment[i13] = (char) i15;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - i16);
        while (true) {
            i3 = i16;
            i10 = this._inputPtr;
            if (i10 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i3, z2, i12);
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i10 + 1;
            i11 = bArr2[i10] & UByte.MAX_VALUE;
            if (i11 < 48 || i11 > 57) {
                break;
            }
            i12++;
            i16 = i3 + 1;
            emptyAndGetCurrentSegment[i3] = (char) i11;
        }
        if (i11 == 46 || i11 == 101 || i11 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i3, i11, z2, i12);
        }
        this._inputPtr = i10;
        this._textBuffer.setCurrentLength(i3);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i11);
        }
        return resetInt(z2, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        _reportInvalidEOF(com.stub.StubApp.getString2(10424), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void _skipCComment() throws java.io.IOException {
        /*
            r5 = this;
            int[] r0 = com.fasterxml.jackson.core.io.CharTypes.getInputCodeComment()
        L4:
            int r1 = r5._inputPtr
            int r2 = r5._inputEnd
            if (r1 < r2) goto L10
            boolean r1 = r5._loadMore()
            if (r1 == 0) goto L43
        L10:
            byte[] r1 = r5._inputBuffer
            int r2 = r5._inputPtr
            int r3 = r2 + 1
            r5._inputPtr = r3
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0[r1]
            if (r2 == 0) goto L4
            r4 = 2
            if (r2 == r4) goto L73
            r4 = 3
            if (r2 == r4) goto L6f
            r4 = 4
            if (r2 == r4) goto L6b
            r4 = 10
            if (r2 == r4) goto L62
            r4 = 13
            if (r2 == r4) goto L5e
            r4 = 42
            if (r2 == r4) goto L39
            r5._reportInvalidChar(r1)
            goto L4
        L39:
            int r1 = r5._inputEnd
            if (r3 < r1) goto L4f
            boolean r1 = r5._loadMore()
            if (r1 != 0) goto L4f
        L43:
            r0 = 10424(0x28b8, float:1.4607E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 0
            r5._reportInvalidEOF(r0, r1)
            return
        L4f:
            byte[] r1 = r5._inputBuffer
            int r2 = r5._inputPtr
            r1 = r1[r2]
            r3 = 47
            if (r1 != r3) goto L4
            int r2 = r2 + 1
            r5._inputPtr = r2
            return
        L5e:
            r5._skipCR()
            goto L4
        L62:
            int r1 = r5._currInputRow
            int r1 = r1 + 1
            r5._currInputRow = r1
            r5._currInputRowStart = r3
            goto L4
        L6b:
            r5._skipUtf8_4(r1)
            goto L4
        L6f:
            r5._skipUtf8_3()
            goto L4
        L73:
            r5._skipUtf8_2()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipCComment():void");
    }

    private final int _skipColon() throws IOException {
        int i3 = this._inputPtr;
        if (i3 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b2 = bArr[i3];
        if (b2 == 58) {
            int i10 = i3 + 1;
            this._inputPtr = i10;
            byte b10 = bArr[i10];
            if (b10 > 32) {
                if (b10 == 47 || b10 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr = i3 + 2;
                return b10;
            }
            if (b10 == 32 || b10 == 9) {
                int i11 = i3 + 2;
                this._inputPtr = i11;
                byte b11 = bArr[i11];
                if (b11 > 32) {
                    if (b11 == 47 || b11 == 35) {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i3 + 3;
                    return b11;
                }
            }
            return _skipColon2(true);
        }
        if (b2 == 32 || b2 == 9) {
            int i12 = i3 + 1;
            this._inputPtr = i12;
            b2 = bArr[i12];
        }
        if (b2 != 58) {
            return _skipColon2(false);
        }
        int i13 = this._inputPtr;
        int i14 = i13 + 1;
        this._inputPtr = i14;
        byte b12 = bArr[i14];
        if (b12 > 32) {
            if (b12 == 47 || b12 == 35) {
                return _skipColon2(true);
            }
            this._inputPtr = i13 + 2;
            return b12;
        }
        if (b12 == 32 || b12 == 9) {
            int i15 = i13 + 2;
            this._inputPtr = i15;
            byte b13 = bArr[i15];
            if (b13 > 32) {
                if (b13 == 47 || b13 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr = i13 + 3;
                return b13;
            }
        }
        return _skipColon2(true);
    }

    private final int _skipColon2(boolean z2) throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(StubApp.getString2(10425) + this._parsingContext.typeDesc() + StubApp.getString2(10423), null);
                return -1;
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            int i10 = i3 + 1;
            this._inputPtr = i10;
            int i11 = bArr[i3] & UByte.MAX_VALUE;
            if (i11 > 32) {
                if (i11 == 47) {
                    _skipComment();
                } else if (i11 != 35 || !_skipYAMLComment()) {
                    if (z2) {
                        return i11;
                    }
                    if (i11 != 58) {
                        _reportUnexpectedChar(i11, StubApp.getString2(10426));
                    }
                    z2 = true;
                }
            } else if (i11 != 32) {
                if (i11 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i10;
                } else if (i11 == 13) {
                    _skipCR();
                } else if (i11 != 9) {
                    _throwInvalidSpace(i11);
                }
            }
        }
    }

    private final void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, StubApp.getString2(10428));
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(StubApp.getString2(10424), null);
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        int i10 = bArr[i3] & UByte.MAX_VALUE;
        if (i10 == 47) {
            _skipLine();
        } else if (i10 == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(i10, StubApp.getString2(10429));
        }
    }

    private final void _skipLine() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            int i10 = i3 + 1;
            this._inputPtr = i10;
            int i11 = bArr[i3] & UByte.MAX_VALUE;
            int i12 = inputCodeComment[i11];
            if (i12 != 0) {
                if (i12 == 2) {
                    _skipUtf8_2();
                } else if (i12 == 3) {
                    _skipUtf8_3();
                } else if (i12 == 4) {
                    _skipUtf8_4(i11);
                } else if (i12 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i10;
                    return;
                } else if (i12 == 13) {
                    _skipCR();
                    return;
                } else if (i12 != 42 && i12 < 0) {
                    _reportInvalidChar(i11);
                }
            }
        }
    }

    private final void _skipUtf8_2() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i10 = i3 + 1;
        this._inputPtr = i10;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i10);
        }
    }

    private final void _skipUtf8_3() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i10 = i3 + 1;
        this._inputPtr = i10;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i10);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b10 = bArr2[i11];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & UByte.MAX_VALUE, i12);
        }
    }

    private final void _skipUtf8_4(int i3) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        byte b2 = bArr[i10];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i11);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i12 = this._inputPtr;
        int i13 = i12 + 1;
        this._inputPtr = i13;
        byte b10 = bArr2[i12];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & UByte.MAX_VALUE, i13);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i14 = this._inputPtr;
        int i15 = i14 + 1;
        this._inputPtr = i15;
        byte b11 = bArr3[i14];
        if ((b11 & 192) != 128) {
            _reportInvalidOther(b11 & UByte.MAX_VALUE, i15);
        }
    }

    private final int _skipWS() throws IOException {
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                return _skipWS2();
            }
            byte[] bArr = this._inputBuffer;
            int i10 = i3 + 1;
            this._inputPtr = i10;
            int i11 = bArr[i3] & UByte.MAX_VALUE;
            if (i11 > 32) {
                if (i11 != 47 && i11 != 35) {
                    return i11;
                }
                this._inputPtr = i3;
                return _skipWS2();
            }
            if (i11 != 32) {
                if (i11 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i10;
                } else if (i11 == 13) {
                    _skipCR();
                } else if (i11 != 9) {
                    _throwInvalidSpace(i11);
                }
            }
        }
    }

    private final int _skipWS2() throws IOException {
        int i3;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError(StubApp.getString2(10422) + this._parsingContext.typeDesc() + StubApp.getString2(10423));
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            i3 = bArr[i10] & UByte.MAX_VALUE;
            if (i3 > 32) {
                if (i3 == 47) {
                    _skipComment();
                } else if (i3 != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i3 != 32) {
                if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (i3 == 13) {
                    _skipCR();
                } else if (i3 != 9) {
                    _throwInvalidSpace(i3);
                }
            }
        }
        return i3;
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i10 = i3 + 1;
        this._inputPtr = i10;
        int i11 = bArr[i3] & UByte.MAX_VALUE;
        if (i11 > 32) {
            if (i11 != 47 && i11 != 35) {
                return i11;
            }
            this._inputPtr = i3;
            return _skipWSOrEnd2();
        }
        if (i11 != 32) {
            if (i11 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i10;
            } else if (i11 == 13) {
                _skipCR();
            } else if (i11 != 9) {
                _throwInvalidSpace(i11);
            }
        }
        while (true) {
            int i12 = this._inputPtr;
            if (i12 >= this._inputEnd) {
                return _skipWSOrEnd2();
            }
            byte[] bArr2 = this._inputBuffer;
            int i13 = i12 + 1;
            this._inputPtr = i13;
            int i14 = bArr2[i12] & UByte.MAX_VALUE;
            if (i14 > 32) {
                if (i14 != 47 && i14 != 35) {
                    return i14;
                }
                this._inputPtr = i12;
                return _skipWSOrEnd2();
            }
            if (i14 != 32) {
                if (i14 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i13;
                } else if (i14 == 13) {
                    _skipCR();
                } else if (i14 != 9) {
                    _throwInvalidSpace(i14);
                }
            }
        }
    }

    private final int _skipWSOrEnd2() throws IOException {
        int i3;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            i3 = bArr[i10] & UByte.MAX_VALUE;
            if (i3 > 32) {
                if (i3 == 47) {
                    _skipComment();
                } else if (i3 != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i3 != 32) {
                if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (i3 == 13) {
                    _skipCR();
                } else if (i3 != 9) {
                    _throwInvalidSpace(i3);
                }
            }
        }
        return i3;
    }

    private final boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i3 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i3;
        this._tokenInputCol = i3 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i3 = this._inputPtr;
        this._nameStartOffset = i3;
        this._nameStartCol = i3 - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() throws IOException {
        int i3;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (i3 = this._inputBuffer[this._inputPtr] & UByte.MAX_VALUE) < 48 || i3 > 57) {
            return 48;
        }
        if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber(StubApp.getString2(10430));
        }
        this._inputPtr++;
        if (i3 != 48) {
            return i3;
        }
        do {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return i3;
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            i3 = bArr[i10] & UByte.MAX_VALUE;
            if (i3 < 48 || i3 > 57) {
                return 48;
            }
            this._inputPtr = i10 + 1;
        } while (i3 == 48);
        return i3;
    }

    private final void _verifyRootSpace(int i3) throws IOException {
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        if (i3 != 9) {
            if (i3 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i11;
            } else if (i3 == 13) {
                this._inputPtr = i10;
            } else if (i3 != 32) {
                _reportMissingRootWS(i3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String addName(int[] r18, int r19, int r20) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.addName(int[], int, int):java.lang.String");
    }

    private final String findName(int i3, int i10) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i3, i10);
        String findName = this._symbols.findName(_padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = _padLastQuad;
        return addName(iArr, 1, i10);
    }

    private int nextByte() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        return bArr[i3] & UByte.MAX_VALUE;
    }

    private final String parseName(int i3, int i10, int i11) throws IOException {
        return parseEscapedName(this._quadBuffer, 0, i3, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            int i10 = bArr[i3] & UByte.MAX_VALUE;
            if (i10 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(i10);
                if (decodeBase64Char < 0) {
                    if (i10 == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, i10, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                int i12 = bArr2[i11] & UByte.MAX_VALUE;
                int decodeBase64Char2 = base64Variant.decodeBase64Char(i12);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, i12, 1);
                }
                int i13 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                int i15 = bArr3[i14] & UByte.MAX_VALUE;
                int decodeBase64Char3 = base64Variant.decodeBase64Char(i15);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (i15 == 34) {
                            _getByteArrayBuilder.append(i13 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, i15, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i16 = this._inputPtr;
                        this._inputPtr = i16 + 1;
                        int i17 = bArr4[i16] & UByte.MAX_VALUE;
                        if (!base64Variant.usesPaddingChar(i17) && _decodeBase64Escape(base64Variant, i17, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i17, 3, StubApp.getString2(10431) + base64Variant.getPaddingChar() + StubApp.getString2(620));
                        }
                        _getByteArrayBuilder.append(i13 >> 4);
                    }
                }
                int i18 = (i13 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i19 = this._inputPtr;
                this._inputPtr = i19 + 1;
                int i20 = bArr5[i19] & UByte.MAX_VALUE;
                int decodeBase64Char4 = base64Variant.decodeBase64Char(i20);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (i20 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i18 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, i20, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i18 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i18 << 6) | decodeBase64Char4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int _decodeCharForError(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = r7 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L69
            r1 = r7 & 224(0xe0, float:3.14E-43)
            r2 = 2
            r3 = 1
            r4 = 192(0xc0, float:2.69E-43)
            if (r1 != r4) goto L12
            r0 = r7 & 31
        L10:
            r7 = r3
            goto L2c
        L12:
            r1 = r7 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r1 != r4) goto L1c
            r0 = r7 & 15
            r7 = r2
            goto L2c
        L1c:
            r1 = r7 & 248(0xf8, float:3.48E-43)
            r4 = 240(0xf0, float:3.36E-43)
            if (r1 != r4) goto L26
            r0 = r7 & 7
            r7 = 3
            goto L2c
        L26:
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidInitial(r7)
            goto L10
        L2c:
            int r1 = r6.nextByte()
            r4 = r1 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 == r5) goto L3b
            r4 = r1 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r4)
        L3b:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r3) goto L69
            int r1 = r6.nextByte()
            r3 = r1 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L4f
            r3 = r1 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r3)
        L4f:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r2) goto L69
            int r7 = r6.nextByte()
            r1 = r7 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L63
            r1 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r1)
        L63:
            int r0 = r0 << 6
            r7 = r7 & 63
            r7 = r7 | r0
            return r7
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._decodeCharForError(int):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        int i3 = this._inputPtr;
        int i10 = this._inputEnd;
        String string2 = StubApp.getString2(10432);
        if (i3 >= i10 && !_loadMore()) {
            _reportInvalidEOF(string2, JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i11 = this._inputPtr;
        this._inputPtr = i11 + 1;
        byte b2 = bArr[i11];
        if (b2 == 34 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return '\r';
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b2));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(string2, JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this._inputBuffer;
            int i14 = this._inputPtr;
            this._inputPtr = i14 + 1;
            byte b10 = bArr2[i14];
            int charToHex = CharTypes.charToHex(b10);
            if (charToHex < 0) {
                _reportUnexpectedChar(b10 & UByte.MAX_VALUE, StubApp.getString2(10433));
            }
            i12 = (i12 << 4) | charToHex;
        }
        return (char) i12;
    }

    public String _finishAndReturnString() throws IOException {
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i3 = this._inputPtr;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i3);
        byte[] bArr = this._inputBuffer;
        int i10 = 0;
        while (true) {
            if (i3 >= min) {
                break;
            }
            int i11 = bArr[i3] & UByte.MAX_VALUE;
            if (iArr[i11] == 0) {
                i3++;
                emptyAndGetCurrentSegment[i10] = (char) i11;
                i10++;
            } else if (i11 == 34) {
                this._inputPtr = i3 + 1;
                return this._textBuffer.setCurrentAndReturn(i10);
            }
        }
        this._inputPtr = i3;
        _finishString2(emptyAndGetCurrentSegment, i10);
        return this._textBuffer.contentsAsString();
    }

    public void _finishString() throws IOException {
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i3 = this._inputPtr;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i3);
        byte[] bArr = this._inputBuffer;
        int i10 = 0;
        while (true) {
            if (i3 >= min) {
                break;
            }
            int i11 = bArr[i3] & UByte.MAX_VALUE;
            if (iArr[i11] == 0) {
                i3++;
                emptyAndGetCurrentSegment[i10] = (char) i11;
                i10++;
            } else if (i11 == 34) {
                this._inputPtr = i3 + 1;
                this._textBuffer.setCurrentLength(i10);
                return;
            }
        }
        this._inputPtr = i3;
        _finishString2(emptyAndGetCurrentSegment, i10);
    }

    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        return id != 5 ? (id == 6 || id == 7 || id == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    public JsonToken _handleApos() throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        int i3 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int i10 = this._inputEnd;
            int length = (emptyAndGetCurrentSegment.length - i3) + this._inputPtr;
            if (length < i10) {
                i10 = length;
            }
            while (true) {
                int i11 = this._inputPtr;
                if (i11 < i10) {
                    int i12 = i11 + 1;
                    this._inputPtr = i12;
                    int i13 = bArr[i11] & UByte.MAX_VALUE;
                    if (i13 == 39) {
                        this._textBuffer.setCurrentLength(i3);
                        return JsonToken.VALUE_STRING;
                    }
                    int i14 = iArr[i13];
                    if (i14 == 0 || i13 == 34) {
                        emptyAndGetCurrentSegment[i3] = (char) i13;
                        i3++;
                    } else {
                        if (i14 == 1) {
                            i13 = _decodeEscaped();
                        } else if (i14 == 2) {
                            i13 = _decodeUtf8_2(i13);
                        } else if (i14 == 3) {
                            i13 = this._inputEnd - i12 >= 2 ? _decodeUtf8_3fast(i13) : _decodeUtf8_3(i13);
                        } else if (i14 != 4) {
                            if (i13 < 32) {
                                _throwUnquotedSpace(i13, StubApp.getString2(10435));
                            }
                            _reportInvalidChar(i13);
                        } else {
                            int _decodeUtf8_4 = _decodeUtf8_4(i13);
                            int i15 = i3 + 1;
                            emptyAndGetCurrentSegment[i3] = (char) ((_decodeUtf8_4 >> 10) | 55296);
                            if (i15 >= emptyAndGetCurrentSegment.length) {
                                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                i3 = 0;
                            } else {
                                i3 = i15;
                            }
                            i13 = 56320 | (_decodeUtf8_4 & 1023);
                        }
                        if (i3 >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i3 = 0;
                        }
                        emptyAndGetCurrentSegment[i3] = (char) i13;
                        i3++;
                    }
                }
            }
        }
    }

    public JsonToken _handleInvalidNumberStart(int i3, boolean z2, boolean z10) throws IOException {
        String string2;
        while (i3 == 73) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            i3 = bArr[i10];
            if (i3 != 78) {
                if (i3 != 110) {
                    break;
                }
                string2 = z2 ? StubApp.getString2(10403) : StubApp.getString2(10440);
            } else {
                string2 = z2 ? StubApp.getString2(10438) : StubApp.getString2(10439);
            }
            _matchToken(string2, 3);
            if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                return resetAsNaN(string2, z2 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            _reportError(StubApp.getString2(10469), string2);
        }
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) && z10 && !z2) {
            _reportUnexpectedNumberChar(43, StubApp.getString2(10441));
        }
        _reportUnexpectedNumberChar(i3, z2 ? StubApp.getString2(10442) : StubApp.getString2(10443));
        return null;
    }

    public String _handleOddName(int i3) throws IOException {
        if (i3 == 39 && (this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _parseAposName();
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) _decodeCharForError(i3), StubApp.getString2(10444));
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i3] != 0) {
            _reportUnexpectedChar(i3, StubApp.getString2(10445));
        }
        int[] iArr = this._quadBuffer;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i10 < 4) {
                i10++;
                i3 |= i12 << 8;
            } else {
                if (i11 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i11] = i12;
                i11++;
                i10 = 1;
            }
            i12 = i3;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(StubApp.getString2(10419), JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i13 = this._inputPtr;
            i3 = bArr[i13] & UByte.MAX_VALUE;
            if (inputCodeUtf8JsNames[i3] != 0) {
                break;
            }
            this._inputPtr = i13 + 1;
        }
        if (i10 > 0) {
            if (i11 >= iArr.length) {
                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i11] = i12;
            i11++;
        }
        String findName = this._symbols.findName(iArr, i11);
        return findName == null ? addName(iArr, i11, i10) : findName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r4 != 44) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r3._parsingContext.inRoot() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if ((r3._features & com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final boolean _loadMore() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this._inputStream;
        if (inputStream == null || (length = (bArr = this._inputBuffer).length) == 0) {
            return false;
        }
        int read = inputStream.read(bArr, 0, length);
        if (read <= 0) {
            _closeInput();
            if (read == 0) {
                throw new IOException(AbstractC1482f.f(this._inputBuffer.length, StubApp.getString2(693), new StringBuilder(StubApp.getString2(10470))));
            }
            return false;
        }
        int i3 = this._inputEnd;
        this._currInputProcessed += i3;
        this._currInputRowStart -= i3;
        this._nameStartOffset -= i3;
        this._inputPtr = 0;
        this._inputEnd = read;
        return true;
    }

    public void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    public final void _matchFalse() throws IOException {
        int i3;
        int i10 = this._inputPtr;
        if (i10 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i11 = i10 + 1;
            if (bArr[i10] == 97) {
                int i12 = i10 + 2;
                if (bArr[i11] == 108) {
                    int i13 = i10 + 3;
                    if (bArr[i12] == 115) {
                        int i14 = i10 + 4;
                        if (bArr[i13] == 101 && ((i3 = bArr[i14] & UByte.MAX_VALUE) < 48 || i3 == 93 || i3 == 125)) {
                            this._inputPtr = i14;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2(StubApp.getString2(9372), 1);
    }

    public final void _matchNull() throws IOException {
        int i3;
        int i10 = this._inputPtr;
        if (i10 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i11 = i10 + 1;
            if (bArr[i10] == 117) {
                int i12 = i10 + 2;
                if (bArr[i11] == 108) {
                    int i13 = i10 + 3;
                    if (bArr[i12] == 108 && ((i3 = bArr[i13] & UByte.MAX_VALUE) < 48 || i3 == 93 || i3 == 125)) {
                        this._inputPtr = i13;
                        return;
                    }
                }
            }
        }
        _matchToken2(StubApp.getString2(1116), 1);
    }

    public final void _matchToken(String str, int i3) throws IOException {
        int i10;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i3);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i3)) {
                _reportInvalidToken(str.substring(0, i3));
            }
            i10 = this._inputPtr + 1;
            this._inputPtr = i10;
            i3++;
        } while (i3 < length);
        int i11 = this._inputBuffer[i10] & UByte.MAX_VALUE;
        if (i11 < 48 || i11 == 93 || i11 == 125) {
            return;
        }
        _checkMatchEnd(str, i3, i11);
    }

    public final void _matchTrue() throws IOException {
        int i3;
        int i10 = this._inputPtr;
        if (i10 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i11 = i10 + 1;
            if (bArr[i10] == 114) {
                int i12 = i10 + 2;
                if (bArr[i11] == 117) {
                    int i13 = i10 + 3;
                    if (bArr[i12] == 101 && ((i3 = bArr[i13] & UByte.MAX_VALUE) < 48 || i3 == 93 || i3 == 125)) {
                        this._inputPtr = i13;
                        return;
                    }
                }
            }
        }
        _matchToken2(StubApp.getString2(6547), 1);
    }

    public String _parseAposName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(StubApp.getString2(10471), JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        int i10 = bArr[i3] & UByte.MAX_VALUE;
        if (i10 == 39) {
            return "";
        }
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 != 39) {
            if (iArr2[i10] != 0 && i10 != 34) {
                if (i10 != 92) {
                    _throwUnquotedSpace(i10, StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
                } else {
                    i10 = _decodeEscaped();
                }
                if (i10 > 127) {
                    if (i11 >= 4) {
                        if (i12 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i12] = i13;
                        i13 = 0;
                        i12++;
                        i11 = 0;
                    }
                    if (i10 < 2048) {
                        i13 = (i13 << 8) | (i10 >> 6) | 192;
                        i11++;
                    } else {
                        int i14 = (i13 << 8) | (i10 >> 12) | BERTags.FLAGS;
                        int i15 = i11 + 1;
                        if (i15 >= 4) {
                            if (i12 >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i12] = i14;
                            i14 = 0;
                            i12++;
                            i15 = 0;
                        }
                        i13 = (i14 << 8) | ((i10 >> 6) & 63) | 128;
                        i11 = i15 + 1;
                    }
                    i10 = (i10 & 63) | 128;
                }
            }
            if (i11 < 4) {
                i11++;
                i10 |= i13 << 8;
            } else {
                if (i12 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i12] = i13;
                i12++;
                i11 = 1;
            }
            i13 = i10;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(StubApp.getString2(10419), JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this._inputBuffer;
            int i16 = this._inputPtr;
            this._inputPtr = i16 + 1;
            i10 = bArr2[i16] & UByte.MAX_VALUE;
        }
        if (i11 > 0) {
            if (i12 >= iArr.length) {
                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i12] = _padLastQuad(i13, i11);
            i12++;
        }
        String findName = this._symbols.findName(iArr, i12);
        return findName == null ? addName(iArr, i12, i11) : findName;
    }

    public final JsonToken _parseFloatThatStartsWithPeriod(boolean z2, boolean z10) throws IOException {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleUnexpectedValue(46);
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i3 = 0;
        if (z2) {
            emptyAndGetCurrentSegment[0] = '-';
            i3 = 1;
        }
        return _parseFloat(emptyAndGetCurrentSegment, i3, 46, z2, 0);
    }

    public final String _parseName(int i3) throws IOException {
        if (i3 != 34) {
            return _handleOddName(i3);
        }
        int i10 = this._inputPtr;
        if (i10 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        if (iArr[i12] != 0) {
            return i12 == 34 ? "" : parseName(0, i12, 0);
        }
        int i13 = i10 + 2;
        this._inputPtr = i13;
        int i14 = bArr[i11] & UByte.MAX_VALUE;
        if (iArr[i14] != 0) {
            return i14 == 34 ? findName(i12, 1) : parseName(i12, i14, 1);
        }
        int i15 = i14 | (i12 << 8);
        int i16 = i10 + 3;
        this._inputPtr = i16;
        int i17 = bArr[i13] & UByte.MAX_VALUE;
        if (iArr[i17] != 0) {
            return i17 == 34 ? findName(i15, 2) : parseName(i15, i17, 2);
        }
        int i18 = (i15 << 8) | i17;
        int i19 = i10 + 4;
        this._inputPtr = i19;
        int i20 = bArr[i16] & UByte.MAX_VALUE;
        if (iArr[i20] != 0) {
            return i20 == 34 ? findName(i18, 3) : parseName(i18, i20, 3);
        }
        int i21 = (i18 << 8) | i20;
        this._inputPtr = i10 + 5;
        int i22 = bArr[i19] & UByte.MAX_VALUE;
        if (iArr[i22] != 0) {
            return i22 == 34 ? findName(i21, 4) : parseName(i21, i22, 4);
        }
        this._quad1 = i21;
        return parseMediumName(i22);
    }

    public JsonToken _parseUnsignedNumber(int i3) throws IOException {
        int i10;
        int i11;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i3 == 48) {
            i3 = _verifyNoLeadingZeroes();
        }
        emptyAndGetCurrentSegment[0] = (char) i3;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 1);
        int i12 = 1;
        int i13 = 1;
        while (true) {
            i10 = this._inputPtr;
            if (i10 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i12, false, i13);
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i10 + 1;
            i11 = bArr[i10] & UByte.MAX_VALUE;
            if (i11 < 48 || i11 > 57) {
                break;
            }
            i13++;
            emptyAndGetCurrentSegment[i12] = (char) i11;
            i12++;
        }
        if (i11 == 46 || i11 == 101 || i11 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i12, i11, false, i13);
        }
        this._inputPtr = i10;
        this._textBuffer.setCurrentLength(i12);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i11);
        }
        return resetInt(false, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0135, code lost:
    
        r17._tokenIncomplete = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0137, code lost:
    
        if (r7 <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0139, code lost:
    
        r8 = r8 + r7;
        r19.write(r20, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int _readBinary(com.fasterxml.jackson.core.Base64Variant r18, java.io.OutputStream r19, byte[] r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._readBinary(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        byte[] bArr;
        byte[] bArr2;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (bArr = this._inputBuffer) == null || bArr == (bArr2 = ParserMinimalBase.NO_BYTES)) {
            return;
        }
        this._inputBuffer = bArr2;
        this._ioContext.releaseReadIOBuffer(bArr);
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

    public void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            if (bArr[i3] == 10) {
                this._inputPtr = i3 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    public void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i3 = this._inputPtr;
            int i10 = this._inputEnd;
            if (i3 >= i10) {
                _loadMoreGuaranteed();
                i3 = this._inputPtr;
                i10 = this._inputEnd;
            }
            while (true) {
                if (i3 >= i10) {
                    this._inputPtr = i3;
                    break;
                }
                int i11 = i3 + 1;
                int i12 = bArr[i3] & UByte.MAX_VALUE;
                int i13 = iArr[i12];
                if (i13 != 0) {
                    this._inputPtr = i11;
                    if (i12 == 34) {
                        return;
                    }
                    if (i13 == 1) {
                        _decodeEscaped();
                    } else if (i13 == 2) {
                        _skipUtf8_2();
                    } else if (i13 == 3) {
                        _skipUtf8_3();
                    } else if (i13 == 4) {
                        _skipUtf8_4(i12);
                    } else if (i12 < 32) {
                        _throwUnquotedSpace(i12, StubApp.getString2(10435));
                    } else {
                        _reportInvalidChar(i12);
                    }
                } else {
                    i3 = i11;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError(StubApp.getString2(10284) + this._currToken + StubApp.getString2(10452));
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e10) {
                throw _constructError(StubApp.getString2(10453) + base64Variant + StubApp.getString2(3055) + e10.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_contentReference(), this._currInputProcessed + this._inputPtr, -1L, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return ParserBase.JSON_READ_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id != 5) {
            if (id != 6) {
                if (id != 7 && id != 8) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.id();
        if (id == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (id != 6) {
            if (id != 7 && id != 8) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getTextOffset() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_contentReference(), this._tokenInputTotal - 1, -1L, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_contentReference(), this._currInputProcessed + (this._nameStartOffset - 1), -1L, this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
        int i3 = this._numTypesValid;
        if ((i3 & 1) == 0) {
            if (i3 == 0) {
                return _parseIntValue();
            }
            if ((i3 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken _parseSignedNumber;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        }
        if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWSOrEnd != 44) {
                _reportUnexpectedChar(_skipWSOrEnd, StubApp.getString2(10427) + this._parsingContext.typeDesc() + StubApp.getString2(10423));
            }
            _skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String _parseName = _parseName(_skipWSOrEnd);
        this._parsingContext.setCurrentName(_parseName);
        this._currToken = jsonToken2;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return _parseName;
        }
        if (_skipColon == 43) {
            _parseSignedNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parseSignedNumber(false) : _handleUnexpectedValue(_skipColon);
        } else if (_skipColon == 91) {
            _parseSignedNumber = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchFalse();
            _parseSignedNumber = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchNull();
            _parseSignedNumber = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchTrue();
            _parseSignedNumber = JsonToken.VALUE_TRUE;
        } else if (_skipColon == 123) {
            _parseSignedNumber = JsonToken.START_OBJECT;
        } else if (_skipColon == 45) {
            _parseSignedNumber = _parseSignedNumber(true);
        } else if (_skipColon != 46) {
            switch (_skipColon) {
                case 48:
                case 49:
                case 50:
                case EACTags.TRANSACTION_DATE /* 51 */:
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                case EACTags.SEX /* 53 */:
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                case 55:
                case 56:
                case 57:
                    _parseSignedNumber = _parseUnsignedNumber(_skipColon);
                    break;
                default:
                    _parseSignedNumber = _handleUnexpectedValue(_skipColon);
                    break;
            }
        } else {
            _parseSignedNumber = _parseFloatThatStartsWithPeriod(false, false);
        }
        this._nextToken = _parseSignedNumber;
        return _parseName;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            if (nextToken() == JsonToken.VALUE_STRING) {
                return getText();
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonToken _parseSignedNumber;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWSOrEnd != 44) {
                _reportUnexpectedChar(_skipWSOrEnd, StubApp.getString2(10427) + this._parsingContext.typeDesc() + StubApp.getString2(10423));
            }
            _skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                return _closeScope(_skipWSOrEnd);
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            return _nextTokenNotInObject(_skipWSOrEnd);
        }
        _updateNameLocation();
        this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
        this._currToken = jsonToken2;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        if (_skipColon == 43) {
            _parseSignedNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parseSignedNumber(false) : _handleUnexpectedValue(_skipColon);
        } else if (_skipColon == 91) {
            _parseSignedNumber = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchFalse();
            _parseSignedNumber = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchNull();
            _parseSignedNumber = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchTrue();
            _parseSignedNumber = JsonToken.VALUE_TRUE;
        } else if (_skipColon == 123) {
            _parseSignedNumber = JsonToken.START_OBJECT;
        } else if (_skipColon == 45) {
            _parseSignedNumber = _parseSignedNumber(true);
        } else if (_skipColon != 46) {
            switch (_skipColon) {
                case 48:
                case 49:
                case 50:
                case EACTags.TRANSACTION_DATE /* 51 */:
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                case EACTags.SEX /* 53 */:
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                case 55:
                case 56:
                case 57:
                    _parseSignedNumber = _parseUnsignedNumber(_skipColon);
                    break;
                default:
                    _parseSignedNumber = _handleUnexpectedValue(_skipColon);
                    break;
            }
        } else {
            _parseSignedNumber = _parseFloatThatStartsWithPeriod(false, false);
        }
        this._nextToken = _parseSignedNumber;
        return this._currToken;
    }

    public final String parseEscapedName(int[] iArr, int i3, int i10, int i11, int i12) throws IOException {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i11] != 0) {
                if (i11 == 34) {
                    break;
                }
                if (i11 != 92) {
                    _throwUnquotedSpace(i11, StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
                } else {
                    i11 = _decodeEscaped();
                }
                if (i11 > 127) {
                    int i13 = 0;
                    if (i12 >= 4) {
                        if (i3 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i3] = i10;
                        i3++;
                        i10 = 0;
                        i12 = 0;
                    }
                    if (i11 < 2048) {
                        i10 = (i10 << 8) | (i11 >> 6) | 192;
                        i12++;
                    } else {
                        int i14 = (i10 << 8) | (i11 >> 12) | BERTags.FLAGS;
                        int i15 = i12 + 1;
                        if (i15 >= 4) {
                            if (i3 >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i3] = i14;
                            i3++;
                            i15 = 0;
                        } else {
                            i13 = i14;
                        }
                        i10 = (i13 << 8) | ((i11 >> 6) & 63) | 128;
                        i12 = i15 + 1;
                    }
                    i11 = (i11 & 63) | 128;
                }
            }
            if (i12 < 4) {
                i12++;
                i10 = (i10 << 8) | i11;
            } else {
                if (i3 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i3] = i10;
                i10 = i11;
                i3++;
                i12 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(StubApp.getString2(10419), JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i16 = this._inputPtr;
            this._inputPtr = i16 + 1;
            i11 = bArr[i16] & UByte.MAX_VALUE;
        }
        if (i12 > 0) {
            if (i3 >= iArr.length) {
                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i3] = _padLastQuad(i10, i12);
            i3++;
        }
        String findName = this._symbols.findName(iArr, i3);
        return findName == null ? addName(iArr, i3, i12) : findName;
    }

    public final String parseLongName(int i3, int i10, int i11) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        int i12 = 1;
        iArr[1] = i10;
        iArr[2] = i11;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = _icLatin1;
        int i13 = i3;
        int i14 = 3;
        while (true) {
            int i15 = this._inputPtr;
            if (i15 + 4 > this._inputEnd) {
                return parseEscapedName(this._quadBuffer, i14, 0, i13, 0);
            }
            int i16 = i15 + 1;
            this._inputPtr = i16;
            int i17 = bArr[i15] & UByte.MAX_VALUE;
            if (iArr2[i17] != 0) {
                if (i17 == 34) {
                    return findName(this._quadBuffer, i14, i13, i12);
                }
                return parseEscapedName(this._quadBuffer, i14, i13, i17, 1);
            }
            int i18 = i13;
            int i19 = i12;
            int i20 = i14;
            int[] iArr3 = iArr2;
            int i21 = (i18 << 8) | i17;
            int i22 = i15 + 2;
            this._inputPtr = i22;
            int i23 = bArr[i16] & UByte.MAX_VALUE;
            if (iArr3[i23] != 0) {
                return i23 == 34 ? findName(this._quadBuffer, i20, i21, 2) : parseEscapedName(this._quadBuffer, i20, i21, i23, 2);
            }
            int i24 = (i21 << 8) | i23;
            int i25 = i15 + 3;
            this._inputPtr = i25;
            int i26 = bArr[i22] & UByte.MAX_VALUE;
            if (iArr3[i26] != 0) {
                return i26 == 34 ? findName(this._quadBuffer, i20, i24, 3) : parseEscapedName(this._quadBuffer, i20, i24, i26, 3);
            }
            int i27 = (i24 << 8) | i26;
            this._inputPtr = i15 + 4;
            int i28 = bArr[i25] & UByte.MAX_VALUE;
            if (iArr3[i28] != 0) {
                return i28 == 34 ? findName(this._quadBuffer, i20, i27, 4) : parseEscapedName(this._quadBuffer, i20, i27, i28, 4);
            }
            int[] iArr4 = this._quadBuffer;
            if (i20 >= iArr4.length) {
                this._quadBuffer = ParserBase.growArrayBy(iArr4, i20);
            }
            int i29 = i20 + 1;
            this._quadBuffer[i20] = i27;
            i12 = i19;
            i13 = i28;
            iArr2 = iArr3;
            i14 = i29;
        }
    }

    public final String parseMediumName(int i3) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        if (iArr[i12] != 0) {
            return i12 == 34 ? findName(this._quad1, i3, 1) : parseName(this._quad1, i3, i12, 1);
        }
        int i13 = (i3 << 8) | i12;
        int i14 = i10 + 2;
        this._inputPtr = i14;
        int i15 = bArr[i11] & UByte.MAX_VALUE;
        if (iArr[i15] != 0) {
            return i15 == 34 ? findName(this._quad1, i13, 2) : parseName(this._quad1, i13, i15, 2);
        }
        int i16 = (i13 << 8) | i15;
        int i17 = i10 + 3;
        this._inputPtr = i17;
        int i18 = bArr[i14] & UByte.MAX_VALUE;
        if (iArr[i18] != 0) {
            return i18 == 34 ? findName(this._quad1, i16, 3) : parseName(this._quad1, i16, i18, 3);
        }
        int i19 = (i16 << 8) | i18;
        this._inputPtr = i10 + 4;
        int i20 = bArr[i17] & UByte.MAX_VALUE;
        return iArr[i20] != 0 ? i20 == 34 ? findName(this._quad1, i19, 4) : parseName(this._quad1, i19, i20, 4) : parseMediumName2(i20, i19);
    }

    public final String parseMediumName2(int i3, int i10) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        int i13 = bArr[i11] & UByte.MAX_VALUE;
        if (iArr[i13] != 0) {
            return i13 == 34 ? findName(this._quad1, i10, i3, 1) : parseName(this._quad1, i10, i3, i13, 1);
        }
        int i14 = (i3 << 8) | i13;
        int i15 = i11 + 2;
        this._inputPtr = i15;
        int i16 = bArr[i12] & UByte.MAX_VALUE;
        if (iArr[i16] != 0) {
            return i16 == 34 ? findName(this._quad1, i10, i14, 2) : parseName(this._quad1, i10, i14, i16, 2);
        }
        int i17 = (i14 << 8) | i16;
        int i18 = i11 + 3;
        this._inputPtr = i18;
        int i19 = bArr[i15] & UByte.MAX_VALUE;
        if (iArr[i19] != 0) {
            return i19 == 34 ? findName(this._quad1, i10, i17, 3) : parseName(this._quad1, i10, i17, i19, 3);
        }
        int i20 = (i17 << 8) | i19;
        this._inputPtr = i11 + 4;
        int i21 = bArr[i18] & UByte.MAX_VALUE;
        return iArr[i21] != 0 ? i21 == 34 ? findName(this._quad1, i10, i20, 4) : parseName(this._quad1, i10, i20, i21, 4) : parseLongName(i21, i10, i20);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, allocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        }
    }

    public String slowParseName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(StubApp.getString2(10474), JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        int i10 = bArr[i3] & UByte.MAX_VALUE;
        return i10 == 34 ? "" : parseEscapedName(this._quadBuffer, 0, 0, i10, 0);
    }

    private final String parseName(int i3, int i10, int i11, int i12) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i3;
        return parseEscapedName(iArr, 1, i10, i11, i12);
    }

    public void _reportInvalidOther(int i3, int i10) throws JsonParseException {
        this._inputPtr = i10;
        _reportInvalidOther(i3);
    }

    public void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            char _decodeCharForError = (char) _decodeCharForError(bArr[i3]);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                break;
            }
            sb2.append(_decodeCharForError);
            if (sb2.length() >= 256) {
                sb2.append(StubApp.getString2(10450));
                break;
            }
        }
        _reportError(StubApp.getString2(10451), sb2, str2);
    }

    private final String parseName(int i3, int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i3;
        iArr[1] = i10;
        return parseEscapedName(iArr, 2, i11, i12, i13);
    }

    private final String findName(int i3, int i10, int i11) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i10, i11);
        String findName = this._symbols.findName(i3, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i3;
        iArr[1] = _padLastQuad;
        return addName(iArr, 2, i11);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public int getValueAsInt(int i3) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i3);
        }
        int i10 = this._numTypesValid;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return _parseIntValue();
            }
            if ((i10 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    private final String findName(int i3, int i10, int i11, int i12) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i11, i12);
        String findName = this._symbols.findName(i3, i10, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i3;
        iArr[1] = i10;
        iArr[2] = _padLastQuad(_padLastQuad, i12);
        return addName(iArr, 3, i12);
    }

    private final String findName(int[] iArr, int i3, int i10, int i11) throws JsonParseException {
        if (i3 >= iArr.length) {
            iArr = ParserBase.growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i12 = i3 + 1;
        iArr[i3] = _padLastQuad(i10, i11);
        String findName = this._symbols.findName(iArr, i12);
        return findName == null ? addName(iArr, i12, i11) : findName;
    }
}
