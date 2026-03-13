package org.bouncycastle.pkcs.jcajce;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class JceUtils {
    private static final Map PRFS;

    static {
        HashMap hashMap = new HashMap();
        PRFS = hashMap;
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA1, StubApp.getString2(33682));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA256, StubApp.getString2(33683));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA512, StubApp.getString2(33684));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA224, StubApp.getString2(33685));
        hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA384, StubApp.getString2(33686));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_224, StubApp.getString2(33687));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_256, StubApp.getString2(33688));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_384, StubApp.getString2(33689));
        hashMap.put(NISTObjectIdentifiers.id_hmacWithSHA3_512, StubApp.getString2(33690));
        hashMap.put(CryptoProObjectIdentifiers.gostR3411Hmac, StubApp.getString2(33691));
    }

    public static String getAlgorithm(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Map map = PRFS;
        if (map.containsKey(aSN1ObjectIdentifier)) {
            return (String) map.get(aSN1ObjectIdentifier);
        }
        throw new IllegalStateException(a.e(StubApp.getString2(33910), aSN1ObjectIdentifier));
    }
}
