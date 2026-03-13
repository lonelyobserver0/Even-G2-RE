package org.bouncycastle.pkcs;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SafeBag;
import org.bouncycastle.cms.CMSEncryptedData;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.InputDecryptorProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS12SafeBagFactory {
    private ASN1Sequence safeBagSeq;

    public PKCS12SafeBagFactory(ContentInfo contentInfo) {
        if (contentInfo.getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.encryptedData)) {
            throw new IllegalArgumentException(StubApp.getString2(33897));
        }
        this.safeBagSeq = ASN1Sequence.getInstance(ASN1OctetString.getInstance(contentInfo.getContent()).getOctets());
    }

    public PKCS12SafeBag[] getSafeBags() {
        PKCS12SafeBag[] pKCS12SafeBagArr = new PKCS12SafeBag[this.safeBagSeq.size()];
        for (int i3 = 0; i3 != this.safeBagSeq.size(); i3++) {
            pKCS12SafeBagArr[i3] = new PKCS12SafeBag(SafeBag.getInstance(this.safeBagSeq.getObjectAt(i3)));
        }
        return pKCS12SafeBagArr;
    }

    public PKCS12SafeBagFactory(ContentInfo contentInfo, InputDecryptorProvider inputDecryptorProvider) throws PKCSException {
        if (!contentInfo.getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.encryptedData)) {
            throw new IllegalArgumentException(StubApp.getString2(33897));
        }
        try {
            this.safeBagSeq = ASN1Sequence.getInstance(new CMSEncryptedData(org.bouncycastle.asn1.cms.ContentInfo.getInstance(contentInfo)).getContent(inputDecryptorProvider));
        } catch (CMSException e10) {
            throw new PKCSException(StubApp.getString2(33898) + e10.getMessage(), e10);
        }
    }
}
