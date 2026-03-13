package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BERSet extends ASN1Set {
    public BERSet() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingIL(z2, 49, this.elements);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) throws IOException {
        int i3 = z2 ? 4 : 3;
        int length = this.elements.length;
        for (int i10 = 0; i10 < length; i10++) {
            i3 += this.elements[i10].toASN1Primitive().encodedLength(true);
        }
        return i3;
    }

    public BERSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
    }

    public BERSet(boolean z2, ASN1Encodable[] aSN1EncodableArr) {
        super(z2, aSN1EncodableArr);
    }

    public BERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
    }
}
