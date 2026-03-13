package org.bouncycastle.crypto.prng;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ReversedWindowGenerator implements RandomGenerator {
    private final RandomGenerator generator;
    private byte[] window;
    private int windowCount;

    public ReversedWindowGenerator(RandomGenerator randomGenerator, int i3) {
        if (randomGenerator == null) {
            throw new IllegalArgumentException(StubApp.getString2(29250));
        }
        if (i3 < 2) {
            throw new IllegalArgumentException(StubApp.getString2(29249));
        }
        this.generator = randomGenerator;
        this.window = new byte[i3];
    }

    private void doNextBytes(byte[] bArr, int i3, int i10) {
        synchronized (this) {
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    if (this.windowCount < 1) {
                        RandomGenerator randomGenerator = this.generator;
                        byte[] bArr2 = this.window;
                        randomGenerator.nextBytes(bArr2, 0, bArr2.length);
                        this.windowCount = this.window.length;
                    }
                    byte[] bArr3 = this.window;
                    int i12 = this.windowCount - 1;
                    this.windowCount = i12;
                    bArr[i11 + i3] = bArr3[i12];
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        synchronized (this) {
            this.windowCount = 0;
            this.generator.addSeedMaterial(j);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        doNextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            this.windowCount = 0;
            this.generator.addSeedMaterial(bArr);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i3, int i10) {
        doNextBytes(bArr, i3, i10);
    }
}
