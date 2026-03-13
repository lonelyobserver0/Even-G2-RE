package org.bouncycastle.crypto.prng.drbg;

import com.stub.StubApp;
import java.util.Hashtable;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    static final Hashtable maxSecurityStrengths;

    static {
        Hashtable hashtable = new Hashtable();
        maxSecurityStrengths = hashtable;
        hashtable.put(StubApp.getString2(5778), Integers.valueOf(128));
        hashtable.put(StubApp.getString2(28501), Integers.valueOf(192));
        hashtable.put(StubApp.getString2(1488), Integers.valueOf(256));
        hashtable.put(StubApp.getString2(23704), Integers.valueOf(256));
        hashtable.put(StubApp.getString2(23705), Integers.valueOf(256));
        hashtable.put(StubApp.getString2(29286), Integers.valueOf(192));
        hashtable.put(StubApp.getString2(29285), Integers.valueOf(256));
    }

    public static int getMaxSecurityStrength(Digest digest) {
        return ((Integer) maxSecurityStrengths.get(digest.getAlgorithmName())).intValue();
    }

    public static byte[] hash_df(Digest digest, byte[] bArr, int i3) {
        int i10 = (i3 + 7) / 8;
        byte[] bArr2 = new byte[i10];
        int digestSize = i10 / digest.getDigestSize();
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        int i11 = 1;
        int i12 = 0;
        for (int i13 = 0; i13 <= digestSize; i13++) {
            digest.update((byte) i11);
            digest.update((byte) (i3 >> 24));
            digest.update((byte) (i3 >> 16));
            digest.update((byte) (i3 >> 8));
            digest.update((byte) i3);
            digest.update(bArr, 0, bArr.length);
            digest.doFinal(bArr3, 0);
            int i14 = i13 * digestSize2;
            int i15 = i10 - i14;
            if (i15 > digestSize2) {
                i15 = digestSize2;
            }
            System.arraycopy(bArr3, 0, bArr2, i14, i15);
            i11++;
        }
        int i16 = i3 % 8;
        if (i16 != 0) {
            int i17 = 8 - i16;
            int i18 = 0;
            while (i12 != i10) {
                int i19 = bArr2[i12] & 255;
                bArr2[i12] = (byte) ((i18 << (8 - i17)) | (i19 >>> i17));
                i12++;
                i18 = i19;
            }
        }
        return bArr2;
    }

    public static boolean isTooLarge(byte[] bArr, int i3) {
        return bArr != null && bArr.length > i3;
    }

    public static int getMaxSecurityStrength(Mac mac) {
        String algorithmName = mac.getAlgorithmName();
        return ((Integer) maxSecurityStrengths.get(algorithmName.substring(0, algorithmName.indexOf(StubApp.getString2(601))))).intValue();
    }
}
