package org.bouncycastle.cms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DefaultCMSSignatureEncryptionAlgorithmFinder implements CMSSignatureEncryptionAlgorithmFinder {
    protected static final Map GOST_ENC;
    protected static final Set RSA_PKCS1d5;

    static {
        HashSet hashSet = new HashSet();
        RSA_PKCS1d5 = hashSet;
        HashMap hashMap = new HashMap();
        GOST_ENC = hashMap;
        hashSet.add(PKCSObjectIdentifiers.md2WithRSAEncryption);
        hashSet.add(PKCSObjectIdentifiers.md4WithRSAEncryption);
        hashSet.add(PKCSObjectIdentifiers.md5WithRSAEncryption);
        hashSet.add(PKCSObjectIdentifiers.sha1WithRSAEncryption);
        hashSet.add(OIWObjectIdentifiers.md4WithRSAEncryption);
        hashSet.add(OIWObjectIdentifiers.md4WithRSA);
        hashSet.add(OIWObjectIdentifiers.md5WithRSA);
        hashSet.add(OIWObjectIdentifiers.sha1WithRSA);
        hashSet.add(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        hashSet.add(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        hashSet.add(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CryptoProObjectIdentifiers.gostR3410_2001;
        DERNull dERNull = DERNull.INSTANCE;
        hashMap.put(aSN1ObjectIdentifier, new AlgorithmIdentifier(aSN1ObjectIdentifier2, dERNull));
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, new AlgorithmIdentifier(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, dERNull));
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, new AlgorithmIdentifier(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, dERNull));
    }

    @Override // org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder
    public AlgorithmIdentifier findEncryptionAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
        if (RSA_PKCS1d5.contains(algorithmIdentifier.getAlgorithm())) {
            return new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE);
        }
        Map map = GOST_ENC;
        return map.containsKey(algorithmIdentifier.getAlgorithm()) ? (AlgorithmIdentifier) map.get(algorithmIdentifier.getAlgorithm()) : algorithmIdentifier;
    }
}
