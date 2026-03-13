package com.fasterxml.jackson.core.json;

import E1.a;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.core.io.UTF32Reader;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ByteSourceJsonBootstrapper {
    private int _bytesPerChar;
    private final IOContext _context;
    private final byte[] _inputBuffer;
    private int _inputEnd;
    private int _inputPtr;
    private boolean _bigEndian = true;
    private final InputStream _in = null;
    private final boolean _bufferRecyclable = false;

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i3, int i10) {
        this._context = iOContext;
        this._inputBuffer = bArr;
        this._inputPtr = i3;
        this._inputEnd = i3 + i10;
    }

    private boolean checkUTF16(int i3) {
        if ((65280 & i3) == 0) {
            this._bigEndian = true;
        } else {
            if ((i3 & 255) != 0) {
                return false;
            }
            this._bigEndian = false;
        }
        this._bytesPerChar = 2;
        return true;
    }

    private boolean checkUTF32(int i3) throws IOException {
        if ((i3 >> 8) == 0) {
            this._bigEndian = true;
        } else if ((16777215 & i3) == 0) {
            this._bigEndian = false;
        } else if (((-16711681) & i3) == 0) {
            reportWeirdUCS4(StubApp.getString2(10406));
        } else {
            if ((i3 & (-65281)) != 0) {
                return false;
            }
            reportWeirdUCS4(StubApp.getString2(10407));
        }
        this._bytesPerChar = 4;
        return true;
    }

    private boolean handleBOM(int i3) throws IOException {
        if (i3 == -16842752) {
            reportWeirdUCS4(StubApp.getString2(10406));
        } else {
            if (i3 == -131072) {
                this._inputPtr += 4;
                this._bytesPerChar = 4;
                this._bigEndian = false;
                return true;
            }
            if (i3 == 65279) {
                this._bigEndian = true;
                this._inputPtr += 4;
                this._bytesPerChar = 4;
                return true;
            }
            if (i3 == 65534) {
                reportWeirdUCS4(StubApp.getString2(10407));
            }
        }
        int i10 = i3 >>> 16;
        if (i10 == 65279) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = true;
            return true;
        }
        if (i10 == 65534) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = false;
            return true;
        }
        if ((i3 >>> 8) != 15711167) {
            return false;
        }
        this._inputPtr += 3;
        this._bytesPerChar = 1;
        this._bigEndian = true;
        return true;
    }

    private void reportWeirdUCS4(String str) throws IOException {
        throw new CharConversionException(a.k(StubApp.getString2(10408), str, StubApp.getString2(10409)));
    }

    public JsonParser constructParser(int i3, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, int i10) throws IOException {
        int i11 = this._inputPtr;
        JsonEncoding detectEncoding = detectEncoding();
        int i12 = this._inputPtr - i11;
        if (detectEncoding != JsonEncoding.UTF8 || !JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i10)) {
            return new ReaderBasedJsonParser(this._context, i3, constructReader(), objectCodec, charsToNameCanonicalizer.makeChild(i10));
        }
        return new UTF8StreamJsonParser(this._context, i3, this._in, objectCodec, byteQuadsCanonicalizer.makeChild(i10), this._inputBuffer, this._inputPtr, this._inputEnd, i12, this._bufferRecyclable);
    }

    public Reader constructReader() throws IOException {
        JsonEncoding encoding = this._context.getEncoding();
        int bits = encoding.bits();
        if (bits != 8 && bits != 16) {
            if (bits != 32) {
                throw new RuntimeException(StubApp.getString2(10410));
            }
            IOContext iOContext = this._context;
            return new UTF32Reader(iOContext, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, iOContext.getEncoding().isBigEndian());
        }
        InputStream inputStream = this._in;
        if (inputStream == null) {
            inputStream = new ByteArrayInputStream(this._inputBuffer, this._inputPtr, this._inputEnd);
        } else if (this._inputPtr < this._inputEnd) {
            inputStream = new MergedStream(this._context, inputStream, this._inputBuffer, this._inputPtr, this._inputEnd);
        }
        return new InputStreamReader(inputStream, encoding.getJavaName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        if (checkUTF16((r1[r4 + 1] & kotlin.UByte.MAX_VALUE) | ((r1[r4] & kotlin.UByte.MAX_VALUE) << 8)) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (checkUTF16(r1 >>> 16) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.core.JsonEncoding detectEncoding() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 4
            boolean r1 = r7.ensureLoaded(r0)
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            byte[] r1 = r7._inputBuffer
            int r4 = r7._inputPtr
            r5 = r1[r4]
            int r5 = r5 << 24
            int r6 = r4 + 1
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            int r6 = r4 + 2
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            int r4 = r4 + 3
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            boolean r4 = r7.handleBOM(r1)
            if (r4 == 0) goto L31
            goto L5d
        L31:
            boolean r4 = r7.checkUTF32(r1)
            if (r4 == 0) goto L38
            goto L5d
        L38:
            int r1 = r1 >>> 16
            boolean r1 = r7.checkUTF16(r1)
            if (r1 == 0) goto L89
            goto L5d
        L41:
            boolean r1 = r7.ensureLoaded(r2)
            if (r1 == 0) goto L89
            byte[] r1 = r7._inputBuffer
            int r4 = r7._inputPtr
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r4 = r4 + r3
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            boolean r1 = r7.checkUTF16(r1)
            if (r1 == 0) goto L89
        L5d:
            int r1 = r7._bytesPerChar
            if (r1 == r3) goto L86
            if (r1 == r2) goto L7c
            if (r1 != r0) goto L6f
            boolean r0 = r7._bigEndian
            if (r0 == 0) goto L6c
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_BE
            goto L8b
        L6c:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE
            goto L8b
        L6f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = 10410(0x28aa, float:1.4588E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            throw r0
        L7c:
            boolean r0 = r7._bigEndian
            if (r0 == 0) goto L83
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE
            goto L8b
        L83:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE
            goto L8b
        L86:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            goto L8b
        L89:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
        L8b:
            com.fasterxml.jackson.core.io.IOContext r1 = r7._context
            r1.setEncoding(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper.detectEncoding():com.fasterxml.jackson.core.JsonEncoding");
    }

    public boolean ensureLoaded(int i3) throws IOException {
        int read;
        int i10 = this._inputEnd - this._inputPtr;
        while (i10 < i3) {
            InputStream inputStream = this._in;
            if (inputStream == null) {
                read = -1;
            } else {
                byte[] bArr = this._inputBuffer;
                int i11 = this._inputEnd;
                read = inputStream.read(bArr, i11, bArr.length - i11);
            }
            if (read < 1) {
                return false;
            }
            this._inputEnd += read;
            i10 += read;
        }
        return true;
    }
}
