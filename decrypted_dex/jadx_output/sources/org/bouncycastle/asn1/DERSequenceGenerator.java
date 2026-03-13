package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERSequenceGenerator extends DERGenerator {
    private final ByteArrayOutputStream _bOut;

    public DERSequenceGenerator(OutputStream outputStream) throws IOException {
        super(outputStream);
        this._bOut = new ByteArrayOutputStream();
    }

    public void addObject(ASN1Encodable aSN1Encodable) throws IOException {
        aSN1Encodable.toASN1Primitive().encodeTo(this._bOut, StubApp.getString2(26791));
    }

    public void close() throws IOException {
        writeDEREncoded(48, this._bOut.toByteArray());
    }

    @Override // org.bouncycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return this._bOut;
    }

    public DERSequenceGenerator(OutputStream outputStream, int i3, boolean z2) throws IOException {
        super(outputStream, i3, z2);
        this._bOut = new ByteArrayOutputStream();
    }

    public void addObject(ASN1Primitive aSN1Primitive) throws IOException {
        aSN1Primitive.encodeTo(this._bOut, StubApp.getString2(26791));
    }
}
