package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cms.CompressedData;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.operator.InputExpanderProvider;
import org.bouncycastle.util.Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSCompressedData implements Encodable {
    CompressedData comData;
    ContentInfo contentInfo;

    public CMSCompressedData(InputStream inputStream) throws CMSException {
        this(CMSUtils.readContentInfo(inputStream));
    }

    public ASN1ObjectIdentifier getCompressedContentType() {
        return this.comData.getEncapContentInfo().getContentType();
    }

    public byte[] getContent(InputExpanderProvider inputExpanderProvider) throws CMSException {
        try {
            return CMSUtils.streamToByteArray(inputExpanderProvider.get(this.comData.getCompressionAlgorithmIdentifier()).getInputStream(((ASN1OctetString) this.comData.getEncapContentInfo().getContent()).getOctetStream()));
        } catch (IOException e10) {
            throw new CMSException(StubApp.getString2(28145), e10);
        }
    }

    public CMSTypedStream getContentStream(InputExpanderProvider inputExpanderProvider) {
        ContentInfo encapContentInfo = this.comData.getEncapContentInfo();
        return new CMSTypedStream(encapContentInfo.getContentType(), inputExpanderProvider.get(this.comData.getCompressionAlgorithmIdentifier()).getInputStream(((ASN1OctetString) encapContentInfo.getContent()).getOctetStream()));
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.contentInfo.getContentType();
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return this.contentInfo.getEncoded();
    }

    public ContentInfo toASN1Structure() {
        return this.contentInfo;
    }

    public CMSCompressedData(ContentInfo contentInfo) throws CMSException {
        String string2 = StubApp.getString2(28144);
        this.contentInfo = contentInfo;
        try {
            this.comData = CompressedData.getInstance(contentInfo.getContent());
        } catch (ClassCastException e10) {
            throw new CMSException(string2, e10);
        } catch (IllegalArgumentException e11) {
            throw new CMSException(string2, e11);
        }
    }

    public CMSCompressedData(byte[] bArr) throws CMSException {
        this(CMSUtils.readContentInfo(bArr));
    }
}
