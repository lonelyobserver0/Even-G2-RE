package org.bouncycastle.cert.cmp;

import Xa.h;
import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.asn1.cmp.PKIHeader;
import org.bouncycastle.asn1.cmp.PKIMessage;
import org.bouncycastle.cert.CertIOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GeneralPKIMessage {
    private final PKIMessage pkiMessage;

    public GeneralPKIMessage(PKIMessage pKIMessage) {
        this.pkiMessage = pKIMessage;
    }

    private static PKIMessage parseBytes(byte[] bArr) throws IOException {
        String string2 = StubApp.getString2(28012);
        try {
            return PKIMessage.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (ClassCastException e10) {
            throw new CertIOException(string2 + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new CertIOException(h.l(e11, new StringBuilder(string2)), e11);
        }
    }

    public PKIBody getBody() {
        return this.pkiMessage.getBody();
    }

    public PKIHeader getHeader() {
        return this.pkiMessage.getHeader();
    }

    public boolean hasProtection() {
        return this.pkiMessage.getHeader().getProtectionAlg() != null;
    }

    public PKIMessage toASN1Structure() {
        return this.pkiMessage;
    }

    public GeneralPKIMessage(byte[] bArr) throws IOException {
        this(parseBytes(bArr));
    }
}
