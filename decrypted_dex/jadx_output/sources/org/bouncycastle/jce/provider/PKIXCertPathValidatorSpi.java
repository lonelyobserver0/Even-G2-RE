package org.bouncycastle.jce.provider;

import Xa.h;
import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi() {
        this(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkCertificate(X509Certificate x509Certificate) throws AnnotatedException {
        boolean z2 = x509Certificate instanceof BCX509Certificate;
        String string2 = StubApp.getString2(32709);
        if (z2) {
            try {
            } catch (RuntimeException e10) {
                e = e10;
            }
            if (((BCX509Certificate) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            throw new AnnotatedException(string2, e);
        }
        try {
            TBSCertificate.getInstance(x509Certificate.getTBSCertificate());
        } catch (IllegalArgumentException e11) {
            throw new AnnotatedException(e11.getMessage());
        } catch (CertificateEncodingException e12) {
            throw new AnnotatedException(string2, e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6, types: [org.bouncycastle.asn1.x509.AlgorithmIdentifier] */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters pKIXExtendedParameters;
        List<? extends Certificate> list;
        X500Name ca2;
        PublicKey cAPublicKey;
        int i3;
        TrustAnchor trustAnchor;
        ProvCrlRevocationChecker provCrlRevocationChecker;
        HashSet hashSet;
        int i10;
        List list2;
        HashSet hashSet2;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            pKIXExtendedParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            pKIXExtendedParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedParameters)) {
                throw new InvalidAlgorithmParameterException(h.k(PKIXParameters.class, new StringBuilder(StubApp.getString2(32703)), StubApp.getString2(32704)));
            }
            pKIXExtendedParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (pKIXExtendedParameters.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(32718));
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        int i11 = -1;
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException(StubApp.getString2(32717), null, certPath, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(pKIXExtendedParameters, new Date());
        Set initialPolicies = pKIXExtendedParameters.getInitialPolicies();
        try {
            TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), pKIXExtendedParameters.getTrustAnchors(), pKIXExtendedParameters.getSigProvider());
            if (findTrustAnchor == null) {
                list = certificates;
                try {
                    throw new CertPathValidatorException(StubApp.getString2("32716"), null, certPath, -1);
                } catch (AnnotatedException e10) {
                    e = e10;
                    throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath, list.size() - 1);
                }
            }
            checkCertificate(findTrustAnchor.getTrustedCert());
            PKIXExtendedParameters build = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTrustAnchor(findTrustAnchor).build();
            int i12 = size + 1;
            ArrayList[] arrayListArr = new ArrayList[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                arrayListArr[i13] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.add(StubApp.getString2(32631));
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), StubApp.getString2(32631), false);
            arrayListArr[0].add(pKIXPolicyNode);
            PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            HashSet hashSet4 = new HashSet();
            int i14 = build.isExplicitPolicyRequired() ? 0 : i12;
            int i15 = build.isAnyPolicyInhibited() ? 0 : i12;
            if (build.isPolicyMappingInhibited()) {
                i12 = 0;
            }
            X509Certificate trustedCert = findTrustAnchor.getTrustedCert();
            try {
                if (trustedCert != null) {
                    ca2 = PrincipalUtils.getSubjectPrincipal(trustedCert);
                    cAPublicKey = trustedCert.getPublicKey();
                } else {
                    ca2 = PrincipalUtils.getCA(findTrustAnchor);
                    cAPublicKey = findTrustAnchor.getCAPublicKey();
                }
                try {
                    i11 = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                    i11.getAlgorithm();
                    i11.getParameters();
                    if (build.getTargetConstraints() != null) {
                        i3 = 1;
                        if (!build.getTargetConstraints().match((Certificate) certificates.get(0))) {
                            throw new ExtCertPathValidatorException(StubApp.getString2(32710), null, certPath, 0);
                        }
                    } else {
                        i3 = 1;
                    }
                    List certPathCheckers = build.getCertPathCheckers();
                    Iterator it = certPathCheckers.iterator();
                    while (it.hasNext()) {
                        ((PKIXCertPathChecker) it.next()).init(false);
                    }
                    if (build.isRevocationEnabled()) {
                        provCrlRevocationChecker = new ProvCrlRevocationChecker(this.helper);
                        trustAnchor = findTrustAnchor;
                    } else {
                        trustAnchor = findTrustAnchor;
                        provCrlRevocationChecker = null;
                    }
                    int i16 = i12;
                    int size2 = certificates.size() - 1;
                    int i17 = i14;
                    PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                    int i18 = i17;
                    PKIXExtendedParameters pKIXExtendedParameters2 = build;
                    X509Certificate x509Certificate = null;
                    int i19 = size;
                    while (size2 >= 0) {
                        int i20 = size - size2;
                        List<? extends Certificate> list3 = certificates;
                        X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                        boolean z2 = size2 == list3.size() + (-1) ? i3 : 0;
                        try {
                            checkCertificate(x509Certificate2);
                            X509Certificate x509Certificate3 = trustedCert;
                            ArrayList[] arrayListArr2 = arrayListArr;
                            PublicKey publicKey = cAPublicKey;
                            int i21 = i19;
                            int i22 = i18;
                            X500Name x500Name = ca2;
                            List list4 = certPathCheckers;
                            PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                            TrustAnchor trustAnchor2 = trustAnchor;
                            Date date = validityDate;
                            PKIXExtendedParameters pKIXExtendedParameters3 = pKIXExtendedParameters2;
                            RFC3280CertPathUtilities.processCertA(certPath, pKIXExtendedParameters3, date, provCrlRevocationChecker, size2, publicKey, z2, x500Name, x509Certificate3);
                            pKIXExtendedParameters2 = pKIXExtendedParameters3;
                            int i23 = size2;
                            ProvCrlRevocationChecker provCrlRevocationChecker2 = provCrlRevocationChecker;
                            RFC3280CertPathUtilities.processCertBC(certPath, i23, pKIXNameConstraintValidator2, this.isForCRLCheck);
                            HashSet hashSet5 = hashSet4;
                            int i24 = i15;
                            PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath, i23, RFC3280CertPathUtilities.processCertD(certPath, i23, hashSet5, pKIXPolicyNode2, arrayListArr2, i24, this.isForCRLCheck));
                            RFC3280CertPathUtilities.processCertF(certPath, i23, processCertE, i22);
                            if (i20 != size) {
                                if (x509Certificate2 != null) {
                                    hashSet4 = hashSet5;
                                    int i25 = i3;
                                    if (x509Certificate2.getVersion() == i25) {
                                        if (i20 != i25 || !x509Certificate2.equals(trustAnchor2.getTrustedCert())) {
                                            throw new CertPathValidatorException(StubApp.getString2(32711), null, certPath, i23);
                                        }
                                    }
                                } else {
                                    hashSet4 = hashSet5;
                                }
                                RFC3280CertPathUtilities.prepareNextCertA(certPath, i23);
                                PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i23, arrayListArr2, processCertE, i16);
                                RFC3280CertPathUtilities.prepareNextCertG(certPath, i23, pKIXNameConstraintValidator2);
                                int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i23, i22);
                                int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i23, i16);
                                int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i23, i24);
                                int prepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i23, prepareNextCertH1);
                                int prepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i23, prepareNextCertH2);
                                i24 = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i23, prepareNextCertH3);
                                RFC3280CertPathUtilities.prepareNextCertK(certPath, i23);
                                int prepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath, i23, RFC3280CertPathUtilities.prepareNextCertL(certPath, i23, i21));
                                RFC3280CertPathUtilities.prepareNextCertN(certPath, i23);
                                Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                if (criticalExtensionOIDs != null) {
                                    hashSet2 = new HashSet(criticalExtensionOIDs);
                                    hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                    hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                    hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                    hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                    hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                    hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                    hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                    hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                    hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                } else {
                                    hashSet2 = new HashSet();
                                }
                                RFC3280CertPathUtilities.prepareNextCertO(certPath, i23, hashSet2, list4);
                                X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                pKIXPolicyNode2 = prepareCertB;
                                try {
                                    PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i23, this.helper);
                                    AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                    algorithmIdentifier.getAlgorithm();
                                    algorithmIdentifier.getParameters();
                                    cAPublicKey = nextWorkingKey;
                                    list2 = list4;
                                    trustedCert = x509Certificate2;
                                    ca2 = subjectPrincipal;
                                    i10 = prepareNextCertM;
                                    i22 = prepareNextCertI1;
                                    i16 = prepareNextCertI2;
                                    i15 = i24;
                                    int i26 = i23 - 1;
                                    arrayListArr = arrayListArr2;
                                    validityDate = date;
                                    provCrlRevocationChecker = provCrlRevocationChecker2;
                                    i18 = i22;
                                    pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                    i3 = 1;
                                    size2 = i26;
                                    certPathCheckers = list2;
                                    i19 = i10;
                                    x509Certificate = x509Certificate2;
                                    trustAnchor = trustAnchor2;
                                    certificates = list3;
                                } catch (CertPathValidatorException e11) {
                                    throw new CertPathValidatorException(StubApp.getString2(32712), e11, certPath, i23);
                                }
                            } else {
                                hashSet4 = hashSet5;
                            }
                            list2 = list4;
                            i10 = i21;
                            pKIXPolicyNode2 = processCertE;
                            cAPublicKey = publicKey;
                            ca2 = x500Name;
                            trustedCert = x509Certificate3;
                            i15 = i24;
                            int i262 = i23 - 1;
                            arrayListArr = arrayListArr2;
                            validityDate = date;
                            provCrlRevocationChecker = provCrlRevocationChecker2;
                            i18 = i22;
                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                            i3 = 1;
                            size2 = i262;
                            certPathCheckers = list2;
                            i19 = i10;
                            x509Certificate = x509Certificate2;
                            trustAnchor = trustAnchor2;
                            certificates = list3;
                        } catch (AnnotatedException e12) {
                            throw new CertPathValidatorException(e12.getMessage(), e12.getUnderlyingException(), certPath, size2);
                        }
                    }
                    TrustAnchor trustAnchor3 = trustAnchor;
                    int i27 = size2;
                    ArrayList[] arrayListArr3 = arrayListArr;
                    List list5 = certPathCheckers;
                    int i28 = i27 + 1;
                    int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i28, RFC3280CertPathUtilities.wrapupCertA(i18, x509Certificate));
                    Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                    if (criticalExtensionOIDs2 != null) {
                        hashSet = new HashSet(criticalExtensionOIDs2);
                        hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                        hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                        hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                        hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                        hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                        hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                        hashSet.remove(Extension.extendedKeyUsage.getId());
                    } else {
                        hashSet = new HashSet();
                    }
                    RFC3280CertPathUtilities.wrapupCertF(certPath, i28, list5, hashSet);
                    PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters2, initialPolicies, i28, arrayListArr3, pKIXPolicyNode2, hashSet4);
                    if (wrapupCertB > 0 || wrapupCertG != null) {
                        return new PKIXCertPathValidatorResult(trustAnchor3, wrapupCertG, x509Certificate.getPublicKey());
                    }
                    throw new CertPathValidatorException(StubApp.getString2(32713), null, certPath, i27);
                } catch (CertPathValidatorException e13) {
                    throw new ExtCertPathValidatorException(StubApp.getString2(32714), e13, certPath, -1);
                }
            } catch (RuntimeException e14) {
                throw new ExtCertPathValidatorException(StubApp.getString2(32715), e14, certPath, i11);
            }
        } catch (AnnotatedException e15) {
            e = e15;
            list = certificates;
        }
    }

    public PKIXCertPathValidatorSpi(boolean z2) {
        this.helper = new BCJcaJceHelper();
        this.isForCRLCheck = z2;
    }
}
