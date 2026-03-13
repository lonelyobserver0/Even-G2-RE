package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ReaderBasedJsonParser extends ParserBase {
    protected boolean _bufferRecyclable;
    protected final int _hashSeed;
    protected char[] _inputBuffer;
    protected int _nameStartCol;
    protected long _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_NON_NUM_NUMBERS = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public ReaderBasedJsonParser(IOContext iOContext, int i3, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i3);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
    }

    private final void _checkMatchEnd(String str, int i3, int i10) throws IOException {
        if (Character.isJavaIdentifierPart((char) i10)) {
            _reportInvalidToken(str.substring(0, i3));
        }
    }

    private void _closeScope(int i3) throws JsonParseException {
        if (i3 == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i3, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i3 == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i3, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String _handleOddName2(int r5, int r6, int[] r7) throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.util.TextBuffer r0 = r4._textBuffer
            char[] r1 = r4._inputBuffer
            int r2 = r4._inputPtr
            int r2 = r2 - r5
            r0.resetWithShared(r1, r5, r2)
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.getCurrentSegment()
            com.fasterxml.jackson.core.util.TextBuffer r0 = r4._textBuffer
            int r0 = r0.getCurrentSegmentSize()
            int r1 = r7.length
        L17:
            int r2 = r4._inputPtr
            int r3 = r4._inputEnd
            if (r2 < r3) goto L24
            boolean r2 = r4._loadMore()
            if (r2 != 0) goto L24
            goto L37
        L24:
            char[] r2 = r4._inputBuffer
            int r3 = r4._inputPtr
            char r2 = r2[r3]
            if (r2 >= r1) goto L31
            r3 = r7[r2]
            if (r3 == 0) goto L51
            goto L37
        L31:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L51
        L37:
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r0)
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r7 = r5.getTextBuffer()
            int r0 = r5.getTextOffset()
            int r5 = r5.size()
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer r1 = r4._symbols
            java.lang.String r5 = r1.findSymbol(r7, r0, r5, r6)
            return r5
        L51:
            int r3 = r4._inputPtr
            int r3 = r3 + 1
            r4._inputPtr = r3
            int r6 = r6 * 33
            int r6 = r6 + r2
            int r3 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r3 < r0) goto L69
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.finishCurrentSegment()
            r0 = 0
            goto L17
        L69:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddName2(int, int, int[]):java.lang.String");
    }

    private final void _matchFalse() throws IOException {
        int i3;
        char c10;
        int i10 = this._inputPtr;
        if (i10 + 4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i10] == 'a' && cArr[i10 + 1] == 'l' && cArr[i10 + 2] == 's' && cArr[i10 + 3] == 'e' && ((c10 = cArr[(i3 = i10 + 4)]) < '0' || c10 == ']' || c10 == '}')) {
                this._inputPtr = i3;
                return;
            }
        }
        _matchToken(StubApp.getString2(9372), 1);
    }

    private final void _matchNull() throws IOException {
        int i3;
        char c10;
        int i10 = this._inputPtr;
        if (i10 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i10] == 'u' && cArr[i10 + 1] == 'l' && cArr[i10 + 2] == 'l' && ((c10 = cArr[(i3 = i10 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this._inputPtr = i3;
                return;
            }
        }
        _matchToken(StubApp.getString2(1116), 1);
    }

    private final void _matchToken2(String str, int i3) throws IOException {
        int i10;
        char c10;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i3)) {
                _reportInvalidToken(str.substring(0, i3));
            }
            i10 = this._inputPtr + 1;
            this._inputPtr = i10;
            i3++;
        } while (i3 < length);
        if ((i10 < this._inputEnd || _loadMore()) && (c10 = this._inputBuffer[this._inputPtr]) >= '0' && c10 != ']' && c10 != '}') {
            _checkMatchEnd(str, i3, c10);
        }
    }

    private final void _matchTrue() throws IOException {
        int i3;
        char c10;
        int i10 = this._inputPtr;
        if (i10 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i10] == 'r' && cArr[i10 + 1] == 'u' && cArr[i10 + 2] == 'e' && ((c10 = cArr[(i3 = i10 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this._inputPtr = i3;
                return;
            }
        }
        _matchToken(StubApp.getString2(6547), 1);
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
        if (i3 == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i3 == 102) {
            _matchToken(StubApp.getString2(9372), 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i3 == 110) {
            _matchToken(StubApp.getString2(1116), 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i3 == 116) {
            _matchToken(StubApp.getString2(6547), 1);
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
        switch (i3) {
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                if (!this._parsingContext.inRoot() && (this._features & FEAT_MASK_ALLOW_MISSING) != 0) {
                    this._inputPtr--;
                    JsonToken jsonToken7 = JsonToken.VALUE_NULL;
                    this._currToken = jsonToken7;
                    return jsonToken7;
                }
                break;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                JsonToken _parseSignedNumber = _parseSignedNumber(true);
                this._currToken = _parseSignedNumber;
                return _parseSignedNumber;
            case 46:
                JsonToken _parseFloatThatStartsWithPeriod = _parseFloatThatStartsWithPeriod(false);
                this._currToken = _parseFloatThatStartsWithPeriod;
                return _parseFloatThatStartsWithPeriod;
            default:
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
                }
        }
        JsonToken _handleOddValue = _handleOddValue(i3);
        this._currToken = _handleOddValue;
        return _handleOddValue;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private String _parseName2(int i3, int i10, int i11) throws IOException {
        this._textBuffer.resetWithShared(this._inputBuffer, i3, this._inputPtr - i3);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(StubApp.getString2(10419), JsonToken.FIELD_NAME);
            }
            char[] cArr = this._inputBuffer;
            int i12 = this._inputPtr;
            this._inputPtr = i12 + 1;
            char c10 = cArr[i12];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    c10 = _decodeEscaped();
                } else if (c10 <= i11) {
                    if (c10 == i11) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i10);
                    }
                    if (c10 < ' ') {
                        _throwUnquotedSpace(c10, StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
                    }
                }
            }
            i10 = (i10 * 33) + c10;
            int i13 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c10;
            if (i13 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i13;
            }
        }
    }

    private final JsonToken _parseNumber2(boolean z2, int i3) throws IOException {
        int i10;
        char nextChar;
        boolean z10;
        int i11;
        char nextChar2;
        if (z2) {
            i3++;
        }
        this._inputPtr = i3;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (z2) {
            emptyAndGetCurrentSegment[0] = '-';
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = this._inputPtr;
        if (i12 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            this._inputPtr = i12 + 1;
            nextChar = cArr[i12];
        } else {
            nextChar = getNextChar(StubApp.getString2(10420), JsonToken.VALUE_NUMBER_INT);
        }
        if (nextChar == '0') {
            nextChar = _verifyNoLeadingZeroes();
        }
        int i13 = 0;
        while (nextChar >= '0' && nextChar <= '9') {
            i13++;
            if (i10 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            int i14 = i10 + 1;
            emptyAndGetCurrentSegment[i10] = nextChar;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                nextChar = 0;
                i10 = i14;
                z10 = true;
                break;
            }
            char[] cArr2 = this._inputBuffer;
            int i15 = this._inputPtr;
            this._inputPtr = i15 + 1;
            nextChar = cArr2[i15];
            i10 = i14;
        }
        z10 = false;
        if (i13 == 0 && !isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleInvalidNumberStart(nextChar, z2);
        }
        int i16 = -1;
        if (nextChar == '.') {
            if (i10 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            emptyAndGetCurrentSegment[i10] = nextChar;
            i10++;
            i11 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z10 = true;
                    break;
                }
                char[] cArr3 = this._inputBuffer;
                int i17 = this._inputPtr;
                this._inputPtr = i17 + 1;
                nextChar = cArr3[i17];
                if (nextChar < '0' || nextChar > '9') {
                    break;
                }
                i11++;
                if (i10 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i10 = 0;
                }
                emptyAndGetCurrentSegment[i10] = nextChar;
                i10++;
            }
            if (i11 == 0 && !isEnabled(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                _reportUnexpectedNumberChar(nextChar, StubApp.getString2(10417));
            }
        } else {
            i11 = -1;
        }
        if (nextChar == 'e' || nextChar == 'E') {
            if (i10 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            int i18 = i10 + 1;
            emptyAndGetCurrentSegment[i10] = nextChar;
            int i19 = this._inputPtr;
            int i20 = this._inputEnd;
            String string2 = StubApp.getString2(10421);
            if (i19 < i20) {
                char[] cArr4 = this._inputBuffer;
                this._inputPtr = i19 + 1;
                nextChar2 = cArr4[i19];
            } else {
                nextChar2 = getNextChar(string2, JsonToken.VALUE_NUMBER_FLOAT);
            }
            if (nextChar2 == '-' || nextChar2 == '+') {
                if (i18 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i18 = 0;
                }
                int i21 = i18 + 1;
                emptyAndGetCurrentSegment[i18] = nextChar2;
                int i22 = this._inputPtr;
                if (i22 < this._inputEnd) {
                    char[] cArr5 = this._inputBuffer;
                    this._inputPtr = i22 + 1;
                    nextChar2 = cArr5[i22];
                } else {
                    nextChar2 = getNextChar(string2, JsonToken.VALUE_NUMBER_FLOAT);
                }
                i18 = i21;
            }
            int i23 = 0;
            nextChar = nextChar2;
            while (nextChar <= '9' && nextChar >= '0') {
                i23++;
                if (i18 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i18 = 0;
                }
                i10 = i18 + 1;
                emptyAndGetCurrentSegment[i18] = nextChar;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z10 = true;
                    break;
                }
                char[] cArr6 = this._inputBuffer;
                int i24 = this._inputPtr;
                this._inputPtr = i24 + 1;
                nextChar = cArr6[i24];
                i18 = i10;
            }
            i10 = i18;
            i16 = i23;
            if (i16 == 0) {
                _reportUnexpectedNumberChar(nextChar, StubApp.getString2(10418));
            }
        }
        if (!z10) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(nextChar);
            }
        }
        this._textBuffer.setCurrentLength(i10);
        return (i11 >= 0 || i16 >= 0) ? resetFloat(z2, i13, i11, i16) : resetInt(z2, i13);
    }

    private final JsonToken _parseSignedNumber(boolean z2) throws IOException {
        int i3 = this._inputPtr;
        int i10 = z2 ? i3 - 1 : i3;
        int i11 = this._inputEnd;
        if (i3 >= i11) {
            return _parseNumber2(z2, i10);
        }
        int i12 = i3 + 1;
        char c10 = this._inputBuffer[i3];
        char c11 = '9';
        int i13 = 1;
        if (c10 > '9' || c10 < '0') {
            this._inputPtr = i12;
            return c10 == '.' ? _parseFloatThatStartsWithPeriod(z2) : _handleInvalidNumberStart(c10, z2, true);
        }
        if (c10 == '0') {
            return _parseNumber2(z2, i10);
        }
        while (i12 < i11) {
            char c12 = c11;
            int i14 = i12 + 1;
            char c13 = this._inputBuffer[i12];
            if (c13 < '0' || c13 > c12) {
                if (c13 == '.' || c13 == 'e' || c13 == 'E') {
                    this._inputPtr = i14;
                    return _parseFloat(c13, i10, i14, z2, i13);
                }
                this._inputPtr = i12;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c13);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i10, i12 - i10);
                return resetInt(z2, i13);
            }
            i13++;
            i12 = i14;
            c11 = c12;
        }
        return _parseNumber2(z2, i10);
    }

    private final int _skipAfterComma2() throws IOException {
        char c10;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError(StubApp.getString2(10422) + this._parsingContext.typeDesc() + StubApp.getString2(10423));
            }
            char[] cArr = this._inputBuffer;
            int i3 = this._inputPtr;
            int i10 = i3 + 1;
            this._inputPtr = i10;
            c10 = cArr[i3];
            if (c10 > ' ') {
                if (c10 == '/') {
                    _skipComment();
                } else if (c10 != '#' || !_skipYAMLComment()) {
                    break;
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i10;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
        return c10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        _reportInvalidEOF(com.stub.StubApp.getString2(10424), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _skipCComment() throws java.io.IOException {
        /*
            r3 = this;
        L0:
            int r0 = r3._inputPtr
            int r1 = r3._inputEnd
            if (r0 < r1) goto Lc
            boolean r0 = r3._loadMore()
            if (r0 == 0) goto L26
        Lc:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            int r2 = r1 + 1
            r3._inputPtr = r2
            char r0 = r0[r1]
            r1 = 42
            if (r0 > r1) goto L0
            if (r0 != r1) goto L41
            int r0 = r3._inputEnd
            if (r2 < r0) goto L32
            boolean r0 = r3._loadMore()
            if (r0 != 0) goto L32
        L26:
            r0 = 10424(0x28b8, float:1.4607E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 0
            r3._reportInvalidEOF(r0, r1)
            return
        L32:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            char r0 = r0[r1]
            r2 = 47
            if (r0 != r2) goto L0
            int r1 = r1 + 1
            r3._inputPtr = r1
            return
        L41:
            r1 = 32
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L52
            int r0 = r3._currInputRow
            int r0 = r0 + 1
            r3._currInputRow = r0
            r3._currInputRowStart = r2
            goto L0
        L52:
            r1 = 13
            if (r0 != r1) goto L5a
            r3._skipCR()
            goto L0
        L5a:
            r1 = 9
            if (r0 == r1) goto L0
            r3._throwInvalidSpace(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCComment():void");
    }

    private final int _skipColon() throws IOException {
        int i3 = this._inputPtr;
        if (i3 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        char[] cArr = this._inputBuffer;
        char c10 = cArr[i3];
        if (c10 == ':') {
            int i10 = i3 + 1;
            this._inputPtr = i10;
            char c11 = cArr[i10];
            if (c11 > ' ') {
                if (c11 == '/' || c11 == '#') {
                    return _skipColon2(true);
                }
                this._inputPtr = i3 + 2;
                return c11;
            }
            if (c11 == ' ' || c11 == '\t') {
                int i11 = i3 + 2;
                this._inputPtr = i11;
                char c12 = cArr[i11];
                if (c12 > ' ') {
                    if (c12 == '/' || c12 == '#') {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i3 + 3;
                    return c12;
                }
            }
            return _skipColon2(true);
        }
        if (c10 == ' ' || c10 == '\t') {
            int i12 = i3 + 1;
            this._inputPtr = i12;
            c10 = cArr[i12];
        }
        if (c10 != ':') {
            return _skipColon2(false);
        }
        int i13 = this._inputPtr;
        int i14 = i13 + 1;
        this._inputPtr = i14;
        char c13 = cArr[i14];
        if (c13 > ' ') {
            if (c13 == '/' || c13 == '#') {
                return _skipColon2(true);
            }
            this._inputPtr = i13 + 2;
            return c13;
        }
        if (c13 == ' ' || c13 == '\t') {
            int i15 = i13 + 2;
            this._inputPtr = i15;
            char c14 = cArr[i15];
            if (c14 > ' ') {
                if (c14 == '/' || c14 == '#') {
                    return _skipColon2(true);
                }
                this._inputPtr = i13 + 3;
                return c14;
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
            char[] cArr = this._inputBuffer;
            int i3 = this._inputPtr;
            int i10 = i3 + 1;
            this._inputPtr = i10;
            char c10 = cArr[i3];
            if (c10 > ' ') {
                if (c10 == '/') {
                    _skipComment();
                } else if (c10 != '#' || !_skipYAMLComment()) {
                    if (z2) {
                        return c10;
                    }
                    if (c10 != ':') {
                        _reportUnexpectedChar(c10, StubApp.getString2(10426));
                    }
                    z2 = true;
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i10;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
    }

    private final int _skipComma(int i3) throws IOException {
        if (i3 != 44) {
            _reportUnexpectedChar(i3, StubApp.getString2(10427) + this._parsingContext.typeDesc() + StubApp.getString2(10423));
        }
        while (true) {
            int i10 = this._inputPtr;
            if (i10 >= this._inputEnd) {
                return _skipAfterComma2();
            }
            char[] cArr = this._inputBuffer;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 != '/' && c10 != '#') {
                    return c10;
                }
                this._inputPtr = i10;
                return _skipAfterComma2();
            }
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
    }

    private void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, StubApp.getString2(10428));
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(StubApp.getString2(10424), null);
        }
        char[] cArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        char c10 = cArr[i3];
        if (c10 == '/') {
            _skipLine();
        } else if (c10 == '*') {
            _skipCComment();
        } else {
            _reportUnexpectedChar(c10, StubApp.getString2(10429));
        }
    }

    private void _skipLine() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            char[] cArr = this._inputBuffer;
            int i3 = this._inputPtr;
            int i10 = i3 + 1;
            this._inputPtr = i10;
            char c10 = cArr[i3];
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i10;
                    return;
                } else if (c10 == '\r') {
                    _skipCR();
                    return;
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        char[] cArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i10 = i3 + 1;
        this._inputPtr = i10;
        char c10 = cArr[i3];
        if (c10 > ' ') {
            if (c10 != '/' && c10 != '#') {
                return c10;
            }
            this._inputPtr = i3;
            return _skipWSOrEnd2();
        }
        if (c10 != ' ') {
            if (c10 == '\n') {
                this._currInputRow++;
                this._currInputRowStart = i10;
            } else if (c10 == '\r') {
                _skipCR();
            } else if (c10 != '\t') {
                _throwInvalidSpace(c10);
            }
        }
        while (true) {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                return _skipWSOrEnd2();
            }
            char[] cArr2 = this._inputBuffer;
            int i12 = i11 + 1;
            this._inputPtr = i12;
            char c11 = cArr2[i11];
            if (c11 > ' ') {
                if (c11 != '/' && c11 != '#') {
                    return c11;
                }
                this._inputPtr = i11;
                return _skipWSOrEnd2();
            }
            if (c11 != ' ') {
                if (c11 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i12;
                } else if (c11 == '\r') {
                    _skipCR();
                } else if (c11 != '\t') {
                    _throwInvalidSpace(c11);
                }
            }
        }
    }

    private int _skipWSOrEnd2() throws IOException {
        char c10;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i3 = this._inputPtr;
            int i10 = i3 + 1;
            this._inputPtr = i10;
            c10 = cArr[i3];
            if (c10 > ' ') {
                if (c10 == '/') {
                    _skipComment();
                } else if (c10 != '#' || !_skipYAMLComment()) {
                    break;
                }
            } else if (c10 != ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i10;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
        return c10;
    }

    private boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        int i3 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i3;
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i3 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        int i3 = this._inputPtr;
        this._nameStartOffset = i3;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i3 - this._currInputRowStart;
    }

    private char _verifyNLZ2() throws IOException {
        char c10;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (c10 = this._inputBuffer[this._inputPtr]) < '0' || c10 > '9') {
            return '0';
        }
        if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber(StubApp.getString2(10430));
        }
        this._inputPtr++;
        if (c10 != '0') {
            return c10;
        }
        do {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return c10;
            }
            char[] cArr = this._inputBuffer;
            int i3 = this._inputPtr;
            c10 = cArr[i3];
            if (c10 < '0' || c10 > '9') {
                return '0';
            }
            this._inputPtr = i3 + 1;
        } while (c10 == '0');
        return c10;
    }

    private final char _verifyNoLeadingZeroes() throws IOException {
        char c10;
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd || ((c10 = this._inputBuffer[i3]) >= '0' && c10 <= '9')) {
            return _verifyNLZ2();
        }
        return '0';
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

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    public byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            char c10 = cArr[i3];
            if (c10 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c10);
                if (decodeBase64Char < 0) {
                    if (c10 == '\"') {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c10, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                char c11 = cArr2[i10];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c11);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c11, 1);
                }
                int i11 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                char c12 = cArr3[i12];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c12);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c12 == '\"') {
                            _getByteArrayBuilder.append(i11 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, c12, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i13 = this._inputPtr;
                        this._inputPtr = i13 + 1;
                        char c13 = cArr4[i13];
                        if (!base64Variant.usesPaddingChar(c13) && _decodeBase64Escape(base64Variant, c13, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c13, 3, StubApp.getString2(10431) + base64Variant.getPaddingChar() + StubApp.getString2(620));
                        }
                        _getByteArrayBuilder.append(i11 >> 4);
                    }
                }
                int i14 = (i11 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                char c14 = cArr5[i15];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c14);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c14 == '\"') {
                            _getByteArrayBuilder.appendTwoBytes(i14 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c14, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i14 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i14 << 6) | decodeBase64Char4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        int i3 = this._inputPtr;
        int i10 = this._inputEnd;
        String string2 = StubApp.getString2(10432);
        if (i3 >= i10 && !_loadMore()) {
            _reportInvalidEOF(string2, JsonToken.VALUE_STRING);
        }
        char[] cArr = this._inputBuffer;
        int i11 = this._inputPtr;
        this._inputPtr = i11 + 1;
        char c10 = cArr[i11];
        if (c10 == '\"' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            return _handleUnrecognizedCharacterEscape(c10);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(string2, JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this._inputBuffer;
            int i14 = this._inputPtr;
            this._inputPtr = i14 + 1;
            char c11 = cArr2[i14];
            int charToHex = CharTypes.charToHex(c11);
            if (charToHex < 0) {
                _reportUnexpectedChar(c11, StubApp.getString2(10433));
            }
            i12 = (i12 << 4) | charToHex;
        }
        return (char) i12;
    }

    public final void _finishString() throws IOException {
        int i3 = this._inputPtr;
        int i10 = this._inputEnd;
        if (i3 < i10) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i3];
                if (c10 >= length || iArr[c10] == 0) {
                    i3++;
                    if (i3 >= i10) {
                        break;
                    }
                } else if (c10 == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    int i11 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i11, i3 - i11);
                    this._inputPtr = i3 + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i12 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i12, i3 - i12);
        this._inputPtr = i3;
        _finishString2();
    }

    public void _finishString2() throws IOException {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(StubApp.getString2(10434), JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            char c10 = cArr[i3];
            if (c10 < length && iArr[c10] != 0) {
                if (c10 == '\"') {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    return;
                } else if (c10 == '\\') {
                    c10 = _decodeEscaped();
                } else if (c10 < ' ') {
                    _throwUnquotedSpace(c10, StubApp.getString2(10435));
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            currentSegment[currentSegmentSize] = c10;
            currentSegmentSize++;
        }
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
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(StubApp.getString2(10434), JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            char c10 = cArr[i3];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    c10 = _decodeEscaped();
                } else if (c10 <= '\'') {
                    if (c10 == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    }
                    if (c10 < ' ') {
                        _throwUnquotedSpace(c10, StubApp.getString2(10435));
                    }
                }
            }
            if (currentSegmentSize >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            emptyAndGetCurrentSegment[currentSegmentSize] = c10;
            currentSegmentSize++;
        }
    }

    public JsonToken _handleInvalidNumberStart(int i3, boolean z2) throws IOException {
        return _handleInvalidNumberStart(i3, z2, false);
    }

    public String _handleOddName(int i3) throws IOException {
        if (i3 == 39 && (this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _parseAposName();
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar(i3, StubApp.getString2(10444));
        }
        int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
        int length = inputCodeLatin1JsNames.length;
        if (!(i3 < length ? inputCodeLatin1JsNames[i3] == 0 : Character.isJavaIdentifierPart((char) i3))) {
            _reportUnexpectedChar(i3, StubApp.getString2(10445));
        }
        int i10 = this._inputPtr;
        int i11 = this._hashSeed;
        int i12 = this._inputEnd;
        if (i10 < i12) {
            do {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i10];
                if (c10 < length) {
                    if (inputCodeLatin1JsNames[c10] != 0) {
                        int i13 = this._inputPtr - 1;
                        this._inputPtr = i10;
                        return this._symbols.findSymbol(cArr, i13, i10 - i13, i11);
                    }
                } else if (!Character.isJavaIdentifierPart(c10)) {
                    int i14 = this._inputPtr - 1;
                    this._inputPtr = i10;
                    return this._symbols.findSymbol(this._inputBuffer, i14, i10 - i14, i11);
                }
                i11 = (i11 * 33) + c10;
                i10++;
            } while (i10 < i12);
        }
        int i15 = this._inputPtr - 1;
        this._inputPtr = i10;
        return _handleOddName2(i15, i11, inputCodeLatin1JsNames);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r4 != 44) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r3._parsingContext.inRoot() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if ((r3._features & com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.core.JsonToken _handleOddValue(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto La2
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L7f
            r0 = 78
            if (r4 == r0) goto L5c
            r0 = 93
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1b
            r0 = 44
            if (r4 == r0) goto L45
            goto Lae
        L1b:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L2c
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L2c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L2c:
            char[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r2 = r0 + 1
            r3._inputPtr = r2
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0, r1)
            return r4
        L3c:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L45
            goto Lae
        L45:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inRoot()
            if (r0 != 0) goto Lae
            int r0 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_MISSING
            r0 = r0 & r2
            if (r0 == 0) goto Lae
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L5c:
            r0 = 10402(0x28a2, float:1.4576E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L74
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L74:
            r0 = 10446(0x28ce, float:1.4638E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r3._reportError(r0)
            goto Lae
        L7f:
            r0 = 10404(0x28a4, float:1.4579E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L97
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L97:
            r0 = 10447(0x28cf, float:1.464E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r3._reportError(r0)
            goto Lae
        La2:
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r0 = r0 & r1
            if (r0 == 0) goto Lae
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        Lae:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3._validJsonTokenList()
            r3._reportInvalidToken(r0, r1)
        Lca:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 10448(0x28d0, float:1.4641E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            java.lang.String r1 = r3._validJsonValueList()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    public boolean _loadMore() throws IOException {
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                int i3 = this._inputEnd;
                long j = i3;
                this._currInputProcessed += j;
                this._currInputRowStart -= i3;
                this._nameStartOffset -= j;
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                throw new IOException(StubApp.getString2(10449) + this._inputEnd);
            }
        }
        return false;
    }

    public void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
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
        char c10 = this._inputBuffer[i10];
        if (c10 < '0' || c10 == ']' || c10 == '}') {
            return;
        }
        _checkMatchEnd(str, i3, c10);
    }

    public String _parseAposName() throws IOException {
        int i3 = this._inputPtr;
        int i10 = this._hashSeed;
        int i11 = this._inputEnd;
        if (i3 < i11) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i3];
                if (c10 != '\'') {
                    if (c10 < length && iArr[c10] != 0) {
                        break;
                    }
                    i10 = (i10 * 33) + c10;
                    i3++;
                } else {
                    int i12 = this._inputPtr;
                    this._inputPtr = i3 + 1;
                    return this._symbols.findSymbol(cArr, i12, i3 - i12, i10);
                }
            } while (i3 < i11);
        }
        int i13 = this._inputPtr;
        this._inputPtr = i3;
        return _parseName2(i13, i10, 39);
    }

    public final JsonToken _parseFloatThatStartsWithPeriod(boolean z2) throws IOException {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleOddValue(46);
        }
        int i3 = this._inputPtr;
        int i10 = i3 - 1;
        if (z2) {
            i10 = i3 - 2;
        }
        return _parseFloat(46, i10, i3, z2, 0);
    }

    public final String _parseName() throws IOException {
        int i3 = this._inputPtr;
        int i10 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (true) {
            if (i3 >= this._inputEnd) {
                break;
            }
            char[] cArr = this._inputBuffer;
            char c10 = cArr[i3];
            if (c10 >= iArr.length || iArr[c10] == 0) {
                i10 = (i10 * 33) + c10;
                i3++;
            } else if (c10 == '\"') {
                int i11 = this._inputPtr;
                this._inputPtr = i3 + 1;
                return this._symbols.findSymbol(cArr, i11, i3 - i11, i10);
            }
        }
        int i12 = this._inputPtr;
        this._inputPtr = i3;
        return _parseName2(i12, i10, 34);
    }

    public final JsonToken _parseUnsignedNumber(int i3) throws IOException {
        int i10 = this._inputPtr;
        int i11 = i10 - 1;
        int i12 = this._inputEnd;
        char c10 = '0';
        if (i3 == 48) {
            return _parseNumber2(false, i11);
        }
        int i13 = 1;
        while (i10 < i12) {
            char c11 = c10;
            int i14 = i10 + 1;
            char c12 = this._inputBuffer[i10];
            if (c12 < c11 || c12 > '9') {
                if (c12 == '.' || c12 == 'e' || c12 == 'E') {
                    this._inputPtr = i14;
                    return _parseFloat(c12, i11, i14, false, i13);
                }
                this._inputPtr = i10;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c12);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i11, i10 - i11);
                return resetInt(false, i13);
            }
            i13++;
            i10 = i14;
            c10 = c11;
        }
        this._inputPtr = i11;
        return _parseNumber2(false, i11);
    }

    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length - 3;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i11 = this._inputPtr;
            this._inputPtr = i11 + 1;
            char c10 = cArr[i11];
            if (c10 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c10);
                if (decodeBase64Char < 0) {
                    if (c10 == '\"') {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c10, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i3 > length) {
                    i10 += i3;
                    outputStream.write(bArr, 0, i3);
                    i3 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                char c11 = cArr2[i12];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c11);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c11, 1);
                }
                int i13 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                char c12 = cArr3[i14];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c12);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c12 == '\"') {
                            int i15 = i3 + 1;
                            bArr[i3] = (byte) (i13 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i3 = i15;
                        } else {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, c12, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i16 = this._inputPtr;
                        this._inputPtr = i16 + 1;
                        char c13 = cArr4[i16];
                        if (!base64Variant.usesPaddingChar(c13) && _decodeBase64Escape(base64Variant, c13, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c13, 3, StubApp.getString2(10431) + base64Variant.getPaddingChar() + StubApp.getString2(620));
                        }
                        bArr[i3] = (byte) (i13 >> 4);
                        i3++;
                    }
                }
                int i17 = (i13 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i18 = this._inputPtr;
                this._inputPtr = i18 + 1;
                char c14 = cArr5[i18];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c14);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c14 == '\"') {
                            int i19 = i3 + 1;
                            bArr[i3] = (byte) (i17 >> 10);
                            i3 += 2;
                            bArr[i19] = (byte) (i17 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, c14, 3);
                        }
                    }
                    if (decodeBase64Char4 == -2) {
                        int i20 = i3 + 1;
                        bArr[i3] = (byte) (i17 >> 10);
                        i3 += 2;
                        bArr[i20] = (byte) (i17 >> 2);
                    }
                }
                int i21 = (i17 << 6) | decodeBase64Char4;
                bArr[i3] = (byte) (i21 >> 16);
                int i22 = i3 + 2;
                bArr[i3 + 1] = (byte) (i21 >> 8);
                i3 += 3;
                bArr[i22] = (byte) i21;
            }
        }
        this._tokenIncomplete = false;
        if (i3 <= 0) {
            return i10;
        }
        int i23 = i10 + i3;
        outputStream.write(bArr, 0, i3);
        return i23;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        char[] cArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (cArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = null;
        this._ioContext.releaseTokenBuffer(cArr);
    }

    public void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i3 = this._inputPtr;
            if (cArr[i3] == '\n') {
                this._inputPtr = i3 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    public final void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int i3 = this._inputPtr;
        int i10 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i3 >= i10) {
                this._inputPtr = i3;
                if (!_loadMore()) {
                    _reportInvalidEOF(StubApp.getString2(10434), JsonToken.VALUE_STRING);
                }
                i3 = this._inputPtr;
                i10 = this._inputEnd;
            }
            int i11 = i3 + 1;
            char c10 = cArr[i3];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    this._inputPtr = i11;
                    _decodeEscaped();
                    i3 = this._inputPtr;
                    i10 = this._inputEnd;
                } else if (c10 <= '\"') {
                    if (c10 == '\"') {
                        this._inputPtr = i11;
                        return;
                    } else if (c10 < ' ') {
                        this._inputPtr = i11;
                        _throwUnquotedSpace(c10, StubApp.getString2(10435));
                    }
                }
            }
            i3 = i11;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        byte[] bArr;
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this._binaryValue) != null) {
            return bArr;
        }
        if (jsonToken != JsonToken.VALUE_STRING) {
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
        return new JsonLocation(_contentReference(), -1L, this._inputPtr + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    public char getNextChar(String str, JsonToken jsonToken) throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        return cArr[i3];
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return ParserBase.JSON_READ_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] getTextCharacters() throws IOException {
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
    public final int getTextLength() throws IOException {
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
    public final int getTextOffset() throws java.io.IOException {
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_contentReference(), -1L, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_contentReference(), -1L, (this._nameStartOffset - 1) + this._currInputProcessed, this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
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
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
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
        String _parseName = _skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd);
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
            _parseSignedNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parseSignedNumber(false) : _handleOddValue(_skipColon);
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
                    _parseSignedNumber = _handleOddValue(_skipColon);
                    break;
            }
        } else {
            _parseSignedNumber = _parseFloatThatStartsWithPeriod(false);
        }
        this._nextToken = _parseSignedNumber;
        return _parseName;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String nextTextValue() throws IOException {
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
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonToken nextToken() throws IOException {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this._currToken;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
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
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return this._currToken;
            }
        }
        boolean inObject = this._parsingContext.inObject();
        if (inObject) {
            _updateNameLocation();
            this._parsingContext.setCurrentName(_skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd));
            this._currToken = jsonToken3;
            _skipWSOrEnd = _skipColon();
        }
        _updateLocation();
        if (_skipWSOrEnd == 34) {
            this._tokenIncomplete = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (_skipWSOrEnd == 43) {
            jsonToken = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parseSignedNumber(false) : _handleOddValue(_skipWSOrEnd);
        } else if (_skipWSOrEnd == 91) {
            if (!inObject) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken = JsonToken.START_ARRAY;
        } else if (_skipWSOrEnd == 102) {
            _matchFalse();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipWSOrEnd != 110) {
            if (_skipWSOrEnd != 116) {
                if (_skipWSOrEnd == 123) {
                    if (!inObject) {
                        this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                    }
                    jsonToken = JsonToken.START_OBJECT;
                } else if (_skipWSOrEnd == 125) {
                    _reportUnexpectedChar(_skipWSOrEnd, StubApp.getString2(10454));
                } else if (_skipWSOrEnd == 45) {
                    jsonToken = _parseSignedNumber(true);
                } else if (_skipWSOrEnd != 46) {
                    switch (_skipWSOrEnd) {
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
                            jsonToken = _parseUnsignedNumber(_skipWSOrEnd);
                            break;
                        default:
                            jsonToken = _handleOddValue(_skipWSOrEnd);
                            break;
                    }
                } else {
                    jsonToken = _parseFloatThatStartsWithPeriod(false);
                }
            }
            _matchTrue();
            jsonToken = JsonToken.VALUE_TRUE;
        } else {
            _matchNull();
            jsonToken = JsonToken.VALUE_NULL;
        }
        if (inObject) {
            this._nextToken = jsonToken;
            return this._currToken;
        }
        this._currToken = jsonToken;
        return jsonToken;
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

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c10 = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c10)) {
                break;
            }
            this._inputPtr++;
            sb2.append(c10);
            if (sb2.length() >= 256) {
                sb2.append(StubApp.getString2(10450));
                break;
            }
        }
        _reportError(StubApp.getString2(10451), sb2, str2);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public final String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }
}
