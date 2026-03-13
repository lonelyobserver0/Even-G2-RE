package org.bouncycastle.mime.smime;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.mime.CanonicalOutputStream;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeContext;
import org.bouncycastle.mime.MimeMultipartContext;
import org.bouncycastle.mime.MimeParserContext;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.io.TeeInputStream;
import org.bouncycastle.util.io.TeeOutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SMimeMultipartContext implements MimeMultipartContext {
    private DigestCalculator[] calculators;
    private final SMimeParserContext parserContext;

    public SMimeMultipartContext(MimeParserContext mimeParserContext, Headers headers) {
        this.parserContext = (SMimeParserContext) mimeParserContext;
        this.calculators = createDigestCalculators(headers);
    }

    private DigestCalculator[] createDigestCalculators(Headers headers) {
        try {
            String str = headers.getContentTypeAttributes().get(StubApp.getString2("33061"));
            if (str == null) {
                throw new IllegalStateException(StubApp.getString2("33062"));
            }
            String[] split = str.substring(str.indexOf(61) + 1).split(StubApp.getString2("321"));
            DigestCalculator[] digestCalculatorArr = new DigestCalculator[split.length];
            for (int i3 = 0; i3 < split.length; i3++) {
                digestCalculatorArr[i3] = this.parserContext.getDigestCalculatorProvider().get(new AlgorithmIdentifier(SMimeUtils.getDigestOID(SMimeUtils.lessQuotes(split[i3]).trim())));
            }
            return digestCalculatorArr;
        } catch (OperatorCreationException unused) {
            return null;
        }
    }

    @Override // org.bouncycastle.mime.MimeContext
    public InputStream applyContext(Headers headers, InputStream inputStream) throws IOException {
        return inputStream;
    }

    @Override // org.bouncycastle.mime.MimeMultipartContext
    public MimeContext createContext(final int i3) throws IOException {
        return new MimeContext() { // from class: org.bouncycastle.mime.smime.SMimeMultipartContext.1
            @Override // org.bouncycastle.mime.MimeContext
            public InputStream applyContext(Headers headers, InputStream inputStream) throws IOException {
                if (i3 != 0) {
                    return inputStream;
                }
                OutputStream digestOutputStream = SMimeMultipartContext.this.getDigestOutputStream();
                headers.dumpHeaders(digestOutputStream);
                digestOutputStream.write(13);
                digestOutputStream.write(10);
                return new TeeInputStream(inputStream, new CanonicalOutputStream(SMimeMultipartContext.this.parserContext, headers, digestOutputStream));
            }
        };
    }

    public DigestCalculator[] getDigestCalculators() {
        return this.calculators;
    }

    public OutputStream getDigestOutputStream() {
        DigestCalculator[] digestCalculatorArr = this.calculators;
        int i3 = 1;
        if (digestCalculatorArr.length == 1) {
            return digestCalculatorArr[0].getOutputStream();
        }
        OutputStream outputStream = digestCalculatorArr[0].getOutputStream();
        while (i3 < this.calculators.length) {
            TeeOutputStream teeOutputStream = new TeeOutputStream(this.calculators[i3].getOutputStream(), outputStream);
            i3++;
            outputStream = teeOutputStream;
        }
        return outputStream;
    }
}
