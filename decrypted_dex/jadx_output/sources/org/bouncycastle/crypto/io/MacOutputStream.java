package org.bouncycastle.crypto.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Mac;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MacOutputStream extends OutputStream {
    protected Mac mac;

    public MacOutputStream(Mac mac) {
        this.mac = mac;
    }

    public byte[] getMac() {
        byte[] bArr = new byte[this.mac.getMacSize()];
        this.mac.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        this.mac.update((byte) i3);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        this.mac.update(bArr, i3, i10);
    }
}
