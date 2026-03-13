package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.cms.CompressedDataParser;
import org.bouncycastle.asn1.cms.ContentInfoParser;
import org.bouncycastle.operator.InputExpanderProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSCompressedDataParser extends CMSContentInfoParser {
    public CMSCompressedDataParser(InputStream inputStream) throws CMSException {
        super(inputStream);
    }

    public CMSTypedStream getContent(InputExpanderProvider inputExpanderProvider) throws CMSException {
        try {
            CompressedDataParser compressedDataParser = new CompressedDataParser((ASN1SequenceParser) this._contentInfo.getContent(16));
            ContentInfoParser encapContentInfo = compressedDataParser.getEncapContentInfo();
            return new CMSTypedStream(encapContentInfo.getContentType(), inputExpanderProvider.get(compressedDataParser.getCompressionAlgorithmIdentifier()).getInputStream(((ASN1OctetStringParser) encapContentInfo.getContent(4)).getOctetStream()));
        } catch (IOException e10) {
            throw new CMSException(StubApp.getString2(28148), e10);
        }
    }

    public CMSCompressedDataParser(byte[] bArr) throws CMSException {
        this(new ByteArrayInputStream(bArr));
    }
}
