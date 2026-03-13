package org.bouncycastle.its;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashAlgorithm;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ITSAlgorithmUtils {
    private static final Map<Object, HashAlgorithm> algoMap;

    static {
        HashMap hashMap = new HashMap();
        algoMap = hashMap;
        hashMap.put(NISTObjectIdentifiers.id_sha256, HashAlgorithm.sha256);
        hashMap.put(NISTObjectIdentifiers.id_sha384, HashAlgorithm.sha384);
    }

    public static HashAlgorithm getHashAlgorithm(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return algoMap.get(aSN1ObjectIdentifier);
    }
}
