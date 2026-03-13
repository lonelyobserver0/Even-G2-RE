package org.bouncycastle.mime.smime;

import org.bouncycastle.mime.MimeParserContext;
import org.bouncycastle.operator.DigestCalculatorProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SMimeParserContext implements MimeParserContext {
    private final String defaultContentTransferEncoding;
    private final DigestCalculatorProvider digestCalculatorProvider;

    public SMimeParserContext(String str, DigestCalculatorProvider digestCalculatorProvider) {
        this.defaultContentTransferEncoding = str;
        this.digestCalculatorProvider = digestCalculatorProvider;
    }

    @Override // org.bouncycastle.mime.MimeParserContext
    public String getDefaultContentTransferEncoding() {
        return this.defaultContentTransferEncoding;
    }

    public DigestCalculatorProvider getDigestCalculatorProvider() {
        return this.digestCalculatorProvider;
    }
}
