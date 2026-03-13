package org.bouncycastle.pkix.jcajce;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class RFC3280CertPathUtilities {
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    public static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    public static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    public static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    public static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    public static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();

    /* JADX WARN: Code restructure failed: missing block: B:63:0x012e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void checkCRL(org.bouncycastle.asn1.x509.DistributionPoint r20, org.bouncycastle.jcajce.PKIXExtendedParameters r21, java.util.Date r22, java.util.Date r23, java.security.cert.X509Certificate r24, java.security.cert.X509Certificate r25, java.security.PublicKey r26, org.bouncycastle.pkix.jcajce.CertStatus r27, org.bouncycastle.pkix.jcajce.ReasonsMask r28, java.util.List r29, org.bouncycastle.jcajce.util.JcaJceHelper r30) throws org.bouncycastle.pkix.jcajce.AnnotatedException, org.bouncycastle.pkix.jcajce.CRLNotFoundException {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pkix.jcajce.RFC3280CertPathUtilities.checkCRL(org.bouncycastle.asn1.x509.DistributionPoint, org.bouncycastle.jcajce.PKIXExtendedParameters, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, org.bouncycastle.pkix.jcajce.CertStatus, org.bouncycastle.pkix.jcajce.ReasonsMask, java.util.List, org.bouncycastle.jcajce.util.JcaJceHelper):void");
    }

    public static Set processCRLA1i(PKIXExtendedParameters pKIXExtendedParameters, Date date, X509Certificate x509Certificate, X509CRL x509crl) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        if (pKIXExtendedParameters.isUseDeltasEnabled()) {
            try {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.freshestCRL;
                CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(RevocationUtilities.getExtensionValue(x509Certificate, aSN1ObjectIdentifier));
                if (cRLDistPoint == null) {
                    try {
                        cRLDistPoint = CRLDistPoint.getInstance(RevocationUtilities.getExtensionValue(x509crl, aSN1ObjectIdentifier));
                    } catch (AnnotatedException e10) {
                        throw new AnnotatedException(StubApp.getString2(33913), e10);
                    }
                }
                if (cRLDistPoint != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(pKIXExtendedParameters.getCRLStores());
                    try {
                        arrayList.addAll(RevocationUtilities.getAdditionalStoresFromCRLDistributionPoint(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap()));
                        try {
                            hashSet.addAll(RevocationUtilities.getDeltaCRLs(date, x509crl, pKIXExtendedParameters.getCertStores(), arrayList));
                            return hashSet;
                        } catch (AnnotatedException e11) {
                            throw new AnnotatedException(StubApp.getString2(33914), e11);
                        }
                    } catch (AnnotatedException e12) {
                        throw new AnnotatedException(StubApp.getString2(33915), e12);
                    }
                }
            } catch (AnnotatedException e13) {
                throw new AnnotatedException(StubApp.getString2(33916), e13);
            }
        }
        return hashSet;
    }

    public static Set[] processCRLA1ii(PKIXExtendedParameters pKIXExtendedParameters, Date date, Date date2, X509Certificate x509Certificate, X509CRL x509crl) throws AnnotatedException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        x509CRLSelector.setCertificateChecking(x509Certificate);
        try {
            x509CRLSelector.addIssuerName(x509crl.getIssuerX500Principal().getEncoded());
            Set findCRLs = PKIXCRLUtil.findCRLs(new PKIXCRLStoreSelector.Builder(x509CRLSelector).setCompleteCRLEnabled(true).build(), date2, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores());
            HashSet hashSet = new HashSet();
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                try {
                    hashSet.addAll(RevocationUtilities.getDeltaCRLs(date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()));
                } catch (AnnotatedException e10) {
                    throw new AnnotatedException(StubApp.getString2(33914), e10);
                }
            }
            return new Set[]{findCRLs, hashSet};
        } catch (IOException e11) {
            throw new AnnotatedException(b.h(StubApp.getString2(32653), e11), e11);
        }
    }

    public static void processCRLB1(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        ASN1Primitive extensionValue = RevocationUtilities.getExtensionValue(x509crl, Extension.issuingDistributionPoint);
        boolean z2 = true;
        boolean z10 = extensionValue != null && IssuingDistributionPoint.getInstance(extensionValue).isIndirectCRL();
        byte[] encoded = x509crl.getIssuerX500Principal().getEncoded();
        if (distributionPoint.getCRLIssuer() != null) {
            GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
            boolean z11 = false;
            for (int i3 = 0; i3 < names.length; i3++) {
                if (names[i3].getTagNo() == 4) {
                    try {
                        if (Arrays.areEqual(names[i3].getName().toASN1Primitive().getEncoded(), encoded)) {
                            z11 = true;
                        }
                    } catch (IOException e10) {
                        throw new AnnotatedException(StubApp.getString2(32644), e10);
                    }
                }
            }
            if (z11 && !z10) {
                throw new AnnotatedException(StubApp.getString2(32785));
            }
            if (!z11) {
                throw new AnnotatedException(StubApp.getString2(32786));
            }
            z2 = z11;
        } else if (!x509crl.getIssuerX500Principal().equals(((X509Certificate) obj).getIssuerX500Principal())) {
            z2 = false;
        }
        if (!z2) {
            throw new AnnotatedException(StubApp.getString2(32787));
        }
    }

    public static void processCRLB2(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        int i3;
        GeneralName[] generalNameArr;
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(RevocationUtilities.getExtensionValue(x509crl, Extension.issuingDistributionPoint));
            if (issuingDistributionPoint != null) {
                if (issuingDistributionPoint.getDistributionPoint() != null) {
                    DistributionPointName distributionPoint2 = IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
                    ArrayList arrayList = new ArrayList();
                    if (distributionPoint2.getType() == 0) {
                        for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                            arrayList.add(generalName);
                        }
                    }
                    if (distributionPoint2.getType() == 1) {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        try {
                            Enumeration objects = ASN1Sequence.getInstance(x509crl.getIssuerX500Principal().getEncoded()).getObjects();
                            while (objects.hasMoreElements()) {
                                aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
                            }
                            aSN1EncodableVector.add(distributionPoint2.getName());
                            arrayList.add(new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector))));
                        } catch (Exception e10) {
                            throw new AnnotatedException(StubApp.getString2(32789), e10);
                        }
                    }
                    DistributionPointName distributionPoint3 = distributionPoint.getDistributionPoint();
                    String string2 = StubApp.getString2(32790);
                    if (distributionPoint3 == null) {
                        if (distributionPoint.getCRLIssuer() == null) {
                            throw new AnnotatedException(StubApp.getString2(32792));
                        }
                        GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                        while (i3 < names.length) {
                            i3 = arrayList.contains(names[i3]) ? 0 : i3 + 1;
                        }
                        throw new AnnotatedException(string2);
                    }
                    DistributionPointName distributionPoint4 = distributionPoint.getDistributionPoint();
                    GeneralName[] names2 = distributionPoint4.getType() == 0 ? GeneralNames.getInstance(distributionPoint4.getName()).getNames() : null;
                    if (distributionPoint4.getType() == 1) {
                        if (distributionPoint.getCRLIssuer() != null) {
                            generalNameArr = distributionPoint.getCRLIssuer().getNames();
                        } else {
                            generalNameArr = new GeneralName[1];
                            try {
                                generalNameArr[0] = new GeneralName(X500Name.getInstance(((X509Certificate) obj).getIssuerX500Principal().getEncoded()));
                            } catch (Exception e11) {
                                throw new AnnotatedException(StubApp.getString2(32791), e11);
                            }
                        }
                        names2 = generalNameArr;
                        for (int i10 = 0; i10 < names2.length; i10++) {
                            Enumeration objects2 = ASN1Sequence.getInstance(names2[i10].getName().toASN1Primitive()).getObjects();
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                            while (objects2.hasMoreElements()) {
                                aSN1EncodableVector2.add((ASN1Encodable) objects2.nextElement());
                            }
                            aSN1EncodableVector2.add(distributionPoint4.getName());
                            names2[i10] = new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector2)));
                        }
                    }
                    if (names2 != null) {
                        while (i3 < names2.length) {
                            i3 = arrayList.contains(names2[i3]) ? 0 : i3 + 1;
                        }
                    }
                    throw new AnnotatedException(string2);
                }
                try {
                    BasicConstraints basicConstraints = BasicConstraints.getInstance(RevocationUtilities.getExtensionValue((X509Extension) obj, Extension.basicConstraints));
                    if (obj instanceof X509Certificate) {
                        if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                            throw new AnnotatedException(StubApp.getString2(32793));
                        }
                        if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                            throw new AnnotatedException(StubApp.getString2(32794));
                        }
                    }
                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                        throw new AnnotatedException(StubApp.getString2(32795));
                    }
                } catch (Exception e12) {
                    throw new AnnotatedException(StubApp.getString2(32796), e12);
                }
            }
        } catch (Exception e13) {
            throw new AnnotatedException(StubApp.getString2(32797), e13);
        }
    }

    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        if (x509crl == null) {
            return;
        }
        try {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.issuingDistributionPoint;
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(RevocationUtilities.getExtensionValue(x509crl2, aSN1ObjectIdentifier));
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                if (!x509crl.getIssuerX500Principal().equals(x509crl2.getIssuerX500Principal())) {
                    throw new AnnotatedException(StubApp.getString2(33917));
                }
                try {
                    IssuingDistributionPoint issuingDistributionPoint2 = IssuingDistributionPoint.getInstance(RevocationUtilities.getExtensionValue(x509crl, aSN1ObjectIdentifier));
                    if (issuingDistributionPoint != null ? !issuingDistributionPoint.equals(issuingDistributionPoint2) : issuingDistributionPoint2 != null) {
                        throw new AnnotatedException(StubApp.getString2(32803));
                    }
                    try {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = Extension.authorityKeyIdentifier;
                        ASN1Primitive extensionValue = RevocationUtilities.getExtensionValue(x509crl2, aSN1ObjectIdentifier2);
                        try {
                            ASN1Primitive extensionValue2 = RevocationUtilities.getExtensionValue(x509crl, aSN1ObjectIdentifier2);
                            if (extensionValue == null) {
                                throw new AnnotatedException(StubApp.getString2(32800));
                            }
                            if (extensionValue2 == null) {
                                throw new AnnotatedException(StubApp.getString2(32799));
                            }
                            if (!extensionValue.equals(extensionValue2)) {
                                throw new AnnotatedException(StubApp.getString2(32798));
                            }
                        } catch (AnnotatedException e10) {
                            throw new AnnotatedException(StubApp.getString2(32801), e10);
                        }
                    } catch (AnnotatedException e11) {
                        throw new AnnotatedException(StubApp.getString2(32802), e11);
                    }
                } catch (Exception e12) {
                    throw new AnnotatedException(StubApp.getString2(32804), e12);
                }
            }
        } catch (Exception e13) {
            throw new AnnotatedException(StubApp.getString2(33918), e13);
        }
    }

    public static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionPoint) throws AnnotatedException {
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(RevocationUtilities.getExtensionValue(x509crl, Extension.issuingDistributionPoint));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                return new ReasonsMask(distributionPoint.getReasons()).intersect(new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
            }
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return ReasonsMask.allReasons;
            }
            return (distributionPoint.getReasons() == null ? ReasonsMask.allReasons : new ReasonsMask(distributionPoint.getReasons())).intersect(issuingDistributionPoint == null ? ReasonsMask.allReasons : new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
        } catch (Exception e10) {
            throw new AnnotatedException(StubApp.getString2(32797), e10);
        }
    }

    public static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, PKIXExtendedParameters pKIXExtendedParameters, List list, JcaJceHelper jcaJceHelper) throws AnnotatedException {
        int i3;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(x509crl.getIssuerX500Principal().getEncoded());
            PKIXCertStoreSelector<? extends Certificate> build = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                RevocationUtilities.findCertificates(linkedHashSet, build, pKIXExtendedParameters.getCertificateStores());
                RevocationUtilities.findCertificates(linkedHashSet, build, pKIXExtendedParameters.getCertStores());
                linkedHashSet.add(x509Certificate);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            CertPathBuilder createCertPathBuilder = jcaJceHelper.createCertPathBuilder(StubApp.getString2("25235"));
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            PKIXExtendedParameters.Builder targetConstraints = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            List<? extends Certificate> certificates = createCertPathBuilder.build(new PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(RevocationUtilities.getNextWorkingKey(certificates, 0, jcaJceHelper));
                        } catch (CertPathBuilderException e10) {
                            throw new AnnotatedException(StubApp.getString2(32808), e10);
                        } catch (CertPathValidatorException e11) {
                            throw new AnnotatedException(StubApp.getString2(32807), e11);
                        } catch (Exception e12) {
                            throw new AnnotatedException(e12.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (i3 = 0; i3 < arrayList.size(); i3++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i3)).getKeyUsage();
                    if (keyUsage == null || (keyUsage.length > 6 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i3));
                    } else {
                        annotatedException = new AnnotatedException(StubApp.getString2(32809));
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException(StubApp.getString2(32810));
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (AnnotatedException e13) {
                throw new AnnotatedException(StubApp.getString2(32811), e13);
            }
        } catch (IOException e14) {
            throw new AnnotatedException(StubApp.getString2(33919), e14);
        }
    }

    public static PublicKey processCRLG(X509CRL x509crl, Set set) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e10 = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e11) {
                e10 = e11;
            }
        }
        throw new AnnotatedException(StubApp.getString2(32813), e10);
    }

    public static X509CRL processCRLH(Set set, PublicKey publicKey) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e10 = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e11) {
                e10 = e11;
            }
        }
        if (e10 == null) {
            return null;
        }
        throw new AnnotatedException(StubApp.getString2(32814), e10);
    }

    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        if (!pKIXExtendedParameters.isUseDeltasEnabled() || x509crl == null) {
            return;
        }
        RevocationUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        if (certStatus.getCertStatus() == 11) {
            RevocationUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }
}
