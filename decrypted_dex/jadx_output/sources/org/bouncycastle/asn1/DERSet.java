package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERSet extends ASN1Set {
    private int contentsLength;

    public DERSet() {
        this.contentsLength = -1;
    }

    private static boolean checkSorted(boolean z2) {
        if (z2) {
            return z2;
        }
        throw new IllegalStateException(StubApp.getString2(26845));
    }

    public static DERSet convert(ASN1Set aSN1Set) {
        return (DERSet) aSN1Set.toDERObject();
    }

    private int getContentsLength() throws IOException {
        if (this.contentsLength < 0) {
            int length = this.elements.length;
            int i3 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                i3 += this.elements[i10].toASN1Primitive().toDERObject().encodedLength(true);
            }
            this.contentsLength = i3;
        }
        return this.contentsLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeIdentifier(z2, 49);
        DEROutputStream dERSubStream = aSN1OutputStream.getDERSubStream();
        int length = this.elements.length;
        int i3 = 0;
        if (this.contentsLength >= 0 || length > 16) {
            aSN1OutputStream.writeDL(getContentsLength());
            while (i3 < length) {
                this.elements[i3].toASN1Primitive().toDERObject().encode(dERSubStream, true);
                i3++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            ASN1Primitive dERObject = this.elements[i11].toASN1Primitive().toDERObject();
            aSN1PrimitiveArr[i11] = dERObject;
            i10 += dERObject.encodedLength(true);
        }
        this.contentsLength = i10;
        aSN1OutputStream.writeDL(i10);
        while (i3 < length) {
            aSN1PrimitiveArr[i3].encode(dERSubStream, true);
            i3++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) throws IOException {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, getContentsLength());
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this.isSorted ? this : super.toDERObject();
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DERSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.contentsLength = -1;
    }

    public DERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, true);
        this.contentsLength = -1;
    }

    public DERSet(boolean z2, ASN1Encodable[] aSN1EncodableArr) {
        super(checkSorted(z2), aSN1EncodableArr);
        this.contentsLength = -1;
    }

    public DERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, true);
        this.contentsLength = -1;
    }
}
