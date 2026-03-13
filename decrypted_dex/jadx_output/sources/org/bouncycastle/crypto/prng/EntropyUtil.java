package org.bouncycastle.crypto.prng;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EntropyUtil {
    public static byte[] generateSeed(EntropySource entropySource, int i3) {
        byte[] bArr = new byte[i3];
        if (i3 * 8 <= entropySource.entropySize()) {
            System.arraycopy(entropySource.getEntropy(), 0, bArr, 0, i3);
            return bArr;
        }
        int entropySize = entropySource.entropySize() / 8;
        for (int i10 = 0; i10 < i3; i10 += entropySize) {
            byte[] entropy = entropySource.getEntropy();
            int i11 = i3 - i10;
            if (entropy.length <= i11) {
                System.arraycopy(entropy, 0, bArr, i10, entropy.length);
            } else {
                System.arraycopy(entropy, 0, bArr, i10, i11);
            }
        }
        return bArr;
    }
}
