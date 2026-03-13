package org.bouncycastle.pqc.crypto.falcon;

import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FalconRNG {
    byte[] bd = new byte[512];
    long bdummy_u64 = 0;
    int ptr = 0;
    byte[] sd = new byte[256];
    long sdummy_u64 = 0;
    int type = 0;
    FalconConversions convertor = new FalconConversions();

    private void QROUND(int i3, int i10, int i11, int i12, int[] iArr) {
        int i13 = iArr[i3] + iArr[i10];
        iArr[i3] = i13;
        int i14 = i13 ^ iArr[i12];
        iArr[i12] = i14;
        int i15 = (i14 >>> 16) | (i14 << 16);
        iArr[i12] = i15;
        int i16 = iArr[i11] + i15;
        iArr[i11] = i16;
        int i17 = iArr[i10] ^ i16;
        iArr[i10] = i17;
        int i18 = (i17 >>> 20) | (i17 << 12);
        iArr[i10] = i18;
        int i19 = iArr[i3] + i18;
        iArr[i3] = i19;
        int i20 = iArr[i12] ^ i19;
        iArr[i12] = i20;
        int i21 = (i20 >>> 24) | (i20 << 8);
        iArr[i12] = i21;
        int i22 = iArr[i11] + i21;
        iArr[i11] = i22;
        int i23 = iArr[i10] ^ i22;
        iArr[i10] = i23;
        iArr[i10] = (i23 >>> 25) | (i23 << 7);
    }

    public void prng_get_bytes(byte[] bArr, int i3, int i10) {
        while (i10 > 0) {
            byte[] bArr2 = this.bd;
            int length = bArr2.length - this.ptr;
            if (length > i10) {
                length = i10;
            }
            System.arraycopy(bArr2, 0, bArr, i3, length);
            i3 += length;
            i10 -= length;
            int i11 = this.ptr + length;
            this.ptr = i11;
            if (i11 == this.bd.length) {
                prng_refill();
            }
        }
    }

    public long prng_get_u64() {
        int i3 = this.ptr;
        if (i3 >= this.bd.length - 9) {
            prng_refill();
            i3 = 0;
        }
        this.ptr = i3 + 8;
        byte[] bArr = this.bd;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public byte prng_get_u8() {
        byte[] bArr = this.bd;
        int i3 = this.ptr;
        int i10 = i3 + 1;
        this.ptr = i10;
        byte b2 = bArr[i3];
        if (i10 == bArr.length) {
            prng_refill();
        }
        return b2;
    }

    public void prng_init(SHAKE256 shake256) {
        byte[] bArr = new byte[56];
        shake256.inner_shake256_extract(bArr, 0, 56);
        for (int i3 = 0; i3 < 14; i3++) {
            int i10 = i3 << 2;
            System.arraycopy(this.convertor.int_to_bytes(((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24)), 0, this.sd, i10, 4);
        }
        System.arraycopy(this.convertor.long_to_bytes((this.convertor.bytes_to_int(this.sd, 48) & BodyPartID.bodyIdMax) + ((BodyPartID.bodyIdMax & this.convertor.bytes_to_int(this.sd, 52)) << 32)), 0, this.sd, 48, 8);
        prng_refill();
    }

    public void prng_refill() {
        FalconRNG falconRNG = this;
        int[] iArr = {1634760805, 857760878, 2036477234, 1797285236};
        long bytes_to_long = falconRNG.convertor.bytes_to_long(falconRNG.sd, 48);
        for (int i3 = 0; i3 < 8; i3++) {
            int[] iArr2 = new int[16];
            System.arraycopy(iArr, 0, iArr2, 0, 4);
            System.arraycopy(falconRNG.convertor.bytes_to_int_array(falconRNG.sd, 0, 12), 0, iArr2, 4, 12);
            int i10 = (int) bytes_to_long;
            iArr2[14] = iArr2[14] ^ i10;
            int i11 = (int) (bytes_to_long >>> 32);
            iArr2[15] = iArr2[15] ^ i11;
            int i12 = 0;
            while (i12 < 10) {
                falconRNG.QROUND(0, 4, 8, 12, iArr2);
                falconRNG = this;
                falconRNG.QROUND(1, 5, 9, 13, iArr2);
                falconRNG.QROUND(2, 6, 10, 14, iArr2);
                falconRNG.QROUND(3, 7, 11, 15, iArr2);
                falconRNG.QROUND(0, 5, 10, 15, iArr2);
                falconRNG.QROUND(1, 6, 11, 12, iArr2);
                falconRNG.QROUND(2, 7, 8, 13, iArr2);
                falconRNG.QROUND(3, 4, 9, 14, iArr2);
                i12++;
                i11 = i11;
            }
            int i13 = i11;
            for (int i14 = 0; i14 < 4; i14++) {
                iArr2[i14] = iArr2[i14] + iArr[i14];
            }
            for (int i15 = 4; i15 < 14; i15++) {
                iArr2[i15] = iArr2[i15] + falconRNG.convertor.bytes_to_int(falconRNG.sd, (i15 * 4) - 16);
            }
            iArr2[14] = iArr2[14] + (falconRNG.convertor.bytes_to_int(falconRNG.sd, 40) ^ i10);
            iArr2[15] = iArr2[15] + (falconRNG.convertor.bytes_to_int(falconRNG.sd, 44) ^ i13);
            bytes_to_long++;
            for (int i16 = 0; i16 < 16; i16++) {
                byte[] bArr = falconRNG.bd;
                int i17 = (i3 << 2) + (i16 << 5);
                int i18 = iArr2[i16];
                bArr[i17] = (byte) i18;
                bArr[i17 + 1] = (byte) (i18 >>> 8);
                bArr[i17 + 2] = (byte) (i18 >>> 16);
                bArr[i17 + 3] = (byte) (i18 >>> 24);
            }
        }
        System.arraycopy(falconRNG.convertor.long_to_bytes(bytes_to_long), 0, falconRNG.sd, 48, 8);
        falconRNG.ptr = 0;
    }
}
