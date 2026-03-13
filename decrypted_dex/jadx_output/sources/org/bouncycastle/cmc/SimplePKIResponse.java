package org.bouncycastle.cmc;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Store;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SimplePKIResponse implements Encodable {
    private final CMSSignedData certificateResponse;

    public SimplePKIResponse(ContentInfo contentInfo) throws CMCException {
        try {
            CMSSignedData cMSSignedData = new CMSSignedData(contentInfo);
            this.certificateResponse = cMSSignedData;
            if (cMSSignedData.getSignerInfos().size() != 0) {
                throw new CMCException(StubApp.getString2(28130));
            }
            if (cMSSignedData.getSignedContent() != null) {
                throw new CMCException(StubApp.getString2(28129));
            }
        } catch (CMSException e10) {
            throw new CMCException(StubApp.getString2(28108) + e10.getMessage(), e10);
        }
    }

    private static ContentInfo parseBytes(byte[] bArr) throws CMCException {
        try {
            return ContentInfo.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (Exception e10) {
            throw new CMCException(u.r(e10, new StringBuilder(StubApp.getString2(28012))), e10);
        }
    }

    public Store<X509CRLHolder> getCRLs() {
        return this.certificateResponse.getCRLs();
    }

    public Store<X509CertificateHolder> getCertificates() {
        return this.certificateResponse.getCertificates();
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return this.certificateResponse.getEncoded();
    }

    public SimplePKIResponse(byte[] bArr) throws CMCException {
        this(parseBytes(bArr));
    }
}
