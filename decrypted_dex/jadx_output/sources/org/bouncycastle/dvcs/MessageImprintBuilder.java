package org.bouncycastle.dvcs;

import com.stub.StubApp;
import i2.u;
import java.io.OutputStream;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MessageImprintBuilder {
    private final DigestCalculator digestCalculator;

    public MessageImprintBuilder(DigestCalculator digestCalculator) {
        this.digestCalculator = digestCalculator;
    }

    public MessageImprint build(byte[] bArr) throws DVCSException {
        try {
            OutputStream outputStream = this.digestCalculator.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return new MessageImprint(new DigestInfo(this.digestCalculator.getAlgorithmIdentifier(), this.digestCalculator.getDigest()));
        } catch (Exception e10) {
            throw new DVCSException(u.r(e10, new StringBuilder(StubApp.getString2(29413))), e10);
        }
    }
}
