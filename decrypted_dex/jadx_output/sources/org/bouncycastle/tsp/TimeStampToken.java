package org.bouncycastle.tsp;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.ess.ESSCertID;
import org.bouncycastle.asn1.ess.ESSCertIDv2;
import org.bouncycastle.asn1.ess.SigningCertificate;
import org.bouncycastle.asn1.ess.SigningCertificateV2;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.tsp.TSTInfo;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.CMSTypedData;
import org.bouncycastle.cms.SignerId;
import org.bouncycastle.cms.SignerInformation;
import org.bouncycastle.cms.SignerInformationVerifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Store;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TimeStampToken {
    CertID certID;
    CMSSignedData tsToken;
    SignerInformation tsaSignerInfo;
    TimeStampTokenInfo tstInfo;

    public static class CertID {
        private ESSCertID certID;
        private ESSCertIDv2 certIDv2;

        public CertID(ESSCertID eSSCertID) {
            this.certID = eSSCertID;
            this.certIDv2 = null;
        }

        public byte[] getCertHash() {
            ESSCertID eSSCertID = this.certID;
            return eSSCertID != null ? eSSCertID.getCertHash() : this.certIDv2.getCertHash();
        }

        public AlgorithmIdentifier getHashAlgorithm() {
            return this.certID != null ? new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1) : this.certIDv2.getHashAlgorithm();
        }

        public IssuerSerial getIssuerSerial() {
            ESSCertID eSSCertID = this.certID;
            return eSSCertID != null ? eSSCertID.getIssuerSerial() : this.certIDv2.getIssuerSerial();
        }

        public CertID(ESSCertIDv2 eSSCertIDv2) {
            this.certIDv2 = eSSCertIDv2;
            this.certID = null;
        }
    }

    public TimeStampToken(ContentInfo contentInfo) throws TSPException, IOException {
        this(getSignedData(contentInfo));
    }

    private static CMSSignedData getSignedData(ContentInfo contentInfo) throws TSPException {
        try {
            return new CMSSignedData(contentInfo);
        } catch (CMSException e10) {
            throw new TSPException(StubApp.getString2(34917) + e10.getMessage(), e10.getCause());
        }
    }

    public Store<X509AttributeCertificateHolder> getAttributeCertificates() {
        return this.tsToken.getAttributeCertificates();
    }

    public Store<X509CRLHolder> getCRLs() {
        return this.tsToken.getCRLs();
    }

    public Store<X509CertificateHolder> getCertificates() {
        return this.tsToken.getCertificates();
    }

    public byte[] getEncoded() throws IOException {
        return this.tsToken.getEncoded(StubApp.getString2(21754));
    }

    public SignerId getSID() {
        return this.tsaSignerInfo.getSID();
    }

    public AttributeTable getSignedAttributes() {
        return this.tsaSignerInfo.getSignedAttributes();
    }

    public TimeStampTokenInfo getTimeStampInfo() {
        return this.tstInfo;
    }

    public AttributeTable getUnsignedAttributes() {
        return this.tsaSignerInfo.getUnsignedAttributes();
    }

    public boolean isSignatureValid(SignerInformationVerifier signerInformationVerifier) throws TSPException {
        try {
            return this.tsaSignerInfo.verify(signerInformationVerifier);
        } catch (CMSException e10) {
            if (e10.getUnderlyingException() != null) {
                throw new TSPException(e10.getMessage(), e10.getUnderlyingException());
            }
            throw new TSPException(StubApp.getString2(34918) + e10, e10);
        }
    }

    public CMSSignedData toCMSSignedData() {
        return this.tsToken;
    }

    public void validate(SignerInformationVerifier signerInformationVerifier) throws TSPException, TSPValidationException {
        if (!signerInformationVerifier.hasAssociatedCertificate()) {
            throw new IllegalArgumentException(StubApp.getString2(34925));
        }
        try {
            X509CertificateHolder associatedCertificate = signerInformationVerifier.getAssociatedCertificate();
            DigestCalculator digestCalculator = signerInformationVerifier.getDigestCalculator(this.certID.getHashAlgorithm());
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(associatedCertificate.getEncoded());
            outputStream.close();
            if (!Arrays.constantTimeAreEqual(this.certID.getCertHash(), digestCalculator.getDigest())) {
                throw new TSPValidationException(StubApp.getString2("34923"));
            }
            if (this.certID.getIssuerSerial() != null) {
                IssuerAndSerialNumber issuerAndSerialNumber = new IssuerAndSerialNumber(associatedCertificate.toASN1Structure());
                if (!this.certID.getIssuerSerial().getSerial().equals((ASN1Primitive) issuerAndSerialNumber.getSerialNumber())) {
                    throw new TSPValidationException(StubApp.getString2("34920"));
                }
                GeneralName[] names = this.certID.getIssuerSerial().getIssuer().getNames();
                for (int i3 = 0; i3 != names.length; i3++) {
                    if (names[i3].getTagNo() != 4 || !X500Name.getInstance(names[i3].getName()).equals(X500Name.getInstance(issuerAndSerialNumber.getName()))) {
                    }
                }
                throw new TSPValidationException(StubApp.getString2("34919"));
            }
            TSPUtil.validateCertificate(associatedCertificate);
            if (!associatedCertificate.isValidOn(this.tstInfo.getGenTime())) {
                throw new TSPValidationException(StubApp.getString2("34922"));
            }
            if (!this.tsaSignerInfo.verify(signerInformationVerifier)) {
                throw new TSPValidationException(StubApp.getString2("34921"));
            }
        } catch (IOException e10) {
            throw new TSPException(b.h(StubApp.getString2(34924), e10), e10);
        } catch (CMSException e11) {
            if (e11.getUnderlyingException() != null) {
                throw new TSPException(e11.getMessage(), e11.getUnderlyingException());
            }
            throw new TSPException(StubApp.getString2(34918) + e11, e11);
        } catch (OperatorCreationException e12) {
            throw new TSPException(StubApp.getString2(28019) + e12.getMessage(), e12);
        }
    }

    public TimeStampToken(CMSSignedData cMSSignedData) throws TSPException, IOException {
        CertID certID;
        this.tsToken = cMSSignedData;
        if (!cMSSignedData.getSignedContentTypeOID().equals(PKCSObjectIdentifiers.id_ct_TSTInfo.getId())) {
            throw new TSPValidationException(StubApp.getString2(34916));
        }
        Collection<SignerInformation> signers = this.tsToken.getSignerInfos().getSigners();
        if (signers.size() != 1) {
            throw new IllegalArgumentException(StubApp.getString2(34914) + signers.size() + StubApp.getString2(34915));
        }
        this.tsaSignerInfo = signers.iterator().next();
        try {
            CMSTypedData signedContent = this.tsToken.getSignedContent();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            signedContent.write(byteArrayOutputStream);
            this.tstInfo = new TimeStampTokenInfo(TSTInfo.getInstance(ASN1Primitive.fromByteArray(byteArrayOutputStream.toByteArray())));
            Attribute attribute = this.tsaSignerInfo.getSignedAttributes().get(PKCSObjectIdentifiers.id_aa_signingCertificate);
            if (attribute != null) {
                certID = new CertID(ESSCertID.getInstance(SigningCertificate.getInstance(attribute.getAttrValues().getObjectAt(0)).getCerts()[0]));
            } else {
                Attribute attribute2 = this.tsaSignerInfo.getSignedAttributes().get(PKCSObjectIdentifiers.id_aa_signingCertificateV2);
                if (attribute2 == null) {
                    throw new TSPValidationException(StubApp.getString2("34913"));
                }
                certID = new CertID(ESSCertIDv2.getInstance(SigningCertificateV2.getInstance(attribute2.getAttrValues().getObjectAt(0)).getCerts()[0]));
            }
            this.certID = certID;
        } catch (CMSException e10) {
            throw new TSPException(e10.getMessage(), e10.getUnderlyingException());
        }
    }

    public byte[] getEncoded(String str) throws IOException {
        return this.tsToken.getEncoded(str);
    }
}
