package org.bouncycastle.pqc.legacy.crypto.mceliece;

import com.stub.StubApp;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static Digest getDigest(String str) {
        if (str.equals(StubApp.getString2(5778))) {
            return new SHA1Digest();
        }
        if (str.equals(StubApp.getString2(28501))) {
            return new SHA224Digest();
        }
        if (str.equals(StubApp.getString2(1488))) {
            return new SHA256Digest();
        }
        if (str.equals(StubApp.getString2(23704))) {
            return new SHA384Digest();
        }
        if (str.equals(StubApp.getString2(23705))) {
            return new SHA512Digest();
        }
        throw new IllegalArgumentException(StubApp.getString2(34236).concat(str));
    }
}
