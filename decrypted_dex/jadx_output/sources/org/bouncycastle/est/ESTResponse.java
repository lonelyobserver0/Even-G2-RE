package org.bouncycastle.est;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.est.HttpUtil;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ESTResponse {
    private static final Long ZERO = 0L;
    private String HttpVersion;
    private Long absoluteReadLimit;
    private Long contentLength;
    private final HttpUtil.Headers headers;
    private InputStream inputStream;
    private final byte[] lineBuffer;
    private final ESTRequest originalRequest;
    private long read = 0;
    private final Source source;
    private int statusCode;
    private String statusMessage;

    public static class PrintingInputStream extends InputStream {
        private final InputStream src;

        private PrintingInputStream(InputStream inputStream) {
            this.src = inputStream;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.src.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.src.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            return this.src.read();
        }
    }

    public ESTResponse(ESTRequest eSTRequest, Source source) throws IOException {
        this.originalRequest = eSTRequest;
        this.source = source;
        if (source instanceof LimitedSource) {
            this.absoluteReadLimit = ((LimitedSource) source).getAbsoluteReadLimit();
        }
        Set<String> asKeySet = Properties.asKeySet(StubApp.getString2(29449));
        this.inputStream = (asKeySet.contains(StubApp.getString2(294)) || asKeySet.contains(StubApp.getString2(23002))) ? new PrintingInputStream(source.getInputStream()) : source.getInputStream();
        this.headers = new HttpUtil.Headers();
        this.lineBuffer = new byte[1024];
        process();
    }

    public static /* synthetic */ long access$108(ESTResponse eSTResponse) {
        long j = eSTResponse.read;
        eSTResponse.read = 1 + j;
        return j;
    }

    private void process() throws IOException {
        this.HttpVersion = readStringIncluding(' ');
        this.statusCode = Integer.parseInt(readStringIncluding(' '));
        this.statusMessage = readStringIncluding('\n');
        while (true) {
            String readStringIncluding = readStringIncluding('\n');
            if (readStringIncluding.length() <= 0) {
                break;
            }
            int indexOf = readStringIncluding.indexOf(58);
            if (indexOf > -1) {
                this.headers.add(Strings.toLowerCase(readStringIncluding.substring(0, indexOf).trim()), readStringIncluding.substring(indexOf + 1).trim());
            }
        }
        boolean equalsIgnoreCase = this.headers.getFirstValueOrEmpty(StubApp.getString2(25031)).equalsIgnoreCase(StubApp.getString2(25032));
        this.contentLength = equalsIgnoreCase ? 0L : getContentLength();
        int i3 = this.statusCode;
        if (i3 == 204 || i3 == 202) {
            Long l9 = this.contentLength;
            if (l9 == null) {
                this.contentLength = 0L;
            } else if (i3 == 204 && l9.longValue() > 0) {
                throw new IOException(StubApp.getString2(29450));
            }
        }
        Long l10 = this.contentLength;
        if (l10 == null) {
            throw new IOException(StubApp.getString2(29455));
        }
        if (l10.equals(ZERO) && !equalsIgnoreCase) {
            this.inputStream = new InputStream() { // from class: org.bouncycastle.est.ESTResponse.1
                @Override // java.io.InputStream
                public int read() throws IOException {
                    return -1;
                }
            };
        }
        if (this.contentLength.longValue() < 0) {
            throw new IOException(StubApp.getString2(29454) + this.absoluteReadLimit);
        }
        if (this.absoluteReadLimit != null && this.contentLength.longValue() >= this.absoluteReadLimit.longValue()) {
            throw new IOException(StubApp.getString2(29451) + this.absoluteReadLimit + StubApp.getString2(29452) + this.contentLength);
        }
        this.inputStream = wrapWithCounter(this.inputStream, this.absoluteReadLimit);
        if (equalsIgnoreCase) {
            this.inputStream = new CTEChunkedInputStream(this.inputStream);
        }
        if (StubApp.getString2(10758).equalsIgnoreCase(getHeader(StubApp.getString2(29453)))) {
            this.inputStream = new CTEBase64InputStream(this.inputStream, getContentLength());
        }
    }

    public void close() throws IOException {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            inputStream.close();
        }
        this.source.close();
    }

    public long getAbsoluteReadLimit() {
        Long l9 = this.absoluteReadLimit;
        return l9 == null ? LongCompanionObject.MAX_VALUE : l9.longValue();
    }

    public Long getContentLength() {
        String firstValue = this.headers.getFirstValue(StubApp.getString2(2415));
        if (firstValue == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(firstValue));
        } catch (RuntimeException e10) {
            StringBuilder l9 = b.l(StubApp.getString2(29456), firstValue, StubApp.getString2(29457));
            l9.append(e10.getMessage());
            throw new RuntimeException(l9.toString());
        }
    }

    public String getHeader(String str) {
        return this.headers.getFirstValue(str);
    }

    public String getHeaderOrEmpty(String str) {
        return this.headers.getFirstValueOrEmpty(str);
    }

    public HttpUtil.Headers getHeaders() {
        return this.headers;
    }

    public String getHttpVersion() {
        return this.HttpVersion;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public ESTRequest getOriginalRequest() {
        return this.originalRequest;
    }

    public Source getSource() {
        return this.source;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String readStringIncluding(char c10) throws IOException {
        int read;
        byte[] bArr;
        int i3;
        int i10 = 0;
        while (true) {
            read = this.inputStream.read();
            bArr = this.lineBuffer;
            i3 = i10 + 1;
            bArr[i10] = (byte) read;
            if (i3 >= bArr.length) {
                throw new IOException(StubApp.getString2(29458) + this.lineBuffer.length);
            }
            if (read == c10 || read <= -1) {
                break;
            }
            i10 = i3;
        }
        if (read != -1) {
            return new String(bArr, 0, i3).trim();
        }
        throw new EOFException();
    }

    public InputStream wrapWithCounter(final InputStream inputStream, final Long l9) {
        return new InputStream() { // from class: org.bouncycastle.est.ESTResponse.2
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (ESTResponse.this.contentLength == null || ESTResponse.this.contentLength.longValue() - 1 <= ESTResponse.this.read) {
                    if (inputStream.available() > 0) {
                        throw new IOException(StubApp.getString2(29447));
                    }
                    inputStream.close();
                } else {
                    throw new IOException(StubApp.getString2(29445) + ESTResponse.this.read + StubApp.getString2(29446) + ESTResponse.this.contentLength);
                }
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                int read = inputStream.read();
                if (read > -1) {
                    ESTResponse.access$108(ESTResponse.this);
                    if (l9 != null && ESTResponse.this.read >= l9.longValue()) {
                        throw new IOException(StubApp.getString2(29448) + l9);
                    }
                }
                return read;
            }
        };
    }
}
