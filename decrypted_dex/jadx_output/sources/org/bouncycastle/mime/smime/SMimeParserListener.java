package org.bouncycastle.mime.smime;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.bouncycastle.cms.CMSEnvelopedDataParser;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.OriginatorInformation;
import org.bouncycastle.cms.RecipientInformationStore;
import org.bouncycastle.cms.SignerInformationStore;
import org.bouncycastle.mime.ConstantMimeContext;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeContext;
import org.bouncycastle.mime.MimeIOException;
import org.bouncycastle.mime.MimeParserContext;
import org.bouncycastle.mime.MimeParserListener;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class SMimeParserListener implements MimeParserListener {
    private DigestCalculator[] digestCalculators;
    private SMimeMultipartContext parent;

    public void content(MimeParserContext mimeParserContext, Headers headers, InputStream inputStream) throws IOException {
        throw new IllegalStateException(StubApp.getString2(33063));
    }

    @Override // org.bouncycastle.mime.MimeParserListener
    public MimeContext createContext(MimeParserContext mimeParserContext, Headers headers) {
        if (!headers.isMultipart()) {
            return new ConstantMimeContext();
        }
        SMimeMultipartContext sMimeMultipartContext = new SMimeMultipartContext(mimeParserContext, headers);
        this.parent = sMimeMultipartContext;
        this.digestCalculators = sMimeMultipartContext.getDigestCalculators();
        return this.parent;
    }

    public void envelopedData(MimeParserContext mimeParserContext, Headers headers, OriginatorInformation originatorInformation, RecipientInformationStore recipientInformationStore) throws IOException, CMSException {
        throw new IllegalStateException(StubApp.getString2(33064));
    }

    @Override // org.bouncycastle.mime.MimeParserListener
    public void object(MimeParserContext mimeParserContext, Headers headers, InputStream inputStream) throws IOException {
        try {
            if (!headers.getContentType().equals(StubApp.getString2("33065")) && !headers.getContentType().equals(StubApp.getString2("33066"))) {
                if (!headers.getContentType().equals(StubApp.getString2("29464")) && !headers.getContentType().equals(StubApp.getString2("33067"))) {
                    content(mimeParserContext, headers, inputStream);
                    return;
                }
                CMSEnvelopedDataParser cMSEnvelopedDataParser = new CMSEnvelopedDataParser(inputStream);
                envelopedData(mimeParserContext, headers, cMSEnvelopedDataParser.getOriginatorInfo(), cMSEnvelopedDataParser.getRecipientInfos());
                cMSEnvelopedDataParser.close();
                return;
            }
            HashMap hashMap = new HashMap();
            int i3 = 0;
            while (true) {
                DigestCalculator[] digestCalculatorArr = this.digestCalculators;
                if (i3 == digestCalculatorArr.length) {
                    CMSSignedData cMSSignedData = new CMSSignedData(hashMap, Streams.readAll(inputStream));
                    signedData(mimeParserContext, headers, cMSSignedData.getCertificates(), cMSSignedData.getCRLs(), cMSSignedData.getAttributeCertificates(), cMSSignedData.getSignerInfos());
                    return;
                } else {
                    digestCalculatorArr[i3].getOutputStream().close();
                    hashMap.put(this.digestCalculators[i3].getAlgorithmIdentifier().getAlgorithm(), this.digestCalculators[i3].getDigest());
                    i3++;
                }
            }
        } catch (CMSException e10) {
            throw new MimeIOException(StubApp.getString2(33068) + e10.getMessage(), e10);
        }
    }

    public void signedData(MimeParserContext mimeParserContext, Headers headers, Store store, Store store2, Store store3, SignerInformationStore signerInformationStore) throws IOException, CMSException {
        throw new IllegalStateException(StubApp.getString2(33069));
    }
}
