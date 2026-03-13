package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DERTaggedObject extends ASN1TaggedObject {
    public DERTaggedObject(int i3, int i10, int i11, ASN1Encodable aSN1Encodable) {
        super(i3, i10, i11, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        ASN1Primitive dERObject = this.obj.toASN1Primitive().toDERObject();
        boolean isExplicit = isExplicit();
        if (z2) {
            int i3 = this.tagClass;
            if (isExplicit || dERObject.encodeConstructed()) {
                i3 |= 32;
            }
            aSN1OutputStream.writeIdentifier(true, i3, this.tagNo);
        }
        if (isExplicit) {
            aSN1OutputStream.writeDL(dERObject.encodedLength(true));
        }
        dERObject.encode(aSN1OutputStream.getDERSubStream(), isExplicit);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return isExplicit() || this.obj.toASN1Primitive().toDERObject().encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) throws IOException {
        ASN1Primitive dERObject = this.obj.toASN1Primitive().toDERObject();
        boolean isExplicit = isExplicit();
        int encodedLength = dERObject.encodedLength(isExplicit);
        if (isExplicit) {
            encodedLength += ASN1OutputStream.getLengthOfDL(encodedLength);
        }
        return encodedLength + (z2 ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public String getASN1Encoding() {
        return StubApp.getString2(26791);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return new DERSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1TaggedObject replaceTag(int i3, int i10) {
        return new DERTaggedObject(this.explicitness, i3, i10, this.obj);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DERTaggedObject(int i3, int i10, ASN1Encodable aSN1Encodable) {
        super(true, i3, i10, aSN1Encodable);
    }

    public DERTaggedObject(int i3, ASN1Encodable aSN1Encodable) {
        super(true, i3, aSN1Encodable);
    }

    public DERTaggedObject(boolean z2, int i3, int i10, ASN1Encodable aSN1Encodable) {
        super(z2, i3, i10, aSN1Encodable);
    }

    public DERTaggedObject(boolean z2, int i3, ASN1Encodable aSN1Encodable) {
        super(z2, i3, aSN1Encodable);
    }
}
