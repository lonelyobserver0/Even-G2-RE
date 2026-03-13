package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DLOutputStream extends ASN1OutputStream {
    public DLOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public DLOutputStream getDLSubStream() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public void writeElements(ASN1Encodable[] aSN1EncodableArr) throws IOException {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().toDLObject().encode(this, true);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public void writePrimitive(ASN1Primitive aSN1Primitive, boolean z2) throws IOException {
        aSN1Primitive.toDLObject().encode(this, z2);
    }

    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public void writePrimitives(ASN1Primitive[] aSN1PrimitiveArr) throws IOException {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.toDLObject().encode(this, true);
        }
    }
}
