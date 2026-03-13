package org.bouncycastle.cert.dane;

import java.io.OutputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TruncatingDigestCalculator implements DigestCalculator {
    private final DigestCalculator baseCalculator;
    private final int length;

    public TruncatingDigestCalculator(DigestCalculator digestCalculator) {
        this(digestCalculator, 28);
    }

    @Override // org.bouncycastle.operator.DigestCalculator
    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.baseCalculator.getAlgorithmIdentifier();
    }

    @Override // org.bouncycastle.operator.DigestCalculator
    public byte[] getDigest() {
        int i3 = this.length;
        byte[] bArr = new byte[i3];
        System.arraycopy(this.baseCalculator.getDigest(), 0, bArr, 0, i3);
        return bArr;
    }

    @Override // org.bouncycastle.operator.DigestCalculator
    public OutputStream getOutputStream() {
        return this.baseCalculator.getOutputStream();
    }

    public TruncatingDigestCalculator(DigestCalculator digestCalculator, int i3) {
        this.baseCalculator = digestCalculator;
        this.length = i3;
    }
}
