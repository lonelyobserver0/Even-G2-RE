package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BERSequenceGenerator extends BERGenerator {
    public BERSequenceGenerator(OutputStream outputStream) throws IOException {
        super(outputStream);
        writeBERHeader(48);
    }

    public void addObject(ASN1Encodable aSN1Encodable) throws IOException {
        aSN1Encodable.toASN1Primitive().encodeTo(this._out);
    }

    public void close() throws IOException {
        writeBEREnd();
    }

    public BERSequenceGenerator(OutputStream outputStream, int i3, boolean z2) throws IOException {
        super(outputStream, i3, z2);
        writeBERHeader(48);
    }

    public void addObject(ASN1Primitive aSN1Primitive) throws IOException {
        aSN1Primitive.encodeTo(this._out);
    }
}
