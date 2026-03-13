package com.fasterxml.jackson.core;

import E1.a;
import Xa.h;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.text.Typography;
import org.bouncycastle.math.ec.Tnaf;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Base64Variant implements Serializable {
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    private final int _maxLineLength;
    final String _name;
    private final char _paddingChar;
    private final PaddingReadBehaviour _paddingReadBehaviour;
    private final boolean _writePadding;

    public enum PaddingReadBehaviour {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public Base64Variant(String str, String str2, boolean z2, char c10, int i3) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._writePadding = z2;
        this._paddingChar = c10;
        this._maxLineLength = i3;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException(h.g(length, "Base64Alphabet length must be exactly 64 (was ", ")"));
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i10 = 0; i10 < length; i10++) {
            char c11 = this._base64ToAsciiC[i10];
            this._base64ToAsciiB[i10] = (byte) c11;
            this._asciiToBase64[c11] = i10;
        }
        if (z2) {
            this._asciiToBase64[c10] = -2;
        }
        this._paddingReadBehaviour = z2 ? PaddingReadBehaviour.PADDING_REQUIRED : PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public void _reportBase64EOF() throws IllegalArgumentException {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    public void _reportBase64UnexpectedPadding() throws IllegalArgumentException {
        throw new IllegalArgumentException(unexpectedPaddingMessage());
    }

    public void _reportInvalidBase64(char c10, int i3, String str) throws IllegalArgumentException {
        String str2;
        if (c10 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c10) + ") as character #" + (i3 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c10)) {
            str2 = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i3 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c10) || Character.isISOControl(c10)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c10 + "' (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        }
        if (str != null) {
            str2 = AbstractC1482f.h(str2, ": ", str);
        }
        throw new IllegalArgumentException(str2);
    }

    public boolean acceptsPaddingOnRead() {
        return this._paddingReadBehaviour != PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public byte[] decode(String str) throws IllegalArgumentException {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder();
        decode(str, byteArrayBuilder);
        return byteArrayBuilder.toByteArray();
    }

    public int decodeBase64Char(char c10) {
        if (c10 <= 127) {
            return this._asciiToBase64[c10];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public int encodeBase64Chunk(int i3, char[] cArr, int i10) {
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i10] = cArr2[(i3 >> 18) & 63];
        cArr[i10 + 1] = cArr2[(i3 >> 12) & 63];
        int i11 = i10 + 3;
        cArr[i10 + 2] = cArr2[(i3 >> 6) & 63];
        int i12 = i10 + 4;
        cArr[i11] = cArr2[i3 & 63];
        return i12;
    }

    public int encodeBase64Partial(int i3, int i10, char[] cArr, int i11) {
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i11] = cArr2[(i3 >> 18) & 63];
        int i12 = i11 + 2;
        cArr[i11 + 1] = cArr2[(i3 >> 12) & 63];
        if (usesPadding()) {
            int i13 = i11 + 3;
            cArr[i12] = i10 == 2 ? this._base64ToAsciiC[(i3 >> 6) & 63] : this._paddingChar;
            int i14 = i11 + 4;
            cArr[i13] = this._paddingChar;
            return i14;
        }
        if (i10 != 2) {
            return i12;
        }
        int i15 = i11 + 3;
        cArr[i12] = this._base64ToAsciiC[(i3 >> 6) & 63];
        return i15;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == Base64Variant.class) {
            Base64Variant base64Variant = (Base64Variant) obj;
            if (base64Variant._paddingChar == this._paddingChar && base64Variant._maxLineLength == this._maxLineLength && base64Variant._writePadding == this._writePadding && base64Variant._paddingReadBehaviour == this._paddingReadBehaviour && this._name.equals(base64Variant._name)) {
                return true;
            }
        }
        return false;
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public String getName() {
        return this._name;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", getName(), Character.valueOf(getPaddingChar()));
    }

    public boolean requiresPaddingOnRead() {
        return this._paddingReadBehaviour == PaddingReadBehaviour.PADDING_REQUIRED;
    }

    public String toString() {
        return this._name;
    }

    public String unexpectedPaddingMessage() {
        return a.k("Unexpected end of base64-encoded String: base64 variant '", getName(), "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured");
    }

    public boolean usesPadding() {
        return this._writePadding;
    }

    public boolean usesPaddingChar(char c10) {
        return c10 == this._paddingChar;
    }

    public int decodeBase64Char(int i3) {
        if (i3 <= 127) {
            return this._asciiToBase64[i3];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z2) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z2) {
            sb2.append(Typography.quote);
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i3 = length - 3;
        int i10 = 0;
        while (i10 <= i3) {
            int i11 = i10 + 2;
            int i12 = ((bArr[i10 + 1] & UByte.MAX_VALUE) | (bArr[i10] << 8)) << 8;
            i10 += 3;
            encodeBase64Chunk(sb2, i12 | (bArr[i11] & UByte.MAX_VALUE));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb2.append('\\');
                sb2.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
        }
        int i13 = length - i10;
        if (i13 > 0) {
            int i14 = i10 + 1;
            int i15 = bArr[i10] << Tnaf.POW_2_WIDTH;
            if (i13 == 2) {
                i15 |= (bArr[i14] & UByte.MAX_VALUE) << 8;
            }
            encodeBase64Partial(sb2, i15, i13);
        }
        if (z2) {
            sb2.append(Typography.quote);
        }
        return sb2.toString();
    }

    public boolean usesPaddingChar(int i3) {
        return i3 == this._paddingChar;
    }

    public void decode(String str, ByteArrayBuilder byteArrayBuilder) throws IllegalArgumentException {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i10 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt > ' ') {
                int decodeBase64Char = decodeBase64Char(charAt);
                if (decodeBase64Char < 0) {
                    _reportInvalidBase64(charAt, 0, null);
                }
                if (i10 >= length) {
                    _reportBase64EOF();
                }
                int i11 = i3 + 2;
                char charAt2 = str.charAt(i10);
                int decodeBase64Char2 = decodeBase64Char(charAt2);
                if (decodeBase64Char2 < 0) {
                    _reportInvalidBase64(charAt2, 1, null);
                }
                int i12 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (i11 >= length) {
                    if (!requiresPaddingOnRead()) {
                        byteArrayBuilder.append(i12 >> 4);
                        return;
                    }
                    _reportBase64EOF();
                }
                int i13 = i3 + 3;
                char charAt3 = str.charAt(i11);
                int decodeBase64Char3 = decodeBase64Char(charAt3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        _reportInvalidBase64(charAt3, 2, null);
                    }
                    if (!acceptsPaddingOnRead()) {
                        _reportBase64UnexpectedPadding();
                    }
                    if (i13 >= length) {
                        _reportBase64EOF();
                    }
                    i3 += 4;
                    char charAt4 = str.charAt(i13);
                    if (!usesPaddingChar(charAt4)) {
                        _reportInvalidBase64(charAt4, 3, "expected padding character '" + getPaddingChar() + "'");
                    }
                    byteArrayBuilder.append(i12 >> 4);
                } else {
                    int i14 = (i12 << 6) | decodeBase64Char3;
                    if (i13 >= length) {
                        if (!requiresPaddingOnRead()) {
                            byteArrayBuilder.appendTwoBytes(i14 >> 2);
                            return;
                        }
                        _reportBase64EOF();
                    }
                    i3 += 4;
                    char charAt5 = str.charAt(i13);
                    int decodeBase64Char4 = decodeBase64Char(charAt5);
                    if (decodeBase64Char4 < 0) {
                        if (decodeBase64Char4 != -2) {
                            _reportInvalidBase64(charAt5, 3, null);
                        }
                        if (!acceptsPaddingOnRead()) {
                            _reportBase64UnexpectedPadding();
                        }
                        byteArrayBuilder.appendTwoBytes(i14 >> 2);
                    } else {
                        byteArrayBuilder.appendThreeBytes((i14 << 6) | decodeBase64Char4);
                    }
                }
            } else {
                i3 = i10;
            }
        }
    }

    public void encodeBase64Chunk(StringBuilder sb2, int i3) {
        sb2.append(this._base64ToAsciiC[(i3 >> 18) & 63]);
        sb2.append(this._base64ToAsciiC[(i3 >> 12) & 63]);
        sb2.append(this._base64ToAsciiC[(i3 >> 6) & 63]);
        sb2.append(this._base64ToAsciiC[i3 & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb2, int i3, int i10) {
        sb2.append(this._base64ToAsciiC[(i3 >> 18) & 63]);
        sb2.append(this._base64ToAsciiC[(i3 >> 12) & 63]);
        if (usesPadding()) {
            sb2.append(i10 == 2 ? this._base64ToAsciiC[(i3 >> 6) & 63] : this._paddingChar);
            sb2.append(this._paddingChar);
        } else if (i10 == 2) {
            sb2.append(this._base64ToAsciiC[(i3 >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i3, byte[] bArr, int i10) {
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i10] = bArr2[(i3 >> 18) & 63];
        bArr[i10 + 1] = bArr2[(i3 >> 12) & 63];
        int i11 = i10 + 3;
        bArr[i10 + 2] = bArr2[(i3 >> 6) & 63];
        int i12 = i10 + 4;
        bArr[i11] = bArr2[i3 & 63];
        return i12;
    }

    public int encodeBase64Partial(int i3, int i10, byte[] bArr, int i11) {
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i11] = bArr2[(i3 >> 18) & 63];
        int i12 = i11 + 2;
        bArr[i11 + 1] = bArr2[(i3 >> 12) & 63];
        if (!usesPadding()) {
            if (i10 != 2) {
                return i12;
            }
            int i13 = i11 + 3;
            bArr[i12] = this._base64ToAsciiB[(i3 >> 6) & 63];
            return i13;
        }
        byte b2 = (byte) this._paddingChar;
        int i14 = i11 + 3;
        bArr[i12] = i10 == 2 ? this._base64ToAsciiB[(i3 >> 6) & 63] : b2;
        int i15 = i11 + 4;
        bArr[i14] = b2;
        return i15;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i3) {
        this(base64Variant, str, base64Variant._writePadding, base64Variant._paddingChar, i3);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z2, char c10, int i3) {
        this(base64Variant, str, z2, c10, base64Variant._paddingReadBehaviour, i3);
    }

    private Base64Variant(Base64Variant base64Variant, String str, boolean z2, char c10, PaddingReadBehaviour paddingReadBehaviour, int i3) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant._asciiToBase64;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._writePadding = z2;
        this._paddingChar = c10;
        this._maxLineLength = i3;
        this._paddingReadBehaviour = paddingReadBehaviour;
    }
}
