package org.bouncycastle.x509;

import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;

    /* renamed from: n, reason: collision with root package name */
    protected int f19574n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String RESOURCE_NAME = StubApp.getString2(35046);
    private static final String QC_STATEMENT = Extension.qCStatements.getId();
    private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i3 = 0; i3 != bArr.length; i3++) {
                stringBuffer.append(Integer.toHexString(bArr[i3] & UByte.MAX_VALUE));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() {
        String string2 = StubApp.getString2(35046);
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e10) {
                    throw new CertPathReviewerException(new ErrorBundle(string2, StubApp.getString2("35049"), new Object[]{e10.getMessage(), e10, e10.getClass().getName()}), e10);
                }
            } catch (CertPathReviewerException e11) {
                addError(e11.getErrorMessage(), e11.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e12) {
                        throw new CertPathReviewerException(new ErrorBundle(string2, StubApp.getString2("35047"), new Object[]{e12.getMessage(), e12, e12.getClass().getName()}), e12.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(string2, StubApp.getString2("35048"), new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                boolean isSelfIssued = CertPathValidatorUtilities.isSelfIssued(x509Certificate);
                String string2 = StubApp.getString2(35046);
                if (!isSelfIssued) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        for (int i3 = 0; i3 < aSN1Sequence2.size(); i3++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i3));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e10) {
                                                throw new CertPathReviewerException(new ErrorBundle(string2, StubApp.getString2("35050"), new Object[]{new UntrustedInput(generalName)}), e10, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e11) {
                                    throw new CertPathReviewerException(new ErrorBundle(string2, StubApp.getString2("35051")), e11, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e12) {
                                throw new CertPathReviewerException(new ErrorBundle(string2, StubApp.getString2("35052"), new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e12, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e13) {
                            throw new CertPathReviewerException(new ErrorBundle(string2, StubApp.getString2("35053"), new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e13, this.certPath, size);
                        }
                    } catch (IOException e14) {
                        throw new CertPathReviewerException(new ErrorBundle(string2, StubApp.getString2("35054"), new Object[]{new UntrustedInput(subjectPrincipal)}), e14, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i10 = 0; i10 != excludedSubtrees.length; i10++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i10]);
                            }
                        }
                    }
                } catch (AnnotatedException e15) {
                    throw new CertPathReviewerException(new ErrorBundle(string2, StubApp.getString2("35055")), e15, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e16) {
            addError(e16.getErrorMessage(), e16.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        BigInteger pathLenConstraint;
        int intValue;
        int i3 = this.f19574n;
        int size = this.certs.size() - 1;
        int i10 = 0;
        while (true) {
            String string2 = StubApp.getString2(35046);
            if (size <= 0) {
                addNotification(new ErrorBundle(string2, StubApp.getString2(35058), new Object[]{Integers.valueOf(i10)}));
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (i3 <= 0) {
                    addError(new ErrorBundle(string2, StubApp.getString2(35056)));
                }
                i3--;
                i10++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(string2, StubApp.getString2(35057)), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && (pathLenConstraint = basicConstraints.getPathLenConstraint()) != null && (intValue = pathLenConstraint.intValue()) < i3) {
                i3 = intValue;
            }
            size--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x0165, code lost:
    
        r22 = org.bouncycastle.x509.CertPathValidatorUtilities.getQualifierSet(r10.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x016f, code lost:
    
        r9 = r5[r14 - 1];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0176, code lost:
    
        if (r10 >= r9.size()) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0178, code lost:
    
        r21 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r9.get(r10);
        r11 = r21.getExpectedPolicies().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x018c, code lost:
    
        if (r11.hasNext() == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x018e, code lost:
    
        r30 = r9;
        r9 = r11.next();
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0198, code lost:
    
        if ((r9 instanceof java.lang.String) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x019a, code lost:
    
        r9 = (java.lang.String) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01a7, code lost:
    
        r10 = r21.getChildren();
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01b1, code lost:
    
        if (r10.hasNext() == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01b3, code lost:
    
        r19 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01c3, code lost:
    
        if (r9.equals(((org.bouncycastle.jce.provider.PKIXPolicyNode) r10.next()).getValidPolicy()) == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01c5, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01c7, code lost:
    
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01ca, code lost:
    
        if (r17 != false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01cc, code lost:
    
        r10 = new java.util.HashSet();
        r10.add(r9);
        r17 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r14, r10, r21, r22, r9, false);
        r9 = r21;
        r9.addChild(r17);
        r21 = r9;
        r5[r14].add(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01f4, code lost:
    
        r9 = r30;
        r10 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x019f, code lost:
    
        if ((r9 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01a1, code lost:
    
        r9 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) r9).getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01f9, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x045d, code lost:
    
        r18 = r0;
        r25 = r8;
        r27 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0467, code lost:
    
        if (org.bouncycastle.x509.CertPathValidatorUtilities.isSelfIssued(r14) != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0469, code lost:
    
        if (r27 <= 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x046b, code lost:
    
        r9 = r27 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0470, code lost:
    
        r0 = (org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.x509.CertPathValidatorUtilities.getExtensionValue(r14, org.bouncycastle.x509.CertPathValidatorUtilities.POLICY_CONSTRAINTS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0478, code lost:
    
        if (r0 == null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x047a, code lost:
    
        r0 = r0.getObjects();
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0483, code lost:
    
        if (r0.hasMoreElements() == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0485, code lost:
    
        r2 = (org.bouncycastle.asn1.ASN1TaggedObject) r0.nextElement();
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x048f, code lost:
    
        if (r2.getTagNo() == 0) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x049c, code lost:
    
        if (org.bouncycastle.asn1.ASN1Integer.getInstance(r2, false).intValueExact() != 0) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x049e, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04a0, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x04a1, code lost:
    
        r0 = com.stub.StubApp.getString2(35066);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x04a9, code lost:
    
        if (r25 != null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04b1, code lost:
    
        if (r32.pkixParams.isExplicitPolicyRequired() != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04b3, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x05f9, code lost:
    
        if (r9 > 0) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x05fb, code lost:
    
        if (r13 == null) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x060e, code lost:
    
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle(r4, com.stub.StubApp.getString2("35067")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x04c2, code lost:
    
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle(r4, r0), r32.certPath, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x04c7, code lost:
    
        if (org.bouncycastle.x509.CertPathValidatorUtilities.isAnyPolicy(r18) == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x04cf, code lost:
    
        if (r32.pkixParams.isExplicitPolicyRequired() == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04d5, code lost:
    
        if (r15.isEmpty() != false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x04d7, code lost:
    
        r0 = new java.util.HashSet();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x04dd, code lost:
    
        if (r10 >= r3) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x04df, code lost:
    
        r2 = r5[r10];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x04e6, code lost:
    
        if (r6 >= r2.size()) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04e8, code lost:
    
        r8 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r2.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x04f6, code lost:
    
        if (r7.equals(r8.getValidPolicy()) == false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x04f8, code lost:
    
        r8 = r8.getChildren();
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0500, code lost:
    
        if (r8.hasNext() == false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0502, code lost:
    
        r0.add(r8.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x050a, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x050d, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0510, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0518, code lost:
    
        if (r0.hasNext() == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x051a, code lost:
    
        r15.contains(((org.bouncycastle.jce.provider.PKIXPolicyNode) r0.next()).getValidPolicy());
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0528, code lost:
    
        r0 = r32.f19574n - 1;
        r8 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0530, code lost:
    
        if (r0 < 0) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0532, code lost:
    
        r2 = r5[r0];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0539, code lost:
    
        if (r10 >= r2.size()) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x053b, code lost:
    
        r3 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r2.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0545, code lost:
    
        if (r3.hasChildren() != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0547, code lost:
    
        r8 = org.bouncycastle.x509.CertPathValidatorUtilities.removePolicyNode(r8, r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x054b, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x054e, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0551, code lost:
    
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0560, code lost:
    
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle(r4, r0), r32.certPath, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0561, code lost:
    
        r13 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0565, code lost:
    
        r0 = new java.util.HashSet();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x056b, code lost:
    
        if (r10 >= r3) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x056d, code lost:
    
        r2 = r5[r10];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0574, code lost:
    
        if (r6 >= r2.size()) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0576, code lost:
    
        r8 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r2.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0584, code lost:
    
        if (r7.equals(r8.getValidPolicy()) == false) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0586, code lost:
    
        r8 = r8.getChildren();
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x058e, code lost:
    
        if (r8.hasNext() == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0590, code lost:
    
        r11 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x059e, code lost:
    
        if (r7.equals(r11.getValidPolicy()) != false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x05a0, code lost:
    
        r0.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x05a4, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x05a7, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x05aa, code lost:
    
        r0 = r0.iterator();
        r8 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x05b4, code lost:
    
        if (r0.hasNext() == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x05b6, code lost:
    
        r2 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r0.next();
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x05c6, code lost:
    
        if (r6.contains(r2.getValidPolicy()) != false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x05c8, code lost:
    
        r8 = org.bouncycastle.x509.CertPathValidatorUtilities.removePolicyNode(r8, r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x05cd, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x05d0, code lost:
    
        if (r8 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x05d2, code lost:
    
        r0 = r32.f19574n - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x05d8, code lost:
    
        if (r0 < 0) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x05da, code lost:
    
        r2 = r5[r0];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x05e1, code lost:
    
        if (r10 >= r2.size()) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x05e3, code lost:
    
        r3 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r2.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x05ed, code lost:
    
        if (r3.hasChildren() != false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x05ef, code lost:
    
        r8 = org.bouncycastle.x509.CertPathValidatorUtilities.removePolicyNode(r8, r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x05f3, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x05f6, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x061b, code lost:
    
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle(r4, r13), r32.certPath, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x046e, code lost:
    
        r9 = r27;
     */
    /* JADX WARN: Removed duplicated region for block: B:223:0x014f A[Catch: CertPathReviewerException -> 0x00f6, TRY_LEAVE, TryCatch #4 {CertPathReviewerException -> 0x00f6, blocks: (B:15:0x0077, B:19:0x0090, B:22:0x009d, B:26:0x00b2, B:27:0x00bd, B:29:0x00c3, B:32:0x00e4, B:33:0x00ec, B:35:0x00f2, B:41:0x00fa, B:42:0x0106, B:48:0x0112, B:51:0x0119, B:52:0x0122, B:54:0x0128, B:57:0x0132, B:64:0x013b, B:66:0x013f, B:68:0x020f, B:70:0x0213, B:71:0x021c, B:73:0x0222, B:75:0x022e, B:81:0x0237, B:79:0x023a, B:85:0x023f, B:87:0x0247, B:88:0x0250, B:90:0x0256, B:99:0x0274, B:100:0x0284, B:101:0x0285, B:107:0x0289, B:109:0x0291, B:110:0x0297, B:112:0x029d, B:115:0x02c6, B:117:0x02d0, B:119:0x02d5, B:120:0x02e1, B:122:0x02e2, B:123:0x02ee, B:126:0x02f3, B:127:0x0306, B:129:0x030c, B:131:0x0332, B:133:0x034a, B:134:0x0341, B:137:0x034f, B:138:0x0355, B:140:0x035b, B:143:0x0363, B:156:0x0385, B:148:0x0368, B:149:0x0374, B:151:0x0376, B:152:0x0382, B:161:0x0391, B:170:0x03b3, B:172:0x03bd, B:173:0x03c1, B:175:0x03c7, B:189:0x03d7, B:178:0x03e4, B:199:0x03f1, B:201:0x03fb, B:105:0x0444, B:205:0x0405, B:206:0x0417, B:208:0x0418, B:209:0x0424, B:218:0x0426, B:219:0x0438, B:220:0x0145, B:221:0x0149, B:223:0x014f, B:226:0x0165, B:228:0x016f, B:229:0x0172, B:231:0x0178, B:232:0x0188, B:234:0x018e, B:236:0x019a, B:237:0x01a7, B:238:0x01ad, B:240:0x01b3, B:248:0x01cc, B:252:0x019d, B:254:0x01a1, B:257:0x01f9, B:261:0x0202, B:262:0x020e, B:269:0x0450, B:270:0x045c, B:272:0x045d, B:277:0x0470, B:279:0x047a, B:280:0x047f, B:282:0x0485, B:285:0x0493, B:300:0x04ab, B:307:0x05fe, B:308:0x060e, B:310:0x04b6, B:311:0x04c2, B:312:0x04c3, B:314:0x04c9, B:316:0x04d1, B:318:0x04d7, B:320:0x04df, B:321:0x04e2, B:323:0x04e8, B:325:0x04f8, B:326:0x04fc, B:328:0x0502, B:330:0x050a, B:333:0x050d, B:335:0x0510, B:336:0x0514, B:338:0x051a, B:340:0x0528, B:342:0x0532, B:343:0x0535, B:345:0x053b, B:347:0x0547, B:349:0x054b, B:352:0x054e, B:355:0x0554, B:356:0x0560, B:358:0x0565, B:360:0x056d, B:361:0x0570, B:363:0x0576, B:365:0x0586, B:366:0x058a, B:368:0x0590, B:371:0x05a0, B:376:0x05a4, B:379:0x05a7, B:381:0x05aa, B:382:0x05b0, B:384:0x05b6, B:386:0x05c8, B:392:0x05d2, B:394:0x05da, B:395:0x05dd, B:397:0x05e3, B:399:0x05ef, B:401:0x05f3, B:404:0x05f6, B:406:0x060f, B:407:0x061b), top: B:14:0x0077, inners: #0, #1, #2, #3, #5, #6, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x020f A[EDGE_INSN: B:264:0x020f->B:68:0x020f BREAK  A[LOOP:11: B:221:0x0149->B:263:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0213 A[Catch: CertPathReviewerException -> 0x00f6, TryCatch #4 {CertPathReviewerException -> 0x00f6, blocks: (B:15:0x0077, B:19:0x0090, B:22:0x009d, B:26:0x00b2, B:27:0x00bd, B:29:0x00c3, B:32:0x00e4, B:33:0x00ec, B:35:0x00f2, B:41:0x00fa, B:42:0x0106, B:48:0x0112, B:51:0x0119, B:52:0x0122, B:54:0x0128, B:57:0x0132, B:64:0x013b, B:66:0x013f, B:68:0x020f, B:70:0x0213, B:71:0x021c, B:73:0x0222, B:75:0x022e, B:81:0x0237, B:79:0x023a, B:85:0x023f, B:87:0x0247, B:88:0x0250, B:90:0x0256, B:99:0x0274, B:100:0x0284, B:101:0x0285, B:107:0x0289, B:109:0x0291, B:110:0x0297, B:112:0x029d, B:115:0x02c6, B:117:0x02d0, B:119:0x02d5, B:120:0x02e1, B:122:0x02e2, B:123:0x02ee, B:126:0x02f3, B:127:0x0306, B:129:0x030c, B:131:0x0332, B:133:0x034a, B:134:0x0341, B:137:0x034f, B:138:0x0355, B:140:0x035b, B:143:0x0363, B:156:0x0385, B:148:0x0368, B:149:0x0374, B:151:0x0376, B:152:0x0382, B:161:0x0391, B:170:0x03b3, B:172:0x03bd, B:173:0x03c1, B:175:0x03c7, B:189:0x03d7, B:178:0x03e4, B:199:0x03f1, B:201:0x03fb, B:105:0x0444, B:205:0x0405, B:206:0x0417, B:208:0x0418, B:209:0x0424, B:218:0x0426, B:219:0x0438, B:220:0x0145, B:221:0x0149, B:223:0x014f, B:226:0x0165, B:228:0x016f, B:229:0x0172, B:231:0x0178, B:232:0x0188, B:234:0x018e, B:236:0x019a, B:237:0x01a7, B:238:0x01ad, B:240:0x01b3, B:248:0x01cc, B:252:0x019d, B:254:0x01a1, B:257:0x01f9, B:261:0x0202, B:262:0x020e, B:269:0x0450, B:270:0x045c, B:272:0x045d, B:277:0x0470, B:279:0x047a, B:280:0x047f, B:282:0x0485, B:285:0x0493, B:300:0x04ab, B:307:0x05fe, B:308:0x060e, B:310:0x04b6, B:311:0x04c2, B:312:0x04c3, B:314:0x04c9, B:316:0x04d1, B:318:0x04d7, B:320:0x04df, B:321:0x04e2, B:323:0x04e8, B:325:0x04f8, B:326:0x04fc, B:328:0x0502, B:330:0x050a, B:333:0x050d, B:335:0x0510, B:336:0x0514, B:338:0x051a, B:340:0x0528, B:342:0x0532, B:343:0x0535, B:345:0x053b, B:347:0x0547, B:349:0x054b, B:352:0x054e, B:355:0x0554, B:356:0x0560, B:358:0x0565, B:360:0x056d, B:361:0x0570, B:363:0x0576, B:365:0x0586, B:366:0x058a, B:368:0x0590, B:371:0x05a0, B:376:0x05a4, B:379:0x05a7, B:381:0x05aa, B:382:0x05b0, B:384:0x05b6, B:386:0x05c8, B:392:0x05d2, B:394:0x05da, B:395:0x05dd, B:397:0x05e3, B:399:0x05ef, B:401:0x05f3, B:404:0x05f6, B:406:0x060f, B:407:0x061b), top: B:14:0x0077, inners: #0, #1, #2, #3, #5, #6, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0247 A[Catch: CertPathReviewerException -> 0x00f6, TryCatch #4 {CertPathReviewerException -> 0x00f6, blocks: (B:15:0x0077, B:19:0x0090, B:22:0x009d, B:26:0x00b2, B:27:0x00bd, B:29:0x00c3, B:32:0x00e4, B:33:0x00ec, B:35:0x00f2, B:41:0x00fa, B:42:0x0106, B:48:0x0112, B:51:0x0119, B:52:0x0122, B:54:0x0128, B:57:0x0132, B:64:0x013b, B:66:0x013f, B:68:0x020f, B:70:0x0213, B:71:0x021c, B:73:0x0222, B:75:0x022e, B:81:0x0237, B:79:0x023a, B:85:0x023f, B:87:0x0247, B:88:0x0250, B:90:0x0256, B:99:0x0274, B:100:0x0284, B:101:0x0285, B:107:0x0289, B:109:0x0291, B:110:0x0297, B:112:0x029d, B:115:0x02c6, B:117:0x02d0, B:119:0x02d5, B:120:0x02e1, B:122:0x02e2, B:123:0x02ee, B:126:0x02f3, B:127:0x0306, B:129:0x030c, B:131:0x0332, B:133:0x034a, B:134:0x0341, B:137:0x034f, B:138:0x0355, B:140:0x035b, B:143:0x0363, B:156:0x0385, B:148:0x0368, B:149:0x0374, B:151:0x0376, B:152:0x0382, B:161:0x0391, B:170:0x03b3, B:172:0x03bd, B:173:0x03c1, B:175:0x03c7, B:189:0x03d7, B:178:0x03e4, B:199:0x03f1, B:201:0x03fb, B:105:0x0444, B:205:0x0405, B:206:0x0417, B:208:0x0418, B:209:0x0424, B:218:0x0426, B:219:0x0438, B:220:0x0145, B:221:0x0149, B:223:0x014f, B:226:0x0165, B:228:0x016f, B:229:0x0172, B:231:0x0178, B:232:0x0188, B:234:0x018e, B:236:0x019a, B:237:0x01a7, B:238:0x01ad, B:240:0x01b3, B:248:0x01cc, B:252:0x019d, B:254:0x01a1, B:257:0x01f9, B:261:0x0202, B:262:0x020e, B:269:0x0450, B:270:0x045c, B:272:0x045d, B:277:0x0470, B:279:0x047a, B:280:0x047f, B:282:0x0485, B:285:0x0493, B:300:0x04ab, B:307:0x05fe, B:308:0x060e, B:310:0x04b6, B:311:0x04c2, B:312:0x04c3, B:314:0x04c9, B:316:0x04d1, B:318:0x04d7, B:320:0x04df, B:321:0x04e2, B:323:0x04e8, B:325:0x04f8, B:326:0x04fc, B:328:0x0502, B:330:0x050a, B:333:0x050d, B:335:0x0510, B:336:0x0514, B:338:0x051a, B:340:0x0528, B:342:0x0532, B:343:0x0535, B:345:0x053b, B:347:0x0547, B:349:0x054b, B:352:0x054e, B:355:0x0554, B:356:0x0560, B:358:0x0565, B:360:0x056d, B:361:0x0570, B:363:0x0576, B:365:0x0586, B:366:0x058a, B:368:0x0590, B:371:0x05a0, B:376:0x05a4, B:379:0x05a7, B:381:0x05aa, B:382:0x05b0, B:384:0x05b6, B:386:0x05c8, B:392:0x05d2, B:394:0x05da, B:395:0x05dd, B:397:0x05e3, B:399:0x05ef, B:401:0x05f3, B:404:0x05f6, B:406:0x060f, B:407:0x061b), top: B:14:0x0077, inners: #0, #1, #2, #3, #5, #6, #7, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkPolicy() {
        /*
            Method dump skipped, instructions count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkPolicy():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:31|(2:128|129)(2:33|(2:122|123)(3:35|(2:39|(1:41))|42))|(2:43|44)|45|(18:84|85|(15:87|88|89|(11:91|92|(2:95|93)|96|97|(2:100|98)|101|102|103|104|105)|112|92|(1:93)|96|97|(1:98)|101|102|103|104|105)|115|88|89|(0)|112|92|(1:93)|96|97|(1:98)|101|102|103|104|105)(1:47)|(1:51)|52|(7:54|(1:58)|59|60|(2:62|(1:64))(1:80)|65|(7:67|(1:79)|71|72|73|75|76))|83|71|72|73|75|76) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:84|85)|(3:(15:87|88|89|(11:91|92|(2:95|93)|96|97|(2:100|98)|101|102|103|104|105)|112|92|(1:93)|96|97|(1:98)|101|102|103|104|105)|104|105)|115|88|89|(0)|112|92|(1:93)|96|97|(1:98)|101|102|103) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:84|85|(15:87|88|89|(11:91|92|(2:95|93)|96|97|(2:100|98)|101|102|103|104|105)|112|92|(1:93)|96|97|(1:98)|101|102|103|104|105)|115|88|89|(0)|112|92|(1:93)|96|97|(1:98)|101|102|103|104|105) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0363, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0364, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f0, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(r10, com.stub.StubApp.getString2(35085)), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0421, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(r10, com.stub.StubApp.getString2(35093)), r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x033a A[LOOP:2: B:98:0x0334->B:100:0x033a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02eb A[Catch: AnnotatedException -> 0x02f0, TRY_LEAVE, TryCatch #14 {AnnotatedException -> 0x02f0, blocks: (B:89:0x02e3, B:91:0x02eb), top: B:88:0x02e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0312 A[LOOP:1: B:93:0x030c->B:95:0x0312, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkSignatures() {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkSignatures():void");
    }

    private X509CRL getCRL(String str) throws CertPathReviewerException {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals(StubApp.getString2("3589")) && !url.getProtocol().equals(StubApp.getString2("3396"))) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance(StubApp.getString2("19963"), StubApp.getString2("21668")).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e10) {
            throw new CertPathReviewerException(new ErrorBundle(StubApp.getString2(35046), StubApp.getString2(35094), new Object[]{new UntrustedInput(str), e10.getMessage(), e10, e10.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i3) {
        ErrorBundle errorBundle;
        String string2 = StubApp.getString2(35046);
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z2 = false;
            for (int i10 = 0; i10 < aSN1Sequence.size(); i10++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i10));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle(string2, StubApp.getString2("35095"));
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle(string2, StubApp.getString2("35096"));
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double doubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(string2, StubApp.getString2("35097"), new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(doubleValue)), monetaryValue}) : new ErrorBundle(string2, StubApp.getString2("35098"), new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(doubleValue)), monetaryValue}), i3);
                        } else {
                            addNotification(new ErrorBundle(string2, StubApp.getString2("35099"), new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i3);
                            z2 = true;
                        }
                    }
                }
                addNotification(errorBundle, i3);
            }
            return !z2;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle(string2, StubApp.getString2(35100)), i3);
            return false;
        }
    }

    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkCRLs(java.security.cert.PKIXParameters r23, java.security.cert.X509Certificate r24, java.util.Date r25, java.security.cert.X509Certificate r26, java.security.PublicKey r27, java.util.Vector r28, int r29) throws org.bouncycastle.x509.CertPathReviewerException {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkCRLs(java.security.cert.PKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.Vector, int):void");
    }

    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i3) throws CertPathReviewerException {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i3);
    }

    public void doChecks() {
        if (!this.initialized) {
            throw new IllegalStateException(StubApp.getString2(35125));
        }
        if (this.notifications != null) {
            return;
        }
        int i3 = this.f19574n;
        this.notifications = new List[i3 + 1];
        this.errors = new List[i3 + 1];
        int i10 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i10 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i10] = new ArrayList();
            this.errors[i10] = new ArrayList();
            i10++;
        }
    }

    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i3 = 0; i3 < names.length; i3++) {
                        if (names[i3].getTagNo() == 6) {
                            vector.add(((ASN1IA5String) names[i3].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.f19574n;
    }

    public List getErrors(int i3) {
        doChecks();
        return this.errors[i3 + 1];
    }

    public List getNotifications(int i3) {
        doChecks();
        return this.notifications[i3 + 1];
    }

    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i3 = 0; i3 < accessDescriptions.length; i3++) {
                if (accessDescriptions[i3].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i3].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    public Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                } else {
                    byte[] keyIdentifier = authorityKeyIdentifier.getKeyIdentifier();
                    if (keyIdentifier != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                    }
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(StubApp.getString2(35046), StubApp.getString2(35126)));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (this.initialized) {
            throw new IllegalStateException(StubApp.getString2(35129));
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException(StubApp.getString2(35128));
        }
        this.certPath = certPath;
        List<? extends Certificate> certificates = certPath.getCertificates();
        this.certs = certificates;
        this.f19574n = certificates.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(StubApp.getString2(35046), StubApp.getString2(35127)));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() {
        doChecks();
        int i3 = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i3 >= listArr.length) {
                return true;
            }
            if (!listArr[i3].isEmpty()) {
                return false;
            }
            i3++;
        }
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    public void addError(ErrorBundle errorBundle, int i3) {
        if (i3 < -1 || i3 >= this.f19574n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i3 + 1].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle, int i3) {
        if (i3 < -1 || i3 >= this.f19574n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i3 + 1].add(errorBundle);
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }
}
