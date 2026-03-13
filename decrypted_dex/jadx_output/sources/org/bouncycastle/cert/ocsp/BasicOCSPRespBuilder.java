package org.bouncycastle.cert.ocsp;

import com.stub.StubApp;
import i2.u;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.CertStatus;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BasicOCSPRespBuilder {
    private RespID responderID;
    private List list = new ArrayList();
    private Extensions responseExtensions = null;

    public static class ResponseObject {
        CertificateID certId;
        CertStatus certStatus;
        Extensions extensions;
        ASN1GeneralizedTime nextUpdate;
        ASN1GeneralizedTime thisUpdate;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ResponseObject(org.bouncycastle.cert.ocsp.CertificateID r5, org.bouncycastle.cert.ocsp.CertificateStatus r6, java.util.Date r7, java.util.Date r8, org.bouncycastle.asn1.x509.Extensions r9) {
            /*
                r4 = this;
                r4.<init>()
                r4.certId = r5
                r5 = 0
                if (r6 != 0) goto L10
                org.bouncycastle.asn1.ocsp.CertStatus r6 = new org.bouncycastle.asn1.ocsp.CertStatus
                r6.<init>()
            Ld:
                r4.certStatus = r6
                goto L57
            L10:
                boolean r0 = r6 instanceof org.bouncycastle.cert.ocsp.UnknownStatus
                if (r0 == 0) goto L1d
                org.bouncycastle.asn1.ocsp.CertStatus r6 = new org.bouncycastle.asn1.ocsp.CertStatus
                r0 = 2
                org.bouncycastle.asn1.DERNull r1 = org.bouncycastle.asn1.DERNull.INSTANCE
                r6.<init>(r0, r1)
                goto Ld
            L1d:
                org.bouncycastle.cert.ocsp.RevokedStatus r6 = (org.bouncycastle.cert.ocsp.RevokedStatus) r6
                boolean r0 = r6.hasRevocationReason()
                if (r0 == 0) goto L43
                org.bouncycastle.asn1.ocsp.CertStatus r0 = new org.bouncycastle.asn1.ocsp.CertStatus
                org.bouncycastle.asn1.ocsp.RevokedInfo r1 = new org.bouncycastle.asn1.ocsp.RevokedInfo
                org.bouncycastle.asn1.ASN1GeneralizedTime r2 = new org.bouncycastle.asn1.ASN1GeneralizedTime
                java.util.Date r3 = r6.getRevocationTime()
                r2.<init>(r3)
                int r6 = r6.getRevocationReason()
                org.bouncycastle.asn1.x509.CRLReason r6 = org.bouncycastle.asn1.x509.CRLReason.lookup(r6)
                r1.<init>(r2, r6)
                r0.<init>(r1)
            L40:
                r4.certStatus = r0
                goto L57
            L43:
                org.bouncycastle.asn1.ocsp.CertStatus r0 = new org.bouncycastle.asn1.ocsp.CertStatus
                org.bouncycastle.asn1.ocsp.RevokedInfo r1 = new org.bouncycastle.asn1.ocsp.RevokedInfo
                org.bouncycastle.asn1.ASN1GeneralizedTime r2 = new org.bouncycastle.asn1.ASN1GeneralizedTime
                java.util.Date r6 = r6.getRevocationTime()
                r2.<init>(r6)
                r1.<init>(r2, r5)
                r0.<init>(r1)
                goto L40
            L57:
                org.bouncycastle.asn1.DERGeneralizedTime r6 = new org.bouncycastle.asn1.DERGeneralizedTime
                r6.<init>(r7)
                r4.thisUpdate = r6
                if (r8 == 0) goto L65
                org.bouncycastle.asn1.DERGeneralizedTime r5 = new org.bouncycastle.asn1.DERGeneralizedTime
                r5.<init>(r8)
            L65:
                r4.nextUpdate = r5
                r4.extensions = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder.ResponseObject.<init>(org.bouncycastle.cert.ocsp.CertificateID, org.bouncycastle.cert.ocsp.CertificateStatus, java.util.Date, java.util.Date, org.bouncycastle.asn1.x509.Extensions):void");
        }

        public SingleResponse toResponse() throws Exception {
            return new SingleResponse(this.certId.toASN1Primitive(), this.certStatus, this.thisUpdate, this.nextUpdate, this.extensions);
        }
    }

    public BasicOCSPRespBuilder(SubjectPublicKeyInfo subjectPublicKeyInfo, DigestCalculator digestCalculator) throws OCSPException {
        this.responderID = new RespID(subjectPublicKeyInfo, digestCalculator);
    }

    public BasicOCSPRespBuilder addResponse(CertificateID certificateID, CertificateStatus certificateStatus) {
        addResponse(certificateID, certificateStatus, new Date(), null, null);
        return this;
    }

    public BasicOCSPResp build(ContentSigner contentSigner, X509CertificateHolder[] x509CertificateHolderArr, Date date) throws OCSPException {
        DERSequence dERSequence;
        Iterator it = this.list.iterator();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        while (it.hasNext()) {
            try {
                aSN1EncodableVector.add(((ResponseObject) it.next()).toResponse());
            } catch (Exception e10) {
                throw new OCSPException(StubApp.getString2(28097), e10);
            }
        }
        ResponseData responseData = new ResponseData(this.responderID.toASN1Primitive(), new ASN1GeneralizedTime(date), new DERSequence(aSN1EncodableVector), this.responseExtensions);
        try {
            OutputStream outputStream = contentSigner.getOutputStream();
            outputStream.write(responseData.getEncoded(StubApp.getString2("26791")));
            outputStream.close();
            DERBitString dERBitString = new DERBitString(contentSigner.getSignature());
            AlgorithmIdentifier algorithmIdentifier = contentSigner.getAlgorithmIdentifier();
            if (x509CertificateHolderArr == null || x509CertificateHolderArr.length <= 0) {
                dERSequence = null;
            } else {
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                for (int i3 = 0; i3 != x509CertificateHolderArr.length; i3++) {
                    aSN1EncodableVector2.add(x509CertificateHolderArr[i3].toASN1Structure());
                }
                dERSequence = new DERSequence(aSN1EncodableVector2);
            }
            return new BasicOCSPResp(new BasicOCSPResponse(responseData, algorithmIdentifier, dERBitString, dERSequence));
        } catch (Exception e11) {
            throw new OCSPException(u.r(e11, new StringBuilder(StubApp.getString2(28098))), e11);
        }
    }

    public BasicOCSPRespBuilder setResponseExtensions(Extensions extensions) {
        this.responseExtensions = extensions;
        return this;
    }

    public BasicOCSPRespBuilder(RespID respID) {
        this.responderID = respID;
    }

    public BasicOCSPRespBuilder addResponse(CertificateID certificateID, CertificateStatus certificateStatus, Date date, Date date2) {
        addResponse(certificateID, certificateStatus, date, date2, null);
        return this;
    }

    public BasicOCSPRespBuilder addResponse(CertificateID certificateID, CertificateStatus certificateStatus, Date date, Date date2, Extensions extensions) {
        this.list.add(new ResponseObject(certificateID, certificateStatus, date, date2, extensions));
        return this;
    }

    public BasicOCSPRespBuilder addResponse(CertificateID certificateID, CertificateStatus certificateStatus, Date date, Extensions extensions) {
        addResponse(certificateID, certificateStatus, new Date(), date, extensions);
        return this;
    }

    public BasicOCSPRespBuilder addResponse(CertificateID certificateID, CertificateStatus certificateStatus, Extensions extensions) {
        addResponse(certificateID, certificateStatus, new Date(), null, extensions);
        return this;
    }
}
