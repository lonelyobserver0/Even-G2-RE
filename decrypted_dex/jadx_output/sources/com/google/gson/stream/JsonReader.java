package com.google.gson.stream;

import com.google.gson.Strictness;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.bind.JsonTreeReader;
import com.mapbox.common.b;
import i2.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlin.text.Typography;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonReader implements Closeable {
    static final int BUFFER_SIZE = 1024;
    static final int DEFAULT_NESTING_LIMIT = 255;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final Reader in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int[] stack;
    private Strictness strictness = Strictness.LEGACY_STRICT;
    private int nestingLimit = 255;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.JsonReaderInternalAccess
            public void promoteNameToValue(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int i3 = jsonReader.peeked;
                if (i3 == 0) {
                    i3 = jsonReader.doPeek();
                }
                if (i3 == 13) {
                    jsonReader.peeked = 9;
                } else if (i3 == 12) {
                    jsonReader.peeked = 8;
                } else {
                    if (i3 != 14) {
                        throw jsonReader.unexpectedTokenError("a name");
                    }
                    jsonReader.peeked = 10;
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.in = reader;
    }

    private void checkLenient() throws MalformedJsonException {
        if (this.strictness != Strictness.LENIENT) {
            throw syntaxError("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() throws IOException {
        nextNonWhitespace(true);
        int i3 = this.pos;
        this.pos = i3 - 1;
        if (i3 + 4 <= this.limit || fillBuffer(5)) {
            int i10 = this.pos;
            char[] cArr = this.buffer;
            if (cArr[i10] == ')' && cArr[i10 + 1] == ']' && cArr[i10 + 2] == '}' && cArr[i10 + 3] == '\'' && cArr[i10 + 4] == '\n') {
                this.pos = i10 + 5;
            }
        }
    }

    private boolean fillBuffer(int i3) throws IOException {
        int i10;
        int i11;
        char[] cArr = this.buffer;
        int i12 = this.lineStart;
        int i13 = this.pos;
        this.lineStart = i12 - i13;
        int i14 = this.limit;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.limit = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.in;
            int i16 = this.limit;
            int read = reader.read(cArr, i16, cArr.length - i16);
            if (read == -1) {
                return false;
            }
            i10 = this.limit + read;
            this.limit = i10;
            if (this.lineNumber == 0 && (i11 = this.lineStart) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i11 + 1;
                i3++;
            }
        } while (i10 < i3);
        return true;
    }

    private String getPath(boolean z2) {
        StringBuilder sb2 = new StringBuilder("$");
        int i3 = 0;
        while (true) {
            int i10 = this.stackSize;
            if (i3 >= i10) {
                return sb2.toString();
            }
            int i11 = this.stack[i3];
            switch (i11) {
                case 1:
                case 2:
                    int i12 = this.pathIndices[i3];
                    if (z2 && i12 > 0 && i3 == i10 - 1) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.pathNames[i3];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(u.p(i11, "Unknown scope value: "));
            }
            i3++;
        }
    }

    private boolean isLiteral(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    private int nextNonWhitespace(boolean z2) throws IOException {
        char c10;
        char[] cArr = this.buffer;
        int i3 = this.pos;
        int i10 = this.limit;
        while (true) {
            if (i3 == i10) {
                this.pos = i3;
                if (!fillBuffer(1)) {
                    if (!z2) {
                        return -1;
                    }
                    throw new EOFException("End of input" + locationString());
                }
                i3 = this.pos;
                i10 = this.limit;
            }
            int i11 = i3 + 1;
            c10 = cArr[i3];
            if (c10 == '\n') {
                this.lineNumber++;
                this.lineStart = i11;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.pos = i11;
                    if (i11 == i10) {
                        this.pos = i3;
                        boolean fillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!fillBuffer) {
                            break;
                        }
                    }
                    checkLenient();
                    int i12 = this.pos;
                    char c11 = cArr[i12];
                    if (c11 == '*') {
                        this.pos = i12 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i3 = this.pos + 2;
                        i10 = this.limit;
                    } else {
                        if (c11 != '/') {
                            break;
                        }
                        this.pos = i12 + 1;
                        skipToEndOfLine();
                        i3 = this.pos;
                        i10 = this.limit;
                    }
                } else {
                    if (c10 != '#') {
                        this.pos = i11;
                        return c10;
                    }
                    this.pos = i11;
                    checkLenient();
                    skipToEndOfLine();
                    i3 = this.pos;
                    i10 = this.limit;
                }
            }
            i3 = i11;
        }
        return c10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.pos = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String nextQuotedValue(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.buffer
            r1 = 0
        L3:
            int r2 = r10.pos
            int r3 = r10.limit
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L6c
            int r7 = r2 + 1
            char r2 = r0[r2]
            com.google.gson.Strictness r8 = r10.strictness
            com.google.gson.Strictness r9 = com.google.gson.Strictness.STRICT
            if (r8 != r9) goto L24
            r8 = 32
            if (r2 < r8) goto L1d
            goto L24
        L1d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            com.google.gson.stream.MalformedJsonException r11 = r10.syntaxError(r11)
            throw r11
        L24:
            if (r2 != r11) goto L3a
            r10.pos = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L32
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r3, r7)
            return r11
        L32:
            r1.append(r0, r3, r7)
            java.lang.String r11 = r1.toString()
            return r11
        L3a:
            r8 = 92
            if (r2 != r8) goto L5f
            r10.pos = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L50
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L50:
            r1.append(r0, r3, r2)
            char r2 = r10.readEscapeCharacter()
            r1.append(r2)
            int r2 = r10.pos
            int r3 = r10.limit
            goto L7
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r10.lineNumber
            int r2 = r2 + r6
            r10.lineNumber = r2
            r10.lineStart = r7
        L6a:
            r2 = r7
            goto L9
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.pos = r2
            boolean r2 = r10.fillBuffer(r6)
            if (r2 == 0) goto L8b
            goto L3
        L8b:
            java.lang.String r11 = "Unterminated string"
            com.google.gson.stream.MalformedJsonException r11 = r10.syntaxError(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextQuotedValue(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        checkLenient();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String nextUnquotedValue() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.pos
            int r4 = r3 + r2
            int r5 = r6.limit
            if (r4 >= r5) goto L4e
            char[] r4 = r6.buffer
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.checkLenient()
            goto L5c
        L4e:
            char[] r3 = r6.buffer
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.fillBuffer(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.buffer
            int r4 = r6.pos
            r0.append(r3, r4, r2)
            int r3 = r6.pos
            int r3 = r3 + r2
            r6.pos = r3
            r2 = 1
            boolean r2 = r6.fillBuffer(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.buffer
            int r3 = r6.pos
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.buffer
            int r3 = r6.pos
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.pos
            int r2 = r2 + r1
            r6.pos = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextUnquotedValue():java.lang.String");
    }

    private int peekKeyword() throws IOException {
        String str;
        String str2;
        int i3;
        char c10 = this.buffer[this.pos];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i3 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i3 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i3 = 7;
        }
        boolean z2 = this.strictness != Strictness.STRICT;
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (this.pos + i10 >= this.limit && !fillBuffer(i10 + 1)) {
                return 0;
            }
            char c11 = this.buffer[this.pos + i10];
            if (c11 != str.charAt(i10) && (!z2 || c11 != str2.charAt(i10))) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i3;
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        r19.peekedLong = r11;
        r19.pos += r8;
        r19.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r19.peekedNumberLength = r8;
        r19.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0093, code lost:
    
        if (isLiteral(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c8, code lost:
    
        return r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int peekNumber() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.peekNumber():int");
    }

    private void push(int i3) throws MalformedJsonException {
        int i10 = this.stackSize;
        if (i10 - 1 >= this.nestingLimit) {
            throw new MalformedJsonException("Nesting limit " + this.nestingLimit + " reached" + locationString());
        }
        int[] iArr = this.stack;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.stack = Arrays.copyOf(iArr, i11);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i11);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i11);
        }
        int[] iArr2 = this.stack;
        int i12 = this.stackSize;
        this.stackSize = i12 + 1;
        iArr2[i12] = i3;
    }

    private char readEscapeCharacter() throws IOException {
        int i3;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i10 = this.pos;
        int i11 = i10 + 1;
        this.pos = i11;
        char c10 = cArr[i10];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
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
                            throw syntaxError("Invalid escape sequence");
                        }
                        if (i10 + 5 > this.limit && !fillBuffer(4)) {
                            throw syntaxError("Unterminated escape sequence");
                        }
                        int i12 = this.pos;
                        int i13 = i12 + 4;
                        int i14 = 0;
                        while (i12 < i13) {
                            char[] cArr2 = this.buffer;
                            char c11 = cArr2[i12];
                            int i15 = i14 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i3 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i3 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    throw syntaxError("Malformed Unicode escape \\u".concat(new String(cArr2, this.pos, 4)));
                                }
                                i3 = c11 - '7';
                            }
                            i14 = i3 + i15;
                            i12++;
                        }
                        this.pos += 4;
                        return (char) i14;
                    }
                }
            }
            return c10;
        }
        if (this.strictness == Strictness.STRICT) {
            throw syntaxError("Cannot escape a newline character in strict mode");
        }
        this.lineNumber++;
        this.lineStart = i11;
        if (this.strictness == Strictness.STRICT) {
            throw syntaxError("Invalid escaped character \"'\" in strict mode");
        }
        return c10;
    }

    private void skipQuotedValue(char c10) throws IOException {
        char[] cArr = this.buffer;
        do {
            int i3 = this.pos;
            int i10 = this.limit;
            while (i3 < i10) {
                int i11 = i3 + 1;
                char c11 = cArr[i3];
                if (c11 == c10) {
                    this.pos = i11;
                    return;
                }
                if (c11 == '\\') {
                    this.pos = i11;
                    readEscapeCharacter();
                    i3 = this.pos;
                    i10 = this.limit;
                } else {
                    if (c11 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i11;
                    }
                    i3 = i11;
                }
            }
            this.pos = i3;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i3 = this.pos;
            if (cArr[i3] != '\n') {
                for (int i10 = 0; i10 < length; i10++) {
                    if (this.buffer[this.pos + i10] != str.charAt(i10)) {
                        break;
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i3 + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() throws IOException {
        char c10;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i3 = this.pos;
            int i10 = i3 + 1;
            this.pos = i10;
            c10 = cArr[i3];
            if (c10 == '\n') {
                this.lineNumber++;
                this.lineStart = i10;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        checkLenient();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void skipUnquotedValue() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.pos
            int r2 = r1 + r0
            int r3 = r4.limit
            if (r2 >= r3) goto L51
            char[] r2 = r4.buffer
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.checkLenient()
        L4b:
            int r1 = r4.pos
            int r1 = r1 + r0
            r4.pos = r1
            return
        L51:
            int r1 = r1 + r0
            r4.pos = r1
            r0 = 1
            boolean r0 = r4.fillBuffer(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.skipUnquotedValue():void");
    }

    private MalformedJsonException syntaxError(String str) throws MalformedJsonException {
        StringBuilder b2 = AbstractC1856e.b(str);
        b2.append(locationString());
        b2.append("\nSee ");
        b2.append(TroubleshootingGuide.createUrl("malformed-json"));
        throw new MalformedJsonException(b2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException unexpectedTokenError(String str) throws IOException {
        String str2 = peek() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder l9 = b.l("Expected ", str, " but was ");
        l9.append(peek());
        l9.append(locationString());
        l9.append("\nSee ");
        l9.append(TroubleshootingGuide.createUrl(str2));
        return new IllegalStateException(l9.toString());
    }

    public void beginArray() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 != 3) {
            throw unexpectedTokenError("BEGIN_ARRAY");
        }
        push(1);
        this.pathIndices[this.stackSize - 1] = 0;
        this.peeked = 0;
    }

    public void beginObject() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 != 1) {
            throw unexpectedTokenError("BEGIN_OBJECT");
        }
        push(3);
        this.peeked = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    public int doPeek() throws IOException {
        int nextNonWhitespace;
        int[] iArr = this.stack;
        int i3 = this.stackSize;
        int i10 = iArr[i3 - 1];
        if (i10 == 1) {
            iArr[i3 - 1] = 2;
        } else if (i10 == 2) {
            int nextNonWhitespace2 = nextNonWhitespace(true);
            if (nextNonWhitespace2 != 44) {
                if (nextNonWhitespace2 != 59) {
                    if (nextNonWhitespace2 != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i10 == 3 || i10 == 5) {
                iArr[i3 - 1] = 4;
                if (i10 == 5 && (nextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (nextNonWhitespace != 59) {
                        if (nextNonWhitespace != 125) {
                            throw syntaxError("Unterminated object");
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    checkLenient();
                }
                int nextNonWhitespace3 = nextNonWhitespace(true);
                if (nextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (nextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (nextNonWhitespace3 == 125) {
                    if (i10 == 5) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 2;
                    return 2;
                }
                checkLenient();
                this.pos--;
                if (!isLiteral((char) nextNonWhitespace3)) {
                    throw syntaxError("Expected name");
                }
                this.peeked = 14;
                return 14;
            }
            if (i10 == 4) {
                iArr[i3 - 1] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i11 = this.pos;
                        if (cArr[i11] == '>') {
                            this.pos = i11 + 1;
                        }
                    }
                }
            } else if (i10 == 6) {
                if (this.strictness == Strictness.LENIENT) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i10 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i10 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (nextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
            if (nextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (nextNonWhitespace5 != 93) {
                if (nextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int peekKeyword = peekKeyword();
                if (peekKeyword != 0) {
                    return peekKeyword;
                }
                int peekNumber = peekNumber();
                if (peekNumber != 0) {
                    return peekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i10 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i10 != 1 && i10 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 != 4) {
            throw unexpectedTokenError("END_ARRAY");
        }
        int i10 = this.stackSize;
        this.stackSize = i10 - 1;
        int[] iArr = this.pathIndices;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.peeked = 0;
    }

    public void endObject() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 != 2) {
            throw unexpectedTokenError("END_OBJECT");
        }
        int i10 = this.stackSize;
        int i11 = i10 - 1;
        this.stackSize = i11;
        this.pathNames[i11] = null;
        int[] iArr = this.pathIndices;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.peeked = 0;
    }

    public final int getNestingLimit() {
        return this.nestingLimit;
    }

    public String getPreviousPath() {
        return getPath(true);
    }

    public final Strictness getStrictness() {
        return this.strictness;
    }

    public boolean hasNext() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        return (i3 == 2 || i3 == 4 || i3 == 17) ? false : true;
    }

    public final boolean isLenient() {
        return this.strictness == Strictness.LENIENT;
    }

    public String locationString() {
        StringBuilder l9 = AbstractC1482f.l(this.lineNumber + 1, " at line ", (this.pos - this.lineStart) + 1, " column ", " path ");
        l9.append(getPath());
        return l9.toString();
    }

    public boolean nextBoolean() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (i3 != 6) {
            throw unexpectedTokenError("a boolean");
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i11 = this.stackSize - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.peekedLong;
        }
        if (i3 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i3 == 8 || i3 == 9) {
            this.peekedString = nextQuotedValue(i3 == 8 ? '\'' : Typography.quote);
        } else if (i3 == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i3 != 11) {
            throw unexpectedTokenError("a double");
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        if (this.strictness != Strictness.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw syntaxError("JSON forbids NaN and infinities: " + parseDouble);
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i11 = this.stackSize - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return parseDouble;
    }

    public int nextInt() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 == 15) {
            long j = this.peekedLong;
            int i10 = (int) j;
            if (j != i10) {
                throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i11 = this.stackSize - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (i3 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i3 != 8 && i3 != 9 && i3 != 10) {
                throw unexpectedTokenError("an int");
            }
            if (i3 == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i3 == 8 ? '\'' : Typography.quote);
            }
            try {
                int parseInt = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i12 = this.stackSize - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        int i13 = (int) parseDouble;
        if (i13 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i14 = this.stackSize - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return i13;
    }

    public long nextLong() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i10 = this.stackSize - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.peekedLong;
        }
        if (i3 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i3 != 8 && i3 != 9 && i3 != 10) {
                throw unexpectedTokenError("a long");
            }
            if (i3 == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i3 == 8 ? '\'' : Typography.quote);
            }
            try {
                long parseLong = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i11 = this.stackSize - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i12 = this.stackSize - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j;
    }

    public String nextName() throws IOException {
        String nextQuotedValue;
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 == 14) {
            nextQuotedValue = nextUnquotedValue();
        } else if (i3 == 12) {
            nextQuotedValue = nextQuotedValue('\'');
        } else {
            if (i3 != 13) {
                throw unexpectedTokenError("a name");
            }
            nextQuotedValue = nextQuotedValue(Typography.quote);
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = nextQuotedValue;
        return nextQuotedValue;
    }

    public void nextNull() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 != 7) {
            throw unexpectedTokenError("null");
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i10 = this.stackSize - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public String nextString() throws IOException {
        String str;
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        if (i3 == 10) {
            str = nextUnquotedValue();
        } else if (i3 == 8) {
            str = nextQuotedValue('\'');
        } else if (i3 == 9) {
            str = nextQuotedValue(Typography.quote);
        } else if (i3 == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (i3 == 15) {
            str = Long.toString(this.peekedLong);
        } else {
            if (i3 != 16) {
                throw unexpectedTokenError("a string");
            }
            str = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i10 = this.stackSize - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public JsonToken peek() throws IOException {
        int i3 = this.peeked;
        if (i3 == 0) {
            i3 = doPeek();
        }
        switch (i3) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Deprecated
    public final void setLenient(boolean z2) {
        setStrictness(z2 ? Strictness.LENIENT : Strictness.LEGACY_STRICT);
    }

    public final void setNestingLimit(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(u.p(i3, "Invalid nesting limit: "));
        }
        this.nestingLimit = i3;
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.strictness = strictness;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws IOException {
        int i3 = 0;
        do {
            int i10 = this.peeked;
            if (i10 == 0) {
                i10 = doPeek();
            }
            switch (i10) {
                case 1:
                    push(3);
                    i3++;
                    this.peeked = 0;
                    break;
                case 2:
                    if (i3 == 0) {
                        this.pathNames[this.stackSize - 1] = null;
                    }
                    this.stackSize--;
                    i3--;
                    this.peeked = 0;
                    break;
                case 3:
                    push(1);
                    i3++;
                    this.peeked = 0;
                    break;
                case 4:
                    this.stackSize--;
                    i3--;
                    this.peeked = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.peeked = 0;
                    break;
                case 8:
                    skipQuotedValue('\'');
                    this.peeked = 0;
                    break;
                case 9:
                    skipQuotedValue(Typography.quote);
                    this.peeked = 0;
                    break;
                case 10:
                    skipUnquotedValue();
                    this.peeked = 0;
                    break;
                case 12:
                    skipQuotedValue('\'');
                    if (i3 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 13:
                    skipQuotedValue(Typography.quote);
                    if (i3 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 14:
                    skipUnquotedValue();
                    if (i3 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 16:
                    this.pos += this.peekedNumberLength;
                    this.peeked = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i3 > 0);
        int[] iArr = this.pathIndices;
        int i11 = this.stackSize - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }

    public String getPath() {
        return getPath(false);
    }
}
