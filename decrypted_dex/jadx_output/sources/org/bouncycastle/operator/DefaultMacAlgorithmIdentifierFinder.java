package org.bouncycastle.operator;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DefaultMacAlgorithmIdentifierFinder implements MacAlgorithmIdentifierFinder {
    private static Map macNameToAlgIds;

    static {
        HashMap hashMap = new HashMap();
        macNameToAlgIds = hashMap;
        hashMap.put(StubApp.getString2(28055), new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1));
        Map map = macNameToAlgIds;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_hmacWithSHA224;
        DERNull dERNull = DERNull.INSTANCE;
        map.put(StubApp.getString2(28056), new AlgorithmIdentifier(aSN1ObjectIdentifier, dERNull));
        macNameToAlgIds.put(StubApp.getString2(28057), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA256, dERNull));
        macNameToAlgIds.put(StubApp.getString2(28058), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA384, dERNull));
        macNameToAlgIds.put(StubApp.getString2(28059), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, dERNull));
        macNameToAlgIds.put(StubApp.getString2(33765), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512_224, dERNull));
        macNameToAlgIds.put(StubApp.getString2(33766), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512_256, dERNull));
        macNameToAlgIds.put(StubApp.getString2(33767), new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_224));
        macNameToAlgIds.put(StubApp.getString2(33768), new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_256));
        macNameToAlgIds.put(StubApp.getString2(33769), new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_384));
        macNameToAlgIds.put(StubApp.getString2(33770), new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512));
    }

    @Override // org.bouncycastle.operator.MacAlgorithmIdentifierFinder
    public AlgorithmIdentifier find(String str) {
        return (AlgorithmIdentifier) macNameToAlgIds.get(Strings.toUpperCase(str));
    }
}
