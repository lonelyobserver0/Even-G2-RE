package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ChaCha7539Engine extends Salsa20Engine {
    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i3 = iArr[12] + 1;
        iArr[12] = i3;
        if (i3 == 0) {
            throw new IllegalStateException(StubApp.getString2(28573));
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        ChaChaEngine.chachaCore(this.rounds, this.engineState, this.f18961x);
        Pack.intToLittleEndian(this.f18961x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28574);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        return this.engineState[12] & BodyPartID.bodyIdMax;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public int getNonceSize() {
        return 12;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        this.engineState[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i3 = iArr[12];
        if (i3 == 0) {
            throw new IllegalStateException(StubApp.getString2(28575));
        }
        iArr[12] = i3 - 1;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + StubApp.getString2(28576));
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 8);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 13, 3);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j) {
        int i3 = (int) (j >>> 32);
        int i10 = (int) j;
        String string2 = StubApp.getString2(28573);
        if (i3 > 0) {
            throw new IllegalStateException(string2);
        }
        int[] iArr = this.engineState;
        int i11 = iArr[12];
        int i12 = i10 + i11;
        iArr[12] = i12;
        if (i11 != 0 && i12 < i11) {
            throw new IllegalStateException(string2);
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j) {
        int i3 = (int) (j >>> 32);
        int i10 = (int) j;
        String string2 = StubApp.getString2(28575);
        if (i3 != 0) {
            throw new IllegalStateException(string2);
        }
        int[] iArr = this.engineState;
        int i11 = iArr[12];
        if ((i11 & BodyPartID.bodyIdMax) < (BodyPartID.bodyIdMax & i10)) {
            throw new IllegalStateException(string2);
        }
        iArr[12] = i11 - i10;
    }
}
