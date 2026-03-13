package org.bouncycastle.crypto.agreement.srp;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.params.SRP6GroupParameters;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SRP6StandardGroups {
    public static final SRP6GroupParameters rfc5054_1024;
    public static final SRP6GroupParameters rfc5054_1536;
    public static final SRP6GroupParameters rfc5054_2048;
    public static final SRP6GroupParameters rfc5054_3072;
    public static final SRP6GroupParameters rfc5054_4096;
    public static final SRP6GroupParameters rfc5054_6144;
    public static final SRP6GroupParameters rfc5054_8192;
    private static final String rfc5054_1024_N = StubApp.getString2(28444);
    private static final String rfc5054_1024_g = StubApp.getString2(1716);
    private static final String rfc5054_1536_N = StubApp.getString2(28445);
    private static final String rfc5054_1536_g = StubApp.getString2(1716);
    private static final String rfc5054_2048_N = StubApp.getString2(28446);
    private static final String rfc5054_2048_g = StubApp.getString2(1716);
    private static final String rfc5054_3072_N = StubApp.getString2(28355);
    private static final String rfc5054_3072_g = StubApp.getString2(1713);
    private static final String rfc5054_4096_N = StubApp.getString2(28356);
    private static final String rfc5054_4096_g = StubApp.getString2(1713);
    private static final String rfc5054_6144_N = StubApp.getString2(28357);
    private static final String rfc5054_6144_g = StubApp.getString2(1713);
    private static final String rfc5054_8192_N = StubApp.getString2(28358);
    private static final String rfc5054_8192_g = StubApp.getString2(1722);

    static {
        String string2 = StubApp.getString2(28444);
        String string22 = StubApp.getString2(1716);
        rfc5054_1024 = fromNG(string2, string22);
        rfc5054_1536 = fromNG(StubApp.getString2(28445), string22);
        rfc5054_2048 = fromNG(StubApp.getString2(28446), string22);
        String string23 = StubApp.getString2(28355);
        String string24 = StubApp.getString2(1713);
        rfc5054_3072 = fromNG(string23, string24);
        rfc5054_4096 = fromNG(StubApp.getString2(28356), string24);
        rfc5054_6144 = fromNG(StubApp.getString2(28357), string24);
        rfc5054_8192 = fromNG(StubApp.getString2(28358), StubApp.getString2(1722));
    }

    private static BigInteger fromHex(String str) {
        return new BigInteger(1, Hex.decodeStrict(str));
    }

    private static SRP6GroupParameters fromNG(String str, String str2) {
        return new SRP6GroupParameters(fromHex(str), fromHex(str2));
    }
}
