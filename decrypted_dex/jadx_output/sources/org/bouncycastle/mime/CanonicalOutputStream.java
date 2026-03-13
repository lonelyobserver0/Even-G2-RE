package org.bouncycastle.mime;

import com.stub.StubApp;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.mime.smime.SMimeParserContext;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CanonicalOutputStream extends FilterOutputStream {
    protected static byte[] newline = {13, 10};
    private final boolean is7Bit;
    protected int lastb;

    public CanonicalOutputStream(SMimeParserContext sMimeParserContext, Headers headers, OutputStream outputStream) {
        super(outputStream);
        this.lastb = -1;
        if (headers.getContentType() != null) {
            this.is7Bit = (headers.getContentType() == null || headers.getContentType().equals(StubApp.getString2(15692))) ? false : true;
        } else {
            this.is7Bit = sMimeParserContext.getDefaultContentTransferEncoding().equals(StubApp.getString2(33019));
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i3) throws IOException {
        if (this.is7Bit) {
            if (i3 == 13) {
                ((FilterOutputStream) this).out.write(newline);
            } else if (i3 == 10) {
                if (this.lastb != 13) {
                    ((FilterOutputStream) this).out.write(newline);
                }
            }
            this.lastb = i3;
        }
        ((FilterOutputStream) this).out.write(i3);
        this.lastb = i3;
    }

    public void writeln() throws IOException {
        ((FilterOutputStream) this).out.write(newline);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        for (int i11 = i3; i11 != i3 + i10; i11++) {
            write(bArr[i11]);
        }
    }
}
