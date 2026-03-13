package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
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
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class RFC3280CertPathUtilities {
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    public static final String ANY_POLICY = StubApp.getString2(32631);
    private static final Class revChkClass = ClassUtil.loadClass(RFC3280CertPathUtilities.class, StubApp.getString2(32535));
    public static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    public static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    public static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    public static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    public static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    public static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    public static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    public static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    public static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    public static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    public static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    public static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    public static final String KEY_USAGE = Extension.keyUsage.getId();
    public static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String[] crlReasons = {StubApp.getString2(27723), StubApp.getString2(27724), StubApp.getString2(27725), StubApp.getString2(27726), StubApp.getString2(27727), StubApp.getString2(27728), StubApp.getString2(27729), StubApp.getString2(351), StubApp.getString2(27730), StubApp.getString2(27721), StubApp.getString2(27722)};

    /* JADX WARN: Code restructure failed: missing block: B:66:0x012b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void checkCRL(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters r19, org.bouncycastle.asn1.x509.DistributionPoint r20, org.bouncycastle.jcajce.PKIXExtendedParameters r21, java.util.Date r22, java.util.Date r23, java.security.cert.X509Certificate r24, java.security.cert.X509Certificate r25, java.security.PublicKey r26, org.bouncycastle.jce.provider.CertStatus r27, org.bouncycastle.jce.provider.ReasonsMask r28, java.util.List r29, org.bouncycastle.jcajce.util.JcaJceHelper r30) throws org.bouncycastle.jce.provider.AnnotatedException, org.bouncycastle.jce.provider.RecoverableCertPathValidatorException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRL(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters, org.bouncycastle.asn1.x509.DistributionPoint, org.bouncycastle.jcajce.PKIXExtendedParameters, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, org.bouncycastle.jce.provider.CertStatus, org.bouncycastle.jce.provider.ReasonsMask, java.util.List, org.bouncycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void checkCRLs(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters r19, org.bouncycastle.jcajce.PKIXExtendedParameters r20, java.util.Date r21, java.util.Date r22, java.security.cert.X509Certificate r23, java.security.cert.X509Certificate r24, java.security.PublicKey r25, java.util.List r26, org.bouncycastle.jcajce.util.JcaJceHelper r27) throws org.bouncycastle.jce.provider.AnnotatedException, org.bouncycastle.jce.provider.RecoverableCertPathValidatorException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRLs(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters, org.bouncycastle.jcajce.PKIXExtendedParameters, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, org.bouncycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x011b, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x015b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0168, code lost:
    
        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException(com.stub.StubApp.getString2(32768), r0, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0076, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00aa, code lost:
    
        r5 = r18[r7].iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b4, code lost:
    
        if (r5.hasNext() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        r6 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r5.next();
        r8 = r6.getValidPolicy();
        r9 = com.stub.StubApp.getString2(32631);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cb, code lost:
    
        if (r9.equals(r8) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d5, code lost:
    
        r5 = ((org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r4, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES)).getObjects();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
    
        if (r5.hasMoreElements() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00df, code lost:
    
        r8 = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(r5.nextElement());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f3, code lost:
    
        if (r9.equals(r8.getPolicyIdentifier().getId()) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        r5 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getQualifierSet(r8.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fd, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0121, code lost:
    
        if (r4.getCriticalExtensionOIDs() == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0123, code lost:
    
        r12 = r4.getCriticalExtensionOIDs().contains(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0130, code lost:
    
        r5 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r6.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013e, code lost:
    
        if (r9.equals(r5.getValidPolicy()) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0140, code lost:
    
        r5 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r7, (java.util.Set) r13.get(r11), r5, r10, r11, r12);
        r5.addChild(r5);
        r18[r7].add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012f, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010c, code lost:
    
        throw new org.bouncycastle.jce.exception.ExtCertPathValidatorException(com.stub.StubApp.getString2(32766), r0, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x010d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x011a, code lost:
    
        throw new java.security.cert.CertPathValidatorException(com.stub.StubApp.getString2(32767), r0, r16, r17);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.bouncycastle.jce.provider.PKIXPolicyNode prepareCertB(java.security.cert.CertPath r16, int r17, java.util.List[] r18, org.bouncycastle.jce.provider.PKIXPolicyNode r19, int r20) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareCertB(java.security.cert.CertPath, int, java.util.List[], org.bouncycastle.jce.provider.PKIXPolicyNode, int):org.bouncycastle.jce.provider.PKIXPolicyNode");
    }

    public static void prepareNextCertA(CertPath certPath, int i3) throws CertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i3), POLICY_MAPPINGS));
            if (aSN1Sequence != null) {
                for (int i10 = 0; i10 < aSN1Sequence.size(); i10++) {
                    try {
                        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i10));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(0));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(1));
                        String id = aSN1ObjectIdentifier.getId();
                        String string2 = StubApp.getString2(32631);
                        if (string2.equals(id)) {
                            throw new CertPathValidatorException(StubApp.getString2(32771), null, certPath, i3);
                        }
                        if (string2.equals(aSN1ObjectIdentifier2.getId())) {
                            throw new CertPathValidatorException(StubApp.getString2(32770), null, certPath, i3);
                        }
                    } catch (Exception e10) {
                        throw new ExtCertPathValidatorException(StubApp.getString2(32772), e10, certPath, i3);
                    }
                }
            }
        } catch (AnnotatedException e11) {
            throw new ExtCertPathValidatorException(StubApp.getString2(32769), e11, certPath, i3);
        }
    }

    public static void prepareNextCertG(CertPath certPath, int i3, PKIXNameConstraintValidator pKIXNameConstraintValidator) throws CertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i3), NAME_CONSTRAINTS));
            NameConstraints nameConstraints = aSN1Sequence != null ? NameConstraints.getInstance(aSN1Sequence) : null;
            if (nameConstraints != null) {
                GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                if (permittedSubtrees != null) {
                    try {
                        pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                    } catch (Exception e10) {
                        throw new ExtCertPathValidatorException(StubApp.getString2(32773), e10, certPath, i3);
                    }
                }
                GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                if (excludedSubtrees != null) {
                    for (int i10 = 0; i10 != excludedSubtrees.length; i10++) {
                        try {
                            pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i10]);
                        } catch (Exception e11) {
                            throw new ExtCertPathValidatorException(StubApp.getString2(32774), e11, certPath, i3);
                        }
                    }
                }
            }
        } catch (Exception e12) {
            throw new ExtCertPathValidatorException(StubApp.getString2(32775), e12, certPath, i3);
        }
    }

    public static int prepareNextCertH1(CertPath certPath, int i3, int i10) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i3)) || i10 == 0) ? i10 : i10 - 1;
    }

    public static int prepareNextCertH2(CertPath certPath, int i3, int i10) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i3)) || i10 == 0) ? i10 : i10 - 1;
    }

    public static int prepareNextCertH3(CertPath certPath, int i3, int i10) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i3)) || i10 == 0) ? i10 : i10 - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r3 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, false).intValueExact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r3 >= r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int prepareNextCertI1(java.security.cert.CertPath r3, int r4, int r5) throws java.security.cert.CertPathValidatorException {
        /*
            java.util.List r0 = r3.getCertificates()
            java.lang.Object r0 = r0.get(r4)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L49
            org.bouncycastle.asn1.ASN1Primitive r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L49
            org.bouncycastle.asn1.ASN1Sequence r0 = org.bouncycastle.asn1.ASN1Sequence.getInstance(r0)     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L48
            java.util.Enumeration r0 = r0.getObjects()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3a
            org.bouncycastle.asn1.ASN1TaggedObject r1 = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L3a
            int r2 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r2 != 0) goto L1a
            r0 = 0
            org.bouncycastle.asn1.ASN1Integer r0 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3a
            int r3 = r0.intValueExact()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r3 >= r5) goto L48
            return r3
        L3a:
            r5 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            r1 = 32776(0x8008, float:4.5929E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1, r5, r3, r4)
            throw r0
        L48:
            return r5
        L49:
            r5 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            r1 = 32777(0x8009, float:4.593E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1, r5, r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI1(java.security.cert.CertPath, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r4 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, false).intValueExact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r4 >= r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int prepareNextCertI2(java.security.cert.CertPath r4, int r5, int r6) throws java.security.cert.CertPathValidatorException {
        /*
            java.util.List r0 = r4.getCertificates()
            java.lang.Object r0 = r0.get(r5)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L4a
            org.bouncycastle.asn1.ASN1Primitive r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L4a
            org.bouncycastle.asn1.ASN1Sequence r0 = org.bouncycastle.asn1.ASN1Sequence.getInstance(r0)     // Catch: java.lang.Exception -> L4a
            if (r0 == 0) goto L49
            java.util.Enumeration r0 = r0.getObjects()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3b
            org.bouncycastle.asn1.ASN1TaggedObject r1 = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L3b
            int r2 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3b
            r3 = 1
            if (r2 != r3) goto L1a
            r0 = 0
            org.bouncycastle.asn1.ASN1Integer r0 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3b
            int r4 = r0.intValueExact()     // Catch: java.lang.IllegalArgumentException -> L3b
            if (r4 >= r6) goto L49
            return r4
        L3b:
            r6 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            r1 = 32776(0x8008, float:4.5929E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1, r6, r4, r5)
            throw r0
        L49:
            return r6
        L4a:
            r6 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r0 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            r1 = 32777(0x8009, float:4.593E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1, r6, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI2(java.security.cert.CertPath, int, int):int");
    }

    public static int prepareNextCertJ(CertPath certPath, int i3, int i10) throws CertPathValidatorException {
        int intValueExact;
        try {
            ASN1Integer aSN1Integer = ASN1Integer.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i3), INHIBIT_ANY_POLICY));
            return (aSN1Integer == null || (intValueExact = aSN1Integer.intValueExact()) >= i10) ? i10 : intValueExact;
        } catch (Exception e10) {
            throw new ExtCertPathValidatorException(StubApp.getString2(32778), e10, certPath, i3);
        }
    }

    public static void prepareNextCertK(CertPath certPath, int i3) throws CertPathValidatorException {
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i3), BASIC_CONSTRAINTS));
            if (basicConstraints == null) {
                throw new CertPathValidatorException(StubApp.getString2(32780), null, certPath, i3);
            }
            if (!basicConstraints.isCA()) {
                throw new CertPathValidatorException(StubApp.getString2(32779), null, certPath, i3);
            }
        } catch (Exception e10) {
            throw new ExtCertPathValidatorException(StubApp.getString2(32781), e10, certPath, i3);
        }
    }

    public static int prepareNextCertL(CertPath certPath, int i3, int i10) throws CertPathValidatorException {
        if (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i3))) {
            return i10;
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        throw new ExtCertPathValidatorException(StubApp.getString2(32782), null, certPath, i3);
    }

    public static int prepareNextCertM(CertPath certPath, int i3, int i10) throws CertPathValidatorException {
        BigInteger pathLenConstraint;
        int intValue;
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i3), BASIC_CONSTRAINTS));
            return (basicConstraints == null || (pathLenConstraint = basicConstraints.getPathLenConstraint()) == null || (intValue = pathLenConstraint.intValue()) >= i10) ? i10 : intValue;
        } catch (Exception e10) {
            throw new ExtCertPathValidatorException(StubApp.getString2(32781), e10, certPath, i3);
        }
    }

    public static void prepareNextCertN(CertPath certPath, int i3) throws CertPathValidatorException {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i3)).getKeyUsage();
        if (keyUsage != null) {
            if (keyUsage.length <= 5 || !keyUsage[5]) {
                throw new ExtCertPathValidatorException(StubApp.getString2(32783), null, certPath, i3);
            }
        }
    }

    public static void prepareNextCertO(CertPath certPath, int i3, Set set, List list) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e10) {
                throw new CertPathValidatorException(e10.getMessage(), e10.getCause(), certPath, i3);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException(StubApp.getString2(32784) + set, null, certPath, i3);
    }

    public static void processCRLB1(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        boolean z2 = true;
        boolean z10 = extensionValue != null && IssuingDistributionPoint.getInstance(extensionValue).isIndirectCRL();
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
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
            } else if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                z2 = false;
            }
            if (!z2) {
                throw new AnnotatedException(StubApp.getString2(32787));
            }
        } catch (IOException e11) {
            throw new AnnotatedException(u.q(e11, new StringBuilder(StubApp.getString2(32788))), e11);
        }
    }

    public static void processCRLB2(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        int i3;
        GeneralName[] generalNameArr;
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
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
                            Enumeration objects = ASN1Sequence.getInstance(PrincipalUtils.getIssuerPrincipal(x509crl)).getObjects();
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
                                generalNameArr[0] = new GeneralName(PrincipalUtils.getEncodedIssuerPrincipal(obj));
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
                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
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
        if (x509crl.hasUnsupportedCriticalExtension()) {
            throw new AnnotatedException(StubApp.getString2(32806));
        }
        try {
            String str = ISSUING_DISTRIBUTION_POINT;
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl2, str));
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                    throw new AnnotatedException(StubApp.getString2(32805));
                }
                try {
                    IssuingDistributionPoint issuingDistributionPoint2 = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                    if (issuingDistributionPoint != null ? !issuingDistributionPoint.equals(issuingDistributionPoint2) : issuingDistributionPoint2 != null) {
                        throw new AnnotatedException(StubApp.getString2(32803));
                    }
                    try {
                        String str2 = AUTHORITY_KEY_IDENTIFIER;
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, str2);
                        try {
                            ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, str2);
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
            throw new AnnotatedException(StubApp.getString2(32797), e13);
        }
    }

    public static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionPoint) throws AnnotatedException {
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
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
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            PKIXCertStoreSelector<? extends Certificate> build = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                CertPathValidatorUtilities.findCertificates(linkedHashSet, build, pKIXExtendedParameters.getCertificateStores());
                CertPathValidatorUtilities.findCertificates(linkedHashSet, build, pKIXExtendedParameters.getCertStores());
                linkedHashSet.add(x509Certificate);
                Iterator it = linkedHashSet.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
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
                            CertPathBuilderSpi pKIXCertPathBuilderSpi_8 = revChkClass != null ? new PKIXCertPathBuilderSpi_8(true) : new PKIXCertPathBuilderSpi(true);
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            PKIXExtendedParameters.Builder targetConstraints = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi_8.engineBuild(new PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, jcaJceHelper));
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
            throw new AnnotatedException(StubApp.getString2(32812), e14);
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
        CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    public static void processCertA(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Date date, PKIXCertRevocationChecker pKIXCertRevocationChecker, int i3, PublicKey publicKey, boolean z2, X500Name x500Name, X509Certificate x509Certificate) throws CertPathValidatorException {
        String string2 = StubApp.getString2(32815);
        X509Certificate x509Certificate2 = (X509Certificate) certPath.getCertificates().get(i3);
        if (!z2) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, pKIXExtendedParameters.getSigProvider());
            } catch (GeneralSecurityException e10) {
                throw new ExtCertPathValidatorException(StubApp.getString2(32816), e10, certPath, i3);
            }
        }
        try {
            Date validCertDateFromValidityModel = CertPathValidatorUtilities.getValidCertDateFromValidityModel(date, pKIXExtendedParameters.getValidityModel(), certPath, i3);
            try {
                x509Certificate2.checkValidity(validCertDateFromValidityModel);
                if (pKIXCertRevocationChecker != null) {
                    pKIXCertRevocationChecker.initialize(new PKIXCertRevocationCheckerParameters(pKIXExtendedParameters, validCertDateFromValidityModel, certPath, i3, x509Certificate, publicKey));
                    pKIXCertRevocationChecker.check(x509Certificate2);
                }
                X500Name issuerPrincipal = PrincipalUtils.getIssuerPrincipal(x509Certificate2);
                if (issuerPrincipal.equals(x500Name)) {
                    return;
                }
                throw new ExtCertPathValidatorException(StubApp.getString2(32817) + issuerPrincipal + StubApp.getString2(32818) + x500Name + StubApp.getString2(32819), null, certPath, i3);
            } catch (CertificateExpiredException e11) {
                throw new ExtCertPathValidatorException(string2 + e11.getMessage(), e11, certPath, i3);
            } catch (CertificateNotYetValidException e12) {
                throw new ExtCertPathValidatorException(string2 + e12.getMessage(), e12, certPath, i3);
            }
        } catch (AnnotatedException e13) {
            throw new ExtCertPathValidatorException(StubApp.getString2(32820), e13, certPath, i3);
        }
    }

    public static void processCertBC(CertPath certPath, int i3, PKIXNameConstraintValidator pKIXNameConstraintValidator, boolean z2) throws CertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i3);
        int size = certificates.size();
        int i10 = size - i3;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || (i10 >= size && !z2)) {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(PrincipalUtils.getSubjectPrincipal(x509Certificate));
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                    pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                    try {
                        GeneralNames generalNames = GeneralNames.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        RDN[] rDNs = X500Name.getInstance(aSN1Sequence).getRDNs(BCStyle.EmailAddress);
                        for (int i11 = 0; i11 != rDNs.length; i11++) {
                            GeneralName generalName = new GeneralName(1, ((ASN1String) rDNs[i11].getFirst().getValue()).getString());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                pKIXNameConstraintValidator.checkExcluded(generalName);
                            } catch (PKIXNameConstraintValidatorException e10) {
                                throw new CertPathValidatorException(StubApp.getString2(32821), e10, certPath, i3);
                            }
                        }
                        if (generalNames != null) {
                            try {
                                GeneralName[] names = generalNames.getNames();
                                for (int i12 = 0; i12 < names.length; i12++) {
                                    try {
                                        pKIXNameConstraintValidator.checkPermitted(names[i12]);
                                        pKIXNameConstraintValidator.checkExcluded(names[i12]);
                                    } catch (PKIXNameConstraintValidatorException e11) {
                                        throw new CertPathValidatorException(StubApp.getString2(32822), e11, certPath, i3);
                                    }
                                }
                            } catch (Exception e12) {
                                throw new CertPathValidatorException(StubApp.getString2(32823), e12, certPath, i3);
                            }
                        }
                    } catch (Exception e13) {
                        throw new CertPathValidatorException(StubApp.getString2(32824), e13, certPath, i3);
                    }
                } catch (PKIXNameConstraintValidatorException e14) {
                    throw new CertPathValidatorException(StubApp.getString2(32825), e14, certPath, i3);
                }
            } catch (Exception e15) {
                throw new CertPathValidatorException(StubApp.getString2(32826), e15, certPath, i3);
            }
        }
    }

    public static PKIXPolicyNode processCertD(CertPath certPath, int i3, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i10, boolean z2) throws CertPathValidatorException {
        String string2;
        String str;
        int i11;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i3);
        int size = certificates.size();
        int i12 = size - i3;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (aSN1Sequence == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration objects = aSN1Sequence.getObjects();
            HashSet hashSet = new HashSet();
            while (true) {
                boolean hasMoreElements = objects.hasMoreElements();
                string2 = StubApp.getString2(32631);
                if (!hasMoreElements) {
                    break;
                }
                PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                hashSet.add(policyIdentifier.getId());
                if (!string2.equals(policyIdentifier.getId())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                        if (!CertPathValidatorUtilities.processCertD1i(i12, listArr, policyIdentifier, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i12, listArr, policyIdentifier, qualifierSet);
                        }
                    } catch (CertPathValidatorException e10) {
                        throw new ExtCertPathValidatorException(StubApp.getString2(32827), e10, certPath, i3);
                    }
                }
            }
            if (set.isEmpty() || set.contains(string2)) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i10 > 0 || ((i12 < size || z2) && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration objects2 = aSN1Sequence.getObjects();
                while (true) {
                    if (!objects2.hasMoreElements()) {
                        break;
                    }
                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                    if (string2.equals(policyInformation2.getPolicyIdentifier().getId())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                        List list = listArr[i12 - 1];
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i13);
                            for (Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    str = (String) obj2;
                                } else if (obj2 instanceof ASN1ObjectIdentifier) {
                                    str = ((ASN1ObjectIdentifier) obj2).getId();
                                }
                                String str2 = str;
                                Iterator children = pKIXPolicyNode2.getChildren();
                                boolean z10 = false;
                                while (children.hasNext()) {
                                    if (str2.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str2);
                                    PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i12, hashSet3, pKIXPolicyNode2, qualifierSet2, str2, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr[i12].add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
            }
            PKIXPolicyNode pKIXPolicyNode4 = pKIXPolicyNode;
            for (int i14 = i12 - 1; i14 >= 0; i14--) {
                List list2 = listArr[i14];
                for (0; i11 < list2.size(); i11 + 1) {
                    PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i11);
                    i11 = (pKIXPolicyNode5.hasChildren() || (pKIXPolicyNode4 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode4, listArr, pKIXPolicyNode5)) != null) ? i11 + 1 : 0;
                }
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean contains = criticalExtensionOIDs.contains(CERTIFICATE_POLICIES);
                List list3 = listArr[i12];
                for (int i15 = 0; i15 < list3.size(); i15++) {
                    ((PKIXPolicyNode) list3.get(i15)).setCritical(contains);
                }
            }
            return pKIXPolicyNode4;
        } catch (AnnotatedException e11) {
            throw new ExtCertPathValidatorException(StubApp.getString2(32828), e11, certPath, i3);
        }
    }

    public static PKIXPolicyNode processCertE(CertPath certPath, int i3, PKIXPolicyNode pKIXPolicyNode) throws CertPathValidatorException {
        try {
            if (ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i3), CERTIFICATE_POLICIES)) == null) {
                return null;
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e10) {
            throw new ExtCertPathValidatorException(StubApp.getString2(32828), e10, certPath, i3);
        }
    }

    public static void processCertF(CertPath certPath, int i3, PKIXPolicyNode pKIXPolicyNode, int i10) throws CertPathValidatorException {
        if (i10 <= 0 && pKIXPolicyNode == null) {
            throw new ExtCertPathValidatorException(StubApp.getString2(32829), null, certPath, i3);
        }
    }

    public static int wrapupCertA(int i3, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i3 == 0) ? i3 : i3 - 1;
    }

    public static int wrapupCertB(CertPath certPath, int i3, int i10) throws CertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i3), POLICY_CONSTRAINTS));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (objects.hasMoreElements()) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        try {
                            if (ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact() == 0) {
                                return 0;
                            }
                        } catch (Exception e10) {
                            throw new ExtCertPathValidatorException(StubApp.getString2(32830), e10, certPath, i3);
                        }
                    }
                }
            }
            return i10;
        } catch (AnnotatedException e11) {
            throw new ExtCertPathValidatorException(StubApp.getString2(32831), e11, certPath, i3);
        }
    }

    public static void wrapupCertF(CertPath certPath, int i3, List list, Set set) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e10) {
                throw new ExtCertPathValidatorException(e10.getMessage(), e10, certPath, i3);
            } catch (Exception e11) {
                throw new CertPathValidatorException(StubApp.getString2(32832), e11, certPath, i3);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException(StubApp.getString2(32784) + set, null, certPath, i3);
    }

    public static PKIXPolicyNode wrapupCertG(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Set set, int i3, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) throws CertPathValidatorException {
        int size = certPath.getCertificates().size();
        String string2 = StubApp.getString2(32833);
        if (pKIXPolicyNode == null) {
            if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
                throw new ExtCertPathValidatorException(string2, null, certPath, i3);
            }
            return null;
        }
        boolean isAnyPolicy = CertPathValidatorUtilities.isAnyPolicy(set);
        String string22 = StubApp.getString2(32631);
        if (isAnyPolicy) {
            if (!pKIXExtendedParameters.isExplicitPolicyRequired()) {
                return pKIXPolicyNode;
            }
            if (set2.isEmpty()) {
                throw new ExtCertPathValidatorException(string2, null, certPath, i3);
            }
            HashSet hashSet = new HashSet();
            for (List list : listArr) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i10);
                    if (string22.equals(pKIXPolicyNode2.getValidPolicy())) {
                        Iterator children = pKIXPolicyNode2.getChildren();
                        while (children.hasNext()) {
                            hashSet.add(children.next());
                        }
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                set2.contains(((PKIXPolicyNode) it.next()).getValidPolicy());
            }
            for (int i11 = size - 1; i11 >= 0; i11--) {
                List list2 = listArr[i11];
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) list2.get(i12);
                    if (!pKIXPolicyNode3.hasChildren()) {
                        pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode3);
                    }
                }
            }
            return pKIXPolicyNode;
        }
        HashSet hashSet2 = new HashSet();
        for (List list3 : listArr) {
            for (int i13 = 0; i13 < list3.size(); i13++) {
                PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) list3.get(i13);
                if (string22.equals(pKIXPolicyNode4.getValidPolicy())) {
                    Iterator children2 = pKIXPolicyNode4.getChildren();
                    while (children2.hasNext()) {
                        PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) children2.next();
                        if (!string22.equals(pKIXPolicyNode5.getValidPolicy())) {
                            hashSet2.add(pKIXPolicyNode5);
                        }
                    }
                }
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) it2.next();
            if (!set.contains(pKIXPolicyNode6.getValidPolicy())) {
                pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode6);
            }
        }
        if (pKIXPolicyNode != null) {
            for (int i14 = size - 1; i14 >= 0; i14--) {
                List list4 = listArr[i14];
                for (int i15 = 0; i15 < list4.size(); i15++) {
                    PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) list4.get(i15);
                    if (!pKIXPolicyNode7.hasChildren()) {
                        pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode7);
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }
}
