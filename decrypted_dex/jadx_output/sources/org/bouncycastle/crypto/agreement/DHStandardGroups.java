package org.bouncycastle.crypto.agreement;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHStandardGroups {
    public static final DHParameters rfc2409_1024;
    public static final DHParameters rfc2409_768;
    public static final DHParameters rfc3526_1536;
    private static final int rfc3526_1536_l = 200;
    public static final DHParameters rfc3526_2048;
    private static final int rfc3526_2048_l;
    public static final DHParameters rfc3526_3072;
    private static final int rfc3526_3072_l;
    public static final DHParameters rfc3526_4096;
    private static final int rfc3526_4096_l;
    public static final DHParameters rfc3526_6144;
    private static final int rfc3526_6144_l;
    public static final DHParameters rfc3526_8192;
    private static final int rfc3526_8192_l;
    public static final DHParameters rfc4306_1024;
    public static final DHParameters rfc4306_768;
    public static final DHParameters rfc5996_1024;
    public static final DHParameters rfc5996_768;
    public static final DHParameters rfc7919_ffdhe2048;
    private static final int rfc7919_ffdhe2048_l;
    public static final DHParameters rfc7919_ffdhe3072;
    private static final int rfc7919_ffdhe3072_l;
    public static final DHParameters rfc7919_ffdhe4096;
    private static final int rfc7919_ffdhe4096_l;
    public static final DHParameters rfc7919_ffdhe6144;
    private static final int rfc7919_ffdhe6144_l;
    public static final DHParameters rfc7919_ffdhe8192;
    private static final int rfc7919_ffdhe8192_l;
    private static final String rfc2409_1024_p = StubApp.getString2(28352);
    private static final String rfc2409_768_p = StubApp.getString2(28351);
    private static final String rfc3526_1536_p = StubApp.getString2(28353);
    private static final String rfc3526_2048_p = StubApp.getString2(28354);
    private static final String rfc3526_3072_p = StubApp.getString2(28355);
    private static final String rfc3526_4096_p = StubApp.getString2(28356);
    private static final String rfc3526_6144_p = StubApp.getString2(28357);
    private static final String rfc3526_8192_p = StubApp.getString2(28358);
    private static final String rfc7919_ffdhe2048_p = StubApp.getString2(28359);
    private static final String rfc7919_ffdhe3072_p = StubApp.getString2(28360);
    private static final String rfc7919_ffdhe4096_p = StubApp.getString2(28361);
    private static final String rfc7919_ffdhe6144_p = StubApp.getString2(28362);
    private static final String rfc7919_ffdhe8192_p = StubApp.getString2(28363);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    static {
        DHParameters safePrimeGen2 = safePrimeGen2(StubApp.getString2(28351));
        rfc2409_768 = safePrimeGen2;
        DHParameters safePrimeGen22 = safePrimeGen2(StubApp.getString2(28352));
        rfc2409_1024 = safePrimeGen22;
        rfc3526_1536 = safePrimeGen2(StubApp.getString2(28353), 200);
        int max = Math.max(225, BERTags.FLAGS);
        rfc3526_2048_l = max;
        rfc3526_2048 = safePrimeGen2(StubApp.getString2(28354), max);
        int max2 = Math.max(275, 256);
        rfc3526_3072_l = max2;
        rfc3526_3072 = safePrimeGen2(StubApp.getString2(28355), max2);
        int max3 = Math.max(325, 304);
        rfc3526_4096_l = max3;
        rfc3526_4096 = safePrimeGen2(StubApp.getString2(28356), max3);
        int max4 = Math.max(375, 352);
        rfc3526_6144_l = max4;
        rfc3526_6144 = safePrimeGen2(StubApp.getString2(28357), max4);
        int max5 = Math.max(400, 400);
        rfc3526_8192_l = max5;
        rfc3526_8192 = safePrimeGen2(StubApp.getString2(28358), max5);
        rfc4306_768 = safePrimeGen2;
        rfc4306_1024 = safePrimeGen22;
        rfc5996_768 = safePrimeGen2;
        rfc5996_1024 = safePrimeGen22;
        int max6 = Math.max(225, BERTags.FLAGS);
        rfc7919_ffdhe2048_l = max6;
        rfc7919_ffdhe2048 = safePrimeGen2(StubApp.getString2(28359), max6);
        int max7 = Math.max(275, 256);
        rfc7919_ffdhe3072_l = max7;
        rfc7919_ffdhe3072 = safePrimeGen2(StubApp.getString2(28360), max7);
        int max8 = Math.max(325, 304);
        rfc7919_ffdhe4096_l = max8;
        rfc7919_ffdhe4096 = safePrimeGen2(StubApp.getString2(28361), max8);
        int max9 = Math.max(375, 352);
        rfc7919_ffdhe6144_l = max9;
        rfc7919_ffdhe6144 = safePrimeGen2(StubApp.getString2(28362), max9);
        int max10 = Math.max(400, 400);
        rfc7919_ffdhe8192_l = max10;
        rfc7919_ffdhe8192 = safePrimeGen2(StubApp.getString2(28363), max10);
    }

    private static BigInteger fromHex(String str) {
        return new BigInteger(1, Hex.decodeStrict(str));
    }

    private static DHParameters safePrimeGen2(String str) {
        return safePrimeGen2(str, 0);
    }

    private static DHParameters safePrimeGen2(String str, int i3) {
        BigInteger fromHex = fromHex(str);
        return new DHParameters(fromHex, TWO, fromHex.shiftRight(1), i3);
    }
}
