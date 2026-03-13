package org.bouncycastle.pqc.crypto.sphincsplus;

import com.stub.StubApp;
import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class HarakaS512Digest extends HarakaSBase implements Digest {
    public HarakaS512Digest(HarakaSXof harakaSXof) {
        this.haraka512_rc = harakaSXof.haraka512_rc;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        byte[] bArr2 = new byte[64];
        haraka512Perm(bArr2);
        for (int i10 = 0; i10 < 64; i10++) {
            bArr2[i10] = (byte) (bArr2[i10] ^ this.buffer[i10]);
        }
        System.arraycopy(bArr2, 8, bArr, i3, 8);
        System.arraycopy(bArr2, 24, bArr, i3 + 8, 8);
        System.arraycopy(bArr2, 32, bArr, i3 + 16, 8);
        System.arraycopy(bArr2, 48, bArr, i3 + 24, 8);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(34187);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    @Override // org.bouncycastle.pqc.crypto.sphincsplus.HarakaSBase, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        int i3 = this.off;
        if (i3 + 1 > 64) {
            throw new IllegalArgumentException(StubApp.getString2(28487));
        }
        byte[] bArr = this.buffer;
        this.off = i3 + 1;
        bArr[i3] = b2;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        int i11 = this.off;
        if (i11 + i10 > 64) {
            throw new IllegalArgumentException(StubApp.getString2(28487));
        }
        System.arraycopy(bArr, i3, this.buffer, i11, i10);
        this.off += i10;
    }
}
