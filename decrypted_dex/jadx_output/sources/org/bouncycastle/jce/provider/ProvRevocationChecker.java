package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.internal.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.internal.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ProvRevocationChecker extends PKIXRevocationChecker implements PKIXCertRevocationChecker {
    private static final int DEFAULT_OCSP_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_OCSP_TIMEOUT = 15000;
    private static final Map oids;
    private final ProvCrlRevocationChecker crlChecker;
    private final JcaJceHelper helper;
    private final ProvOcspRevocationChecker ocspChecker;
    private PKIXCertRevocationCheckerParameters parameters;

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

    public ProvRevocationChecker(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
        this.crlChecker = new ProvCrlRevocationChecker(jcaJceHelper);
        this.ocspChecker = new ProvOcspRevocationChecker(this, jcaJceHelper);
    }

    private boolean hasOption(PKIXRevocationChecker.Option option) {
        return getOptions().contains(option);
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection<String> collection) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!hasOption(PKIXRevocationChecker.Option.ONLY_END_ENTITY) || x509Certificate.getBasicConstraints() == -1) {
            if (hasOption(PKIXRevocationChecker.Option.PREFER_CRLS)) {
                try {
                    this.crlChecker.check(certificate);
                    return;
                } catch (RecoverableCertPathValidatorException e10) {
                    if (hasOption(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        throw e10;
                    }
                    this.ocspChecker.check(certificate);
                    return;
                }
            }
            try {
                this.ocspChecker.check(certificate);
            } catch (RecoverableCertPathValidatorException e11) {
                if (hasOption(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                    throw e11;
                }
                this.crlChecker.check(certificate);
            }
        }
    }

    @Override // java.security.cert.PKIXRevocationChecker
    public List<CertPathValidatorException> getSoftFailExceptions() {
        return this.ocspChecker.getSoftFailExceptions();
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set<String> getSupportedExtensions() {
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z2) throws CertPathValidatorException {
        this.parameters = null;
        this.crlChecker.init(z2);
        this.ocspChecker.init(z2);
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void initialize(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters) {
        this.parameters = pKIXCertRevocationCheckerParameters;
        this.crlChecker.initialize(pKIXCertRevocationCheckerParameters);
        this.ocspChecker.initialize(pKIXCertRevocationCheckerParameters);
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }

    @Override // org.bouncycastle.jcajce.PKIXCertRevocationChecker
    public void setParameter(String str, Object obj) {
    }
}
