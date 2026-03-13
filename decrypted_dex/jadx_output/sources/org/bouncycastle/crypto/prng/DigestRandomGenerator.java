package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DigestRandomGenerator implements RandomGenerator {
    private static long CYCLE_COUNT = 10;
    private Digest digest;
    private byte[] seed;
    private byte[] state;
    private long seedCounter = 1;
    private long stateCounter = 1;

    public DigestRandomGenerator(Digest digest) {
        this.digest = digest;
        this.seed = new byte[digest.getDigestSize()];
        this.state = new byte[digest.getDigestSize()];
    }

    private void cycleSeed() {
        digestUpdate(this.seed);
        long j = this.seedCounter;
        this.seedCounter = 1 + j;
        digestAddCounter(j);
        digestDoFinal(this.seed);
    }

    private void digestAddCounter(long j) {
        for (int i3 = 0; i3 != 8; i3++) {
            this.digest.update((byte) j);
            j >>>= 8;
        }
    }

    private void digestDoFinal(byte[] bArr) {
        this.digest.doFinal(bArr, 0);
    }

    private void digestUpdate(byte[] bArr) {
        this.digest.update(bArr, 0, bArr.length);
    }

    private void generateState() {
        long j = this.stateCounter;
        this.stateCounter = 1 + j;
        digestAddCounter(j);
        digestUpdate(this.state);
        digestUpdate(this.seed);
        digestDoFinal(this.state);
        if (this.stateCounter % CYCLE_COUNT == 0) {
            cycleSeed();
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        synchronized (this) {
            digestAddCounter(j);
            digestUpdate(this.seed);
            digestDoFinal(this.seed);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            try {
                if (!Arrays.isNullOrEmpty(bArr)) {
                    digestUpdate(bArr);
                }
                digestUpdate(this.seed);
                digestDoFinal(this.seed);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i3, int i10) {
        synchronized (this) {
            try {
                generateState();
                int i11 = i10 + i3;
                int i12 = 0;
                while (i3 != i11) {
                    if (i12 == this.state.length) {
                        generateState();
                        i12 = 0;
                    }
                    bArr[i3] = this.state[i12];
                    i3++;
                    i12++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
