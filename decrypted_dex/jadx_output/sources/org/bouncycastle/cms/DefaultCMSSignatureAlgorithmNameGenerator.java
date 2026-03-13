package org.bouncycastle.cms;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DefaultCMSSignatureAlgorithmNameGenerator implements CMSSignatureAlgorithmNameGenerator {
    private final Map digestAlgs;
    private final Map encryptionAlgs;

    public DefaultCMSSignatureAlgorithmNameGenerator() {
        HashMap hashMap = new HashMap();
        this.encryptionAlgs = hashMap;
        HashMap hashMap2 = new HashMap();
        this.digestAlgs = hashMap2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.dsa_with_sha224;
        String string2 = StubApp.getString2(28054);
        String string22 = StubApp.getString2(28060);
        addEntries(aSN1ObjectIdentifier, string2, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.dsa_with_sha256;
        String string23 = StubApp.getString2(21749);
        addEntries(aSN1ObjectIdentifier2, string23, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.dsa_with_sha384;
        String string24 = StubApp.getString2(21750);
        addEntries(aSN1ObjectIdentifier3, string24, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.dsa_with_sha512;
        String string25 = StubApp.getString2(21751);
        addEntries(aSN1ObjectIdentifier4, string25, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_dsa_with_sha3_224;
        String string26 = StubApp.getString2(28174);
        addEntries(aSN1ObjectIdentifier5, string26, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_dsa_with_sha3_256;
        String string27 = StubApp.getString2(28175);
        addEntries(aSN1ObjectIdentifier6, string27, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_dsa_with_sha3_384;
        String string28 = StubApp.getString2(28176);
        addEntries(aSN1ObjectIdentifier7, string28, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_dsa_with_sha3_512;
        String string29 = StubApp.getString2(28177);
        addEntries(aSN1ObjectIdentifier8, string29, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224;
        String string210 = StubApp.getString2(24659);
        addEntries(aSN1ObjectIdentifier9, string26, string210);
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256;
        addEntries(aSN1ObjectIdentifier10, string27, string210);
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384;
        addEntries(aSN1ObjectIdentifier11, string28, string210);
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512;
        addEntries(aSN1ObjectIdentifier12, string29, string210);
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_ecdsa_with_sha3_224;
        String string211 = StubApp.getString2(28163);
        addEntries(aSN1ObjectIdentifier13, string26, string211);
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, string27, string211);
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, string28, string211);
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, string29, string211);
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = OIWObjectIdentifiers.dsaWithSHA1;
        String string212 = StubApp.getString2(21748);
        addEntries(aSN1ObjectIdentifier14, string212, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = OIWObjectIdentifiers.md4WithRSA;
        String string213 = StubApp.getString2(28178);
        addEntries(aSN1ObjectIdentifier15, string213, string210);
        addEntries(OIWObjectIdentifiers.md4WithRSAEncryption, string213, string210);
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = OIWObjectIdentifiers.md5WithRSA;
        String string214 = StubApp.getString2(4894);
        addEntries(aSN1ObjectIdentifier16, string214, string210);
        addEntries(OIWObjectIdentifiers.sha1WithRSA, string212, string210);
        addEntries(PKCSObjectIdentifiers.md2WithRSAEncryption, StubApp.getString2(28179), string210);
        addEntries(PKCSObjectIdentifiers.md4WithRSAEncryption, string213, string210);
        addEntries(PKCSObjectIdentifiers.md5WithRSAEncryption, string214, string210);
        addEntries(PKCSObjectIdentifiers.sha1WithRSAEncryption, string212, string210);
        addEntries(PKCSObjectIdentifiers.sha224WithRSAEncryption, string2, string210);
        addEntries(PKCSObjectIdentifiers.sha256WithRSAEncryption, string23, string210);
        addEntries(PKCSObjectIdentifiers.sha384WithRSAEncryption, string24, string210);
        addEntries(PKCSObjectIdentifiers.sha512WithRSAEncryption, string25, string210);
        addEntries(PKCSObjectIdentifiers.sha512_224WithRSAEncryption, StubApp.getString2(28180), string210);
        addEntries(PKCSObjectIdentifiers.sha512_256WithRSAEncryption, StubApp.getString2(28181), string210);
        addEntries(aSN1ObjectIdentifier9, string26, string210);
        addEntries(aSN1ObjectIdentifier10, string27, string210);
        addEntries(aSN1ObjectIdentifier11, string28, string210);
        addEntries(aSN1ObjectIdentifier12, string29, string210);
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128;
        String string215 = StubApp.getString2(28182);
        String string216 = StubApp.getString2(28183);
        addEntries(aSN1ObjectIdentifier17, string216, string215);
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256;
        String string217 = StubApp.getString2(28182);
        String string218 = StubApp.getString2(28184);
        addEntries(aSN1ObjectIdentifier18, string218, string217);
        addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128, StubApp.getString2(28185), string210);
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160;
        String string219 = StubApp.getString2(21747);
        addEntries(aSN1ObjectIdentifier19, string219, string210);
        addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256, StubApp.getString2(28186), string210);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA1, string212, string211);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA224, string2, string211);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA256, string23, string211);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA384, string24, string211);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA512, string25, string211);
        addEntries(CMSObjectIdentifiers.id_ecdsa_with_shake128, string216, string211);
        addEntries(CMSObjectIdentifiers.id_ecdsa_with_shake256, string218, string211);
        addEntries(X9ObjectIdentifiers.id_dsa_with_sha1, string212, string22);
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, string212, string211);
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, string2, string211);
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, string23, string211);
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, string24, string211);
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, string25, string211);
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, string212, string210);
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, string23, string210);
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1;
        String string220 = StubApp.getString2(28164);
        addEntries(aSN1ObjectIdentifier20, string212, string220);
        addEntries(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256, string23, string220);
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = BSIObjectIdentifiers.ecdsa_plain_SHA1;
        String string221 = StubApp.getString2(28187);
        addEntries(aSN1ObjectIdentifier21, string212, string221);
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA224, string2, string221);
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA256, string23, string221);
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA384, string24, string221);
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA512, string25, string221);
        addEntries(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, string219, string221);
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_224, string26, string221);
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_256, string27, string221);
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_384, string28, string221);
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_512, string29, string221);
        addEntries(GMObjectIdentifiers.sm2sign_with_sha256, string23, StubApp.getString2(28188));
        addEntries(GMObjectIdentifiers.sm2sign_with_sm3, StubApp.getString2(28189), StubApp.getString2(28188));
        addEntries(BCObjectIdentifiers.sphincs256_with_SHA512, string25, StubApp.getString2(28190));
        addEntries(BCObjectIdentifiers.sphincs256_with_SHA3_512, string29, StubApp.getString2(28190));
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = BCObjectIdentifiers.picnic_with_shake256;
        String string222 = StubApp.getString2(28191);
        addEntries(aSN1ObjectIdentifier22, string218, string222);
        addEntries(BCObjectIdentifiers.picnic_with_sha512, string25, string222);
        addEntries(BCObjectIdentifiers.picnic_with_sha3_512, string29, string222);
        hashMap.put(X9ObjectIdentifiers.id_dsa, string22);
        hashMap.put(PKCSObjectIdentifiers.rsaEncryption, string210);
        hashMap.put(TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm, string210);
        hashMap.put(X509ObjectIdentifiers.id_ea_rsa, string210);
        hashMap.put(PKCSObjectIdentifiers.id_RSASSA_PSS, string220);
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = CryptoProObjectIdentifiers.gostR3410_94;
        String string223 = StubApp.getString2(28165);
        hashMap.put(aSN1ObjectIdentifier23, string223);
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = CryptoProObjectIdentifiers.gostR3410_2001;
        String string224 = StubApp.getString2(28166);
        hashMap.put(aSN1ObjectIdentifier24, string224);
        hashMap.put(new ASN1ObjectIdentifier(StubApp.getString2(28167)), string224);
        hashMap.put(new ASN1ObjectIdentifier(StubApp.getString2(28168)), string223);
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, StubApp.getString2(28169));
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, StubApp.getString2(28170));
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, string224);
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, string223);
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, StubApp.getString2(28169));
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, StubApp.getString2(28170));
        hashMap2.put(PKCSObjectIdentifiers.md2, StubApp.getString2(28179));
        hashMap2.put(PKCSObjectIdentifiers.md4, string213);
        hashMap2.put(PKCSObjectIdentifiers.md5, string214);
        hashMap2.put(OIWObjectIdentifiers.idSHA1, string212);
        hashMap2.put(NISTObjectIdentifiers.id_sha224, string2);
        hashMap2.put(NISTObjectIdentifiers.id_sha256, string23);
        hashMap2.put(NISTObjectIdentifiers.id_sha384, string24);
        hashMap2.put(NISTObjectIdentifiers.id_sha512, string25);
        hashMap2.put(NISTObjectIdentifiers.id_sha512_224, StubApp.getString2(28180));
        hashMap2.put(NISTObjectIdentifiers.id_sha512_256, StubApp.getString2(28181));
        hashMap2.put(NISTObjectIdentifiers.id_shake128, string216);
        hashMap2.put(NISTObjectIdentifiers.id_shake256, string218);
        hashMap2.put(NISTObjectIdentifiers.id_sha3_224, string26);
        hashMap2.put(NISTObjectIdentifiers.id_sha3_256, string27);
        hashMap2.put(NISTObjectIdentifiers.id_sha3_384, string28);
        hashMap2.put(NISTObjectIdentifiers.id_sha3_512, string29);
        hashMap2.put(TeleTrusTObjectIdentifiers.ripemd128, StubApp.getString2(28185));
        hashMap2.put(TeleTrusTObjectIdentifiers.ripemd160, string219);
        hashMap2.put(TeleTrusTObjectIdentifiers.ripemd256, StubApp.getString2(28186));
        hashMap2.put(CryptoProObjectIdentifiers.gostR3411, StubApp.getString2(28192));
        hashMap2.put(new ASN1ObjectIdentifier(StubApp.getString2(28193)), StubApp.getString2(28192));
        hashMap2.put(RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256, StubApp.getString2(28194));
        hashMap2.put(RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512, StubApp.getString2(28195));
        hashMap2.put(GMObjectIdentifiers.sm3, StubApp.getString2(28189));
    }

    private void addEntries(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, String str2) {
        this.digestAlgs.put(aSN1ObjectIdentifier, str);
        this.encryptionAlgs.put(aSN1ObjectIdentifier, str2);
    }

    private String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) this.digestAlgs.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    private String getEncryptionAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) this.encryptionAlgs.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    @Override // org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator
    public String getSignatureName(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier2.getAlgorithm();
        if (EdECObjectIdentifiers.id_Ed25519.equals((ASN1Primitive) algorithm)) {
            return StubApp.getString2(28196);
        }
        if (EdECObjectIdentifiers.id_Ed448.equals((ASN1Primitive) algorithm)) {
            return StubApp.getString2(28197);
        }
        if (PKCSObjectIdentifiers.id_alg_hss_lms_hashsig.equals((ASN1Primitive) algorithm)) {
            return StubApp.getString2(28198);
        }
        if (algorithm.on(BCObjectIdentifiers.sphincsPlus)) {
            return StubApp.getString2(28199);
        }
        if (MiscObjectIdentifiers.id_alg_composite.equals((ASN1Primitive) algorithm)) {
            return StubApp.getString2(28200);
        }
        if (BCObjectIdentifiers.falcon_512.equals((ASN1Primitive) algorithm)) {
            return StubApp.getString2(28201);
        }
        if (BCObjectIdentifiers.falcon_1024.equals((ASN1Primitive) algorithm)) {
            return StubApp.getString2(28202);
        }
        if (BCObjectIdentifiers.picnic_signature.equals((ASN1Primitive) algorithm)) {
            return StubApp.getString2(28191);
        }
        String digestAlgName = getDigestAlgName(algorithm);
        boolean equals = digestAlgName.equals(algorithm.getId());
        String string2 = StubApp.getString2(28203);
        if (!equals) {
            StringBuilder n10 = AbstractC1482f.n(digestAlgName, string2);
            n10.append(getEncryptionAlgName(algorithm));
            return n10.toString();
        }
        return getDigestAlgName(algorithmIdentifier.getAlgorithm()) + string2 + getEncryptionAlgName(algorithm);
    }

    public void setSigningDigestAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.digestAlgs.put(aSN1ObjectIdentifier, str);
    }

    public void setSigningEncryptionAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.encryptionAlgs.put(aSN1ObjectIdentifier, str);
    }
}
