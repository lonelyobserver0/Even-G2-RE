package org.bouncycastle.util.test;

import com.stub.StubApp;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class UncloseableOutputStream extends FilterOutputStream {
    public UncloseableOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new RuntimeException(StubApp.getString2(35028));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i3, i10);
    }
}
