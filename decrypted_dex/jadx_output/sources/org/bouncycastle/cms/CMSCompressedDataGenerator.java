package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.CompressedData;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.operator.OutputCompressor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSCompressedDataGenerator {
    public static final String ZLIB = StubApp.getString2(28147);

    public CMSCompressedData generate(CMSTypedData cMSTypedData, OutputCompressor outputCompressor) throws CMSException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream outputStream = outputCompressor.getOutputStream(byteArrayOutputStream);
            cMSTypedData.write(outputStream);
            outputStream.close();
            return new CMSCompressedData(new ContentInfo(CMSObjectIdentifiers.compressedData, new CompressedData(outputCompressor.getAlgorithmIdentifier(), new ContentInfo(cMSTypedData.getContentType(), new BEROctetString(byteArrayOutputStream.toByteArray())))));
        } catch (IOException e10) {
            throw new CMSException(StubApp.getString2(28146), e10);
        }
    }
}
