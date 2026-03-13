package org.bouncycastle.operator;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DefaultAlgorithmNameFinder implements AlgorithmNameFinder {
    private static final Map algorithms;

    static {
        HashMap hashMap = new HashMap();
        algorithms = hashMap;
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, StubApp.getString2(32728));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA1, StubApp.getString2(32723));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA224, StubApp.getString2(32724));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA256, StubApp.getString2(32725));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA384, StubApp.getString2(32726));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA512, StubApp.getString2(32727));
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, StubApp.getString2(32502));
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, StubApp.getString2(33697));
        hashMap.put(CryptoProObjectIdentifiers.gostR3411, StubApp.getString2(28192));
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, StubApp.getString2(33698));
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, StubApp.getString2(33699));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, StubApp.getString2(32729));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, StubApp.getString2(32730));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, StubApp.getString2(32731));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, StubApp.getString2(32732));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, StubApp.getString2(32733));
        ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.falcon_512;
        String string2 = StubApp.getString2(33700);
        hashMap.put(aSN1ObjectIdentifier, string2);
        hashMap.put(BCObjectIdentifiers.falcon_1024, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.sphincsPlus_sha_256;
        String string22 = StubApp.getString2(33701);
        hashMap.put(aSN1ObjectIdentifier2, string22);
        hashMap.put(BCObjectIdentifiers.sphincsPlus_sha_512, string22);
        hashMap.put(BCObjectIdentifiers.sphincsPlus_shake_256, string22);
        hashMap.put(BCObjectIdentifiers.sphincsPlus_haraka, string22);
        hashMap.put(NISTObjectIdentifiers.id_sha224, StubApp.getString2(28054));
        hashMap.put(NISTObjectIdentifiers.id_sha256, StubApp.getString2(21749));
        hashMap.put(NISTObjectIdentifiers.id_sha384, StubApp.getString2(21750));
        hashMap.put(NISTObjectIdentifiers.id_sha512, StubApp.getString2(21751));
        hashMap.put(NISTObjectIdentifiers.id_sha3_224, StubApp.getString2(28174));
        hashMap.put(NISTObjectIdentifiers.id_sha3_256, StubApp.getString2(28175));
        hashMap.put(NISTObjectIdentifiers.id_sha3_384, StubApp.getString2(28176));
        hashMap.put(NISTObjectIdentifiers.id_sha3_512, StubApp.getString2(28177));
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = OIWObjectIdentifiers.dsaWithSHA1;
        String string23 = StubApp.getString2(32487);
        hashMap.put(aSN1ObjectIdentifier3, string23);
        hashMap.put(OIWObjectIdentifiers.elGamalAlgorithm, StubApp.getString2(30202));
        hashMap.put(OIWObjectIdentifiers.idSHA1, StubApp.getString2(21748));
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = OIWObjectIdentifiers.md5WithRSA;
        String string24 = StubApp.getString2(32462);
        hashMap.put(aSN1ObjectIdentifier4, string24);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = OIWObjectIdentifiers.sha1WithRSA;
        String string25 = StubApp.getString2(30425);
        hashMap.put(aSN1ObjectIdentifier5, string25);
        hashMap.put(PKCSObjectIdentifiers.id_RSAES_OAEP, StubApp.getString2(33702));
        hashMap.put(PKCSObjectIdentifiers.id_RSASSA_PSS, StubApp.getString2(28182));
        hashMap.put(PKCSObjectIdentifiers.md2WithRSAEncryption, StubApp.getString2(32459));
        hashMap.put(PKCSObjectIdentifiers.md5, StubApp.getString2(4894));
        hashMap.put(PKCSObjectIdentifiers.md5WithRSAEncryption, string24);
        hashMap.put(PKCSObjectIdentifiers.rsaEncryption, StubApp.getString2(24659));
        hashMap.put(PKCSObjectIdentifiers.sha1WithRSAEncryption, string25);
        hashMap.put(PKCSObjectIdentifiers.sha224WithRSAEncryption, StubApp.getString2(32467));
        hashMap.put(PKCSObjectIdentifiers.sha256WithRSAEncryption, StubApp.getString2(32469));
        hashMap.put(PKCSObjectIdentifiers.sha384WithRSAEncryption, StubApp.getString2(32471));
        hashMap.put(PKCSObjectIdentifiers.sha512WithRSAEncryption, StubApp.getString2(32473));
        hashMap.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224, StubApp.getString2(33703));
        hashMap.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256, StubApp.getString2(33704));
        hashMap.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384, StubApp.getString2(33705));
        hashMap.put(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, StubApp.getString2(33706));
        hashMap.put(TeleTrusTObjectIdentifiers.ripemd128, StubApp.getString2(28185));
        hashMap.put(TeleTrusTObjectIdentifiers.ripemd160, StubApp.getString2(21747));
        hashMap.put(TeleTrusTObjectIdentifiers.ripemd256, StubApp.getString2(28186));
        hashMap.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128, StubApp.getString2(32481));
        hashMap.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160, StubApp.getString2(32483));
        hashMap.put(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256, StubApp.getString2(32485));
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA1, StubApp.getString2(32498));
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA224, StubApp.getString2(32494));
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA256, StubApp.getString2(32495));
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA384, StubApp.getString2(32496));
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA512, StubApp.getString2(32497));
        hashMap.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_224, StubApp.getString2(33707));
        hashMap.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, StubApp.getString2(33708));
        hashMap.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, StubApp.getString2(33709));
        hashMap.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, StubApp.getString2(33710));
        hashMap.put(X9ObjectIdentifiers.id_dsa_with_sha1, string23);
        hashMap.put(NISTObjectIdentifiers.dsa_with_sha224, StubApp.getString2(32489));
        hashMap.put(NISTObjectIdentifiers.dsa_with_sha256, StubApp.getString2(32490));
        hashMap.put(NISTObjectIdentifiers.dsa_with_sha384, StubApp.getString2(32491));
        hashMap.put(NISTObjectIdentifiers.dsa_with_sha512, StubApp.getString2(32492));
        hashMap.put(NISTObjectIdentifiers.id_dsa_with_sha3_224, StubApp.getString2(33711));
        hashMap.put(NISTObjectIdentifiers.id_dsa_with_sha3_256, StubApp.getString2(33712));
        hashMap.put(NISTObjectIdentifiers.id_dsa_with_sha3_384, StubApp.getString2(33713));
        hashMap.put(NISTObjectIdentifiers.id_dsa_with_sha3_512, StubApp.getString2(33714));
        hashMap.put(GNUObjectIdentifiers.Tiger_192, StubApp.getString2(28523));
        hashMap.put(PKCSObjectIdentifiers.RC2_CBC, StubApp.getString2(33715));
        hashMap.put(PKCSObjectIdentifiers.des_EDE3_CBC, StubApp.getString2(33716));
        hashMap.put(NISTObjectIdentifiers.id_aes128_ECB, StubApp.getString2(33717));
        hashMap.put(NISTObjectIdentifiers.id_aes192_ECB, StubApp.getString2(33718));
        hashMap.put(NISTObjectIdentifiers.id_aes256_ECB, StubApp.getString2(33719));
        hashMap.put(NISTObjectIdentifiers.id_aes128_CBC, StubApp.getString2(33720));
        hashMap.put(NISTObjectIdentifiers.id_aes192_CBC, StubApp.getString2(33721));
        hashMap.put(NISTObjectIdentifiers.id_aes256_CBC, StubApp.getString2(33722));
        hashMap.put(NISTObjectIdentifiers.id_aes128_CFB, StubApp.getString2(33723));
        hashMap.put(NISTObjectIdentifiers.id_aes192_CFB, StubApp.getString2(33724));
        hashMap.put(NISTObjectIdentifiers.id_aes256_CFB, StubApp.getString2(33725));
        hashMap.put(NISTObjectIdentifiers.id_aes128_OFB, StubApp.getString2(33726));
        hashMap.put(NISTObjectIdentifiers.id_aes192_OFB, StubApp.getString2(33727));
        hashMap.put(NISTObjectIdentifiers.id_aes256_OFB, StubApp.getString2(33728));
        hashMap.put(NTTObjectIdentifiers.id_camellia128_cbc, StubApp.getString2(33729));
        hashMap.put(NTTObjectIdentifiers.id_camellia192_cbc, StubApp.getString2(33730));
        hashMap.put(NTTObjectIdentifiers.id_camellia256_cbc, StubApp.getString2(33731));
        hashMap.put(KISAObjectIdentifiers.id_seedCBC, StubApp.getString2(33732));
        hashMap.put(MiscObjectIdentifiers.as_sys_sec_alg_ideaCBC, StubApp.getString2(33733));
        hashMap.put(MiscObjectIdentifiers.cast5CBC, StubApp.getString2(33734));
        hashMap.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_ECB, StubApp.getString2(33735));
        hashMap.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CBC, StubApp.getString2(33736));
        hashMap.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CFB, StubApp.getString2(33737));
        hashMap.put(MiscObjectIdentifiers.cryptlib_algorithm_blowfish_OFB, StubApp.getString2(33738));
        hashMap.put(GNUObjectIdentifiers.Serpent_128_ECB, StubApp.getString2(33739));
        hashMap.put(GNUObjectIdentifiers.Serpent_128_CBC, StubApp.getString2(33740));
        hashMap.put(GNUObjectIdentifiers.Serpent_128_CFB, StubApp.getString2(33741));
        hashMap.put(GNUObjectIdentifiers.Serpent_128_OFB, StubApp.getString2(33742));
        hashMap.put(GNUObjectIdentifiers.Serpent_192_ECB, StubApp.getString2(33743));
        hashMap.put(GNUObjectIdentifiers.Serpent_192_CBC, StubApp.getString2(33744));
        hashMap.put(GNUObjectIdentifiers.Serpent_192_CFB, StubApp.getString2(33745));
        hashMap.put(GNUObjectIdentifiers.Serpent_192_OFB, StubApp.getString2(33746));
        hashMap.put(GNUObjectIdentifiers.Serpent_256_ECB, StubApp.getString2(33747));
        hashMap.put(GNUObjectIdentifiers.Serpent_256_CBC, StubApp.getString2(33748));
        hashMap.put(GNUObjectIdentifiers.Serpent_256_CFB, StubApp.getString2(33749));
        hashMap.put(GNUObjectIdentifiers.Serpent_256_OFB, StubApp.getString2(33750));
        hashMap.put(MiscObjectIdentifiers.id_blake2b160, StubApp.getString2(33751));
        hashMap.put(MiscObjectIdentifiers.id_blake2b256, StubApp.getString2(33752));
        hashMap.put(MiscObjectIdentifiers.id_blake2b384, StubApp.getString2(33753));
        hashMap.put(MiscObjectIdentifiers.id_blake2b512, StubApp.getString2(33754));
        hashMap.put(MiscObjectIdentifiers.id_blake2s128, StubApp.getString2(33755));
        hashMap.put(MiscObjectIdentifiers.id_blake2s160, StubApp.getString2(33756));
        hashMap.put(MiscObjectIdentifiers.id_blake2s224, StubApp.getString2(33757));
        hashMap.put(MiscObjectIdentifiers.id_blake2s256, StubApp.getString2(33758));
        hashMap.put(MiscObjectIdentifiers.blake3_256, StubApp.getString2(30977));
    }

    @Override // org.bouncycastle.operator.AlgorithmNameFinder
    public String getAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) algorithms.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    public Set<ASN1ObjectIdentifier> getOIDSet() {
        return algorithms.keySet();
    }

    @Override // org.bouncycastle.operator.AlgorithmNameFinder
    public boolean hasAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return algorithms.containsKey(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.operator.AlgorithmNameFinder
    public String getAlgorithmName(AlgorithmIdentifier algorithmIdentifier) {
        return getAlgorithmName(algorithmIdentifier.getAlgorithm());
    }
}
