package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        this.f19008m = ((this.f19008m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + r2) & 255) << 56);
        processMessageWord();
        this.v2 ^= 238;
        applySipRounds(this.f19005d);
        long j = this.f19009v0;
        long j3 = this.f19010v1;
        long j10 = ((j ^ j3) ^ this.v2) ^ this.f19011v3;
        this.f19010v1 = j3 ^ 221;
        applySipRounds(this.f19005d);
        long j11 = ((this.f19009v0 ^ this.f19010v1) ^ this.v2) ^ this.f19011v3;
        reset();
        Pack.longToLittleEndian(j10, bArr, i3);
        Pack.longToLittleEndian(j11, bArr, i3 + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return StubApp.getString2(29051) + this.f19004c + StubApp.getString2(999) + this.f19005d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f19010v1 ^= 238;
    }

    public SipHash128(int i3, int i10) {
        super(i3, i10);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() throws DataLengthException, IllegalStateException {
        throw new UnsupportedOperationException(StubApp.getString2(29050));
    }
}
