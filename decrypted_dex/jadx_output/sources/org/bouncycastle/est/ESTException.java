package org.bouncycastle.est;

import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ESTException extends IOException {
    private static final long MAX_ERROR_BODY = 8192;
    private InputStream body;
    private Throwable cause;
    private int statusCode;

    public ESTException(String str) {
        this(str, null);
    }

    public InputStream getBody() {
        InputStream inputStream = this.body;
        return inputStream == null ? new InputStream() { // from class: org.bouncycastle.est.ESTException.1
            @Override // java.io.InputStream
            public int read() throws IOException {
                return -1;
            }
        } : inputStream;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + StubApp.getString2(29444) + this.statusCode;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public ESTException(String str, Throwable th) {
        super(str);
        this.cause = th;
        this.body = null;
        this.statusCode = 0;
    }

    public ESTException(String str, Throwable th, int i3, InputStream inputStream) {
        super(str);
        this.cause = th;
        this.statusCode = i3;
        if (inputStream == null) {
            this.body = null;
            return;
        }
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                if (byteArrayOutputStream.size() + read > MAX_ERROR_BODY) {
                    byteArrayOutputStream.write(bArr, 0, 8192 - byteArrayOutputStream.size());
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Exception unused) {
                return;
            }
        }
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        this.body = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        inputStream.close();
    }
}
