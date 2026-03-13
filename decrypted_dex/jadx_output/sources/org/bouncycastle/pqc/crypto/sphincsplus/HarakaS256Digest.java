package org.bouncycastle.pqc.crypto.sphincsplus;

import com.stub.StubApp;
import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class HarakaS256Digest extends HarakaSBase implements Digest {
    public HarakaS256Digest(HarakaSXof harakaSXof) {
        this.haraka256_rc = harakaSXof.haraka256_rc;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        byte[] bArr2 = new byte[64];
        haraka256Perm(bArr2);
        System.arraycopy(bArr2, 0, bArr, i3, bArr.length - i3);
        reset();
        return bArr.length;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(34186);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.pqc.crypto.sphincsplus.HarakaSBase, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        int i3 = this.off;
        if (i3 + 1 > 32) {
            throw new IllegalArgumentException(StubApp.getString2(28484));
        }
        byte[] bArr = this.buffer;
        this.off = i3 + 1;
        bArr[i3] = b2;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        int i11 = this.off;
        if (i11 + i10 > 32) {
            throw new IllegalArgumentException(StubApp.getString2(28484));
        }
        System.arraycopy(bArr, i3, this.buffer, i11, i10);
        this.off += i10;
    }
}
