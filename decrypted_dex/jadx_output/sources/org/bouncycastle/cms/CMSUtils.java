package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BEROctetStringGenerator;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.OtherRevocationInfoFormat;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.Streams;
import org.bouncycastle.util.io.TeeInputStream;
import org.bouncycastle.util.io.TeeOutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CMSUtils {
    private static final Set<String> des;
    private static final Set ecAlgs;
    private static final Set gostAlgs;
    private static final Set mqvAlgs;

    static {
        HashSet hashSet = new HashSet();
        des = hashSet;
        HashSet hashSet2 = new HashSet();
        mqvAlgs = hashSet2;
        HashSet hashSet3 = new HashSet();
        ecAlgs = hashSet3;
        HashSet hashSet4 = new HashSet();
        gostAlgs = hashSet4;
        hashSet.add(StubApp.getString2(28171));
        hashSet.add(StubApp.getString2(28051));
        hashSet.add(OIWObjectIdentifiers.desCBC.getId());
        hashSet.add(PKCSObjectIdentifiers.des_EDE3_CBC.getId());
        hashSet.add(PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId());
        hashSet2.add(X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.mqvSinglePass_sha224kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.mqvSinglePass_sha256kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.mqvSinglePass_sha384kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.mqvSinglePass_sha512kdf_scheme);
        hashSet3.add(X9ObjectIdentifiers.dhSinglePass_cofactorDH_sha1kdf_scheme);
        hashSet3.add(X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
        hashSet3.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha224kdf_scheme);
        hashSet3.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha224kdf_scheme);
        hashSet3.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha256kdf_scheme);
        hashSet3.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha256kdf_scheme);
        hashSet3.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha384kdf_scheme);
        hashSet3.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha384kdf_scheme);
        hashSet3.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha512kdf_scheme);
        hashSet3.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha512kdf_scheme);
        hashSet4.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
        hashSet4.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
        hashSet4.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
    }

    public static void addDigestAlgs(Set<AlgorithmIdentifier> set, SignerInformation signerInformation, DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        set.add(CMSSignedHelper.INSTANCE.fixDigestAlgID(signerInformation.getDigestAlgorithmID(), digestAlgorithmIdentifierFinder));
        Iterator<SignerInformation> it = signerInformation.getCounterSignatures().iterator();
        while (it.hasNext()) {
            set.add(CMSSignedHelper.INSTANCE.fixDigestAlgID(it.next().getDigestAlgorithmID(), digestAlgorithmIdentifierFinder));
        }
    }

    public static InputStream attachDigestsToInputStream(Collection collection, InputStream inputStream) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            inputStream = new TeeInputStream(inputStream, ((DigestCalculator) it.next()).getOutputStream());
        }
        return inputStream;
    }

    public static OutputStream attachSignersToOutputStream(Collection collection, OutputStream outputStream) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            outputStream = getSafeTeeOutputStream(outputStream, ((SignerInfoGenerator) it.next()).getCalculatingOutputStream());
        }
        return outputStream;
    }

    public static ASN1Set convertToDlSet(Set<AlgorithmIdentifier> set) {
        return new DLSet((AlgorithmIdentifier[]) set.toArray(new AlgorithmIdentifier[set.size()]));
    }

    public static OutputStream createBEROctetOutputStream(OutputStream outputStream, int i3, boolean z2, int i10) throws IOException {
        BEROctetStringGenerator bEROctetStringGenerator = new BEROctetStringGenerator(outputStream, i3, z2);
        return i10 != 0 ? bEROctetStringGenerator.getOctetOutputStream(new byte[i10]) : bEROctetStringGenerator.getOctetOutputStream();
    }

    public static ASN1Set createBerSetFromList(List list) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add((ASN1Encodable) it.next());
        }
        return new BERSet(aSN1EncodableVector);
    }

    public static ASN1Set createDerSetFromList(List list) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add((ASN1Encodable) it.next());
        }
        return new DERSet(aSN1EncodableVector);
    }

    public static ASN1Set createDlSetFromList(List list) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add((ASN1Encodable) it.next());
        }
        return new DLSet(aSN1EncodableVector);
    }

    public static List getAttributeCertificatesFromStore(Store store) throws CMSException {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = store.getMatches(null).iterator();
            while (it.hasNext()) {
                arrayList.add(new DERTaggedObject(false, 2, (ASN1Encodable) ((X509AttributeCertificateHolder) it.next()).toASN1Structure()));
            }
            return arrayList;
        } catch (ClassCastException e10) {
            throw new CMSException(StubApp.getString2(28172), e10);
        }
    }

    public static List getCRLsFromStore(Store store) throws CMSException {
        ArrayList arrayList = new ArrayList();
        try {
            for (Object obj : store.getMatches(null)) {
                if (obj instanceof X509CRLHolder) {
                    obj = ((X509CRLHolder) obj).toASN1Structure();
                } else if (obj instanceof OtherRevocationInfoFormat) {
                    OtherRevocationInfoFormat otherRevocationInfoFormat = OtherRevocationInfoFormat.getInstance(obj);
                    validateInfoFormat(otherRevocationInfoFormat);
                    arrayList.add(new DERTaggedObject(false, 1, (ASN1Encodable) otherRevocationInfoFormat));
                } else if (obj instanceof ASN1TaggedObject) {
                }
                arrayList.add(obj);
            }
            return arrayList;
        } catch (ClassCastException e10) {
            throw new CMSException(StubApp.getString2(28172), e10);
        }
    }

    public static List getCertificatesFromStore(Store store) throws CMSException {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = store.getMatches(null).iterator();
            while (it.hasNext()) {
                arrayList.add(((X509CertificateHolder) it.next()).toASN1Structure());
            }
            return arrayList;
        } catch (ClassCastException e10) {
            throw new CMSException(StubApp.getString2(28172), e10);
        }
    }

    public static Collection getOthersFromStore(ASN1ObjectIdentifier aSN1ObjectIdentifier, Store store) {
        ArrayList arrayList = new ArrayList();
        Iterator it = store.getMatches(null).iterator();
        while (it.hasNext()) {
            OtherRevocationInfoFormat otherRevocationInfoFormat = new OtherRevocationInfoFormat(aSN1ObjectIdentifier, (ASN1Encodable) it.next());
            validateInfoFormat(otherRevocationInfoFormat);
            arrayList.add(new DERTaggedObject(false, 1, (ASN1Encodable) otherRevocationInfoFormat));
        }
        return arrayList;
    }

    public static OutputStream getSafeOutputStream(OutputStream outputStream) {
        return outputStream == null ? new NullOutputStream() : outputStream;
    }

    public static OutputStream getSafeTeeOutputStream(OutputStream outputStream, OutputStream outputStream2) {
        return outputStream == null ? getSafeOutputStream(outputStream2) : outputStream2 == null ? getSafeOutputStream(outputStream) : new TeeOutputStream(outputStream, outputStream2);
    }

    public static boolean isDES(String str) {
        return des.contains(Strings.toUpperCase(str));
    }

    public static boolean isEC(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ecAlgs.contains(aSN1ObjectIdentifier);
    }

    public static boolean isEquivalent(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        if (algorithmIdentifier == null || algorithmIdentifier2 == null || !algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) algorithmIdentifier2.getAlgorithm())) {
            return false;
        }
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        ASN1Encodable parameters2 = algorithmIdentifier2.getParameters();
        return parameters != null ? parameters.equals(parameters2) || (parameters.equals(DERNull.INSTANCE) && parameters2 == null) : parameters2 == null || parameters2.equals(DERNull.INSTANCE);
    }

    public static boolean isGOST(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return gostAlgs.contains(aSN1ObjectIdentifier);
    }

    public static boolean isMQV(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return mqvAlgs.contains(aSN1ObjectIdentifier);
    }

    public static boolean isRFC2631(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.id_alg_ESDH) || aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.id_alg_SSDH);
    }

    public static ContentInfo readContentInfo(InputStream inputStream) throws CMSException {
        return readContentInfo(new ASN1InputStream(inputStream));
    }

    public static byte[] streamToByteArray(InputStream inputStream) throws IOException {
        return Streams.readAll(inputStream);
    }

    private static void validateInfoFormat(OtherRevocationInfoFormat otherRevocationInfoFormat) {
        if (CMSObjectIdentifiers.id_ri_ocsp_response.equals((ASN1Primitive) otherRevocationInfoFormat.getInfoFormat()) && OCSPResponse.getInstance(otherRevocationInfoFormat.getInfo()).getResponseStatus().getIntValue() != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28173));
        }
    }

    private static ContentInfo readContentInfo(ASN1InputStream aSN1InputStream) throws CMSException {
        String string2 = StubApp.getString2(28144);
        try {
            ContentInfo contentInfo = ContentInfo.getInstance(aSN1InputStream.readObject());
            if (contentInfo != null) {
                return contentInfo;
            }
            throw new CMSException(StubApp.getString2("28149"));
        } catch (IOException e10) {
            throw new CMSException(StubApp.getString2(28151), e10);
        } catch (ClassCastException e11) {
            throw new CMSException(string2, e11);
        } catch (IllegalArgumentException e12) {
            throw new CMSException(string2, e12);
        }
    }

    public static byte[] streamToByteArray(InputStream inputStream, int i3) throws IOException {
        return Streams.readAllLimited(inputStream, i3);
    }

    public static ContentInfo readContentInfo(byte[] bArr) throws CMSException {
        return readContentInfo(new ASN1InputStream(bArr));
    }
}
