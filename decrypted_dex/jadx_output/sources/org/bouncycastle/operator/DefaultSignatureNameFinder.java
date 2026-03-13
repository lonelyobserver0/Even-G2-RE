package org.bouncycastle.operator;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DefaultSignatureNameFinder implements AlgorithmNameFinder {
    private static final Map digests;
    private static final Map oids;

    static {
        HashMap hashMap = new HashMap();
        oids = hashMap;
        HashMap hashMap2 = new HashMap();
        digests = hashMap2;
        hashMap.put(PKCSObjectIdentifiers.id_RSASSA_PSS, StubApp.getString2(30368));
        hashMap.put(EdECObjectIdentifiers.id_Ed25519, StubApp.getString2(30119));
        hashMap.put(EdECObjectIdentifiers.id_Ed448, StubApp.getString2(30117));
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(StubApp.getString2(32464));
        String string2 = StubApp.getString2(30425);
        hashMap.put(aSN1ObjectIdentifier, string2);
        hashMap.put(PKCSObjectIdentifiers.sha224WithRSAEncryption, StubApp.getString2(32467));
        hashMap.put(PKCSObjectIdentifiers.sha256WithRSAEncryption, StubApp.getString2(32469));
        hashMap.put(PKCSObjectIdentifiers.sha384WithRSAEncryption, StubApp.getString2(32471));
        hashMap.put(PKCSObjectIdentifiers.sha512WithRSAEncryption, StubApp.getString2(32473));
        hashMap.put(CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128, StubApp.getString2(33793));
        hashMap.put(CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256, StubApp.getString2(33794));
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, StubApp.getString2(32499));
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, StubApp.getString2(32501));
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, StubApp.getString2(32721));
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, StubApp.getString2(32722));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA1, StubApp.getString2(32723));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA224, StubApp.getString2(32724));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA256, StubApp.getString2(32725));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA384, StubApp.getString2(32726));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA512, StubApp.getString2(32727));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA3_224, StubApp.getString2(33789));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA3_256, StubApp.getString2(33790));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA3_384, StubApp.getString2(33791));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA3_512, StubApp.getString2(33792));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, StubApp.getString2(32728));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, StubApp.getString2(32729));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, StubApp.getString2(32730));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, StubApp.getString2(32731));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, StubApp.getString2(32732));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, StubApp.getString2(32733));
        hashMap.put(IsaraObjectIdentifiers.id_alg_xmss, StubApp.getString2(32734));
        hashMap.put(IsaraObjectIdentifiers.id_alg_xmssmt, StubApp.getString2(32735));
        hashMap.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128, StubApp.getString2(32481));
        hashMap.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160, StubApp.getString2(32483));
        hashMap.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256, StubApp.getString2(32485));
        hashMap.put(new ASN1ObjectIdentifier(StubApp.getString2(32460)), StubApp.getString2(32462));
        hashMap.put(new ASN1ObjectIdentifier(StubApp.getString2(32457)), StubApp.getString2(32459));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(StubApp.getString2(32486));
        String string22 = StubApp.getString2(32487);
        hashMap.put(aSN1ObjectIdentifier2, string22);
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA1, StubApp.getString2(32493));
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA224, StubApp.getString2(32494));
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA256, StubApp.getString2(32495));
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA384, StubApp.getString2(32496));
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA512, StubApp.getString2(32497));
        hashMap.put(CMSObjectIdentifiers.id_ecdsa_with_shake128, StubApp.getString2(33797));
        hashMap.put(CMSObjectIdentifiers.id_ecdsa_with_shake256, StubApp.getString2(33798));
        hashMap.put(OIWObjectIdentifiers.sha1WithRSA, string2);
        hashMap.put(OIWObjectIdentifiers.dsaWithSHA1, string22);
        hashMap.put(NISTObjectIdentifiers.dsa_with_sha224, StubApp.getString2(32489));
        hashMap.put(NISTObjectIdentifiers.dsa_with_sha256, StubApp.getString2(32490));
        hashMap2.put(OIWObjectIdentifiers.idSHA1, StubApp.getString2(21748));
        hashMap2.put(NISTObjectIdentifiers.id_sha224, StubApp.getString2(28054));
        hashMap2.put(NISTObjectIdentifiers.id_sha256, StubApp.getString2(21749));
        hashMap2.put(NISTObjectIdentifiers.id_sha384, StubApp.getString2(21750));
        hashMap2.put(NISTObjectIdentifiers.id_sha512, StubApp.getString2(21751));
        hashMap2.put(NISTObjectIdentifiers.id_sha3_224, StubApp.getString2(28174));
        hashMap2.put(NISTObjectIdentifiers.id_sha3_256, StubApp.getString2(28175));
        hashMap2.put(NISTObjectIdentifiers.id_sha3_384, StubApp.getString2(28176));
        hashMap2.put(NISTObjectIdentifiers.id_sha3_512, StubApp.getString2(28177));
        hashMap2.put(TeleTrusTObjectIdentifiers.ripemd128, StubApp.getString2(28185));
        hashMap2.put(TeleTrusTObjectIdentifiers.ripemd160, StubApp.getString2(21747));
        hashMap2.put(TeleTrusTObjectIdentifiers.ripemd256, StubApp.getString2(28186));
    }

    private static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) digests.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    @Override // org.bouncycastle.operator.AlgorithmNameFinder
    public String getAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) oids.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    @Override // org.bouncycastle.operator.AlgorithmNameFinder
    public boolean hasAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return oids.containsKey(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.operator.AlgorithmNameFinder
    public String getAlgorithmName(AlgorithmIdentifier algorithmIdentifier) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters == null || DERNull.INSTANCE.equals(parameters) || !algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            Map map = oids;
            boolean containsKey = map.containsKey(algorithmIdentifier.getAlgorithm());
            ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
            return containsKey ? (String) map.get(algorithm) : algorithm.getId();
        }
        RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(parameters);
        AlgorithmIdentifier maskGenAlgorithm = rSASSAPSSparams.getMaskGenAlgorithm();
        if (!maskGenAlgorithm.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_mgf1)) {
            return getDigestName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()) + StubApp.getString2(30298) + maskGenAlgorithm.getAlgorithm().getId();
        }
        AlgorithmIdentifier hashAlgorithm = rSASSAPSSparams.getHashAlgorithm();
        ASN1ObjectIdentifier algorithm2 = AlgorithmIdentifier.getInstance(maskGenAlgorithm.getParameters()).getAlgorithm();
        if (algorithm2.equals((ASN1Primitive) hashAlgorithm.getAlgorithm())) {
            return AbstractC1482f.k(new StringBuilder(), getDigestName(hashAlgorithm.getAlgorithm()), StubApp.getString2(32737));
        }
        return getDigestName(hashAlgorithm.getAlgorithm()) + StubApp.getString2(33836) + getDigestName(algorithm2);
    }
}
