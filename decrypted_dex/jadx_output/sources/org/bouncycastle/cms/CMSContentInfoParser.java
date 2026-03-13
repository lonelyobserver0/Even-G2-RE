package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1StreamParser;
import org.bouncycastle.asn1.cms.ContentInfoParser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSContentInfoParser {
    protected ContentInfoParser _contentInfo;
    protected InputStream _data;

    public CMSContentInfoParser(InputStream inputStream) throws CMSException {
        this._data = inputStream;
        try {
            ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser) new ASN1StreamParser(inputStream).readObject();
            if (aSN1SequenceParser == null) {
                throw new CMSException(StubApp.getString2("28149"));
            }
            this._contentInfo = new ContentInfoParser(aSN1SequenceParser);
        } catch (IOException e10) {
            throw new CMSException(StubApp.getString2(28151), e10);
        } catch (ClassCastException e11) {
            throw new CMSException(StubApp.getString2(28150), e11);
        }
    }

    public void close() throws IOException {
        this._data.close();
    }
}
