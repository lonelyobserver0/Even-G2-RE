package org.bouncycastle.tsp;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.ExtendedKeyUsage;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.SignerInformation;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TSPUtil {
    private static List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());
    private static final Map digestLengths;
    private static final Map digestNames;

    static {
        HashMap hashMap = new HashMap();
        digestLengths = hashMap;
        HashMap hashMap2 = new HashMap();
        digestNames = hashMap2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.md5;
        hashMap.put(aSN1ObjectIdentifier.getId(), Integers.valueOf(16));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = OIWObjectIdentifiers.idSHA1;
        hashMap.put(aSN1ObjectIdentifier2.getId(), Integers.valueOf(20));
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_sha224;
        hashMap.put(aSN1ObjectIdentifier3.getId(), Integers.valueOf(28));
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_sha256;
        hashMap.put(aSN1ObjectIdentifier4.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_sha384;
        hashMap.put(aSN1ObjectIdentifier5.getId(), Integers.valueOf(48));
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_sha512;
        hashMap.put(aSN1ObjectIdentifier6.getId(), Integers.valueOf(64));
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = TeleTrusTObjectIdentifiers.ripemd128;
        hashMap.put(aSN1ObjectIdentifier7.getId(), Integers.valueOf(16));
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = TeleTrusTObjectIdentifiers.ripemd160;
        hashMap.put(aSN1ObjectIdentifier8.getId(), Integers.valueOf(20));
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = TeleTrusTObjectIdentifiers.ripemd256;
        hashMap.put(aSN1ObjectIdentifier9.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = CryptoProObjectIdentifiers.gostR3411;
        hashMap.put(aSN1ObjectIdentifier10.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256;
        hashMap.put(aSN1ObjectIdentifier11.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512;
        hashMap.put(aSN1ObjectIdentifier12.getId(), Integers.valueOf(64));
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = GMObjectIdentifiers.sm3;
        hashMap.put(aSN1ObjectIdentifier13.getId(), Integers.valueOf(32));
        hashMap2.put(aSN1ObjectIdentifier.getId(), StubApp.getString2(4894));
        String id = aSN1ObjectIdentifier2.getId();
        String string2 = StubApp.getString2(21748);
        hashMap2.put(id, string2);
        String id2 = aSN1ObjectIdentifier3.getId();
        String string22 = StubApp.getString2(28054);
        hashMap2.put(id2, string22);
        String id3 = aSN1ObjectIdentifier4.getId();
        String string23 = StubApp.getString2(21749);
        hashMap2.put(id3, string23);
        String id4 = aSN1ObjectIdentifier5.getId();
        String string24 = StubApp.getString2(21750);
        hashMap2.put(id4, string24);
        String id5 = aSN1ObjectIdentifier6.getId();
        String string25 = StubApp.getString2(21751);
        hashMap2.put(id5, string25);
        hashMap2.put(PKCSObjectIdentifiers.sha1WithRSAEncryption.getId(), string2);
        hashMap2.put(PKCSObjectIdentifiers.sha224WithRSAEncryption.getId(), string22);
        hashMap2.put(PKCSObjectIdentifiers.sha256WithRSAEncryption.getId(), string23);
        hashMap2.put(PKCSObjectIdentifiers.sha384WithRSAEncryption.getId(), string24);
        hashMap2.put(PKCSObjectIdentifiers.sha512WithRSAEncryption.getId(), string25);
        hashMap2.put(aSN1ObjectIdentifier7.getId(), StubApp.getString2(28185));
        hashMap2.put(aSN1ObjectIdentifier8.getId(), StubApp.getString2(21747));
        hashMap2.put(aSN1ObjectIdentifier9.getId(), StubApp.getString2(28186));
        hashMap2.put(aSN1ObjectIdentifier10.getId(), StubApp.getString2(28192));
        hashMap2.put(aSN1ObjectIdentifier11.getId(), StubApp.getString2(28194));
        hashMap2.put(aSN1ObjectIdentifier12.getId(), StubApp.getString2(28195));
        hashMap2.put(aSN1ObjectIdentifier13.getId(), StubApp.getString2(28189));
    }

    public static void addExtension(ExtensionsGenerator extensionsGenerator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1Encodable aSN1Encodable) throws TSPIOException {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z2, aSN1Encodable);
        } catch (IOException e10) {
            throw new TSPIOException(u.q(e10, new StringBuilder(StubApp.getString2(28004))), e10);
        }
    }

    public static int getDigestLength(String str) throws TSPException {
        Integer num = (Integer) digestLengths.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new TSPException(StubApp.getString2(34888));
    }

    public static List getExtensionOIDs(Extensions extensions) {
        return extensions == null ? EMPTY_LIST : Collections.unmodifiableList(Arrays.asList(extensions.getExtensionOIDs()));
    }

    public static Collection getSignatureTimestamps(SignerInformation signerInformation, DigestCalculatorProvider digestCalculatorProvider) throws TSPValidationException {
        ArrayList arrayList = new ArrayList();
        AttributeTable unsignedAttributes = signerInformation.getUnsignedAttributes();
        if (unsignedAttributes != null) {
            ASN1EncodableVector all = unsignedAttributes.getAll(PKCSObjectIdentifiers.id_aa_signatureTimeStampToken);
            for (int i3 = 0; i3 < all.size(); i3++) {
                ASN1Set attrValues = ((Attribute) all.get(i3)).getAttrValues();
                for (int i10 = 0; i10 < attrValues.size(); i10++) {
                    try {
                        TimeStampToken timeStampToken = new TimeStampToken(ContentInfo.getInstance(attrValues.getObjectAt(i10)));
                        TimeStampTokenInfo timeStampInfo = timeStampToken.getTimeStampInfo();
                        DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampInfo.getHashAlgorithm());
                        OutputStream outputStream = digestCalculator.getOutputStream();
                        outputStream.write(signerInformation.getSignature());
                        outputStream.close();
                        if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(digestCalculator.getDigest(), timeStampInfo.getMessageImprintDigest())) {
                            throw new TSPValidationException(StubApp.getString2("34889"));
                        }
                        arrayList.add(timeStampToken);
                    } catch (OperatorCreationException unused) {
                        throw new TSPValidationException(StubApp.getString2(34891));
                    } catch (Exception unused2) {
                        throw new TSPValidationException(StubApp.getString2(34890));
                    }
                }
            }
        }
        return arrayList;
    }

    public static void validateCertificate(X509CertificateHolder x509CertificateHolder) throws TSPValidationException {
        int versionNumber = x509CertificateHolder.toASN1Structure().getVersionNumber();
        String string2 = StubApp.getString2(34892);
        if (versionNumber != 3) {
            throw new IllegalArgumentException(string2);
        }
        Extension extension = x509CertificateHolder.getExtension(Extension.extendedKeyUsage);
        if (extension == null) {
            throw new TSPValidationException(string2);
        }
        if (!extension.isCritical()) {
            throw new TSPValidationException(StubApp.getString2(34894));
        }
        ExtendedKeyUsage extendedKeyUsage = ExtendedKeyUsage.getInstance(extension.getParsedValue());
        if (!extendedKeyUsage.hasKeyPurposeId(KeyPurposeId.id_kp_timeStamping) || extendedKeyUsage.size() != 1) {
            throw new TSPValidationException(StubApp.getString2(34893));
        }
    }
}
