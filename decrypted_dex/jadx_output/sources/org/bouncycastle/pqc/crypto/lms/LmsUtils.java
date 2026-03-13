package org.bouncycastle.pqc.crypto.lms;

import com.stub.StubApp;
import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class LmsUtils {
    public static void byteArray(byte[] bArr, int i3, int i10, Digest digest) {
        digest.update(bArr, i3, i10);
    }

    public static int calculateStrength(LMSParameters lMSParameters) {
        if (lMSParameters == null) {
            throw new NullPointerException(StubApp.getString2(34046));
        }
        LMSigParameters lMSigParam = lMSParameters.getLMSigParam();
        return lMSigParam.getM() * (1 << lMSigParam.getH());
    }

    public static void u16str(short s10, Digest digest) {
        digest.update((byte) (s10 >>> 8));
        digest.update((byte) s10);
    }

    public static void u32str(int i3, Digest digest) {
        digest.update((byte) (i3 >>> 24));
        digest.update((byte) (i3 >>> 16));
        digest.update((byte) (i3 >>> 8));
        digest.update((byte) i3);
    }

    public static void byteArray(byte[] bArr, Digest digest) {
        digest.update(bArr, 0, bArr.length);
    }
}
