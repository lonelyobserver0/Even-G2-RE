package org.bouncycastle.crypto.signers;

import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ISOTrailers {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA224 = 14540;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_SHA512_224 = 14796;
    public static final int TRAILER_SHA512_256 = 15052;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private static final Map<String, Integer> trailerMap;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(28185), Integers.valueOf(13004));
        hashMap.put(StubApp.getString2(21747), Integers.valueOf(12748));
        hashMap.put(StubApp.getString2(5778), Integers.valueOf(13260));
        hashMap.put(StubApp.getString2(28501), Integers.valueOf(14540));
        hashMap.put(StubApp.getString2(1488), Integers.valueOf(13516));
        hashMap.put(StubApp.getString2(23704), Integers.valueOf(14028));
        hashMap.put(StubApp.getString2(23705), Integers.valueOf(13772));
        hashMap.put(StubApp.getString2(29286), Integers.valueOf(TRAILER_SHA512_224));
        hashMap.put(StubApp.getString2(29285), Integers.valueOf(TRAILER_SHA512_256));
        hashMap.put(StubApp.getString2(28525), Integers.valueOf(14284));
        trailerMap = Collections.unmodifiableMap(hashMap);
    }

    public static Integer getTrailer(Digest digest) {
        return trailerMap.get(digest.getAlgorithmName());
    }

    public static boolean noTrailerAvailable(Digest digest) {
        return !trailerMap.containsKey(digest.getAlgorithmName());
    }
}
