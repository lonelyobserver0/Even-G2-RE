package org.bouncycastle.crypto.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SSHBuilder {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    public byte[] getBytes() {
        return this.bos.toByteArray();
    }

    public byte[] getPaddedBytes() {
        return getPaddedBytes(8);
    }

    public void u32(int i3) {
        this.bos.write((i3 >>> 24) & 255);
        this.bos.write((i3 >>> 16) & 255);
        this.bos.write((i3 >>> 8) & 255);
        this.bos.write(i3 & 255);
    }

    public void writeBigNum(BigInteger bigInteger) {
        writeBlock(bigInteger.toByteArray());
    }

    public void writeBlock(byte[] bArr) {
        u32(bArr.length);
        try {
            this.bos.write(bArr);
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        }
    }

    public void writeBytes(byte[] bArr) {
        try {
            this.bos.write(bArr);
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        }
    }

    public void writeString(String str) {
        writeBlock(Strings.toByteArray(str));
    }

    public byte[] getPaddedBytes(int i3) {
        int size = this.bos.size() % i3;
        if (size != 0) {
            int i10 = i3 - size;
            for (int i11 = 1; i11 <= i10; i11++) {
                this.bos.write(i11);
            }
        }
        return this.bos.toByteArray();
    }
}
