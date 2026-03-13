package org.bouncycastle.operator;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MacCaptureStream extends OutputStream {
    private final OutputStream cOut;
    private final byte[] mac;
    int macIndex = 0;

    public MacCaptureStream(OutputStream outputStream, int i3) {
        this.cOut = outputStream;
        this.mac = new byte[i3];
    }

    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // java.io.OutputStream
    public void write(int i3) throws IOException {
        int i10 = this.macIndex;
        byte[] bArr = this.mac;
        if (i10 != bArr.length) {
            this.macIndex = i10 + 1;
            bArr[i10] = (byte) i3;
            return;
        }
        byte b2 = bArr[0];
        System.arraycopy(bArr, 1, bArr, 0, bArr.length - 1);
        byte[] bArr2 = this.mac;
        bArr2[bArr2.length - 1] = (byte) i3;
        this.cOut.write(b2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) throws IOException {
        byte[] bArr2 = this.mac;
        if (i10 < bArr2.length) {
            for (int i11 = 0; i11 != i10; i11++) {
                write(bArr[i3 + i11]);
            }
        } else {
            this.cOut.write(bArr2, 0, this.macIndex);
            byte[] bArr3 = this.mac;
            this.macIndex = bArr3.length;
            System.arraycopy(bArr, (i3 + i10) - bArr3.length, bArr3, 0, bArr3.length);
            this.cOut.write(bArr, i3, i10 - this.mac.length);
        }
    }
}
