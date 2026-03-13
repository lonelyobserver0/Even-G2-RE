package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Mac;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MacInputStream extends FilterInputStream {
    protected Mac mac;

    public MacInputStream(InputStream inputStream, Mac mac) {
        super(inputStream);
        this.mac = mac;
    }

    public Mac getMac() {
        return this.mac;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            this.mac.update((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i3, i10);
        if (read >= 0) {
            this.mac.update(bArr, i3, read);
        }
        return read;
    }
}
