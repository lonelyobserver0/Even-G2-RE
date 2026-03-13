package org.bouncycastle.dvcs;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.bouncycastle.asn1.dvcs.ServiceType;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.cms.CMSSignedData;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DVCSRequest extends DVCSMessage {
    private org.bouncycastle.asn1.dvcs.DVCSRequest asn1;
    private DVCSRequestData data;
    private DVCSRequestInfo reqInfo;

    public DVCSRequest(ContentInfo contentInfo) throws DVCSConstructionException {
        super(contentInfo);
        DVCSRequestData cCPDRequestData;
        if (!DVCSObjectIdentifiers.id_ct_DVCSRequestData.equals((ASN1Primitive) contentInfo.getContentType())) {
            throw new DVCSConstructionException(StubApp.getString2(29410));
        }
        try {
            this.asn1 = contentInfo.getContent().toASN1Primitive() instanceof ASN1Sequence ? org.bouncycastle.asn1.dvcs.DVCSRequest.getInstance(contentInfo.getContent()) : org.bouncycastle.asn1.dvcs.DVCSRequest.getInstance(ASN1OctetString.getInstance(contentInfo.getContent()).getOctets());
            DVCSRequestInfo dVCSRequestInfo = new DVCSRequestInfo(this.asn1.getRequestInformation());
            this.reqInfo = dVCSRequestInfo;
            int serviceType = dVCSRequestInfo.getServiceType();
            if (serviceType == ServiceType.CPD.getValue().intValue()) {
                cCPDRequestData = new CPDRequestData(this.asn1.getData());
            } else if (serviceType == ServiceType.VSD.getValue().intValue()) {
                cCPDRequestData = new VSDRequestData(this.asn1.getData());
            } else if (serviceType == ServiceType.VPKC.getValue().intValue()) {
                cCPDRequestData = new VPKCRequestData(this.asn1.getData());
            } else {
                if (serviceType != ServiceType.CCPD.getValue().intValue()) {
                    throw new DVCSConstructionException(u.p(serviceType, StubApp.getString2(29408)));
                }
                cCPDRequestData = new CCPDRequestData(this.asn1.getData());
            }
            this.data = cCPDRequestData;
        } catch (Exception e10) {
            throw new DVCSConstructionException(u.r(e10, new StringBuilder(StubApp.getString2(29409))), e10);
        }
    }

    @Override // org.bouncycastle.dvcs.DVCSMessage
    public ASN1Encodable getContent() {
        return this.asn1;
    }

    public DVCSRequestData getData() {
        return this.data;
    }

    public DVCSRequestInfo getRequestInfo() {
        return this.reqInfo;
    }

    public GeneralName getTransactionIdentifier() {
        return this.asn1.getTransactionIdentifier();
    }

    public DVCSRequest(CMSSignedData cMSSignedData) throws DVCSConstructionException {
        this(SignedData.getInstance(cMSSignedData.toASN1Structure().getContent()).getEncapContentInfo());
    }
}
