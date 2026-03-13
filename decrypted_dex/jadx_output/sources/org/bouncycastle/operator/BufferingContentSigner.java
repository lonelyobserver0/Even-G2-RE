package org.bouncycastle.operator;

import java.io.OutputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.io.BufferingOutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BufferingContentSigner implements ContentSigner {
    private final ContentSigner contentSigner;
    private final OutputStream output;

    public BufferingContentSigner(ContentSigner contentSigner) {
        this.contentSigner = contentSigner;
        this.output = new BufferingOutputStream(contentSigner.getOutputStream());
    }

    @Override // org.bouncycastle.operator.ContentSigner
    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.contentSigner.getAlgorithmIdentifier();
    }

    @Override // org.bouncycastle.operator.ContentSigner
    public OutputStream getOutputStream() {
        return this.output;
    }

    @Override // org.bouncycastle.operator.ContentSigner
    public byte[] getSignature() {
        return this.contentSigner.getSignature();
    }

    public BufferingContentSigner(ContentSigner contentSigner, int i3) {
        this.contentSigner = contentSigner;
        this.output = new BufferingOutputStream(contentSigner.getOutputStream(), i3);
    }
}
