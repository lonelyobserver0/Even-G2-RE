package com.fasterxml.jackson.core.io;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.text.Typography;
import org.bouncycastle.asn1.x509.DisplayText;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ContentReference implements Serializable {
    protected static final ContentReference UNKNOWN_CONTENT = new ContentReference(false, null);
    protected final boolean _isContentTextual;
    protected final int _length;
    protected final int _offset;
    protected final transient Object _rawContent;

    public ContentReference(boolean z2, Object obj) {
        this(z2, obj, -1, -1);
    }

    public static ContentReference construct(boolean z2, Object obj) {
        return new ContentReference(z2, obj);
    }

    public static ContentReference rawReference(boolean z2, Object obj) {
        return obj instanceof ContentReference ? (ContentReference) obj : new ContentReference(z2, obj);
    }

    public static ContentReference unknown() {
        return UNKNOWN_CONTENT;
    }

    public int _append(StringBuilder sb2, String str) {
        sb2.append(Typography.quote);
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (!Character.isISOControl(charAt) || !_appendEscaped(sb2, charAt)) {
                sb2.append(charAt);
            }
        }
        sb2.append(Typography.quote);
        return str.length();
    }

    public boolean _appendEscaped(StringBuilder sb2, int i3) {
        if (i3 == 13 || i3 == 10) {
            return false;
        }
        sb2.append('\\');
        sb2.append('u');
        sb2.append(CharTypes.hexToChar((i3 >> 12) & 15));
        sb2.append(CharTypes.hexToChar((i3 >> 8) & 15));
        sb2.append(CharTypes.hexToChar((i3 >> 4) & 15));
        sb2.append(CharTypes.hexToChar(i3 & 15));
        return true;
    }

    public String _truncate(CharSequence charSequence, int[] iArr, int i3) {
        _truncateOffsets(iArr, charSequence.length());
        int i10 = iArr[0];
        return charSequence.subSequence(i10, Math.min(iArr[1], i3) + i10).toString();
    }

    public void _truncateOffsets(int[] iArr, int i3) {
        int i10 = iArr[0];
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= i3) {
            i10 = i3;
        }
        iArr[0] = i10;
        int i11 = iArr[1];
        int i12 = i3 - i10;
        if (i11 < 0 || i11 > i12) {
            iArr[1] = i12;
        }
    }

    public StringBuilder appendSourceDescription(StringBuilder sb2) {
        String str;
        Object rawContent = getRawContent();
        if (rawContent == null) {
            sb2.append("UNKNOWN");
            return sb2;
        }
        Class<?> cls = rawContent instanceof Class ? (Class) rawContent : rawContent.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (rawContent instanceof byte[]) {
            name = "byte[]";
        } else if (rawContent instanceof char[]) {
            name = "char[]";
        }
        sb2.append('(');
        sb2.append(name);
        sb2.append(')');
        if (hasTextualContent()) {
            int maxContentSnippetLength = maxContentSnippetLength();
            int[] iArr = {contentOffset(), contentLength()};
            String str2 = " chars";
            if (rawContent instanceof CharSequence) {
                str = _truncate((CharSequence) rawContent, iArr, maxContentSnippetLength);
            } else if (rawContent instanceof char[]) {
                str = _truncate((char[]) rawContent, iArr, maxContentSnippetLength);
            } else if (rawContent instanceof byte[]) {
                str = _truncate((byte[]) rawContent, iArr, maxContentSnippetLength);
                str2 = " bytes";
            } else {
                str = null;
            }
            if (str != null) {
                _append(sb2, str);
                if (iArr[1] > maxContentSnippetLength) {
                    sb2.append("[truncated ");
                    sb2.append(iArr[1] - maxContentSnippetLength);
                    sb2.append(str2);
                    sb2.append(']');
                    return sb2;
                }
            }
        } else if (rawContent instanceof byte[]) {
            int contentLength = contentLength();
            if (contentLength < 0) {
                contentLength = ((byte[]) rawContent).length;
            }
            sb2.append('[');
            sb2.append(contentLength);
            sb2.append(" bytes]");
        }
        return sb2;
    }

    public String buildSourceDescription() {
        return appendSourceDescription(new StringBuilder(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE)).toString();
    }

    public int contentLength() {
        return this._length;
    }

    public int contentOffset() {
        return this._offset;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ContentReference)) {
            return false;
        }
        ContentReference contentReference = (ContentReference) obj;
        if (this._offset != contentReference._offset || this._length != contentReference._length) {
            return false;
        }
        Object obj2 = contentReference._rawContent;
        Object obj3 = this._rawContent;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) ? obj3.equals(obj2) : obj3 == obj2;
    }

    public Object getRawContent() {
        return this._rawContent;
    }

    public boolean hasTextualContent() {
        return this._isContentTextual;
    }

    public int hashCode() {
        return Objects.hashCode(this._rawContent);
    }

    public int maxContentSnippetLength() {
        return 500;
    }

    public ContentReference(boolean z2, Object obj, int i3, int i10) {
        this._isContentTextual = z2;
        this._rawContent = obj;
        this._offset = i3;
        this._length = i10;
    }

    public static ContentReference construct(boolean z2, Object obj, int i3, int i10) {
        return new ContentReference(z2, obj, i3, i10);
    }

    public static ContentReference rawReference(Object obj) {
        return rawReference(false, obj);
    }

    public String _truncate(char[] cArr, int[] iArr, int i3) {
        _truncateOffsets(iArr, cArr.length);
        return new String(cArr, iArr[0], Math.min(iArr[1], i3));
    }

    public String _truncate(byte[] bArr, int[] iArr, int i3) {
        _truncateOffsets(iArr, bArr.length);
        return new String(bArr, iArr[0], Math.min(iArr[1], i3), Charset.forName("UTF-8"));
    }
}
