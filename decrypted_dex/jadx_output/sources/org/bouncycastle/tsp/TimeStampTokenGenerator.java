package org.bouncycastle.tsp;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.ess.ESSCertID;
import org.bouncycastle.asn1.ess.ESSCertIDv2;
import org.bouncycastle.asn1.ess.SigningCertificate;
import org.bouncycastle.asn1.ess.SigningCertificateV2;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.tsp.Accuracy;
import org.bouncycastle.asn1.tsp.MessageImprint;
import org.bouncycastle.asn1.tsp.TSTInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSAttributeTableGenerationException;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.SignerInfoGenerator;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Store;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TimeStampTokenGenerator {
    public static final int R_HUNDREDTHS_OF_SECONDS = 2;
    public static final int R_MICROSECONDS = 2;
    public static final int R_MILLISECONDS = 3;
    public static final int R_SECONDS = 0;
    public static final int R_TENTHS_OF_SECONDS = 1;
    private int accuracyMicros;
    private int accuracyMillis;
    private int accuracySeconds;
    private List attrCerts;
    private List certs;
    private List crls;
    private Locale locale;
    boolean ordering;
    private Map otherRevoc;
    private int resolution;
    private SignerInfoGenerator signerInfoGen;
    GeneralName tsa;
    private ASN1ObjectIdentifier tsaPolicyOID;

    public TimeStampTokenGenerator(SignerInfoGenerator signerInfoGenerator, DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier) throws IllegalArgumentException, TSPException {
        this(signerInfoGenerator, digestCalculator, aSN1ObjectIdentifier, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r1.length() > r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        r1.delete(r4, r1.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1.length() > r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.bouncycastle.asn1.ASN1GeneralizedTime createGeneralizedTime(java.util.Date r6) throws org.bouncycastle.tsp.TSPException {
        /*
            r5 = this;
            java.util.Locale r0 = r5.locale
            r1 = 26749(0x687d, float:3.7483E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            if (r0 != 0) goto L11
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r1)
            goto L18
        L11:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r2 = r5.locale
            r0.<init>(r1, r2)
        L18:
            java.util.SimpleTimeZone r1 = new java.util.SimpleTimeZone
            r2 = 0
            r3 = 4928(0x1340, float:6.906E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r1.<init>(r2, r3)
            r0.setTimeZone(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = r0.format(r6)
            r1.<init>(r6)
            r6 = 1
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            int r6 = r1.indexOf(r6)
            if (r6 >= 0) goto L4b
            r1.append(r3)
            org.bouncycastle.asn1.ASN1GeneralizedTime r6 = new org.bouncycastle.asn1.ASN1GeneralizedTime
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            return r6
        L4b:
            int r0 = r5.resolution
            r2 = 1
            if (r0 == r2) goto L82
            r4 = 2
            if (r0 == r4) goto L72
            r4 = 3
            if (r0 != r4) goto L57
            goto L8b
        L57:
            org.bouncycastle.tsp.TSPException r6 = new org.bouncycastle.tsp.TSPException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 34928(0x8870, float:4.8945E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            int r1 = r5.resolution
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L72:
            int r0 = r1.length()
            int r4 = r6 + 3
            if (r0 <= r4) goto L8b
        L7a:
            int r0 = r1.length()
            r1.delete(r4, r0)
            goto L8b
        L82:
            int r0 = r1.length()
            int r4 = r6 + 2
            if (r0 <= r4) goto L8b
            goto L7a
        L8b:
            int r0 = r1.length()
            int r0 = r0 - r2
            char r0 = r1.charAt(r0)
            r4 = 48
            if (r0 != r4) goto La1
            int r0 = r1.length()
            int r0 = r0 - r2
            r1.deleteCharAt(r0)
            goto L8b
        La1:
            int r0 = r1.length()
            int r0 = r0 - r2
            if (r0 != r6) goto Lb0
            int r6 = r1.length()
            int r6 = r6 - r2
            r1.deleteCharAt(r6)
        Lb0:
            r1.append(r3)
            org.bouncycastle.asn1.ASN1GeneralizedTime r6 = new org.bouncycastle.asn1.ASN1GeneralizedTime
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tsp.TimeStampTokenGenerator.createGeneralizedTime(java.util.Date):org.bouncycastle.asn1.ASN1GeneralizedTime");
    }

    public void addAttributeCertificates(Store store) {
        this.attrCerts.addAll(store.getMatches(null));
    }

    public void addCRLs(Store store) {
        this.crls.addAll(store.getMatches(null));
    }

    public void addCertificates(Store store) {
        this.certs.addAll(store.getMatches(null));
    }

    public void addOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, Store store) {
        this.otherRevoc.put(aSN1ObjectIdentifier, store.getMatches(null));
    }

    public TimeStampToken generate(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date) throws TSPException {
        return generate(timeStampRequest, bigInteger, date, null);
    }

    public void setAccuracyMicros(int i3) {
        this.accuracyMicros = i3;
    }

    public void setAccuracyMillis(int i3) {
        this.accuracyMillis = i3;
    }

    public void setAccuracySeconds(int i3) {
        this.accuracySeconds = i3;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setOrdering(boolean z2) {
        this.ordering = z2;
    }

    public void setResolution(int i3) {
        this.resolution = i3;
    }

    public void setTSA(GeneralName generalName) {
        this.tsa = generalName;
    }

    public TimeStampTokenGenerator(final SignerInfoGenerator signerInfoGenerator, DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2) throws IllegalArgumentException, TSPException {
        SignerInfoGenerator signerInfoGenerator2;
        this.resolution = 0;
        this.locale = null;
        this.accuracySeconds = -1;
        this.accuracyMillis = -1;
        this.accuracyMicros = -1;
        this.ordering = false;
        this.tsa = null;
        this.certs = new ArrayList();
        this.crls = new ArrayList();
        this.attrCerts = new ArrayList();
        this.otherRevoc = new HashMap();
        this.signerInfoGen = signerInfoGenerator;
        this.tsaPolicyOID = aSN1ObjectIdentifier;
        if (!signerInfoGenerator.hasAssociatedCertificate()) {
            throw new IllegalArgumentException(StubApp.getString2(34927));
        }
        X509CertificateHolder associatedCertificate = signerInfoGenerator.getAssociatedCertificate();
        TSPUtil.validateCertificate(associatedCertificate);
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(associatedCertificate.getEncoded());
            outputStream.close();
            if (digestCalculator.getAlgorithmIdentifier().getAlgorithm().equals((ASN1Primitive) OIWObjectIdentifiers.idSHA1)) {
                final ESSCertID eSSCertID = new ESSCertID(digestCalculator.getDigest(), z2 ? new IssuerSerial(new GeneralNames(new GeneralName(associatedCertificate.getIssuer())), associatedCertificate.getSerialNumber()) : null);
                signerInfoGenerator2 = new SignerInfoGenerator(signerInfoGenerator, new CMSAttributeTableGenerator() { // from class: org.bouncycastle.tsp.TimeStampTokenGenerator.1
                    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
                    public AttributeTable getAttributes(Map map) throws CMSAttributeTableGenerationException {
                        AttributeTable attributes = signerInfoGenerator.getSignedAttributeTableGenerator().getAttributes(map);
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_aa_signingCertificate;
                        return attributes.get(aSN1ObjectIdentifier2) == null ? attributes.add(aSN1ObjectIdentifier2, new SigningCertificate(eSSCertID)) : attributes;
                    }
                }, signerInfoGenerator.getUnsignedAttributeTableGenerator());
            } else {
                final ESSCertIDv2 eSSCertIDv2 = new ESSCertIDv2(new AlgorithmIdentifier(digestCalculator.getAlgorithmIdentifier().getAlgorithm()), digestCalculator.getDigest(), z2 ? new IssuerSerial(new GeneralNames(new GeneralName(associatedCertificate.getIssuer())), new ASN1Integer(associatedCertificate.getSerialNumber())) : null);
                signerInfoGenerator2 = new SignerInfoGenerator(signerInfoGenerator, new CMSAttributeTableGenerator() { // from class: org.bouncycastle.tsp.TimeStampTokenGenerator.2
                    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
                    public AttributeTable getAttributes(Map map) throws CMSAttributeTableGenerationException {
                        AttributeTable attributes = signerInfoGenerator.getSignedAttributeTableGenerator().getAttributes(map);
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_aa_signingCertificateV2;
                        return attributes.get(aSN1ObjectIdentifier2) == null ? attributes.add(aSN1ObjectIdentifier2, new SigningCertificateV2(eSSCertIDv2)) : attributes;
                    }
                }, signerInfoGenerator.getUnsignedAttributeTableGenerator());
            }
            this.signerInfoGen = signerInfoGenerator2;
        } catch (IOException e10) {
            throw new TSPException(StubApp.getString2(34926), e10);
        }
    }

    public TimeStampToken generate(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date, Extensions extensions) throws TSPException {
        MessageImprint messageImprint = new MessageImprint(timeStampRequest.getMessageImprintAlgID(), timeStampRequest.getMessageImprintDigest());
        int i3 = this.accuracySeconds;
        Accuracy accuracy = (i3 > 0 || this.accuracyMillis > 0 || this.accuracyMicros > 0) ? new Accuracy(i3 > 0 ? new ASN1Integer(this.accuracySeconds) : null, this.accuracyMillis > 0 ? new ASN1Integer(this.accuracyMillis) : null, this.accuracyMicros > 0 ? new ASN1Integer(this.accuracyMicros) : null) : null;
        boolean z2 = this.ordering;
        ASN1Boolean aSN1Boolean = z2 ? ASN1Boolean.getInstance(z2) : null;
        ASN1Integer aSN1Integer = timeStampRequest.getNonce() != null ? new ASN1Integer(timeStampRequest.getNonce()) : null;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.tsaPolicyOID;
        if (timeStampRequest.getReqPolicy() != null) {
            aSN1ObjectIdentifier = timeStampRequest.getReqPolicy();
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = aSN1ObjectIdentifier;
        Extensions extensions2 = timeStampRequest.getExtensions();
        if (extensions != null) {
            ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
            if (extensions2 != null) {
                Enumeration oids = extensions2.oids();
                while (oids.hasMoreElements()) {
                    extensionsGenerator.addExtension(extensions2.getExtension(ASN1ObjectIdentifier.getInstance(oids.nextElement())));
                }
            }
            Enumeration oids2 = extensions.oids();
            while (oids2.hasMoreElements()) {
                extensionsGenerator.addExtension(extensions.getExtension(ASN1ObjectIdentifier.getInstance(oids2.nextElement())));
            }
            extensions2 = extensionsGenerator.generate();
        }
        TSTInfo tSTInfo = new TSTInfo(aSN1ObjectIdentifier2, messageImprint, new ASN1Integer(bigInteger), this.resolution == 0 ? this.locale == null ? new ASN1GeneralizedTime(date) : new ASN1GeneralizedTime(date, this.locale) : createGeneralizedTime(date), accuracy, aSN1Boolean, aSN1Integer, this.tsa, extensions2);
        try {
            CMSSignedDataGenerator cMSSignedDataGenerator = new CMSSignedDataGenerator();
            if (timeStampRequest.getCertReq()) {
                cMSSignedDataGenerator.addCertificates(new CollectionStore(this.certs));
                cMSSignedDataGenerator.addAttributeCertificates(new CollectionStore(this.attrCerts));
            }
            cMSSignedDataGenerator.addCRLs(new CollectionStore(this.crls));
            if (!this.otherRevoc.isEmpty()) {
                for (ASN1ObjectIdentifier aSN1ObjectIdentifier3 : this.otherRevoc.keySet()) {
                    cMSSignedDataGenerator.addOtherRevocationInfo(aSN1ObjectIdentifier3, new CollectionStore((Collection) this.otherRevoc.get(aSN1ObjectIdentifier3)));
                }
            }
            cMSSignedDataGenerator.addSignerInfoGenerator(this.signerInfoGen);
            return new TimeStampToken(cMSSignedDataGenerator.generate(new CMSProcessableByteArray(PKCSObjectIdentifiers.id_ct_TSTInfo, tSTInfo.getEncoded(StubApp.getString2("26791"))), true));
        } catch (IOException e10) {
            throw new TSPException(StubApp.getString2(34929), e10);
        } catch (CMSException e11) {
            throw new TSPException(StubApp.getString2(34930), e11);
        }
    }
}
