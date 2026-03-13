package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import java.math.BigInteger;
import kotlin.UByte;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SSHBuffer {
    private final byte[] buffer;
    private int pos = 0;

    public SSHBuffer(byte[] bArr) {
        this.buffer = bArr;
    }

    public byte[] getBuffer() {
        return Arrays.clone(this.buffer);
    }

    public boolean hasRemaining() {
        return this.pos < this.buffer.length;
    }

    public BigInteger readBigNumPositive() {
        int readU32 = readU32();
        int i3 = this.pos;
        int i10 = i3 + readU32;
        byte[] bArr = this.buffer;
        if (i10 > bArr.length) {
            throw new IllegalArgumentException(StubApp.getString2(29389));
        }
        int i11 = readU32 + i3;
        this.pos = i11;
        return new BigInteger(1, Arrays.copyOfRange(bArr, i3, i11));
    }

    public byte[] readBlock() {
        int readU32 = readU32();
        if (readU32 == 0) {
            return new byte[0];
        }
        int i3 = this.pos;
        byte[] bArr = this.buffer;
        if (i3 > bArr.length - readU32) {
            throw new IllegalArgumentException(StubApp.getString2(29390));
        }
        int i10 = readU32 + i3;
        this.pos = i10;
        return Arrays.copyOfRange(bArr, i3, i10);
    }

    public byte[] readPaddedBlock() {
        return readPaddedBlock(8);
    }

    public String readString() {
        return Strings.fromByteArray(readBlock());
    }

    public int readU32() {
        int i3 = this.pos;
        byte[] bArr = this.buffer;
        if (i3 > bArr.length - 4) {
            throw new IllegalArgumentException(StubApp.getString2(29393));
        }
        int i10 = i3 + 1;
        this.pos = i10;
        int i11 = (bArr[i3] & UByte.MAX_VALUE) << 24;
        int i12 = i3 + 2;
        this.pos = i12;
        int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 16) | i11;
        int i14 = i3 + 3;
        this.pos = i14;
        int i15 = i13 | ((bArr[i12] & UByte.MAX_VALUE) << 8);
        this.pos = i3 + 4;
        return (bArr[i14] & UByte.MAX_VALUE) | i15;
    }

    public void skipBlock() {
        int readU32 = readU32();
        int i3 = this.pos;
        if (i3 > this.buffer.length - readU32) {
            throw new IllegalArgumentException(StubApp.getString2(29390));
        }
        this.pos = i3 + readU32;
    }

    public SSHBuffer(byte[] bArr, byte[] bArr2) {
        this.buffer = bArr2;
        for (int i3 = 0; i3 != bArr.length; i3++) {
            if (bArr[i3] != bArr2[i3]) {
                throw new IllegalArgumentException(StubApp.getString2(29388));
            }
        }
        this.pos += bArr.length;
    }

    public byte[] readPaddedBlock(int i3) {
        int i10;
        int readU32 = readU32();
        if (readU32 == 0) {
            return new byte[0];
        }
        int i11 = this.pos;
        byte[] bArr = this.buffer;
        if (i11 > bArr.length - readU32) {
            throw new IllegalArgumentException(StubApp.getString2(29390));
        }
        if (readU32 % i3 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(29392));
        }
        int i12 = i11 + readU32;
        this.pos = i12;
        if (readU32 > 0 && (i10 = bArr[i12 - 1] & UByte.MAX_VALUE) > 0 && i10 < i3) {
            i12 -= i10;
            int i13 = 1;
            int i14 = i12;
            while (i13 <= i10) {
                if (i13 != (this.buffer[i14] & UByte.MAX_VALUE)) {
                    throw new IllegalArgumentException(StubApp.getString2(29391));
                }
                i13++;
                i14++;
            }
        }
        return Arrays.copyOfRange(this.buffer, i11, i12);
    }
}
