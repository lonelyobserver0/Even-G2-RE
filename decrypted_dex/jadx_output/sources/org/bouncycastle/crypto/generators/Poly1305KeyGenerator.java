package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Poly1305KeyGenerator extends CipherKeyGenerator {
    private static final byte R_MASK_HIGH_4 = 15;
    private static final byte R_MASK_LOW_2 = -4;

    public static void checkKey(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(28983));
        }
        checkMask(bArr[3], R_MASK_HIGH_4);
        checkMask(bArr[7], R_MASK_HIGH_4);
        checkMask(bArr[11], R_MASK_HIGH_4);
        checkMask(bArr[15], R_MASK_HIGH_4);
        checkMask(bArr[4], R_MASK_LOW_2);
        checkMask(bArr[8], R_MASK_LOW_2);
        checkMask(bArr[12], R_MASK_LOW_2);
    }

    private static void checkMask(byte b2, byte b10) {
        if ((b2 & (~b10)) != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28984));
        }
    }

    public static void clamp(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(28983));
        }
        bArr[3] = (byte) (bArr[3] & R_MASK_HIGH_4);
        bArr[7] = (byte) (bArr[7] & R_MASK_HIGH_4);
        bArr[11] = (byte) (bArr[11] & R_MASK_HIGH_4);
        bArr[15] = (byte) (bArr[15] & R_MASK_HIGH_4);
        bArr[4] = (byte) (bArr[4] & R_MASK_LOW_2);
        bArr[8] = (byte) (bArr[8] & R_MASK_LOW_2);
        bArr[12] = (byte) (bArr[12] & R_MASK_LOW_2);
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        byte[] generateKey = super.generateKey();
        clamp(generateKey);
        return generateKey;
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        super.init(new KeyGenerationParameters(keyGenerationParameters.getRandom(), 256));
    }
}
