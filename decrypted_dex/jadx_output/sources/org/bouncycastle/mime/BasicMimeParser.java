package org.bouncycastle.mime;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.mime.encoding.Base64InputStream;
import org.bouncycastle.mime.encoding.QuotedPrintableInputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BasicMimeParser implements MimeParser {
    private final String boundary;
    private final String defaultContentTransferEncoding;
    private Headers headers;
    private boolean isMultipart;
    private final MimeParserContext parserContext;
    private final InputStream src;

    public BasicMimeParser(InputStream inputStream) throws IOException {
        this(null, new Headers(inputStream, StubApp.getString2(33019)), inputStream);
    }

    private InputStream processStream(Headers headers, InputStream inputStream) {
        return headers.getContentTransferEncoding().equals(StubApp.getString2(10758)) ? new Base64InputStream(inputStream) : headers.getContentTransferEncoding().equals(StubApp.getString2(33020)) ? new QuotedPrintableInputStream(inputStream) : inputStream;
    }

    public boolean isMultipart() {
        return this.isMultipart;
    }

    @Override // org.bouncycastle.mime.MimeParser
    public void parse(MimeParserListener mimeParserListener) throws IOException {
        MimeContext createContext = mimeParserListener.createContext(this.parserContext, this.headers);
        if (!this.isMultipart) {
            InputStream applyContext = createContext.applyContext(this.headers, this.src);
            MimeParserContext mimeParserContext = this.parserContext;
            Headers headers = this.headers;
            mimeParserListener.object(mimeParserContext, headers, processStream(headers, applyContext));
            return;
        }
        MimeMultipartContext mimeMultipartContext = (MimeMultipartContext) createContext;
        String string2 = StubApp.getString2(22045);
        String str = string2 + this.boundary;
        LineReader lineReader = new LineReader(this.src);
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            String readLine = lineReader.readLine();
            if (readLine == null || string2.equals(readLine)) {
                return;
            }
            String string22 = StubApp.getString2(33021);
            if (z2) {
                BoundaryLimitedInputStream boundaryLimitedInputStream = new BoundaryLimitedInputStream(this.src, this.boundary);
                Headers headers2 = new Headers(boundaryLimitedInputStream, this.defaultContentTransferEncoding);
                int i10 = i3 + 1;
                InputStream applyContext2 = mimeMultipartContext.createContext(i3).applyContext(headers2, boundaryLimitedInputStream);
                mimeParserListener.object(this.parserContext, headers2, processStream(headers2, applyContext2));
                if (applyContext2.read() >= 0) {
                    throw new IOException(string22);
                }
                i3 = i10;
            } else if (str.equals(readLine)) {
                BoundaryLimitedInputStream boundaryLimitedInputStream2 = new BoundaryLimitedInputStream(this.src, this.boundary);
                Headers headers3 = new Headers(boundaryLimitedInputStream2, this.defaultContentTransferEncoding);
                int i11 = i3 + 1;
                InputStream applyContext3 = mimeMultipartContext.createContext(i3).applyContext(headers3, boundaryLimitedInputStream2);
                mimeParserListener.object(this.parserContext, headers3, processStream(headers3, applyContext3));
                if (applyContext3.read() >= 0) {
                    throw new IOException(string22);
                }
                z2 = true;
                i3 = i11;
            } else {
                continue;
            }
        }
    }

    public BasicMimeParser(Headers headers, InputStream inputStream) {
        this(null, headers, inputStream);
    }

    public BasicMimeParser(MimeParserContext mimeParserContext, InputStream inputStream) throws IOException {
        this(mimeParserContext, new Headers(inputStream, mimeParserContext.getDefaultContentTransferEncoding()), inputStream);
    }

    public BasicMimeParser(MimeParserContext mimeParserContext, Headers headers, InputStream inputStream) {
        String str;
        this.isMultipart = false;
        if (headers.isMultipart()) {
            this.isMultipart = true;
            str = headers.getBoundary();
        } else {
            str = null;
        }
        this.boundary = str;
        this.headers = headers;
        this.parserContext = mimeParserContext;
        this.src = inputStream;
        this.defaultContentTransferEncoding = mimeParserContext != null ? mimeParserContext.getDefaultContentTransferEncoding() : StubApp.getString2(33019);
    }
}
