package org.bouncycastle.crypto.prng;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X931RNG {
    private static final int BLOCK128_MAX_BITS_REQUEST = 262144;
    private static final long BLOCK128_RESEED_MAX = 8388608;
    private static final int BLOCK64_MAX_BITS_REQUEST = 4096;
    private static final long BLOCK64_RESEED_MAX = 32768;
    private final byte[] DT;

    /* renamed from: I, reason: collision with root package name */
    private final byte[] f19112I;

    /* renamed from: R, reason: collision with root package name */
    private final byte[] f19113R;

    /* renamed from: V, reason: collision with root package name */
    private byte[] f19114V;
    private final BlockCipher engine;
    private final EntropySource entropySource;
    private long reseedCounter = 1;

    public X931RNG(BlockCipher blockCipher, byte[] bArr, EntropySource entropySource) {
        this.engine = blockCipher;
        this.entropySource = entropySource;
        byte[] bArr2 = new byte[blockCipher.getBlockSize()];
        this.DT = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f19112I = new byte[blockCipher.getBlockSize()];
        this.f19113R = new byte[blockCipher.getBlockSize()];
    }

    private void increment(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b2 = (byte) (bArr[length] + 1);
            bArr[length] = b2;
            if (b2 != 0) {
                return;
            }
        }
    }

    private static boolean isTooLarge(byte[] bArr, int i3) {
        return bArr != null && bArr.length > i3;
    }

    private void process(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i3 = 0; i3 != bArr.length; i3++) {
            bArr[i3] = (byte) (bArr2[i3] ^ bArr3[i3]);
        }
        this.engine.processBlock(bArr, 0, bArr, 0);
    }

    public int generate(byte[] bArr, boolean z2) {
        int length = this.f19113R.length;
        long j = this.reseedCounter;
        if (length == 8) {
            if (j > BLOCK64_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException(StubApp.getString2(29256));
            }
        } else {
            if (j > BLOCK128_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException(StubApp.getString2(29258));
            }
        }
        if (z2 || this.f19114V == null) {
            byte[] entropy = this.entropySource.getEntropy();
            this.f19114V = entropy;
            if (entropy.length != this.engine.getBlockSize()) {
                throw new IllegalStateException(StubApp.getString2(29257));
            }
        }
        int length2 = bArr.length / this.f19113R.length;
        for (int i3 = 0; i3 < length2; i3++) {
            this.engine.processBlock(this.DT, 0, this.f19112I, 0);
            process(this.f19113R, this.f19112I, this.f19114V);
            process(this.f19114V, this.f19113R, this.f19112I);
            byte[] bArr2 = this.f19113R;
            System.arraycopy(bArr2, 0, bArr, bArr2.length * i3, bArr2.length);
            increment(this.DT);
        }
        int length3 = bArr.length - (this.f19113R.length * length2);
        if (length3 > 0) {
            this.engine.processBlock(this.DT, 0, this.f19112I, 0);
            process(this.f19113R, this.f19112I, this.f19114V);
            process(this.f19114V, this.f19113R, this.f19112I);
            byte[] bArr3 = this.f19113R;
            System.arraycopy(bArr3, 0, bArr, length2 * bArr3.length, length3);
            increment(this.DT);
        }
        this.reseedCounter++;
        return bArr.length * 8;
    }

    public EntropySource getEntropySource() {
        return this.entropySource;
    }

    public void reseed() {
        byte[] entropy = this.entropySource.getEntropy();
        this.f19114V = entropy;
        if (entropy.length != this.engine.getBlockSize()) {
            throw new IllegalStateException(StubApp.getString2(29257));
        }
        this.reseedCounter = 1L;
    }
}
