package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertPathValidatorException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.CertID;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.ResponderID;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x500.style.BCStrictStyle;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ProvOcspRevocationChecker implements PKIXCertRevocationChecker {
    private static final int DEFAULT_OCSP_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_OCSP_TIMEOUT = 15000;
    private static final Map oids;
    private final JcaJceHelper helper;
    private boolean isEnabledOCSP;
    private String ocspURL;
    private PKIXCertRevocationCheckerParameters parameters;
    private final ProvRevocationChecker parent;

    static {
        HashMap hashMap = new HashMap();
        oids = hashMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(StubApp.getString2(32464));
        String string2 = StubApp.getString2(30425);
        hashMap.put(aSN1ObjectIdentifier, string2);
        hashMap.put(PKCSObjectIdentifiers.sha224WithRSAEncryption, StubApp.getString2(32467));
        hashMap.put(PKCSObjectIdentifiers.sha256WithRSAEncryption, StubApp.getString2(32469));
        hashMap.put(PKCSObjectIdentifiers.sha384WithRSAEncryption, StubApp.getString2(32471));
        hashMap.put(PKCSObjectIdentifiers.sha512WithRSAEncryption, StubApp.getString2(32473));
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, StubApp.getString2(32499));
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, StubApp.getString2(32501));
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, StubApp.getString2(32721));
        hashMap.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, StubApp.getString2(32722));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA1, StubApp.getString2(32723));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA224, StubApp.getString2(32724));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA256, StubApp.getString2(32725));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA384, StubApp.getString2(32726));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA512, StubApp.getString2(32727));
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, StubApp.getString2(32728));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, StubApp.getString2(32729));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, StubApp.getString2(32730));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, StubApp.getString2(32731));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, StubApp.getString2(32732));
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, StubApp.getString2(32733));
        hashMap.put(IsaraObjectIdentifiers.id_alg_xmss, StubApp.getString2(32734));
        hashMap.put(IsaraObjectIdentifiers.id_alg_xmssmt, StubApp.getString2(32735));
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
        hashMap.put(OIWObjectIdentifiers.sha1WithRSA, string2);
        hashMap.put(OIWObjectIdentifiers.dsaWithSHA1, string22);
        hashMap.put(NISTObjectIdentifiers.dsa_with_sha224, StubApp.getString2(32489));
        hashMap.put(NISTObjectIdentifiers.dsa_with_sha256, StubApp.getString2(32490));
    }

    public ProvOcspRevocationChecker(ProvRevocationChecker provRevocationChecker, JcaJceHelper jcaJceHelper) {
        this.parent = provRevocationChecker;
        this.helper = jcaJceHelper;
    }

    private static byte[] calcKeyHash(MessageDigest messageDigest, PublicKey publicKey) {
        return messageDigest.digest(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getPublicKeyData().getBytes());
    }

    private CertID createCertID(CertID certID, Certificate certificate, ASN1Integer aSN1Integer) throws CertPathValidatorException {
        return createCertID(certID.getHashAlgorithm(), certificate, aSN1Integer);
    }

    private Certificate extractCert() throws CertPathValidatorException {
        try {
            return Certificate.getInstance(this.parameters.getSigningCert().getEncoded());
        } catch (Exception e10) {
            throw new CertPathValidatorException(u.r(e10, new StringBuilder(StubApp.getString2(32736))), e10, this.parameters.getCertPath(), this.parameters.getIndex());
        }
    }

    private static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String digestName = MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int indexOf = digestName.indexOf(45);
        if (indexOf <= 0 || digestName.startsWith(StubApp.getString2(29255))) {
            return digestName;
        }
        return digestName.substring(0, indexOf) + digestName.substring(indexOf + 1);
    }

    public static URI getOcspResponderURI(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityInfoAccess.getId());
        if (extensionValue == null) {
            return null;
        }
        AccessDescription[] accessDescriptions = AuthorityInformationAccess.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getAccessDescriptions();
        for (int i3 = 0; i3 != accessDescriptions.length; i3++) {
            AccessDescription accessDescription = accessDescriptions[i3];
            if (AccessDescription.id_ad_ocsp.equals((ASN1Primitive) accessDescription.getAccessMethod())) {
                GeneralName accessLocation = accessDescription.getAccessLocation();
                if (accessLocation.getTagNo() == 6) {
                    try {
                        return new URI(((ASN1String) accessLocation.getName()).getString());
                    } catch (URISyntaxException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null && !DERNull.INSTANCE.equals(parameters) && algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            return AbstractC1482f.k(new StringBuilder(), getDigestName(RSASSAPSSparams.getInstance(parameters).getHashAlgorithm().getAlgorithm()), StubApp.getString2(32737));
        }
        Map map = oids;
        boolean containsKey = map.containsKey(algorithmIdentifier.getAlgorithm());
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        return containsKey ? (String) map.get(algorithm) : algorithm.getId();
    }

    private static X509Certificate getSignerCert(BasicOCSPResponse basicOCSPResponse, X509Certificate x509Certificate, X509Certificate x509Certificate2, JcaJceHelper jcaJceHelper) throws NoSuchProviderException, NoSuchAlgorithmException {
        ResponderID responderID = basicOCSPResponse.getTbsResponseData().getResponderID();
        byte[] keyHash = responderID.getKeyHash();
        if (keyHash != null) {
            MessageDigest createMessageDigest = jcaJceHelper.createMessageDigest(StubApp.getString2(21748));
            if (x509Certificate2 != null && Arrays.areEqual(keyHash, calcKeyHash(createMessageDigest, x509Certificate2.getPublicKey()))) {
                return x509Certificate2;
            }
            if (x509Certificate == null || !Arrays.areEqual(keyHash, calcKeyHash(createMessageDigest, x509Certificate.getPublicKey()))) {
                return null;
            }
            return x509Certificate;
        }
        X500NameStyle x500NameStyle = BCStrictStyle.INSTANCE;
        X500Name x500Name = X500Name.getInstance(x500NameStyle, responderID.getName());
        if (x509Certificate2 != null && x500Name.equals(X500Name.getInstance(x500NameStyle, x509Certificate2.getSubjectX500Principal().getEncoded()))) {
            return x509Certificate2;
        }
        if (x509Certificate == null || !x500Name.equals(X500Name.getInstance(x500NameStyle, x509Certificate.getSubjectX500Principal().getEncoded()))) {
            return null;
        }
        return x509Certificate;
    }

    private static boolean responderMatches(ResponderID responderID, X509Certificate x509Certificate, JcaJceHelper jcaJceHelper) throws NoSuchProviderException, NoSuchAlgorithmException {
        byte[] keyHash = responderID.getKeyHash();
        if (keyHash != null) {
            return Arrays.areEqual(keyHash, calcKeyHash(jcaJceHelper.createMessageDigest(StubApp.getString2(21748)), x509Certificate.getPublicKey()));
        }
        X500NameStyle x500NameStyle = BCStrictStyle.INSTANCE;
        return X500Name.getInstance(x500NameStyle, responderID.getName()).equals(X500Name.getInstance(x500NameStyle, x509Certificate.getSubjectX500Principal().getEncoded()));
    }

    public static boolean validatedOcspResponse(BasicOCSPResponse basicOCSPResponse, PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, byte[] bArr, X509Certificate x509Certificate, JcaJceHelper jcaJceHelper) throws CertPathValidatorException {
        String string2 = StubApp.getString2(32738);
        try {
            ASN1Sequence certs = basicOCSPResponse.getCerts();
            Signature createSignature = jcaJceHelper.createSignature(getSignatureName(basicOCSPResponse.getSignatureAlgorithm()));
            X509Certificate signerCert = getSignerCert(basicOCSPResponse, pKIXCertRevocationCheckerParameters.getSigningCert(), x509Certificate, jcaJceHelper);
            if (signerCert == null && certs == null) {
                throw new CertPathValidatorException(StubApp.getString2("32739"));
            }
            if (signerCert != null) {
                createSignature.initVerify(signerCert.getPublicKey());
            } else {
                X509Certificate x509Certificate2 = (X509Certificate) jcaJceHelper.createCertificateFactory(StubApp.getString2("19963")).generateCertificate(new ByteArrayInputStream(certs.getObjectAt(0).toASN1Primitive().getEncoded()));
                x509Certificate2.verify(pKIXCertRevocationCheckerParameters.getSigningCert().getPublicKey());
                x509Certificate2.checkValidity(pKIXCertRevocationCheckerParameters.getValidDate());
                if (!responderMatches(basicOCSPResponse.getTbsResponseData().getResponderID(), x509Certificate2, jcaJceHelper)) {
                    throw new CertPathValidatorException(StubApp.getString2("32742"), null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
                }
                List<String> extendedKeyUsage = x509Certificate2.getExtendedKeyUsage();
                if (extendedKeyUsage == null || !extendedKeyUsage.contains(KeyPurposeId.id_kp_OCSPSigning.getId())) {
                    throw new CertPathValidatorException(StubApp.getString2("32741"), null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
                }
                createSignature.initVerify(x509Certificate2);
            }
            createSignature.update(basicOCSPResponse.getTbsResponseData().getEncoded(StubApp.getString2("26791")));
            if (!createSignature.verify(basicOCSPResponse.getSignature().getBytes())) {
                return false;
            }
            if (bArr != null && !Arrays.areEqual(bArr, basicOCSPResponse.getTbsResponseData().getResponseExtensions().getExtension(OCSPObjectIdentifiers.id_pkix_ocsp_nonce).getExtnValue().getOctets())) {
                throw new CertPathValidatorException(StubApp.getString2("32740"), null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            }
            return true;
        } catch (IOException e10) {
            throw new CertPathValidatorException(u.q(e10, new StringBuilder(string2)), e10, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        } catch (CertPathValidatorException e11) {
            throw e11;
        } catch (GeneralSecurityException e12) {
            throw new CertPathValidatorException(a.h(e12, new StringBuilder(string2)), e12, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bc, code lost:
    
        if (r0.getHashAlgorithm().equals(r1.getCertID().getHashAlgorithm()) != false) goto L71;
     */
    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void check(java.security.cert.Certificate r12) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.ProvOcspRevocationChecker.check(java.security.cert.Certificate):void");
    }

    public List<CertPathValidatorException> getSoftFailExceptions() {
        return null;
    }

    public Set<String> getSupportedExtensions() {
        return null;
    }

    public void init(boolean z2) throws CertPathValidatorException {
        if (z2) {
            throw new CertPathValidatorException(StubApp.getString2(32720));
        }
        this.parameters = null;
        this.isEnabledOCSP = Properties.isOverrideSet(StubApp.getString2(32753));
        this.ocspURL = Properties.getPropertyValue(StubApp.getString2(32754));
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void initialize(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters) {
        this.parameters = pKIXCertRevocationCheckerParameters;
        this.isEnabledOCSP = Properties.isOverrideSet(StubApp.getString2(32753));
        this.ocspURL = Properties.getPropertyValue(StubApp.getString2(32754));
    }

    public boolean isForwardCheckingSupported() {
        return false;
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void setParameter(String str, Object obj) {
    }

    private CertID createCertID(AlgorithmIdentifier algorithmIdentifier, Certificate certificate, ASN1Integer aSN1Integer) throws CertPathValidatorException {
        try {
            MessageDigest createMessageDigest = this.helper.createMessageDigest(MessageDigestUtils.getDigestName(algorithmIdentifier.getAlgorithm()));
            return new CertID(algorithmIdentifier, new DEROctetString(createMessageDigest.digest(certificate.getSubject().getEncoded(StubApp.getString2("26791")))), new DEROctetString(createMessageDigest.digest(certificate.getSubjectPublicKeyInfo().getPublicKeyData().getBytes())), aSN1Integer);
        } catch (Exception e10) {
            throw new CertPathValidatorException(E1.a.i(StubApp.getString2(28100), e10), e10);
        }
    }
}
