package org.bouncycastle.pqc.crypto.sphincsplus;

import com.stub.StubApp;
import java.lang.reflect.Array;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class HarakaSXof extends HarakaSBase {
    public HarakaSXof(byte[] bArr) {
        byte[] bArr2 = new byte[640];
        update(bArr, 0, bArr.length);
        doFinal(bArr2, 0, 640);
        this.haraka512_rc = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 10, 8);
        this.haraka256_rc = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 8);
        for (int i3 = 0; i3 < 10; i3++) {
            interleaveConstant32(this.haraka256_rc[i3], bArr2, i3 << 5);
            interleaveConstant(this.haraka512_rc[i3], bArr2, i3 << 6);
        }
    }

    public int doFinal(byte[] bArr, int i3, int i10) {
        int i11;
        byte[] bArr2 = this.buffer;
        int i12 = this.off;
        bArr2[i12] = (byte) (bArr2[i12] ^ 31);
        bArr2[31] = (byte) (bArr2[31] ^ ByteCompanionObject.MIN_VALUE);
        this.off = 0;
        int i13 = i10;
        while (i13 > 0) {
            haraka512Perm(this.buffer);
            int i14 = 0;
            while (i14 < 32 && (i11 = i14 + i3) < bArr.length) {
                bArr[i11] = this.buffer[i14];
                i14++;
            }
            i3 += i14;
            i13 -= i14;
        }
        if (i13 != 0) {
            byte[] bArr3 = new byte[64];
            haraka512Perm(bArr3);
            System.arraycopy(bArr3, 0, bArr, i3, -i13);
        }
        reset();
        return i10;
    }

    public String getAlgorithmName() {
        return StubApp.getString2(34188);
    }

    public void update(byte b2) {
        byte[] bArr = this.buffer;
        int i3 = this.off;
        int i10 = i3 + 1;
        this.off = i10;
        bArr[i3] = (byte) (b2 ^ bArr[i3]);
        if (i10 == 32) {
            haraka512Perm(bArr);
            this.off = 0;
        }
    }

    public void update(byte[] bArr, int i3, int i10) {
        int i11 = (this.off + i10) >> 5;
        int i12 = i3;
        for (int i13 = 0; i13 < i11; i13++) {
            while (true) {
                int i14 = this.off;
                if (i14 < 32) {
                    byte[] bArr2 = this.buffer;
                    this.off = i14 + 1;
                    bArr2[i14] = (byte) (bArr[i12] ^ bArr2[i14]);
                    i12++;
                }
            }
            haraka512Perm(this.buffer);
            this.off = 0;
        }
        while (i12 < i3 + i10) {
            byte[] bArr3 = this.buffer;
            int i15 = this.off;
            this.off = i15 + 1;
            bArr3[i15] = (byte) (bArr3[i15] ^ bArr[i12]);
            i12++;
        }
    }
}
