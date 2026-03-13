package org.bouncycastle.util.io;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TeeOutputStream extends OutputStream {
    private OutputStream output1;
    private OutputStream output2;

    public TeeOutputStream(OutputStream outputStream, OutputStream outputStream2) {
        this.output1 = outputStream;
        this.output2 = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.output1.close();
        this.output2.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.output1.flush();
        this.output2.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        this.output1.write(i3);
        this.output2.write(i3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.output1.write(bArr);
        this.output2.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        this.output1.write(bArr, i3, i10);
        this.output2.write(bArr, i3, i10);
    }
}
