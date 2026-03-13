package org.bouncycastle.oer;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BitBuilder {
    private static final byte[] bits = {ByteCompanionObject.MIN_VALUE, 64, 32, Tnaf.POW_2_WIDTH, 8, 4, 2, 1};
    byte[] buf = new byte[1];
    int pos = 0;

    public void finalize() throws Throwable {
        zero();
        super.finalize();
    }

    public void pad() {
        int i3 = this.pos;
        this.pos = (i3 % 8) + i3;
    }

    public int write(OutputStream outputStream) throws IOException {
        int i3 = this.pos;
        int i10 = ((i3 % 8) + i3) / 8;
        outputStream.write(this.buf, 0, i10);
        outputStream.flush();
        return i10;
    }

    public void write7BitBytes(int i3) {
        boolean z2 = false;
        for (int i10 = 4; i10 >= 0; i10--) {
            if (!z2 && ((-33554432) & i3) != 0) {
                z2 = true;
            }
            if (z2) {
                writeBit(i10).writeBits(i3, 32, 7);
            }
            i3 <<= 7;
        }
    }

    public int writeAndClear(OutputStream outputStream) throws IOException {
        int i3 = this.pos;
        int i10 = ((i3 % 8) + i3) / 8;
        outputStream.write(this.buf, 0, i10);
        outputStream.flush();
        zero();
        return i10;
    }

    public BitBuilder writeBit(int i3) {
        int i10 = this.pos;
        int i11 = i10 / 8;
        byte[] bArr = this.buf;
        if (i11 >= bArr.length) {
            byte[] bArr2 = new byte[bArr.length + 4];
            System.arraycopy(bArr, 0, bArr2, 0, i10 / 8);
            Arrays.clear(this.buf);
            this.buf = bArr2;
        }
        if (i3 == 0) {
            byte[] bArr3 = this.buf;
            int i12 = this.pos;
            int i13 = i12 / 8;
            bArr3[i13] = (byte) ((~bits[i12 % 8]) & bArr3[i13]);
        } else {
            byte[] bArr4 = this.buf;
            int i14 = this.pos;
            int i15 = i14 / 8;
            bArr4[i15] = (byte) (bits[i14 % 8] | bArr4[i15]);
        }
        this.pos++;
        return this;
    }

    public BitBuilder writeBits(long j, int i3) {
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            writeBit(((1 << i10) & j) > 0 ? 1 : 0);
        }
        return this;
    }

    public void zero() {
        Arrays.clear(this.buf);
        this.pos = 0;
    }

    public void write7BitBytes(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() % 8) + bigInteger.bitLength()) / 8;
        BigInteger shiftLeft = BigInteger.valueOf(254L).shiftLeft(bitLength * 8);
        boolean z2 = false;
        while (bitLength >= 0) {
            if (!z2 && bigInteger.and(shiftLeft).compareTo(BigInteger.ZERO) != 0) {
                z2 = true;
            }
            if (z2) {
                writeBit(bitLength).writeBits(bigInteger.and(shiftLeft).shiftRight(r3 - 8).intValue(), 8, 7);
            }
            bigInteger = bigInteger.shiftLeft(7);
            bitLength--;
        }
    }

    public BitBuilder writeBits(long j, int i3, int i10) {
        for (int i11 = i3 - 1; i11 >= i3 - i10; i11--) {
            writeBit(((1 << i11) & j) != 0 ? 1 : 0);
        }
        return this;
    }
}
