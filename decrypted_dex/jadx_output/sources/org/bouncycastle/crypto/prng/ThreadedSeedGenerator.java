package org.bouncycastle.crypto.prng;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ThreadedSeedGenerator {

    /* renamed from: org.bouncycastle.crypto.prng.ThreadedSeedGenerator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class SeedGenerator implements Runnable {
        private volatile int counter;
        private volatile boolean stop;

        private SeedGenerator() {
            this.counter = 0;
            this.stop = false;
        }

        public byte[] generateSeed(int i3, boolean z2) {
            Thread thread = new Thread(this);
            byte[] bArr = new byte[i3];
            this.counter = 0;
            this.stop = false;
            thread.start();
            if (!z2) {
                i3 *= 8;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                while (this.counter == i10) {
                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException unused) {
                    }
                }
                i10 = this.counter;
                if (z2) {
                    bArr[i11] = (byte) (i10 & 255);
                } else {
                    int i12 = i11 / 8;
                    bArr[i12] = (byte) ((bArr[i12] << 1) | (i10 & 1));
                }
            }
            this.stop = true;
            return bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.stop) {
                this.counter++;
            }
        }

        public /* synthetic */ SeedGenerator(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public byte[] generateSeed(int i3, boolean z2) {
        return new SeedGenerator(null).generateSeed(i3, z2);
    }
}
