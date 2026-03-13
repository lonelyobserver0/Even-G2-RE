package org.bouncycastle.operator;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DefaultDigestAlgorithmIdentifierFinder implements DigestAlgorithmIdentifierFinder {
    private static Map digestOids = new HashMap();
    private static Map digestNameToOids = new HashMap();
    private static Map digestOidToAlgIds = new HashMap();

    static {
        Map map = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.dsaWithSHA1;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = OIWObjectIdentifiers.idSHA1;
        map.put(aSN1ObjectIdentifier, aSN1ObjectIdentifier2);
        Map map2 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = OIWObjectIdentifiers.md4WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.md4;
        map2.put(aSN1ObjectIdentifier3, aSN1ObjectIdentifier4);
        digestOids.put(OIWObjectIdentifiers.md4WithRSA, aSN1ObjectIdentifier4);
        digestOids.put(OIWObjectIdentifiers.sha1WithRSA, aSN1ObjectIdentifier2);
        Map map3 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.sha224WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_sha224;
        map3.put(aSN1ObjectIdentifier5, aSN1ObjectIdentifier6);
        Map map4 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.sha256WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_sha256;
        map4.put(aSN1ObjectIdentifier7, aSN1ObjectIdentifier8);
        Map map5 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.sha384WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_sha384;
        map5.put(aSN1ObjectIdentifier9, aSN1ObjectIdentifier10);
        Map map6 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = PKCSObjectIdentifiers.sha512WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_sha512;
        map6.put(aSN1ObjectIdentifier11, aSN1ObjectIdentifier12);
        Map map7 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = PKCSObjectIdentifiers.sha512_224WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_sha512_224;
        map7.put(aSN1ObjectIdentifier13, aSN1ObjectIdentifier14);
        Map map8 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = PKCSObjectIdentifiers.sha512_256WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.id_sha512_256;
        map8.put(aSN1ObjectIdentifier15, aSN1ObjectIdentifier16);
        Map map9 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = PKCSObjectIdentifiers.md2WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = PKCSObjectIdentifiers.md2;
        map9.put(aSN1ObjectIdentifier17, aSN1ObjectIdentifier18);
        digestOids.put(PKCSObjectIdentifiers.md4WithRSAEncryption, aSN1ObjectIdentifier4);
        Map map10 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = PKCSObjectIdentifiers.md5WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = PKCSObjectIdentifiers.md5;
        map10.put(aSN1ObjectIdentifier19, aSN1ObjectIdentifier20);
        digestOids.put(PKCSObjectIdentifiers.sha1WithRSAEncryption, aSN1ObjectIdentifier2);
        digestOids.put(X9ObjectIdentifiers.ecdsa_with_SHA1, aSN1ObjectIdentifier2);
        digestOids.put(X9ObjectIdentifiers.ecdsa_with_SHA224, aSN1ObjectIdentifier6);
        digestOids.put(X9ObjectIdentifiers.ecdsa_with_SHA256, aSN1ObjectIdentifier8);
        digestOids.put(X9ObjectIdentifiers.ecdsa_with_SHA384, aSN1ObjectIdentifier10);
        digestOids.put(X9ObjectIdentifiers.ecdsa_with_SHA512, aSN1ObjectIdentifier12);
        digestOids.put(X9ObjectIdentifiers.id_dsa_with_sha1, aSN1ObjectIdentifier2);
        digestOids.put(BSIObjectIdentifiers.ecdsa_plain_SHA1, aSN1ObjectIdentifier2);
        digestOids.put(BSIObjectIdentifiers.ecdsa_plain_SHA224, aSN1ObjectIdentifier6);
        digestOids.put(BSIObjectIdentifiers.ecdsa_plain_SHA256, aSN1ObjectIdentifier8);
        digestOids.put(BSIObjectIdentifiers.ecdsa_plain_SHA384, aSN1ObjectIdentifier10);
        digestOids.put(BSIObjectIdentifiers.ecdsa_plain_SHA512, aSN1ObjectIdentifier12);
        Map map11 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = BSIObjectIdentifiers.ecdsa_plain_SHA3_224;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NISTObjectIdentifiers.id_sha3_224;
        map11.put(aSN1ObjectIdentifier21, aSN1ObjectIdentifier22);
        Map map12 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = BSIObjectIdentifiers.ecdsa_plain_SHA3_256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NISTObjectIdentifiers.id_sha3_256;
        map12.put(aSN1ObjectIdentifier23, aSN1ObjectIdentifier24);
        Map map13 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BSIObjectIdentifiers.ecdsa_plain_SHA3_384;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = NISTObjectIdentifiers.id_sha3_384;
        map13.put(aSN1ObjectIdentifier25, aSN1ObjectIdentifier26);
        Map map14 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BSIObjectIdentifiers.ecdsa_plain_SHA3_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = NISTObjectIdentifiers.id_sha3_512;
        map14.put(aSN1ObjectIdentifier27, aSN1ObjectIdentifier28);
        Map map15 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BSIObjectIdentifiers.ecdsa_plain_RIPEMD160;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = TeleTrusTObjectIdentifiers.ripemd160;
        map15.put(aSN1ObjectIdentifier29, aSN1ObjectIdentifier30);
        digestOids.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, aSN1ObjectIdentifier2);
        digestOids.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, aSN1ObjectIdentifier6);
        digestOids.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, aSN1ObjectIdentifier8);
        digestOids.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, aSN1ObjectIdentifier10);
        digestOids.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, aSN1ObjectIdentifier12);
        digestOids.put(NISTObjectIdentifiers.dsa_with_sha224, aSN1ObjectIdentifier6);
        digestOids.put(NISTObjectIdentifiers.dsa_with_sha256, aSN1ObjectIdentifier8);
        digestOids.put(NISTObjectIdentifiers.dsa_with_sha384, aSN1ObjectIdentifier10);
        digestOids.put(NISTObjectIdentifiers.dsa_with_sha512, aSN1ObjectIdentifier12);
        digestOids.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224, aSN1ObjectIdentifier22);
        digestOids.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256, aSN1ObjectIdentifier24);
        digestOids.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384, aSN1ObjectIdentifier26);
        digestOids.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, aSN1ObjectIdentifier28);
        digestOids.put(NISTObjectIdentifiers.id_dsa_with_sha3_224, aSN1ObjectIdentifier22);
        digestOids.put(NISTObjectIdentifiers.id_dsa_with_sha3_256, aSN1ObjectIdentifier24);
        digestOids.put(NISTObjectIdentifiers.id_dsa_with_sha3_384, aSN1ObjectIdentifier26);
        digestOids.put(NISTObjectIdentifiers.id_dsa_with_sha3_512, aSN1ObjectIdentifier28);
        digestOids.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_224, aSN1ObjectIdentifier22);
        digestOids.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, aSN1ObjectIdentifier24);
        digestOids.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, aSN1ObjectIdentifier26);
        digestOids.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, aSN1ObjectIdentifier28);
        Map map16 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = TeleTrusTObjectIdentifiers.ripemd128;
        map16.put(aSN1ObjectIdentifier31, aSN1ObjectIdentifier32);
        digestOids.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160, aSN1ObjectIdentifier30);
        Map map17 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier33 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier34 = TeleTrusTObjectIdentifiers.ripemd256;
        map17.put(aSN1ObjectIdentifier33, aSN1ObjectIdentifier34);
        Map map18 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier35 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94;
        ASN1ObjectIdentifier aSN1ObjectIdentifier36 = CryptoProObjectIdentifiers.gostR3411;
        map18.put(aSN1ObjectIdentifier35, aSN1ObjectIdentifier36);
        digestOids.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, aSN1ObjectIdentifier36);
        Map map19 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier37 = RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier38 = RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256;
        map19.put(aSN1ObjectIdentifier37, aSN1ObjectIdentifier38);
        Map map20 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier39 = RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier40 = RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512;
        map20.put(aSN1ObjectIdentifier39, aSN1ObjectIdentifier40);
        digestOids.put(BCObjectIdentifiers.sphincs256_with_SHA3_512, aSN1ObjectIdentifier28);
        digestOids.put(BCObjectIdentifiers.sphincs256_with_SHA512, aSN1ObjectIdentifier12);
        Map map21 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier41 = BCObjectIdentifiers.sphincsPlus_shake_256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier42 = NISTObjectIdentifiers.id_shake256;
        map21.put(aSN1ObjectIdentifier41, aSN1ObjectIdentifier42);
        digestOids.put(BCObjectIdentifiers.sphincsPlus_sha_256, aSN1ObjectIdentifier8);
        digestOids.put(BCObjectIdentifiers.sphincsPlus_sha_512, aSN1ObjectIdentifier12);
        digestOids.put(BCObjectIdentifiers.falcon, aSN1ObjectIdentifier42);
        digestOids.put(BCObjectIdentifiers.falcon_512, aSN1ObjectIdentifier42);
        digestOids.put(BCObjectIdentifiers.falcon_1024, aSN1ObjectIdentifier42);
        digestOids.put(BCObjectIdentifiers.picnic_signature, aSN1ObjectIdentifier42);
        digestOids.put(BCObjectIdentifiers.picnic_with_sha512, aSN1ObjectIdentifier12);
        digestOids.put(BCObjectIdentifiers.picnic_with_sha3_512, aSN1ObjectIdentifier28);
        digestOids.put(BCObjectIdentifiers.picnic_with_shake256, aSN1ObjectIdentifier42);
        digestOids.put(GMObjectIdentifiers.sm2sign_with_sha256, aSN1ObjectIdentifier8);
        Map map22 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier43 = GMObjectIdentifiers.sm2sign_with_sm3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier44 = GMObjectIdentifiers.sm3;
        map22.put(aSN1ObjectIdentifier43, aSN1ObjectIdentifier44);
        Map map23 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier45 = CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128;
        ASN1ObjectIdentifier aSN1ObjectIdentifier46 = NISTObjectIdentifiers.id_shake128;
        map23.put(aSN1ObjectIdentifier45, aSN1ObjectIdentifier46);
        digestOids.put(CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256, aSN1ObjectIdentifier42);
        digestOids.put(CMSObjectIdentifiers.id_ecdsa_with_shake128, aSN1ObjectIdentifier46);
        digestOids.put(CMSObjectIdentifiers.id_ecdsa_with_shake256, aSN1ObjectIdentifier42);
        digestNameToOids.put(StubApp.getString2(5778), aSN1ObjectIdentifier2);
        digestNameToOids.put(StubApp.getString2(28501), aSN1ObjectIdentifier6);
        digestNameToOids.put(StubApp.getString2(1488), aSN1ObjectIdentifier8);
        digestNameToOids.put(StubApp.getString2(23704), aSN1ObjectIdentifier10);
        digestNameToOids.put(StubApp.getString2(23705), aSN1ObjectIdentifier12);
        digestNameToOids.put(StubApp.getString2(33759), aSN1ObjectIdentifier14);
        digestNameToOids.put(StubApp.getString2(29530), aSN1ObjectIdentifier16);
        digestNameToOids.put(StubApp.getString2(21748), aSN1ObjectIdentifier2);
        digestNameToOids.put(StubApp.getString2(28054), aSN1ObjectIdentifier6);
        digestNameToOids.put(StubApp.getString2(21749), aSN1ObjectIdentifier8);
        digestNameToOids.put(StubApp.getString2(21750), aSN1ObjectIdentifier10);
        digestNameToOids.put(StubApp.getString2(21751), aSN1ObjectIdentifier12);
        digestNameToOids.put(StubApp.getString2(33760), aSN1ObjectIdentifier14);
        digestNameToOids.put(StubApp.getString2(33761), aSN1ObjectIdentifier16);
        digestNameToOids.put(StubApp.getString2(28174), aSN1ObjectIdentifier22);
        digestNameToOids.put(StubApp.getString2(28175), aSN1ObjectIdentifier24);
        digestNameToOids.put(StubApp.getString2(28176), aSN1ObjectIdentifier26);
        digestNameToOids.put(StubApp.getString2(28177), aSN1ObjectIdentifier28);
        digestNameToOids.put(StubApp.getString2(28183), aSN1ObjectIdentifier46);
        digestNameToOids.put(StubApp.getString2(28184), aSN1ObjectIdentifier42);
        digestNameToOids.put(StubApp.getString2(33762), aSN1ObjectIdentifier46);
        digestNameToOids.put(StubApp.getString2(33763), aSN1ObjectIdentifier42);
        digestNameToOids.put(StubApp.getString2(28192), aSN1ObjectIdentifier36);
        digestNameToOids.put(StubApp.getString2(28194), aSN1ObjectIdentifier38);
        digestNameToOids.put(StubApp.getString2(28195), aSN1ObjectIdentifier40);
        digestNameToOids.put(StubApp.getString2(28179), aSN1ObjectIdentifier18);
        digestNameToOids.put(StubApp.getString2(28178), aSN1ObjectIdentifier4);
        digestNameToOids.put(StubApp.getString2(4894), aSN1ObjectIdentifier20);
        digestNameToOids.put(StubApp.getString2(28185), aSN1ObjectIdentifier32);
        digestNameToOids.put(StubApp.getString2(21747), aSN1ObjectIdentifier30);
        digestNameToOids.put(StubApp.getString2(28186), aSN1ObjectIdentifier34);
        digestNameToOids.put(StubApp.getString2(28189), aSN1ObjectIdentifier44);
        addDigestAlgId(aSN1ObjectIdentifier2, true);
        addDigestAlgId(aSN1ObjectIdentifier6, false);
        addDigestAlgId(aSN1ObjectIdentifier8, false);
        addDigestAlgId(aSN1ObjectIdentifier10, false);
        addDigestAlgId(aSN1ObjectIdentifier12, false);
        addDigestAlgId(aSN1ObjectIdentifier14, false);
        addDigestAlgId(aSN1ObjectIdentifier16, false);
        addDigestAlgId(aSN1ObjectIdentifier22, false);
        addDigestAlgId(aSN1ObjectIdentifier24, false);
        addDigestAlgId(aSN1ObjectIdentifier26, false);
        addDigestAlgId(aSN1ObjectIdentifier28, false);
        addDigestAlgId(aSN1ObjectIdentifier46, false);
        addDigestAlgId(aSN1ObjectIdentifier42, false);
        addDigestAlgId(aSN1ObjectIdentifier36, true);
        addDigestAlgId(aSN1ObjectIdentifier38, false);
        addDigestAlgId(aSN1ObjectIdentifier40, false);
        addDigestAlgId(aSN1ObjectIdentifier18, true);
        addDigestAlgId(aSN1ObjectIdentifier4, true);
        addDigestAlgId(aSN1ObjectIdentifier20, true);
        addDigestAlgId(aSN1ObjectIdentifier32, true);
        addDigestAlgId(aSN1ObjectIdentifier30, true);
        addDigestAlgId(aSN1ObjectIdentifier34, true);
    }

    private static void addDigestAlgId(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2) {
        digestOidToAlgIds.put(aSN1ObjectIdentifier, z2 ? new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE) : new AlgorithmIdentifier(aSN1ObjectIdentifier));
    }

    @Override // org.bouncycastle.operator.DigestAlgorithmIdentifierFinder
    public AlgorithmIdentifier find(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) digestNameToOids.get(str);
        if (aSN1ObjectIdentifier != null) {
            return find(aSN1ObjectIdentifier);
        }
        try {
            return find(new ASN1ObjectIdentifier(str));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // org.bouncycastle.operator.DigestAlgorithmIdentifierFinder
    public AlgorithmIdentifier find(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException(StubApp.getString2(33764));
        }
        AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) digestOidToAlgIds.get(aSN1ObjectIdentifier);
        return algorithmIdentifier == null ? new AlgorithmIdentifier(aSN1ObjectIdentifier) : algorithmIdentifier;
    }

    @Override // org.bouncycastle.operator.DigestAlgorithmIdentifierFinder
    public AlgorithmIdentifier find(AlgorithmIdentifier algorithmIdentifier) {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        if (algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed448)) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake256_len, new ASN1Integer(512L));
        }
        return find(algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS) ? RSASSAPSSparams.getInstance(algorithmIdentifier.getParameters()).getHashAlgorithm().getAlgorithm() : algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed25519) ? NISTObjectIdentifiers.id_sha512 : algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_alg_hss_lms_hashsig) ? NISTObjectIdentifiers.id_sha256 : (ASN1ObjectIdentifier) digestOids.get(algorithmIdentifier.getAlgorithm()));
    }
}
