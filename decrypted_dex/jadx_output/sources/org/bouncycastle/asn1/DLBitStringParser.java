package org.bouncycastle.asn1;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DLBitStringParser implements ASN1BitStringParser {
    private int padBits = 0;
    private final DefiniteLengthInputStream stream;

    public DLBitStringParser(DefiniteLengthInputStream definiteLengthInputStream) {
        this.stream = definiteLengthInputStream;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getBitStream() throws IOException {
        return getBitStream(false);
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return ASN1BitString.createPrimitive(this.stream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getOctetStream() throws IOException {
        return getBitStream(true);
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.padBits;
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e10) {
            throw new ASN1ParsingException(u.q(e10, new StringBuilder(StubApp.getString2(26839))), e10);
        }
    }

    private InputStream getBitStream(boolean z2) throws IOException {
        int remaining = this.stream.getRemaining();
        if (remaining < 1) {
            throw new IllegalStateException(StubApp.getString2(26846));
        }
        int read = this.stream.read();
        this.padBits = read;
        if (read > 0) {
            if (remaining < 2) {
                throw new IllegalStateException(StubApp.getString2(26710));
            }
            if (read > 7) {
                throw new IllegalStateException(StubApp.getString2(26709));
            }
            if (z2) {
                throw new IOException(StubApp.getString2(26717) + this.padBits);
            }
        }
        return this.stream;
    }
}
