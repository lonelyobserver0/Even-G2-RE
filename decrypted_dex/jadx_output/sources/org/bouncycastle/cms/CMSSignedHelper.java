package org.bouncycastle.cms;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cms.OtherRevocationInfoFormat;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Store;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CMSSignedHelper {
    static final CMSSignedHelper INSTANCE = new CMSSignedHelper();
    private static final Map encryptionAlgs = new HashMap();

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.dsa_with_sha224;
        String string2 = StubApp.getString2(28060);
        addEntries(aSN1ObjectIdentifier, string2);
        addEntries(NISTObjectIdentifiers.dsa_with_sha256, string2);
        addEntries(NISTObjectIdentifiers.dsa_with_sha384, string2);
        addEntries(NISTObjectIdentifiers.dsa_with_sha512, string2);
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_224, string2);
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_256, string2);
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_384, string2);
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_512, string2);
        addEntries(OIWObjectIdentifiers.dsaWithSHA1, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = OIWObjectIdentifiers.md4WithRSA;
        String string22 = StubApp.getString2(24659);
        addEntries(aSN1ObjectIdentifier2, string22);
        addEntries(OIWObjectIdentifiers.md4WithRSAEncryption, string22);
        addEntries(OIWObjectIdentifiers.md5WithRSA, string22);
        addEntries(OIWObjectIdentifiers.sha1WithRSA, string22);
        addEntries(PKCSObjectIdentifiers.md2WithRSAEncryption, string22);
        addEntries(PKCSObjectIdentifiers.md4WithRSAEncryption, string22);
        addEntries(PKCSObjectIdentifiers.md5WithRSAEncryption, string22);
        addEntries(PKCSObjectIdentifiers.sha1WithRSAEncryption, string22);
        addEntries(PKCSObjectIdentifiers.sha224WithRSAEncryption, string22);
        addEntries(PKCSObjectIdentifiers.sha256WithRSAEncryption, string22);
        addEntries(PKCSObjectIdentifiers.sha384WithRSAEncryption, string22);
        addEntries(PKCSObjectIdentifiers.sha512WithRSAEncryption, string22);
        addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224, string22);
        addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256, string22);
        addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384, string22);
        addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X9ObjectIdentifiers.ecdsa_with_SHA1;
        String string23 = StubApp.getString2(28163);
        addEntries(aSN1ObjectIdentifier3, string23);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA224, string23);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA256, string23);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA384, string23);
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA512, string23);
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_224, string23);
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, string23);
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, string23);
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, string23);
        addEntries(X9ObjectIdentifiers.id_dsa_with_sha1, string2);
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, string23);
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, string23);
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, string23);
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, string23);
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, string23);
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, string22);
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1;
        String string24 = StubApp.getString2(28164);
        addEntries(aSN1ObjectIdentifier4, string24);
        addEntries(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256, string24);
        addEntries(X9ObjectIdentifiers.id_dsa, string2);
        addEntries(PKCSObjectIdentifiers.rsaEncryption, string22);
        addEntries(TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm, string22);
        addEntries(X509ObjectIdentifiers.id_ea_rsa, string22);
        addEntries(PKCSObjectIdentifiers.id_RSASSA_PSS, string24);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = CryptoProObjectIdentifiers.gostR3410_94;
        String string25 = StubApp.getString2(28165);
        addEntries(aSN1ObjectIdentifier5, string25);
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = CryptoProObjectIdentifiers.gostR3410_2001;
        String string26 = StubApp.getString2(28166);
        addEntries(aSN1ObjectIdentifier6, string26);
        addEntries(new ASN1ObjectIdentifier(StubApp.getString2(28167)), string26);
        addEntries(new ASN1ObjectIdentifier(StubApp.getString2(28168)), string25);
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256;
        String string27 = StubApp.getString2(28169);
        addEntries(aSN1ObjectIdentifier7, string27);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512;
        String string28 = StubApp.getString2(28170);
        addEntries(aSN1ObjectIdentifier8, string28);
        addEntries(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, string26);
        addEntries(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, string25);
        addEntries(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, string27);
        addEntries(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, string28);
    }

    private static void addEntries(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        encryptionAlgs.put(aSN1ObjectIdentifier.getId(), str);
    }

    public AlgorithmIdentifier fixDigestAlgID(AlgorithmIdentifier algorithmIdentifier, DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        return (parameters == null || DERNull.INSTANCE.equals(parameters)) ? digestAlgorithmIdentifierFinder.find(algorithmIdentifier.getAlgorithm()) : algorithmIdentifier;
    }

    public Store getAttributeCertificates(ASN1Set aSN1Set) {
        if (aSN1Set == null) {
            return new CollectionStore(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(aSN1Set.size());
        Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
                if (aSN1TaggedObject.getTagNo() == 1 || aSN1TaggedObject.getTagNo() == 2) {
                    arrayList.add(new X509AttributeCertificateHolder(AttributeCertificate.getInstance(aSN1TaggedObject.getObject())));
                }
            }
        }
        return new CollectionStore(arrayList);
    }

    public Store getCRLs(ASN1Set aSN1Set) {
        if (aSN1Set == null) {
            return new CollectionStore(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(aSN1Set.size());
        Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Sequence) {
                arrayList.add(new X509CRLHolder(CertificateList.getInstance(aSN1Primitive)));
            }
        }
        return new CollectionStore(arrayList);
    }

    public Store getCertificates(ASN1Set aSN1Set) {
        if (aSN1Set == null) {
            return new CollectionStore(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(aSN1Set.size());
        Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Sequence) {
                arrayList.add(new X509CertificateHolder(Certificate.getInstance(aSN1Primitive)));
            }
        }
        return new CollectionStore(arrayList);
    }

    public String getEncryptionAlgName(String str) {
        String str2 = (String) encryptionAlgs.get(str);
        return str2 != null ? str2 : str;
    }

    public Store getOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Set aSN1Set) {
        if (aSN1Set == null) {
            return new CollectionStore(new ArrayList());
        }
        ArrayList arrayList = new ArrayList(aSN1Set.size());
        Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Primitive);
                if (aSN1TaggedObject.getTagNo() == 1) {
                    OtherRevocationInfoFormat otherRevocationInfoFormat = OtherRevocationInfoFormat.getInstance(aSN1TaggedObject, false);
                    if (aSN1ObjectIdentifier.equals((ASN1Primitive) otherRevocationInfoFormat.getInfoFormat())) {
                        arrayList.add(otherRevocationInfoFormat.getInfo());
                    }
                }
            }
        }
        return new CollectionStore(arrayList);
    }

    public void setSigningEncryptionAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        addEntries(aSN1ObjectIdentifier, str);
    }
}
