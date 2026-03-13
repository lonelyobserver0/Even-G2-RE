package org.bouncycastle.pkcs;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PKCSUtils {
    private static final Map PRFS_SALT;

    static {
        HashMap hashMap = new HashMap();
        PRFS_SALT = hashMap;
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA1, Integers.valueOf(20));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA256, Integers.valueOf(32));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA512, Integers.valueOf(64));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA224, Integers.valueOf(28));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA384, Integers.valueOf(48));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_224, Integers.valueOf(28));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_256, Integers.valueOf(32));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_384, Integers.valueOf(48));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_512, Integers.valueOf(64));
        hashMap.put(CryptoProObjectIdentifiers.gostR3411Hmac, Integers.valueOf(32));
    }

    public static int getSaltSize(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Map map = PRFS_SALT;
        if (map.containsKey(aSN1ObjectIdentifier)) {
            return ((Integer) map.get(aSN1ObjectIdentifier)).intValue();
        }
        throw new IllegalStateException(a.e(StubApp.getString2(29377), aSN1ObjectIdentifier));
    }
}
