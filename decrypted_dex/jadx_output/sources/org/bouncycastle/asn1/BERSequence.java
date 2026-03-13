package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BERSequence extends ASN1Sequence {
    public BERSequence() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingIL(z2, 48, this.elements);
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

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1BitString toASN1BitString() {
        return new BERBitString(getConstructedBitStrings());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1External toASN1External() {
        return ((ASN1Sequence) toDLObject()).toASN1External();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1OctetString toASN1OctetString() {
        return new BEROctetString(getConstructedOctetStrings());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1Set toASN1Set() {
        return new BERSet(false, toArrayInternal());
    }

    public BERSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
    }

    public BERSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
    }
}
