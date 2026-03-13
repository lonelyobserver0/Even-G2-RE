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
import org.bouncycastle.cms.CMSSignedData;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DVCSResponse extends DVCSMessage {
    private org.bouncycastle.asn1.dvcs.DVCSResponse asn1;

    public DVCSResponse(ContentInfo contentInfo) throws DVCSConstructionException {
        super(contentInfo);
        if (!DVCSObjectIdentifiers.id_ct_DVCSResponseData.equals((ASN1Primitive) contentInfo.getContentType())) {
            throw new DVCSConstructionException(StubApp.getString2(29412));
        }
        try {
            this.asn1 = contentInfo.getContent().toASN1Primitive() instanceof ASN1Sequence ? org.bouncycastle.asn1.dvcs.DVCSResponse.getInstance(contentInfo.getContent()) : org.bouncycastle.asn1.dvcs.DVCSResponse.getInstance(ASN1OctetString.getInstance(contentInfo.getContent()).getOctets());
        } catch (Exception e10) {
            throw new DVCSConstructionException(u.r(e10, new StringBuilder(StubApp.getString2(29409))), e10);
        }
    }

    @Override // org.bouncycastle.dvcs.DVCSMessage
    public ASN1Encodable getContent() {
        return this.asn1;
    }

    public DVCSResponse(CMSSignedData cMSSignedData) throws DVCSConstructionException {
        this(SignedData.getInstance(cMSSignedData.toASN1Structure().getContent()).getEncapContentInfo());
    }
}
