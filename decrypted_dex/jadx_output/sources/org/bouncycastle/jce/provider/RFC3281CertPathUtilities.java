package org.bouncycastle.jce.provider;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TargetInformation;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.PKIXAttrCertChecker;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CertStoreSelector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class RFC3281CertPathUtilities {
    private static final String TARGET_INFORMATION = Extension.targetInformation.getId();
    private static final String NO_REV_AVAIL = Extension.noRevAvail.getId();
    private static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTHORITY_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public static void additionalChecks(X509AttributeCertificate x509AttributeCertificate, Set set, Set set2) throws CertPathValidatorException {
        String string2;
        String str;
        Iterator it = set.iterator();
        do {
            boolean hasNext = it.hasNext();
            string2 = StubApp.getString2(1);
            if (!hasNext) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (x509AttributeCertificate.getAttributes(str2) == null) {
                        throw new CertPathValidatorException(a.k(StubApp.getString2(32835), str2, string2));
                    }
                }
                return;
            }
            str = (String) it.next();
        } while (x509AttributeCertificate.getAttributes(str) == null);
        throw new CertPathValidatorException(a.k(StubApp.getString2(32834), str, string2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void checkCRL(org.bouncycastle.asn1.x509.DistributionPoint r20, org.bouncycastle.x509.X509AttributeCertificate r21, org.bouncycastle.jcajce.PKIXExtendedParameters r22, java.util.Date r23, java.util.Date r24, java.security.cert.X509Certificate r25, org.bouncycastle.jce.provider.CertStatus r26, org.bouncycastle.jce.provider.ReasonsMask r27, java.util.List r28, org.bouncycastle.jcajce.util.JcaJceHelper r29) throws org.bouncycastle.jce.provider.AnnotatedException, org.bouncycastle.jce.provider.RecoverableCertPathValidatorException {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.checkCRL(org.bouncycastle.asn1.x509.DistributionPoint, org.bouncycastle.x509.X509AttributeCertificate, org.bouncycastle.jcajce.PKIXExtendedParameters, java.util.Date, java.util.Date, java.security.cert.X509Certificate, org.bouncycastle.jce.provider.CertStatus, org.bouncycastle.jce.provider.ReasonsMask, java.util.List, org.bouncycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void checkCRLs(org.bouncycastle.x509.X509AttributeCertificate r19, org.bouncycastle.jcajce.PKIXExtendedParameters r20, java.util.Date r21, java.util.Date r22, java.security.cert.X509Certificate r23, java.util.List r24, org.bouncycastle.jcajce.util.JcaJceHelper r25) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3281CertPathUtilities.checkCRLs(org.bouncycastle.x509.X509AttributeCertificate, org.bouncycastle.jcajce.PKIXExtendedParameters, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.util.List, org.bouncycastle.jcajce.util.JcaJceHelper):void");
    }

    public static CertPath processAttrCert1(X509AttributeCertificate x509AttributeCertificate, PKIXExtendedParameters pKIXExtendedParameters) throws CertPathValidatorException {
        String string2 = StubApp.getString2(32840);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Principal[] issuer = x509AttributeCertificate.getHolder().getIssuer();
        String string22 = StubApp.getString2(32841);
        String string23 = StubApp.getString2(32842);
        if (issuer != null) {
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setSerialNumber(x509AttributeCertificate.getHolder().getSerialNumber());
            for (Principal principal : x509AttributeCertificate.getHolder().getIssuer()) {
                try {
                    if (principal instanceof X500Principal) {
                        x509CertSelector.setIssuer(((X500Principal) principal).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new PKIXCertStoreSelector.Builder(x509CertSelector).build(), pKIXExtendedParameters.getCertStores());
                } catch (IOException e10) {
                    throw new ExtCertPathValidatorException(string23, e10);
                } catch (AnnotatedException e11) {
                    throw new ExtCertPathValidatorException(string22, e11);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException(StubApp.getString2(32843));
            }
        }
        if (x509AttributeCertificate.getHolder().getEntityNames() != null) {
            X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
            for (Principal principal2 : x509AttributeCertificate.getHolder().getEntityNames()) {
                try {
                    if (principal2 instanceof X500Principal) {
                        x509CertStoreSelector.setIssuer(((X500Principal) principal2).getEncoded());
                    }
                    CertPathValidatorUtilities.findCertificates(linkedHashSet, new PKIXCertStoreSelector.Builder(x509CertStoreSelector).build(), pKIXExtendedParameters.getCertStores());
                } catch (IOException e12) {
                    throw new ExtCertPathValidatorException(string23, e12);
                } catch (AnnotatedException e13) {
                    throw new ExtCertPathValidatorException(string22, e13);
                }
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException(StubApp.getString2(32844));
            }
        }
        PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
        Iterator it = linkedHashSet.iterator();
        ExtCertPathValidatorException extCertPathValidatorException = null;
        CertPathBuilderResult certPathBuilderResult = null;
        while (it.hasNext()) {
            X509CertStoreSelector x509CertStoreSelector2 = new X509CertStoreSelector();
            x509CertStoreSelector2.setCertificate((X509Certificate) it.next());
            builder.setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertStoreSelector2).build());
            try {
                try {
                    certPathBuilderResult = CertPathBuilder.getInstance(StubApp.getString2("25235"), StubApp.getString2("21668")).build(new PKIXExtendedBuilderParameters.Builder(builder.build()).build());
                } catch (InvalidAlgorithmParameterException e14) {
                    throw new RuntimeException(e14.getMessage());
                } catch (CertPathBuilderException e15) {
                    extCertPathValidatorException = new ExtCertPathValidatorException(StubApp.getString2(32845), e15);
                }
            } catch (NoSuchAlgorithmException e16) {
                throw new ExtCertPathValidatorException(string2, e16);
            } catch (NoSuchProviderException e17) {
                throw new ExtCertPathValidatorException(string2, e17);
            }
        }
        if (extCertPathValidatorException == null) {
            return certPathBuilderResult.getCertPath();
        }
        throw extCertPathValidatorException;
    }

    public static CertPathValidatorResult processAttrCert2(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters) throws CertPathValidatorException {
        String string2 = StubApp.getString2(32840);
        try {
            try {
                return CertPathValidator.getInstance(StubApp.getString2("25235"), StubApp.getString2("21668")).validate(certPath, pKIXExtendedParameters);
            } catch (InvalidAlgorithmParameterException e10) {
                throw new RuntimeException(e10.getMessage());
            } catch (CertPathValidatorException e11) {
                throw new ExtCertPathValidatorException(StubApp.getString2(32846), e11);
            }
        } catch (NoSuchAlgorithmException e12) {
            throw new ExtCertPathValidatorException(string2, e12);
        } catch (NoSuchProviderException e13) {
            throw new ExtCertPathValidatorException(string2, e13);
        }
    }

    public static void processAttrCert3(X509Certificate x509Certificate, PKIXExtendedParameters pKIXExtendedParameters) throws CertPathValidatorException {
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null && ((keyUsage.length <= 0 || !keyUsage[0]) && (keyUsage.length <= 1 || !keyUsage[1]))) {
            throw new CertPathValidatorException(StubApp.getString2(32847));
        }
        if (x509Certificate.getBasicConstraints() != -1) {
            throw new CertPathValidatorException(StubApp.getString2(32848));
        }
    }

    public static void processAttrCert4(X509Certificate x509Certificate, Set set) throws CertPathValidatorException {
        Iterator it = set.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            if (x509Certificate.getSubjectX500Principal().getName(StubApp.getString2(32849)).equals(trustAnchor.getCAName()) || x509Certificate.equals(trustAnchor.getTrustedCert())) {
                z2 = true;
            }
        }
        if (!z2) {
            throw new CertPathValidatorException(StubApp.getString2(32850));
        }
    }

    public static void processAttrCert5(X509AttributeCertificate x509AttributeCertificate, Date date) throws CertPathValidatorException {
        String string2 = StubApp.getString2(32851);
        try {
            x509AttributeCertificate.checkValidity(date);
        } catch (CertificateExpiredException e10) {
            throw new ExtCertPathValidatorException(string2, e10);
        } catch (CertificateNotYetValidException e11) {
            throw new ExtCertPathValidatorException(string2, e11);
        }
    }

    public static void processAttrCert7(X509AttributeCertificate x509AttributeCertificate, CertPath certPath, CertPath certPath2, PKIXExtendedParameters pKIXExtendedParameters, Set set) throws CertPathValidatorException {
        String string2 = StubApp.getString2(32852);
        Set<String> criticalExtensionOIDs = x509AttributeCertificate.getCriticalExtensionOIDs();
        String str = TARGET_INFORMATION;
        if (criticalExtensionOIDs.contains(str)) {
            try {
                TargetInformation.getInstance(CertPathValidatorUtilities.getExtensionValue(x509AttributeCertificate, str));
            } catch (IllegalArgumentException e10) {
                throw new ExtCertPathValidatorException(string2, e10);
            } catch (AnnotatedException e11) {
                throw new ExtCertPathValidatorException(string2, e11);
            }
        }
        criticalExtensionOIDs.remove(str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((PKIXAttrCertChecker) it.next()).check(x509AttributeCertificate, certPath, certPath2, criticalExtensionOIDs);
        }
        if (criticalExtensionOIDs.isEmpty()) {
            return;
        }
        throw new CertPathValidatorException(StubApp.getString2(32853) + criticalExtensionOIDs);
    }
}
