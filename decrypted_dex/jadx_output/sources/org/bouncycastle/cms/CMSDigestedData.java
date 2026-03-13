package org.bouncycastle.cms;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.DigestedData;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSDigestedData implements Encodable {
    private ContentInfo contentInfo;
    private DigestedData digestedData;

    public CMSDigestedData(InputStream inputStream) throws CMSException {
        this(CMSUtils.readContentInfo(inputStream));
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.contentInfo.getContentType();
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.digestedData.getDigestAlgorithm();
    }

    public CMSProcessable getDigestedContent() throws CMSException {
        ContentInfo encapContentInfo = this.digestedData.getEncapContentInfo();
        try {
            return new CMSProcessableByteArray(encapContentInfo.getContentType(), ((ASN1OctetString) encapContentInfo.getContent()).getOctets());
        } catch (Exception e10) {
            throw new CMSException(StubApp.getString2(28152), e10);
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return this.contentInfo.getEncoded();
    }

    public ContentInfo toASN1Structure() {
        return this.contentInfo;
    }

    public boolean verify(DigestCalculatorProvider digestCalculatorProvider) throws CMSException {
        try {
            ContentInfo encapContentInfo = this.digestedData.getEncapContentInfo();
            DigestCalculator digestCalculator = digestCalculatorProvider.get(this.digestedData.getDigestAlgorithm());
            digestCalculator.getOutputStream().write(((ASN1OctetString) encapContentInfo.getContent()).getOctets());
            return Arrays.areEqual(this.digestedData.getDigest(), digestCalculator.getDigest());
        } catch (IOException e10) {
            throw new CMSException(u.q(e10, new StringBuilder(StubApp.getString2(28153))), e10);
        } catch (OperatorCreationException e11) {
            throw new CMSException(StubApp.getString2(28101) + e11.getMessage(), e11);
        }
    }

    public CMSDigestedData(ContentInfo contentInfo) throws CMSException {
        String string2 = StubApp.getString2(28144);
        this.contentInfo = contentInfo;
        try {
            this.digestedData = DigestedData.getInstance(contentInfo.getContent());
        } catch (ClassCastException e10) {
            throw new CMSException(string2, e10);
        } catch (IllegalArgumentException e11) {
            throw new CMSException(string2, e11);
        }
    }

    public CMSDigestedData(byte[] bArr) throws CMSException {
        this(CMSUtils.readContentInfo(bArr));
    }
}
